package com.lkx.show.service.login;

import com.comm.comm.entity.User;
import com.comm.comm.tolls.Json;
import com.google.gson.Gson;
import com.lkx.show.dao.login.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private LoginDao loginDao;

    //生成验证码
    @Override
    public boolean getCode(String phone) {
        //生成字符串
        StringBuffer buffer=new StringBuffer();
        Random random=new Random();
        for (int i=0;i<4;i++){
            buffer.append(random.nextInt(10));
        }

        boolean falg=false;
        try {
            if(!SMSCodeService.sendCode(phone,buffer.toString())){
                falg=false;
            }else {
                //将验证码，手机号，系统时间存在redis
                redisTemplate.opsForValue().set("code",buffer.toString(),600000,TimeUnit.MILLISECONDS);
                redisTemplate.opsForValue().set("number",phone);
                falg=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return falg;
    }

    //校对
    @Override
    public Json proof(String phone, String code) {
        String code_save=redisTemplate.opsForValue().get("code");
        String phone_save=redisTemplate.opsForValue().get("phone");
        Json json=new Json();
        if (phone_save==null){
            json.setStatus(1);
            json.setMessage("验证码已过期");
            return json;
        }
        if (!phone_save.trim().equalsIgnoreCase(phone)){
            json.setStatus(2);
            json.setMessage("手机号不一致");
            return json;
        }
        if (code_save.trim().equalsIgnoreCase(code)){

            json.setStatus(0);
            json.setMessage("登录成功");
            return json;
        }else {
            json.setStatus(3);
            json.setMessage("验证码错误");
            return json;
        }
    }

    //注册或者登录
    @Override
    public void proofUser(String phone) {
        int a = loginDao.findUser(phone);
        User user;
        if (a>0){
            //登录
            user=loginDao.findPass(phone);
        }else {
            //注册
            loginDao.userAdd(phone);
            user=loginDao.findPass(phone);
        }
        //存入redis
        Gson gson=new Gson();
        redisTemplate.opsForValue().set("user",gson.toJson(user));

//        String departJson = redisTemplate.opsForValue().get(key);
//        //将json转为实体对象
//        Gson gson=new Gson();
//        Department department=gson.fromJson(departJson,Department.class);

    }


}
