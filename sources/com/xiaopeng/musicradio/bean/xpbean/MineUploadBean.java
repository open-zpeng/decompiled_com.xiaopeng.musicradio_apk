package com.xiaopeng.musicradio.bean.xpbean;
/* loaded from: classes.dex */
public class MineUploadBean {
    private long collectId;
    private String collectSongIds;
    private String songs;

    public String getCollectSongIds() {
        return this.collectSongIds;
    }

    public void setCollectSongIds(String str) {
        this.collectSongIds = str;
    }

    public long getCollectId() {
        return this.collectId;
    }

    public void setCollectId(long j) {
        this.collectId = j;
    }

    public String getSongs() {
        return this.songs;
    }

    public void setSongs(String str) {
        this.songs = str;
    }

    /* loaded from: classes.dex */
    public static class Bean {
        private long albumId;
        private String hash;

        public long getAlbumId() {
            return this.albumId;
        }

        public void setAlbumId(long j) {
            this.albumId = j;
        }

        public String getHash() {
            return this.hash;
        }

        public void setHash(String str) {
            this.hash = str;
        }
    }
}
