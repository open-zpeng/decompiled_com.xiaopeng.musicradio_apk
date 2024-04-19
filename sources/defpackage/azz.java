package defpackage;

import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.w;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SongListUtils.java */
/* renamed from: azz  reason: default package */
/* loaded from: classes2.dex */
public class azz {
    public static void a(List<MusicSongBean> list) {
        if (w.f() != 2 || list == null || list.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        ban.g(new Runnable() { // from class: azz.1
            @Override // java.lang.Runnable
            public void run() {
                ((are) c.a().b(are.class)).updateLove(arrayList, true);
            }
        });
    }
}
