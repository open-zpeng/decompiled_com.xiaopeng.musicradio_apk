package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class MusicLoveListBean extends BaseBean {
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
        private PageBean page;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<ListBean> getList() {
            return this.list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class PageBean {
            private int page;
            private int pageSize;
            private int total;
            private int totalPage;

            public int getPage() {
                return this.page;
            }

            public void setPage(int i) {
                this.page = i;
            }

            public int getPageSize() {
                return this.pageSize;
            }

            public void setPageSize(int i) {
                this.pageSize = i;
            }

            public int getTotal() {
                return this.total;
            }

            public void setTotal(int i) {
                this.total = i;
            }

            public int getTotalPage() {
                return this.totalPage;
            }

            public void setTotalPage(int i) {
                this.totalPage = i;
            }
        }

        /* loaded from: classes.dex */
        public static class ListBean {
            private long createTime;
            private MusicSongBean song;
            private boolean syncFromKugou;

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public MusicSongBean getSong() {
                return this.song;
            }

            public void setSong(MusicSongBean musicSongBean) {
                this.song = musicSongBean;
            }

            public boolean isSyncFromKugou() {
                return this.syncFromKugou;
            }

            public void setSyncFromKugou(boolean z) {
                this.syncFromKugou = z;
            }
        }
    }
}
