package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MinePlayListBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
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
        public static class ListBean implements Serializable {
            private long createTime;
            private int deleted;
            private long id;
            private String img;
            private String name;
            private String uid;
            private long updateTime;

            public String getImg() {
                return this.img;
            }

            public void setImg(String str) {
                this.img = str;
            }

            public long getId() {
                return this.id;
            }

            public void setId(long j) {
                this.id = j;
            }

            public String getUid() {
                return this.uid;
            }

            public void setUid(String str) {
                this.uid = str;
            }

            public String getName() {
                return this.name;
            }

            public void setName(String str) {
                this.name = str;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public long getUpdateTime() {
                return this.updateTime;
            }

            public void setUpdateTime(long j) {
                this.updateTime = j;
            }

            public int getDeleted() {
                return this.deleted;
            }

            public void setDeleted(int i) {
                this.deleted = i;
            }
        }
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
