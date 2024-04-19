package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
/* compiled from: ViewUtilsApi22.java */
/* renamed from: kp  reason: default package */
/* loaded from: classes3.dex */
class kp extends ko {
    private static boolean a = true;

    @Override // defpackage.ks
    @SuppressLint({"NewApi"})
    public void a(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
