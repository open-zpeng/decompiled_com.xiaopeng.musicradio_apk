package defpackage;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.ak;
import defpackage.adx;
/* compiled from: XmlyLoginFlowManager.java */
/* renamed from: adz  reason: default package */
/* loaded from: classes2.dex */
public class adz {
    private static adw a;
    private static boolean b;

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void b() {
        adw adwVar = a;
        if (adwVar != null) {
            adwVar.a(true, "clearLastQrCodePresenter");
            a = null;
        }
    }

    public static void a(adw adwVar) {
        b();
        a = adwVar;
    }

    public static void c() {
        if (a()) {
            LogUtils.i("XmlyLoginFlowManager", "showQrCodeDialog:isDialogShown");
        } else if (!NetUtils.isNetworkAvailable(a.a())) {
            a(0);
        } else {
            Context c = com.xiaopeng.musicradio.utils.a.a().c();
            if (c == null) {
                c = a.a;
            }
            try {
                new adx(c, new adx.a() { // from class: adz.1
                    private boolean a;

                    @Override // defpackage.adx.a
                    public void a(String str, String str2) {
                        adz.a(str, str2, this.a);
                    }

                    @Override // defpackage.adx.a
                    public void a() {
                        this.a = true;
                        adz.a(10001);
                    }
                }).d();
            } catch (Exception e) {
                LogUtils.e("XmlyLoginFlowManager", "showQrCodeDialog", e);
                a(10001);
            }
        }
    }

    public static void a(String str, String str2, boolean z) {
        LogUtils.e("XmlyLoginFlowManager", "onSuccess:" + str + ListSignBean.COLLECTID_SUFFIX + str2 + ListSignBean.COLLECTID_SUFFIX + z);
        ((aqu) aqf.a().b()).a(str, str2);
    }

    public static void a(int i) {
        LogUtils.e("XmlyLoginFlowManager", "onFail:" + i);
        if (i == 0) {
            ak.b(a.a, a.a.getString(f.h.net_error_tip));
        }
    }
}
