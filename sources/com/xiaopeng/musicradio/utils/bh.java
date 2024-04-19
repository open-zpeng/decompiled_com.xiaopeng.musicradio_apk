package com.xiaopeng.musicradio.utils;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UserListUtil.java */
/* loaded from: classes2.dex */
public class bh {
    public static List<MusicInfo> a() {
        return apk.i().o().e(50);
    }

    public static List<MusicInfo> a(int i) {
        List<MusicInfo> e = apk.i().o().e(i);
        ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : e) {
            arrayList.add(musicInfo.clone());
        }
        return arrayList;
    }
}
