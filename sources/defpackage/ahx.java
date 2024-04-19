package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import defpackage.ark;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: AlbumDataDirtyModel.java */
/* renamed from: ahx  reason: default package */
/* loaded from: classes2.dex */
public class ahx extends a {
    private boolean d;

    public ahx(boolean z) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.a aVar) {
        LogUtils.i("AlbumDataDirtyModel", "onEvent:" + aVar);
        if (aVar.a()) {
            a(true, new Object[0]);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.f fVar) {
        a(true, false, new Object[0]);
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
