package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.player.b;
import com.xiaopeng.musicradio.player.d;
import com.xiaopeng.musicradio.player.h;
import com.xiaopeng.musicradio.player.l;
import com.xiaopeng.musicradio.player.p;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: MediaPlayerWrapper.java */
/* renamed from: avo  reason: default package */
/* loaded from: classes2.dex */
public abstract class avo implements b, d, l {
    public static final int BUNDLE_VALUE_SAME_URL = 1;
    public static final int BUNDLE_VALUE_TYPE_ID_MUSIC = 0;
    public static final int BUNDLE_VALUE_TYPE_ID_PROGRAM = 3;
    private static final String TAG = "MediaPlayerWrapper";
    protected Cache mCache = createCache();
    protected l mListener;
    protected h mPlayer;

    protected abstract Cache createCache();

    @Override // com.xiaopeng.musicradio.player.d
    public void setData(Bundle bundle) {
    }

    public p wrapCache(String str) {
        return null;
    }

    public avo(l lVar, final boolean z) {
        this.mListener = lVar;
        Log.i(TAG, "MediaPlayerWrapper: " + this.mCache);
        runOnCommonThread(new Runnable() { // from class: avo.1
            @Override // java.lang.Runnable
            public void run() {
                avo avoVar = avo.this;
                avoVar.mPlayer = new h(avoVar.mCache, z);
                avo.this.mPlayer.a(avo.this);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void start() {
        runOnCommonThread(new Runnable() { // from class: avo.12
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.start();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void pause() {
        runOnCommonThread(new Runnable() { // from class: avo.16
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.pause();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(final String str) {
        runOnCommonThread(new Runnable() { // from class: avo.17
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.prepareData(str);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(final String str, final boolean z) {
        runOnCommonThread(new Runnable() { // from class: avo.18
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.prepareData(str, z);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(final String str, final boolean z, final boolean z2) {
        runOnCommonThread(new Runnable() { // from class: avo.19
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.prepareData(str, z, z2);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(final String str, final boolean z, final boolean z2, final boolean z3) {
        runOnCommonThread(new Runnable() { // from class: avo.20
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.prepareData(str, z, z2, z3);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void seekTo(final int i) {
        runOnCommonThread(new Runnable() { // from class: avo.21
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.seekTo(i);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setVolume(final float f, final float f2) {
        runOnCommonThread(new Runnable() { // from class: avo.22
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.setVolume(f, f2);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void startSeek() {
        runOnCommonThread(new Runnable() { // from class: avo.2
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.startSeek();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void stop() {
        runOnCommonThread(new Runnable() { // from class: avo.3
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.stop();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void reset() {
        runOnCommonThread(new Runnable() { // from class: avo.4
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.reset();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isIdle() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        syncGetValue(new Runnable() { // from class: avo.5
            @Override // java.lang.Runnable
            public void run() {
                atomicBoolean.set(avo.this.mPlayer.isIdle());
            }
        }, "isIdle");
        return atomicBoolean.get();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getCurrentPosition() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        syncGetValue(new Runnable() { // from class: avo.6
            @Override // java.lang.Runnable
            public void run() {
                atomicInteger.set(avo.this.mPlayer.getCurrentPosition());
            }
        }, "getCurrentPosition");
        return atomicInteger.get();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSecondPosition() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        syncGetValue(new Runnable() { // from class: avo.7
            @Override // java.lang.Runnable
            public void run() {
                atomicInteger.set(avo.this.mPlayer.getSecondPosition());
            }
        }, "getSecondPosition");
        return atomicInteger.get();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSessionId() {
        h hVar = this.mPlayer;
        if (hVar != null) {
            return hVar.getSessionId();
        }
        return -1;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isPlaying() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        syncGetValue(new Runnable() { // from class: avo.8
            @Override // java.lang.Runnable
            public void run() {
                atomicBoolean.set(avo.this.mPlayer.isPlaying());
            }
        }, "isPlaying");
        return atomicBoolean.get();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getDuration() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        syncGetValue(new Runnable() { // from class: avo.9
            @Override // java.lang.Runnable
            public void run() {
                atomicInteger.set(avo.this.mPlayer.getDuration());
            }
        }, "getDuration");
        return atomicInteger.get();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getPlaybackState() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        syncGetValue(new Runnable() { // from class: avo.10
            @Override // java.lang.Runnable
            public void run() {
                atomicInteger.set(avo.this.mPlayer.getPlaybackState());
            }
        }, "getPlaybackState");
        return atomicInteger.get();
    }

    private void syncGetValue(final Runnable runnable, final String str) {
        final Object obj = new Object();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        runOnCommonThread(new Runnable() { // from class: avo.11
            @Override // java.lang.Runnable
            public void run() {
                synchronized (obj) {
                    long currentTimeMillis = System.currentTimeMillis();
                    runnable.run();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis2 > 500) {
                        Log.i(avo.TAG, "syncGetValue run: method  = " + str + " use = " + currentTimeMillis2);
                    }
                    atomicBoolean.set(true);
                    obj.notifyAll();
                }
            }
        });
        synchronized (obj) {
            if (!atomicBoolean.get()) {
                try {
                    obj.wait();
                } catch (Exception e) {
                    LogUtils.e(TAG, e);
                }
            }
        }
    }

    protected void runOnCommonThread(Runnable runnable) {
        ban.g(runnable);
    }

    public void setMeter(final p pVar) {
        runOnCommonThread(new Runnable() { // from class: avo.13
            @Override // java.lang.Runnable
            public void run() {
                avo.this.mPlayer.a(pVar);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void playState(String str, int i) {
        Log.i(TAG, "playState: state = " + i);
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.playState(str, i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayError(String str, int i) {
        LogUtils.e(TAG, "onPlayError: type = %d", Integer.valueOf(i));
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.onPlayError(str, i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayPosition(String str, int i, int i2) {
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.onPlayPosition(str, i, i2);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void loadingChange(String str, boolean z) {
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.loadingChange(str, z);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onTimeLineChange(String str) {
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.onTimeLineChange(str);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onDownloaded(String str, String str2, long j) {
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.onDownloaded(str, str2, j);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onSetData(String str, Bundle bundle) {
        l lVar = this.mListener;
        if (lVar != null) {
            lVar.onSetData(str, bundle);
        }
    }

    public l getListener() {
        return this.mListener;
    }

    @Override // com.xiaopeng.musicradio.player.b
    public void removeCache(String str) {
        avh.a(this.mCache, str);
    }

    @Override // com.xiaopeng.musicradio.player.b
    public boolean isCacheComplete(String str) {
        return avh.b(this.mCache, str);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void release() {
        runOnCommonThread(new Runnable() { // from class: avo.14
            @Override // java.lang.Runnable
            public void run() {
                if (avo.this.mPlayer != null) {
                    avo.this.mPlayer.release();
                }
            }
        });
    }

    public h getPlayer() {
        return this.mPlayer;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setPlaySpeed(final float f) {
        runOnCommonThread(new Runnable() { // from class: avo.15
            @Override // java.lang.Runnable
            public void run() {
                if (avo.this.mPlayer != null) {
                    avo.this.mPlayer.setPlaySpeed(f);
                }
            }
        });
    }
}
