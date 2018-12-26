package com.comm.comm.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id" , columnDefinition = "integer(11) COMMENT '状态id'")
    private int status_id;

    @Column(name = "order_status" , columnDefinition = "varchar(11) COMMENT '状态类型'")
    private String order_status;

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
