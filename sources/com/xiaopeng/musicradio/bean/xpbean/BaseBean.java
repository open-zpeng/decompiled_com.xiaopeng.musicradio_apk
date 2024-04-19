package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class BaseBean implements Serializable {
    private static final long serialVersionUID = 1;
    private int code;
    private boolean fromCache;
    private String msg;

    public BaseBean() {
        this.msg = "";
    }

    public BaseBean(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public boolean isFromCache() {
        return this.fromCache;
    }

    public BaseBean setFromCache(boolean z) {
        this.fromCache = z;
        return this;
    }
}
