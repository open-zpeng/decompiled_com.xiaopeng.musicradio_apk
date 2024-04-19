package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.be;
/* compiled from: CardViewApi17Impl.java */
/* renamed from: ay  reason: default package */
/* loaded from: classes2.dex */
class ay extends ba {
    @Override // defpackage.ba, defpackage.bc
    public void a() {
        be.a = new be.a() { // from class: ay.1
            @Override // defpackage.be.a
            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
