package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.t;
/* compiled from: MaterialShapeUtils.java */
/* renamed from: xq  reason: default package */
/* loaded from: classes3.dex */
public class xq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static xl a(int i) {
        switch (i) {
            case 0:
                return new xt();
            case 1:
                return new xm();
            default:
                return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xl a() {
        return new xt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static xn b() {
        return new xn();
    }

    public static void a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            ((xp) background).r(f);
        }
    }

    public static void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            a(view, (xp) background);
        }
    }

    public static void a(View view, xp xpVar) {
        if (xpVar.S()) {
            xpVar.q(t.d(view));
        }
    }
}
