package defpackage;

import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import defpackage.aeh;
/* compiled from: DefaultMusicPlayAction.java */
/* renamed from: apg  reason: default package */
/* loaded from: classes2.dex */
public class apg implements aeh.b {
    @Override // defpackage.aeh.b
    public void a() {
        apk.i().a(new amq(au.b(-1000L, be.a(b.f.daily_title) + bg.h(System.currentTimeMillis())).toJson(), 50) { // from class: apg.1
            @Override // defpackage.ahp
            public boolean n() {
                return true;
            }

            @Override // defpackage.ahp
            public void a(boolean z, int i, String str) {
                super.a(z, i, str);
                ak.a(a.a, str);
            }
        });
    }
}
