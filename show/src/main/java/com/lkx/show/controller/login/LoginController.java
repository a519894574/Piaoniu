package com.lkx.show.controller.login;

import com.comm.comm.tolls.Json;

import com.lkx.show.service.login.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "获取验证码",nickname = "操作成功")

    public boolean getCode(String phone){
        return loginService.getCode(phone);
    }

    //匹配验证码
    @RequestMapping(value = "/proof",method = RequestMethod.GET)
    @ApiOperation(value = "用户登陆/注册",nickname = "操作成功")
    public Json proof(String phone, String code){
        Json json=loginService.proof(phone,code);
        if (json.getStatus()==0){
            loginService.proofUser(phone);
        }
        return json;
    }
}
