package com.mgs.comment.util;

public class Pagecount {
    private int page= 0;//当前页数
    private  int size =15; //页面容量
    private int show_id; // 演出id
     private int pageall ; // 从第几条开始。

    public int getPageall() {
        return pageall;
    }

    public void setPageall(int pageall) {
        this.pageall = (page-1)*size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }
}
