package com.xiaopeng.musicradio.bean.db;

import com.xiaopeng.musicradio.utils.z;
import java.io.Serializable;
/* loaded from: classes.dex */
public class TempSheetMusicInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private long albumId;
    private String fromTitle;
    private String hash;
    private int musicFrom;
    private String musicJson;
    private Long pkId;
    private String songId;
    private int type;

    public TempSheetMusicInfo() {
        this.hash = "";
        this.musicJson = "";
    }

    public TempSheetMusicInfo(Long l, String str, int i, String str2, long j, int i2, String str3, String str4) {
        this.hash = "";
        this.musicJson = "";
        this.pkId = l;
        this.hash = str;
        this.musicFrom = i;
        this.fromTitle = str2;
        this.albumId = j;
        this.type = i2;
        this.musicJson = str3;
        this.songId = str4;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public int getMusicFrom() {
        return this.musicFrom;
    }

    public void setMusicFrom(int i) {
        this.musicFrom = i;
    }

    public String getFromTitle() {
        return this.fromTitle;
    }

    public void setFromTitle(String str) {
        this.fromTitle = str;
    }

    public String getMusicJson() {
        return this.musicJson;
    }

    public void setMusicJson(String str) {
        this.musicJson = str;
    }

    public Long getPkId() {
        return this.pkId;
    }

    public void setPkId(long j) {
        this.pkId = Long.valueOf(j);
    }

    public void setPkId(Long l) {
        this.pkId = l;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public MusicInfo getMusicInfo() {
        return (MusicInfo) z.a(getMusicJson(), (Class<Object>) MusicInfo.class);
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String str) {
        this.songId = str;
    }
}
