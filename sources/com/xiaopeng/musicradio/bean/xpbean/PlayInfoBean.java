package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import com.lzy.okgo.model.Progress;
import java.io.Serializable;
/* loaded from: classes.dex */
public class PlayInfoBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        @SerializedName("isAlbumAuthorized")
        private boolean mIsAlbumAuthorized;
        @SerializedName("isTrackAuthorized")
        private boolean mIsTrackAuthorized;
        @SerializedName("size")
        private long mSize;
        @SerializedName(Progress.URL)
        private String mUrl;

        public String getUrl() {
            return this.mUrl;
        }

        public long getSize() {
            return this.mSize;
        }

        public boolean isTrackAuthorized() {
            return this.mIsTrackAuthorized;
        }

        public boolean isAlbumAuthorized() {
            return this.mIsAlbumAuthorized;
        }
    }
}
