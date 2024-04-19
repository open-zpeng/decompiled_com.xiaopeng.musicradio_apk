package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class MusicDownloadBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class ListBean {
            private String fileUrl;
            private String quality;

            public String getFileUrl() {
                return this.fileUrl;
            }

            public void setFileUrl(String str) {
                this.fileUrl = str;
            }

            public String getQuality() {
                return this.quality;
            }

            public void setQuality(String str) {
                this.quality = str;
            }
        }
    }
}
