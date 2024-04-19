package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
/* compiled from: ImageLayer.java */
/* renamed from: qe  reason: default package */
/* loaded from: classes3.dex */
public class qe extends qc {
    private final Paint e;
    private final Rect f;
    private final Rect g;
    private nx<ColorFilter, ColorFilter> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qe(f fVar, qf qfVar) {
        super(fVar, qfVar);
        this.e = new Paint(3);
        this.f = new Rect();
        this.g = new Rect();
    }

    @Override // defpackage.qc
    public void b(Canvas canvas, Matrix matrix, int i) {
        Bitmap f = f();
        if (f == null || f.isRecycled()) {
            return;
        }
        float a = sc.a();
        this.e.setAlpha(i);
        nx<ColorFilter, ColorFilter> nxVar = this.h;
        if (nxVar != null) {
            this.e.setColorFilter(nxVar.e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f.set(0, 0, f.getWidth(), f.getHeight());
        this.g.set(0, 0, (int) (f.getWidth() * a), (int) (f.getHeight() * a));
        canvas.drawBitmap(f, this.f, this.g, this.e);
        canvas.restore();
    }

    @Override // defpackage.qc, defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        Bitmap f = f();
        if (f != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, f.getWidth()), Math.min(rectF.bottom, f.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    private Bitmap f() {
        return this.b.b(this.c.g());
    }

    @Override // defpackage.qc, defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        super.a((qe) t, (sf<qe>) sfVar);
        if (t == j.x) {
            if (sfVar == null) {
                this.h = null;
            } else {
                this.h = new om(sfVar);
            }
        }
    }
}
