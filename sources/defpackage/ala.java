package defpackage;

import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: NetRadioDataDirtyModel.java */
/* renamed from: ala  reason: default package */
/* loaded from: classes2.dex */
public class ala extends a {
    private boolean d;

    public ala(boolean z) {
        this.d = z;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agk agkVar) {
        a(true, new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.n nVar) {
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
