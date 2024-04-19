package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* compiled from: ViewUtilsApi23.java */
/* renamed from: kq  reason: default package */
/* loaded from: classes3.dex */
class kq extends kp {
    private static boolean a = true;

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
