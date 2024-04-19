package com.xiaopeng.lib.apirouter.server;

import android.os.IBinder;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* compiled from: AutoCodeMatcher.java */
/* loaded from: classes.dex */
class a {
    private static HashMap<String, Pair<IBinder, String>> a;
    private static List<b> b = new LinkedList();
    private static Object c = new Object();

    public Pair<IBinder, String> a(String str) {
        if (a == null) {
            a = f.a();
            a();
        }
        HashMap<String, Pair<IBinder, String>> hashMap = a;
        Pair<IBinder, String> pair = hashMap == null ? null : hashMap.get(str);
        return pair == null ? new Pair<>(null, null) : pair;
    }

    private void a() {
        synchronized (c) {
            if (!b.isEmpty()) {
                for (b bVar : b) {
                    a(bVar);
                }
            }
        }
    }

    private void a(b bVar) {
        c[] a2;
        if (bVar == null || (a2 = bVar.a()) == null || a2.length == 0) {
            return;
        }
        if (a == null) {
            a = new HashMap<>();
        }
        HashMap<String, Pair<IBinder, String>> hashMap = a;
        for (c cVar : a2) {
            try {
                HashMap<String, Pair<IBinder, String>> mapping = cVar.getMapping();
                if (mapping != null && !mapping.isEmpty()) {
                    hashMap.putAll(mapping);
                }
            } catch (Exception e) {
                Log.e("AutoCodeMatcher", "initManifestHandler:" + cVar.getClass(), e);
            }
        }
    }
}
