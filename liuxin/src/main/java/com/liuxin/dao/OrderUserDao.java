package com.liuxin.dao;

import com.comm.comm.model.Order;
import com.comm.comm.model.OrderInfo;
import com.comm.comm.model.OrderSeat;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderUserDao {

//    根据用户id和状态id查询
    List<Order> getOrder(@Param("user_id") Integer user_id ,@Param("status_id") Integer status_id);

    List<OrderInfo> getInfo(@Param("user_id") Integer user_id ,@Param("status_id") Integer status_id);

//    查询订单座位
    List<OrderSeat> getSeat( @Param("order_id") Integer order_id);

}
