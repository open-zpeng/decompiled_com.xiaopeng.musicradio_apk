package com.xiaopeng.musicradio.bean.reading;

import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import java.util.List;
/* loaded from: classes.dex */
public class RankBean {
    private List<RdAlbumBean> mAlbumInfos;
    private String mAlbumInfosString;
    private int mContentType;
    private String mCoverPath;
    private int mRankId;
    private String mRankName;

    public int getmRankId() {
        return this.mRankId;
    }

    public void setmRankId(int i) {
        this.mRankId = i;
    }

    public String getmRankName() {
        return this.mRankName;
    }

    public void setmRankName(String str) {
        this.mRankName = str;
    }

    public String getmCoverPath() {
        return this.mCoverPath;
    }

    public void setmCoverPath(String str) {
        this.mCoverPath = str;
    }

    public int getmContentType() {
        return this.mContentType;
    }

    public void setmContentType(int i) {
        this.mContentType = i;
    }

    public List<RdAlbumBean> getmAlbumInfos() {
        return this.mAlbumInfos;
    }

    public void setmAlbumInfos(List<RdAlbumBean> list) {
        this.mAlbumInfos = list;
    }

    public String getmAlbumInfosString() {
        return this.mAlbumInfosString;
    }

    public void setmAlbumInfosString(String str) {
        this.mAlbumInfosString = str;
    }
}
