package com.xiaopeng.musicradio.playercomponent.big.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.playercomponent.big.view.e;
import com.xiaopeng.musicradio.playercomponent.small.SmallPlayerService;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agn;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class PlayerPresenter extends BasePresenter<e> {
    private boolean b = false;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStart(i iVar) {
        super.onStart(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        Log.i("PlayerPresenter", "onResume: =========");
        avx.b(true);
        u.f(new agn.a(false));
        c();
        this.b = true;
        e();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onPause(i iVar) {
        super.onPause(iVar);
        this.b = false;
        avx.b(false);
        if (a() != null) {
            a().U_();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onStop(i iVar) {
        super.onStop(iVar);
        SmallPlayerService.a();
        u.c(new agn.a(true));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioChange(agg.g gVar) {
        c();
    }

    public void c() {
        if (a() != null) {
            a().a(aei.a().c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChange(age.c cVar) {
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void OnPlayStateChange(age.l lVar) {
        e();
    }

    private void e() {
        if (this.b) {
            aek e = aei.a().e();
            if (e == null || e.d() == null) {
                if (a() != null) {
                    a().a(false);
                    return;
                }
                return;
            }
            if (a() != null) {
                a().a(true);
            }
            if (a() != null) {
                if (d()) {
                    a().h();
                } else {
                    a().U_();
                }
            }
        }
    }

    public boolean d() {
        aek e = aei.a().e();
        if (e != null) {
            return e.getPlayState() == 1 || e.getPlayState() == 2;
        }
        return false;
    }
}
