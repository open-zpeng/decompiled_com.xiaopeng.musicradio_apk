package defpackage;

import android.content.Context;
import android.net.Uri;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.enums.TypeKind;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: LogisticsCenter.java */
/* renamed from: sk  reason: default package */
/* loaded from: classes3.dex */
public class sk {
    static ThreadPoolExecutor a;
    private static Context b;
    private static boolean c;

    private static void a() {
        c = false;
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$arouterapi");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$MusicMain");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPProgram");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPUsb");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPMusic");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPLogin");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPNetradio");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPSearch");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPVip");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPMine");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$XPWebView");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$PlayerComponent");
        b("com.alibaba.android.arouter.routes.ARouter$$Root$$Common");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$arouterapi");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$MusicMain");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPProgram");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPUsb");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPMusic");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPLogin");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPNetradio");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPSearch");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPVip");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPMine");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$XPWebView");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$PlayerComponent");
        b("com.alibaba.android.arouter.routes.ARouter$$Providers$$Common");
    }

    private static void b(String str) {
        if (sy.a(str)) {
            return;
        }
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IRouteRoot) {
                a((IRouteRoot) newInstance);
            } else if (newInstance instanceof IProviderGroup) {
                a((IProviderGroup) newInstance);
            } else if (newInstance instanceof IInterceptorGroup) {
                a((IInterceptorGroup) newInstance);
            } else {
                ILogger iLogger = sp.a;
                iLogger.info(ILogger.defaultTag, "register failed, class name: " + str + " should implements one of IRouteRoot/IProviderGroup/IInterceptorGroup.");
            }
        } catch (Exception unused) {
            ILogger iLogger2 = sp.a;
            iLogger2.error(ILogger.defaultTag, "register class error:" + str);
        }
    }

    private static void a(IRouteRoot iRouteRoot) {
        b();
        if (iRouteRoot != null) {
            iRouteRoot.loadInto(sl.a);
        }
    }

    private static void a(IInterceptorGroup iInterceptorGroup) {
        b();
        if (iInterceptorGroup != null) {
            iInterceptorGroup.loadInto(sl.e);
        }
    }

    private static void a(IProviderGroup iProviderGroup) {
        b();
        if (iProviderGroup != null) {
            iProviderGroup.loadInto(sl.d);
        }
    }

    private static void b() {
        if (c) {
            return;
        }
        c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[Catch: Exception -> 0x0195, all -> 0x01b6, TryCatch #1 {Exception -> 0x0195, blocks: (B:5:0x0007, B:7:0x0013, B:30:0x0120, B:32:0x014a, B:33:0x0153, B:35:0x0159, B:8:0x001e, B:10:0x0024, B:13:0x002b, B:18:0x0078, B:19:0x00ae, B:21:0x00b4, B:23:0x00c2, B:24:0x00dc, B:26:0x00e4, B:27:0x00fe, B:29:0x0106, B:14:0x004b, B:16:0x0062, B:17:0x0075), top: B:45:0x0007, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(android.content.Context r8, java.util.concurrent.ThreadPoolExecutor r9) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk.a(android.content.Context, java.util.concurrent.ThreadPoolExecutor):void");
    }

    public static Postcard a(String str) {
        RouteMeta routeMeta = sl.d.get(str);
        if (routeMeta == null) {
            return null;
        }
        return new Postcard(routeMeta.getPath(), routeMeta.getGroup());
    }

    public static synchronized void a(Postcard postcard) {
        synchronized (sk.class) {
            if (postcard == null) {
                throw new so("ARouter::No postcard!");
            }
            RouteMeta routeMeta = sl.b.get(postcard.getPath());
            if (routeMeta == null) {
                Class<? extends IRouteGroup> cls = sl.a.get(postcard.getGroup());
                if (cls == null) {
                    throw new so("ARouter::There is no route match the path [" + postcard.getPath() + "], in group [" + postcard.getGroup() + "]");
                }
                try {
                    if (sp.b()) {
                        sp.a.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] starts loading, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    cls.getConstructor(new Class[0]).newInstance(new Object[0]).loadInto(sl.b);
                    sl.a.remove(postcard.getGroup());
                    if (sp.b()) {
                        sp.a.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] has already been loaded, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    a(postcard);
                } catch (Exception e) {
                    throw new sm("ARouter::Fatal exception when loading group meta. [" + e.getMessage() + "]");
                }
            } else {
                postcard.setDestination(routeMeta.getDestination());
                postcard.setType(routeMeta.getType());
                postcard.setPriority(routeMeta.getPriority());
                postcard.setExtra(routeMeta.getExtra());
                Uri uri = postcard.getUri();
                if (uri != null) {
                    Map<String, String> a2 = sy.a(uri);
                    Map<String, Integer> paramsType = routeMeta.getParamsType();
                    if (sw.a(paramsType)) {
                        for (Map.Entry<String, Integer> entry : paramsType.entrySet()) {
                            a(postcard, entry.getValue(), entry.getKey(), a2.get(entry.getKey()));
                        }
                        postcard.getExtras().putStringArray("wmHzgD4lOj5o4241", (String[]) paramsType.keySet().toArray(new String[0]));
                    }
                    postcard.withString("NTeRQWvye18AkPd6G", uri.toString());
                }
                switch (routeMeta.getType()) {
                    case PROVIDER:
                        Class<?> destination = routeMeta.getDestination();
                        IProvider iProvider = sl.c.get(destination);
                        if (iProvider == null) {
                            try {
                                iProvider = (IProvider) destination.getConstructor(new Class[0]).newInstance(new Object[0]);
                                iProvider.init(b);
                                sl.c.put(destination, iProvider);
                            } catch (Exception e2) {
                                throw new sm("Init provider failed! " + e2.getMessage());
                            }
                        }
                        postcard.setProvider(iProvider);
                        postcard.greenChannel();
                        break;
                    case FRAGMENT:
                        postcard.greenChannel();
                        break;
                }
            }
        }
    }

    private static void a(Postcard postcard, Integer num, String str, String str2) {
        if (sy.a(str) || sy.a(str2)) {
            return;
        }
        try {
            if (num != null) {
                if (num.intValue() == TypeKind.BOOLEAN.ordinal()) {
                    postcard.withBoolean(str, Boolean.parseBoolean(str2));
                } else if (num.intValue() == TypeKind.BYTE.ordinal()) {
                    postcard.withByte(str, Byte.valueOf(str2).byteValue());
                } else if (num.intValue() == TypeKind.SHORT.ordinal()) {
                    postcard.withShort(str, Short.valueOf(str2).shortValue());
                } else if (num.intValue() == TypeKind.INT.ordinal()) {
                    postcard.withInt(str, Integer.valueOf(str2).intValue());
                } else if (num.intValue() == TypeKind.LONG.ordinal()) {
                    postcard.withLong(str, Long.valueOf(str2).longValue());
                } else if (num.intValue() == TypeKind.FLOAT.ordinal()) {
                    postcard.withFloat(str, Float.valueOf(str2).floatValue());
                } else if (num.intValue() == TypeKind.DOUBLE.ordinal()) {
                    postcard.withDouble(str, Double.valueOf(str2).doubleValue());
                } else if (num.intValue() == TypeKind.STRING.ordinal()) {
                    postcard.withString(str, str2);
                } else if (num.intValue() != TypeKind.PARCELABLE.ordinal()) {
                    if (num.intValue() == TypeKind.OBJECT.ordinal()) {
                        postcard.withString(str, str2);
                    } else {
                        postcard.withString(str, str2);
                    }
                }
            } else {
                postcard.withString(str, str2);
            }
        } catch (Throwable th) {
            ILogger iLogger = sp.a;
            iLogger.warning(ILogger.defaultTag, "LogisticsCenter setValue failed! " + th.getMessage());
        }
    }
}
