package com.xiaopeng.musicradio.model.player;

import android.os.Bundle;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.xiaopeng.musicradio.player.f;
import com.xiaopeng.musicradio.player.l;
import com.xiaopeng.musicradio.player.p;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.speech.common.util.DontProguardClass;
import defpackage.ave;
import java.io.File;
@DontProguardClass
/* loaded from: classes.dex */
public class MusicPlayerWrapper extends avo {
    public static final long MAX_COUNT = 10485760;
    private static final String TAG = "MusicPlayerWrapper";
    private f mEvictor;
    private ave.a mPolicy;

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return 0.0f;
    }

    public MusicPlayerWrapper(l lVar) {
        super(lVar, true);
    }

    @Override // defpackage.avo
    protected Cache createCache() {
        this.mEvictor = new f(10485760L);
        return new SimpleCache(new File("/sdcard/xiaopengmusic/cache/music"), this.mEvictor);
    }

    @Override // defpackage.avo, com.xiaopeng.musicradio.player.l
    public void playState(String str, int i) {
        super.playState(str, i);
        Log.i(TAG, "playState: state = " + i);
        if (i != 2 || this.mEvictor == null || be.a((CharSequence) this.mPlayer.c())) {
            return;
        }
        this.mEvictor.a(this.mPlayer.c());
    }

    @Override // defpackage.avo
    public p wrapCache(String str) {
        p pVar = new p();
        pVar.a(this.mCache);
        if (this.mPolicy != null) {
            this.mPolicy.a().putInt("cache_old", avh.d(this.mCache, str));
        }
        pVar.a(this.mPolicy);
        pVar.a(new p.a() { // from class: com.xiaopeng.musicradio.model.player.MusicPlayerWrapper.1
            @Override // com.xiaopeng.musicradio.player.p.a
            public void a(ave.a aVar) {
                if (MusicPlayerWrapper.this.mPlayer != null) {
                    MusicPlayerWrapper musicPlayerWrapper = MusicPlayerWrapper.this;
                    musicPlayerWrapper.onSetData(musicPlayerWrapper.mPlayer.b(), aVar.a());
                }
            }
        });
        return pVar;
    }

    @Override // defpackage.avo, com.xiaopeng.musicradio.player.d
    public void setData(Bundle bundle) {
        super.setData(bundle);
        this.mPolicy = new ave().a(bundle);
    }
}
