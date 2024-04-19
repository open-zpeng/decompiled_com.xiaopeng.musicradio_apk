package com.xiaopeng.musicradio.bean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class VipSaleInfoV2 implements Serializable {
    private static final long serialVersionUID = 1;
    private BannerImgMapBean bannerImgMap;
    private String title;
    private String url;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public BannerImgMapBean getBannerImgMap() {
        return this.bannerImgMap;
    }

    public void setBannerImgMap(BannerImgMapBean bannerImgMapBean) {
        this.bannerImgMap = bannerImgMapBean;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    /* loaded from: classes.dex */
    public static class BannerImgMapBean {
        private String fullImg;
        private String smallImg;

        public String getFullImg() {
            return this.fullImg;
        }

        public void setFullImg(String str) {
            this.fullImg = str;
        }

        public String getSmallImg() {
            return this.smallImg;
        }

        public void setSmallImg(String str) {
            this.smallImg = str;
        }
    }
}
