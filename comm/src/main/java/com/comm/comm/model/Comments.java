package com.comm.comm.model;
/**
 * 查询评论所用接受值的实体
 */

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comments implements Serializable {

    private int c_id;   //评论ID

    private String content;  //评论内容


    private Date comtime;   //评论时间

    private String user_name;  //用户名称

    private String user_headphoto; //用户名称

    private String show_Name;  //演出名称

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
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-hh");
        return s.format(comtime);
    }

    public void setComtime(Date comtime) {
        this.comtime = comtime;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_headphoto() {
        return user_headphoto;
    }

    public void setUser_headphoto(String user_headphoto) {
        this.user_headphoto = user_headphoto;
    }

    public String getShow_Name() {
        return show_Name;
    }

    public void setShowName(String showName) {
        this.show_Name = showName;
    }
}
