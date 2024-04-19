package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;
/* compiled from: CircleShape.java */
/* renamed from: pl  reason: default package */
/* loaded from: classes3.dex */
public class pl implements pm {
    private final String a;
    private final pj<PointF, PointF> b;
    private final pc c;
    private final boolean d;

    public pl(String str, pj<PointF, PointF> pjVar, pc pcVar, boolean z) {
        this.a = str;
        this.b = pjVar;
        this.c = pcVar;
        this.d = z;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nj(fVar, qcVar, this);
    }

    public String a() {
        return this.a;
    }

    public pj<PointF, PointF> b() {
        return this.b;
    }

    public pc c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
