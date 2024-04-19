package com.xiaopeng.speech.common.util;

import android.os.Handler;
import android.os.Looper;
/* compiled from: WorkerHandler.java */
/* loaded from: classes2.dex */
public class e extends Handler {
    public e(Looper looper) {
        super(looper);
    }

    public void a(Runnable runnable) {
        if (getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            super.post(runnable);
        }
    }

    public void a(Runnable runnable, long j) {
        if (getLooper() == Looper.myLooper() && j == 0) {
            runnable.run();
        } else {
            super.postDelayed(runnable, j);
        }
    }
}
