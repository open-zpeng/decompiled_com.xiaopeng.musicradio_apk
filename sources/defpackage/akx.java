package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.Collections;
import java.util.List;
/* compiled from: HistoryMusicModel.java */
/* renamed from: akx  reason: default package */
/* loaded from: classes2.dex */
public class akx {
    private List<MusicInfo> a;

    /* compiled from: HistoryMusicModel.java */
    /* renamed from: akx$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final akx a = new akx();
    }

    public static akx a() {
        return a.a;
    }

    public List<MusicInfo> b() {
        List<MusicInfo> list = this.a;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public void a(List<MusicInfo> list) {
        this.a = list;
    }
}
