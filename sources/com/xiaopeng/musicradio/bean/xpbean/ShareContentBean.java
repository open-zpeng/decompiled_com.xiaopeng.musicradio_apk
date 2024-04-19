package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class ShareContentBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<String> musicContents;
        private List<String> readingContents;

        public List<String> getMusicContent() {
            return this.musicContents;
        }

        public void setMusicContents(List<String> list) {
            this.musicContents = list;
        }

        public List<String> getReadingContents() {
            return this.readingContents;
        }

        public void setReadingContents(List<String> list) {
            this.readingContents = list;
        }
    }
}
