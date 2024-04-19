package defpackage;

import android.graphics.PointF;
/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: pf  reason: default package */
/* loaded from: classes3.dex */
public class pf implements pj<PointF, PointF> {
    private final oy a;
    private final oy b;

    public pf(oy oyVar, oy oyVar2) {
        this.a = oyVar;
        this.b = oyVar2;
    }

    @Override // defpackage.pj
    public nx<PointF, PointF> a() {
        return new oj(this.a.a(), this.b.a());
    }
}
