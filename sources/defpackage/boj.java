package defpackage;

import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: boj  reason: default package */
/* loaded from: classes3.dex */
public final class boj extends boh {
    private final int b;
    private final int[] e;
    private final int[] c = new int[1024];
    private final int[] d = new int[65536];
    private int f = 0;
    private int g = 0;
    private int h = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boj(int i) {
        this.e = new int[a(i)];
        this.b = this.e.length - 1;
    }

    static int a(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | MetadataDescriptor.WORD_MAXVALUE;
        if (i6 > 16777216) {
            i6 >>>= 1;
        }
        return i6 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.c[this.f];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(byte[] bArr, int i) {
        int i2 = a[bArr[i] & 255] ^ (bArr[i + 1] & 255);
        this.f = i2 & 1023;
        int i3 = i2 ^ ((bArr[i + 2] & 255) << 8);
        this.g = 65535 & i3;
        this.h = ((a[bArr[i + 3] & 255] << 5) ^ i3) & this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.d[this.g];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.c[this.f] = i;
        this.d[this.g] = i;
        this.e[this.h] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.e[this.h];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        bok.a(this.c, i);
        bok.a(this.d, i);
        bok.a(this.e, i);
    }
}
