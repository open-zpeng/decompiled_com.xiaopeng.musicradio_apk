package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import defpackage.wm;
/* compiled from: CircularRevealWidget.java */
/* renamed from: wn  reason: default package */
/* loaded from: classes3.dex */
public interface wn extends wm.a {
    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: wn$d */
    /* loaded from: classes3.dex */
    public static class d {
        public float a;
        public float b;
        public float c;

        private d() {
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public d(d dVar) {
            this(dVar.a, dVar.b, dVar.c);
        }

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public void a(d dVar) {
            a(dVar.a, dVar.b, dVar.c);
        }

        public boolean a() {
            return this.c == Float.MAX_VALUE;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: wn$b */
    /* loaded from: classes3.dex */
    public static class b extends Property<wn, d> {
        public static final Property<wn, d> a = new b("circularReveal");

        private b(String str) {
            super(d.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public d get(wn wnVar) {
            return wnVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(wn wnVar, d dVar) {
            wnVar.setRevealInfo(dVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: wn$a */
    /* loaded from: classes3.dex */
    public static class a implements TypeEvaluator<d> {
        public static final TypeEvaluator<d> a = new a();
        private final d b = new d();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public d evaluate(float f, d dVar, d dVar2) {
            this.b.a(ww.a(dVar.a, dVar2.a, f), ww.a(dVar.b, dVar2.b, f), ww.a(dVar.c, dVar2.c, f));
            return this.b;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: wn$c */
    /* loaded from: classes3.dex */
    public static class c extends Property<wn, Integer> {
        public static final Property<wn, Integer> a = new c("circularRevealScrimColor");

        private c(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(wn wnVar) {
            return Integer.valueOf(wnVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(wn wnVar, Integer num) {
            wnVar.setCircularRevealScrimColor(num.intValue());
        }
    }
}
