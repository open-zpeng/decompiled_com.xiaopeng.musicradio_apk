package com.xiaopeng.musicradio.music.player.presenter;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.music.player.view.h;
import com.xiaopeng.musicradio.utils.au;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import defpackage.age;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicSmallPlayerSubViewPresenter.java */
/* loaded from: classes.dex */
public class b extends e<h> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void f_() {
        super.f_();
        u.a(this);
        A_();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.e
    public void g_() {
        super.g_();
        u.b(this);
    }

    public void d() {
        MusicInfo u = apk.i().u();
        if (u != null) {
            anc.a().b(u);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveEvent(agq.l lVar) {
        MusicInfo u = apk.i().u();
        if (j() == null || aei.a().c() != 0 || u == null || !TextUtils.equals(u.getHash(), lVar.a())) {
            return;
        }
        j().updateLove(apb.a().c(u), u.isEnableLove());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.k kVar) {
        if (j() != null) {
            MusicInfo u = apk.i().u();
            if (aei.a().c() != 0 || u == null) {
                return;
            }
            if (TextUtils.equals(u.getHash(), kVar.a()) || kVar.a(u.getHash())) {
                j().updateLove(apb.a().c(u), true);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAudioInfo(age.c cVar) {
        A_();
    }

    public void A_() {
        aek e = aei.a().e();
        if (e == null || e.d() == null) {
            return;
        }
        h();
    }

    public boolean f() {
        MusicInfo d = apk.i().d();
        if (d != null) {
            return d.getMusicFrom() == 61 || d.getMusicFrom() == 60 || d.getOldMusicFrom() == 61 || d.getOldMusicFrom() == 60 || au.a();
        }
        return false;
    }

    private void h() {
        MusicInfo d = apk.i().d();
        if (j() == null || d == null) {
            return;
        }
        if (f()) {
            j().updateLove(false, false);
        } else {
            j().updateLove(apb.a().c(d), d.isEnableLove());
        }
    }
}
