package com.xiaopeng.musicradio.model.player;

import android.os.Bundle;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.xiaopeng.musicradio.player.j;
import com.xiaopeng.musicradio.player.l;
import com.xiaopeng.musicradio.player.p;
import com.xiaopeng.speech.common.util.DontProguardClass;
import defpackage.ave;
import java.io.File;
@DontProguardClass
/* loaded from: classes.dex */
public class NetRadioPlayerWrapper extends avo {
    public static final int MAX_COUNT = 8;
    private static final String TAG = "NetRadioPlayerWrapper";
    ave.a mPolicy;

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return 0.0f;
    }

    public NetRadioPlayerWrapper(l lVar) {
        super(lVar, false);
    }

    @Override // defpackage.avo
    protected Cache createCache() {
        return new SimpleCache(new File("/sdcard/xiaopengmusic/cache/netradio"), new j());
    }

    @Override // defpackage.avo
    public p wrapCache(String str) {
        p pVar = new p();
        pVar.a(this.mCache);
        if (this.mPolicy != null) {
            this.mPolicy.a().putInt("cache_old", avh.d(this.mCache, str));
        }
        pVar.a(this.mPolicy);
        pVar.a(new p.a() { // from class: com.xiaopeng.musicradio.model.player.NetRadioPlayerWrapper.1
            @Override // com.xiaopeng.musicradio.player.p.a
            public void a(ave.a aVar) {
                NetRadioPlayerWrapper netRadioPlayerWrapper = NetRadioPlayerWrapper.this;
                netRadioPlayerWrapper.onSetData(netRadioPlayerWrapper.mPlayer.b(), aVar.a());
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
