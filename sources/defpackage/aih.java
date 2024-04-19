package defpackage;

import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agl;
import defpackage.agq;
import defpackage.ark;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicDataDirtyModel.java */
/* renamed from: aih  reason: default package */
/* loaded from: classes2.dex */
public class aih extends a {
    private boolean d;

    public aih(boolean z) {
        this.d = z;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agl.a aVar) {
        if (aVar.a(50) || aVar.a(0)) {
            a(!aVar.b, aVar);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.g gVar) {
        a(true, new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.v vVar) {
        a(true, vVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.f fVar) {
        a(true, new Object[0]);
    }

    @Override // com.xiaopeng.musicradio.datalist.a
    public void b() {
        if (this.d) {
            super.b();
            d();
        }
    }

    public void d() {
        u.b(this);
    }
}
