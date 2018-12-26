package com.comm.comm.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id//设置为主键
    @Column(name = "user_id", columnDefinition = "integer(11) COMMENT '用户ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id主键为自增长
    private int user_id;
    @Column(name = "user_name" , columnDefinition = "varchar(20) COMMENT '用户名'")
    private String user_name;
    @Column(name = "user_telephone" , columnDefinition = "varchar(20) COMMENT '电话号码'")
    private String user_telephone;
    @Column(name = "user_balance" , columnDefinition = "double COMMENT '余额'")
    private double user_balance;
    @Column(name = "user_headphoto" , columnDefinition = "varchar(20) COMMENT '头像'")
    private String user_headphoto;
    @Column(name = "user_signature" , columnDefinition = "varchar(100) COMMENT '个性签名'")
    private String user_signature;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public double getUser_balance() {
        return user_balance;
    }

    public void setUser_balance(double user_balance) {
        this.user_balance = user_balance;
    }

    public String getUser_headphoto() {
        return user_headphoto;
    }

    public void setUser_headphoto(String user_headphoto) {
        this.user_headphoto = user_headphoto;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }
}
