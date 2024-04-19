package com.xiaopeng.musicradio.bean.search;

import android.text.SpannableStringBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MixSearchResultBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;
    @SerializedName("pageInfo")
    private PageBean mPageBean;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        @SerializedName("albumList")
        private List<MusicAlbumBean> mAlbumList;
        @SerializedName("collectList")
        private List<CollectBean> mCollectList;
        @SerializedName("pageInfo")
        private PageBean mPage;
        @SerializedName("radioList")
        private List<NetRadioInfo> mRadioList;
        @SerializedName("readingAlbumList")
        private List<RdAlbumBean> mReadingAlbumList;
        @SerializedName("songList")
        private List<MusicSongBean> mSongList;

        public List<MusicSongBean> getSongList() {
            return this.mSongList;
        }

        public List<MusicAlbumBean> getAlbumList() {
            return this.mAlbumList;
        }

        public List<CollectBean> getCollectList() {
            return this.mCollectList;
        }

        public List<RdAlbumBean> getReadingAlbumList() {
            return this.mReadingAlbumList;
        }

        public List<NetRadioInfo> getRadioList() {
            return this.mRadioList;
        }

        public PageBean getPage() {
            return this.mPage;
        }

        public void setSongList(List<MusicSongBean> list) {
            this.mSongList = list;
        }

        public void setReadingAlbumList(List<RdAlbumBean> list) {
            this.mReadingAlbumList = list;
        }

        public void setAlbumList(List<MusicAlbumBean> list) {
            this.mAlbumList = list;
        }

        public void setCollectList(List<CollectBean> list) {
            this.mCollectList = list;
        }

        public void setRadioList(List<NetRadioInfo> list) {
            this.mRadioList = list;
        }
    }

    /* loaded from: classes.dex */
    public static class CollectBean implements Serializable {
        @SerializedName("description")
        private String mDescription;
        @Expose(deserialize = false, serialize = false)
        private SpannableStringBuilder mHighlightName;
        @SerializedName("id")
        private long mId;
        @SerializedName("isFavourite")
        private boolean mIsFavourite;
        @SerializedName("logo")
        private String mLogo;
        @SerializedName("name")
        private String mName;
        @SerializedName("songCount")
        private int mSongCount;
        @SerializedName(VuiConstants.ELEMENT_TYPE)
        private int mType;

        public String getName() {
            return this.mName;
        }

        public void setName(String str) {
            this.mName = str;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public String getLogo() {
            return this.mLogo;
        }

        public void setLogo(String str) {
            this.mLogo = str;
        }

        public long getId() {
            return this.mId;
        }

        public void setId(long j) {
            this.mId = j;
        }

        public Object getType() {
            return Integer.valueOf(this.mType);
        }

        public boolean isIsFavourite() {
            return this.mIsFavourite;
        }

        public int getSongCount() {
            return this.mSongCount;
        }

        public SpannableStringBuilder getHighlightName() {
            return this.mHighlightName;
        }

        public void setHighlightName(SpannableStringBuilder spannableStringBuilder) {
            this.mHighlightName = spannableStringBuilder;
        }

        public boolean equals(Object obj) {
            if (obj instanceof CollectBean) {
                return this.mId == ((CollectBean) obj).getId();
            }
            return super.equals(obj);
        }
    }
}
