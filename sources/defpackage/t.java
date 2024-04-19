package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: ThreadUtils.java */
/* renamed from: t  reason: default package */
/* loaded from: classes3.dex */
public class t {
    protected static Handler a = new Handler(Looper.getMainLooper());
    private static HandlerThread b = new HandlerThread("lib_anim_webpWorker");
    private static Handler c;

    static {
        b.start();
        c = new Handler(b.getLooper());
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            c.post(runnable);
        }
    }

    public static void b(Runnable runnable) {
        if (runnable != null) {
            c.removeCallbacks(runnable);
        }
    }

    public static void c(Runnable runnable) {
        if (runnable != null) {
            a.post(runnable);
        }
    }
}
