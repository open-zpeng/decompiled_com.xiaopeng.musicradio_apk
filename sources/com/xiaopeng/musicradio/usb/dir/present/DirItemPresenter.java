package com.xiaopeng.musicradio.usb.dir.present;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.usb.dir.view.b;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class DirItemPresenter extends BasePresenter<b> {
    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRmItemPresenter", "onCreateView");
        u.a(this);
        if (a() != null) {
            a().f();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (a() != null) {
            a().f();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        if (a() != null) {
            a().f();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChangeEvent(agg.y yVar) {
        if (a() != null) {
            a().g();
        }
    }
}
