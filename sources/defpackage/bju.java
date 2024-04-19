package defpackage;
/* compiled from: SevenZMethodConfiguration.java */
/* renamed from: bju  reason: default package */
/* loaded from: classes3.dex */
public class bju {
    private final bjt a;
    private final Object b;

    public bju(bjt bjtVar) {
        this(bjtVar, null);
    }

    public bju(bjt bjtVar, Object obj) {
        this.a = bjtVar;
        this.b = obj;
        if (obj == null || bjn.a(bjtVar).a(obj)) {
            return;
        }
        throw new IllegalArgumentException("The " + bjtVar + " method doesn't support options of type " + obj.getClass());
    }

    public bjt a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }
}
