package com.comm.comm.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "showBase")
public class ShowBase {
    @Id
    @Column(name = "show_id", columnDefinition = "int(11) COMMENT '演出ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    private int show_id;

    @ManyToOne
    @Column(name = "show_type", columnDefinition = "integer(11) COMMENT '所属类型ID'")
    private ShowType show_type;

    @ManyToOne
    @Column(name = "show_city", columnDefinition = "integer(11) COMMENT '所属城市ID'")
    private int show_city;

    @Column(name = "show_name", columnDefinition = "varchar(20) COMMENT '演出名称'")
    private String showName;

    @ManyToOne
    @Column(name = "showADS_id", columnDefinition = "integer(11) COMMENT '演出会管ID'")
    private int showADS_id;

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getShowAds() {
        return showAds;
    }

    public void setShowAds(int showAds) {
        this.showAds = showAds;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getShowBuyId() {
        return showBuyId;
    }

    public void setShowBuyId(int showBuyId) {
        this.showBuyId = showBuyId;
    }

    public int getShowMbuy() {
        return showMbuy;
    }

    public void setShowMbuy(int showMbuy) {
        this.showMbuy = showMbuy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "show_date", columnDefinition = "datetime COMMENT '演出时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date show_date;

    @Column(name = "show_pic", columnDefinition = "varchar(255) COMMENT '演出图片'")
    private String show_pic;

    @Column(name = "show_buy", columnDefinition = "integer(11) COMMENT '购买类型'")
    private int show_buy;

    @Column(name = "show_Mbuy", columnDefinition = "integer(11) COMMENT '最大同时购买数'")
    private int show_Mbuy;

    @Column(name = "show_price", columnDefinition = "double COMMENT '均价'")
    private double show_price;

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public ShowType getShow_type() {
        return show_type;
    }

    public void setShow_type(ShowType show_type) {
        this.show_type = show_type;
    }

    public int getShow_city() {
        return show_city;
    }

    public void setShow_city(int show_city) {
        this.show_city = show_city;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public int getShowADS_id() {
        return showADS_id;
    }

    public void setShowADS_id(int showADS_id) {
        this.showADS_id = showADS_id;
    }

    public Date getShow_date() {
        return show_date;
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

    public int getShow_buy() {
        return show_buy;
    }

    public void setShow_buy(int show_buy) {
        this.show_buy = show_buy;
    }

    public int getShow_Mbuy() {
        return show_Mbuy;
    }

    public void setShow_Mbuy(int show_Mbuy) {
        this.show_Mbuy = show_Mbuy;
    }

    public double getShow_price() {
        return show_price;
    }

    public void setShow_price(double show_price) {
        this.show_price = show_price;
    }
}
