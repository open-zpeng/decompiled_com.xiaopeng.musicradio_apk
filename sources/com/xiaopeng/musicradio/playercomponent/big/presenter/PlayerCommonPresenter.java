package com.xiaopeng.musicradio.playercomponent.big.presenter;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.model.bluetooth.a;
import com.xiaopeng.musicradio.playercomponent.big.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.amx;
import defpackage.avw;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class PlayerCommonPresenter extends BasePresenter<c> {
    private boolean b = false;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("PlayerBasePresenter", "onCreate: ======");
        u.a(this);
        g();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onPause(i iVar) {
        super.onPause(iVar);
        this.b = false;
        if (a() != null) {
            a().h();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        this.b = true;
        i();
        if (a() == null || !f()) {
            return;
        }
        a().i();
    }

    private void g() {
        j();
        i();
        k();
        h();
    }

    private void h() {
        if (aei.a().c() != -1 || a() == null) {
            return;
        }
        a().a(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        Log.i("PlayerBasePresenter", "onDestroy: =================");
    }

    public void c() {
        Log.i("PlayerBasePresenter", "pre: " + aei.a().c());
        aei.a().h();
    }

    public void d() {
        Log.i("PlayerBasePresenter", "pre: " + aei.a().c());
        aei.a().i();
    }

    public void e() {
        Log.i("PlayerBasePresenter", "pre: " + aei.a().c());
        aek e = aei.a().e();
        if (e != null) {
            if (e.getPlayState() == 2 || e.getPlayState() == 1) {
                e.pause();
            } else {
                e.play();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudio(agg.g gVar) {
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioPos(age.m mVar) {
        if (this.b) {
            i();
        }
    }

    private void i() {
        aek e = aei.a().e();
        if (a() != null) {
            if (e != null) {
                if (aei.a().c() != 2) {
                    a().a(e.getPosition(), e.getDuration(), e.getSecondPosition());
                    return;
                } else {
                    a().a(0, 0, 0);
                    return;
                }
            }
            a().a(0, 0, 0);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefreshLogo(agg.w wVar) {
        Log.i("PlayerBasePresenter", "onRefreshLogo: " + wVar.a() + " getType = " + aei.a().c());
        if (wVar.a() == aei.a().c()) {
            j();
        }
    }

    private void j() {
        if (aei.a().c() == 2 && a.i().v()) {
            Log.i("PlayerBasePresenter", "onRefreshLogo: =======, bt audio && music phone close");
            if (a() != null) {
                a().a(f.e.pic_defaultcover_380_music);
                return;
            }
            return;
        }
        amx.a d = amx.a().d();
        Log.i("PlayerBasePresenter", "onRefreshLogo: =======" + d);
        if (d == null || d.b() == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(com.xiaopeng.musicradio.a.a.getResources(), d.b());
        if (a() != null) {
            a().a(bitmapDrawable);
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onBtPhoneMusicClose(agd.d dVar) {
        u.d(dVar);
        Log.i("PlayerBasePresenter", "onBtPhoneMusicClose========= " + aei.a().c());
        if (a() == null || aei.a().c() != 2) {
            return;
        }
        j();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioState(age.l lVar) {
        k();
        l();
    }

    private void k() {
        aek e;
        if (a() == null || (e = aei.a().e()) == null) {
            return;
        }
        a().b(e.getPlayState());
    }

    public void a(int i) {
        aek e = aei.a().e();
        if (e != null) {
            e.seekTo(i);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChange(age.c cVar) {
        l();
    }

    private void l() {
        if (this.b) {
            aek e = aei.a().e();
            if (e == null || e.d() == null) {
                if (a() != null) {
                    a().b(false);
                    return;
                }
                return;
            }
            if (a() != null) {
                a().b(true);
            }
            if (a() != null) {
                if (f()) {
                    a().i();
                } else {
                    a().h();
                }
            }
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onPlayerNav(avw.a aVar) {
        String a = aVar.a();
        Log.i("PlayerBasePresenter", "onPlayerNav: " + a);
        if (!TextUtils.equals(a, "playlist") || a() == null) {
            return;
        }
        a().V_();
        u.d(aVar);
    }

    public boolean f() {
        aek e = aei.a().e();
        if (e != null) {
            return e.getPlayState() == 1 || e.getPlayState() == 2;
        }
        return false;
    }
}
