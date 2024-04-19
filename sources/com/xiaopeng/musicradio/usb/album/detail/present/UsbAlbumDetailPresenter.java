package com.xiaopeng.musicradio.usb.album.detail.present;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class UsbAlbumDetailPresenter extends BasePresenter<bao> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("UsbDirDetailPresenter", "onCreateView");
        u.a(this);
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
            a().u();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().w();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        if (a() != null) {
            a().s();
        }
    }
}
