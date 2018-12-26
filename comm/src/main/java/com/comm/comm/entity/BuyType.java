package com.comm.comm.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BuyType {
    @Id
    @Column(name = "buy_id", columnDefinition = "int(11) COMMENT '购买类型ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    private int buy_id;

    @Column(name = "buy_name", columnDefinition = "varchar(11) COMMENT '购买类型'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    private int buy_name;

    public int getBuy_id() {
        return buy_id;
    }

    public void setBuy_id(int buy_id) {
        this.buy_id = buy_id;
    }

    public int getBuy_name() {
        return buy_name;
    }

    public void setBuy_name(int buy_name) {
        this.buy_name = buy_name;
    }
}
