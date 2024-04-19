package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicAlbumCollect implements Serializable {
    public static final int TYPE_APP_CUSTOM = 2;
    public static final int TYPE_APP_FAV = 3;
    public static final int TYPE_MY_FAV = 4;
    public static final int TYPE_PHONE_IMPORT = 1;
    public static final int TYPE_TYPE_ERROR = -1;
    private static final long serialVersionUID = -8980854496833913391L;
    private boolean append;
    private Long cacheId;
    private long cacheTime;
    private long createTime;
    private String description;
    private long id;
    private String logo;
    private String name;
    private int songCount;
    private int type;
    private String uid;

    public MusicAlbumCollect() {
    }

    public MusicAlbumCollect(Long l, String str, long j, String str2, String str3, int i, String str4, int i2, long j2, boolean z, long j3) {
        this.cacheId = l;
        this.uid = str;
        this.id = j;
        this.logo = str2;
        this.name = str3;
        this.songCount = i;
        this.description = str4;
        this.type = i2;
        this.createTime = j2;
        this.append = z;
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

    public int getSongCount() {
        return this.songCount;
    }

    public void setSongCount(int i) {
        this.songCount = i;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public boolean isAppend() {
        return this.append;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public boolean getAppend() {
        return this.append;
    }

    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public String toString() {
        return "MusicAlbumCollect{cacheId=" + this.cacheId + ", uid='" + this.uid + "', id=" + this.id + ", logo='" + this.logo + "', name='" + this.name + "', songCount=" + this.songCount + ", description='" + this.description + "', type=" + this.type + ", createTime=" + this.createTime + ", append=" + this.append + ", cacheTime=" + this.cacheTime + '}';
    }
}
