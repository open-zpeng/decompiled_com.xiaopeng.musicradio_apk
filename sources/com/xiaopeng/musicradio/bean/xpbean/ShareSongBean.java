package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ShareSongBean implements Serializable {
    private long albumId;
    private String content;
    private String hash;
    private int source;
    private String vehicleType;

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public int getSource() {
        return this.source;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String str) {
        this.vehicleType = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
