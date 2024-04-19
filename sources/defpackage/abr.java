package defpackage;
/* compiled from: InitEventHolder.java */
/* renamed from: abr  reason: default package */
/* loaded from: classes2.dex */
public class abr implements abq {
    private static volatile abr b = new abr();
    private abq a;

    @Override // defpackage.abq
    public void a(int i, String str) {
        abq abqVar = this.a;
        if (abqVar != null) {
            abqVar.a(i, str);
        }
    }

    public static abq a() {
        return b;
    }

    public static void a(abq abqVar) {
        b.a = abqVar;
    }
}
