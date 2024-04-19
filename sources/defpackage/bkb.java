package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* compiled from: CountingOutputStream.java */
/* renamed from: bkb  reason: default package */
/* loaded from: classes3.dex */
public class bkb extends FilterOutputStream {
    private long a;

    public bkb(OutputStream outputStream) {
        super(outputStream);
        this.a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        this.out.write(i);
        a(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        a(i2);
    }

    protected void a(long j) {
        if (j != -1) {
            this.a += j;
        }
    }

    public long a() {
        return this.a;
    }
}
