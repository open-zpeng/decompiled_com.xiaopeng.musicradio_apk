package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
/* compiled from: RC4.java */
/* renamed from: vb  reason: default package */
/* loaded from: classes3.dex */
public class vb {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RC4.java */
    /* renamed from: vb$a */
    /* loaded from: classes3.dex */
    public static class a {
        public int[] a;
        public int b;
        public int c;

        private a() {
            this.a = new int[IRadioController.TEF663x_PCHANNEL];
        }
    }

    public static byte[] a(byte[] bArr, String str) {
        a a2;
        if (bArr == null || str == null || (a2 = a(str)) == null) {
            return null;
        }
        return a(bArr, a2);
    }

    private static a a(String str) {
        if (str != null) {
            a aVar = new a();
            for (int i = 0; i < 256; i++) {
                aVar.a[i] = i;
            }
            aVar.b = 0;
            aVar.c = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                try {
                    i3 = ((str.charAt(i2) + aVar.a[i4]) + i3) % IRadioController.TEF663x_PCHANNEL;
                    int i5 = aVar.a[i4];
                    aVar.a[i4] = aVar.a[i3];
                    aVar.a[i3] = i5;
                    i2 = (i2 + 1) % str.length();
                } catch (Exception unused) {
                    return null;
                }
            }
            return aVar;
        }
        return null;
    }

    private static byte[] a(byte[] bArr, a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i = aVar.b;
        int i2 = aVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % IRadioController.TEF663x_PCHANNEL;
            i2 = (aVar.a[i] + i2) % IRadioController.TEF663x_PCHANNEL;
            int i4 = aVar.a[i];
            aVar.a[i] = aVar.a[i2];
            aVar.a[i2] = i4;
            int i5 = (aVar.a[i] + aVar.a[i2]) % IRadioController.TEF663x_PCHANNEL;
            bArr[i3] = (byte) (aVar.a[i5] ^ bArr[i3]);
        }
        aVar.b = i;
        aVar.c = i2;
        return bArr;
    }
}
