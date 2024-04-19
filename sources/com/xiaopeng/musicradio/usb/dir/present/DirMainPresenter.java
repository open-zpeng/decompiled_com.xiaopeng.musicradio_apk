package com.xiaopeng.musicradio.usb.dir.present;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.usb.dir.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class DirMainPresenter extends BasePresenter<c> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("DirMainPresenter", "onCreateView");
        u.a(this);
        int e = bbh.a().e();
        if (e == 2) {
            c();
        } else if (e != 3 || a() == null) {
        } else {
            a().s();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        if (a() != null) {
            a().s();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoading(agg.ae.d dVar) {
        if (a() != null) {
            a().r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoaded(agg.ae.c cVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().t();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().t();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUpdateSongLogo(agg.ad adVar) {
        if (a() != null) {
            a().v();
        }
    }

    private void c() {
        if (a() == null || bbh.a().e() != 2) {
            return;
        }
        bay g = bbh.a().g();
        if (g.b().size() > 0 || g.a().size() > 0) {
            a().a(g);
        } else {
            a().s();
        }
    }
}
