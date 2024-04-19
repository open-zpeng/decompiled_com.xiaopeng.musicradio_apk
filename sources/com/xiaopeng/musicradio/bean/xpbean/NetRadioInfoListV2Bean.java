package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class NetRadioInfoListV2Bean extends BaseBean {
    private static final long serialVersionUID = 1;
    @SerializedName("data")
    private DataBean mData;

    public DataBean getmData() {
        return this.mData;
    }

    public void setmData(DataBean dataBean) {
        this.mData = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 1;
        @SerializedName("localList")
        private List<NetRadioInfo> mLocalList;
        @SerializedName("provinceList")
        private List<NetRadioInfo> mProvinceList;

        public List<NetRadioInfo> getmLocalList() {
            return this.mLocalList;
        }

        public void setmLocalList(List<NetRadioInfo> list) {
            this.mLocalList = list;
        }

        public List<NetRadioInfo> getmProvinceList() {
            return this.mProvinceList;
        }

        public void setmProvinceList(List<NetRadioInfo> list) {
            this.mProvinceList = list;
        }
    }
}
