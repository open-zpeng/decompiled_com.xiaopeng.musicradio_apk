package defpackage;
/* compiled from: Mask.java */
/* renamed from: pr  reason: default package */
/* loaded from: classes3.dex */
public class pr {
    private final a a;
    private final pe b;
    private final pa c;

    /* compiled from: Mask.java */
    /* renamed from: pr$a */
    /* loaded from: classes3.dex */
    public enum a {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect
    }

    public pr(a aVar, pe peVar, pa paVar) {
        this.a = aVar;
        this.b = peVar;
        this.c = paVar;
    }

    public a a() {
        return this.a;
    }

    public pe b() {
        return this.b;
    }

    public pa c() {
        return this.c;
    }
}
