package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class VipSaleInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private String bannerImg;
    private String title;
    private String url;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getBannerImg() {
        return this.bannerImg;
    }

    public void setBannerImg(String str) {
        this.bannerImg = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
