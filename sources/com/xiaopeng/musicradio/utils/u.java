package com.xiaopeng.musicradio.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.EventBusBuilder;
import org.greenrobot.eventbus.SubscriberMethod;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;
/* compiled from: EventBusUtil.java */
/* loaded from: classes2.dex */
public class u {
    private static boolean a = false;
    private static Handler b;

    public static void a(SubscriberInfoIndex... subscriberInfoIndexArr) {
        EventBusBuilder addIndex = EventBus.builder().sendNoSubscriberEvent(false).logNoSubscriberMessages(false).addIndex(new afz());
        for (SubscriberInfoIndex subscriberInfoIndex : subscriberInfoIndexArr) {
            addIndex.addIndex(subscriberInfoIndex);
        }
        addIndex.installDefaultEventBus();
        HandlerThread handlerThread = new HandlerThread("eventbus_thread");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
    }

    public static void a(final Object obj) {
        b.post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.u.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (EventBus.getDefault().isRegistered(obj)) {
                        return;
                    }
                    EventBus.getDefault().register(obj);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void b(final Object obj) {
        b.post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.u.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (EventBus.getDefault().isRegistered(obj)) {
                        EventBus.getDefault().unregister(obj);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void c(final Object obj) {
        if (obj == null) {
            return;
        }
        a(obj, false);
        b.post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.u.3
            @Override // java.lang.Runnable
            public void run() {
                EventBus.getDefault().post(obj);
            }
        });
    }

    private static void a(Object obj, boolean z) {
        Object obj2;
        if (a) {
            String name = Thread.currentThread().getName();
            Object b2 = aw.b(EventBus.getDefault(), "subscriptionsByEventType");
            if (b2 == null || (obj2 = ((HashMap) b2).get(obj.getClass())) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n--");
            sb.append("\n-- back trace: ");
            String[] split = Log.getStackTraceString(new Throwable()).split("\n");
            if (split != null && split.length > 7) {
                sb.append("\n" + split[3]);
                sb.append("\n" + split[4]);
                sb.append("\n" + split[5]);
                sb.append("\n" + split[6]);
                sb.append("\n" + split[7]);
            }
            sb.append("\n-- currentThread: " + name);
            sb.append("\n-- event: " + obj.getClass().getSimpleName());
            Field[] a2 = aw.a(obj);
            sb.append("\n-- values: ");
            if (a2 != null) {
                for (Field field : a2) {
                    sb.append("\n     " + field.getName());
                    field.setAccessible(true);
                    try {
                        sb.append(" : " + field.get(obj));
                    } catch (Exception unused) {
                    }
                }
            } else {
                sb.append("null");
            }
            sb.append("\n-- target: ");
            Iterator it = ((CopyOnWriteArrayList) obj2).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                SubscriberMethod subscriberMethod = (SubscriberMethod) aw.b(next, "subscriberMethod");
                Object b3 = aw.b(next, "subscriber");
                if (subscriberMethod != null && b3 != null) {
                    Method method = (Method) aw.b(subscriberMethod, "method");
                    ThreadMode threadMode = (ThreadMode) aw.b(subscriberMethod, "threadMode");
                    Object b4 = aw.b(subscriberMethod, "sticky");
                    boolean booleanValue = b4 != null ? ((Boolean) b4).booleanValue() : false;
                    if (method != null && threadMode != null) {
                        String str = "run on main thread async, ";
                        boolean b5 = af.b();
                        switch (threadMode) {
                            case POSTING:
                                if (z) {
                                    str = "run on " + name + " sync, ";
                                    break;
                                } else {
                                    str = "run on eventbus_thread async, ";
                                    break;
                                }
                            case MAIN:
                                if (z && b5) {
                                    str = "run on main thread sync, ";
                                    break;
                                }
                                break;
                            case BACKGROUND:
                                if (z) {
                                    if (!b5) {
                                        str = "run on " + name + " sync, ";
                                        break;
                                    }
                                } else {
                                    str = "run on eventbus_thread async, ";
                                    break;
                                }
                                break;
                        }
                        sb.append("\n     " + str + b3.getClass().getSimpleName() + " $ " + method.getName() + ", ThradMode: " + threadMode);
                        if (booleanValue) {
                            sb.append(", sticky: " + booleanValue);
                        }
                    }
                }
            }
            Log.d(EventBus.TAG, sb.toString());
        }
    }

    public static void d(final Object obj) {
        b.post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.u.4
            @Override // java.lang.Runnable
            public void run() {
                if (EventBus.getDefault().getStickyEvent(obj.getClass()) != null) {
                    EventBus.getDefault().removeStickyEvent(obj);
                }
            }
        });
    }

    public static void e(final Object obj) {
        a(obj, false);
        b.post(new Runnable() { // from class: com.xiaopeng.musicradio.utils.u.5
            @Override // java.lang.Runnable
            public void run() {
                EventBus.getDefault().postSticky(obj);
            }
        });
    }

    public static void f(Object obj) {
        a(obj, true);
        EventBus.getDefault().post(obj);
    }
}
