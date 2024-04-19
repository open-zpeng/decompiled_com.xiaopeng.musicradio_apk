package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import defpackage.be;
/* compiled from: CardViewBaseImpl.java */
/* renamed from: ba  reason: default package */
/* loaded from: classes2.dex */
class ba implements bc {
    final RectF a = new RectF();

    @Override // defpackage.bc
    public void g(bb bbVar) {
    }

    @Override // defpackage.bc
    public void a() {
        be.a = new be.a() { // from class: ba.1
            @Override // defpackage.be.a
            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    ba.this.a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(ba.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(ba.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(ba.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(ba.this.a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // defpackage.bc
    public void a(bb bbVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        be a = a(context, colorStateList, f, f2, f3);
        a.a(bbVar.b());
        bbVar.a(a);
        f(bbVar);
    }

    private be a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new be(context.getResources(), colorStateList, f, f2, f3);
    }

    @Override // defpackage.bc
    public void f(bb bbVar) {
        Rect rect = new Rect();
        j(bbVar).a(rect);
        bbVar.a((int) Math.ceil(b(bbVar)), (int) Math.ceil(c(bbVar)));
        bbVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // defpackage.bc
    public void h(bb bbVar) {
        j(bbVar).a(bbVar.b());
        f(bbVar);
    }

    @Override // defpackage.bc
    public void a(bb bbVar, ColorStateList colorStateList) {
        j(bbVar).a(colorStateList);
    }

    @Override // defpackage.bc
    public ColorStateList i(bb bbVar) {
        return j(bbVar).f();
    }

    @Override // defpackage.bc
    public void a(bb bbVar, float f) {
        j(bbVar).a(f);
        f(bbVar);
    }

    @Override // defpackage.bc
    public float d(bb bbVar) {
        return j(bbVar).a();
    }

    @Override // defpackage.bc
    public void c(bb bbVar, float f) {
        j(bbVar).b(f);
    }

    @Override // defpackage.bc
    public float e(bb bbVar) {
        return j(bbVar).b();
    }

    @Override // defpackage.bc
    public void b(bb bbVar, float f) {
        j(bbVar).c(f);
        f(bbVar);
    }

    @Override // defpackage.bc
    public float a(bb bbVar) {
        return j(bbVar).c();
    }

    @Override // defpackage.bc
    public float b(bb bbVar) {
        return j(bbVar).d();
    }

    @Override // defpackage.bc
    public float c(bb bbVar) {
        return j(bbVar).e();
    }

    private be j(bb bbVar) {
        return (be) bbVar.c();
    }
}
