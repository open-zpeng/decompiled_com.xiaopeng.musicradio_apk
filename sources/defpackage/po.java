package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.f;
/* compiled from: GradientFill.java */
/* renamed from: po  reason: default package */
/* loaded from: classes3.dex */
public class po implements pm {
    private final pq a;
    private final Path.FillType b;
    private final oz c;
    private final pa d;
    private final pc e;
    private final pc f;
    private final String g;
    private final oy h;
    private final oy i;

    public po(String str, pq pqVar, Path.FillType fillType, oz ozVar, pa paVar, pc pcVar, pc pcVar2, oy oyVar, oy oyVar2) {
        this.a = pqVar;
        this.b = fillType;
        this.c = ozVar;
        this.d = paVar;
        this.e = pcVar;
        this.f = pcVar2;
        this.g = str;
        this.h = oyVar;
        this.i = oyVar2;
    }

    public String a() {
        return this.g;
    }

    public pq b() {
        return this.a;
    }

    public Path.FillType c() {
        return this.b;
    }

    public oz d() {
        return this.c;
    }

    public pa e() {
        return this.d;
    }

    public pc f() {
        return this.e;
    }

    public pc g() {
        return this.f;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nl(fVar, qcVar, this);
    }
}
