package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.aw;
/* compiled from: MaterialResources.java */
/* renamed from: xa  reason: default package */
/* loaded from: classes3.dex */
public class xa {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = aa.a(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    public static ColorStateList a(Context context, aw awVar, int i) {
        int b;
        int g;
        ColorStateList a;
        if (!awVar.g(i) || (g = awVar.g(i, 0)) == 0 || (a = aa.a(context, g)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (b = awVar.b(i, -1)) != -1) {
                return ColorStateList.valueOf(b);
            }
            return awVar.e(i);
        }
        return a;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = aa.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }

    public static xb c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new xb(context, resourceId);
    }

    public static int a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean b(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
