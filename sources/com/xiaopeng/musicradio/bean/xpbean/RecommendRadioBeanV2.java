package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class RecommendRadioBeanV2 implements Serializable {
    private static final long serialVersionUID = 1;
    private int fmType;
    private int id;
    private String logoUrl;
    private String title;

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public int getFmType() {
        return this.fmType;
    }

    public void setFmType(int i) {
        this.fmType = i;
    }
}
