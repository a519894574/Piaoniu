package com.comm.comm.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

    private int order_id;
    private String order_address;
    private double order_amount;
    private String order_create_date;
    private int order_quantity;
    private String order_status;
    private String show_name;
    private String guildhall_address;
    private Date show_date;
    private String show_pic;
    private String discount_status;

    public String getDiscount_status() {
        return discount_status;
    }

    public void setDiscount_status(String discount_status) {
        this.discount_status = discount_status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(double order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_create_date() {
        return order_create_date;
    }

    public void setOrder_create_date(String order_create_date) {
        this.order_create_date = order_create_date;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getGuildhall_address() {
        return guildhall_address;
    }

    public void setGuildhall_address(String guildhall_address) {
        this.guildhall_address = guildhall_address;
    }

    public String getShow_date() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        return simpleDateFormat.format(show_date);
    }

    public void setShow_date(Date show_date) {
        this.show_date = show_date;
    }

    public String getShow_pic() {
        return show_pic;
    }

    public void setShow_pic(String show_pic) {
        this.show_pic = show_pic;
    }
}
