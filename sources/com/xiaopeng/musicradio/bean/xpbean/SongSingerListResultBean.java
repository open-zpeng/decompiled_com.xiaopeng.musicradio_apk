package com.xiaopeng.musicradio.bean.xpbean;

import java.util.List;
/* loaded from: classes.dex */
public class SongSingerListResultBean extends BaseBean {
    private List<MusicArtistBean> data;

    public List<MusicArtistBean> getData() {
        return this.data;
    }

    public void setData(List<MusicArtistBean> list) {
        this.data = list;
    }
}
