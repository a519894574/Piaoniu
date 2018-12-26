package com.pgj.demo.controller;

import com.comm.comm.entity.User;
import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.pgj.demo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取用户信息",notes="获取用户信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "findbyid",method = RequestMethod.GET)
    public Json getUser(int user_id) {
        if(user_id!=0){
            return Status.getStatus(0,userService.findAllByUser_id(user_id).getUser_headphoto(),userService.findAllByUser_id(user_id).getUser_telephone(),userService.findAllByUser_id(user_id).getUser_signature());
        }else {
            return Status.getStatus(1);
        }

}
    @ApiOperation(value = "修改用户信息",notes="修改用户信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "updatebyid",method = RequestMethod.GET)
    public Json getUser1(@ModelAttribute User user) {
        if(userService.updateBytelephone(user)>0){
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }

    }
    @ApiOperation(value = "用户余额充值",notes="用户余额充值")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "updatebalancebyid",method = RequestMethod.GET)
    public Json getUser2(@ModelAttribute User user) {
        if(userService.updatebalanceByid(user)>0){
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }

    }
}
