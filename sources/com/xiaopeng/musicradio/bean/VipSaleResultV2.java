package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.util.List;
/* loaded from: classes.dex */
public class VipSaleResultV2 extends BaseBean {
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
            private List<VipSaleInfoV2> kugouMain;
            private List<VipSaleInfoV2> kugouUserMan;
            private List<VipSaleInfoV2> neteaseMain;
            private List<VipSaleInfoV2> neteaseUserMain;
            private List<VipSaleInfoV2> qqMain;
            private List<VipSaleInfoV2> qqUserMain;
            private List<VipSaleInfoV2> radioMain;
            private List<VipSaleInfoV2> radioUserMain;
            private List<VipSaleInfoV2> readingMain;
            private List<VipSaleInfoV2> readingUserMain;

            public List<VipSaleInfoV2> getQqUserMain() {
                return this.qqUserMain;
            }

            public void setQqUserMain(List<VipSaleInfoV2> list) {
                this.qqUserMain = list;
            }

            public List<VipSaleInfoV2> getNeteaseMain() {
                return this.neteaseMain;
            }

            public void setNeteaseMain(List<VipSaleInfoV2> list) {
                this.neteaseMain = list;
            }

            public List<VipSaleInfoV2> getKugouUserMan() {
                return this.kugouUserMan;
            }

            public void setKugouUserMan(List<VipSaleInfoV2> list) {
                this.kugouUserMan = list;
            }

            public List<VipSaleInfoV2> getNeteaseUserMain() {
                return this.neteaseUserMain;
            }

            public void setNeteaseUserMain(List<VipSaleInfoV2> list) {
                this.neteaseUserMain = list;
            }

            public List<VipSaleInfoV2> getKugouMain() {
                return this.kugouMain;
            }

            public void setKugouMain(List<VipSaleInfoV2> list) {
                this.kugouMain = list;
            }

            public List<VipSaleInfoV2> getReadingUserMain() {
                return this.readingUserMain;
            }

            public void setReadingUserMain(List<VipSaleInfoV2> list) {
                this.readingUserMain = list;
            }

            public List<VipSaleInfoV2> getQqMain() {
                return this.qqMain;
            }

            public void setQqMain(List<VipSaleInfoV2> list) {
                this.qqMain = list;
            }

            public List<VipSaleInfoV2> getReadingMain() {
                return this.readingMain;
            }

            public void setReadingMain(List<VipSaleInfoV2> list) {
                this.readingMain = list;
            }

            public List<VipSaleInfoV2> getRadioMain() {
                return this.radioMain;
            }

            public void setRadioMain(List<VipSaleInfoV2> list) {
                this.radioMain = list;
            }

            public List<VipSaleInfoV2> getRadioUserMain() {
                return this.radioUserMain;
            }

            public void setRadioUserMain(List<VipSaleInfoV2> list) {
                this.radioUserMain = list;
            }
        }
    }
}
