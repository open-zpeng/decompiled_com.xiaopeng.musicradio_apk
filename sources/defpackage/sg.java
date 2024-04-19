package defpackage;
/* compiled from: ScaleXY.java */
/* renamed from: sg  reason: default package */
/* loaded from: classes3.dex */
public class sg {
    private final float a;
    private final float b;

    public sg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public sg() {
        this(1.0f, 1.0f);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public String toString() {
        return a() + "x" + b();
    }
}
