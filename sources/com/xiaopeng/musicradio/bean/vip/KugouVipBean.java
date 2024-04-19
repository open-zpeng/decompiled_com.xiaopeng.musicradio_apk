package com.xiaopeng.musicradio.bean.vip;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.util.List;
/* loaded from: classes.dex */
public class KugouVipBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<VipInfoBean> vipInfos;

        public List<VipInfoBean> getVipInfos() {
            return this.vipInfos;
        }

        public void setVipInfos(List<VipInfoBean> list) {
            this.vipInfos = list;
        }
    }

    /* loaded from: classes.dex */
    public static class VipInfoBean {
        private String kugouUid;
        private boolean xpVip;

        public String getKugouUid() {
            return this.kugouUid;
        }

        public void setKugouUid(String str) {
            this.kugouUid = str;
        }

        public boolean isXpVip() {
            return this.xpVip;
        }

        public void setXpVip(boolean z) {
            this.xpVip = z;
        }
    }
}
