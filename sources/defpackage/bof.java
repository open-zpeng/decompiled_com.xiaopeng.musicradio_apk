package defpackage;
/* renamed from: bof  reason: default package */
/* loaded from: classes3.dex */
public class bof extends boe {
    public bof(int i) {
        super(i);
    }

    public void a(byte[] bArr, int i, int i2, byte[] bArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = this.b[(this.a + this.c) & 255];
            byte[] bArr3 = this.b;
            int i4 = this.c;
            this.c = i4 - 1;
            int i5 = i + i3;
            bArr3[i4 & 255] = bArr[i5];
            bArr2[i3] = (byte) (bArr[i5] - b);
        }
    }
}
