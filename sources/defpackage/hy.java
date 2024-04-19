package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* compiled from: WindowInsetsCompat.java */
/* renamed from: hy  reason: default package */
/* loaded from: classes3.dex */
public class hy {
    public static final hy a;
    private final g b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = l.e;
        } else {
            a = g.a;
        }
    }

    private hy(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new l(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new k(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new j(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.b = new i(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.b = new h(this, windowInsets);
        } else {
            this.b = new g(this);
        }
    }

    public hy(hy hyVar) {
        if (hyVar != null) {
            g gVar = hyVar.b;
            if (Build.VERSION.SDK_INT >= 30 && (gVar instanceof l)) {
                this.b = new l(this, (l) gVar);
            } else if (Build.VERSION.SDK_INT >= 29 && (gVar instanceof k)) {
                this.b = new k(this, (k) gVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (gVar instanceof j)) {
                this.b = new j(this, (j) gVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (gVar instanceof i)) {
                this.b = new i(this, (i) gVar);
            } else if (Build.VERSION.SDK_INT >= 20 && (gVar instanceof h)) {
                this.b = new h(this, (h) gVar);
            } else {
                this.b = new g(this);
            }
            gVar.b(this);
            return;
        }
        this.b = new g(this);
    }

    public static hy a(WindowInsets windowInsets) {
        return a(windowInsets, null);
    }

    public static hy a(WindowInsets windowInsets, View view) {
        hy hyVar = new hy((WindowInsets) gp.a(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            hyVar.a(hq.t(view));
            hyVar.a(view.getRootView());
        }
        return hyVar;
    }

    @Deprecated
    public int a() {
        return this.b.g().b;
    }

    @Deprecated
    public int b() {
        return this.b.g().c;
    }

    @Deprecated
    public int c() {
        return this.b.g().d;
    }

    @Deprecated
    public int d() {
        return this.b.g().e;
    }

    public boolean e() {
        return this.b.b();
    }

    @Deprecated
    public hy f() {
        return this.b.c();
    }

    @Deprecated
    public hy a(int i2, int i3, int i4, int i5) {
        return new b(this).a(fe.a(i2, i3, i4, i5)).a();
    }

    @Deprecated
    public hy g() {
        return this.b.d();
    }

    @Deprecated
    public hy h() {
        return this.b.f();
    }

    @Deprecated
    public fe i() {
        return this.b.i();
    }

    public hy b(int i2, int i3, int i4, int i5) {
        return this.b.a(i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hy) {
            return gm.a(this.b, ((hy) obj).b);
        }
        return false;
    }

    public int hashCode() {
        g gVar = this.b;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public WindowInsets j() {
        g gVar = this.b;
        if (gVar instanceof h) {
            return ((h) gVar).c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$g */
    /* loaded from: classes3.dex */
    public static class g {
        static final hy a = new b().a().h().g().f();
        final hy b;

        void a(View view) {
        }

        void a(fe feVar) {
        }

        void a(hy hyVar) {
        }

        public void a(fe[] feVarArr) {
        }

        boolean a() {
            return false;
        }

        public void b(fe feVar) {
        }

        void b(hy hyVar) {
        }

        boolean b() {
            return false;
        }

        gt e() {
            return null;
        }

        g(hy hyVar) {
            this.b = hyVar;
        }

        hy c() {
            return this.b;
        }

        hy d() {
            return this.b;
        }

        hy f() {
            return this.b;
        }

        fe g() {
            return fe.a;
        }

        fe h() {
            return fe.a;
        }

        fe i() {
            return g();
        }

        hy a(int i, int i2, int i3, int i4) {
            return a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return a() == gVar.a() && b() == gVar.b() && gm.a(g(), gVar.g()) && gm.a(h(), gVar.h()) && gm.a(e(), gVar.e());
            }
            return false;
        }

        public int hashCode() {
            return gm.a(Boolean.valueOf(a()), Boolean.valueOf(b()), g(), h(), e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$h */
    /* loaded from: classes3.dex */
    public static class h extends g {
        private static boolean e = false;
        private static Method f;
        private static Class<?> g;
        private static Class<?> h;
        private static Field i;
        private static Field j;
        final WindowInsets c;
        fe d;
        private fe[] k;
        private fe l;
        private hy m;

        h(hy hyVar, WindowInsets windowInsets) {
            super(hyVar);
            this.l = null;
            this.c = windowInsets;
        }

        h(hy hyVar, h hVar) {
            this(hyVar, new WindowInsets(hVar.c));
        }

        @Override // defpackage.hy.g
        boolean a() {
            return this.c.isRound();
        }

        @Override // defpackage.hy.g
        final fe g() {
            if (this.l == null) {
                this.l = fe.a(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.l;
        }

        @Override // defpackage.hy.g
        hy a(int i2, int i3, int i4, int i5) {
            b bVar = new b(hy.a(this.c));
            bVar.a(hy.a(g(), i2, i3, i4, i5));
            bVar.b(hy.a(h(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // defpackage.hy.g
        void b(hy hyVar) {
            hyVar.a(this.m);
            hyVar.b(this.d);
        }

        @Override // defpackage.hy.g
        void a(hy hyVar) {
            this.m = hyVar;
        }

        @Override // defpackage.hy.g
        void a(fe feVar) {
            this.d = feVar;
        }

        @Override // defpackage.hy.g
        void a(View view) {
            fe b = b(view);
            if (b == null) {
                b = fe.a;
            }
            a(b);
        }

        private fe b(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!e) {
                j();
            }
            Method method = f;
            if (method == null || h == null || i == null) {
                return null;
            }
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) i.get(j.get(invoke));
                if (rect != null) {
                    return fe.a(rect);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                return null;
            }
        }

        @Override // defpackage.hy.g
        public void a(fe[] feVarArr) {
            this.k = feVarArr;
        }

        @SuppressLint({"PrivateApi"})
        private static void j() {
            try {
                f = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                g = Class.forName("android.view.ViewRootImpl");
                h = Class.forName("android.view.View$AttachInfo");
                i = h.getDeclaredField("mVisibleInsets");
                j = g.getDeclaredField("mAttachInfo");
                i.setAccessible(true);
                j.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            e = true;
        }

        @Override // defpackage.hy.g
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.d, ((h) obj).d);
            }
            return false;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$i */
    /* loaded from: classes3.dex */
    private static class i extends h {
        private fe e;

        i(hy hyVar, WindowInsets windowInsets) {
            super(hyVar, windowInsets);
            this.e = null;
        }

        i(hy hyVar, i iVar) {
            super(hyVar, iVar);
            this.e = null;
            this.e = iVar.e;
        }

        @Override // defpackage.hy.g
        boolean b() {
            return this.c.isConsumed();
        }

        @Override // defpackage.hy.g
        hy d() {
            return hy.a(this.c.consumeStableInsets());
        }

        @Override // defpackage.hy.g
        hy c() {
            return hy.a(this.c.consumeSystemWindowInsets());
        }

        @Override // defpackage.hy.g
        final fe h() {
            if (this.e == null) {
                this.e = fe.a(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.e;
        }

        @Override // defpackage.hy.g
        public void b(fe feVar) {
            this.e = feVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$j */
    /* loaded from: classes3.dex */
    private static class j extends i {
        j(hy hyVar, WindowInsets windowInsets) {
            super(hyVar, windowInsets);
        }

        j(hy hyVar, j jVar) {
            super(hyVar, jVar);
        }

        @Override // defpackage.hy.g
        gt e() {
            return gt.a(this.c.getDisplayCutout());
        }

        @Override // defpackage.hy.g
        hy f() {
            return hy.a(this.c.consumeDisplayCutout());
        }

        @Override // defpackage.hy.h, defpackage.hy.g
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return Objects.equals(this.c, jVar.c) && Objects.equals(this.d, jVar.d);
            }
            return false;
        }

        @Override // defpackage.hy.g
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$k */
    /* loaded from: classes3.dex */
    private static class k extends j {
        private fe e;
        private fe f;
        private fe g;

        @Override // defpackage.hy.i, defpackage.hy.g
        public void b(fe feVar) {
        }

        k(hy hyVar, WindowInsets windowInsets) {
            super(hyVar, windowInsets);
            this.e = null;
            this.f = null;
            this.g = null;
        }

        k(hy hyVar, k kVar) {
            super(hyVar, kVar);
            this.e = null;
            this.f = null;
            this.g = null;
        }

        @Override // defpackage.hy.g
        fe i() {
            if (this.f == null) {
                this.f = fe.a(this.c.getMandatorySystemGestureInsets());
            }
            return this.f;
        }

        @Override // defpackage.hy.h, defpackage.hy.g
        hy a(int i, int i2, int i3, int i4) {
            return hy.a(this.c.inset(i, i2, i3, i4));
        }
    }

    static fe a(fe feVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, feVar.b - i2);
        int max2 = Math.max(0, feVar.c - i3);
        int max3 = Math.max(0, feVar.d - i4);
        int max4 = Math.max(0, feVar.e - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? feVar : fe.a(max, max2, max3, max4);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$l */
    /* loaded from: classes3.dex */
    private static class l extends k {
        static final hy e = hy.a(WindowInsets.CONSUMED);

        @Override // defpackage.hy.h, defpackage.hy.g
        final void a(View view) {
        }

        l(hy hyVar, WindowInsets windowInsets) {
            super(hyVar, windowInsets);
        }

        l(hy hyVar, l lVar) {
            super(hyVar, lVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c a;

        public b() {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = new f();
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.a = new e();
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public b(hy hyVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = new f(hyVar);
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.a = new e(hyVar);
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.a = new d(hyVar);
            } else {
                this.a = new c(hyVar);
            }
        }

        @Deprecated
        public b a(fe feVar) {
            this.a.a(feVar);
            return this;
        }

        @Deprecated
        public b b(fe feVar) {
            this.a.e(feVar);
            return this;
        }

        public hy a() {
            return this.a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$c */
    /* loaded from: classes3.dex */
    public static class c {
        fe[] a;
        private final hy b;

        void a(fe feVar) {
        }

        void b(fe feVar) {
        }

        void c(fe feVar) {
        }

        void d(fe feVar) {
        }

        void e(fe feVar) {
        }

        c() {
            this(new hy((hy) null));
        }

        c(hy hyVar) {
            this.b = hyVar;
        }

        protected final void a() {
            fe[] feVarArr = this.a;
            if (feVarArr != null) {
                fe feVar = feVarArr[m.a(1)];
                fe feVar2 = this.a[m.a(2)];
                if (feVar != null && feVar2 != null) {
                    a(fe.a(feVar, feVar2));
                } else if (feVar != null) {
                    a(feVar);
                } else if (feVar2 != null) {
                    a(feVar2);
                }
                fe feVar3 = this.a[m.a(16)];
                if (feVar3 != null) {
                    b(feVar3);
                }
                fe feVar4 = this.a[m.a(32)];
                if (feVar4 != null) {
                    c(feVar4);
                }
                fe feVar5 = this.a[m.a(64)];
                if (feVar5 != null) {
                    d(feVar5);
                }
            }
        }

        hy b() {
            a();
            return this.b;
        }
    }

    void a(fe[] feVarArr) {
        this.b.a(feVarArr);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$d */
    /* loaded from: classes3.dex */
    private static class d extends c {
        private static Field b = null;
        private static boolean c = false;
        private static Constructor<WindowInsets> d = null;
        private static boolean e = false;
        private WindowInsets f;
        private fe g;

        d() {
            this.f = c();
        }

        d(hy hyVar) {
            this.f = hyVar.j();
        }

        @Override // defpackage.hy.c
        void a(fe feVar) {
            WindowInsets windowInsets = this.f;
            if (windowInsets != null) {
                this.f = windowInsets.replaceSystemWindowInsets(feVar.b, feVar.c, feVar.d, feVar.e);
            }
        }

        @Override // defpackage.hy.c
        void e(fe feVar) {
            this.g = feVar;
        }

        @Override // defpackage.hy.c
        hy b() {
            a();
            hy a = hy.a(this.f);
            a.a(this.a);
            a.a(this.g);
            return a;
        }

        private static WindowInsets c() {
            if (!c) {
                try {
                    b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                c = true;
            }
            Field field = b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!e) {
                try {
                    d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                e = true;
            }
            Constructor<WindowInsets> constructor = d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }
    }

    void a(fe feVar) {
        this.b.b(feVar);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$e */
    /* loaded from: classes3.dex */
    private static class e extends c {
        final WindowInsets.Builder b;

        e() {
            this.b = new WindowInsets.Builder();
        }

        e(hy hyVar) {
            WindowInsets.Builder builder;
            WindowInsets j = hyVar.j();
            if (j != null) {
                builder = new WindowInsets.Builder(j);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }

        @Override // defpackage.hy.c
        void a(fe feVar) {
            this.b.setSystemWindowInsets(feVar.a());
        }

        @Override // defpackage.hy.c
        void b(fe feVar) {
            this.b.setSystemGestureInsets(feVar.a());
        }

        @Override // defpackage.hy.c
        void c(fe feVar) {
            this.b.setMandatorySystemGestureInsets(feVar.a());
        }

        @Override // defpackage.hy.c
        void d(fe feVar) {
            this.b.setTappableElementInsets(feVar.a());
        }

        @Override // defpackage.hy.c
        void e(fe feVar) {
            this.b.setStableInsets(feVar.a());
        }

        @Override // defpackage.hy.c
        hy b() {
            a();
            hy a = hy.a(this.b.build());
            a.a(this.a);
            return a;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$f */
    /* loaded from: classes3.dex */
    private static class f extends e {
        f() {
        }

        f(hy hyVar) {
            super(hyVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$m */
    /* loaded from: classes3.dex */
    public static final class m {
        static int a(int i) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    if (i != 256) {
                                        switch (i) {
                                            case 1:
                                                return 0;
                                            case 2:
                                                return 1;
                                            default:
                                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                    }
                                    return 8;
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(hy hyVar) {
        this.b.a(hyVar);
    }

    void b(fe feVar) {
        this.b.a(feVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        this.b.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: hy$a */
    /* loaded from: classes3.dex */
    public static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                a = View.class.getDeclaredField("mAttachInfo");
                a.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                b = cls.getDeclaredField("mStableInsets");
                b.setAccessible(true);
                c = cls.getDeclaredField("mContentInsets");
                c.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static hy a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            hy a2 = new b().b(fe.a(rect)).a(fe.a(rect2)).a();
                            a2.a(a2);
                            a2.a(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
                return null;
            }
            return null;
        }
    }
}
