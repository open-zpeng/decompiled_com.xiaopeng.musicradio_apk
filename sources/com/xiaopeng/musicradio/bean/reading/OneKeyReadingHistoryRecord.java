package com.xiaopeng.musicradio.bean.reading;
/* loaded from: classes.dex */
public class OneKeyReadingHistoryRecord {
    private long albumId;
    private String order;
    private long seek;
    private String title;
    private long trackId;

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String str) {
        this.order = str;
    }

    public long getSeek() {
        return this.seek;
    }

    public void setSeek(long j) {
        this.seek = j;
    }
}
