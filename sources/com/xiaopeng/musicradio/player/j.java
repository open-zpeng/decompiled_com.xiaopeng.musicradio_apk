package com.xiaopeng.musicradio.player;

import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.xiaopeng.musicradio.utils.bg;
/* compiled from: NetRadioCacheEvictor.java */
/* loaded from: classes2.dex */
public class j implements CacheEvictor {
    private boolean a;

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
        this.a = true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        if (cacheSpan.lastAccessTimestamp < bg.a(-1)) {
            try {
                cache.removeSpan(cacheSpan, this.a);
            } catch (Exception e) {
                Log.e("NetRadioCacheEvictor", "onSpanAdded: ", e);
            }
        }
    }
}
