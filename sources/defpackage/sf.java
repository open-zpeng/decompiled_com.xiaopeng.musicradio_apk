package defpackage;
/* compiled from: LottieValueCallback.java */
/* renamed from: sf  reason: default package */
/* loaded from: classes3.dex */
public class sf<T> {
    protected T a;
    private final se<T> b;
    private nx<?, ?> c;

    public sf() {
        this.b = new se<>();
        this.a = null;
    }

    public sf(T t) {
        this.b = new se<>();
        this.a = null;
        this.a = t;
    }

    public T a(se<T> seVar) {
        return this.a;
    }

    public final T a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.b.a(f, f2, t, t2, f3, f4, f5));
    }

    public final void a(nx<?, ?> nxVar) {
        this.c = nxVar;
    }
}
