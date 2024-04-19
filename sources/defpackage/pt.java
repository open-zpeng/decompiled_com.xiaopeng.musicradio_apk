package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.f;
/* compiled from: PolystarShape.java */
/* renamed from: pt  reason: default package */
/* loaded from: classes3.dex */
public class pt implements pm {
    private final String a;
    private final a b;
    private final oy c;
    private final pj<PointF, PointF> d;
    private final oy e;
    private final oy f;
    private final oy g;
    private final oy h;
    private final oy i;

    /* compiled from: PolystarShape.java */
    /* renamed from: pt$a */
    /* loaded from: classes3.dex */
    public enum a {
        Star(1),
        Polygon(2);
        
        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public pt(String str, a aVar, oy oyVar, pj<PointF, PointF> pjVar, oy oyVar2, oy oyVar3, oy oyVar4, oy oyVar5, oy oyVar6) {
        this.a = str;
        this.b = aVar;
        this.c = oyVar;
        this.d = pjVar;
        this.e = oyVar2;
        this.f = oyVar3;
        this.g = oyVar4;
        this.h = oyVar5;
        this.i = oyVar6;
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public oy c() {
        return this.c;
    }

    public pj<PointF, PointF> d() {
        return this.d;
    }

    public oy e() {
        return this.e;
    }

    public oy f() {
        return this.f;
    }

    public oy g() {
        return this.g;
    }

    public oy h() {
        return this.h;
    }

    public oy i() {
        return this.i;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nr(fVar, qcVar, this);
    }
}
