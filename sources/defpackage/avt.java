package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaopeng.musicradio.utils.ay;
/* compiled from: PlayerThreadUtil.java */
/* renamed from: avt  reason: default package */
/* loaded from: classes2.dex */
public class avt {
    private static volatile Handler a;

    /* compiled from: PlayerThreadUtil.java */
    /* renamed from: avt$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final avt a = new avt();
    }

    public static avt a() {
        return a.a;
    }

    private Handler b() {
        if (a == null) {
            synchronized (ay.class) {
                if (a == null) {
                    HandlerThread handlerThread = new HandlerThread("PlayerThreadUtil");
                    handlerThread.start();
                    a = new Handler(handlerThread.getLooper());
                }
            }
        }
        return a;
    }

    public void a(Runnable runnable) {
        b().post(runnable);
    }
}
