package com.xiaopeng.musicradio.datalist;

import java.util.LinkedList;
import java.util.List;
/* compiled from: DataListResp.java */
/* loaded from: classes.dex */
public class f<T> {
    public int d;
    public int e;
    public int f;
    public final int g;
    public long h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public boolean n;
    public List<T> o;
    public String p;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(e eVar) {
        this.j = eVar.a;
        this.k = eVar.b;
        this.l = eVar.c;
        this.i = eVar.e;
        this.g = eVar.d;
        this.m = eVar.f;
    }

    public static f a(e eVar, String str) {
        f fVar = new f(eVar);
        fVar.o = new LinkedList();
        fVar.p = str;
        return fVar;
    }

    public static f a(e eVar, boolean z, long j, List list, String str) {
        f fVar = new f(eVar);
        fVar.n = z;
        fVar.h = j;
        fVar.o = list;
        fVar.p = str;
        return fVar;
    }

    public static f a(e eVar, List list, String str) {
        f fVar = new f(eVar);
        fVar.n = false;
        fVar.o = list;
        fVar.p = str;
        return fVar;
    }

    public static f a(e eVar, boolean z, int i, int i2, List list, String str) {
        return a(eVar, z, i, i2, 0, list, str);
    }

    public static f a(e eVar, boolean z, int i, int i2, int i3, List list, String str) {
        f fVar = new f(eVar);
        fVar.n = z;
        fVar.d = i;
        fVar.e = i2;
        fVar.f = i3;
        fVar.o = list;
        fVar.p = str;
        return fVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataListResp{nextPage=");
        sb.append(this.d);
        sb.append(", page=");
        sb.append(this.g);
        sb.append(", nextTs=");
        sb.append(this.h);
        sb.append(", ts=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(", reqId=");
        sb.append(this.k);
        sb.append(", totalPage =");
        sb.append(this.e);
        sb.append(", more=");
        sb.append(this.l);
        sb.append(", pageSize=");
        sb.append(this.m);
        sb.append(", hasMore=");
        sb.append(this.n);
        sb.append(", dataList=");
        List<T> list = this.o;
        sb.append(list != null ? list.size() : 0);
        sb.append(", from='");
        sb.append(this.p);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
