package com.xiaopeng.musicradio.bean.xpbean;

import androidx.annotation.Keep;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class SongListBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private List<MusicSongBean> list;
        private PageBean page;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<MusicSongBean> getList() {
            return this.list;
        }

        public void setList(List<MusicSongBean> list) {
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
    }
}
