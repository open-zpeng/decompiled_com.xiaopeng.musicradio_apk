package com.xiaopeng.musicradio.utils;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SharePrefsANRFix.java */
/* loaded from: classes2.dex */
public class az {
    private static volatile AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.getAndSet(true)) {
            return;
        }
        try {
            Field declaredField = Class.forName("android.app.QueuedWork").getDeclaredField("sPendingWorkFinishers");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj instanceof ConcurrentLinkedQueue) {
                    ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue = new ConcurrentLinkedQueue<Runnable>() { // from class: com.xiaopeng.musicradio.utils.az.1
                        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
                        /* renamed from: a */
                        public boolean add(Runnable runnable) {
                            String name = runnable.getClass().getName();
                            if (TextUtils.isEmpty(name) || !name.contains("android.app.SharedPreferencesImpl$EditorImpl")) {
                                return super.add(runnable);
                            }
                            return false;
                        }
                    };
                    concurrentLinkedQueue.addAll((ConcurrentLinkedQueue) obj);
                    declaredField.set(null, concurrentLinkedQueue);
                }
            }
        } catch (Exception unused) {
        }
        try {
            Field declaredField2 = Class.forName("android.app.QueuedWork").getDeclaredField("sFinishers");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(null);
                if (obj2 instanceof LinkedList) {
                    LinkedList<Runnable> linkedList = new LinkedList<Runnable>() { // from class: com.xiaopeng.musicradio.utils.az.2
                        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
                        /* renamed from: a */
                        public boolean add(Runnable runnable) {
                            String name = runnable.getClass().getName();
                            if (TextUtils.isEmpty(name) || !name.contains("android.app.SharedPreferencesImpl$EditorImpl")) {
                                return super.add(runnable);
                            }
                            return false;
                        }
                    };
                    linkedList.addAll((LinkedList) obj2);
                    declaredField2.set(null, linkedList);
                }
            }
        } catch (Exception unused2) {
        }
    }
}
