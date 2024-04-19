package com.xiaopeng.musicradio.widget.lifecycle;

import android.os.Handler;
import android.os.Looper;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public abstract class BaseDealNetValidPresenter<UIInterface> extends BasePresenter<UIInterface> {
    private Runnable b;
    private Handler c = new Handler(Looper.getMainLooper());

    public void e() {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(androidx.lifecycle.i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (this.b == null) {
            this.b = new Runnable() { // from class: com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter.1
                @Override // java.lang.Runnable
                public void run() {
                    if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        BaseDealNetValidPresenter.this.e();
                    }
                }
            };
        }
        this.c.removeCallbacks(this.b);
        this.c.postDelayed(this.b, 2000L);
    }
}
