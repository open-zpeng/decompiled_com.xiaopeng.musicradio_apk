package com.xiaopeng.musicradio.bean;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* loaded from: classes.dex */
public class MusicListPlayReq {
    public final String listSign;
    public final int page;
    public final int pageSize;
    public final MusicInfo target;
    public final List<MusicInfo> targetList;
    public final int totalPage;

    public MusicListPlayReq(List<MusicInfo> list, MusicInfo musicInfo, int i, int i2, int i3, String str) {
        this.targetList = list;
        this.target = musicInfo;
        this.page = i;
        this.totalPage = i3;
        this.pageSize = i2;
        this.listSign = str;
    }
}
