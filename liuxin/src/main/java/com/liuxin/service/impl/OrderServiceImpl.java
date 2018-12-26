package com.liuxin.service.impl;

import com.comm.comm.entity.Order;
import com.comm.comm.model.OrderUser;
import com.comm.comm.entity.OrderStatus;
import com.liuxin.dao.OrderDao;
import com.liuxin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
//    ====================查询===================
    @Autowired
    private OrderDao orderDao;

    //根据user_Id查询所有订单
    @Override
    public List<OrderUser> findByUserId( int user_id ){
        return orderDao.findByUserId(user_id );
    }

    //根据状态查询所有订单
    @Override
    public List<Order> findByOrderStatus(int order_status, int user_id) {
        return orderDao.findByOrderStatus(order_status,user_id);
    }


    //遍历状态表
    @Override
    public List<OrderStatus> findOrderStatus(){
        return orderDao.findOrderStatus();
    }



//  ============================添加========================

    //未使用优惠券添加订单
    @Override
    public int insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }




//   =============================更改=======================

    @Override
    public int updateOrderStatusid(int status , int user_id , int order_id) {
        return orderDao.updateOrderStatusid(status , user_id , order_id);
    }
}
