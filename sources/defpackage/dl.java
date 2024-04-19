package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* renamed from: dl  reason: default package */
/* loaded from: classes3.dex */
public class dl {
    public static int a;
    Cdo d;
    Cdo e;
    int g;
    int h;
    public int b = 0;
    public boolean c = false;
    ArrayList<Cdo> f = new ArrayList<>();

    public dl(Cdo cdo, int i) {
        this.d = null;
        this.e = null;
        this.g = 0;
        int i2 = a;
        this.g = i2;
        a = i2 + 1;
        this.d = cdo;
        this.e = cdo;
        this.h = i;
    }

    public void a(Cdo cdo) {
        this.f.add(cdo);
        this.e = cdo;
    }

    private long a(de deVar, long j) {
        Cdo cdo = deVar.d;
        if (cdo instanceof dj) {
            return j;
        }
        int size = deVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dc dcVar = deVar.k.get(i);
            if (dcVar instanceof de) {
                de deVar2 = (de) dcVar;
                if (deVar2.d != cdo) {
                    j2 = Math.max(j2, a(deVar2, deVar2.f + j));
                }
            }
        }
        if (deVar == cdo.j) {
            long b = j + cdo.b();
            return Math.max(Math.max(j2, a(cdo.k, b)), b - cdo.k.f);
        }
        return j2;
    }

    private long b(de deVar, long j) {
        Cdo cdo = deVar.d;
        if (cdo instanceof dj) {
            return j;
        }
        int size = deVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dc dcVar = deVar.k.get(i);
            if (dcVar instanceof de) {
                de deVar2 = (de) dcVar;
                if (deVar2.d != cdo) {
                    j2 = Math.min(j2, b(deVar2, deVar2.f + j));
                }
            }
        }
        if (deVar == cdo.k) {
            long b = j - cdo.b();
            return Math.min(Math.min(j2, b(cdo.j, b)), b - cdo.j.f);
        }
        return j2;
    }

    public long a(cr crVar, int i) {
        Cdo cdo = this.d;
        if (cdo instanceof db) {
            if (((db) cdo).h != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(cdo instanceof dk)) {
                return 0L;
            }
        } else if (!(cdo instanceof dm)) {
            return 0L;
        }
        de deVar = i == 0 ? crVar.f.j : crVar.g.j;
        de deVar2 = i == 0 ? crVar.f.k : crVar.g.k;
        boolean contains = this.d.j.l.contains(deVar);
        boolean contains2 = this.d.k.l.contains(deVar2);
        long b = this.d.b();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(a(this.d.j, this.d.j.f), this.d.j.f + b);
            }
            if (contains2) {
                return Math.max(-b(this.d.k, this.d.k.f), (-this.d.k.f) + b);
            }
            return (this.d.j.f + this.d.b()) - this.d.k.f;
        }
        long a2 = a(this.d.j, 0L);
        long b2 = b(this.d.k, 0L);
        long j = a2 - b;
        if (j >= (-this.d.k.f)) {
            j += this.d.k.f;
        }
        long j2 = ((-b2) - b) - this.d.j.f;
        if (j2 >= this.d.j.f) {
            j2 -= this.d.j.f;
        }
        float n = this.d.d.n(i);
        float f = (float) (n > 0.0f ? (((float) j2) / n) + (((float) j) / (1.0f - n)) : 0L);
        return (this.d.j.f + ((((f * n) + 0.5f) + b) + ((f * (1.0f - n)) + 0.5f))) - this.d.k.f;
    }
}
