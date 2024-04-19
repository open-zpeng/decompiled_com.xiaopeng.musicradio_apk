package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class LocalLove implements Serializable {
    private static final long serialVersionUID = 0;
    private Long cacheId;
    private long cacheTime;
    private String hash;
    private String uid;

    public LocalLove() {
        this.hash = "";
        this.uid = "";
    }

    public LocalLove(Long l, String str, String str2, long j) {
        this.hash = "";
        this.uid = "";
        this.cacheId = l;
        this.hash = str;
        this.uid = str2;
        this.cacheTime = j;
    }

    public Long getCacheId() {
        return this.cacheId;
    }

    public void setCacheId(Long l) {
        this.cacheId = l;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }
}
