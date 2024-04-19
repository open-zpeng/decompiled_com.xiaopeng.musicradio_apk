package defpackage;

import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.utils.be;
/* compiled from: MusicServiceModel.java */
/* renamed from: amt  reason: default package */
/* loaded from: classes2.dex */
public class amt {

    /* compiled from: MusicServiceModel.java */
    /* renamed from: amt$a */
    /* loaded from: classes2.dex */
    private static class a {
        private static final amt a = new amt();
    }

    private amt() {
    }

    public static amt a() {
        return a.a;
    }

    public arg b() {
        BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
        arg argVar = new arg();
        argVar.e(d.getUuid());
        if (be.a(com.xiaopeng.musicradio.model.bluetooth.a.i().t(), d.getSong()) && be.a(com.xiaopeng.musicradio.model.bluetooth.a.i().u(), d.getSinger())) {
            argVar.b(true);
        } else {
            argVar.b(false);
        }
        argVar.a(d.getSong());
        argVar.b(d.getSinger());
        argVar.d(d.getLrcContent());
        MusicInfo a2 = l.c().a(d.getSong(), d.getSinger());
        if (a2 != null) {
            boolean e = anv.a().e(a2);
            argVar.c(a2.getLogo());
            argVar.a(e);
            argVar.a(a2.getSong());
            argVar.b(a2.getSinger());
        } else {
            argVar.c(d.getLogo());
        }
        argVar.c();
        argVar.a();
        return argVar;
    }
}
