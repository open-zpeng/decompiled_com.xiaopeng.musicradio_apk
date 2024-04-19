package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MusicAlbumLoveListBean extends BaseBean {
    public static final int TYPE_IMPORT_LIST = 3;
    public static final int TYPE_KUGOU_SYNC_LIST = 2;
    public static final int TYPE_OTHER_BUILD_KUGOU_LIST = 6;
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
            private CollectionBean collect;
            private long createTime;
            private int state = 0;

            public CollectionBean getMusicCollectBean() {
                return this.collect;
            }

            public void setMusicCollectBean(CollectionBean collectionBean) {
                this.collect = collectionBean;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public int getState() {
                return this.state;
            }

            public void setState(int i) {
                this.state = i;
            }
        }

        /* loaded from: classes.dex */
        public static class CollectionBean implements Serializable {
            private String description;
            private long id;
            private boolean isFavourite;
            private String logo;
            private String name;
            private int songCount;
            private int type;

            public long getId() {
                return this.id;
            }

            public void setId(long j) {
                this.id = j;
            }

            public String getLogo() {
                return this.logo;
            }

            public void setLogo(String str) {
                this.logo = str;
            }

            public String getName() {
                return this.name;
            }

            public void setName(String str) {
                this.name = str;
            }

            public int getSongCount() {
                return this.songCount;
            }

            public void setSongCount(int i) {
                this.songCount = i;
            }

            public String getDescription() {
                return this.description;
            }

            public void setDescription(String str) {
                this.description = str;
            }

            public int getType() {
                return this.type;
            }

            public void setType(int i) {
                this.type = i;
            }

            public boolean isFavourite() {
                return this.isFavourite;
            }

            public void setFavourite(boolean z) {
                this.isFavourite = z;
            }

            public int getClassifiedType() {
                return MusicAlbumType.getType(getType(), isFavourite());
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
