package com.xiaopeng.musicradio.playercomponent.big.presenter;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.model.dui.h;
import com.xiaopeng.musicradio.playercomponent.big.view.d;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.avp;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PlayerSharePresenter extends BasePresenter<d> implements bfm {
    private Message b;
    private boolean c = false;
    private String d = "";
    private final Handler e = new Handler(Looper.getMainLooper()) { // from class: com.xiaopeng.musicradio.playercomponent.big.presenter.PlayerSharePresenter.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                if (PlayerSharePresenter.this.a() != null) {
                    PlayerSharePresenter.this.a().b();
                }
            } else if (message.what != 1 || PlayerSharePresenter.this.a() == null) {
            } else {
                PlayerSharePresenter.this.a().d();
                PlayerSharePresenter.this.a().a();
            }
        }
    };

    @Override // defpackage.bfm
    public void a(int i, int i2, int i3, String str, byte[] bArr) {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void a(d dVar) {
        super.a((PlayerSharePresenter) dVar);
        u.a(this);
    }

    public void c() {
        if (this.c) {
            e();
            h();
        } else if (ags.a().g()) {
            e();
            ak.a(a.a, avp.d.in_call_fail);
        } else if (i()) {
            j();
        } else {
            Log.i("PlayerSharePresenter", "innerRecord: ");
            this.c = true;
            if (a() != null) {
                a().c();
                a().b();
                this.d = a().getEditTextContent();
                a().e();
            }
            g();
        }
    }

    @Override // defpackage.bfm
    public void a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String string = new JSONObject(str).getString("text");
            if (a() == null || string == null) {
                return;
            }
            String replaceAll = string.replaceAll(" ", "");
            if (z) {
                LogUtils.i("PlayerSharePresenter", "Final text is " + replaceAll);
                this.d += replaceAll;
                if (this.d.length() >= 100) {
                    this.d = this.d.substring(0, 100);
                }
                a().a(this.d);
                return;
            }
            String str2 = this.d + replaceAll;
            if (str2.length() < 100) {
                a().a(str2);
            } else {
                h();
            }
            LogUtils.i("PlayerSharePresenter", "Instance return text is " + replaceAll);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.bfm
    public void a(int i, String str) {
        e();
        h();
    }

    @Override // defpackage.bfm
    public void a(int i, int i2) {
        Log.i("PlayerSharePresenter", "onState: " + i);
        if (i != 3) {
            if (i == 6 && this.c) {
                g();
                return;
            }
            return;
        }
        e();
        h();
    }

    public void d() {
        if (this.c) {
            this.d = "";
        }
    }

    public void e() {
        this.b = Message.obtain();
        Message message = this.b;
        message.what = 1;
        this.e.sendMessage(message);
    }

    public void f() {
        bhy.a().b();
    }

    public void g() {
        bhy.a().a(this);
    }

    public void h() {
        this.c = false;
        Log.d("PlayerSharePresenter", "stop");
        bhy.a().c();
    }

    public boolean i() {
        return bfb.b().g().m();
    }

    private void j() {
        Intent intent = new Intent();
        intent.setAction("com.xiaopeng.carcontrol.intent.action.ACTION_SHOW_MICROPHONE_UNMUTE_DIALOG");
        intent.setPackage("com.xiaopeng.carcontrol");
        intent.addFlags(32);
        a.a.sendBroadcast(intent);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() == null || !h.a().c()) {
            return;
        }
        h();
        e();
    }
}
