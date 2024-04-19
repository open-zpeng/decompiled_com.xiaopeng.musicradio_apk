package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class AudioParseInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private String albumTitle;
    private boolean audio;
    private String id;
    private String logo;
    private String path;
    private String singer;
    private String song;

    public AudioParseInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.id = str;
        this.path = str2;
        this.song = str3;
        this.singer = str4;
        this.albumTitle = str5;
        this.logo = str6;
        this.audio = z;
    }

    public AudioParseInfo() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getSong() {
        return this.song;
    }

    public void setSong(String str) {
        this.song = str;
    }

    public String getSinger() {
        return this.singer;
    }

    public void setSinger(String str) {
        this.singer = str;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public boolean isAudio() {
        return this.audio;
    }

    public void setAudio(boolean z) {
        this.audio = z;
    }

    public boolean getAudio() {
        return this.audio;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String toString() {
        return "AudioParseInfo{id='" + this.id + "', path='" + this.path + "', song='" + this.song + "', singer='" + this.singer + "', albumTitle='" + this.albumTitle + "', audio=" + this.audio + '}';
    }
}
