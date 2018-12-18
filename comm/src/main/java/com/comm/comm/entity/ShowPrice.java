package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showPrice")
public class ShowPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showP_id", columnDefinition = "integer(11) COMMENT '演出价位ID'")
    private int id;

    @Column(name = "show_id", columnDefinition = "integer(11) COMMENT '演出ID'")
    private int show_id;

    @Column(name = "showP_price", columnDefinition = "double COMMENT '演出价格'")
    private double showPrice;
}
