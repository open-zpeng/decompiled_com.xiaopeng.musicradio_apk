package defpackage;

import com.airbnb.lottie.d;
import java.util.List;
import java.util.Locale;
/* compiled from: Layer.java */
/* renamed from: qf  reason: default package */
/* loaded from: classes3.dex */
public class qf {
    private final List<pm> a;
    private final d b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<pr> h;
    private final pi i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final pg q;
    private final ph r;
    private final oy s;
    private final List<sd<Float>> t;
    private final b u;

    /* compiled from: Layer.java */
    /* renamed from: qf$a */
    /* loaded from: classes3.dex */
    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    /* compiled from: Layer.java */
    /* renamed from: qf$b */
    /* loaded from: classes3.dex */
    public enum b {
        None,
        Add,
        Invert,
        Unknown
    }

    public qf(List<pm> list, d dVar, String str, long j, a aVar, long j2, String str2, List<pr> list2, pi piVar, int i, int i2, int i3, float f, float f2, int i4, int i5, pg pgVar, ph phVar, List<sd<Float>> list3, b bVar, oy oyVar) {
        this.a = list;
        this.b = dVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = piVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = pgVar;
        this.r = phVar;
        this.t = list3;
        this.u = bVar;
        this.s = oyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.n / this.b.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<sd<Float>> d() {
        return this.t;
    }

    public long e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<pr> j() {
        return this.h;
    }

    public a k() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b l() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<pm> n() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi o() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pg s() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ph t() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oy u() {
        return this.s;
    }

    public String toString() {
        return a("");
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f());
        sb.append("\n");
        qf a2 = this.b.a(m());
        if (a2 != null) {
            sb.append("\t\tParents: ");
            sb.append(a2.f());
            qf a3 = this.b.a(a2.m());
            while (a3 != null) {
                sb.append("->");
                sb.append(a3.f());
                a3 = this.b.a(a3.m());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!j().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(j().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (pm pmVar : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(pmVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
