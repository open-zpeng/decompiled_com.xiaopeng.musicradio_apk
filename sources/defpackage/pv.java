package defpackage;

import com.airbnb.lottie.f;
/* compiled from: Repeater.java */
/* renamed from: pv  reason: default package */
/* loaded from: classes3.dex */
public class pv implements pm {
    private final String a;
    private final oy b;
    private final oy c;
    private final pi d;

    public pv(String str, oy oyVar, oy oyVar2, pi piVar) {
        this.a = str;
        this.b = oyVar;
        this.c = oyVar2;
        this.d = piVar;
    }

    public String a() {
        return this.a;
    }

    public oy b() {
        return this.b;
    }

    public oy c() {
        return this.c;
    }

    public pi d() {
        return this.d;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nt(fVar, qcVar, this);
    }
}
