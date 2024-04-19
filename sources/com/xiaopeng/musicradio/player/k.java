package com.xiaopeng.musicradio.player;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaopeng.lib.utils.LogUtils;
/* compiled from: PlayerActionHelper.java */
/* loaded from: classes2.dex */
public class k {
    private Handler a;

    /* compiled from: PlayerActionHelper.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public k() {
        HandlerThread handlerThread = new HandlerThread("PlayerActionHelper");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public void a(final a aVar) {
        this.a.post(new Runnable() { // from class: com.xiaopeng.musicradio.player.k.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    aVar.a();
                } catch (Exception e) {
                    LogUtils.e("PlayerActionHelper", e);
                }
            }
        });
    }
}
