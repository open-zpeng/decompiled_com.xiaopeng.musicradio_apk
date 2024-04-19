package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.Collections;
import java.util.List;
/* compiled from: CollectedMusicModel.java */
/* renamed from: aig  reason: default package */
/* loaded from: classes2.dex */
public class aig {
    private List<MusicInfo> a;

    /* compiled from: CollectedMusicModel.java */
    /* renamed from: aig$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aig a = new aig();
    }

    public static aig a() {
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
