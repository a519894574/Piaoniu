package com.liuxin.service;


import com.comm.comm.entity.Order;
import com.comm.comm.entity.OrderStatus;
import com.comm.comm.model.OrderUser;



import java.util.List;

public interface OrderService {

//    ====================查询===================

    //根据订单user_Id查询
    List<OrderUser> findByUserId(int user_id);

    //根据状态查询
    List<Order> findByOrderStatus(int order_status,int user_id);

    //遍历状态表
    List<OrderStatus> findOrderStatus();





//    ============================添加========================

    //未使用优惠券添加订单
    int insertOrder(Order order);

    //使用优惠券后添加的订单


//    =============================更改=======================

    int updateOrderStatusid(int status , int user_id , int order_id);   //更改订单状态
}
