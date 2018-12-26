package com.comm.comm.entity;
/**
 *评论的实体类
 *
 */

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;   //评论ID
    @Column(columnDefinition = "varchar(100) COMMENT '评论内容'")
    private String content;  //评论内容
    @Column(name = "comtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date comtime;   //评论时间
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;  //外键对应用户

//    @ManyToOne
//    @JoinColumn(name="show_id")
//    private ShowBase showBase;  //外键对应演出

    private  int show_id;
    private  int user_id;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getComtime() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    public void setComtime(Date comtime) {
        this.comtime = comtime;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public ShowBase getShowBase() {
//        return showBase;
//    }
//
//    public void setShowBase(ShowBase showBase) {
//        this.showBase = showBase;
//    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
