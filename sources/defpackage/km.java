package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* renamed from: km  reason: default package */
/* loaded from: classes3.dex */
public class km {
    static final Property<View, Float> a;
    static final Property<View, Rect> b;
    private static final ks c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            c = new kr();
        } else if (Build.VERSION.SDK_INT >= 23) {
            c = new kq();
        } else if (Build.VERSION.SDK_INT >= 22) {
            c = new kp();
        } else if (Build.VERSION.SDK_INT >= 21) {
            c = new ko();
        } else if (Build.VERSION.SDK_INT >= 19) {
            c = new kn();
        } else {
            c = new ks();
        }
        a = new Property<View, Float>(Float.class, "translationAlpha") { // from class: km.1
            @Override // android.util.Property
            /* renamed from: a */
            public Float get(View view) {
                return Float.valueOf(km.c(view));
            }

            @Override // android.util.Property
            /* renamed from: a */
            public void set(View view, Float f) {
                km.a(view, f.floatValue());
            }
        };
        b = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: km.2
            @Override // android.util.Property
            /* renamed from: a */
            public Rect get(View view) {
                return hq.D(view);
            }

            @Override // android.util.Property
            /* renamed from: a */
            public void set(View view, Rect rect) {
                hq.a(view, rect);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kl a(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new kk(view);
        }
        return kj.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kw b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new kv(view);
        }
        return new ku(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f) {
        c.a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return c.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view) {
        c.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        c.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i) {
        c.a(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, Matrix matrix) {
        c.a(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Matrix matrix) {
        c.b(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, int i, int i2, int i3, int i4) {
        c.a(view, i, i2, i3, i4);
    }
}
