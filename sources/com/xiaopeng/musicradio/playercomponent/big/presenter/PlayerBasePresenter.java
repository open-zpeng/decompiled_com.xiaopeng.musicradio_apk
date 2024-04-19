package com.xiaopeng.musicradio.playercomponent.big.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.b;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public abstract class PlayerBasePresenter<T extends b> extends BasePresenter<T> {
    protected abstract void d();

    protected abstract void g();

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        if (iVar != null) {
            z_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioInfo(age.c cVar) {
        z_();
    }

    public void z_() {
        aek e = aei.a().e();
        if (e != null) {
            if (e.d() != null) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        g();
    }
}
