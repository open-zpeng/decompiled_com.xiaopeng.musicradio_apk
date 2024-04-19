package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class AlbumHashListBean extends BaseBean {
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
            private int albumId;
            private String hash;

            public String getHash() {
                return this.hash;
            }

            public void setHash(String str) {
                this.hash = str;
            }

            public int getAlbumId() {
                return this.albumId;
            }

            public void setAlbumId(int i) {
                this.albumId = i;
            }
        }
    }
}
