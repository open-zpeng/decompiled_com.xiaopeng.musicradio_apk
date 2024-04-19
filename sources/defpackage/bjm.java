package defpackage;

import java.io.OutputStream;
/* compiled from: CoderBase.java */
/* renamed from: bjm  reason: default package */
/* loaded from: classes3.dex */
abstract class bjm {
    private static final byte[] b = new byte[0];
    private final Class<?>[] a;

    /* JADX INFO: Access modifiers changed from: protected */
    public bjm(Class<?>... clsArr) {
        this.a = clsArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Object obj) {
        for (Class<?> cls : this.a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] b(Object obj) {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OutputStream a(OutputStream outputStream, Object obj) {
        throw new UnsupportedOperationException("method doesn't support writing");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(Object obj, int i) {
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }
}
