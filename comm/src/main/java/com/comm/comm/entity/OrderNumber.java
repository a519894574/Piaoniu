package com.comm.comm.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "order_num")
public class OrderNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "orderNumber_id" , columnDefinition = "integer(11) COMMENT ‘用户id’")
    private int orderNumber_id;  //订单ID


    @Column(name = "orderNumber_quantity")
    private int orderNumber_quantity;   //订单数量

    public int getOrderNumber_id() {
        return orderNumber_id;
    }

    public void setOrderNumber_id(int orderNumber_id) {
        this.orderNumber_id = orderNumber_id;
    }

    public int getOrderNumber_quantity() {
        return orderNumber_quantity;
    }

    public void setOrderNumber_quantity(int orderNumber_quantity) {
        this.orderNumber_quantity = orderNumber_quantity;
    }
}
