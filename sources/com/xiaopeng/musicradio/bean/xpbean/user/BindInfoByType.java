package com.xiaopeng.musicradio.bean.xpbean.user;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
/* loaded from: classes.dex */
public class BindInfoByType extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private String headImg;
        private String nickName;
        private int state;
        private String thirdAccessToken;
        private String thirdId;
        private int thirdType;

        public String getThirdId() {
            return this.thirdId;
        }

        public void setThirdId(String str) {
            this.thirdId = str;
        }

        public int getThirdType() {
            return this.thirdType;
        }

        public void setThirdType(int i) {
            this.thirdType = i;
        }

        public String getNickName() {
            return this.nickName;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public String getHeadImg() {
            return this.headImg;
        }

        public void setHeadImg(String str) {
            this.headImg = str;
        }

        public int getState() {
            return this.state;
        }

        public void setState(int i) {
            this.state = i;
        }

        public String getThirdAccessToken() {
            return this.thirdAccessToken;
        }

        public void setThirdAccessToken(String str) {
            this.thirdAccessToken = str;
        }
    }
}
