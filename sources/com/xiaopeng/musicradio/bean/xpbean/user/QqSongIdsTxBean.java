package com.xiaopeng.musicradio.bean.xpbean.user;

import com.google.gson.annotations.SerializedName;
/* loaded from: classes.dex */
public class QqSongIdsTxBean {
    @SerializedName("songIds")
    public String songIds;

    public QqSongIdsTxBean(String str) {
        this.songIds = str;
    }

    public String getSongIds() {
        return this.songIds;
    }

    public void setSongIds(String str) {
        this.songIds = str;
    }
}
