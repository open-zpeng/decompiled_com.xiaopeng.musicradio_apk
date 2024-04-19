package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IRadioController;
/* renamed from: boe  reason: default package */
/* loaded from: classes3.dex */
abstract class boe {
    final int a;
    final byte[] b = new byte[IRadioController.TEF663x_PCHANNEL];
    int c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boe(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.a = i;
    }
}
