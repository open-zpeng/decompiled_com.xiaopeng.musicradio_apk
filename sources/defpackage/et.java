package defpackage;

import android.content.LocusId;
/* compiled from: LocusIdCompat.java */
/* renamed from: et  reason: default package */
/* loaded from: classes3.dex */
public final class et {
    private final String a;
    private final LocusId b;

    public int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            et etVar = (et) obj;
            String str = this.a;
            if (str == null) {
                return etVar.a == null;
            }
            return str.equals(etVar.a);
        }
        return false;
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }

    public LocusId a() {
        return this.b;
    }

    private String b() {
        int length = this.a.length();
        return length + "_chars";
    }
}
