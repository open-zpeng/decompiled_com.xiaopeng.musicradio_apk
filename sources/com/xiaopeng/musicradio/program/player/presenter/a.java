package com.xiaopeng.musicradio.program.player.presenter;

import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.program.player.view.c;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.age;
import defpackage.agq;
import defpackage.awn;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramSmallPlayerSubViewPresenter.java */
/* loaded from: classes2.dex */
public class a extends e<c> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void f_() {
        super.f_();
        u.a(this);
        i();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void g_() {
        super.g_();
        u.b(this);
    }

    public void h() {
        ProgramBean r = axn.i().r();
        if (r == null) {
            return;
        }
        axh.a().a(aq.a(r), r.getCardId() > 0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadLove(agq.o oVar) {
        ProgramBean r = axn.i().r();
        if (j() == null || r == null) {
            return;
        }
        if (oVar.a() == (r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId())) {
            j().updateLove(oVar.b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDownloadProgram(awn.a aVar) {
        ProgramBean r = axn.i().r();
        if (j() == null || r == null) {
            return;
        }
        j().updateLove(axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealClearProgramData(agq.b bVar) {
        ProgramBean r = axn.i().r();
        if (j() == null || r == null) {
            return;
        }
        j().updateLove(axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioInfo(age.c cVar) {
        i();
    }

    public void i() {
        aek e = aei.a().e();
        if (e == null || e.d() == null) {
            return;
        }
        o();
    }

    private void o() {
        ProgramBean r = axn.i().r();
        if (r == null || j() == null) {
            return;
        }
        j().updateLove(axj.a().c(r.getOriginalAlbumId() > 0 ? r.getOriginalAlbumId() : r.getAlbumId()));
    }
}
