package com.xiaopeng.musicradio.model.bluetooth;
/* compiled from: MetaData.java */
/* loaded from: classes.dex */
public class e {
    private String a = "";
    private String b = "";
    private long c = 0;
    private String d = "";
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public String a() {
        return this.a;
    }

    public e a(String str) {
        this.a = str;
        this.e = true;
        return this;
    }

    public String b() {
        return this.b;
    }

    public e b(String str) {
        this.b = str;
        this.f = true;
        return this;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public long d() {
        return this.c;
    }

    public e a(long j) {
        this.c = j;
        this.g = true;
        return this;
    }

    public boolean e() {
        return this.e && this.f && this.g;
    }

    public void f() {
        this.a = "";
        this.b = "";
        this.c = 0L;
        this.d = "";
        this.e = true;
        this.f = true;
        this.g = true;
    }

    public void a(e eVar) {
        f();
        this.a = eVar.a;
        this.b = eVar.b;
        this.c = eVar.c;
        this.d = eVar.d;
    }

    public String toString() {
        return "MetaData{mTitle='" + this.a + "', mArtist='" + this.b + "', mLength=" + this.c + ", mAlbum=" + this.d + '}';
    }
}
