package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
/* loaded from: classes.dex */
public class MusicListenFileBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 1;
        private int endMs;
        private String listenFile;
        private String lyricContent;
        private boolean needVip;
        private int quality;
        private int startMs;
        private boolean userVip;

        public String getListenFile() {
            return this.listenFile;
        }

        public void setListenFile(String str) {
            this.listenFile = str;
        }

        public String getLyricContent() {
            return this.lyricContent;
        }

        public void setLyricContent(String str) {
            this.lyricContent = str;
        }

        public boolean isNeedVip() {
            return this.needVip;
        }

        public void setNeedVip(boolean z) {
            this.needVip = z;
        }

        public boolean isUserVip() {
            return this.userVip;
        }

        public void setUserVip(boolean z) {
            this.userVip = z;
        }

        public int getQuality() {
            return this.quality;
        }

        public void setQuality(int i) {
            this.quality = i;
        }

        public int getStartMs() {
            return this.startMs;
        }

        public void setStartMs(int i) {
            this.startMs = i;
        }

        public int getEndMs() {
            return this.endMs;
        }

        public void setEndMs(int i) {
            this.endMs = i;
        }
    }
}
