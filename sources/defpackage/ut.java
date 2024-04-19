package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
/* compiled from: IntUtils.java */
/* renamed from: ut  reason: default package */
/* loaded from: classes3.dex */
public class ut {
    public static byte[] a(int i) {
        byte[] bArr = {(byte) ((r3 >> 8) % IRadioController.TEF663x_PCHANNEL), (byte) (r3 % IRadioController.TEF663x_PCHANNEL), (byte) (r3 % IRadioController.TEF663x_PCHANNEL), (byte) (i % IRadioController.TEF663x_PCHANNEL)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }
}
