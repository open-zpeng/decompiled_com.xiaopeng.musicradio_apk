package defpackage;

import java.io.IOException;
import java.io.OutputStream;
/* compiled from: DeltaDecoder.java */
/* renamed from: bjo  reason: default package */
/* loaded from: classes3.dex */
class bjo extends bjm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bjo() {
        super(Number.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bjm
    public OutputStream a(OutputStream outputStream, Object obj) {
        try {
            return new bnp(a(obj, 1)).a(new bnt(outputStream));
        } catch (bob e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bjm
    public byte[] b(Object obj) {
        return new byte[]{(byte) (a(obj, 1) - 1)};
    }
}
