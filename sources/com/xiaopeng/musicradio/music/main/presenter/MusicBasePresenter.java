package com.xiaopeng.musicradio.music.main.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public abstract class MusicBasePresenter<UIInterface> extends BaseDealNetValidPresenter<UIInterface> {
    protected boolean b = false;
    private boolean c = false;

    public boolean a(String str) {
        return false;
    }

    public void c() {
    }

    public void f() {
    }

    public void h() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicAuth(agq.h hVar) {
        if (hVar.b() || a() == null) {
            return;
        }
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMusicBinded(agq.g gVar) {
        h();
    }

    public void j() {
        k();
        c();
    }

    public void k() {
        int c = aei.a().c();
        String x = apk.i().x();
        if (!TextUtils.isEmpty(x) && c == 0) {
            this.b = a(x);
        } else {
            this.b = false;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (this.b) {
            c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicInfo(age.c cVar) {
        j();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        f();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveLogout(agq.v vVar) {
        if (b.a(a.a)) {
            axu.a();
        } else {
            this.c = true;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (this.c) {
            this.c = false;
            axu.a();
        }
    }
}
