package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class SongQualityBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<SongQuality> list;

        public List<SongQuality> getList() {
            return this.list;
        }

        public void setList(List<SongQuality> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class SongQuality implements Serializable {
            private int fileSize;
            private String hash;
            private boolean needVip;
            private String playUrl;
            private int privilege;
            private int quality;

            public String getHash() {
                return this.hash;
            }

            public void setHash(String str) {
                this.hash = str;
            }

            public int getFileSize() {
                return this.fileSize;
            }

            public void setFileSize(int i) {
                this.fileSize = i;
            }

            public int getPrivilege() {
                return this.privilege;
            }

            public void setPrivilege(int i) {
                this.privilege = i;
            }

            public int getQuality() {
                return this.quality;
            }

            public void setQuality(int i) {
                this.quality = i;
            }

            public boolean isNeedVip() {
                return this.needVip;
            }

            public void setNeedVip(boolean z) {
                this.needVip = z;
            }

            public String getPlayUrl() {
                return this.playUrl;
            }

            public void setPlayUrl(String str) {
                this.playUrl = str;
            }

            public String toString() {
                return "SongQuality{hash='" + this.hash + "', fileSize=" + this.fileSize + ", privilege=" + this.privilege + ", quality=" + this.quality + ", needVip=" + this.needVip + ", playUrl='" + this.playUrl + "'}";
            }
        }
    }
}
