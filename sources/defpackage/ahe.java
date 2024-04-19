package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.login.manager.dialog.presenter.QLoginDialogPresenter;
import defpackage.adn;
/* compiled from: QLoginDialogViewProxy.java */
/* renamed from: ahe  reason: default package */
/* loaded from: classes2.dex */
public class ahe extends aeu<adm, QLoginDialogPresenter> implements adm {
    private String e;
    private adq f;
    private boolean g;

    @Override // defpackage.adm
    public void b() {
    }

    public ahe(Context context, String str, String str2) {
        super(context, str);
        this.e = str2;
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("OnLoginClose".equals(str)) {
            h();
        } else if ("ApplyQrCode".equals(str)) {
            this.f.b();
        }
        if ("getQrCode".equals(str)) {
            this.f = new adq(new adn.a() { // from class: ahe.1
                private boolean b;

                @Override // defpackage.adn.a
                public void a(String str2, long j) {
                    adp.a(ahe.this.e, str2, j, this.b, "unity");
                }

                @Override // defpackage.adn.a
                public void a() {
                    this.b = true;
                    adp.a(10001);
                }
            }, this.e);
            adp.a(this.f);
            this.f.a((adm) this);
            this.f.b();
        }
    }

    public void h() {
        LogUtils.i("QLoginDialog", "cancel mHasCancel=" + this.g);
        adq adqVar = this.f;
        if (adqVar != null) {
            adqVar.c();
            this.g = true;
        }
    }

    public void i() {
        boolean c = c();
        LogUtils.i("QLoginDialog", "showQrLoginFailDialog:" + c);
        if (c) {
            c_("ShowFail", "");
            c("error");
        }
    }

    public void a(String str) {
        boolean c = c();
        LogUtils.i("QLoginDialog", "showQrLoginDialog:" + c + ListSignBean.COLLECTID_SUFFIX + str);
        if (c) {
            c_("ShowQrCode", str);
            b(str);
        }
    }

    private void l() {
        boolean c = c();
        LogUtils.i("QLoginDialog", "showQrLoginOvertimeDialog::" + c);
        if (c) {
            c_("ShowFail", "overtime");
            c("overtime");
        }
    }

    @Override // defpackage.adm
    public void a() {
        boolean c = c();
        LogUtils.i("QLoginDialog", "onLoginConfirmSuccess:" + c);
        if (c) {
            c_("OnLoginSuccess", "");
            k();
        }
    }

    @Override // defpackage.adm
    public void a(int i, String... strArr) {
        LogUtils.i("QLoginDialog", "onHttpResponseEvent:" + i);
        if (i != 1) {
            return;
        }
        a(strArr.length > 0 ? strArr[0] : "");
    }

    @Override // defpackage.adm
    public void a(int i) {
        LogUtils.i("QLoginDialog", "onLoginConfirmFailed:" + i);
        b(35);
    }

    @Override // defpackage.adm
    public void b(int i) {
        LogUtils.i("QLoginDialog", "onFragmentEvent:" + i);
        if (i != 35) {
            return;
        }
        i();
    }

    @Override // defpackage.adm
    public void c(int i) {
        LogUtils.i("QLoginDialog", "onQRCodeEvent:" + i);
        if (i != 1) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: j */
    public QLoginDialogPresenter g() {
        return new QLoginDialogPresenter();
    }

    public void b(String str) {
        a("wx".equals(this.e) ? "WxLoginDialogViewProxy_login_wx_qrcode" : "QqLoginDialogViewProxy_login_qq_qrcode", ahl.a("", str));
    }

    public void c(String str) {
        a("wx".equals(this.e) ? "WxLoginDialogViewProxy_login_wx_qrcode" : "QqLoginDialogViewProxy_login_qq_qrcode", ahl.a(str, ""));
    }

    public void k() {
        a("wx".equals(this.e) ? "WxLoginDialogViewProxy_login_wx_qrcodesuccess" : "QqLoginDialogViewProxy_login_qq_qrcodesuccess", (AbstractMessageLite) null);
    }
}
