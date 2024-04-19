package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class AudioLogoInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private String logo;
    private String name;

    public AudioLogoInfo(String str, String str2) {
        this.name = str;
        this.logo = str2;
    }

    public AudioLogoInfo() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String toString() {
        return "AudioLogoInfo{name='" + this.name + "', logo='" + this.logo + "'}";
    }
}
