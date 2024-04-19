package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class CategoryAlbumListBean extends BaseBean {
    private static final long serialVersionUID = -2180362585925544088L;
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<RdAlbumBean> list;
        private PageBean page;

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public List<RdAlbumBean> getList() {
            return this.list;
        }

        public void setList(List<RdAlbumBean> list) {
            this.list = list;
        }

        public String toString() {
            return "" + this.list;
        }

        /* loaded from: classes.dex */
        public static class PageBean implements Serializable {
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

    public String toString() {
        return "{" + this.data + "}";
    }
}
