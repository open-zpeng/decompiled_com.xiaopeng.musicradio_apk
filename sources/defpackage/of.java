package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PathKeyframeAnimation.java */
/* renamed from: of  reason: default package */
/* loaded from: classes3.dex */
public class of extends oc<PointF> {
    private final PointF c;
    private final float[] d;
    private oe e;
    private PathMeasure f;

    public of(List<? extends sd<PointF>> list) {
        super(list);
        this.c = new PointF();
        this.d = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nx
    /* renamed from: b */
    public PointF a(sd<PointF> sdVar, float f) {
        PointF pointF;
        oe oeVar = (oe) sdVar;
        Path a = oeVar.a();
        if (a == null) {
            return sdVar.a;
        }
        if (this.b == null || (pointF = (PointF) this.b.a(oeVar.d, oeVar.e.floatValue(), oeVar.a, oeVar.b, c(), f, f())) == null) {
            if (this.e != oeVar) {
                this.f = new PathMeasure(a, false);
                this.e = oeVar;
            }
            PathMeasure pathMeasure = this.f;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.d, null);
            PointF pointF2 = this.c;
            float[] fArr = this.d;
            pointF2.set(fArr[0], fArr[1]);
            return this.c;
        }
        return pointF;
    }
}
