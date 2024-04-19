package com.xiaopeng.musicradio.bean.push;
/* loaded from: classes.dex */
public class PushUserBean {
    public DataBean data;
    public int scene;
    public boolean test;

    public int getScene() {
        return this.scene;
    }

    public void setScene(int i) {
        this.scene = i;
    }

    public String getOpenId() {
        DataBean dataBean = this.data;
        if (dataBean != null) {
            return dataBean.getOpenId();
        }
        return null;
    }

    public void setOpenId(String str) {
        if (this.data == null) {
            this.data = new DataBean();
        }
        this.data.setOpenId(str);
    }

    public long getExpireTime() {
        DataBean dataBean = this.data;
        if (dataBean != null) {
            return dataBean.getExpireTime();
        }
        return 0L;
    }

    public void setExpireTime(long j) {
        if (this.data == null) {
            this.data = new DataBean();
        }
        this.data.setExpireTime(j);
    }

    public boolean isTest() {
        return this.test;
    }

    public void setTest(boolean z) {
        this.test = z;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        public long expireTime;
        public String openId;

        public String getOpenId() {
            return this.openId;
        }

        public void setOpenId(String str) {
            this.openId = str;
        }

        public long getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(long j) {
            this.expireTime = j;
        }
    }
}
