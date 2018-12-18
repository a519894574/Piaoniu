package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showType")
public class ShowType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showT_id", columnDefinition = "integer(11) COMMENT '演出类型ID'")
    private int id;

    @Column(name = "showT_name", columnDefinition = "varchar(11) COMMENT '演出类型名称'")
    private String showTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowTypeName() {
        return showTypeName;
    }

    public void setShowTypeName(String showTypeName) {
        this.showTypeName = showTypeName;
    }
}
