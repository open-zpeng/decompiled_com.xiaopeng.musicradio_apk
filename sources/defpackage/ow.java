package defpackage;
/* compiled from: MutablePair.java */
/* renamed from: ow  reason: default package */
/* loaded from: classes3.dex */
public class ow<T> {
    T a;
    T b;

    public void a(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            return b(gnVar.a, this.a) && b(gnVar.b, this.b);
        }
        return false;
    }

    private static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
