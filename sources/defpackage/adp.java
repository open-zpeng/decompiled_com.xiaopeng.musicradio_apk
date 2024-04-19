package defpackage;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.adn;
/* compiled from: QLoginFlowManager.java */
/* renamed from: adp  reason: default package */
/* loaded from: classes2.dex */
public class adp {
    private static adq a;
    private static boolean b;

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void b() {
        adq adqVar = a;
        if (adqVar != null) {
            adqVar.a(true, "clearLastQrCodePresenter");
            a = null;
        }
    }

    public static void a(adq adqVar) {
        b();
        a = adqVar;
    }

    @Deprecated
    public static void c() {
        a((String) null);
    }

    @Deprecated
    public static void d() {
        b(null);
    }

    public static void a(String str) {
        a("wx", str);
    }

    public static void b(String str) {
        a("qq", str);
    }

    private static void a(final String str, final String str2) {
        if (a()) {
            LogUtils.i("QLoginFlowManager", "showQrCodeDialog:isDialogShown");
        } else if (!NetUtils.isNetworkAvailable(a.a())) {
            a(0);
        } else {
            Context c = com.xiaopeng.musicradio.utils.a.a().c();
            if (c == null) {
                c = a.a;
            }
            try {
                new adn(c, str, new adn.a() { // from class: adp.1
                    private boolean c;

                    @Override // defpackage.adn.a
                    public void a(String str3, long j) {
                        adp.a(str, str3, j, this.c, str2);
                    }

                    @Override // defpackage.adn.a
                    public void a() {
                        this.c = true;
                        adp.a(10001);
                    }
                }).d();
            } catch (Exception e) {
                LogUtils.e("QLoginFlowManager", "showQrCodeDialog", e);
                a(10001);
            }
        }
    }

    public static void a(String str, String str2, long j, boolean z, String str3) {
        LogUtils.e("QLoginFlowManager", "onSuccess:" + str2 + ListSignBean.COLLECTID_SUFFIX + j + ListSignBean.COLLECTID_SUFFIX + z);
        ((aqs) apx.a().b()).a(str, str2, j, str3);
    }

    public static void a(int i) {
        LogUtils.e("QLoginFlowManager", "onFail:" + i);
        if (i == 0) {
            ak.b(a.a, a.a.getString(f.h.net_error_tip));
        }
    }
}
