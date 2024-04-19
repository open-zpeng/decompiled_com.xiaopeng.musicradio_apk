package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.ey;
import defpackage.fb;
import defpackage.gc;
/* compiled from: TypefaceCompat.java */
@SuppressLint({"NewApi"})
/* renamed from: fg  reason: default package */
/* loaded from: classes3.dex */
public class fg {
    private static final fm a;
    private static final bj<String, Typeface> b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new fl();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new fk();
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new fj();
        } else if (Build.VERSION.SDK_INT >= 24 && fi.a()) {
            a = new fi();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new fh();
        } else {
            a = new fm();
        }
        b = new bj<>(16);
    }

    public static Typeface a(Resources resources, int i, int i2) {
        return b.a((bj<String, Typeface>) b(resources, i, i2));
    }

    private static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    private static Typeface a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    public static Typeface a(Context context, ey.a aVar, Resources resources, int i, int i2, fb.a aVar2, Handler handler, boolean z) {
        Typeface a2;
        boolean z2;
        if (aVar instanceof ey.d) {
            ey.d dVar = (ey.d) aVar;
            Typeface a3 = a(dVar.d());
            if (a3 != null) {
                if (aVar2 != null) {
                    aVar2.a(a3, handler);
                }
                return a3;
            }
            if (z) {
                z2 = dVar.b() == 0;
            } else {
                z2 = aVar2 == null;
            }
            a2 = gc.a(context, dVar.a(), i2, z2, z ? dVar.c() : -1, fb.a.a(handler), new a(aVar2));
        } else {
            a2 = a.a(context, (ey.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (a2 != null) {
                    aVar2.a(a2, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            b.a(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, gc.b[] bVarArr, int i) {
        return a.a(context, cancellationSignal, bVarArr, i);
    }

    private static Typeface b(Context context, Typeface typeface, int i) {
        ey.b a2 = a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return a.a(context, a2, context.getResources(), i);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface b2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (b2 = b(context, typeface, i)) == null) ? Typeface.create(typeface, i) : b2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* compiled from: TypefaceCompat.java */
    /* renamed from: fg$a */
    /* loaded from: classes3.dex */
    public static class a extends gc.c {
        private fb.a a;

        public a(fb.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.gc.c
        public void a(Typeface typeface) {
            fb.a aVar = this.a;
            if (aVar != null) {
                aVar.a(typeface);
            }
        }

        @Override // defpackage.gc.c
        public void a(int i) {
            fb.a aVar = this.a;
            if (aVar != null) {
                aVar.a(i);
            }
        }
    }
}
