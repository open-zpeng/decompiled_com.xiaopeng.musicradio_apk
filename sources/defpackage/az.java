package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardViewApi21Impl.java */
/* renamed from: az  reason: default package */
/* loaded from: classes2.dex */
public class az implements bc {
    @Override // defpackage.bc
    public void a() {
    }

    @Override // defpackage.bc
    public void a(bb bbVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        bbVar.a(new bd(colorStateList, f));
        View d = bbVar.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        b(bbVar, f3);
    }

    @Override // defpackage.bc
    public void a(bb bbVar, float f) {
        j(bbVar).a(f);
    }

    @Override // defpackage.bc
    public void b(bb bbVar, float f) {
        j(bbVar).a(f, bbVar.a(), bbVar.b());
        f(bbVar);
    }

    @Override // defpackage.bc
    public float a(bb bbVar) {
        return j(bbVar).a();
    }

    @Override // defpackage.bc
    public float b(bb bbVar) {
        return d(bbVar) * 2.0f;
    }

    @Override // defpackage.bc
    public float c(bb bbVar) {
        return d(bbVar) * 2.0f;
    }

    @Override // defpackage.bc
    public float d(bb bbVar) {
        return j(bbVar).b();
    }

    @Override // defpackage.bc
    public void c(bb bbVar, float f) {
        bbVar.d().setElevation(f);
    }

    @Override // defpackage.bc
    public float e(bb bbVar) {
        return bbVar.d().getElevation();
    }

    @Override // defpackage.bc
    public void f(bb bbVar) {
        if (!bbVar.a()) {
            bbVar.a(0, 0, 0, 0);
            return;
        }
        float a = a(bbVar);
        float d = d(bbVar);
        int ceil = (int) Math.ceil(be.b(a, d, bbVar.b()));
        int ceil2 = (int) Math.ceil(be.a(a, d, bbVar.b()));
        bbVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // defpackage.bc
    public void g(bb bbVar) {
        b(bbVar, a(bbVar));
    }

    @Override // defpackage.bc
    public void h(bb bbVar) {
        b(bbVar, a(bbVar));
    }

    @Override // defpackage.bc
    public void a(bb bbVar, ColorStateList colorStateList) {
        j(bbVar).a(colorStateList);
    }

    @Override // defpackage.bc
    public ColorStateList i(bb bbVar) {
        return j(bbVar).c();
    }

    private bd j(bb bbVar) {
        return (bd) bbVar.c();
    }
}
