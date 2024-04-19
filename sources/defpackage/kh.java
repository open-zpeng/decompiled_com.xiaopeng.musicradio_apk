package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
/* compiled from: ViewGroupUtils.java */
/* renamed from: kh  reason: default package */
/* loaded from: classes3.dex */
class kh {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kg a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new kf(viewGroup);
        }
        return ke.a(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (Build.VERSION.SDK_INT >= 18) {
            b(viewGroup, z);
        } else {
            ki.a(viewGroup, z);
        }
    }

    @SuppressLint({"NewApi"})
    private static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
