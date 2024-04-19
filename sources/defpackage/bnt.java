package defpackage;

import java.io.OutputStream;
/* renamed from: bnt  reason: default package */
/* loaded from: classes3.dex */
public class bnt extends bns {
    protected OutputStream a;

    public bnt(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
