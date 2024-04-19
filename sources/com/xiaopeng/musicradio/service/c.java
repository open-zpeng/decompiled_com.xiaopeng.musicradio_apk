package com.xiaopeng.musicradio.service;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ServiceManager.java */
/* loaded from: classes2.dex */
public class c {
    private static volatile c a;
    private ConcurrentHashMap<Class, String> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Class, a> c = new ConcurrentHashMap<>();

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    public void a(Class cls, String str) {
        this.b.put(cls, str);
    }

    synchronized void a(Class cls) {
        String str = this.b.get(cls);
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar = this.c.get(cls);
                if (aVar == null) {
                    aVar = (a) Class.forName(str).newInstance();
                }
                if (!aVar.hasStart()) {
                    aVar.b();
                    aVar.setStart(true);
                }
                this.c.put(cls, aVar);
            } catch (Exception e) {
                Log.e("ServiceManager", "startService: ", e);
            }
        }
    }

    public <T> T b(Class<T> cls) {
        if (this.c.get(cls) == null) {
            a(cls);
        }
        return (T) this.c.get(cls);
    }
}
