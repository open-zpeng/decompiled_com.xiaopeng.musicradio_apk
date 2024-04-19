package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.xpbean.BaseBean;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class VipMusicCollectListBean extends BaseBean implements Serializable {
    private static final long serialVersionUID = 1;
    private MusicCollectBean data;
    private PageBean page;

    public PageBean getPage() {
        return this.page;
    }

    public void setPage(PageBean pageBean) {
        this.page = pageBean;
    }

    public MusicCollectBean getData() {
        return this.data;
    }

    public void setData(MusicCollectBean musicCollectBean) {
        this.data = musicCollectBean;
    }

    /* loaded from: classes.dex */
    public static class MusicCollectBean implements Serializable {
        private static final long serialVersionUID = 1;
        private List<CollectBean> list;

        public List<CollectBean> getList() {
            return this.list;
        }

        public void setList(List<CollectBean> list) {
            this.list = list;
        }

        /* loaded from: classes.dex */
        public static class CollectBean implements Serializable {
            private String description;
            private int id;
            private boolean isFavourite;
            private String logo;
            private String name;
            private int songCount;
            private int type;

            public String getDescription() {
                return this.description;
            }

            public void setDescription(String str) {
                this.description = str;
            }

            public int getId() {
                return this.id;
            }

            public void setId(int i) {
                this.id = i;
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
        }
    }

    /* loaded from: classes.dex */
    public static class PageBean implements Serializable {
        private static final long serialVersionUID = 1;
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
    }
}
