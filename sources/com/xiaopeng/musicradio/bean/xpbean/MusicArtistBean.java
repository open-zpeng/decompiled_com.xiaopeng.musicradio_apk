package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicArtistBean extends BaseBean implements Serializable {
    private static final long serialVersionUID = 1;
    private long id;
    private String logo;
    private String name;

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
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
        return "MusicArtistBean{id=" + this.id + ", name='" + this.name + "', logo='" + this.logo + "'}";
    }
}
