package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class MineDetailPlayListBean extends BaseBean {
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
            private int collectSongId;
            private MusicSongBean songInfoDto;

            public int getCollectSongId() {
                return this.collectSongId;
            }

            public void setCollectSongId(int i) {
                this.collectSongId = i;
            }

            public MusicSongBean getSongInfoDto() {
                return this.songInfoDto;
            }

            public void setSongInfoDto(MusicSongBean musicSongBean) {
                this.songInfoDto = musicSongBean;
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
