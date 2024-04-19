package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: ViewUtilsApi19.java */
/* renamed from: kn  reason: default package */
/* loaded from: classes3.dex */
class kn extends ks {
    private static boolean a = true;

    @Override // defpackage.ks
    public void b(View view) {
    }

    @Override // defpackage.ks
    public void c(View view) {
    }

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public void a(View view, float f) {
        if (a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public float a(View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }
}
