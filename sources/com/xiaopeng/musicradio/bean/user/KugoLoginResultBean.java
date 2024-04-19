package com.xiaopeng.musicradio.bean.user;

import java.util.List;
/* loaded from: classes.dex */
public class KugoLoginResultBean {
    private DataBean data;
    private int error_code;
    private int status;

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public int getError_code() {
        return this.error_code;
    }

    public void setError_code(int i) {
        this.error_code = i;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<InfoListBean> info_list;
        private String nickname;
        private String pic;
        private int sex;
        private String token;
        private String userid;
        private String username;

        public String getNickname() {
            return this.nickname;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String getToken() {
            return this.token;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public int getSex() {
            return this.sex;
        }

        public void setSex(int i) {
            this.sex = i;
        }

        public String getUsername() {
            return this.username;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public String getPic() {
            return this.pic;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public String getUserid() {
            return this.userid;
        }

        public void setUserid(String str) {
            this.userid = str;
        }

        public List<InfoListBean> getInfo_list() {
            return this.info_list;
        }

        public void setInfo_list(List<InfoListBean> list) {
            this.info_list = list;
        }

        /* loaded from: classes.dex */
        public static class InfoListBean {
            private String nickname;
            private String pic;
            private String userid;
            private String username;

            public String getPic() {
                return this.pic;
            }

            public void setPic(String str) {
                this.pic = str;
            }

            public String getUsername() {
                return this.username;
            }

            public void setUsername(String str) {
                this.username = str;
            }

            public String getUserid() {
                return this.userid;
            }

            public void setUserid(String str) {
                this.userid = str;
            }

            public String getNickname() {
                return this.nickname;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }
        }
    }
}
