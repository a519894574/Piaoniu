package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showText")
public class ShowText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showTe_id", columnDefinition = "integer(11) COMMENT '演出简介ID'")
    private int id;

    @Column(name = "show_id", columnDefinition = "integer(11) COMMENT '演出ID'")
    private int showTe_id;

    @Column(name = "showTe_text", columnDefinition = "text COMMENT '演出简介'")
    private String con;
}
