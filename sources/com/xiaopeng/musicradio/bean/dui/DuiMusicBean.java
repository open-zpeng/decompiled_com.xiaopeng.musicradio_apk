package com.xiaopeng.musicradio.bean.dui;

import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* loaded from: classes.dex */
public class DuiMusicBean {
    private String listSign;
    private PageBean page;
    private DuiMusicParams params;
    private List<MusicInfo> tracks;

    public DuiMusicParams getParams() {
        return this.params;
    }

    public void setParams(DuiMusicParams duiMusicParams) {
        this.params = duiMusicParams;
    }

    public List<MusicInfo> getTracks() {
        return this.tracks;
    }

    public void setTracks(List<MusicInfo> list) {
        this.tracks = list;
    }

    public PageBean getPage() {
        return this.page;
    }

    public void setPage(PageBean pageBean) {
        this.page = pageBean;
    }

    public String getListSign() {
        return this.listSign;
    }

    public void setListSign(String str) {
        this.listSign = str;
    }
}
