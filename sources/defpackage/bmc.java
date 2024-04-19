package defpackage;

import java.io.InputStream;
/* compiled from: CountingInputStream.java */
/* renamed from: bmc  reason: default package */
/* loaded from: classes3.dex */
public class bmc extends InputStream {
    private InputStream a;
    private int b = 0;

    public bmc(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    public int a() {
        return this.b;
    }
}
