package com.xiaopeng.musicradio.music.usb.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MsUsbDetailPresenter extends MsMusicDetailPresenter {
    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter
    public void c() {
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MsMusicDetailPresenter, com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsUsbDetailPresenter", "onCreate");
        if (iVar != null) {
            if (a() != null) {
                a().r_();
            }
            j();
        }
    }

    public void j() {
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.music.usb.presenter.MsUsbDetailPresenter.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicClear(agg.ae.e eVar) {
        if (a() != null) {
            a().b("");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicTimeoutCatch(agg.ae.f fVar) {
        if (a() != null) {
            a().b("");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicAdded(agg.ae.d dVar) {
        if (a() != null) {
            a().r_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicMounted(agg.ae.c cVar) {
        c();
    }
}
