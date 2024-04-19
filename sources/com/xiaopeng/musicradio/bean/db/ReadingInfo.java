package com.xiaopeng.musicradio.bean.db;
/* loaded from: classes.dex */
public class ReadingInfo {
    private long albumId;
    private String sort;
    private long updateTime;

    /* loaded from: classes.dex */
    public @interface SORT {
    }

    public ReadingInfo() {
        this.albumId = 0L;
        this.sort = "timeAsc";
    }

    public ReadingInfo(long j, String str) {
        this.albumId = 0L;
        this.sort = "timeAsc";
        this.albumId = j;
        this.sort = str;
        this.updateTime = System.currentTimeMillis();
    }

    public ReadingInfo(long j, String str, long j2) {
        this.albumId = 0L;
        this.sort = "timeAsc";
        this.albumId = j;
        this.sort = str;
        this.updateTime = j2;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public String getSort() {
        return this.sort;
    }

    public void setSort(@SORT String str) {
        this.sort = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}
