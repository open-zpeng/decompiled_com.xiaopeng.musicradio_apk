package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ReadLoveInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private long albumId;
    private String albumName;
    private boolean append;
    private String artist;
    public long artistId;
    private boolean authorized;
    private String categoryName;
    private String intro;
    private String largeLogo;
    private String logo;
    private String mediumLogo;
    private int paymentType;
    private long playCount;
    private String shortIntro;
    private long ts;
    private String uid;
    private long updateTime;

    public ReadLoveInfo(long j, String str, long j2, String str2, String str3, long j3, String str4, long j4, String str5, String str6, String str7, String str8, long j5, String str9, int i, boolean z, boolean z2) {
        this.albumId = 0L;
        this.artistId = 0L;
        this.uid = "";
        this.ts = 0L;
        this.updateTime = 0L;
        this.albumId = j;
        this.albumName = str;
        this.artistId = j2;
        this.artist = str2;
        this.uid = str3;
        this.ts = j3;
        this.logo = str4;
        this.updateTime = j4;
        this.largeLogo = str5;
        this.mediumLogo = str6;
        this.shortIntro = str7;
        this.intro = str8;
        this.playCount = j5;
        this.categoryName = str9;
        this.paymentType = i;
        this.authorized = z;
        this.append = z2;
    }

    public ReadLoveInfo() {
        this.albumId = 0L;
        this.artistId = 0L;
        this.uid = "";
        this.ts = 0L;
        this.updateTime = 0L;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public String getShortIntro() {
        return this.shortIntro;
    }

    public void setShortIntro(String str) {
        this.shortIntro = str;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String str) {
        this.intro = str;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public void setAlbumName(String str) {
        this.albumName = str;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public String getLargeLogo() {
        return this.largeLogo;
    }

    public void setLargeLogo(String str) {
        this.largeLogo = str;
    }

    public String getMediumLogo() {
        return this.mediumLogo;
    }

    public void setMediumLogo(String str) {
        this.mediumLogo = str;
    }

    public long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(long j) {
        this.artistId = j;
    }

    public int getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(int i) {
        this.paymentType = i;
    }

    public boolean getAuthorized() {
        return this.authorized;
    }

    public void setAuthorized(boolean z) {
        this.authorized = z;
    }

    public boolean getAppend() {
        return this.append;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public String toString() {
        return "ReadLoveInfo{albumId=" + this.albumId + ", albumName='" + this.albumName + "', artistId=" + this.artistId + ", artist='" + this.artist + "', uid='" + this.uid + "', ts=" + this.ts + ", logo='" + this.logo + "', updateTime=" + this.updateTime + ", largeLogo='" + this.largeLogo + "', mediumLogo='" + this.mediumLogo + "', shortIntro='" + this.shortIntro + "', intro='" + this.intro + "', playCount=" + this.playCount + ", categoryName='" + this.categoryName + "', paymentType=" + this.paymentType + ", authorized=" + this.authorized + ", append=" + this.append + '}';
    }
}
