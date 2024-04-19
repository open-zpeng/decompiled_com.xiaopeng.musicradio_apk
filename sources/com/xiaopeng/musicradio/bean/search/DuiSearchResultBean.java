package com.xiaopeng.musicradio.bean.search;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.libconfig.ipc.IpcConfig;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.dui.DuiMusicParams;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import java.util.List;
/* loaded from: classes.dex */
public class DuiSearchResultBean {
    @SerializedName("albumList")
    private List<MusicAlbumBean> mAlbumList;
    @SerializedName("collectList")
    private List<MixSearchResultBean.CollectBean> mCollectList;
    @SerializedName("keyWord")
    private String mKeyword;
    @SerializedName("listed")
    private int mListed;
    @SerializedName("page")
    private PageBean mPage;
    @SerializedName(IpcConfig.DeviceCommunicationConfig.KEY_APP_MESSAGE_PARAMS)
    private DuiMusicParams mParams;
    @SerializedName("complexSearchRespV2")
    private QQListResult mQQListResult;
    @SerializedName("radioList")
    private List<NetRadioInfo> mRadioList;
    @SerializedName("readingAlbumList")
    private List<RdAlbumBean> mReadingAlbumList;
    @SerializedName("searchType")
    private int mSearchType;
    @SerializedName("songList")
    private List<MusicSongBean> mSongList;
    @SerializedName("version")
    private String mVersion;
    private String query;
    private DuiSemanticBean semantic;

    public int getListed() {
        return this.mListed;
    }

    public int getSearchType() {
        return this.mSearchType;
    }

    public PageBean getPage() {
        return this.mPage;
    }

    public String getKeyword() {
        return this.mKeyword;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public List<MusicSongBean> getSongList() {
        return this.mSongList;
    }

    public List<MusicAlbumBean> getAlbumList() {
        return this.mAlbumList;
    }

    public List<MixSearchResultBean.CollectBean> getCollectList() {
        return this.mCollectList;
    }

    public List<RdAlbumBean> getReadingAlbumList() {
        return this.mReadingAlbumList;
    }

    public List<NetRadioInfo> getRadioList() {
        return this.mRadioList;
    }

    public QQListResult getQQListResult() {
        return this.mQQListResult;
    }

    public DuiMusicParams getParams() {
        return this.mParams;
    }

    public void setListed(int i) {
        this.mListed = i;
    }

    public DuiSemanticBean getSemantic() {
        return this.semantic;
    }

    public void setSemantic(DuiSemanticBean duiSemanticBean) {
        this.semantic = duiSemanticBean;
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    /* loaded from: classes.dex */
    public static class QQListResult {
        @SerializedName("albumList")
        private List<MusicAlbumBean> mAlbumList;
        @SerializedName("collectList")
        private List<MixSearchResultBean.CollectBean> mCollectList;
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

        public List<NetRadioInfo> getRadioList() {
            return this.mRadioList;
        }

        public List<RdAlbumBean> getReadingAlbumList() {
            return this.mReadingAlbumList;
        }

        public List<MixSearchResultBean.CollectBean> getCollectList() {
            return this.mCollectList;
        }
    }
}
