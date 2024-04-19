package com.xiaopeng.musicradio.usb.main.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.usb.main.view.a;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class UsbMainPresenter extends BasePresenter<a> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("UsbMainPresenter", "onCreateView");
        u.a(this);
        int e = bbh.a().e();
        if (e == 2) {
            if (a() != null) {
                a().au_();
            }
        } else if (e == 3) {
            if (a() != null) {
                a().b();
            }
        } else if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicReleased(agg.ae.e eVar) {
        if (a() != null) {
            a().b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoading(agg.ae.d dVar) {
        if (a() != null) {
            a().a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUsbMusicLoaded(agg.ae.c cVar) {
        if (a() != null) {
            a().au_();
        }
    }
}
