package com.comm.comm.model;

public class Discounts {
    private int discount_id;
    private double discount_money;
    private String showt_name;
    private String discount_begin;
    private String discount_end;

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

    public String getShowt_name() {
        return showt_name;
    }

    public void setShowt_name(String showt_name) {
        this.showt_name = showt_name;
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
}
