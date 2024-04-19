package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ShareProgramBean implements Serializable {
    private long albumId;
    private String content;
    private String vehicleType;

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
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
