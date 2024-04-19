package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
/* compiled from: LineScalePulseOutRapidIndicator.java */
/* renamed from: bek  reason: default package */
/* loaded from: classes2.dex */
public class bek extends bej {
    private float c = -1.0f;
    private float d = -1.0f;
    float[] b = {0.6f, 0.8f, 0.7f, 0.5f};
    private RectF e = new RectF(0.0f, -28.0f, 3.0f, 0.0f);
    private int f = 0;

    static /* synthetic */ int b(bek bekVar) {
        int i = bekVar.f;
        bekVar.f = i + 1;
        return i;
    }

    @Override // defpackage.bej
    public ArrayList<ValueAnimator> a() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {400, 100, 300, 200};
        for (final int i = 0; i < this.b.length; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            ofFloat.setDuration(1500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(jArr[i]);
            a(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: bek.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bek.this.b[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (bek.this.f % 60 == 0) {
                        bek.this.f = 0;
                        bek.this.b();
                    }
                    bek.b(bek.this);
                }
            });
            arrayList.add(ofFloat);
        }
        return arrayList;
    }

    @Override // defpackage.bej
    public void a(Canvas canvas, Paint paint) {
        if (this.c == -1.0f) {
            float[] fArr = this.b;
            this.c = ((c() - (fArr.length * 3.0f)) - ((fArr.length - 1) * 4.0f)) / 2.0f;
        }
        if (this.d == -1.0f) {
            this.d = ((d() - 28.0f) / 2.0f) + 28.0f;
        }
        for (int i = 0; i < this.b.length; i++) {
            canvas.save();
            canvas.translate(this.c + (i * 7.0f), this.d);
            canvas.scale(1.0f, this.b[i]);
            canvas.drawRoundRect(this.e, 4.0f, 4.0f, paint);
            canvas.restore();
        }
    }
}
