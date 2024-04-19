package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import defpackage.gc;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontRequestWorker.java */
/* renamed from: gb  reason: default package */
/* loaded from: classes3.dex */
public class gb {
    static final bj<String, Typeface> a = new bj<>(16);
    private static final ExecutorService d = gd.a("fonts-androidx", 10, 10000);
    static final Object b = new Object();
    static final bl<String, ArrayList<gk<a>>> c = new bl<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface a(final Context context, final ga gaVar, fx fxVar, final int i, int i2) {
        final String a2 = a(gaVar, i);
        Typeface a3 = a.a((bj<String, Typeface>) a2);
        if (a3 != null) {
            fxVar.a(new a(a3));
            return a3;
        } else if (i2 == -1) {
            a a4 = a(a2, context, gaVar, i);
            fxVar.a(a4);
            return a4.a;
        } else {
            try {
                a aVar = (a) gd.a(d, new Callable<a>() { // from class: gb.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public a call() {
                        return gb.a(a2, context, gaVar, i);
                    }
                }, i2);
                fxVar.a(aVar);
                return aVar.a;
            } catch (InterruptedException unused) {
                fxVar.a(new a(-3));
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface a(final Context context, final ga gaVar, final int i, Executor executor, final fx fxVar) {
        final String a2 = a(gaVar, i);
        Typeface a3 = a.a((bj<String, Typeface>) a2);
        if (a3 != null) {
            fxVar.a(new a(a3));
            return a3;
        }
        gk<a> gkVar = new gk<a>() { // from class: gb.2
            @Override // defpackage.gk
            public void a(a aVar) {
                fx.this.a(aVar);
            }
        };
        synchronized (b) {
            ArrayList<gk<a>> arrayList = c.get(a2);
            if (arrayList != null) {
                arrayList.add(gkVar);
                return null;
            }
            ArrayList<gk<a>> arrayList2 = new ArrayList<>();
            arrayList2.add(gkVar);
            c.put(a2, arrayList2);
            Callable<a> callable = new Callable<a>() { // from class: gb.3
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public a call() {
                    return gb.a(a2, context, gaVar, i);
                }
            };
            if (executor == null) {
                executor = d;
            }
            gd.a(executor, callable, new gk<a>() { // from class: gb.4
                @Override // defpackage.gk
                public void a(a aVar) {
                    synchronized (gb.b) {
                        ArrayList<gk<a>> arrayList3 = gb.c.get(a2);
                        if (arrayList3 == null) {
                            return;
                        }
                        gb.c.remove(a2);
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            arrayList3.get(i2).a(aVar);
                        }
                    }
                }
            });
            return null;
        }
    }

    private static String a(ga gaVar, int i) {
        return gaVar.f() + "-" + i;
    }

    static a a(String str, Context context, ga gaVar, int i) {
        Typeface a2 = a.a((bj<String, Typeface>) str);
        if (a2 != null) {
            return new a(a2);
        }
        try {
            gc.a a3 = fz.a(context, gaVar, (CancellationSignal) null);
            int a4 = a(a3);
            if (a4 != 0) {
                return new a(a4);
            }
            Typeface a5 = fg.a(context, null, a3.b(), i);
            if (a5 != null) {
                a.a(str, a5);
                return new a(a5);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    @SuppressLint({"WrongConstant"})
    private static int a(gc.a aVar) {
        if (aVar.a() != 0) {
            return aVar.a() != 1 ? -3 : -2;
        }
        gc.b[] b2 = aVar.b();
        if (b2 == null || b2.length == 0) {
            return 1;
        }
        for (gc.b bVar : b2) {
            int e = bVar.e();
            if (e != 0) {
                if (e < 0) {
                    return -3;
                }
                return e;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontRequestWorker.java */
    /* renamed from: gb$a */
    /* loaded from: classes3.dex */
    public static final class a {
        final Typeface a;
        final int b;

        a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }
    }
}
