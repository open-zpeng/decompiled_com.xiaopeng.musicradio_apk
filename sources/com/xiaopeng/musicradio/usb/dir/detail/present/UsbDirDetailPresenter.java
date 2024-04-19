package com.xiaopeng.musicradio.usb.dir.detail.present;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class UsbDirDetailPresenter extends BasePresenter<bbc> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("UsbDirDetailPresenter", "onCreateView");
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        if (a() != null) {
            a().q();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealUpdateSongLogo(agg.ad adVar) {
        if (a() != null) {
            a().s();
        }
    }
}
