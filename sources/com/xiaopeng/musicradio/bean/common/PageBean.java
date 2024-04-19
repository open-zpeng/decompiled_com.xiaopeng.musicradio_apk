package com.xiaopeng.musicradio.bean.common;

import java.io.Serializable;
/* loaded from: classes.dex */
public class PageBean implements Serializable {
    private static final long serialVersionUID = 1;
    private int page;
    private int pageSize;
    private int total;
    private int totalPage;

    public int getPage() {
        return this.page;
    }

    public void setPage(int i) {
        this.page = i;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int i) {
        this.pageSize = i;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int i) {
        this.totalPage = i;
    }
}
