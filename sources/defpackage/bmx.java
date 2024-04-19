package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
import java.io.InputStream;
/* compiled from: MultiByteArrayInputStream.java */
/* renamed from: bmx  reason: default package */
/* loaded from: classes3.dex */
public class bmx extends InputStream {
    private byte[] a;
    private int b;
    private int c;
    private byte[] d;
    private int e;
    private int f;
    private int g = 0;

    public bmx(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        this.a = bArr;
        this.d = bArr2;
        this.b = i;
        this.e = i3;
        this.c = i2;
        this.f = i4;
    }

    @Override // java.io.InputStream
    public int read() {
        int i;
        int i2 = this.g;
        int i3 = this.c;
        if (i2 < i3) {
            i = this.a[this.b + i2];
        } else if (i2 >= this.f + i3) {
            return -1;
        } else {
            i = this.d[(this.e + i2) - i3];
        }
        if (i < 0) {
            i += IRadioController.TEF663x_PCHANNEL;
        }
        this.g++;
        return i;
    }
}
