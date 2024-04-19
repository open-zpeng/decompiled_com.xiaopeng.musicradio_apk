package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* loaded from: classes.dex */
public class PlayTrackInfoBean extends BaseBean {
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        @SerializedName("authorized")
        private boolean mIsTrackAuthorized;
        @SerializedName("paymentType")
        private int mPaymentType;
        @SerializedName("id")
        private long mTrackId;

        public int getPaymentType() {
            return this.mPaymentType;
        }

        public long getTrackId() {
            return this.mTrackId;
        }

        public boolean isTrackAuthorized() {
            return this.mIsTrackAuthorized;
        }

        public String toString() {
            return "DataBean{mTrackId=" + this.mTrackId + ", mPaymentType=" + this.mPaymentType + ", mIsTrackAuthorized=" + this.mIsTrackAuthorized + '}';
        }
    }

    public String toString() {
        return "PlayTrackInfoBean{mData=" + this.mData + '}';
    }
}
