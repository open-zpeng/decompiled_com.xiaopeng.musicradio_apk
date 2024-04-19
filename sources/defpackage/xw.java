package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapePath.java */
/* renamed from: xw  reason: default package */
/* loaded from: classes3.dex */
public class xw {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<e> g = new ArrayList();
    private final List<f> h = new ArrayList();
    private boolean i;

    /* compiled from: ShapePath.java */
    /* renamed from: xw$e */
    /* loaded from: classes3.dex */
    public static abstract class e {
        protected final Matrix g = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public xw() {
        a(0.0f, 0.0f);
    }

    public void a(float f2, float f3) {
        a(f2, f3, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5) {
        b(f2);
        c(f3);
        d(f2);
        e(f3);
        f(f4);
        g((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public void b(float f2, float f3) {
        d dVar = new d();
        dVar.a = f2;
        dVar.b = f3;
        this.g.add(dVar);
        b bVar = new b(dVar, d(), e());
        a(bVar, bVar.a() + 270.0f, bVar.a() + 270.0f);
        d(f2);
        e(f3);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.e(f6);
        cVar.f(f7);
        this.g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        a(aVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        d(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        e(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f a(Matrix matrix) {
        a(g());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.h);
        return new f() { // from class: xw.1
            @Override // defpackage.xw.f
            public void a(Matrix matrix3, xg xgVar, int i, Canvas canvas) {
                for (f fVar : arrayList) {
                    fVar.a(matrix2, xgVar, i, canvas);
                }
            }
        };
    }

    private void a(f fVar, float f2, float f3) {
        a(f2);
        this.h.add(fVar);
        f(f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.i;
    }

    private void a(float f2) {
        if (f() == f2) {
            return;
        }
        float f3 = ((f2 - f()) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        c cVar = new c(d(), e(), d(), e());
        cVar.e(f());
        cVar.f(f3);
        this.h.add(new a(cVar));
        f(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.d;
    }

    private float f() {
        return this.e;
    }

    private float g() {
        return this.f;
    }

    private void b(float f2) {
        this.a = f2;
    }

    private void c(float f2) {
        this.b = f2;
    }

    private void d(float f2) {
        this.c = f2;
    }

    private void e(float f2) {
        this.d = f2;
    }

    private void f(float f2) {
        this.e = f2;
    }

    private void g(float f2) {
        this.f = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: xw$f */
    /* loaded from: classes3.dex */
    public static abstract class f {
        static final Matrix d = new Matrix();

        public abstract void a(Matrix matrix, xg xgVar, int i, Canvas canvas);

        f() {
        }

        public final void a(xg xgVar, int i, Canvas canvas) {
            a(d, xgVar, i, canvas);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: xw$b */
    /* loaded from: classes3.dex */
    static class b extends f {
        private final d a;
        private final float b;
        private final float c;

        public b(d dVar, float f, float f2) {
            this.a = dVar;
            this.b = f;
            this.c = f2;
        }

        @Override // defpackage.xw.f
        public void a(Matrix matrix, xg xgVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.a.b - this.c, this.a.a - this.b), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.b, this.c);
            matrix2.preRotate(a());
            xgVar.a(canvas, matrix2, rectF, i);
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.a.b - this.c) / (this.a.a - this.b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: xw$a */
    /* loaded from: classes3.dex */
    public static class a extends f {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.xw.f
        public void a(Matrix matrix, xg xgVar, int i, Canvas canvas) {
            xgVar.a(canvas, matrix, new RectF(this.a.a(), this.a.b(), this.a.c(), this.a.d()), i, this.a.e(), this.a.f());
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: xw$d */
    /* loaded from: classes3.dex */
    public static class d extends e {
        private float a;
        private float b;

        @Override // defpackage.xw.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.a, this.b);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: xw$c */
    /* loaded from: classes3.dex */
    public static class c extends e {
        private static final RectF h = new RectF();
        @Deprecated
        public float a;
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;

        public c(float f, float f2, float f3, float f4) {
            a(f);
            b(f2);
            c(f3);
            d(f4);
        }

        @Override // defpackage.xw.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(a(), b(), c(), d());
            path.arcTo(h, e(), f(), false);
            path.transform(matrix);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float a() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float c() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float d() {
            return this.d;
        }

        private void a(float f) {
            this.a = f;
        }

        private void b(float f) {
            this.b = f;
        }

        private void c(float f) {
            this.c = f;
        }

        private void d(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float e() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float f() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(float f) {
            this.e = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(float f) {
            this.f = f;
        }
    }
}
