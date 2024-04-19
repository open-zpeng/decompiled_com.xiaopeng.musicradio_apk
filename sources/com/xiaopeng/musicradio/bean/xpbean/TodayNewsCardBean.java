package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class TodayNewsCardBean extends BaseBean {
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
            private int cardId;
            private int cardSegmentId;
            private String cardTitle;
            private Image1Bean image1;
            private Image2Bean image2;
            private int total;
            private List<TrackInfoBosBean> trackInfoBos;

            public int getCardId() {
                return this.cardId;
            }

            public void setCardId(int i) {
                this.cardId = i;
            }

            public int getCardSegmentId() {
                return this.cardSegmentId;
            }

            public void setCardSegmentId(int i) {
                this.cardSegmentId = i;
            }

            public String getCardTitle() {
                return this.cardTitle;
            }

            public void setCardTitle(String str) {
                this.cardTitle = str;
            }

            public int getTotal() {
                return this.total;
            }

            public void setTotal(int i) {
                this.total = i;
            }

            public Image1Bean getImage1() {
                return this.image1;
            }

            public void setImage1(Image1Bean image1Bean) {
                this.image1 = image1Bean;
            }

            public Image2Bean getImage2() {
                return this.image2;
            }

            public void setImage2(Image2Bean image2Bean) {
                this.image2 = image2Bean;
            }

            public List<TrackInfoBosBean> getTrackInfoBos() {
                return this.trackInfoBos;
            }

            public void setTrackInfoBos(List<TrackInfoBosBean> list) {
                this.trackInfoBos = list;
            }

            /* loaded from: classes.dex */
            public static class Image1Bean {
                private String coverUrl;
                private String coverUrlNight;
                private String endColorDaytime;
                private String endColorNight;
                private String startColorDaytime;
                private String startColorNight;

                public String getCoverUrl() {
                    return this.coverUrl;
                }

                public void setCoverUrl(String str) {
                    this.coverUrl = str;
                }

                public String getCoverUrlNight() {
                    return this.coverUrlNight;
                }

                public void setCoverUrlNight(String str) {
                    this.coverUrlNight = str;
                }

                public String getStartColorDaytime() {
                    return this.startColorDaytime;
                }

                public void setStartColorDaytime(String str) {
                    this.startColorDaytime = str;
                }

                public String getEndColorDaytime() {
                    return this.endColorDaytime;
                }

                public void setEndColorDaytime(String str) {
                    this.endColorDaytime = str;
                }

                public String getStartColorNight() {
                    return this.startColorNight;
                }

                public void setStartColorNight(String str) {
                    this.startColorNight = str;
                }

                public String getEndColorNight() {
                    return this.endColorNight;
                }

                public void setEndColorNight(String str) {
                    this.endColorNight = str;
                }
            }

            /* loaded from: classes.dex */
            public static class Image2Bean {
                private String e38Color;
                private String e38ColorNight;
                private String largeCover;
                private String middleCover;
                private String smallCover;

                public String getSmallCover() {
                    return this.smallCover;
                }

                public void setSmallCover(String str) {
                    this.smallCover = str;
                }

                public String getMiddleCover() {
                    return this.middleCover;
                }

                public void setMiddleCover(String str) {
                    this.middleCover = str;
                }

                public String getLargeCover() {
                    return this.largeCover;
                }

                public void setLargeCover(String str) {
                    this.largeCover = str;
                }

                public String getE38Color() {
                    return this.e38Color;
                }

                public void setE38Color(String str) {
                    this.e38Color = str;
                }

                public String getE38ColorNight() {
                    return this.e38ColorNight;
                }

                public void setE38ColorNight(String str) {
                    this.e38ColorNight = str;
                }
            }

            /* loaded from: classes.dex */
            public static class TrackInfoBosBean {
                private int albumId;
                private ArtistBean artist;
                private boolean authorized;
                private boolean canDownload;
                private long createTime;
                private int duration;
                private boolean favorite;
                private boolean free;
                private int id;
                private String largeLogo;
                private int listenFileSize;
                private String listenUrl;
                private String mediumLogo;
                private int orderNum;
                private int originAlbumId;
                private boolean paid;
                private int paymentType;
                private int playCount;
                private long publishTime;
                private String smallLogo;
                private String title;
                private long updateTime;
                private int vipFirstStatus;
                private boolean vipFree;
                private boolean vipOnly;

                public int getId() {
                    return this.id;
                }

                public void setId(int i) {
                    this.id = i;
                }

                public int getAlbumId() {
                    return this.albumId;
                }

                public void setAlbumId(int i) {
                    this.albumId = i;
                }

                public int getOriginAlbumId() {
                    return this.originAlbumId;
                }

                public void setOriginAlbumId(int i) {
                    this.originAlbumId = i;
                }

                public String getTitle() {
                    return this.title;
                }

                public void setTitle(String str) {
                    this.title = str;
                }

                public int getDuration() {
                    return this.duration;
                }

                public void setDuration(int i) {
                    this.duration = i;
                }

                public boolean isCanDownload() {
                    return this.canDownload;
                }

                public void setCanDownload(boolean z) {
                    this.canDownload = z;
                }

                public int getOrderNum() {
                    return this.orderNum;
                }

                public void setOrderNum(int i) {
                    this.orderNum = i;
                }

                public long getUpdateTime() {
                    return this.updateTime;
                }

                public void setUpdateTime(long j) {
                    this.updateTime = j;
                }

                public long getCreateTime() {
                    return this.createTime;
                }

                public void setCreateTime(long j) {
                    this.createTime = j;
                }

                public String getSmallLogo() {
                    return this.smallLogo;
                }

                public void setSmallLogo(String str) {
                    this.smallLogo = str;
                }

                public String getMediumLogo() {
                    return this.mediumLogo;
                }

                public void setMediumLogo(String str) {
                    this.mediumLogo = str;
                }

                public String getLargeLogo() {
                    return this.largeLogo;
                }

                public void setLargeLogo(String str) {
                    this.largeLogo = str;
                }

                public long getPublishTime() {
                    return this.publishTime;
                }

                public void setPublishTime(long j) {
                    this.publishTime = j;
                }

                public int getPlayCount() {
                    return this.playCount;
                }

                public void setPlayCount(int i) {
                    this.playCount = i;
                }

                public int getVipFirstStatus() {
                    return this.vipFirstStatus;
                }

                public void setVipFirstStatus(int i) {
                    this.vipFirstStatus = i;
                }

                public ArtistBean getArtist() {
                    return this.artist;
                }

                public void setArtist(ArtistBean artistBean) {
                    this.artist = artistBean;
                }

                public String getListenUrl() {
                    return this.listenUrl;
                }

                public void setListenUrl(String str) {
                    this.listenUrl = str;
                }

                public int getListenFileSize() {
                    return this.listenFileSize;
                }

                public void setListenFileSize(int i) {
                    this.listenFileSize = i;
                }

                public int getPaymentType() {
                    return this.paymentType;
                }

                public void setPaymentType(int i) {
                    this.paymentType = i;
                }

                public boolean isPaid() {
                    return this.paid;
                }

                public void setPaid(boolean z) {
                    this.paid = z;
                }

                public boolean isFavorite() {
                    return this.favorite;
                }

                public void setFavorite(boolean z) {
                    this.favorite = z;
                }

                public boolean isFree() {
                    return this.free;
                }

                public void setFree(boolean z) {
                    this.free = z;
                }

                public boolean isVipFree() {
                    return this.vipFree;
                }

                public void setVipFree(boolean z) {
                    this.vipFree = z;
                }

                public boolean isVipOnly() {
                    return this.vipOnly;
                }

                public void setVipOnly(boolean z) {
                    this.vipOnly = z;
                }

                public boolean isAuthorized() {
                    return this.authorized;
                }

                public void setAuthorized(boolean z) {
                    this.authorized = z;
                }

                /* loaded from: classes.dex */
                public static class ArtistBean {
                    private int id;
                    private String logo;
                    private String name;

                    public String getLogo() {
                        return this.logo;
                    }

                    public void setLogo(String str) {
                        this.logo = str;
                    }

                    public int getId() {
                        return this.id;
                    }

                    public void setId(int i) {
                        this.id = i;
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
}
