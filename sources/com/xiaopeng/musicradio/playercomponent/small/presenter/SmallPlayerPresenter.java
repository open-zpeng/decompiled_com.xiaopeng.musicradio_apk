package com.xiaopeng.musicradio.playercomponent.small.presenter;

import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.i;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SmallPlayerPresenter extends SmallPlayerBasePresenter<avz> {
    @Override // com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerBasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("SmallPlayerPresenter", "onCreate: ==========");
        f();
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void a(avz avzVar) {
        super.a((SmallPlayerPresenter) avzVar);
        Log.i("SmallPlayerPresenter", "attachView: ========");
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerBasePresenter
    public void c() {
        Pair<String, String> a;
        super.c();
        avz avzVar = (avz) a();
        if (avzVar != null) {
            awa a2 = avy.a().a(aei.a().c());
            if (a2 != null && (a = a2.a()) != null) {
                f();
                avzVar.b((String) a.first, (String) a.second);
                return;
            }
            avzVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.playercomponent.small.presenter.SmallPlayerBasePresenter
    public void f() {
        super.f();
        Log.i("SmallPlayerPresenter", "refreshType: ========= " + aei.a().c());
        if (a() != 0) {
            ((avz) a()).b(aei.a().c());
        }
    }

    public void g() {
        aek e = aei.a().e();
        if (e != null) {
            if (e.getPlayState() == 2) {
                e.pause();
            } else {
                e.play();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadReloadAlbum(agq.p pVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadStatusUpdate(agq.q qVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingUnbinded(agq.s sVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingBinded(agq.r rVar) {
        c();
    }
}
