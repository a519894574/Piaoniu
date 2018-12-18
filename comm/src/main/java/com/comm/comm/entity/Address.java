package com.comm.comm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id", columnDefinition = "integer(11) COMMENT '地址ID'")
    private int address_id;
    @Column(name = "address_area", columnDefinition = "varchar(11) COMMENT '所在地区'")
    private String address_area;
    @Column(name = "address_street", columnDefinition = "varchar(11) COMMENT '所在街道'")
    private String address_street;
    @Column(name = "address_name", columnDefinition = "varchar(11) COMMENT '姓名'")
    private String address_name;
    @Column(name = "address_telephone", columnDefinition = "varchar(11) COMMENT '联系电话'")
    private String address_telephone;
}
