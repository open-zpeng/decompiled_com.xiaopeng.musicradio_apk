package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.core.app.a;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.google.android.exoplayer2.C;
import java.util.concurrent.ThreadPoolExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ARouter.java */
/* renamed from: sq  reason: default package */
/* loaded from: classes3.dex */
public final class sq {
    static ILogger a = new sv(ILogger.defaultTag);
    private static volatile boolean b = false;
    private static volatile boolean c = false;
    private static volatile boolean d = false;
    private static volatile sq e = null;
    private static volatile boolean f = false;
    private static volatile ThreadPoolExecutor g = ss.a();
    private static Handler h;
    private static Context i;
    private static InterceptorService j;

    private sq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized boolean a(Application application) {
        synchronized (sq.class) {
            i = application;
            sk.a(i, g);
            a.info(ILogger.defaultTag, "ARouter init success!");
            f = true;
            h = new Handler(Looper.getMainLooper());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static sq a() {
        if (!f) {
            throw new sn("ARouterCore::Init::Invoke init(context) first!");
        }
        if (e == null) {
            synchronized (sq.class) {
                if (e == null) {
                    e = new sq();
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj) {
        AutowiredService autowiredService = (AutowiredService) sp.a().a("/arouter/service/autowired").navigation();
        if (autowiredService != null) {
            autowiredService.autowire(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Postcard a(String str) {
        if (sy.a(str)) {
            throw new sm("ARouter::Parameter is invalid!");
        }
        PathReplaceService pathReplaceService = (PathReplaceService) sp.a().a((Class<? extends Object>) PathReplaceService.class);
        if (pathReplaceService != null) {
            str = pathReplaceService.forString(str);
        }
        return a(str, b(str));
    }

    protected Postcard a(String str, String str2) {
        if (sy.a(str) || sy.a(str2)) {
            throw new sm("ARouter::Parameter is invalid!");
        }
        PathReplaceService pathReplaceService = (PathReplaceService) sp.a().a((Class<? extends Object>) PathReplaceService.class);
        if (pathReplaceService != null) {
            str = pathReplaceService.forString(str);
        }
        return new Postcard(str, str2);
    }

    private String b(String str) {
        if (sy.a(str) || !str.startsWith("/")) {
            throw new sm("ARouter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String substring = str.substring(1, str.indexOf("/", 1));
            if (sy.a(substring)) {
                throw new sm("ARouter::Extract the default group failed! There's nothing between 2 '/'!");
            }
            return substring;
        } catch (Exception e2) {
            ILogger iLogger = a;
            iLogger.warning(ILogger.defaultTag, "Failed to extract default group! " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        j = (InterceptorService) sp.a().a("/arouter/service/interceptor").navigation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T a(Class<? extends T> cls) {
        try {
            Postcard a2 = sk.a(cls.getName());
            if (a2 == null) {
                a2 = sk.a(cls.getSimpleName());
            }
            if (a2 == null) {
                return null;
            }
            sk.a(a2);
            return (T) a2.getProvider();
        } catch (so e2) {
            a.warning(ILogger.defaultTag, e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(final Context context, final Postcard postcard, final int i2, final NavigationCallback navigationCallback) {
        try {
            sk.a(postcard);
            if (navigationCallback != null) {
                navigationCallback.onFound(postcard);
            }
            if (!postcard.isGreenChannel()) {
                j.doInterceptions(postcard, new InterceptorCallback() { // from class: sq.2
                    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                    public void onContinue(Postcard postcard2) {
                        sq.this.b(context, postcard2, i2, navigationCallback);
                    }

                    @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
                    public void onInterrupt(Throwable th) {
                        NavigationCallback navigationCallback2 = navigationCallback;
                        if (navigationCallback2 != null) {
                            navigationCallback2.onInterrupt(postcard);
                        }
                        ILogger iLogger = sq.a;
                        iLogger.info(ILogger.defaultTag, "Navigation failed, termination by interceptor : " + th.getMessage());
                    }
                });
                return null;
            }
            return b(context, postcard, i2, navigationCallback);
        } catch (so e2) {
            a.warning(ILogger.defaultTag, e2.getMessage());
            if (b()) {
                a(new Runnable() { // from class: sq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Context context2 = sq.i;
                        Toast.makeText(context2, "There's no route matched!\n Path = [" + postcard.getPath() + "]\n Group = [" + postcard.getGroup() + "]", 1).show();
                    }
                });
            }
            if (navigationCallback != null) {
                navigationCallback.onLost(postcard);
            } else {
                DegradeService degradeService = (DegradeService) sp.a().a((Class<? extends Object>) DegradeService.class);
                if (degradeService != null) {
                    degradeService.onLost(context, postcard);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Object b(Context context, final Postcard postcard, final int i2, final NavigationCallback navigationCallback) {
        if (context == null) {
            context = i;
        }
        final Context context2 = context;
        switch (postcard.getType()) {
            case ACTIVITY:
                final Intent intent = new Intent(context2, postcard.getDestination());
                intent.putExtras(postcard.getExtras());
                int flags = postcard.getFlags();
                if (-1 != flags) {
                    intent.setFlags(flags);
                } else if (!(context2 instanceof Activity)) {
                    intent.setFlags(C.ENCODING_PCM_MU_LAW);
                }
                String action = postcard.getAction();
                if (!sy.a(action)) {
                    intent.setAction(action);
                }
                a(new Runnable() { // from class: sq.3
                    @Override // java.lang.Runnable
                    public void run() {
                        sq.this.a(i2, context2, intent, postcard, navigationCallback);
                    }
                });
                return null;
            case PROVIDER:
                return postcard.getProvider();
            case BOARDCAST:
            case CONTENT_PROVIDER:
            case FRAGMENT:
                try {
                    Object newInstance = postcard.getDestination().getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (newInstance instanceof Fragment) {
                        ((Fragment) newInstance).setArguments(postcard.getExtras());
                    } else if (newInstance instanceof androidx.fragment.app.Fragment) {
                        ((androidx.fragment.app.Fragment) newInstance).setArguments(postcard.getExtras());
                    }
                    return newInstance;
                } catch (Exception e2) {
                    ILogger iLogger = a;
                    iLogger.error(ILogger.defaultTag, "Fetch fragment instance error, " + sy.a(e2.getStackTrace()));
                    break;
                }
        }
        return null;
    }

    private void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            h.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
        if (i2 >= 0) {
            if (context instanceof Activity) {
                a.a((Activity) context, intent, i2, postcard.getOptionsBundle());
            } else {
                a.warning(ILogger.defaultTag, "Must use [navigation(activity, ...)] to support [startActivityForResult]");
            }
        } else {
            a.a(context, intent, postcard.getOptionsBundle());
        }
        if (-1 != postcard.getEnterAnim() && -1 != postcard.getExitAnim() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(postcard.getEnterAnim(), postcard.getExitAnim());
        }
        if (navigationCallback != null) {
            navigationCallback.onArrival(postcard);
        }
    }
}
