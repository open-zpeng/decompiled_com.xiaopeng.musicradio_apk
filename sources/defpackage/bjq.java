package defpackage;

import java.io.OutputStream;
/* compiled from: LZMA2Decoder.java */
/* renamed from: bjq  reason: default package */
/* loaded from: classes3.dex */
class bjq extends bjm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bjq() {
        super(bnv.class, Number.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bjm
    public OutputStream a(OutputStream outputStream, Object obj) {
        return d(obj).a(new bnt(outputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bjm
    public byte[] b(Object obj) {
        int c = c(obj);
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(c);
        return new byte[]{(byte) (((19 - numberOfLeadingZeros) * 2) + ((c >>> (30 - numberOfLeadingZeros)) - 2))};
    }

    private int c(Object obj) {
        if (obj instanceof bnv) {
            return ((bnv) obj).a();
        }
        return e(obj);
    }

    private bnv d(Object obj) {
        if (obj instanceof bnv) {
            return (bnv) obj;
        }
        bnv bnvVar = new bnv();
        bnvVar.b(e(obj));
        return bnvVar;
    }

    private int e(Object obj) {
        return a(obj, 8388608);
    }
}
