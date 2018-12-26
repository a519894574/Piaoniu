package com.lkx.show.service.login;

import com.comm.comm.tolls.Json;

public interface LoginService {
    //获取验证码
    boolean getCode(String phone);

    //校对
    Json proof(String phone, String code);

    //注册或者登录
    void proofUser(String phone);
}
