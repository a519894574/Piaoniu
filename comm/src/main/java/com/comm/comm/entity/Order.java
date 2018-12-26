package com.comm.comm.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "order_user")
public class Order {

    private String order_address ;
    private int order_amount ;
    private String order_create_date;
    private String order_show_name ;
    private int order_quantity;
    private int order_status_id ;
    private int show_id ;
    private int user_id ;
    private String order_phone_number ;
    private int order_coupons;
    private int discount_status_id;

    public int getDiscount_status_id() {
        return discount_status_id;
    }

    public void setDiscount_status_id(int discount_status_id) {
        this.discount_status_id = discount_status_id;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_create_date() {
        return order_create_date;
    }

    public void setOrder_create_date(String order_create_date) {
        this.order_create_date = order_create_date;
    }

    public String getOrder_show_name() {
        return order_show_name;
    }

    public void setOrder_show_name(String order_show_name) {
        this.order_show_name = order_show_name;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public int getOrder_status_id() {
        return order_status_id;
    }

    public void setOrder_status_id(int order_status_id) {
        this.order_status_id = order_status_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOrder_phone_number() {
        return order_phone_number;
    }

    public void setOrder_phone_number(String order_phone_number) {
        this.order_phone_number = order_phone_number;
    }

    public int getOrder_coupons() {
        return order_coupons;
    }

    public void setOrder_coupons(int order_coupons) {
        this.order_coupons = order_coupons;
    }
}

