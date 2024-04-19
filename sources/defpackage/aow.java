package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.carcontrollermodule.controller.McuController;
import com.xiaopeng.musicradio.utils.h;
/* compiled from: IcmVersionUtil.java */
/* renamed from: aow  reason: default package */
/* loaded from: classes2.dex */
public class aow {
    public static int a = -1;
    public static boolean b = false;

    public static void a() {
        String str = null;
        try {
            str = h.d().getHardwareCarType();
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.equals(str, McuController.CAR_TYPE_D10)) {
            a = 1;
        } else {
            a = 2;
        }
    }
}
