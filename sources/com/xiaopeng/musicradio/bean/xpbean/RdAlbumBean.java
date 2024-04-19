package com.xiaopeng.musicradio.bean.xpbean;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.Serializable;
/* loaded from: classes.dex */
public class RdAlbumBean implements Serializable {
    public static final int SORT_ASC = 0;
    public static final int SORT_DESC = 1;
    private static final long serialVersionUID = 1;
    private XmArtistBean artist;
    private boolean authorized;
    private boolean canDownload;
    private int cardId;
    private String categoryName;
    private long channelId;
    private int displayHistoryInfo;
    private long id;
    private String intro;
    private String largeLogo;
    private transient SpannableStringBuilder mHighlightTitle;
    private String mediumLogo;
    private int paymentType;
    private long playCount;
    private String rdTag;
    private String shortIntro;
    private String smallLogo;
    private boolean subscribe;
    private String title;
    private long trackCount;
    private XpengTrackInfo trackInfo;
    private long updateTime;
    private int sort = 1;
    private String fromSource = "";
    private int status = 0;

    /* loaded from: classes.dex */
    private @interface SORT {
    }

    public XpengTrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    public void setTrackInfo(XpengTrackInfo xpengTrackInfo) {
        this.trackInfo = xpengTrackInfo;
    }

    public String getFromSource() {
        return this.fromSource;
    }

    public void setFromSource(String str) {
        this.fromSource = str;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String str) {
        this.intro = str;
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

    public String getRdTag() {
        return this.rdTag;
    }

    public void setRdTag(String str) {
        this.rdTag = str;
    }

    public XmArtistBean getArtist() {
        return this.artist;
    }

    public void setArtist(XmArtistBean xmArtistBean) {
        this.artist = xmArtistBean;
    }

    public boolean isCanDownload() {
        return this.canDownload;
    }

    public void setCanDownload(boolean z) {
        this.canDownload = z;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
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

    public String getSmallLogo() {
        return this.smallLogo;
    }

    public void setSmallLogo(String str) {
        this.smallLogo = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public long getTrackCount() {
        return this.trackCount;
    }

    public void setTrackCount(long j) {
        this.trackCount = j;
    }

    public int getSort() {
        return this.sort;
    }

    public void setSort(@SORT int i) {
        this.sort = i;
    }

    public int getDisplayHistoryInfo() {
        return this.displayHistoryInfo;
    }

    public void setDisplayHistoryInfo(int i) {
        this.displayHistoryInfo = i;
    }

    public long getChannelId() {
        return this.channelId;
    }

    public void setChannelId(long j) {
        this.channelId = j;
    }

    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int i) {
        this.cardId = i;
    }

    public SpannableStringBuilder getHighlightTitle() {
        return this.mHighlightTitle;
    }

    public void setHighlightTitle(SpannableStringBuilder spannableStringBuilder) {
        this.mHighlightTitle = spannableStringBuilder;
    }

    public int getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(int i) {
        this.paymentType = i;
    }

    public void setAuthorized(boolean z) {
        this.authorized = z;
    }

    public void setSubscribe(boolean z) {
        this.subscribe = z;
    }

    public boolean isAuthorized() {
        return this.authorized;
    }

    public boolean isSubscribe() {
        return this.subscribe;
    }

    public String getBestSizeLogo() {
        if (!TextUtils.isEmpty(this.largeLogo)) {
            return this.largeLogo;
        }
        if (!TextUtils.isEmpty(this.mediumLogo)) {
            return this.mediumLogo;
        }
        return this.smallLogo;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RdAlbumBean) && ((RdAlbumBean) obj).getId() == this.id;
    }

    public String toString() {
        return "RdAlbumBean{artist=" + this.artist + ", trackInfo=" + this.trackInfo + ", canDownload=" + this.canDownload + ", id=" + this.id + ", largeLogo='" + this.largeLogo + "', mediumLogo='" + this.mediumLogo + "', smallLogo='" + this.smallLogo + "', title='" + this.title + "', intro='" + this.intro + "', shortIntro='" + this.shortIntro + "', updateTime=" + this.updateTime + ", playCount=" + this.playCount + ", trackCount=" + this.trackCount + ", sort=" + this.sort + ", displayHistoryInfo=" + this.displayHistoryInfo + ", fromSource='" + this.fromSource + "', categoryName='" + this.categoryName + "', status=" + this.status + ", rdTag='" + this.rdTag + "'}";
    }
}
