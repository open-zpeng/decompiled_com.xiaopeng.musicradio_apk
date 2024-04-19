package com.xiaopeng.musicradio.utils;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DataHolder.java */
/* loaded from: classes2.dex */
public class m {
    private static volatile m a;
    private Map b = new HashMap();

    public static m a() {
        if (a == null) {
            synchronized (m.class) {
                if (a == null) {
                    a = new m();
                }
            }
        }
        return a;
    }

    public void a(String str, Object obj) {
        this.b.put(str, new WeakReference(obj));
    }
}
