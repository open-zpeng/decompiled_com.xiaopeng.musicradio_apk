package defpackage;

import org.jaudiotagger.audio.mp3.MPEGFrameHeader;
/* renamed from: box  reason: default package */
/* loaded from: classes3.dex */
public final class box implements boz {
    private final boolean a;
    private int b;

    public box(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.boz
    public int a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & 252) == 72) {
                int i5 = i4 + 3;
                if ((bArr[i5] & 3) == 1) {
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    int i8 = ((bArr[i4] & 3) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i5] & MPEGFrameHeader.SYNC_BIT_ANDSAMPING_BYTE3);
                    int i9 = this.a ? i8 + ((this.b + i4) - i) : i8 - ((this.b + i4) - i);
                    bArr[i4] = (byte) (72 | ((i9 >>> 24) & 3));
                    bArr[i6] = (byte) (i9 >>> 16);
                    bArr[i7] = (byte) (i9 >>> 8);
                    bArr[i5] = (byte) ((bArr[i5] & 3) | i9);
                }
            }
            i4 += 4;
        }
        int i10 = i4 - i;
        this.b += i10;
        return i10;
    }
}
