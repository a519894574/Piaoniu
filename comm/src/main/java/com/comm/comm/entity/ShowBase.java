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
    private int id;

    @Column(name = "show_type", columnDefinition = "integer(11) COMMENT '所属类型ID'")
    private int typeID;

    @Column(name = "show_city", columnDefinition = "integer(11) COMMENT '所属城市ID'")
    private int cityId;

    @Column(name = "show_name", columnDefinition = "varchar(20) COMMENT '演出名称'")
    private String showName;

    @Column(name = "showADS_id", columnDefinition = "integer(11) COMMENT '演出会管ID'")
    private int showAds;

    @Column(name = "show_date", columnDefinition = "datetime COMMENT '演出时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date showDate;

    @Column(name = "show_pic", columnDefinition = "varchar(255) COMMENT '演出图片'")
    private String picPath;

    @Column(name = "show_buy", columnDefinition = "integer(11) COMMENT '购买类型'")
    private int showBuyId;

    @Column(name = "show_Mbuy", columnDefinition = "integer(11) COMMENT '最大同时购买数'")
    private int showMbuy;

    @Column(name = "show_price", columnDefinition = "double COMMENT '均价'")
    private double price;

}
