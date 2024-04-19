package com.xiaopeng.musicradio.music.player.presenter;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.blue.BtMusicBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.model.bluetooth.l;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.view.c;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.age;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: BtMusicSmallPlayerSubViewPresenter.java */
/* loaded from: classes.dex */
public class a extends e<c> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void f_() {
        super.f_();
        u.a(this);
        x_();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void g_() {
        super.g_();
        u.b(this);
    }

    public void d() {
        BtMusicBean d;
        MusicInfo a = (aei.a().c() != 2 || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null) ? null : l.c().a(d.getSong(), d.getSinger());
        if (a != null) {
            anc.a().b(a);
        } else if (aei.a().c() == 2) {
            ak.a(com.xiaopeng.musicradio.a.a, b.f.cannotcollect);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDownloadMusic(agq.k kVar) {
        BtMusicBean d;
        MusicInfo a;
        c j = j();
        if (j == null || (d = com.xiaopeng.musicradio.model.bluetooth.a.i().d()) == null || (a = l.c().a(d.getSong(), d.getSinger())) == null) {
            return;
        }
        if (TextUtils.equals(a.getHash(), kVar.a()) || kVar.a(a.getHash())) {
            j.updateLove(apb.a().c(a), a.isEnableLove());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agq.l lVar) {
        BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
        if (d == null) {
            return;
        }
        MusicInfo a = l.c().a(d.getSong(), d.getSinger());
        if (a != null) {
            if (j() != null) {
                j().updateLove(apb.a().c(a), a.isEnableLove());
            }
        } else if (d == null || j() == null) {
        } else {
            j().updateLove(false, false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioInfo(age.c cVar) {
        x_();
    }

    public void x_() {
        aek e = aei.a().e();
        if (e == null || e.d() == null) {
            return;
        }
        h();
    }

    private void h() {
        BtMusicBean d = com.xiaopeng.musicradio.model.bluetooth.a.i().d();
        if (d == null) {
            return;
        }
        MusicInfo a = l.c().a(d.getSong(), d.getSinger());
        if (a != null) {
            if (j() != null) {
                j().updateLove(apb.a().c(a), a.isEnableLove());
            }
        } else if (d == null || j() == null) {
        } else {
            j().updateLove(false, false);
        }
    }
}
