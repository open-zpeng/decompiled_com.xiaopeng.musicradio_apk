package defpackage;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: InterceptorServiceImpl.java */
@Route(path = "/arouter/service/interceptor")
/* renamed from: sj  reason: default package */
/* loaded from: classes3.dex */
public class sj implements InterceptorService {
    private static boolean a;
    private static final Object b = new Object();

    @Override // com.alibaba.android.arouter.facade.service.InterceptorService
    public void doInterceptions(final Postcard postcard, final InterceptorCallback interceptorCallback) {
        if (sl.f != null && sl.f.size() > 0) {
            b();
            if (!a) {
                interceptorCallback.onInterrupt(new sm("Interceptors initialization takes too much time."));
                return;
            } else {
                sk.a.execute(new Runnable() { // from class: sj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        sr srVar = new sr(sl.f.size());
                        try {
                            sj.b(0, srVar, postcard);
                            srVar.await(postcard.getTimeout(), TimeUnit.SECONDS);
                            if (srVar.getCount() > 0) {
                                interceptorCallback.onInterrupt(new sm("The interceptor processing timed out."));
                            } else if (postcard.getTag() != null) {
                                interceptorCallback.onInterrupt(new sm(postcard.getTag().toString()));
                            } else {
                                interceptorCallback.onContinue(postcard);
                            }
                        } catch (Exception e) {
                            interceptorCallback.onInterrupt(e);
                        }
                    }
                });
                return;
            }
        }
        interceptorCallback.onContinue(postcard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final int i, final sr srVar, final Postcard postcard) {
        if (i < sl.f.size()) {
            sl.f.get(i).process(postcard, new InterceptorCallback() { // from class: sj.2
                @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                public void onContinue(Postcard postcard2) {
                    sr.this.countDown();
                    sj.b(i + 1, sr.this, postcard2);
                }

                @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                public void onInterrupt(Throwable th) {
                    postcard.setTag(th == null ? new sm("No message.") : th.getMessage());
                    sr.this.a();
                }
            });
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(final Context context) {
        sk.a.execute(new Runnable() { // from class: sj.3
            @Override // java.lang.Runnable
            public void run() {
                if (sw.a(sl.e)) {
                    for (Map.Entry<Integer, Class<? extends IInterceptor>> entry : sl.e.entrySet()) {
                        Class<? extends IInterceptor> value = entry.getValue();
                        try {
                            IInterceptor newInstance = value.getConstructor(new Class[0]).newInstance(new Object[0]);
                            newInstance.init(context);
                            sl.f.add(newInstance);
                        } catch (Exception e) {
                            throw new sm("ARouter::ARouter init interceptor error! name = [" + value.getName() + "], reason = [" + e.getMessage() + "]");
                        }
                    }
                    boolean unused = sj.a = true;
                    sp.a.info(ILogger.defaultTag, "ARouter interceptors init over.");
                    synchronized (sj.b) {
                        sj.b.notifyAll();
                    }
                }
            }
        });
    }

    private static void b() {
        synchronized (b) {
            while (!a) {
                try {
                    b.wait(10000L);
                } catch (InterruptedException e) {
                    throw new sm("ARouter::Interceptor init cost too much time error! reason = [" + e.getMessage() + "]");
                }
            }
        }
    }
}
