package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class XpengTrackInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long albumId;
    private XpengTrackInfoArtist artist;
    private boolean canDownload;
    private long duration;
    private boolean free;
    private long id;
    private boolean isNew;
    private String largeLogo;
    private long listenFileSize;
    private String listenUrl;
    private String mediumLogo;
    private long orderNum;
    private long originAlbumId;
    private String smallLogo;
    private String title;
    private long updateTime;
    private long vipFirstStatus;

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public long getOriginAlbumId() {
        return this.originAlbumId;
    }

    public void setOriginAlbumId(long j) {
        this.originAlbumId = j;
    }

    public long getListenFileSize() {
        return this.listenFileSize;
    }

    public void setListenFileSize(long j) {
        this.listenFileSize = j;
    }

    public long getDuration() {
        return this.duration;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public long getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(long j) {
        this.orderNum = j;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public long getVipFirstStatus() {
        return this.vipFirstStatus;
    }

    public void setVipFirstStatus(long j) {
        this.vipFirstStatus = j;
    }

    public XpengTrackInfoArtist getArtist() {
        return this.artist;
    }

    public void setArtist(XpengTrackInfoArtist xpengTrackInfoArtist) {
        this.artist = xpengTrackInfoArtist;
    }

    public String getListenUrl() {
        return this.listenUrl;
    }

    public void setListenUrl(String str) {
        this.listenUrl = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSmallLogo() {
        return this.smallLogo;
    }

    public void setSmallLogo(String str) {
        this.smallLogo = str;
    }

    public String getMediumLogo() {
        return this.mediumLogo;
    }

    public void setMediumLogo(String str) {
        this.mediumLogo = str;
    }

    public String getLargeLogo() {
        return this.largeLogo;
    }

    public void setLargeLogo(String str) {
        this.largeLogo = str;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public boolean isFree() {
        return this.free;
    }

    public void setFree(boolean z) {
        this.free = z;
    }

    public String toString() {
        return "XpengTrackInfo{id=" + this.id + ", albumId=" + this.albumId + ", originAlbumId=" + this.originAlbumId + ", listenFileSize=" + this.listenFileSize + ", duration=" + this.duration + ", orderNum=" + this.orderNum + ", updateTime=" + this.updateTime + ", vipFirstStatus=" + this.vipFirstStatus + ", artist=" + this.artist + ", listenUrl='" + this.listenUrl + "', title='" + this.title + "', smallLogo='" + this.smallLogo + "', mediumLogo='" + this.mediumLogo + "', largeLogo='" + this.largeLogo + "', canDownload=" + this.canDownload + ", isNew=" + this.isNew + ", free=" + this.free + '}';
    }
}
