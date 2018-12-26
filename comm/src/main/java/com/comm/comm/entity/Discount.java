package com.comm.comm.entity;

import java.util.Date;

public class Discount {
    private int discount_id;
    private double discount_money;
    private int showt_id;
    private String discount_begin;
    private String discount_end;
    private int discount_status_id;
    private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public double getDiscount_money() {
        return discount_money;
    }

    public void setDiscount_money(double discount_money) {
        this.discount_money = discount_money;
    }

    public int getShowt_id() {
        return showt_id;
    }

    public void setShowt_id(int showt_id) {
        this.showt_id = showt_id;
    }

    public String getDiscount_begin() {
        return discount_begin;
    }

    public void setDiscount_begin(String discount_begin) {
        this.discount_begin = discount_begin;
    }

    public String getDiscount_end() {
        return discount_end;
    }

    public void setDiscount_end(String discount_end) {
        this.discount_end = discount_end;
    }

    public int getDiscount_status_id() {
        return discount_status_id;
    }

    public void setDiscount_status_id(int discount_status_id) {
        this.discount_status_id = discount_status_id;
    }
}
