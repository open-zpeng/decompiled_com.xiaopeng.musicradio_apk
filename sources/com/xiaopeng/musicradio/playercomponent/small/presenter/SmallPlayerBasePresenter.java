package com.xiaopeng.musicradio.playercomponent.small.presenter;

import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.utils.u;
import defpackage.afx;
import defpackage.age;
import defpackage.agg;
import defpackage.agn;
import defpackage.amx;
import defpackage.awb;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public abstract class SmallPlayerBasePresenter<UIInterface extends awb> extends BasePresenter<UIInterface> {
    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        g();
    }

    private void g() {
        Log.i("SmallPlayerBasePresente", "refresh: ========== ");
        c();
        d();
        e();
        h();
        a(true);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        u.b(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onApplicationBack(afx.a aVar) {
        Log.i("SmallPlayerBasePresente", "onApplicationBack: " + aVar.a());
        a(aVar.a() ^ true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSmallPlayerVisible(agn.a aVar) {
        Log.i("SmallPlayerBasePresente", "onSmallPlayerVisible:  ==============" + aVar.a());
        a(aVar.a());
    }

    private void a(boolean z) {
        Log.i("SmallPlayerBasePresente", "refreshVisible: smallshow====" + avx.a() + " getView = " + a() + " getPlayerShow " + avx.b() + " top = " + b.a(a.a) + " value = " + z + " isInbackground = " + com.xiaopeng.musicradio.utils.a.a().f());
        if (z && b.a(a.a) && !com.xiaopeng.musicradio.utils.a.a().f() && avx.a() && !avx.b()) {
            if (a() != 0) {
                ((awb) a()).a(true);
            }
        } else if (a() != 0) {
            ((awb) a()).a(false);
        }
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRefreshLogo(agg.w wVar) {
        Log.i("SmallPlayerBasePresente", "onRefreshLogo: " + wVar.a() + " getType = " + aei.a().c());
        if (wVar.a() == aei.a().c()) {
            d();
        }
    }

    public void d() {
        amx.a d = amx.a().d();
        Log.i("SmallPlayerBasePresente", "onRefreshLogo: =======");
        if (d == null || d.b() == null || d.b().isRecycled()) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(a.a.getResources(), d.b());
        if (a() != 0) {
            ((awb) a()).a(bitmapDrawable);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPosChange(age.m mVar) {
        e();
    }

    public void e() {
        aek e = aei.a().e();
        if (a() != 0) {
            if (e != null) {
                if (aei.a().c() != 2) {
                    if (a() != 0) {
                        ((awb) a()).a(e.getPosition(), e.getDuration(), e.getSecondPosition());
                        return;
                    }
                    return;
                }
                ((awb) a()).a(0, 0, 0);
                return;
            }
            ((awb) a()).a(0, 0, 0);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChange(age.l lVar) {
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioChange(agg.g gVar) {
        f();
        h();
        c();
    }

    private void h() {
        aek e = aei.a().e();
        if (e != null) {
            if (a() != 0) {
                ((awb) a()).a(e.getPlayState());
            }
        } else if (a() != 0) {
            ((awb) a()).b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChange(age.c cVar) {
        h();
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        Log.i("SmallPlayerBasePresente", "onIGChange: " + sVar.a());
        if (!sVar.a()) {
            if (a() != 0) {
                ((awb) a()).b();
                return;
            }
            return;
        }
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onThemeChange(afx.b bVar) {
        if (a() != 0) {
            ((awb) a()).h();
        }
    }
}
