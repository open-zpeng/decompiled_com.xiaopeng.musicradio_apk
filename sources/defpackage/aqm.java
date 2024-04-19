package defpackage;

import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
/* compiled from: FollowSysErrManager.java */
/* renamed from: aqm  reason: default package */
/* loaded from: classes2.dex */
public class aqm {
    private static volatile boolean a;

    public static void a(boolean z) {
        a = z;
    }

    public static boolean a() {
        return aqi.a().c().longValue() <= 0 && a;
    }

    public static void b() {
        if (a()) {
            ak.a(a.a(), f.h.toast_follow_sys_error);
        }
        a(false);
    }
}
