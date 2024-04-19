package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import defpackage.wn;
/* compiled from: CircularRevealCardView.java */
/* renamed from: wo  reason: default package */
/* loaded from: classes3.dex */
public class wo extends wh implements wn {
    private final wm a;

    @Override // defpackage.wn
    public void a() {
        this.a.a();
    }

    @Override // defpackage.wn
    public void b() {
        this.a.b();
    }

    @Override // defpackage.wn
    public void setRevealInfo(wn.d dVar) {
        this.a.a(dVar);
    }

    @Override // defpackage.wn
    public wn.d getRevealInfo() {
        return this.a.c();
    }

    @Override // defpackage.wn
    public void setCircularRevealScrimColor(int i) {
        this.a.a(i);
    }

    @Override // defpackage.wn
    public int getCircularRevealScrimColor() {
        return this.a.d();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.a.e();
    }

    @Override // defpackage.wn
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        wm wmVar = this.a;
        if (wmVar != null) {
            wmVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // defpackage.wm.a
    public void a(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        wm wmVar = this.a;
        if (wmVar != null) {
            return wmVar.f();
        }
        return super.isOpaque();
    }

    @Override // defpackage.wm.a
    public boolean c() {
        return super.isOpaque();
    }
}
