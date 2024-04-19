package com.xiaopeng.musicradio.datalist;
/* compiled from: DataListReq.java */
/* loaded from: classes.dex */
public class e {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public int f;

    public e(int i, int i2, boolean z, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = j;
        this.f = i4;
    }

    public String toString() {
        return "DataListReq{type=" + this.a + ", reqId=" + this.b + ", more=" + this.c + ", page=" + this.d + ", ts=" + this.e + ", pageSize=" + this.f + '}';
    }
}
