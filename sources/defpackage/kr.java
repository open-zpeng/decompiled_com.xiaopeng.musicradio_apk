package defpackage;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi29.java */
/* renamed from: kr  reason: default package */
/* loaded from: classes3.dex */
class kr extends kq {
    @Override // defpackage.kn, defpackage.ks
    public void a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.kn, defpackage.ks
    public float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.kq, defpackage.ks
    public void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.kp, defpackage.ks
    public void a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ko, defpackage.ks
    public void a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ko, defpackage.ks
    public void b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
