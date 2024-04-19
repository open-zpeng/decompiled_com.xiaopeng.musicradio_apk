package defpackage;

import java.util.List;
/* compiled from: ScaleKeyframeAnimation.java */
/* renamed from: oh  reason: default package */
/* loaded from: classes3.dex */
public class oh extends oc<sg> {
    public oh(List<sd<sg>> list) {
        super(list);
    }

    @Override // defpackage.nx
    /* renamed from: b */
    public sg a(sd<sg> sdVar, float f) {
        sg sgVar;
        if (sdVar.a == null || sdVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        sg sgVar2 = sdVar.a;
        sg sgVar3 = sdVar.b;
        return (this.b == null || (sgVar = (sg) this.b.a(sdVar.d, sdVar.e.floatValue(), sgVar2, sgVar3, f, c(), f())) == null) ? new sg(sb.a(sgVar2.a(), sgVar3.a(), f), sb.a(sgVar2.b(), sgVar3.b(), f)) : sgVar;
    }
}
