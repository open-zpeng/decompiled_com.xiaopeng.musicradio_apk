package defpackage;

import java.util.List;
/* compiled from: FloatKeyframeAnimation.java */
/* renamed from: nz  reason: default package */
/* loaded from: classes3.dex */
public class nz extends oc<Float> {
    public nz(List<sd<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.nx
    /* renamed from: b */
    public Float a(sd<Float> sdVar, float f) {
        Float f2;
        if (sdVar.a == null || sdVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        return (this.b == null || (f2 = (Float) this.b.a(sdVar.d, sdVar.e.floatValue(), sdVar.a, sdVar.b, f, c(), f())) == null) ? Float.valueOf(sb.a(sdVar.a.floatValue(), sdVar.b.floatValue(), f)) : f2;
    }
}
