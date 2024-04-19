package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d;
/* compiled from: PathKeyframe.java */
/* renamed from: oe  reason: default package */
/* loaded from: classes3.dex */
public class oe extends sd<PointF> {
    private Path h;

    public oe(d dVar, sd<PointF> sdVar) {
        super(dVar, sdVar.a, sdVar.b, sdVar.c, sdVar.d, sdVar.e);
        boolean z = (this.b == 0 || this.a == 0 || !((PointF) this.a).equals(((PointF) this.b).x, ((PointF) this.b).y)) ? false : true;
        if (this.b == 0 || z) {
            return;
        }
        this.h = sc.a((PointF) this.a, (PointF) this.b, sdVar.f, sdVar.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a() {
        return this.h;
    }
}
