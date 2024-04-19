package defpackage;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.q;
import com.xiaopeng.musicradio.utils.r;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import defpackage.aud;
import defpackage.beo;
/* compiled from: NetRadioCollectManager.java */
/* renamed from: ane  reason: default package */
/* loaded from: classes2.dex */
public class ane implements aqd {

    /* compiled from: NetRadioCollectManager.java */
    /* renamed from: ane$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final ane a = new ane();
    }

    public static ane a() {
        return a.a;
    }

    public ane() {
        aql.b().a(this);
    }

    @Override // defpackage.aqd
    public void b() {
        anj.a().b();
        ay.b("SP_LOVE_NETRADIO_TAG", "");
        apt.a().c();
        u.c(new aud.a());
    }

    @Override // defpackage.aqd
    public void c() {
        d();
    }

    public void a(NetRadioInfo netRadioInfo, boolean z) {
        if (z) {
            b(netRadioInfo);
        } else {
            c(netRadioInfo);
        }
    }

    public void a(NetRadioInfo netRadioInfo) {
        if (!apt.a().a(netRadioInfo)) {
            b(netRadioInfo);
        } else {
            c(netRadioInfo);
        }
    }

    public void b(final NetRadioInfo netRadioInfo) {
        LogUtils.i("NetRadioCollectManager", "netRadioLove: ");
        a(new apz() { // from class: ane.1
            @Override // defpackage.apz
            public void a(boolean z) {
                LogUtils.i("NetRadioCollectManager", "onLogin:netradioLove");
                apt.a().a(netRadioInfo, true);
                afi.d().a(ank.a(netRadioInfo));
                aqg.c().a();
            }

            @Override // defpackage.apz
            public void a() {
                LogUtils.i("NetRadioCollectManager", "onLoginFail:netradioLove");
            }
        });
    }

    public void c(final NetRadioInfo netRadioInfo) {
        LogUtils.i("NetRadioCollectManager", "netRadioCancelLove: ");
        aqf.a().a(new apz() { // from class: ane.2
            @Override // defpackage.apz
            public void a(boolean z) {
                LogUtils.i("NetRadioCollectManager", "onLogin:netradioCancelLove");
                apt.a().a(netRadioInfo, false);
                afi.d().a(ank.b(netRadioInfo));
                aqg.c().a();
            }

            @Override // defpackage.apz
            public void a() {
                LogUtils.i("NetRadioCollectManager", "onLoginFail:netradioCancelLove");
            }
        });
    }

    public void d() {
        anj.a().d();
    }

    @Override // defpackage.aqd
    public void e() {
        f();
    }

    public void f() {
        anj.a().c();
    }

    public static void a(final apz apzVar) {
        if (aqf.a().e()) {
            if (apzVar != null) {
                apzVar.a(false);
                return;
            }
            return;
        }
        axu.b();
        Context c = com.xiaopeng.musicradio.utils.a.a().c();
        if (c == null) {
            c = com.xiaopeng.musicradio.a.a;
        }
        final XDialog xDialog = new XDialog(c, 0, r.a());
        xDialog.setVuiSceneId("NetRadioLoginDialog");
        xDialog.setSystemDialog(2008);
        xDialog.setTitle("喜马拉雅登录提示").setMessage(c.getString(beo.e.netradio_login_tip_title)).setPositiveButton(c.getString(beo.e.netradio_login_ok), new XDialogInterface.OnClickListener() { // from class: ane.4
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                XDialog.this.setPositiveButtonEnable(false);
                aqf.a().a(apzVar);
            }
        }).setNegativeButton(c.getString(beo.e.netradio_login_cancle), new XDialogInterface.OnClickListener() { // from class: ane.3
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnClickListener
            public void onClick(XDialog xDialog2, int i) {
                xDialog2.setNegativeButtonEnable(false);
            }
        });
        xDialog.initVuiScene("NetRadioLoginDialog", VuiEngine.getInstance(c));
        q.a(c, xDialog);
    }
}
