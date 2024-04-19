package com.xiaopeng.musicradio.bean.xpbean.user;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* loaded from: classes.dex */
public class UserMobileBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private String mobile;

        public String getMobile() {
            return this.mobile;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }
    }
}
