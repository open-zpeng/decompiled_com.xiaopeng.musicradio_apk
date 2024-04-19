package com.xiaopeng.musicradio.bean.xpbean;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public class FMAlbumTracksBean extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public String toString() {
        return "FMAlbumTracksBean{data=" + this.data + '}';
    }

    /* loaded from: classes.dex */
    public static class DataBean implements Serializable {
        private static final long serialVersionUID = 1;
        private List<ListBean> list;
        String mode;
        private PageBean page;
        private String sort;

        public String getMode() {
            return this.mode;
        }

        public void setMode(String str) {
            this.mode = str;
        }

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

        public void setSort(String str) {
            this.sort = str;
        }

        public String getSort() {
            return this.sort;
        }

        public String toString() {
            return "DataBean{mode='" + this.mode + "', page=" + this.page + ", list=" + this.list + ", sort='" + this.sort + "'}";
        }

        /* loaded from: classes.dex */
        public static class PageBean implements Serializable {
            private static final long serialVersionUID = 1;
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

            public String toString() {
                return "PageBean{page=" + this.page + ", pageSize=" + this.pageSize + ", total=" + this.total + ", totalPage=" + this.totalPage + '}';
            }
        }

        /* loaded from: classes.dex */
        public static class ListBean implements Serializable {
            private static final long serialVersionUID = 1;
            private long albumId;
            private ArtistBean artist;
            private boolean authorized;
            private boolean canDownload;
            private long createTime;
            private int duration;
            private int id;
            private String largeLogo;
            private String listenUrl;
            private String mediumLogo;
            private int orderNum;
            private int paymentType;
            private String smallLogo;
            private boolean subscribe;
            private String title;
            private long updateTime;

            public ArtistBean getArtist() {
                return this.artist;
            }

            public void setArtist(ArtistBean artistBean) {
                this.artist = artistBean;
            }

            public boolean isCanDownload() {
                return this.canDownload;
            }

            public void setCanDownload(boolean z) {
                this.canDownload = z;
            }

            public int getDuration() {
                return this.duration;
            }

            public void setDuration(int i) {
                this.duration = i;
            }

            public int getId() {
                return this.id;
            }

            public void setId(int i) {
                this.id = i;
            }

            public String getLargeLogo() {
                return this.largeLogo;
            }

            public void setLargeLogo(String str) {
                this.largeLogo = str;
            }

            public String getListenUrl() {
                return this.listenUrl;
            }

            public void setListenUrl(String str) {
                this.listenUrl = str;
            }

            public String getMediumLogo() {
                return this.mediumLogo;
            }

            public void setMediumLogo(String str) {
                this.mediumLogo = str;
            }

            public int getOrderNum() {
                return this.orderNum;
            }

            public void setOrderNum(int i) {
                this.orderNum = i;
            }

            public String getSmallLogo() {
                return this.smallLogo;
            }

            public void setSmallLogo(String str) {
                this.smallLogo = str;
            }

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public long getUpdateTime() {
                return this.updateTime;
            }

            public void setUpdateTime(long j) {
                this.updateTime = j;
            }

            public long getAlbumId() {
                return this.albumId;
            }

            public void setAlbumId(long j) {
                this.albumId = j;
            }

            public void setPaymentType(int i) {
                this.paymentType = i;
            }

            public void setAuthorized(boolean z) {
                this.authorized = z;
            }

            public int getPaymentType() {
                return this.paymentType;
            }

            public long getCreateTime() {
                return this.createTime;
            }

            public void setCreateTime(long j) {
                this.createTime = j;
            }

            public boolean isAuthorized() {
                return this.authorized;
            }

            public boolean isSubscribe() {
                return this.subscribe;
            }

            public String toString() {
                return "ListBean{artist=" + this.artist + ", duration=" + this.duration + ", id=" + this.id + ", listenUrl='" + this.listenUrl + "', orderNum=" + this.orderNum + ", title='" + this.title + "', albumId=" + this.albumId + ", paymentType=" + this.paymentType + ", authorized=" + this.authorized + '}';
            }

            /* loaded from: classes.dex */
            public static class ArtistBean implements Serializable {
                private static final long serialVersionUID = 1;
                private long id;
                private String logo;
                private String name;

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
            }
        }
    }
}
