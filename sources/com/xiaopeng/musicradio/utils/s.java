package com.xiaopeng.musicradio.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.lang.reflect.Method;
/* compiled from: DrawUtils.java */
/* loaded from: classes2.dex */
public class s {
    public static float a = 1.0f;
    public static int b = 0;
    public static float c = 0.0f;
    public static int d = -1;
    public static int e = -1;
    public static int f = -1;
    public static int g = -1;
    public static float h = -1.0f;
    public static float i = -1.0f;
    public static int j;
    private static Class<?> k;
    private static Method l;
    private static Method m;
    private static Point n = new Point();

    public static int a(float f2) {
        return (int) ((f2 * a) + 0.5f);
    }

    @SuppressLint({"NewApi"})
    public static void a(Context context) {
        if (context == null || context.getResources() == null) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        a = displayMetrics.density;
        c = displayMetrics.scaledDensity;
        b = displayMetrics.densityDpi;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 14) {
            defaultDisplay.getSize(n);
            d = n.x;
            e = n.y;
        } else {
            d = defaultDisplay.getWidth();
            e = defaultDisplay.getHeight();
        }
        try {
            Class<?> cls = Class.forName("android.view.Display");
            Point point = new Point();
            cls.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            f = point.x;
            g = point.y;
        } catch (Throwable unused) {
            f = d;
            g = e;
        }
        try {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (viewConfiguration != null) {
                j = viewConfiguration.getScaledTouchSlop();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
