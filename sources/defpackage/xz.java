package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.t;
import defpackage.yb;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabIndicatorInterpolator.java */
/* renamed from: xz  reason: default package */
/* loaded from: classes3.dex */
public class xz {
    static RectF a(yb.h hVar, int i) {
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int a = (int) t.a(hVar.getContext(), i);
        if (contentWidth >= a) {
            a = contentWidth;
        }
        int left = (hVar.getLeft() + hVar.getRight()) / 2;
        int top = (hVar.getTop() + hVar.getBottom()) / 2;
        int i2 = a / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF a(yb ybVar, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!ybVar.d() && (view instanceof yb.h)) {
            return a((yb.h) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(yb ybVar, View view, Drawable drawable) {
        RectF a = a(ybVar, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(yb ybVar, View view, View view2, float f, Drawable drawable) {
        RectF a = a(ybVar, view);
        RectF a2 = a(ybVar, view2);
        drawable.setBounds(vv.a((int) a.left, (int) a2.left, f), drawable.getBounds().top, vv.a((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}
