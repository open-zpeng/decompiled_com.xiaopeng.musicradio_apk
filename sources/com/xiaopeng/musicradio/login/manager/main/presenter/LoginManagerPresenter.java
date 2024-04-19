package com.xiaopeng.musicradio.login.manager.main.presenter;

import androidx.lifecycle.i;
import com.google.android.exoplayer2.ext.cornet.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class LoginManagerPresenter extends BasePresenter<ahi> {
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
        bcv bcvVar;
        bct bctVar;
        super.onResume(iVar);
        if (apx.a().d() && (bctVar = (bct) c.a().b(bct.class)) != null) {
            bctVar.fetchUserInfo();
        }
        if (!aqf.a().e() || (bcvVar = (bcv) c.a().b(bcv.class)) == null) {
            return;
        }
        bcvVar.fetchUserInfo();
    }

    public void c() {
        d();
        e();
    }

    public void d() {
        if (a() != null) {
            a().a_(apx.a().d());
        }
    }

    public void e() {
        if (a() != null) {
            a().b(aqf.a().e());
        }
    }

    public void f() {
        ahi a = a();
        if (a != null) {
            boolean d = aqh.a().d();
            bct bctVar = (bct) c.a().b(bct.class);
            String nickName = (!d || bctVar == null) ? null : bctVar.getNickName();
            String userLogo = (!d || bctVar == null) ? null : bctVar.getUserLogo();
            boolean z = false;
            boolean isVip = (!d || bctVar == null) ? false : bctVar.isVip();
            if (d && bctVar != null) {
                z = bctVar.isGreenVip();
            }
            a.a(nickName, userLogo, isVip, z, (d && isVip && bctVar != null) ? bctVar.getVipEndTime() : null, bctVar.getVipDetial());
            Log.i("LoginManagerPresenter", "getAccountInfo:nickName=" + nickName);
        }
    }

    public void g() {
        ((aqs) apx.a().b()).a(new aqt() { // from class: com.xiaopeng.musicradio.login.manager.main.presenter.LoginManagerPresenter.1
            @Override // defpackage.aqt
            public void a() {
                LogUtils.d("LoginManagerPresenter", "onLogout");
            }
        });
    }

    public void h() {
        ahi a = a();
        if (a != null) {
            boolean e = aqh.a().e();
            bcv bcvVar = (bcv) c.a().b(bcv.class);
            String str = null;
            String nickName = (!e || bcvVar == null) ? null : bcvVar.getNickName();
            String userLogo = (!e || bcvVar == null) ? null : bcvVar.getUserLogo();
            boolean z = false;
            if (e && bcvVar != null) {
                z = bcvVar.isVip();
            }
            if (e && z && bcvVar != null) {
                str = bcvVar.getVipEndTime();
            }
            a.a(nickName, userLogo, z, str);
            Log.i("LoginManagerPresenter", "getXmlyAccountInfo:nickName=" + nickName);
        }
    }

    public void i() {
        ((aqu) aqf.a().b()).a(new aqa() { // from class: com.xiaopeng.musicradio.login.manager.main.presenter.LoginManagerPresenter.2
            @Override // defpackage.aqa
            public void a(boolean z) {
                LogUtils.d("LoginManagerPresenter", "logoutXmly:onLogout");
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.g gVar) {
        LogUtils.i("LoginManagerPresenter", "MusicBinded");
        if (a() != null) {
            d();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.m mVar) {
        LogUtils.i("LoginManagerPresenter", "MusicUnBinded");
        if (a() != null) {
            d();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.r rVar) {
        LogUtils.i("LoginManagerPresenter", "ReadingBinded");
        if (a() != null) {
            e();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.s sVar) {
        LogUtils.i("LoginManagerPresenter", "ReadingUnBinded");
        if (a() != null) {
            e();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.ai aiVar) {
        LogUtils.d("LoginManagerPresenter", "UserVipInfo");
        if (a() != null) {
            f();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.u uVar) {
        LogUtils.d("LoginManagerPresenter", "ReadingVipInfo");
        if (a() != null) {
            h();
        }
    }
}
