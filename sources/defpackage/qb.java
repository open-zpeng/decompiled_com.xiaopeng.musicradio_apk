package defpackage;

import com.airbnb.lottie.f;
/* compiled from: ShapeTrimPath.java */
/* renamed from: qb  reason: default package */
/* loaded from: classes3.dex */
public class qb implements pm {
    private final String a;
    private final a b;
    private final oy c;
    private final oy d;
    private final oy e;

    /* compiled from: ShapeTrimPath.java */
    /* renamed from: qb$a */
    /* loaded from: classes3.dex */
    public enum a {
        Simultaneously,
        Individually;

        public static a a(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    throw new IllegalArgumentException("Unknown trim path type " + i);
            }
        }
    }

    public qb(String str, a aVar, oy oyVar, oy oyVar2, oy oyVar3) {
        this.a = str;
        this.b = aVar;
        this.c = oyVar;
        this.d = oyVar2;
        this.e = oyVar3;
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public oy c() {
        return this.d;
    }

    public oy d() {
        return this.c;
    }

    public oy e() {
        return this.e;
    }

    @Override // defpackage.pm
    public ng a(f fVar, qc qcVar) {
        return new nw(qcVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
