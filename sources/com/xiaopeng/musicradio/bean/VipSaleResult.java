package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.util.List;
/* loaded from: classes.dex */
public class VipSaleResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private BannerMapBean bannerMap;

        public BannerMapBean getBannerMap() {
            return this.bannerMap;
        }

        public void setBannerMap(BannerMapBean bannerMapBean) {
            this.bannerMap = bannerMapBean;
        }

        /* loaded from: classes.dex */
        public static class BannerMapBean {
            private List<VipSaleInfo> qqMain;
            private List<VipSaleInfo> radioMain;
            private List<VipSaleInfo> readingMain;
            private List<VipSaleInfo> userMain;

            public List<VipSaleInfo> getQqMain() {
                return this.qqMain;
            }

            public void setQqMain(List<VipSaleInfo> list) {
                this.qqMain = list;
            }

            public List<VipSaleInfo> getReadingMain() {
                return this.readingMain;
            }

            public void setReadingMain(List<VipSaleInfo> list) {
                this.readingMain = list;
            }

            public List<VipSaleInfo> getUserMain() {
                return this.userMain;
            }

            public void setUserMain(List<VipSaleInfo> list) {
                this.userMain = list;
            }

            public List<VipSaleInfo> getRadioMain() {
                return this.radioMain;
            }

            public void setRadioMain(List<VipSaleInfo> list) {
                this.radioMain = list;
            }
        }
    }
}
