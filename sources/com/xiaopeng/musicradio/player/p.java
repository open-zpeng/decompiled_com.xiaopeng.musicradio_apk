package com.xiaopeng.musicradio.player;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.SlidingPercentile;
import com.xiaopeng.lib.utils.LogUtils;
import defpackage.ave;
/* compiled from: XpBandWidthMeter.java */
/* loaded from: classes2.dex */
public class p implements BandwidthMeter, TransferListener<Object> {
    Cache a;
    private final Handler b;
    private final BandwidthMeter.EventListener c;
    private final SlidingPercentile d;
    private final Clock e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private a l;
    private ave.a m;
    private String n;

    /* compiled from: XpBandWidthMeter.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ave.a aVar);
    }

    public p() {
        this(null, null);
    }

    public p(Handler handler, BandwidthMeter.EventListener eventListener) {
        this(handler, eventListener, 2000);
    }

    public p(Handler handler, BandwidthMeter.EventListener eventListener, int i) {
        this(handler, eventListener, i, Clock.DEFAULT);
    }

    public p(Handler handler, BandwidthMeter.EventListener eventListener, int i, Clock clock) {
        this.b = handler;
        this.c = eventListener;
        this.d = new SlidingPercentile(i);
        this.e = clock;
        this.k = -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.k;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(Object obj, DataSpec dataSpec) {
        if (this.f == 0) {
            this.g = this.e.elapsedRealtime();
        }
        this.n = dataSpec.key;
        this.f++;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(Object obj, int i) {
        this.h += i;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(Object obj) {
        Assertions.checkState(this.f > 0);
        long elapsedRealtime = this.e.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.g);
        long j = i;
        this.i += j;
        this.j += this.h;
        if (i > 0) {
            this.d.addSample((int) Math.sqrt(this.h), (float) ((this.h * 8000) / j));
            if (this.i >= 2000 || this.j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                float percentile = this.d.getPercentile(0.5f);
                this.k = Float.isNaN(percentile) ? -1L : percentile;
            }
        }
        b(i, this.h, this.k);
        a(i, this.h, this.k);
        int i2 = this.f - 1;
        this.f = i2;
        if (i2 > 0) {
            this.g = elapsedRealtime;
        }
        this.h = 0L;
    }

    private void a(int i, long j, long j2) {
        ave.a aVar = this.m;
        if (aVar == null) {
            return;
        }
        Bundle a2 = aVar.a();
        a2.putInt("cache_new", (int) j);
        LogUtils.i("XpBandWidthMeter", "notifyPolicy: " + a2.toString());
        a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.a(this.m);
        }
    }

    public void a(ave.a aVar) {
        this.m = aVar;
    }

    public void a(Cache cache) {
        this.a = cache;
    }

    private void b(final int i, final long j, final long j2) {
        Handler handler = this.b;
        if (handler == null || this.c == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaopeng.musicradio.player.p.1
            @Override // java.lang.Runnable
            public void run() {
                p.this.c.onBandwidthSample(i, j, j2);
            }
        });
    }

    public void a(a aVar) {
        this.l = aVar;
    }
}
