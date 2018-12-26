package com.liuxin.controller;


import com.comm.comm.entity.Order;
import com.comm.comm.tolls.Json;
import com.comm.comm.tolls.Status;
import com.liuxin.service.OrderService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class OrderController{

    @Autowired
    private OrderService orderService;

//  ============================查询========================

    //根据订单user_id查询所有订单
    @RequestMapping(value = "/findByUserId",method = RequestMethod.GET)
    @ApiOperation(value = "根据user_id查询订单",notes = "根据user_id获取所有订单")
    public Json findByUserId(int user_id ){
        if (user_id != 0 ){
            return Status.getStatus(0,orderService.findByUserId(user_id ));
        }else {
            return Status.getStatus(1);
        }
    }

    //根据状态查询订单
    @RequestMapping(value = "/findByOrderStatus",method = RequestMethod.GET)
    @ApiOperation(value = "根据order_status和user_id查询订单",notes = "根据order_status和user_id获取所有订单")
    public Json findByStatus(int order_status , int user_id){
        if (order_status != 0 && user_id != 0){
            return Status.getStatus(0,orderService.findByOrderStatus(order_status , user_id));
        }else {
            return Status.getStatus(1);
        }
    }



    //遍历状态表
    @RequestMapping(value = "/findOrderStatus",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取所有订单状态",notes = "获取所有订单状态")
    public Json findOrderStatus(){
        return Status.getStatus(0,orderService.findOrderStatus());
    }


//    ============================添加========================

    //未使用优惠券添加订单
    @RequestMapping(value = "insert_order",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取所有订单状态",notes = "获取所有订单状态")
    public Json insert_order(@ModelAttribute Order order){
        int a= orderService.insertOrder(order);
        if (a>0) {
            return Status.getStatus(0);
        }else {
            return Status.getStatus(1);
        }
    }

//    =============================更改=======================

//    更改订单状态
    @RequestMapping(value = "updateOrderStatus" , method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据用户id和订单id更改订单状态",notes = "根据用户id和订单id更改订单状态")
    public Json updateOrderStatusod(int status , int user_id , int order_id) {
        int a=orderService.updateOrderStatusid(status , user_id ,order_id);
        if (a>0){
            return Status.getStatus(0);
        }else{
            return Status.getStatus(1);
        }
    }
}
