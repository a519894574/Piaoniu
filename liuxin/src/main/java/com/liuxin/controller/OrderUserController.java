package com.liuxin.controller;

import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.liuxin.service.OrderUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class OrderUserController {

    @Autowired
    private OrderUserService orderUserService;

    @RequestMapping(value = "/getOder",method = RequestMethod.GET)
    @ApiOperation(value = "根据user_id查询订单",notes = "根据user_id获取所有订单")
    public Json getOder(int user_id , int status_id){
        return Status.getStatus(0 , orderUserService.getOrder(user_id,status_id));
    }

    @RequestMapping(value = "/getInfo",method = RequestMethod.GET)
    @ApiOperation(value = "根据user_id,status_id查询全部订单订单",notes = "根据user_id获取所有订单")
    public Json getInfo(int user_id , int status_id){
        return Status.getStatus(0 , orderUserService.getInfo(user_id , status_id));
    }

    @RequestMapping(value = "/getSeat",method = RequestMethod.GET)
    @ApiOperation(value = "订单座位",notes = "根据 show_id获取所有订单")
    public Json getSeat( int show_id){
        return Status.getStatus(0 , orderUserService.getSeat( show_id));
    }
}
