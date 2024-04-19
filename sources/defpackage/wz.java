package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* compiled from: MaterialAttributes.java */
/* renamed from: wz  reason: default package */
/* loaded from: classes3.dex */
public class wz {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int a(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return a.data;
    }

    public static int a(View view, int i) {
        return a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static boolean a(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }
}
