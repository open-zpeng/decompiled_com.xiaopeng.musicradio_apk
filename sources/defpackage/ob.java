package defpackage;

import java.util.List;
/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: ob  reason: default package */
/* loaded from: classes3.dex */
public class ob extends oc<Integer> {
    public ob(List<sd<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.nx
    /* renamed from: b */
    public Integer a(sd<Integer> sdVar, float f) {
        Integer num;
        if (sdVar.a == null || sdVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        return (this.b == null || (num = (Integer) this.b.a(sdVar.d, sdVar.e.floatValue(), sdVar.a, sdVar.b, f, c(), f())) == null) ? Integer.valueOf(sb.a(sdVar.a.intValue(), sdVar.b.intValue(), f)) : num;
    }
}
