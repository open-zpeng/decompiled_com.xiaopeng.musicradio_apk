package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* compiled from: SevenZFile.java */
/* renamed from: bjs  reason: default package */
/* loaded from: classes3.dex */
public class bjs implements Closeable {
    static final byte[] a = {55, 122, -68, -81, 39, 28};
    private RandomAccessFile b;
    private final bjj c;
    private byte[] d;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.RandomAccessFile, byte[]] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.b;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } finally {
                this.b = null;
                byte[] bArr = this.d;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.d = null;
            }
        }
    }

    public String toString() {
        return this.c.toString();
    }
}
