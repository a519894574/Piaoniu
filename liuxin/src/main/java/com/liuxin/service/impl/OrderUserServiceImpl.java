package com.liuxin.service.impl;

import com.comm.comm.model.Order;
import com.comm.comm.model.OrderInfo;
import com.comm.comm.model.OrderSeat;
import com.liuxin.dao.OrderUserDao;
import com.liuxin.service.OrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderUserServiceImpl implements OrderUserService {

    @Autowired
    private OrderUserDao orderUserDao;

    @Override
    public List<Order> getOrder(int user_id, int status_id) {
        return orderUserDao.getOrder(user_id , status_id);
    }

    @Override
    public List<OrderInfo> getInfo(int user_id , int status_id) {
        return orderUserDao.getInfo(user_id ,status_id);
    }

    @Override
    public List<OrderSeat> getSeat( int order_id) {
        return orderUserDao.getSeat(order_id);
    }
}
