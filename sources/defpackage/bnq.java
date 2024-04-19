package defpackage;

import java.io.IOException;
/* renamed from: bnq  reason: default package */
/* loaded from: classes3.dex */
class bnq extends bns {
    private bns a;
    private final bof b;
    private final byte[] c = new byte[4096];
    private boolean d = false;
    private IOException e = null;
    private final byte[] f = new byte[1];

    /* JADX INFO: Access modifiers changed from: package-private */
    public bnq(bns bnsVar, bnp bnpVar) {
        this.a = bnsVar;
        this.b = new bof(bnpVar.a());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        bns bnsVar = this.a;
        if (bnsVar != null) {
            try {
                bnsVar.close();
            } catch (IOException e) {
                if (this.e == null) {
                    this.e = e;
                }
            }
            this.a = null;
        }
        IOException iOException = this.e;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        IOException iOException = this.e;
        if (iOException != null) {
            throw iOException;
        }
        if (this.d) {
            throw new bod("Stream finished or closed");
        }
        try {
            this.a.flush();
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.f;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.e;
        if (iOException != null) {
            throw iOException;
        }
        if (this.d) {
            throw new bod("Stream finished");
        }
        while (i2 > 4096) {
            try {
                this.b.a(bArr, i, 4096, this.c);
                this.a.write(this.c);
                i += 4096;
                i2 -= 4096;
            } catch (IOException e) {
                this.e = e;
                throw e;
            }
        }
        this.b.a(bArr, i, i2, this.c);
        this.a.write(this.c, 0, i2);
    }
}
