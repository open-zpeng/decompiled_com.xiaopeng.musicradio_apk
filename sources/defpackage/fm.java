package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.ey;
import defpackage.gc;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: fm  reason: default package */
/* loaded from: classes3.dex */
public class fm {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, ey.b> a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: fm$a */
    /* loaded from: classes3.dex */
    public interface a<T> {
        boolean a(T t);

        int b(T t);
    }

    private static <T> T a(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.b(t2) - i2) * 2) + (aVar.a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long b(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public gc.b a(gc.b[] bVarArr, int i) {
        return (gc.b) a(bVarArr, i, new a<gc.b>() { // from class: fm.1
            @Override // defpackage.fm.a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public int b(gc.b bVar) {
                return bVar.c();
            }

            @Override // defpackage.fm.a
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public boolean a(gc.b bVar) {
                return bVar.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = fn.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (fn.a(a2, inputStream)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, gc.b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(bVarArr, i).a());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface a2 = a(context, inputStream);
            fn.a(inputStream);
            return a2;
        } catch (IOException unused2) {
            fn.a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            fn.a(inputStream2);
            throw th;
        }
    }

    private ey.c a(ey.b bVar, int i) {
        return (ey.c) a(bVar.a(), i, new a<ey.c>() { // from class: fm.2
            @Override // defpackage.fm.a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public int b(ey.c cVar) {
                return cVar.b();
            }

            @Override // defpackage.fm.a
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public boolean a(ey.c cVar) {
                return cVar.c();
            }
        });
    }

    public Typeface a(Context context, ey.b bVar, Resources resources, int i) {
        ey.c a2 = a(bVar, i);
        if (a2 == null) {
            return null;
        }
        Typeface a3 = fg.a(context, resources, a2.f(), a2.a(), i);
        a(a3, bVar);
        return a3;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = fn.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (fn.a(a2, resources, i)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ey.b a(Typeface typeface) {
        long b = b(typeface);
        if (b == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(b));
    }

    private void a(Typeface typeface, ey.b bVar) {
        long b = b(typeface);
        if (b != 0) {
            this.a.put(Long.valueOf(b), bVar);
        }
    }
}
