package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import com.xiaopeng.xui.utils.XuiUtils;
/* compiled from: LoginFlowDialog.java */
/* renamed from: ade  reason: default package */
/* loaded from: classes2.dex */
public class ade implements add, View.OnClickListener {
    private Context a;
    private adh b;
    private XDialog c;
    private Bitmap d;
    private adf e;
    private XDialogInterface.OnClickListener f;
    private BroadcastReceiver g;

    /* compiled from: LoginFlowDialog.java */
    /* renamed from: ade$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtils.d("LoginFlowDialog", "onClick v=" + this.a.getResources().getResourceName(view.getId()));
        if (view.getId() == f.C0131f.iv_qr_retry) {
            d();
        }
    }

    public void b() {
        adh adhVar = this.b;
        if (adhVar != null) {
            adhVar.a((add) this);
        }
        this.c.show();
        adg.a(true);
        i();
    }

    public void c() {
        LogUtils.d("LoginFlowDialog", "showAccountSameDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_login_same));
            this.c.setPositiveButton(this.a.getString(f.h.label_login_dialog_btn_cancel), this.f);
            this.e.a();
        }
    }

    public void d() {
        LogUtils.d("LoginFlowDialog", "showRequestQrDialog");
        this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_begin));
        this.c.setPositiveButton(this.a.getText(f.h.label_login_dialog_btn_cancel), this.f);
        b();
        this.e.b();
    }

    public void b(final String str) {
        ban.a(new Runnable() { // from class: -$$Lambda$ade$ipJdCOolDoheV_b_yMOkqhQ5oJU
            @Override // java.lang.Runnable
            public final void run() {
                ade.this.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        final Bitmap a2 = acy.a(str, XuiUtils.dip2px(240.0f), -16777216, this.d);
        ban.g(new Runnable() { // from class: -$$Lambda$ade$TLV_Elkk6ijwqCOq05s_E3F_cxc
            @Override // java.lang.Runnable
            public final void run() {
                ade.this.b(a2);
            }
        });
    }

    /* renamed from: a */
    public void b(Bitmap bitmap) {
        LogUtils.d("LoginFlowDialog", "showQrLoginDialog");
        if (this.c.getDialog().isShowing()) {
            if (h()) {
                acz.a().a(this.a.getString(f.h.label_login_dialog_title_change_tts));
                this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_change));
            } else {
                acz.a().a(this.a.getString(f.h.text_qrcode_login_tts));
                this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_begin));
            }
            b();
            this.e.a(bitmap);
        }
    }

    public void e() {
        LogUtils.d("LoginFlowDialog", "showQrLoggingDialog");
        this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_logging));
        this.c.setPositiveButton(this.a.getText(f.h.label_login_dialog_btn_cancel), this.f);
        b();
        this.e.c();
    }

    public void f() {
        LogUtils.d("LoginFlowDialog", "showQrLoginFailDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_network));
            this.c.setPositiveButton(this.a.getText(f.h.label_login_dialog_btn_cancel), this.f);
            b();
            this.e.d();
        }
    }

    public void g() {
        LogUtils.d("LoginFlowDialog", "showQrLoginOvertimeDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.setTitle(this.a.getString(f.h.label_login_dialog_title_overtime));
            this.c.setPositiveButton(this.a.getText(f.h.label_login_dialog_btn_cancel), this.f);
            b();
            this.e.e();
        }
    }

    public boolean h() {
        return aqi.a().f();
    }

    @Override // defpackage.add
    public void a(int i, String... strArr) {
        LogUtils.d("LoginFlowDialog", "onHttpResponseEvent:" + i);
        if (i != 6) {
            switch (i) {
                case 1:
                    b(strArr.length > 0 ? strArr[0] : "");
                    return;
                case 2:
                    f();
                    return;
                case 3:
                    g();
                    return;
                default:
                    return;
            }
        }
        c();
    }

    @Override // defpackage.add
    public void a(String str) {
        LogUtils.d("LoginFlowDialog", "onLoginConfirmSuccess:" + str);
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    @Override // defpackage.add
    public void a(int i) {
        LogUtils.d("LoginFlowDialog", "onLoginConfirmFailed:" + i);
        b(35);
    }

    @Override // defpackage.add
    public void b(int i) {
        LogUtils.d("LoginFlowDialog", "onFragmentEvent:" + i);
        if (i == 32) {
            d();
        } else if (i == 35) {
            f();
        } else if (i != 37) {
        } else {
            e();
        }
    }

    @Override // defpackage.add
    public void c(int i) {
        LogUtils.d("LoginFlowDialog", "onQRCodeEvent:" + i);
        if (i != 1) {
            return;
        }
        g();
    }

    @Override // defpackage.add
    public void a() {
        LogUtils.d("LoginFlowDialog", "onCloseDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    private void i() {
        try {
            jd.a(com.xiaopeng.musicradio.a.a()).a(this.g, new IntentFilter("action_exit_dialog"));
        } catch (Exception e) {
            LogUtils.e("LoginFlowDialog", "registerReceiver:" + e);
        }
    }
}
