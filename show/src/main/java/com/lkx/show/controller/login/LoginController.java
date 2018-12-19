package com.lkx.show.controller.login;

import com.comm.comm.tolls.Json;

import com.lkx.show.service.login.LoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "手机登录",tags = {"登录功能接口"})
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    //获取验证码
    @RequestMapping(value = "/getCode",method = RequestMethod.GET)
    public boolean getCode(String phone){
        return loginService.getCode(phone);
    }

    //匹配验证码
    @RequestMapping(value = "/proof",method = RequestMethod.GET)
    public Json proof(String phone, String code){
        Json json=loginService.proof(phone,code);
        if (json.getStatus()==0){
            loginService.proofUser(phone);
        }
        return json;
    }
}
