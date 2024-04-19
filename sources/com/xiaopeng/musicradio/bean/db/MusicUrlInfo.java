package com.xiaopeng.musicradio.bean.db;
/* loaded from: classes.dex */
public class MusicUrlInfo {
    private String hash;
    private String song;
    private long updateTime;
    private String url;

    public MusicUrlInfo() {
        this.hash = "";
    }

    public MusicUrlInfo(String str, String str2, long j, String str3) {
        this.hash = "";
        this.hash = str;
        this.url = str2;
        this.updateTime = j;
        this.song = str3;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public String getSong() {
        return this.song;
    }

    public void setSong(String str) {
        this.song = str;
    }

    public String toString() {
        return "MusicUrlInfo{hash=" + this.hash + ", song='" + this.song + "', url='" + this.url + "'}";
    }
}
