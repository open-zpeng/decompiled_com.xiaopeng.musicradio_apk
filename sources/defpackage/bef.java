package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
/* compiled from: FontScaleCompatDelegate.java */
/* renamed from: bef  reason: default package */
/* loaded from: classes2.dex */
public class bef implements gx {
    private final Context a;

    private bef(Context context) {
        this.a = context;
    }

    @Override // defpackage.gx
    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        View b = b(view, str, context, attributeSet);
        if (b == null) {
            return null;
        }
        return b;
    }

    public View b(View view, String str, Context context, AttributeSet attributeSet) {
        return beg.a(view, str, context, attributeSet, a((ViewParent) view));
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        Context context = this.a;
        if (context instanceof Activity) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            while (viewParent != null) {
                if (viewParent == decorView || !(viewParent instanceof View) || hq.E((View) viewParent)) {
                    return false;
                }
                viewParent = viewParent.getParent();
            }
            return true;
        }
        return false;
    }

    public static bef a(Context context) {
        return new bef(context);
    }
}
