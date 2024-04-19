package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AbsoluteCornerSize.java */
/* renamed from: xi  reason: default package */
/* loaded from: classes3.dex */
public final class xi implements xk {
    private final float a;

    public xi(float f) {
        this.a = f;
    }

    @Override // defpackage.xk
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi) && this.a == ((xi) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
