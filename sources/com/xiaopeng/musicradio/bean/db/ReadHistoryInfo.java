package com.xiaopeng.musicradio.bean.db;

import java.io.Serializable;
/* loaded from: classes.dex */
public class ReadHistoryInfo implements Serializable {
    private static final long serialVersionUID = 0;
    private long albumId;
    private String albumName;
    private String artist;
    private long artistId;
    private boolean authorized;
    private int cardId;
    private String categoryName;
    private long channelId;
    private long duration;
    private String intro;
    private String largeLogo;
    private String logo;
    private String mediumLogo;
    private int orderNum;
    private int paymentType;
    private long playCount;
    private long seek;
    private String shortIntro;
    private String sort;
    private boolean trackAuthorized;
    private long trackId;
    private int trackPaymentType;
    private String trackTitle;
    private long ts;
    private String uid;
    private long updateTime;

    public ReadHistoryInfo(long j, String str, long j2, String str2, String str3, String str4, String str5, long j3, String str6, long j4, long j5, String str7, long j6, long j7, String str8, int i, String str9, String str10, long j8, String str11, int i2, boolean z, int i3, boolean z2, long j9, int i4) {
        this.albumId = 0L;
        this.artistId = 0L;
        this.trackId = 0L;
        this.seek = 0L;
        this.uid = "";
        this.updateTime = 0L;
        this.ts = 0L;
        this.sort = "timeAsc";
        this.orderNum = 0;
        this.albumId = j;
        this.albumName = str;
        this.artistId = j2;
        this.artist = str2;
        this.logo = str3;
        this.largeLogo = str4;
        this.mediumLogo = str5;
        this.trackId = j3;
        this.trackTitle = str6;
        this.seek = j4;
        this.duration = j5;
        this.uid = str7;
        this.updateTime = j6;
        this.ts = j7;
        this.sort = str8;
        this.orderNum = i;
        this.shortIntro = str9;
        this.intro = str10;
        this.playCount = j8;
        this.categoryName = str11;
        this.paymentType = i2;
        this.authorized = z;
        this.trackPaymentType = i3;
        this.trackAuthorized = z2;
        this.channelId = j9;
        this.cardId = i4;
    }

    public ReadHistoryInfo() {
        this.albumId = 0L;
        this.artistId = 0L;
        this.trackId = 0L;
        this.seek = 0L;
        this.uid = "";
        this.updateTime = 0L;
        this.ts = 0L;
        this.sort = "timeAsc";
        this.orderNum = 0;
    }

    public int getTrackPaymentType() {
        return this.trackPaymentType;
    }

    public void setTrackPaymentType(int i) {
        this.trackPaymentType = i;
    }

    public boolean isTrackAuthorized() {
        return this.trackAuthorized;
    }

    public void setTrackAuthorized(boolean z) {
        this.trackAuthorized = z;
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

    public long getArtistId() {
        return this.artistId;
    }

    public void setArtistId(long j) {
        this.artistId = j;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
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

    public long getTrackId() {
        return this.trackId;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public String getTrackTitle() {
        return this.trackTitle;
    }

    public void setTrackTitle(String str) {
        this.trackTitle = str;
    }

    public long getSeek() {
        return this.seek;
    }

    public void setSeek(long j) {
        this.seek = j;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(int i) {
        this.orderNum = i;
    }

    public int getPaymentType() {
        return this.paymentType;
    }

    public boolean isAuthorized() {
        return this.authorized;
    }

    public void setAuthorized(boolean z) {
        this.authorized = z;
    }

    public void setPaymentType(int i) {
        this.paymentType = i;
    }

    public String getPlayingPercent() {
        long j = this.duration;
        if (j == 0) {
            return "";
        }
        long j2 = (this.seek * 100) / j;
        if (j2 <= 0) {
            j2 = 1;
        }
        return j2 + "%";
    }

    public long getChannelId() {
        return this.channelId;
    }

    public void setChannelId(long j) {
        this.channelId = j;
    }

    public String getSort() {
        return this.sort;
    }

    public void setSort(String str) {
        this.sort = str;
    }

    public boolean getAuthorized() {
        return this.authorized;
    }

    public boolean getTrackAuthorized() {
        return this.trackAuthorized;
    }

    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int i) {
        this.cardId = i;
    }
}
