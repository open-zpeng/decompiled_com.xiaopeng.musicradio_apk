package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PointKeyframeAnimation.java */
/* renamed from: og  reason: default package */
/* loaded from: classes3.dex */
public class og extends oc<PointF> {
    private final PointF c;

    public og(List<sd<PointF>> list) {
        super(list);
        this.c = new PointF();
    }

    @Override // defpackage.nx
    /* renamed from: b */
    public PointF a(sd<PointF> sdVar, float f) {
        PointF pointF;
        if (sdVar.a == null || sdVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = sdVar.a;
        PointF pointF3 = sdVar.b;
        if (this.b == null || (pointF = (PointF) this.b.a(sdVar.d, sdVar.e.floatValue(), pointF2, pointF3, f, c(), f())) == null) {
            this.c.set(pointF2.x + ((pointF3.x - pointF2.x) * f), pointF2.y + (f * (pointF3.y - pointF2.y)));
            return this.c;
        }
        return pointF;
    }
}
