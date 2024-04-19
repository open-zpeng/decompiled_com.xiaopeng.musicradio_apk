package com.xiaopeng.musicradio.bean.xpbean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class TodayNewsChannelBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        @SerializedName("list")
        private List<ListBean> mList;

        /* loaded from: classes.dex */
        public class ListBean implements Serializable {
            @SerializedName("channelId")
            private int mChannelId;
            @SerializedName("channelName")
            private String mChannelName;
            @SerializedName("classId")
            private int mClassId;
            @SerializedName("className")
            private String mClassName;
            @SerializedName(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)
            private BackgroundColorBean mColorBean;
            @SerializedName("coverRound")
            private String mCoverRound;
            @SerializedName("coverUrl")
            private String mCoverUrl;
            @SerializedName("coverUrlNight")
            private String mCoverUrlNight;
            @SerializedName("orderNum")
            private long mOrderNum;
            @SerializedName("relativeId")
            private String mRelativeId;
            @SerializedName("slogan")
            private String mSlogan;
            @SerializedName("total")
            private int mTotal;
            @SerializedName("trackInfoBos")
            private List<TrackInfoBosItem> mTrackInfoBos;

            public ListBean() {
            }

            public String getCoverUrl() {
                return this.mCoverUrl;
            }

            public int getClassId() {
                return this.mClassId;
            }

            public String getCoverRound() {
                return this.mCoverRound;
            }

            public List<TrackInfoBosItem> getTrackInfoBos() {
                return this.mTrackInfoBos;
            }

            public String getRelativeId() {
                return this.mRelativeId;
            }

            public long getOrderNum() {
                return this.mOrderNum;
            }

            public String getChannelName() {
                return this.mChannelName;
            }

            public String getClassName() {
                return this.mClassName;
            }

            public int getTotal() {
                return this.mTotal;
            }

            public String getSlogan() {
                return this.mSlogan;
            }

            public int getChannelId() {
                return this.mChannelId;
            }

            public String getCoverUrlNight() {
                return this.mCoverUrlNight;
            }

            public BackgroundColorBean getColorBean() {
                return this.mColorBean;
            }
        }

        /* loaded from: classes.dex */
        public class BackgroundColorBean implements Serializable {
            @SerializedName("endColorDaytime")
            private String mEndColorDaytime;
            @SerializedName("endColorNight")
            private String mEndColorNight;
            @SerializedName("startColorDaytime")
            private String mStartColorDaytime;
            @SerializedName("startColorNight")
            private String mStartColorNight;

            public BackgroundColorBean() {
            }

            public String getStartColorDaytime() {
                return this.mStartColorDaytime;
            }

            public String getEndColorDaytime() {
                return this.mEndColorDaytime;
            }

            public String getStartColorNight() {
                return this.mStartColorNight;
            }

            public String getEndColorNight() {
                return this.mEndColorNight;
            }
        }

        /* loaded from: classes.dex */
        public class TrackInfoBosItem implements Serializable {
            @SerializedName("albumId")
            private int mAlbumId;
            @SerializedName("artist")
            private ReadingArtist mArtist;
            @SerializedName("canDownload")
            private boolean mCanDownload;
            @SerializedName("duration")
            private int mDuration;
            @SerializedName("free")
            private boolean mFree;
            @SerializedName("id")
            private int mId;
            @SerializedName("isNew")
            private boolean mIsNew;
            @SerializedName("largeLogo")
            private String mLargeLogo;
            @SerializedName("listenFileSize")
            private int mListenFileSize;
            @SerializedName("listenUrl")
            private String mListenUrl;
            @SerializedName("mediumLogo")
            private String mMediumLogo;
            @SerializedName("orderNum")
            private int mOrderNum;
            @SerializedName("originAlbumId")
            private int mOriginAlbumId;
            @SerializedName("smallLogo")
            private String mSmallLogo;
            @SerializedName("title")
            private String mTitle;
            @SerializedName("updateTime")
            private long mUpdateTime;
            @SerializedName("vipFirstStatus")
            private int mVipFirstStatus;

            public TrackInfoBosItem() {
            }

            public int getListenFileSize() {
                return this.mListenFileSize;
            }

            public ReadingArtist getArtist() {
                return this.mArtist;
            }

            public int getAlbumId() {
                return this.mAlbumId;
            }

            public int getOrderNum() {
                return this.mOrderNum;
            }

            public String getSmallLogo() {
                return this.mSmallLogo;
            }

            public long getUpdateTime() {
                return this.mUpdateTime;
            }

            public String getLargeLogo() {
                return this.mLargeLogo;
            }

            public boolean isIsNew() {
                return this.mIsNew;
            }

            public String getTitle() {
                return this.mTitle;
            }

            public int getOriginAlbumId() {
                return this.mOriginAlbumId;
            }

            public int getDuration() {
                return this.mDuration;
            }

            public String getListenUrl() {
                return this.mListenUrl;
            }

            public String getMediumLogo() {
                return this.mMediumLogo;
            }

            public boolean isCanDownload() {
                return this.mCanDownload;
            }

            public int getVipFirstStatus() {
                return this.mVipFirstStatus;
            }

            public int getId() {
                return this.mId;
            }

            public boolean isFree() {
                return this.mFree;
            }
        }

        public List<ListBean> getList() {
            return this.mList;
        }
    }
}
