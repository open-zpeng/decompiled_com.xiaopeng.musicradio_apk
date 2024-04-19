package com.xiaopeng.musicradio.bean.ncm;
/* loaded from: classes.dex */
public class BaseIcmBean {
    private String enable;
    private String msgtype;

    public String getEnable() {
        return this.enable;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void reset() {
        this.enable = null;
        this.msgtype = null;
    }

    public String getMsgtype() {
        return this.msgtype;
    }

    public void setMsgtype(String str) {
        this.msgtype = str;
    }
}
