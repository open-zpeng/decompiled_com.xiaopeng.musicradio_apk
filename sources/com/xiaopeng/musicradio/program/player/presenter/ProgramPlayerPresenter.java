package com.xiaopeng.musicradio.program.player.presenter;

import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter;
import com.xiaopeng.musicradio.program.player.view.b;
import com.xiaopeng.musicradio.utils.aq;
import defpackage.afx;
import defpackage.age;
import defpackage.agq;
import defpackage.awn;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ProgramPlayerPresenter extends PlayerBasePresenter<b> {
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadLove(agq.o oVar) {
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetReadLove(awn.a aVar) {
        e();
    }

    public void e() {
        ProgramBean r = axn.i().r();
        if (a() == 0 || r == null) {
            return;
        }
        ((b) a()).f_(axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId()));
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    protected void d() {
        ProgramBean r = axn.i().r();
        if (r != null && a() != 0) {
            ((b) a()).b(r.getTitle(), r.getAlbumName());
            ((b) a()).f_(axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId()));
            ((b) a()).a(r.getPaymentType(), r.isAuthorized());
        }
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onThemeChanged(afx.b bVar) {
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadStatusUpdate(agq.q qVar) {
        ProgramBean r = axn.i().r();
        if (r == null || r.getTrackId() != qVar.a()) {
            return;
        }
        r.setAuthorized(qVar.c());
        r.setPaymentType(qVar.b());
        d();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChange(age.c cVar) {
        if (a() != 0) {
            ((b) a()).a();
        }
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    protected void g() {
        if (a() != 0) {
            ((b) a()).F_();
        }
    }

    public void a(float f) {
        axn.i().a(f);
    }

    public float f() {
        return axl.a().e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealProgramSpeed(age.n nVar) {
        h();
    }

    public void h() {
        if (a() != 0) {
            ((b) a()).a(f());
        }
    }

    public void i() {
        ProgramBean r = axn.i().r();
        if (r == null) {
            return;
        }
        axh.a().a(aq.a(r), r.getCardId() > 0);
    }

    public void j() {
        float f = f();
        if (f == 1.0f) {
            a(1.25f);
        } else if (f == 1.25f) {
            a(1.5f);
        } else if (f == 1.5f) {
            a(2.0f);
        } else if (f == 2.0f) {
            a(1.0f);
        }
    }

    public boolean k() {
        ProgramBean r = axn.i().r();
        return (r == null || r.getCardId() <= 0) && r != null;
    }
}
