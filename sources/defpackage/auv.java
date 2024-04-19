package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
/* compiled from: ReqThreadUtil.java */
/* renamed from: auv  reason: default package */
/* loaded from: classes2.dex */
public class auv {
    private static Handler a;

    static {
        HandlerThread handlerThread = new HandlerThread("req_single_thread");
        handlerThread.start();
        a = new Handler(handlerThread.getLooper());
    }

    public static void a(Runnable runnable) {
        a.post(runnable);
    }
}
