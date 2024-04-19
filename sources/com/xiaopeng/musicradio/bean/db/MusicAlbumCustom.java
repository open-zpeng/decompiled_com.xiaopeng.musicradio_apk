package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicAlbumCustom implements Serializable {
    private static final long serialVersionUID = 4209870083774964841L;
    private Long cacheId;
    private long cacheTime;
    private long createTime;
    private long id;
    private String logo;
    private String name;
    private String uid;

    public MusicAlbumCustom() {
    }

    public MusicAlbumCustom(Long l, String str, long j, String str2, String str3, long j2, long j3) {
        this.cacheId = l;
        this.uid = str;
        this.id = j;
        this.logo = str2;
        this.name = str3;
        this.createTime = j2;
        this.cacheTime = j3;
    }

    public Long getCacheId() {
        return this.cacheId;
    }

    public void setCacheId(Long l) {
        this.cacheId = l;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public String toString() {
        return "MusicAlbumCustom{cacheId=" + this.cacheId + ", uid='" + this.uid + "', id=" + this.id + ", logo='" + this.logo + "', name='" + this.name + "', createTime=" + this.createTime + '}';
    }
}
