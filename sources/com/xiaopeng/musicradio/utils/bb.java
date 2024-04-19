package com.xiaopeng.musicradio.utils;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
/* compiled from: SongListUtils.java */
/* loaded from: classes2.dex */
public class bb {
    private static Random a = new Random();

    public static int a(Collection<MusicInfo> collection) {
        if (collection == null || collection.isEmpty() || 4 != apk.i().c()) {
            return 0;
        }
        return Math.abs(a.nextInt(Integer.MAX_VALUE)) % collection.size();
    }

    public static void a(List<MusicSongBean> list) {
        if (w.f() != 2 || list == null || list.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.utils.bb.1
            @Override // java.lang.Runnable
            public void run() {
                ((are) com.xiaopeng.musicradio.service.c.a().b(are.class)).updateLove(arrayList, true);
            }
        });
    }
}
