package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeData.java */
/* renamed from: pw  reason: default package */
/* loaded from: classes3.dex */
public class pw {
    private final List<op> a = new ArrayList();
    private PointF b;
    private boolean c;

    public pw(PointF pointF, boolean z, List<op> list) {
        this.b = pointF;
        this.c = z;
        this.a.addAll(list);
    }

    public pw() {
    }

    private void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public PointF a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public List<op> c() {
        return this.a;
    }

    public void a(pw pwVar, pw pwVar2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = pwVar.b() || pwVar2.b();
        if (pwVar.c().size() != pwVar2.c().size()) {
            c.b("Curves must have the same number of control points. Shape 1: " + pwVar.c().size() + "\tShape 2: " + pwVar2.c().size());
        }
        if (this.a.isEmpty()) {
            int min = Math.min(pwVar.c().size(), pwVar2.c().size());
            for (int i = 0; i < min; i++) {
                this.a.add(new op());
            }
        }
        PointF a = pwVar.a();
        PointF a2 = pwVar2.a();
        a(sb.a(a.x, a2.x, f), sb.a(a.y, a2.y, f));
        for (int size = this.a.size() - 1; size >= 0; size--) {
            op opVar = pwVar.c().get(size);
            op opVar2 = pwVar2.c().get(size);
            PointF a3 = opVar.a();
            PointF b = opVar.b();
            PointF c = opVar.c();
            PointF a4 = opVar2.a();
            PointF b2 = opVar2.b();
            PointF c2 = opVar2.c();
            this.a.get(size).a(sb.a(a3.x, a4.x, f), sb.a(a3.y, a4.y, f));
            this.a.get(size).b(sb.a(b.x, b2.x, f), sb.a(b.y, b2.y, f));
            this.a.get(size).c(sb.a(c.x, c2.x, f), sb.a(c.y, c2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }
}
