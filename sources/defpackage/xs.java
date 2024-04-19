package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: RelativeCornerSize.java */
/* renamed from: xs  reason: default package */
/* loaded from: classes3.dex */
public final class xs implements xk {
    private final float a;

    public xs(float f) {
        this.a = f;
    }

    @Override // defpackage.xk
    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs) && this.a == ((xs) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
