package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* compiled from: UsbPlayOpt.java */
/* renamed from: bcd  reason: default package */
/* loaded from: classes2.dex */
public class bcd {

    /* compiled from: UsbPlayOpt.java */
    /* renamed from: bcd$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bcd a = new bcd();
    }

    public static bcd a() {
        return a.a;
    }

    public void a(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        atf.a().a(list, str, i, musicInfo);
        bcc.a();
    }

    public void b(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        a(list, str, i, musicInfo);
        bcc.d();
    }

    public void c(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        a(list, str, i, musicInfo);
        bcc.i();
    }

    public void d(List<MusicInfo> list, String str, int i, MusicInfo musicInfo) {
        a(list, str, i, musicInfo);
        bcc.n();
    }
}
