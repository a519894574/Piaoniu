package com.pgj.demo.controller;

import com.comm.comm.entity.Address;
import com.comm.comm.entity.User;
import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.pgj.demo.dao.UserDao;
import com.pgj.demo.service.AddressService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @ApiOperation(value = "获取用户地址信息",notes="获取用户地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "findbyid",method = RequestMethod.GET)
    public Json getUser(int user_id) {
        if(user_id!=0){
            return Status.getStatus(0,addressService.findAllByUser_id(user_id));
        }else {
            return Status.getStatus(1);
        }
    }


    @ApiOperation(value = "删除地址信息",notes="删除地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "deleteaddress",method = RequestMethod.GET)
    public Json getUser1(int address_id) {
        int a=addressService.deleteAddressByAddress_id(address_id);
        if(a>0){
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }
    }



    @ApiOperation(value = "新增用户地址信息",notes="新增用户地址信息")
    @ApiResponses({@ApiResponse(code = 1,message = "操作成功"),@ApiResponse(code = 0,message = "操作失败"),@ApiResponse(code = 3,message = "权限不足")})
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user_id",value = "用户编号",required = true,dataType = "int",paramType = "query")
//    })
    @RequestMapping(value = "insertAddress",method = RequestMethod.GET)
    public Json getUser2(@ModelAttribute Address address) {
        if(addressService.insertAddress(address)>0){
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }
    }


}
