package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.Collections;
import java.util.List;
/* compiled from: BlueMusicModel.java */
/* renamed from: alo  reason: default package */
/* loaded from: classes2.dex */
public class alo {
    private List<MusicInfo> a;

    /* compiled from: BlueMusicModel.java */
    /* renamed from: alo$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final alo a = new alo();
    }

    public static alo a() {
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
