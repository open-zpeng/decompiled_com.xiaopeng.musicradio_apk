package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class UserBuyUrl implements Serializable {
    private String buyVipUrl;
    private String codeGuide;
    private String quetionGuide;
    private String text;
    private String vipName;

    public String getBuyVipUrl() {
        return this.buyVipUrl;
    }

    public void setBuyVipUrl(String str) {
        this.buyVipUrl = str;
    }

    public String getCodeGuide() {
        return this.codeGuide;
    }

    public void setCodeGuide(String str) {
        this.codeGuide = str;
    }

    public String getQuetionGuide() {
        return this.quetionGuide;
    }

    public void setQuetionGuide(String str) {
        this.quetionGuide = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getVipName() {
        return this.vipName;
    }

    public void setVipName(String str) {
        this.vipName = str;
    }
}
