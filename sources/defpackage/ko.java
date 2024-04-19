package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi21.java */
/* renamed from: ko  reason: default package */
/* loaded from: classes3.dex */
class ko extends kn {
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public void a(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public void b(View view, Matrix matrix) {
        if (c) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }
}
