package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
/* compiled from: Insets.java */
/* renamed from: fe  reason: default package */
/* loaded from: classes3.dex */
public final class fe {
    public static final fe a = new fe(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private fe(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static fe a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return a;
        }
        return new fe(i, i2, i3, i4);
    }

    public static fe a(Rect rect) {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static fe a(fe feVar, fe feVar2) {
        return a(Math.max(feVar.b, feVar2.b), Math.max(feVar.c, feVar2.c), Math.max(feVar.d, feVar2.d), Math.max(feVar.e, feVar2.e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fe feVar = (fe) obj;
        return this.e == feVar.e && this.b == feVar.b && this.d == feVar.d && this.c == feVar.c;
    }

    public int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }

    public static fe a(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }
}
