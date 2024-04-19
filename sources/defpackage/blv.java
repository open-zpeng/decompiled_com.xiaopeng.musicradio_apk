package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: ExtendedByteArrayOutputStream.java */
/* renamed from: blv  reason: default package */
/* loaded from: classes3.dex */
class blv extends ByteArrayOutputStream {
    final blz a;
    final bmb b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public blv(blz blzVar) {
        this.a = blzVar;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public blv(bmb bmbVar) {
        this.a = null;
        this.b = bmbVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        ByteBuffer wrap;
        synchronized (this) {
            wrap = ByteBuffer.wrap(toByteArray());
            reset();
        }
        a().write(new blx((byte) 2, true, wrap.array()).c());
        a().flush();
    }

    OutputStream a() {
        blz blzVar = this.a;
        if (blzVar != null) {
            return blzVar.f();
        }
        bmb bmbVar = this.b;
        if (bmbVar != null) {
            return bmbVar.f();
        }
        return null;
    }
}
