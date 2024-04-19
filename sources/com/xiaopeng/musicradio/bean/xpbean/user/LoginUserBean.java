package com.xiaopeng.musicradio.bean.xpbean.user;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* loaded from: classes.dex */
public class LoginUserBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private String openId;
        private String sid;
        private String uid;

        public String getOpenId() {
            return this.openId;
        }

        public void setOpenId(String str) {
            this.openId = str;
        }

        public String getSid() {
            return this.sid;
        }

        public void setSid(String str) {
            this.sid = str;
        }

        public String getUid() {
            return this.uid;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }
}
