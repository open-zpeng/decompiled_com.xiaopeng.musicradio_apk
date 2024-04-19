package defpackage;

import android.content.Intent;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.b;
import com.xiaopeng.musicradio.utils.w;
/* compiled from: BluetoothHelper.java */
/* renamed from: bcp  reason: default package */
/* loaded from: classes2.dex */
public class bcp {
    public static volatile boolean a = false;

    public static void a() {
        LogUtils.d("BluetoothService", "openSettingBlueDialog: 调用堆栈如下 --------- ", new Throwable());
        if (b.a(a.a) || w.i()) {
            Intent intent = new Intent();
            intent.setAction("com.xiaopeng.intent.action.POPUP_BLUETOOTH");
            intent.addFlags(C.ENCODING_PCM_MU_LAW);
            a.a.startActivity(intent);
            a = true;
            return;
        }
        LogUtils.d("BluetoothHelper", "don't open bluetooth dialog as not in foreground");
    }

    public static void b() {
        ak.b(a.a, f.h.no_bt_connect_hint);
    }
}
