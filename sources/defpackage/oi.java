package defpackage;

import android.graphics.Path;
import java.util.List;
/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: oi  reason: default package */
/* loaded from: classes3.dex */
public class oi extends nx<pw, Path> {
    private final pw c;
    private final Path d;

    public oi(List<sd<pw>> list) {
        super(list);
        this.c = new pw();
        this.d = new Path();
    }

    @Override // defpackage.nx
    /* renamed from: b */
    public Path a(sd<pw> sdVar, float f) {
        this.c.a(sdVar.a, sdVar.b, f);
        sb.a(this.c, this.d);
        return this.d;
    }
}
