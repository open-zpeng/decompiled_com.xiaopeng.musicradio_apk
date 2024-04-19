package defpackage;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: TaskExecutor.java */
/* renamed from: vg  reason: default package */
/* loaded from: classes3.dex */
public class vg {
    public static vg a = null;
    private static ThreadPoolExecutor b = null;
    private static int c = 1;
    private static int d = 3;
    private static int e = 10;
    private static int f = 60;
    private static final AtomicInteger i = new AtomicInteger();
    private HandlerThread g = new HandlerThread("AppMonitor");
    private Handler h;

    static /* synthetic */ ThreadPoolExecutor c() {
        return d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TaskExecutor.java */
    /* renamed from: vg$a */
    /* loaded from: classes3.dex */
    public static class a implements ThreadFactory {
        private int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int andIncrement = vg.i.getAndIncrement();
            Thread thread = new Thread(runnable, "AppMonitor:" + andIncrement);
            thread.setPriority(this.a);
            return thread;
        }
    }

    @TargetApi(9)
    private static ThreadPoolExecutor a(int i2, int i3, int i4, int i5, int i6) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (i6 > 0) {
            linkedBlockingQueue = new LinkedBlockingQueue(i6);
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        return new ThreadPoolExecutor(i3, i4, i5, TimeUnit.SECONDS, linkedBlockingQueue, new a(i2), new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    private static synchronized ThreadPoolExecutor d() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (vg.class) {
            if (b == null) {
                b = a(c, d, e, f, IInputController.KEYCODE_KNOB_WIND_SPD_UP);
            }
            threadPoolExecutor = b;
        }
        return threadPoolExecutor;
    }

    public static synchronized vg a() {
        vg vgVar;
        synchronized (vg.class) {
            if (a == null) {
                a = new vg();
            }
            vgVar = a;
        }
        return vgVar;
    }

    private vg() {
        this.g.start();
        this.h = new Handler(this.g.getLooper()) { // from class: vg.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                try {
                    if (message.obj == null || !(message.obj instanceof Runnable)) {
                        return;
                    }
                    vg.c().submit((Runnable) message.obj);
                } catch (Throwable unused) {
                }
            }
        };
    }

    public final void a(int i2, Runnable runnable, long j) {
        try {
            Message obtain = Message.obtain(this.h, i2);
            obtain.obj = runnable;
            this.h.sendMessageDelayed(obtain, j);
        } catch (Exception e2) {
            ti.a(e2);
        }
    }

    public final void a(int i2) {
        this.h.removeMessages(i2);
    }

    public final boolean b(int i2) {
        return this.h.hasMessages(i2);
    }

    public void a(Runnable runnable) {
        try {
            d().submit(runnable);
        } catch (Throwable unused) {
        }
    }
}
