package com.comm.comm.entity;

import javax.persistence.*;

@Entity
@Table(name = "showText")
public class ShowText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自动增长
    @Column(name = "showTe_id", columnDefinition = "integer(11) COMMENT '演出简介ID'")
    private int showTe_id;

    @Column(name = "show_id", columnDefinition = "integer(11) COMMENT '演出ID'")
    private int show_id;

    @Column(name = "showTe_text", columnDefinition = "text COMMENT '演出简介'")
    private String showTe_text;

    public int getShowTe_id() {
        return showTe_id;
    }

    public void setShowTe_id(int showTe_id) {
        this.showTe_id = showTe_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getShowTe_text() {
        return showTe_text;
    }

    public void setShowTe_text(String showTe_text) {
        this.showTe_text = showTe_text;
    }
}
