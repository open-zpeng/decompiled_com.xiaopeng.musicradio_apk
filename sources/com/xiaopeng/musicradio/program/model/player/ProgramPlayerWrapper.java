package com.xiaopeng.musicradio.program.model.player;

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
/* loaded from: classes2.dex */
public class ProgramPlayerWrapper extends avo {
    public static final long MAX_COUNT = 102400;
    private static final String TAG = "ProgramPlayerWrapper";
    private f mEvictor;
    private ave.a mPolicy;

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return 0.0f;
    }

    public ProgramPlayerWrapper(l lVar) {
        super(lVar, false);
    }

    @Override // defpackage.avo
    protected Cache createCache() {
        this.mEvictor = new f(102400L);
        return new SimpleCache(new File("/sdcard/xiaopengmusic/cache/program"), this.mEvictor);
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
        pVar.a(new p.a() { // from class: com.xiaopeng.musicradio.program.model.player.ProgramPlayerWrapper.1
            @Override // com.xiaopeng.musicradio.player.p.a
            public void a(ave.a aVar) {
                if (ProgramPlayerWrapper.this.mPlayer != null) {
                    ProgramPlayerWrapper programPlayerWrapper = ProgramPlayerWrapper.this;
                    programPlayerWrapper.onSetData(programPlayerWrapper.mPlayer.b(), aVar.a());
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
