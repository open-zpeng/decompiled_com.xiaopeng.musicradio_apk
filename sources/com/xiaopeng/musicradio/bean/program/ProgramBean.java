package com.xiaopeng.musicradio.bean.program;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
/* loaded from: classes.dex */
public class ProgramBean extends BaseInfo {
    private int cardId;
    @SerializedName("albumAuthorized")
    private boolean mAlbumAuthorized;
    @SerializedName("albumId")
    private long mAlbumId;
    @SerializedName("albumLogo")
    private String mAlbumLogo;
    @SerializedName("albumName")
    private String mAlbumName;
    @SerializedName("albumPaymentType")
    private int mAlbumPaymentType;
    @SerializedName("artistId")
    private long mArtistId;
    @SerializedName("artistName")
    private String mArtistName;
    @SerializedName("authorized")
    private boolean mAuthorized;
    @SerializedName("categoryName")
    private String mCategoryName;
    @SerializedName("channelId")
    private int mChannelId;
    @SerializedName("createTime")
    private long mCreateTime;
    @SerializedName("duration")
    private int mDuration;
    @SerializedName("fromSource")
    private String mFromSource;
    @SerializedName("intro")
    private String mIntro;
    @SerializedName("largeLogo")
    private String mLargeLogo;
    @SerializedName("listenUrl")
    private String mListenUrl;
    @SerializedName("mediumLogo")
    private String mMediumLogo;
    @SerializedName("orderNum")
    private int mOrderNum;
    @SerializedName("originAlbumId")
    private long mOriginalAlbumId;
    @SerializedName("paymentType")
    private int mPaymentType;
    @SerializedName("playCount")
    private long mPlayCount;
    @SerializedName("shortIntro")
    private String mShortIntro;
    @SerializedName("smallLogo")
    private String mSmallLogo;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("trackId")
    private long mTrackId;
    @SerializedName("updateTime")
    private long mUpdateTime;
    private boolean off;
    private String offMsg;
    private long offTime;
    @SerializedName(VuiConstants.ELEMENT_TYPE)
    private String mType = "";
    @SerializedName("position")
    private int mPosition = 0;

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public String getFromSource() {
        return this.mFromSource;
    }

    public void setFromSource(String str) {
        this.mFromSource = str;
    }

    public String getCategoryName() {
        return this.mCategoryName;
    }

    public void setCategoryName(String str) {
        this.mCategoryName = str;
    }

    public String getAlbumLogo() {
        return this.mAlbumLogo;
    }

    public void setAlbumLogo(String str) {
        this.mAlbumLogo = str;
    }

    public String getShortIntro() {
        return this.mShortIntro;
    }

    public void setShortIntro(String str) {
        this.mShortIntro = str;
    }

    public long getPlayCount() {
        return this.mPlayCount;
    }

    public void setPlayCount(long j) {
        this.mPlayCount = j;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }

    public long getTrackId() {
        return this.mTrackId;
    }

    public void setTrackId(long j) {
        this.mTrackId = j;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public String getIntro() {
        return this.mIntro;
    }

    public void setIntro(String str) {
        this.mIntro = str;
    }

    public String getListenUrl() {
        return this.mListenUrl;
    }

    public void setListenUrl(String str) {
        this.mListenUrl = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public long getArtistId() {
        return this.mArtistId;
    }

    public void setArtistId(long j) {
        this.mArtistId = j;
    }

    public String getSmallLogo() {
        return this.mSmallLogo;
    }

    public void setSmallLogo(String str) {
        this.mSmallLogo = str;
    }

    public String getArtistName() {
        return this.mArtistName;
    }

    public void setArtistName(String str) {
        this.mArtistName = str;
    }

    public String getLargeLogo() {
        return this.mLargeLogo;
    }

    public void setLargeLogo(String str) {
        this.mLargeLogo = str;
    }

    public String getMediumLogo() {
        return this.mMediumLogo;
    }

    public void setMediumLogo(String str) {
        this.mMediumLogo = str;
    }

    public void setUpdateTime(long j) {
        this.mUpdateTime = j;
    }

    public long getUpdateTime() {
        return this.mUpdateTime;
    }

    public long getCreateTime() {
        return this.mCreateTime;
    }

    public void setCreateTime(long j) {
        this.mCreateTime = j;
    }

    public void setAlbumId(long j) {
        this.mAlbumId = j;
    }

    public long getAlbumId() {
        return this.mAlbumId;
    }

    public String getAlbumName() {
        return this.mAlbumName;
    }

    public void setAlbumName(String str) {
        this.mAlbumName = str;
    }

    public int getOrderNum() {
        return this.mOrderNum;
    }

    public void setOrderNum(int i) {
        this.mOrderNum = i;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    public void setCardId(int i) {
        this.cardId = i;
    }

    public int getCardId() {
        return this.cardId;
    }

    public long getOriginalAlbumId() {
        return this.mOriginalAlbumId;
    }

    public void setOriginalAlbumId(long j) {
        this.mOriginalAlbumId = j;
    }

    public int getAlbumPaymentType() {
        return this.mAlbumPaymentType;
    }

    public void setAlbumPaymentType(int i) {
        this.mAlbumPaymentType = i;
    }

    public boolean isAlbumAuthorized() {
        return this.mAlbumAuthorized;
    }

    public void setAlbumAuthorized(boolean z) {
        this.mAlbumAuthorized = z;
    }

    public void setPaymentType(int i) {
        this.mPaymentType = i;
    }

    public int getPaymentType() {
        return this.mPaymentType;
    }

    public boolean isAuthorized() {
        return this.mAuthorized;
    }

    public void setAuthorized(boolean z) {
        this.mAuthorized = z;
    }

    public boolean isOff() {
        return this.off;
    }

    public void setOff(boolean z) {
        this.off = z;
    }

    public long getOffTime() {
        return this.offTime;
    }

    public void setOffTime(long j) {
        this.offTime = j;
    }

    public String getOffMsg() {
        return this.offMsg;
    }

    public void setOffMsg(String str) {
        this.offMsg = str;
    }

    public String toString() {
        return "ProgramBean{trackId=" + this.mTrackId + ", duration=" + this.mDuration + ", intro='" + this.mIntro + "', listenUrl='" + this.mListenUrl + "', title='" + this.mTitle + "', artistId=" + this.mArtistId + ", smallLogo='" + this.mSmallLogo + "', largeLogo='" + this.mLargeLogo + "', mediumLogo='" + this.mMediumLogo + "', artistName='" + this.mArtistName + "', updateTime=" + this.mUpdateTime + ", albumId=" + this.mAlbumId + ", albumName='" + this.mAlbumName + "', fromSource=" + this.mFromSource + ", channelId=" + this.mChannelId + ", originalAlbumId=" + this.mOriginalAlbumId + ", paymentType=" + this.mPaymentType + ", authorized=" + this.mAuthorized + ", off=" + this.off + ", offTime=" + this.offTime + '}';
    }
}
