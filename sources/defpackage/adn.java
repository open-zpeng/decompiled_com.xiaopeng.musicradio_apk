package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
import com.xiaopeng.xui.utils.XuiUtils;
/* compiled from: QLoginFlowDialog.java */
/* renamed from: adn  reason: default package */
/* loaded from: classes2.dex */
public class adn implements adm, View.OnClickListener {
    private Context a;
    private adq b;
    private XDialog c;
    private ado d;
    private boolean e;
    private final String f;
    private b g;

    /* compiled from: QLoginFlowDialog.java */
    /* renamed from: adn$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str, long j);
    }

    public adn(Context context, String str, a aVar) {
        LogUtils.i("QLoginDialog", "LoginFlowDialog");
        this.a = context;
        this.f = str;
        int i = "wx".equals(str) ? f.h.vip_login_text_wx : f.h.vip_login_text_qq;
        this.g = new b(this);
        this.c = new XDialog(this.a, f.i.AccountDialog_Login).setTitle(i).setIcon((Drawable) null).setMessage((CharSequence) null).setPositiveButton((CharSequence) null, (XDialogInterface.OnClickListener) null).setNegativeButton((CharSequence) null, (XDialogInterface.OnClickListener) null).setCloseVisibility(true).setOnCancelListener(this.g).setOnCloseListener(new XDialogInterface.OnCloseListener() { // from class: adn.1
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnCloseListener
            public boolean onClose(XDialog xDialog) {
                LogUtils.i("QLoginDialog", "cancel dialog click");
                adn.this.g();
                return true;
            }
        });
        this.d = new ado(this.a, this.c.getContentView());
        this.b = new adq(aVar, str);
        adp.a(this.b);
        this.d.setQLoginFlowDialog(this);
        this.d.setQrCodePresenter(this.b);
        this.d.setQrCodeType(str);
        this.c.setCustomView((View) this.d, false);
        this.c.getDialog().getWindow().setType(2008);
        h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtils.i("QLoginDialog", "onClick v=" + this.a.getResources().getResourceName(view.getId()));
        if (view.getId() == f.C0131f.iv_qr_retry) {
            d();
        }
    }

    private void h() {
        LogUtils.i("QLoginDialog", "initListener");
        this.c.getDialog().setOnDismissListener(new c(this));
    }

    public void c() {
        adq adqVar = this.b;
        if (adqVar != null) {
            adqVar.a((adm) this);
        }
        this.c.show();
        adp.a(true);
    }

    public void d() {
        LogUtils.i("QLoginDialog", "showRequestQrDialog");
        c();
        this.d.a();
    }

    public void a(final String str) {
        ban.a(new Runnable() { // from class: adn.2
            @Override // java.lang.Runnable
            public void run() {
                final Bitmap a2;
                String str2 = str;
                final boolean z = true;
                if (str2 != null) {
                    if (!str2.startsWith("http://") && !str.startsWith("https://")) {
                        z = false;
                    }
                    LogUtils.i("QLoginDialog", "showQrLoginDialog:" + z + ListSignBean.COLLECTID_SUFFIX + str.length());
                }
                if (!z && "wx".equals(adn.this.f)) {
                    a2 = acy.a(str);
                } else {
                    a2 = acy.a(str, XuiUtils.dip2px(240.0f), -16777216, null);
                }
                ban.g(new Runnable() { // from class: adn.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        adn.this.a(a2, z);
                    }
                });
            }
        });
    }

    public void a(Bitmap bitmap, boolean z) {
        LogUtils.i("QLoginDialog", "showQrLoginDialog");
        if (this.c.getDialog().isShowing()) {
            if ("wx".equals(this.f)) {
                acz.a().a(this.a.getString(f.h.text_wx_qrcode_login_tts));
            } else if ("qq".equals(this.f)) {
                acz.a().a(this.a.getString(f.h.text_qq_qrcode_login_tts));
            }
            this.d.a(this.f, z);
            c();
            this.d.a(bitmap);
        }
    }

    public void e() {
        LogUtils.i("QLoginDialog", "showQrLoginFailDialog");
        if (this.c.getDialog().isShowing()) {
            c();
            this.d.b();
        }
    }

    public void f() {
        LogUtils.i("QLoginDialog", "showQrLoginOvertimeDialog");
        if (this.c.getDialog().isShowing()) {
            c();
            this.d.c();
        }
    }

    public void g() {
        LogUtils.i("QLoginDialog", "cancel isShowing=" + this.c.getDialog().isShowing());
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
            adq adqVar = this.b;
            if (adqVar != null) {
                adqVar.c();
                this.e = true;
            }
        }
    }

    @Override // defpackage.adm
    public void a(int i, String... strArr) {
        LogUtils.i("QLoginDialog", "onHttpResponseEvent:" + i);
        switch (i) {
            case 1:
                a(strArr.length > 0 ? strArr[0] : "");
                return;
            case 2:
                e();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.adm
    public void a() {
        LogUtils.i("QLoginDialog", "onLoginConfirmSuccess");
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    @Override // defpackage.adm
    public void a(int i) {
        LogUtils.i("QLoginDialog", "onLoginConfirmFailed:" + i);
        b(35);
    }

    @Override // defpackage.adm
    public void b(int i) {
        LogUtils.i("QLoginDialog", "onFragmentEvent:" + i);
        if (i == 32) {
            d();
        } else if (i != 35) {
        } else {
            e();
        }
    }

    @Override // defpackage.adm
    public void c(int i) {
        LogUtils.i("QLoginDialog", "onQRCodeEvent:" + i);
        if (i != 1) {
            return;
        }
        f();
    }

    @Override // defpackage.adm
    public void b() {
        LogUtils.i("QLoginDialog", "onCloseDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    /* compiled from: QLoginFlowDialog.java */
    /* renamed from: adn$b */
    /* loaded from: classes2.dex */
    public static class b implements DialogInterface.OnCancelListener {
        private adn a;

        public b(adn adnVar) {
            this.a = adnVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            adn adnVar = this.a;
            this.a = null;
            if (adnVar == null) {
                return;
            }
            Log.i("QLoginDialog", "onCancel: =============");
            if (adnVar.b != null) {
                adnVar.b.c();
                adnVar.e = true;
            }
        }
    }

    /* compiled from: QLoginFlowDialog.java */
    /* renamed from: adn$c */
    /* loaded from: classes2.dex */
    public static class c implements DialogInterface.OnDismissListener {
        private adn a;

        public c(adn adnVar) {
            this.a = adnVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            final adn adnVar = this.a;
            this.a = null;
            if (adnVar == null) {
                return;
            }
            if (adnVar.g != null) {
                adnVar.g.a = null;
                adnVar.g = null;
            }
            Log.i("QLoginDialog", "onDismiss: =============");
            adp.a(false);
            if (!adnVar.e && adnVar.b != null) {
                adnVar.b.c();
            }
            if (adnVar.b != null) {
                adnVar.b.a();
            }
            ban.g(new Runnable() { // from class: adn.c.1
                @Override // java.lang.Runnable
                public void run() {
                    adnVar.b = null;
                }
            });
        }
    }
}
