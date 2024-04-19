package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class VipMusicMoreDetails extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private List<CollectBean> list;
        private PageBean page;

        public List<CollectBean> getList() {
            return this.list;
        }

        public void setList(List<CollectBean> list) {
            this.list = list;
        }

        public PageBean getPage() {
            return this.page;
        }

        public void setPage(PageBean pageBean) {
            this.page = pageBean;
        }

        public String toString() {
            return "DataBean{list=" + this.list + ", page=" + this.page + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class CollectBean implements Serializable {
        private MusicRadioItem collect;
        private int isLock;

        public MusicRadioItem getCollect() {
            return this.collect;
        }

        public void setCollect(MusicRadioItem musicRadioItem) {
            this.collect = musicRadioItem;
        }

        public int isLock() {
            return this.isLock;
        }

        public void setLock(int i) {
            this.isLock = i;
        }

        public String toString() {
            return "CollectBean{collect=" + this.collect + ", isLock=" + this.isLock + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class PageBean implements Serializable {
        private int page;
        private int pageSize;
        private int total;
        private int totalPage;

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

        public String toString() {
            return "PageBean{total=" + this.total + ", totalPage=" + this.totalPage + ", page=" + this.page + ", pageSize=" + this.pageSize + '}';
        }
    }
}
