package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicLoveInfo extends BaseUserMusicInfo implements Serializable {
    private static final long serialVersionUID = 0;
    public String hash;
    public String logo;
    public String lrc;
    private int musicFrom;
    public String singer;
    public String song;
    private long ts;
    public String uid;

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getPlayState() {
        return -1;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int setPlayState(int i) {
        return -1;
    }

    public MusicLoveInfo() {
        this.hash = "";
        this.uid = "";
        this.musicFrom = 0;
        this.ts = 0L;
    }

    public MusicLoveInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, long j) {
        this.hash = "";
        this.uid = "";
        this.musicFrom = 0;
        this.ts = 0L;
        this.hash = str;
        this.song = str2;
        this.singer = str3;
        this.logo = str4;
        this.uid = str5;
        this.musicFrom = i;
        this.lrc = str6;
        this.ts = j;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getHash() {
        return this.hash;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setHash(String str) {
        this.hash = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getSong() {
        return this.song;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setSong(String str) {
        this.song = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getSinger() {
        return this.singer;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setSinger(String str) {
        this.singer = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getLogo() {
        return this.logo;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setLogo(String str) {
        this.logo = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public String getUid() {
        return this.uid;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setUid(String str) {
        this.uid = str;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public int getMusicFrom() {
        return this.musicFrom;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setMusicFrom(int i) {
        this.musicFrom = i;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public long getTs() {
        return this.ts;
    }

    @Override // com.xiaopeng.musicradio.bean.db.BaseUserMusicInfo
    public void setTs(long j) {
        this.ts = j;
    }

    public String getLrc() {
        return this.lrc;
    }

    public void setLrc(String str) {
        this.lrc = str;
    }
}
