package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
/* compiled from: ShapeAppearancePathProvider.java */
/* renamed from: xv  reason: default package */
/* loaded from: classes3.dex */
public class xv {
    private final xw[] a = new xw[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final xw g = new xw();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: xv$a */
    /* loaded from: classes3.dex */
    public static class a {
        static final xv a = new xv();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: xv$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a(xw xwVar, Matrix matrix, int i);

        void b(xw xwVar, Matrix matrix, int i);
    }

    private float b(int i) {
        return (i + 1) * 90;
    }

    public xv() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new xw();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static xv a() {
        return a.a;
    }

    public void a(xu xuVar, float f, RectF rectF, Path path) {
        a(xuVar, f, rectF, null, path);
    }

    public void a(xu xuVar, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(xuVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            a(cVar, i);
            a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT < 19 || this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    private void a(c cVar, int i) {
        a(i, cVar.a).a(this.a[i], 90.0f, cVar.e, cVar.c, b(i, cVar.a));
        float b2 = b(i);
        this.b[i].reset();
        a(i, cVar.c, this.d);
        this.b[i].setTranslate(this.d.x, this.d.y);
        this.b[i].preRotate(b2);
    }

    private void a(int i) {
        this.h[0] = this.a[i].d();
        this.h[1] = this.a[i].e();
        this.b[i].mapPoints(this.h);
        float b2 = b(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(b2);
    }

    private void b(c cVar, int i) {
        this.h[0] = this.a[i].b();
        this.h[1] = this.a[i].c();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].a(this.b[i], cVar.b);
        if (cVar.d != null) {
            cVar.d.a(this.a[i], this.b[i], i);
        }
    }

    private void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].d();
        this.h[1] = this.a[i].e();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].b();
        this.i[1] = this.a[i2].c();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float a2 = a(cVar.c, i);
        this.g.a(0.0f, 0.0f);
        xn c2 = c(i, cVar.a);
        c2.a(max, a2, cVar.e, this.g);
        this.j.reset();
        this.g.a(this.c[i], this.j);
        if (this.l && Build.VERSION.SDK_INT >= 19 && (c2.e() || a(this.j, i) || a(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.b();
            this.h[1] = this.g.c();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.a(this.c[i], this.e);
        } else {
            this.g.a(this.c[i], cVar.b);
        }
        if (cVar.d != null) {
            cVar.d.b(this.g, this.c[i], i);
        }
    }

    private boolean a(Path path, int i) {
        this.k.reset();
        this.a[i].a(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private float a(RectF rectF, int i) {
        this.h[0] = this.a[i].c;
        this.h[1] = this.a[i].d;
        this.b[i].mapPoints(this.h);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.h[0]);
        }
        return Math.abs(rectF.centerY() - this.h[1]);
    }

    private xl a(int i, xu xuVar) {
        switch (i) {
            case 1:
                return xuVar.d();
            case 2:
                return xuVar.e();
            case 3:
                return xuVar.b();
            default:
                return xuVar.c();
        }
    }

    private xk b(int i, xu xuVar) {
        switch (i) {
            case 1:
                return xuVar.h();
            case 2:
                return xuVar.i();
            case 3:
                return xuVar.f();
            default:
                return xuVar.g();
        }
    }

    private xn c(int i, xu xuVar) {
        switch (i) {
            case 1:
                return xuVar.m();
            case 2:
                return xuVar.j();
            case 3:
                return xuVar.k();
            default:
                return xuVar.l();
        }
    }

    private void a(int i, RectF rectF, PointF pointF) {
        switch (i) {
            case 1:
                pointF.set(rectF.right, rectF.bottom);
                return;
            case 2:
                pointF.set(rectF.left, rectF.bottom);
                return;
            case 3:
                pointF.set(rectF.left, rectF.top);
                return;
            default:
                pointF.set(rectF.right, rectF.top);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* renamed from: xv$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public final xu a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        c(xu xuVar, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = xuVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }
}
