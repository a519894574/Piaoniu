package com.liuxin.dao;

import com.comm.comm.entity.Order;
import com.comm.comm.entity.OrderStatus;
import com.comm.comm.model.OrderUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderDao{

//  =============================查询============================

    //根据订单user_id查询所有订单
    List<OrderUser> findByUserId( @Param("user_id") Integer user_id);

    //根据状态和user_id查询订单
    List<Order> findByOrderStatus(@Param("order_status") Integer order_status , @Param("user_id") Integer user_id);

    //遍历状态表
    List<OrderStatus> findOrderStatus();



//    =============================添加============================

    //未使用优惠券添加订单
    int insertOrder(Order order);


//    =============================更改=======================

    //更改订单状态
    int updateOrderStatusid( @Param("status") Integer status ,@Param("user_id") Integer user_id , @Param("order_id") Integer order_id);
}
