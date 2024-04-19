package defpackage;

import java.util.List;
/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: ny  reason: default package */
/* loaded from: classes3.dex */
public class ny extends oc<Integer> {
    public ny(List<sd<Integer>> list) {
        super(list);
    }

    @Override // defpackage.nx
    /* renamed from: b */
    public Integer a(sd<Integer> sdVar, float f) {
        Integer num;
        if (sdVar.a == null || sdVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = sdVar.a.intValue();
        int intValue2 = sdVar.b.intValue();
        return (this.b == null || (num = (Integer) this.b.a(sdVar.d, sdVar.e.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, c(), f())) == null) ? Integer.valueOf(ry.a(f, intValue, intValue2)) : num;
    }
}
