package com.xiaopeng.musicradio.music.player.presenter;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.BaseInfo;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.view.g;
import com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agd;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import defpackage.avw;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicPlayerPresenter extends PlayerBasePresenter<g> {
    private atw b;

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        if (iVar != null) {
            c();
        }
    }

    public void c() {
        l();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    protected void d() {
        if (aei.a().c() == 0) {
            u();
        } else if (aei.a().c() == 2) {
            v();
        }
    }

    private void u() {
        MusicInfo d = apk.i().d();
        Log.i("MusicPlayerPresenter", "refreshMusic: ====== " + d);
        if (a() != 0) {
            boolean z = false;
            if (d != null) {
                ((g) a()).b(d.getSong(), d.getSinger());
                if (t()) {
                    ((g) a()).a(false, false);
                } else {
                    ((g) a()).a(apb.a().c(d), d.isEnableLove());
                }
                g gVar = (g) a();
                if (d.getIsShortListen().booleanValue() && !((bcu) c.a().b(bcu.class)).isXpVip() && !((bcu) c.a().b(bcu.class)).isMusicVip()) {
                    z = true;
                }
                gVar.b(z);
                return;
            }
            ((g) a()).b(false);
        }
    }

    public boolean e() {
        MusicInfo d = apk.i().d();
        return d != null && d.getMusicFrom() == 61;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onShortListenRefreshEvent(age.r rVar) {
        MusicInfo u;
        if (aei.a().c() != 0 || (u = apk.i().u()) == null || a() == 0) {
            return;
        }
        ((g) a()).b(u.getIsShortListen().booleanValue());
    }

    private void v() {
        BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
        if (d == null) {
            return;
        }
        MusicInfo a = l.c().a(d.getSong(), d.getSinger());
        if (a != null) {
            if (a() != 0) {
                ((g) a()).b(a.getSong(), a.getSinger());
                ((g) a()).a(apb.a().c(a), a.isEnableLove());
            }
        } else if (d != null && a() != 0) {
            ((g) a()).a(false, false);
            ((g) a()).b(d.getSong(), d.getSinger());
        }
        if (a() != 0) {
            ((g) a()).b(false);
        }
    }

    public boolean f() {
        MusicInfo a;
        BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
        if (d == null || (a = l.c().a(d.getSong(), d.getSinger())) == null) {
            return false;
        }
        return a.isEnableLove();
    }

    @Override // com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerBasePresenter
    public void g() {
        if (a() != 0) {
            ((g) a()).F_();
        }
    }

    public BaseInfo h() {
        aek e = aei.a().e();
        if (e != null) {
            return e.d();
        }
        return null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agq.l lVar) {
        BtMusicBean d;
        MusicInfo u = apk.i().u();
        if (aei.a().c() == 2 && (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) != null) {
            u = l.c().a(d.getSong(), d.getSinger());
        }
        if (a() != 0) {
            if ((aei.a().c() == 0 || aei.a().c() == 2) && u != null && TextUtils.equals(u.getHash(), lVar.a())) {
                ((g) a()).a(apb.a().c(u), true);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.k kVar) {
        if (a() != 0) {
            MusicInfo u = apk.i().u();
            if ((aei.a().c() == 0 || aei.a().c() == 2) && u != null) {
                if (TextUtils.equals(u.getHash(), kVar.a()) || kVar.a(u.getHash())) {
                    ((g) a()).a(apb.a().c(u), true);
                }
            }
        }
    }

    public void i() {
        MusicInfo a;
        BtMusicBean d;
        if (aei.a().c() == 0) {
            a = apk.i().u();
        } else {
            a = (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null) ? null : l.c().a(d.getSong(), d.getSinger());
        }
        if (a != null) {
            anc.a().b(a);
        } else if (aei.a().c() == 2) {
            ak.a(com.xiaopeng.musicradio.a.a, b.f.cannotcollect);
        }
    }

    public void j() {
        int k = k();
        if (k == 2) {
            a(4);
        } else if (k == 4) {
            a(3);
        } else {
            a(2);
        }
    }

    public void a(int i) {
        if (w() != null) {
            w().a(i);
        }
    }

    public int k() {
        if (w() != null) {
            return w().c();
        }
        return 2;
    }

    private aek w() {
        return aei.a().e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudio(agg.g gVar) {
        z_();
        l();
        if (a() != 0) {
            ((g) a()).l();
        }
        Log.i("MusicPlayerPresenter", "onChangeAudio: ==========");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onInfoChange(age.c cVar) {
        if (a() != 0) {
            ((g) a()).l();
        }
    }

    public void l() {
        int c = aei.a().c();
        if (c == 0 || c == 2) {
            if (a() != 0) {
                if (c == 0) {
                    ((g) a()).b_(true);
                    a(k());
                } else {
                    ((g) a()).b_(false);
                    a(2);
                    aek e = aei.a().e();
                    if (e != null && a() != 0) {
                        ((g) a()).b(e.getPlayState(), true);
                    }
                }
            }
        } else if (c == -1 && a() != 0) {
            ((g) a()).G_();
        }
        n();
    }

    public int m() {
        aek e = aei.a().e();
        if (e != null) {
            return e.getPlayState();
        }
        return -1;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void controlMode(age.a aVar) {
        n();
    }

    public void n() {
        if (a() != 0) {
            ((g) a()).a(k(), o());
        }
    }

    public boolean o() {
        return (w() == null || !w().enablePlayMode() || w().d() == null) ? false : true;
    }

    public boolean p() {
        return aei.a().c() == 2;
    }

    public boolean q() {
        return com.xiaopeng.musicradio.model.bluetooth.a.i().n();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealBtConnectState(agd.b bVar) {
        if (aei.a().c() != 2 || a() == 0) {
            return;
        }
        Log.i("MusicPlayerPresenter", "dealBtConnectState: " + bVar.a());
        ((g) a()).b_(false);
        if (!bVar.a()) {
            if (a() != 0) {
                ((g) a()).b(3, true);
                return;
            }
            return;
        }
        aek e = aei.a().e();
        if (e == null || a() == 0) {
            return;
        }
        ((g) a()).b(e.getPlayState(), true);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onBtPhoneMusicClose(agd.d dVar) {
        u.d(dVar);
        Log.i("MusicPlayerPresenter", "onBtPhoneMusicClose========= " + aei.a().c());
        if (a() == 0 || aei.a().c() != 2) {
            return;
        }
        l();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onListRefresh(age.d dVar) {
        Log.i("MusicPlayerPresenter", "onListRefresh: =======");
        l();
    }

    public boolean r() {
        return com.xiaopeng.musicradio.model.bluetooth.a.i().v();
    }

    public boolean s() {
        return apk.i().d() != null;
    }

    public boolean t() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            return d.getMusicFrom() == 61 || d.getMusicFrom() == 60 || d.getOldMusicFrom() == 61 || d.getOldMusicFrom() == 60 || au.a();
        }
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChange(age.l lVar) {
        Log.i("MusicPlayerPresenter", "onPlayStateChange========= " + aei.a().c());
        if (aei.a().c() != 2 || a() == 0) {
            return;
        }
        l();
        ((g) a()).b(lVar.a(), true);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onPlayerNav(avw.a aVar) {
        String a = aVar.a();
        Log.i("MusicPlayerPresenter", "onPlayerNav: " + a);
        if (TextUtils.equals(a, "lrc") && a() != 0) {
            ((g) a()).h();
            u.d(aVar);
        } else if (TextUtils.equals(a, "quality")) {
            MusicInfo d = apk.i().d();
            if (d != null) {
                if (this.b == null) {
                    this.b = new atw(com.xiaopeng.musicradio.utils.a.a().c());
                    this.b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.music.player.presenter.MusicPlayerPresenter.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            MusicPlayerPresenter.this.b = null;
                        }
                    });
                }
                this.b.a(d);
                if (!this.b.isShowing()) {
                    this.b.show();
                }
            }
            u.d(aVar);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.v vVar) {
        if (aei.a().c() != 0 || t() || a() == 0) {
            return;
        }
        ((g) a()).H_();
    }
}
