package com.xiaopeng.musicradio.datalist;

import java.util.LinkedList;
/* compiled from: DataListErrorResp.java */
/* loaded from: classes.dex */
public class d<T> extends f<T> {
    public boolean a;
    public int b;
    public String c;

    protected d(e eVar) {
        super(eVar);
    }

    public static d a(e eVar, int i, String str, String str2) {
        d dVar = new d(eVar);
        dVar.b = i;
        dVar.c = str;
        dVar.p = str2;
        dVar.o = new LinkedList();
        dVar.h = eVar.e;
        dVar.d = eVar.d;
        return dVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.f
    public String toString() {
        return "DataListErrorResp{error=" + this.a + ", code=" + this.b + ", msg='" + this.c + "', nextPage=" + this.d + ", page=" + this.g + ", nextTs=" + this.h + ", ts=" + this.i + ", type=" + this.j + ", reqId=" + this.k + ", more=" + this.l + ", pageSize=" + this.m + ", hasMore=" + this.n + ", dataList=" + this.o + ", from='" + this.p + "'}";
    }
}
