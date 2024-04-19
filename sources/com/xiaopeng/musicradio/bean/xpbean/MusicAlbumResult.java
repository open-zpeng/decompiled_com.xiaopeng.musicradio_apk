package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class MusicAlbumResult extends BaseBean {
    private DataBean data;

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    /* loaded from: classes.dex */
    public static class DataBean {
        private MusicArtistBean artist;
        private int id;
        private String logo;
        private String name;

        public MusicArtistBean getArtist() {
            return this.artist;
        }

        public void setArtist(MusicArtistBean musicArtistBean) {
            this.artist = musicArtistBean;
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
    }
}
