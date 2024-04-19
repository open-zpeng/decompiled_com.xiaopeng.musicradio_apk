package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.login.manager.dialog.presenter.XmlyLoginDialogPresenter;
import defpackage.adx;
/* compiled from: XmlyLoginDialogViewProxy.java */
/* renamed from: ahh  reason: default package */
/* loaded from: classes2.dex */
public class ahh extends aeu<adv, XmlyLoginDialogPresenter> implements adv {
    private adw e;
    private boolean f;

    @Override // defpackage.adv
    public void b() {
    }

    public ahh(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if ("OnLoginClose".equals(str)) {
            h();
        } else if ("ApplyQrCode".equals(str)) {
            this.e.b();
        }
        if ("getQrCode".equals(str)) {
            this.e = new adw(new adx.a() { // from class: ahh.1
                private boolean b;

                @Override // defpackage.adx.a
                public void a(String str2, String str3) {
                    adz.a(str2, str3, this.b);
                }

                @Override // defpackage.adx.a
                public void a() {
                    this.b = true;
                    adz.a(10001);
                }
            });
            adz.a(this.e);
            this.e.a((adv) this);
            this.e.b();
        }
    }

    public void h() {
        LogUtils.i("XmlyLoginDialog", "cancel mHasCancel=" + this.f);
        adw adwVar = this.e;
        if (adwVar != null) {
            adwVar.c();
            this.f = true;
        }
    }

    public void i() {
        boolean c = c();
        LogUtils.i("XmlyLoginDialog", "showQrLoginFailDialog:" + c);
        if (c) {
            c_("ShowFail", "");
            c("error");
        }
    }

    public void a(String str) {
        boolean c = c();
        LogUtils.i("XmlyLoginDialog", "showQrLoginDialog:" + c + ListSignBean.COLLECTID_SUFFIX + str);
        if (c) {
            c_("ShowQrCode", str);
            b(str);
        }
    }

    private void l() {
        boolean c = c();
        LogUtils.i("XmlyLoginDialog", "showQrLoginOvertimeDialog::" + c);
        if (c) {
            c_("ShowFail", "overtime");
            c("overtime");
        }
    }

    @Override // defpackage.adv
    public void a() {
        boolean c = c();
        LogUtils.i("XmlyLoginDialog", "onLoginConfirmSuccess:" + c);
        if (c) {
            c_("OnLoginSuccess", "");
            k();
        }
    }

    @Override // defpackage.adv
    public void a(int i, String... strArr) {
        LogUtils.i("XmlyLoginDialog", "onHttpResponseEvent:" + i);
        if (i != 1) {
            return;
        }
        a(strArr.length > 0 ? strArr[0] : "");
    }

    @Override // defpackage.adv
    public void a(int i) {
        LogUtils.i("XmlyLoginDialog", "onLoginConfirmFailed:" + i);
        b(35);
    }

    @Override // defpackage.adv
    public void b(int i) {
        LogUtils.i("XmlyLoginDialog", "onFragmentEvent:" + i);
        if (i != 35) {
            return;
        }
        i();
    }

    @Override // defpackage.adv
    public void c(int i) {
        LogUtils.i("XmlyLoginDialog", "onQRCodeEvent:" + i);
        if (i != 1) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: j */
    public XmlyLoginDialogPresenter g() {
        return new XmlyLoginDialogPresenter();
    }

    public void b(String str) {
        a("XmlyLoginDialogViewProxy_login_xmly_qrcode", ahl.a("", str));
    }

    public void c(String str) {
        a("XmlyLoginDialogViewProxy_login_xmly_qrcode", ahl.a(str, ""));
    }

    public void k() {
        a("XmlyLoginDialogViewProxy_login_xmly_qrcodesuccess", (AbstractMessageLite) null);
    }
}
