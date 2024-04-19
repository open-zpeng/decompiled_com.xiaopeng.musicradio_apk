package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class RecommendReadingRadioBean implements Serializable {
    private static final long serialVersionUID = 8;
    private int channelId;
    private String logoUrl;
    private String title;

    public int getChannelId() {
        return this.channelId;
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
