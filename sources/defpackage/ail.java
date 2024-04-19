package defpackage;

import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import defpackage.awn;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramDataDirtyModel.java */
/* renamed from: ail  reason: default package */
/* loaded from: classes2.dex */
public class ail extends a {
    private boolean d;

    public ail(boolean z) {
        this.d = z;
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.o oVar) {
        a(true, new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(awn.a aVar) {
        a(true, new Object[0]);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.b bVar) {
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
