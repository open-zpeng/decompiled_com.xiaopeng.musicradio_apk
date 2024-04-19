package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.f;
import com.airbnb.lottie.j;
/* compiled from: SolidLayer.java */
/* renamed from: qi  reason: default package */
/* loaded from: classes3.dex */
public class qi extends qc {
    private final RectF e;
    private final Paint f;
    private final float[] g;
    private final Path h;
    private final qf i;
    private nx<ColorFilter, ColorFilter> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qi(f fVar, qf qfVar) {
        super(fVar, qfVar);
        this.e = new RectF();
        this.f = new Paint();
        this.g = new float[8];
        this.h = new Path();
        this.i = qfVar;
        this.f.setAlpha(0);
        this.f.setStyle(Paint.Style.FILL);
        this.f.setColor(qfVar.p());
    }

    @Override // defpackage.qc
    public void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.i.p());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * this.d.a().e().intValue()) / 100.0f) * 255.0f);
        this.f.setAlpha(intValue);
        nx<ColorFilter, ColorFilter> nxVar = this.j;
        if (nxVar != null) {
            this.f.setColorFilter(nxVar.e());
        }
        if (intValue > 0) {
            float[] fArr = this.g;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.i.r();
            float[] fArr2 = this.g;
            fArr2[3] = 0.0f;
            fArr2[4] = this.i.r();
            this.g[5] = this.i.q();
            float[] fArr3 = this.g;
            fArr3[6] = 0.0f;
            fArr3[7] = this.i.q();
            matrix.mapPoints(this.g);
            this.h.reset();
            Path path = this.h;
            float[] fArr4 = this.g;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.h;
            float[] fArr5 = this.g;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.h;
            float[] fArr6 = this.g;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.h;
            float[] fArr7 = this.g;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.h;
            float[] fArr8 = this.g;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.h.close();
            canvas.drawPath(this.h, this.f);
        }
    }

    @Override // defpackage.qc, defpackage.ni
    public void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.e.set(0.0f, 0.0f, this.i.r(), this.i.q());
        this.a.mapRect(this.e);
        rectF.set(this.e);
    }

    @Override // defpackage.qc, defpackage.ou
    public <T> void a(T t, sf<T> sfVar) {
        super.a((qi) t, (sf<qi>) sfVar);
        if (t == j.x) {
            if (sfVar == null) {
                this.j = null;
            } else {
                this.j = new om(sfVar);
            }
        }
    }
}
