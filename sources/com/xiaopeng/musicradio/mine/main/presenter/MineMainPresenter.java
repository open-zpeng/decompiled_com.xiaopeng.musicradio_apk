package com.xiaopeng.musicradio.mine.main.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.mine.common.presenter.MineBasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agh;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MineMainPresenter extends MineBasePresenter<alh> {
    private ald b = new alf();

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (!b() || a() == null) {
            return;
        }
        a().a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.ai aiVar) {
        if (!c() || a() == null) {
            return;
        }
        a().a();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.h hVar) {
        if (!c() || a() == null) {
            return;
        }
        a().a();
    }

    public Integer a(agh.b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.b()) || bVar.a() != 3) {
            return null;
        }
        return this.b.a(bVar.b());
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onSwitchTab(agh.b bVar) {
        final Integer a;
        if (TextUtils.isEmpty(bVar.b()) || bVar.a() != 3 || (a = this.b.a(bVar.b())) == null) {
            return;
        }
        u.d(bVar);
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.main.presenter.MineMainPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                if (MineMainPresenter.this.a() != null) {
                    MineMainPresenter.this.a().d_(a.intValue());
                }
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGotoLogin(ahv ahvVar) {
        alh a = a();
        Integer a2 = this.b.a("manager");
        if (a == null || a2 == null) {
            return;
        }
        a.d_(a2.intValue());
    }
}
