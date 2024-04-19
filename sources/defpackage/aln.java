package defpackage;

import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agl;
import defpackage.agq;
import defpackage.ark;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: BlueDataDirtyModel.java */
/* renamed from: aln  reason: default package */
/* loaded from: classes2.dex */
public class aln extends a {
    private boolean d;

    public aln(boolean z) {
        this.d = z;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agl.a aVar) {
        if (aVar.a(20)) {
            a(true, new Object[0]);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.e eVar) {
        if (eVar.a()) {
            return;
        }
        a(true, new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.v vVar) {
        a(true, vVar);
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
