package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class HotRankListBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        @SerializedName("ranks")
        private List<RankBean> mRankList;

        /* loaded from: classes.dex */
        public static class RankBean implements Serializable {
            @SerializedName("albumInfoDtos")
            private List<RdAlbumBean> mAlbumInfos;
            @SerializedName(DataTypes.OBJ_CONTENT_TYPE)
            private int mContentType;
            @SerializedName("coverPath")
            private String mCoverPath;
            @SerializedName("rankId")
            private int mRankId;
            @SerializedName("rankName")
            private String mRankName;

            public int getRankId() {
                return this.mRankId;
            }

            public void setRankId(int i) {
                this.mRankId = i;
            }

            public String getRankName() {
                return this.mRankName;
            }

            public void setRankName(String str) {
                this.mRankName = str;
            }

            public String getCoverPath() {
                return this.mCoverPath;
            }

            public int getContentType() {
                return this.mContentType;
            }

            public List<RdAlbumBean> getAlbumInfos() {
                return this.mAlbumInfos;
            }

            public void setAlbumInfos(List<RdAlbumBean> list) {
                this.mAlbumInfos = list;
            }
        }

        public List<RankBean> getRankList() {
            return this.mRankList;
        }
    }
}
