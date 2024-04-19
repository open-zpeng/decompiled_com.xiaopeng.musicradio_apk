package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.common.PageBean;
import java.util.List;
/* loaded from: classes.dex */
public class ReadingHotRankListBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        @SerializedName("list")
        private List<RdAlbumBean> mList;
        @SerializedName("page")
        private PageBean mPage;

        public List<RdAlbumBean> getList() {
            return this.mList;
        }

        public PageBean getPage() {
            return this.mPage;
        }
    }
}
