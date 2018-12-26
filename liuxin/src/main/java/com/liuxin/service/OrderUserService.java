package com.liuxin.service;

import com.comm.comm.model.Order;
import com.comm.comm.model.OrderInfo;
import com.comm.comm.model.OrderSeat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderUserService {

    List<Order> getOrder(int user_id ,int status_id);

    List<OrderInfo> getInfo(int user_id , int status_id);

    List<OrderSeat> getSeat(int order_id);
}
