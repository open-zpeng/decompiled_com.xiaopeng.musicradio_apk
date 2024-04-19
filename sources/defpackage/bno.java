package defpackage;
/* renamed from: bno  reason: default package */
/* loaded from: classes3.dex */
abstract class bno extends bnr {
    static final boolean b;
    static Class c;
    int a = 0;
    private final int d;

    static {
        Class cls = c;
        if (cls == null) {
            cls = a("bno");
            c = cls;
        }
        b = !cls.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bno(int i) {
        this.d = i;
    }

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (b) {
                throw new RuntimeException();
            }
            throw new AssertionError();
        }
    }
}
