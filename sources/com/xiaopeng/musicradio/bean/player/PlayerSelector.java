package com.xiaopeng.musicradio.bean.player;

import android.os.Bundle;
import android.util.Log;
import com.xiaopeng.musicradio.model.car.a;
import com.xiaopeng.musicradio.player.b;
import com.xiaopeng.musicradio.player.d;
import com.xiaopeng.musicradio.player.h;
import com.xiaopeng.musicradio.player.l;
import com.xiaopeng.musicradio.player.n;
/* loaded from: classes.dex */
public class PlayerSelector implements d, l {
    private static final String TAG = "PlayerSelector";
    private b mCache;
    private String mLastHash;
    private d mOperation;
    private boolean mPause;
    private h.a mPlayListener;

    public PlayerSelector(int i) {
        n nVar = new n(i);
        nVar.a(this);
        this.mOperation = nVar;
        this.mCache = nVar;
    }

    public void setPlayListener(h.a aVar) {
        this.mPlayListener = aVar;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void start() {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.start();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void pause() {
        this.mPause = true;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.pause();
        }
    }

    public void refreshHash(String str) {
        this.mLastHash = str;
        Log.i(TAG, "refreshHash: " + str);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str) {
        this.mPause = false;
        if (this.mOperation != null) {
            this.mLastHash = avi.a(str);
            Log.i(TAG, "prepareData: " + this.mLastHash);
            this.mOperation.prepareData(str);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z) {
        this.mPause = false;
        if (this.mOperation != null) {
            this.mLastHash = avi.a(str);
            Log.i(TAG, "prepareData1: " + this.mLastHash);
            this.mOperation.prepareData(str, z);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2) {
        this.mPause = false;
        if (this.mOperation != null) {
            this.mLastHash = avi.a(str);
            Log.i(TAG, "prepareData2: " + this.mLastHash);
            this.mOperation.prepareData(str, z, z2);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2, boolean z3) {
        this.mPause = false;
        if (this.mOperation != null) {
            this.mLastHash = avi.a(str);
            Log.i(TAG, "prepareData3: " + this.mLastHash);
            Log.i(TAG, "prepareData3: " + a.a().f());
            if (z3 && !a.a().f()) {
                a.a().a(true);
            }
            if (!a.a().f()) {
                z3 = false;
            }
            this.mOperation.prepareData(str, z, z2, z3);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void seekTo(int i) {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.seekTo(i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setVolume(float f, float f2) {
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.setVolume(f, f2);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return this.mOperation.getVolume();
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void startSeek() {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.startSeek();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void stop() {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.stop();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void reset() {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.reset();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void release() {
        this.mPause = false;
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.release();
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isIdle() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.isIdle();
        }
        Log.i(TAG, "isIdle: ");
        return false;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getCurrentPosition() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.getCurrentPosition();
        }
        Log.i(TAG, "getCurrentPosition: ");
        return 0;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSecondPosition() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.getSecondPosition();
        }
        Log.i(TAG, "getSecondPosition: ");
        return 0;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isPlaying() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.isPlaying();
        }
        Log.i(TAG, "isPlaying: ");
        return false;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getDuration() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.getDuration();
        }
        Log.i(TAG, "getDuration: ");
        return 0;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getPlaybackState() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.getPlaybackState();
        }
        Log.i(TAG, "getPlaybackState: ");
        return 0;
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setData(Bundle bundle) {
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.setData(bundle);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setPlaySpeed(float f) {
        d dVar = this.mOperation;
        if (dVar != null) {
            dVar.setPlaySpeed(f);
        }
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSessionId() {
        d dVar = this.mOperation;
        if (dVar != null) {
            return dVar.getSessionId();
        }
        return -1;
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void playState(final String str, final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.1
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                int i2;
                Log.i(PlayerSelector.TAG, "run: " + str);
                if (PlayerSelector.this.mPlayListener == null || PlayerSelector.this.mLastHash == null || (str2 = str) == null || !str2.contains(PlayerSelector.this.mLastHash)) {
                    return;
                }
                if (PlayerSelector.this.mPause && ((i2 = i) == 2 || i2 == 1)) {
                    return;
                }
                PlayerSelector.this.mPlayListener.playState(i);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayError(final String str, final int i) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.2
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                if (PlayerSelector.this.mPlayListener == null || PlayerSelector.this.mLastHash == null || (str2 = str) == null || !str2.contains(PlayerSelector.this.mLastHash) || PlayerSelector.this.mPause) {
                    return;
                }
                PlayerSelector.this.mPlayListener.a(i, str);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayPosition(String str, final int i, final int i2) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.3
            @Override // java.lang.Runnable
            public void run() {
                if (PlayerSelector.this.mPlayListener != null) {
                    PlayerSelector.this.mPlayListener.onPlayPosition(i, i2);
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void loadingChange(final String str, final boolean z) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.4
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                if (PlayerSelector.this.mPlayListener == null || PlayerSelector.this.mLastHash == null || (str2 = str) == null || !str2.contains(PlayerSelector.this.mLastHash)) {
                    return;
                }
                PlayerSelector.this.mPlayListener.b(z);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onTimeLineChange(final String str) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.5
            @Override // java.lang.Runnable
            public void run() {
                String str2;
                if (PlayerSelector.this.mPlayListener == null || PlayerSelector.this.mLastHash == null || (str2 = str) == null || !str2.contains(PlayerSelector.this.mLastHash)) {
                    return;
                }
                PlayerSelector.this.mPlayListener.onTimeLineChange();
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onDownloaded(final String str, final String str2, final long j) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.6
            @Override // java.lang.Runnable
            public void run() {
                String str3;
                if (PlayerSelector.this.mPlayListener == null || PlayerSelector.this.mLastHash == null || (str3 = str) == null || !str3.contains(PlayerSelector.this.mLastHash)) {
                    return;
                }
                PlayerSelector.this.mPlayListener.onDownloaded(str2, j);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onSetData(String str, final Bundle bundle) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.bean.player.PlayerSelector.7
            @Override // java.lang.Runnable
            public void run() {
                if (PlayerSelector.this.mPlayListener != null) {
                    PlayerSelector.this.mPlayListener.onSetData(bundle);
                }
            }
        });
    }

    public void removeCache(String str) {
        b bVar = this.mCache;
        if (bVar != null) {
            bVar.removeCache(str);
        }
    }

    public boolean isCacheComplete(String str) {
        b bVar = this.mCache;
        if (bVar != null) {
            return bVar.isCacheComplete(str);
        }
        return false;
    }
}
