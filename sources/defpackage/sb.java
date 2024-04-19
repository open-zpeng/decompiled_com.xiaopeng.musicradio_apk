package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: MiscUtils.java */
/* renamed from: sb  reason: default package */
/* loaded from: classes3.dex */
public class sb {
    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(pw pwVar, Path path) {
        path.reset();
        PointF a = pwVar.a();
        path.moveTo(a.x, a.y);
        PointF pointF = new PointF(a.x, a.y);
        for (int i = 0; i < pwVar.c().size(); i++) {
            op opVar = pwVar.c().get(i);
            PointF a2 = opVar.a();
            PointF b = opVar.b();
            PointF c = opVar.c();
            if (a2.equals(pointF) && b.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b.x, b.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (pwVar.b()) {
            path.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f, float f2) {
        return a((int) f, (int) f2);
    }

    private static int a(int i, int i2) {
        return i - (i2 * b(i, i2));
    }

    private static int b(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void a(ot otVar, int i, List<ot> list, ot otVar2, no noVar) {
        if (otVar.c(noVar.b(), i)) {
            list.add(otVar2.a(noVar.b()).a(noVar));
        }
    }
}
