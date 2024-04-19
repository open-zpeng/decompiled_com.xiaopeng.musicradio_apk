package com.xiaopeng.musicradio.bean.xpbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ReadingCategoryListBeanV3 extends BaseBean {
    private static final long serialVersionUID = 1;
    @SerializedName("data")
    private DataBean mData;

    public DataBean getData() {
        return this.mData;
    }

    public void setData(DataBean dataBean) {
        this.mData = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 1;
        @SerializedName("list")
        private List<ListBean> mList;

        public List<ListBean> getList() {
            return this.mList;
        }

        public void setList(List<ListBean> list) {
            this.mList = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private static final long serialVersionUID = 1;
            @SerializedName("id")
            private int mId;
            @SerializedName("logo")
            private String mLogo;
            @SerializedName("name")
            private String mName;
            @SerializedName("nightLogo")
            private String mNightLogo;

            public int getId() {
                return this.mId;
            }

            public void setId(int i) {
                this.mId = i;
            }

            public String getName() {
                return this.mName;
            }

            public void setName(String str) {
                this.mName = str;
            }

            public String getLogo() {
                return this.mLogo;
            }

            public void setLogo(String str) {
                this.mLogo = str;
            }

            public String getNightLogo() {
                return this.mNightLogo;
            }

            public void setNightLogo(String str) {
                this.mNightLogo = str;
            }
        }
    }
}
