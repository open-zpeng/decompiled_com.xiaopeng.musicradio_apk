package com.xiaopeng.musicradio.bean.xpbean;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.util.List;
/* loaded from: classes.dex */
public class UserAlbumListBean extends BaseBean {
    private int code;
    private String msg;
    private List<MusicRadioItem> musicRadioList;

    @Override // com.xiaopeng.musicradio.bean.xpbean.BaseBean
    public int getCode() {
        return this.code;
    }

    @Override // com.xiaopeng.musicradio.bean.xpbean.BaseBean
    public void setCode(int i) {
        this.code = i;
    }

    @Override // com.xiaopeng.musicradio.bean.xpbean.BaseBean
    public String getMsg() {
        return this.msg;
    }

    @Override // com.xiaopeng.musicradio.bean.xpbean.BaseBean
    public void setMsg(String str) {
        this.msg = str;
    }

    public List<MusicRadioItem> getMusicRadioList() {
        return this.musicRadioList;
    }

    public void setMusicRadioList(List<MusicRadioItem> list) {
        this.musicRadioList = list;
    }
}
