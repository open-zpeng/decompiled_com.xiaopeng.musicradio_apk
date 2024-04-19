package com.xiaopeng.musicradio.player;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.xiaopeng.lib.utils.LogUtils;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: LRUCacheEvictor.java */
/* loaded from: classes2.dex */
public class f implements CacheEvictor {
    private final long a;
    private final TreeSet<a> b = new TreeSet<>(new Comparator<a>() { // from class: com.xiaopeng.musicradio.player.f.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            if (aVar.b - aVar2.b == 0) {
                return aVar.a(aVar2);
            }
            return aVar.b < aVar2.b ? -1 : 1;
        }
    });
    private double c;

    public f(long j) {
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public synchronized void onCacheInitialized() {
        Log.i("LRUCacheEvictor", "onCacheInitialized: ===========");
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public synchronized void onStartFile(Cache cache, String str, long j, long j2) {
        a(cache);
        Log.i("LRUCacheEvictor", "onStartFile: ==== " + str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        Iterator<a> it = this.b.iterator();
        a aVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (TextUtils.equals(next.a, cacheSpan.key)) {
                next.b = cacheSpan.lastAccessTimestamp;
                it.remove();
                aVar = next;
                break;
            }
        }
        if (aVar == null) {
            aVar = new a();
            aVar.a = cacheSpan.key;
            aVar.b = cacheSpan.lastAccessTimestamp;
        }
        this.b.add(aVar);
        this.c += ((float) cacheSpan.length) / 1024.0f;
        aVar.c.add(cacheSpan);
        a(cache);
        Log.i("LRUCacheEvictor", "onSpanAdded: ========= " + this.c + " key = " + cacheSpan.key + " maxFileByteSize = " + this.a);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        Iterator<a> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (TextUtils.equals(next.a, cacheSpan.key)) {
                next.c.remove(cacheSpan);
                this.c -= ((float) cacheSpan.length) / 1024.0f;
                if (next.c.size() == 0) {
                    it.remove();
                    break;
                }
            }
        }
        Log.i("LRUCacheEvictor", "onSpanRemoved: ========= " + this.c + "  key = " + cacheSpan.key + " maxFileSize = " + this.a);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    private void a(Cache cache) {
        while (this.c > this.a && this.b.size() > 0) {
            try {
                a first = this.b.first();
                Log.i("LRUCacheEvictor", "evictCache: ========= " + first.a + " mCurrentByteSize = " + this.c + " maxFileByteSize = " + this.a);
                for (CacheSpan cacheSpan : first.c) {
                    cache.removeSpan(cacheSpan);
                }
                this.b.remove(first);
            } catch (Cache.CacheException e) {
                LogUtils.e("LRUCacheEvictor", "evictCache: ", e);
            }
        }
    }

    public synchronized void a(String str) {
        Iterator<a> it = this.b.iterator();
        a aVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (TextUtils.equals(next.a, str)) {
                next.b = System.currentTimeMillis();
                it.remove();
                aVar = next;
                break;
            }
        }
        if (aVar != null) {
            this.b.add(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LRUCacheEvictor.java */
    /* loaded from: classes2.dex */
    public static class a {
        private String a;
        private long b;
        private List<CacheSpan> c = new CopyOnWriteArrayList();

        a() {
        }

        public int a(a aVar) {
            return this.a.compareTo(aVar.a);
        }
    }
}
