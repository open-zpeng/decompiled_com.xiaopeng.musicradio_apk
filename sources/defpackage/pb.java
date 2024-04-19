package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
/* compiled from: AnimatablePathValue.java */
/* renamed from: pb  reason: default package */
/* loaded from: classes3.dex */
public class pb implements pj<PointF, PointF> {
    private final List<sd<PointF>> a;

    public pb() {
        this.a = Collections.singletonList(new sd(new PointF(0.0f, 0.0f)));
    }

    public pb(List<sd<PointF>> list) {
        this.a = list;
    }

    @Override // defpackage.pj
    public nx<PointF, PointF> a() {
        if (this.a.get(0).d()) {
            return new og(this.a);
        }
        return new of(this.a);
    }
}
