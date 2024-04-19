package com.xiaopeng.musicradio.bean.reading;

import com.google.gson.annotations.SerializedName;
/* loaded from: classes.dex */
public class HeadSpeechHistoryRecord {
    private int cardId;
    @SerializedName("albumId")
    private long mAlbumId;
    @SerializedName("channelId")
    private int mChannelId;
    @SerializedName("page")
    private int mPage;
    @SerializedName("relativeId")
    private long mRelativeId;
    @SerializedName("seek")
    private long mSseek;
    @SerializedName("totalPage")
    private int mTotalPage;
    @SerializedName("trackId")
    private long mTrackId;

    public long getAlbumId() {
        return this.mAlbumId;
    }

    public void setAlbumId(long j) {
        this.mAlbumId = j;
    }

    public long getTrackId() {
        return this.mTrackId;
    }

    public void setTrackId(long j) {
        this.mTrackId = j;
    }

    public long getSeek() {
        return this.mSseek;
    }

    public void setSeek(long j) {
        this.mSseek = j;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    public long getRelativeId() {
        return this.mRelativeId;
    }

    public void setRelativeId(long j) {
        this.mRelativeId = j;
    }

    public int getTotalPage() {
        return this.mTotalPage;
    }

    public void setTotalPage(int i) {
        this.mTotalPage = i;
    }

    public int getPage() {
        return this.mPage;
    }

    public void setPage(int i) {
        this.mPage = i;
    }

    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int i) {
        this.cardId = i;
    }
}
