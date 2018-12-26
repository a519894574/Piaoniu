package com.comm.comm.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {
    @Id
    @Column(name = "address_id", columnDefinition = "integer(11) COMMENT '地址ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id主键为自增长
    private int address_id;
    @Column(name = "address_area", columnDefinition = "varchar(11) COMMENT '所在地区'")
    private String address_area;
    @Column(name = "address_street", columnDefinition = "varchar(11) COMMENT '所在街道'")
    private String address_street;
    @Column(name = "address_name", columnDefinition = "varchar(11) COMMENT '姓名'")
    private String address_name;
    @Column(name = "address_telephone", columnDefinition = "varchar(11) COMMENT '联系电话'")
    private String address_telephone;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_area() {
        return address_area;
    }

    public void setAddress_area(String address_area) {
        this.address_area = address_area;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getAddress_telephone() {
        return address_telephone;
    }

    public void setAddress_telephone(String address_telephone) {
        this.address_telephone = address_telephone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}