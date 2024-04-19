package defpackage;
/* compiled from: ErrorCorrectionLevel.java */
/* renamed from: aaa  reason: default package */
/* loaded from: classes.dex */
public enum aaa {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final aaa[] FOR_BITS;
    private final int bits;

    static {
        aaa aaaVar = L;
        aaa aaaVar2 = M;
        aaa aaaVar3 = Q;
        FOR_BITS = new aaa[]{aaaVar2, aaaVar, H, aaaVar3};
    }

    aaa(int i) {
        this.bits = i;
    }

    public int a() {
        return this.bits;
    }
}
