package defpackage;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.template.ILogger;
/* compiled from: ARouter.java */
/* renamed from: sp  reason: default package */
/* loaded from: classes3.dex */
public final class sp {
    public static ILogger a = null;
    private static volatile sp b = null;
    private static volatile boolean c = false;

    private sp() {
    }

    public static void a(Application application) {
        if (c) {
            return;
        }
        a = sq.a;
        sq.a.info(ILogger.defaultTag, "ARouter init start.");
        c = sq.a(application);
        if (c) {
            sq.c();
        }
        sq.a.info(ILogger.defaultTag, "ARouter init over.");
    }

    public static sp a() {
        if (!c) {
            throw new sn("ARouter::Init::Invoke init(context) first!");
        }
        if (b == null) {
            synchronized (sp.class) {
                if (b == null) {
                    b = new sp();
                }
            }
        }
        return b;
    }

    public static boolean b() {
        return sq.b();
    }

    public void a(Object obj) {
        sq.a(obj);
    }

    public Postcard a(String str) {
        return sq.a().a(str);
    }

    public <T> T a(Class<? extends T> cls) {
        return (T) sq.a().a((Class<? extends Object>) cls);
    }

    public Object a(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        return sq.a().a(context, postcard, i, navigationCallback);
    }
}
