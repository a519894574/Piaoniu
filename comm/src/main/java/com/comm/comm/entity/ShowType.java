package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showType")
public class ShowType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showT_id", columnDefinition = "integer(11) COMMENT '演出类型ID'")
    private int showT_id;

    @Column(name = "showT_name", columnDefinition = "varchar(11) COMMENT '演出类型名称'")
    private String showT_name;

    public int getShowT_id() {
        return showT_id;
    }

    public void setShowT_id(int showT_id) {
        this.showT_id = showT_id;
    }

    public String getShowT_name() {
        return showT_name;
    }

    public void setShowT_name(String showT_name) {
        this.showT_name = showT_name;
    }


}
