package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* loaded from: classes.dex */
public class VipUrlResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private BuyUrlListBean buyUrlList;

        public BuyUrlListBean getBuyUrlList() {
            return this.buyUrlList;
        }

        public void setBuyUrlList(BuyUrlListBean buyUrlListBean) {
            this.buyUrlList = buyUrlListBean;
        }

        /* loaded from: classes.dex */
        public static class BuyUrlListBean {
            private VipUrlInfo dolbyExchangeUrl;
            private VipUrlInfo neteaseBuyUrl;
            private VipUrlInfo qqBuyUrl;
            private VipUrlInfo readingBuyUrl;

            public VipUrlInfo getQqBuyUrl() {
                return this.qqBuyUrl;
            }

            public void setQqBuyUrl(VipUrlInfo vipUrlInfo) {
                this.qqBuyUrl = vipUrlInfo;
            }

            public VipUrlInfo getNeteaseBuyUrl() {
                return this.neteaseBuyUrl;
            }

            public void setNeteaseBuyUrl(VipUrlInfo vipUrlInfo) {
                this.neteaseBuyUrl = vipUrlInfo;
            }

            public VipUrlInfo getReadingBuyUrl() {
                return this.readingBuyUrl;
            }

            public void setReadingBuyUrl(VipUrlInfo vipUrlInfo) {
                this.readingBuyUrl = vipUrlInfo;
            }

            public VipUrlInfo getDolbyExchangeUrl() {
                return this.dolbyExchangeUrl;
            }

            public void setDolbyExchangeUrl(VipUrlInfo vipUrlInfo) {
                this.dolbyExchangeUrl = vipUrlInfo;
            }
        }
    }
}
