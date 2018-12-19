package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showPrice")
public class ShowPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showP_id", columnDefinition = "integer(11) COMMENT '演出价位ID'")
    private int showP_id;

    @Column(name = "show_id", columnDefinition = "integer(11) COMMENT '演出ID'")
    private int show_id;

    @Column(name = "showP_price", columnDefinition = "double COMMENT '演出价格'")
    private double showP_price;

    public int getShowP_id() {
        return showP_id;
    }

    public void setShowP_id(int showP_id) {
        this.showP_id = showP_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public double getShowP_price() {
        return showP_price;
    }

    public void setShowP_price(double showP_price) {
        this.showP_price = showP_price;
    }
}
