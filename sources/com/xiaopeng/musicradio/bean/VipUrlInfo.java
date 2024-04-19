package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class VipUrlInfo implements Serializable {
    private String text;
    private String url;
    private String urlNight;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getUrlNight() {
        return this.urlNight;
    }

    public void setUrlNight(String str) {
        this.urlNight = str;
    }
}
