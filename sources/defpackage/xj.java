package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AdjustedCornerSize.java */
/* renamed from: xj  reason: default package */
/* loaded from: classes3.dex */
public final class xj implements xk {
    private final xk a;
    private final float b;

    public xj(float f, xk xkVar) {
        while (xkVar instanceof xj) {
            xkVar = ((xj) xkVar).a;
            f += ((xj) xkVar).b;
        }
        this.a = xkVar;
        this.b = f;
    }

    @Override // defpackage.xk
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xj) {
            xj xjVar = (xj) obj;
            return this.a.equals(xjVar.a) && this.b == xjVar.b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
