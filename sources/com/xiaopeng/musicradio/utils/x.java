package com.xiaopeng.musicradio.utils;

import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.signature.ObjectKey;
import com.xiaopeng.lib.utils.LogUtils;
import defpackage.agg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: GlideErrorCacheManager.java */
/* loaded from: classes2.dex */
public class x {
    private Map<String, Object> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideErrorCacheManager.java */
    /* loaded from: classes2.dex */
    public static class b {
        static final x a = new x();
    }

    public static x a() {
        return b.a;
    }

    public x() {
        u.a(this);
    }

    public void a(Object obj) {
        if (obj == null) {
            return;
        }
        Log.e("GlideErrorCacheManager", "addErrorKey: " + obj);
        this.a.put(obj.toString(), obj);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIGChange(agg.s sVar) {
        if (sVar.a() || this.a.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            Log.e("GlideErrorCacheManager", "onIGChange: key = " + entry.getKey());
            arrayList.add(entry.getValue());
        }
        this.a.clear();
        Glide.get(com.xiaopeng.musicradio.a.a).clearMemory();
        k.b().execute(new a(arrayList));
    }

    /* compiled from: GlideErrorCacheManager.java */
    /* loaded from: classes2.dex */
    private static class a implements Comparable<Object>, Runnable {
        private List<Object> a;

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return -1;
        }

        public a(List<Object> list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Object> list = this.a;
            if (list != null) {
                for (Object obj : list) {
                    a(obj);
                }
            }
        }

        private void a(Object obj) {
            DiskCache a = k.a();
            if (a != null) {
                LogUtils.e("GlideUtil", "deleteDiskCache:" + obj);
                try {
                    a.delete(new ObjectKey(obj));
                } catch (Throwable th) {
                    LogUtils.e("GlideUtil", "deleteDiskCache:" + th.getMessage());
                }
            }
        }
    }
}
