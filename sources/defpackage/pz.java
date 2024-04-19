package defpackage;

import com.airbnb.lottie.f;
/* compiled from: ShapePath.java */
/* renamed from: pz  reason: default package */
/* loaded from: classes3.dex */
public class pz implements pm {
    private final String a;
    private final int b;
    private final pe c;

    public pz(String str, int i, pe peVar) {
        this.a = str;
        this.b = i;
        this.c = peVar;
    }

    public String a() {
        return this.a;
    }

    public pe b() {
        return this.c;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nu(fVar, qcVar, this);
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
