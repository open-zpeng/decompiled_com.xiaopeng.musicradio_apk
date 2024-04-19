package defpackage;

import java.util.List;
/* compiled from: GradientColorKeyframeAnimation.java */
/* renamed from: oa  reason: default package */
/* loaded from: classes3.dex */
public class oa extends oc<pn> {
    private final pn c;

    public oa(List<sd<pn>> list) {
        super(list);
        pn pnVar = list.get(0).a;
        int c = pnVar != null ? pnVar.c() : 0;
        this.c = new pn(new float[c], new int[c]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.nx
    /* renamed from: b */
    public pn a(sd<pn> sdVar, float f) {
        this.c.a(sdVar.a, sdVar.b, f);
        return this.c;
    }
}
