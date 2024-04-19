package com.xiaopeng.musicradio.player;

import android.util.Log;
import android.util.SparseArray;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: MediaPlayerManager.java */
/* loaded from: classes2.dex */
public class g {
    private SparseArray<Class<? extends avo>> a = new SparseArray<>();
    private ConcurrentHashMap<Integer, avo> b = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaPlayerManager.java */
    /* loaded from: classes2.dex */
    public static class a {
        static final g a = new g();
    }

    private void c() {
    }

    public static g a() {
        return a.a;
    }

    public g() {
        c();
    }

    public void a(int i, Class<? extends avo> cls) {
        this.a.put(i, cls);
    }

    public synchronized avo a(int i, c cVar) {
        if (this.b.get(Integer.valueOf(i)) == null) {
            this.b.put(Integer.valueOf(i), a(i, new avn(i, cVar)));
            Log.i("MediaPlayerManager", "getPlayer: " + this.b.get(Integer.valueOf(i)));
        }
        return this.b.get(Integer.valueOf(i));
    }

    public synchronized void a(c cVar) {
        if (cVar == null) {
            return;
        }
        for (Map.Entry<Integer, avo> entry : this.b.entrySet()) {
            l listener = entry.getValue().getListener();
            if (listener != null && (listener instanceof avn)) {
                ((avn) listener).a(cVar);
            }
        }
    }

    private avo a(int i, l lVar) {
        try {
            Class<? extends avo> cls = this.a.get(i);
            if (cls != null) {
                return cls.getConstructor(l.class).newInstance(lVar);
            }
            return null;
        } catch (Exception e) {
            Log.e("MediaPlayerManager", "create: " + e);
            return null;
        }
    }

    public synchronized void b() {
        for (Map.Entry<Integer, avo> entry : this.b.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().release();
            }
        }
        this.b.clear();
    }
}
