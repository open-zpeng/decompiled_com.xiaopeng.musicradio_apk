package defpackage;

import android.graphics.PointF;
import java.util.Collections;
/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* renamed from: oj  reason: default package */
/* loaded from: classes3.dex */
public class oj extends nx<PointF, PointF> {
    private final PointF c;
    private final nx<Float, Float> d;
    private final nx<Float, Float> e;

    public oj(nx<Float, Float> nxVar, nx<Float, Float> nxVar2) {
        super(Collections.emptyList());
        this.c = new PointF();
        this.d = nxVar;
        this.e = nxVar2;
        a(f());
    }

    @Override // defpackage.nx
    public void a(float f) {
        this.d.a(f);
        this.e.a(f);
        this.c.set(this.d.e().floatValue(), this.e.e().floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    @Override // defpackage.nx
    /* renamed from: g */
    public PointF e() {
        return a(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.nx
    /* renamed from: b */
    public PointF a(sd<PointF> sdVar, float f) {
        return this.c;
    }
}
