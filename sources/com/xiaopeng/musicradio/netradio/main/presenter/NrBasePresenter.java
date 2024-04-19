package com.xiaopeng.musicradio.netradio.main.presenter;

import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public abstract class NrBasePresenter<UIInterface> extends BaseDealNetValidPresenter<UIInterface> {
    private boolean b = false;

    public void a(boolean z) {
    }

    public void c() {
    }

    public void f() {
    }

    public void g() {
        h();
        if (a() != null) {
            a(this.b);
        }
    }

    public void h() {
        if (aei.a().c() == 6) {
            NetRadioProgramInfo d = aps.i().d();
            if ((d != null ? d.getParentInfo() : null) != null) {
                if (this.b) {
                    return;
                }
                this.b = true;
                return;
            }
            this.b = false;
            return;
        }
        this.b = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.b || a() == null) {
            return;
        }
        a(this.b);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        g();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        g();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        f();
    }
}
