package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class InvalidSidBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private String sid;

        public String getSid() {
            return this.sid;
        }

        public void setSid(String str) {
            this.sid = str;
        }
    }
}
