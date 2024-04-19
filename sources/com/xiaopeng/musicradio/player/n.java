package com.xiaopeng.musicradio.player;

import android.os.Bundle;
/* compiled from: PlayerProxy.java */
/* loaded from: classes2.dex */
public class n implements b, d, l {
    private int a;
    private m b = m.a();
    private l c;
    private boolean d;
    private String e;
    private float f;
    private float g;
    private int h;
    private int i;
    private float j;

    @Override // com.xiaopeng.musicradio.player.d
    public float getVolume() {
        return 0.0f;
    }

    public n(int i) {
        this.a = i;
        this.b.a(this.a, this);
    }

    @Override // com.xiaopeng.musicradio.player.b
    public void removeCache(String str) {
        this.b.c(this.a, str);
    }

    @Override // com.xiaopeng.musicradio.player.b
    public boolean isCacheComplete(String str) {
        return this.b.b(this.a, str);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void start() {
        this.d = true;
        this.b.a(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void pause() {
        this.b.b(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str) {
        this.d = true;
        this.e = str;
        this.i = 2;
        this.b.a(this.a, str);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z) {
        this.d = true;
        this.e = str;
        this.i = 2;
        this.b.a(this.a, str, z);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2) {
        this.d = true;
        this.e = str;
        this.i = 2;
        this.b.a(this.a, str, z, z2);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void prepareData(String str, boolean z, boolean z2, boolean z3) {
        this.d = true;
        this.e = str;
        if (z3) {
            this.i = 2;
        }
        this.b.a(this.a, str, z, z2, z3);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void seekTo(int i) {
        this.h = i;
        this.b.a(this.a, i);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setVolume(float f, float f2) {
        this.f = f;
        this.g = f2;
        this.b.a(this.a, f, f2);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void startSeek() {
        this.b.c(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void stop() {
        this.b.d(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void reset() {
        this.b.e(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setData(Bundle bundle) {
        this.b.a(this.a, bundle);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void setPlaySpeed(float f) {
        this.j = f;
        this.b.a(this.a, f);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSessionId() {
        return this.b.m(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public void release() {
        this.d = false;
        this.b.f(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isIdle() {
        return this.b.g(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getCurrentPosition() {
        return this.b.h(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getSecondPosition() {
        return this.b.i(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public boolean isPlaying() {
        return this.b.j(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getDuration() {
        return this.b.k(this.a);
    }

    @Override // com.xiaopeng.musicradio.player.d
    public int getPlaybackState() {
        return this.b.l(this.a);
    }

    public void a(l lVar) {
        this.c = lVar;
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void playState(String str, int i) {
        this.i = i;
        l lVar = this.c;
        if (lVar != null) {
            lVar.playState(str, i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayError(String str, int i) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayError(str, i);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onPlayPosition(String str, int i, int i2) {
        this.h = i;
        l lVar = this.c;
        if (lVar != null) {
            lVar.onPlayPosition(str, i, i2);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void loadingChange(String str, boolean z) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.loadingChange(str, z);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onTimeLineChange(String str) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.onTimeLineChange(str);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onDownloaded(String str, String str2, long j) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.onDownloaded(str, str2, j);
        }
    }

    @Override // com.xiaopeng.musicradio.player.l
    public void onSetData(String str, Bundle bundle) {
        l lVar = this.c;
        if (lVar != null) {
            lVar.onSetData(str, bundle);
        }
    }

    public boolean a() {
        return this.d;
    }

    public int b() {
        return this.h;
    }

    public float c() {
        return this.j;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public int f() {
        return this.i;
    }

    public String g() {
        return this.e;
    }
}
