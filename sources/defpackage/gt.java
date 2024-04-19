package defpackage;
/* compiled from: DisplayCutoutCompat.java */
/* renamed from: gt  reason: default package */
/* loaded from: classes3.dex */
public final class gt {
    private final Object a;

    private gt(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return gm.a(this.a, ((gt) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gt a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new gt(obj);
    }
}
