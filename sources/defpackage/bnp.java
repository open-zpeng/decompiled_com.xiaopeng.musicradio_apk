package defpackage;
/* renamed from: bnp  reason: default package */
/* loaded from: classes3.dex */
public class bnp extends bnr {
    static final boolean a;
    static Class b;
    private int c = 1;

    static {
        Class cls = b;
        if (cls == null) {
            cls = a("bnp");
            b = cls;
        }
        a = !cls.desiredAssertionStatus();
    }

    public bnp() {
    }

    public bnp(int i) {
        a(i);
    }

    static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public int a() {
        return this.c;
    }

    @Override // defpackage.bnr
    public bns a(bns bnsVar) {
        return new bnq(bnsVar, this);
    }

    public void a(int i) {
        if (i >= 1 && i <= 256) {
            this.c = i;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Delta distance must be in the range [1, 256]: ");
        stringBuffer.append(i);
        throw new bob(stringBuffer.toString());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (a) {
                throw new RuntimeException();
            }
            throw new AssertionError();
        }
    }
}
