package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.xiaopeng.lib.utils.LogUtils;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ThreadExecutorProxy.java */
/* renamed from: ban  reason: default package */
/* loaded from: classes2.dex */
public class ban {
    private static ThreadPoolExecutor a;
    private static ThreadPoolExecutor b;
    private static boolean c;
    private static Handler d;
    private static Scheduler e;
    private static Handler f;
    private static Scheduler g;
    private static Handler h;
    private static MessageQueue i;

    public static void a() {
        if (c) {
            return;
        }
        b = (ThreadPoolExecutor) Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: ban.1
            private final AtomicInteger a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName(String.format("radio_music_inflate_thread_%d", Integer.valueOf(this.a.getAndIncrement())));
                return thread;
            }
        });
        a = (ThreadPoolExecutor) Executors.newCachedThreadPool(new ThreadFactory() { // from class: ban.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "ThreadExecutorProxy");
                thread.setPriority(1);
                return thread;
            }
        });
        HandlerThread handlerThread = new HandlerThread("radio_music-single-async-thread");
        handlerThread.start();
        d = new Handler(handlerThread.getLooper());
        e = AndroidSchedulers.from(d.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("radio_music-db-worker-thread");
        handlerThread2.start();
        f = new Handler(handlerThread2.getLooper());
        g = AndroidSchedulers.from(f.getLooper());
        h = new Handler(Looper.getMainLooper());
        i = Looper.myQueue();
        c = true;
    }

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        a.remove(runnable);
        d.removeCallbacks(runnable);
        h.removeCallbacks(runnable);
    }

    public static void c(Runnable runnable) {
        b.execute(runnable);
    }

    public static void d(Runnable runnable) {
        d.post(runnable);
    }

    public static void a(Runnable runnable, long j) {
        d.postDelayed(runnable, j);
    }

    public static Disposable e(Runnable runnable) {
        return Flowable.just(runnable).observeOn(g).subscribe(new Consumer<Runnable>() { // from class: ban.3
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Runnable runnable2) {
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    LogUtils.e("ThreadExecutorProxy", "runOnDbWorker", th);
                }
            }
        });
    }

    public static Disposable f(Runnable runnable) {
        return e(runnable);
    }

    public static void g(Runnable runnable) {
        h.post(runnable);
    }

    public static void b(Runnable runnable, long j) {
        h.postDelayed(runnable, j);
    }

    public static void h(Runnable runnable) {
        h.removeCallbacks(runnable);
    }

    public static void i(final Runnable runnable) {
        i.addIdleHandler(new MessageQueue.IdleHandler() { // from class: ban.4
            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                runnable.run();
                return false;
            }
        });
    }

    public static void j(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            g(runnable);
        }
    }
}
