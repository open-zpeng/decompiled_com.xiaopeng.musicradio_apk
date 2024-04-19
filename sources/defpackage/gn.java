package defpackage;
/* compiled from: Pair.java */
/* renamed from: gn  reason: default package */
/* loaded from: classes3.dex */
public class gn<F, S> {
    public final F a;
    public final S b;

    public gn(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            return gm.a(gnVar.a, this.a) && gm.a(gnVar.b, this.b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }

    public static <A, B> gn<A, B> a(A a, B b) {
        return new gn<>(a, b);
    }
}
