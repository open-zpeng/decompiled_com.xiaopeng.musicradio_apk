package defpackage;

import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicDataDirtyModel.java */
/* renamed from: alp  reason: default package */
/* loaded from: classes2.dex */
public class alp extends a {
    private boolean d;

    public alp(boolean z) {
        this.d = z;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.g gVar) {
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
