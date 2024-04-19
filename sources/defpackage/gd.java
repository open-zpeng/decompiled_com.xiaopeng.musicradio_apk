package defpackage;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestExecutor.java */
/* renamed from: gd  reason: default package */
/* loaded from: classes3.dex */
class gd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(Executor executor, Callable<T> callable, gk<T> gkVar) {
        executor.execute(new b(fy.a(), callable, gkVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: gd$b */
    /* loaded from: classes3.dex */
    private static class b<T> implements Runnable {
        private Callable<T> a;
        private gk<T> b;
        private Handler c;

        b(Handler handler, Callable<T> callable, gk<T> gkVar) {
            this.a = callable;
            this.b = gkVar;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T t;
            try {
                t = this.a.call();
            } catch (Exception unused) {
                t = null;
            }
            final gk<T> gkVar = this.b;
            this.c.post(new Runnable() { // from class: gd.b.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    gkVar.a(t);
                }
            });
        }
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: gd$a */
    /* loaded from: classes3.dex */
    private static class a implements ThreadFactory {
        private String a;
        private int b;

        a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0188a(runnable, this.a, this.b);
        }

        /* compiled from: RequestExecutor.java */
        /* renamed from: gd$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static class C0188a extends Thread {
            private final int a;

            C0188a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }
    }
}
