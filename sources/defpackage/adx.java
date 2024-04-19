package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.app.XDialog;
import com.xiaopeng.xui.app.XDialogInterface;
/* compiled from: XmlyLoginFlowDialog.java */
/* renamed from: adx  reason: default package */
/* loaded from: classes2.dex */
public class adx implements adv, View.OnClickListener {
    private Context a;
    private adw b;
    private XDialog c;
    private ady d;
    private boolean e;
    private b f;

    /* compiled from: XmlyLoginFlowDialog.java */
    /* renamed from: adx$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str, String str2);
    }

    public adx(Context context, a aVar) {
        LogUtils.i("XmlyLoginFlowDialog", "XmlyLoginFlowDialog");
        this.a = context;
        int i = f.h.vip_login_text_xmly;
        this.f = new b(this);
        this.c = new XDialog(this.a, f.i.AccountDialog_Login).setTitle(i).setIcon((Drawable) null).setMessage((CharSequence) null).setPositiveButton((CharSequence) null, (XDialogInterface.OnClickListener) null).setNegativeButton((CharSequence) null, (XDialogInterface.OnClickListener) null).setCloseVisibility(true).setOnCancelListener(this.f).setOnCloseListener(new XDialogInterface.OnCloseListener() { // from class: adx.1
            @Override // com.xiaopeng.xui.app.XDialogInterface.OnCloseListener
            public boolean onClose(XDialog xDialog) {
                LogUtils.i("XmlyLoginFlowDialog", "cancel dialog click");
                adx.this.g();
                return true;
            }
        });
        this.c.setVuiSceneId("LoginReadingDialog");
        this.c.setVuiEngine(VuiEngine.getInstance(com.xiaopeng.musicradio.a.a()));
        this.d = new ady(this.a, this.c.getContentView());
        this.b = new adw(aVar);
        adz.a(this.b);
        this.d.setQLoginFlowDialog(this);
        this.d.setQrCodePresenter(this.b);
        this.c.setCustomView((View) this.d, false);
        this.c.getDialog().getWindow().setType(2008);
        h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtils.i("XmlyLoginFlowDialog", "onClick v=" + this.a.getResources().getResourceName(view.getId()));
        if (view.getId() == f.C0131f.iv_qr_retry) {
            d();
        }
    }

    private void h() {
        LogUtils.i("XmlyLoginFlowDialog", "initListener");
        this.c.getDialog().setOnDismissListener(new c(this));
    }

    public void c() {
        adw adwVar = this.b;
        if (adwVar != null) {
            adwVar.a((adv) this);
        }
        this.c.show();
        adz.a(true);
    }

    public void d() {
        LogUtils.i("XmlyLoginFlowDialog", "showRequestQrDialog");
        c();
        this.d.a();
    }

    public void a(final String str) {
        ban.a(new Runnable() { // from class: adx.2
            @Override // java.lang.Runnable
            public void run() {
                final Bitmap a2 = acy.a(str);
                ban.g(new Runnable() { // from class: adx.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        adx.this.a(a2);
                    }
                });
            }
        });
    }

    public void a(Bitmap bitmap) {
        LogUtils.i("XmlyLoginFlowDialog", "showQrLoginDialog");
        if (this.c.getDialog().isShowing()) {
            acz.a().a(this.a.getString(f.h.text_xmly_qrcode_login_tts));
            c();
            this.d.a(bitmap);
        }
    }

    public void e() {
        LogUtils.i("XmlyLoginFlowDialog", "showQrLoginFailDialog");
        if (this.c.getDialog().isShowing()) {
            c();
            this.d.b();
        }
    }

    public void f() {
        LogUtils.i("XmlyLoginFlowDialog", "showQrLoginOvertimeDialog");
        if (this.c.getDialog().isShowing()) {
            c();
            this.d.c();
        }
    }

    public void g() {
        LogUtils.i("XmlyLoginFlowDialog", "cancel isShowing=" + this.c.getDialog().isShowing());
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
            adw adwVar = this.b;
            if (adwVar != null) {
                adwVar.c();
                this.e = true;
            }
        }
    }

    @Override // defpackage.adv
    public void a(int i, String... strArr) {
        LogUtils.i("XmlyLoginFlowDialog", "onHttpResponseEvent:" + i);
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

    @Override // defpackage.adv
    public void a() {
        LogUtils.i("XmlyLoginFlowDialog", "onLoginConfirmSuccess");
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    @Override // defpackage.adv
    public void a(int i) {
        LogUtils.i("XmlyLoginFlowDialog", "onLoginConfirmFailed:" + i);
        b(35);
    }

    @Override // defpackage.adv
    public void b(int i) {
        LogUtils.i("XmlyLoginFlowDialog", "onFragmentEvent:" + i);
        if (i == 32) {
            d();
        } else if (i != 35) {
        } else {
            e();
        }
    }

    @Override // defpackage.adv
    public void c(int i) {
        LogUtils.i("XmlyLoginFlowDialog", "onQRCodeEvent:" + i);
        if (i != 1) {
            return;
        }
        f();
    }

    @Override // defpackage.adv
    public void b() {
        LogUtils.i("XmlyLoginFlowDialog", "onCloseDialog");
        if (this.c.getDialog().isShowing()) {
            this.c.dismiss();
        }
    }

    /* compiled from: XmlyLoginFlowDialog.java */
    /* renamed from: adx$b */
    /* loaded from: classes2.dex */
    public static class b implements DialogInterface.OnCancelListener {
        private adx a;

        public b(adx adxVar) {
            this.a = adxVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            adx adxVar = this.a;
            this.a = null;
            if (adxVar == null) {
                return;
            }
            Log.i("XmlyLoginFlowDialog", "onCancel: =============");
            if (adxVar.b != null) {
                adxVar.b.c();
                adxVar.e = true;
            }
        }
    }

    /* compiled from: XmlyLoginFlowDialog.java */
    /* renamed from: adx$c */
    /* loaded from: classes2.dex */
    public static class c implements DialogInterface.OnDismissListener {
        private adx a;

        public c(adx adxVar) {
            this.a = adxVar;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            final adx adxVar = this.a;
            this.a = null;
            if (adxVar == null) {
                return;
            }
            if (adxVar.f != null) {
                adxVar.f.a = null;
                adxVar.f = null;
            }
            Log.i("XmlyLoginFlowDialog", "onDismiss: =============");
            adz.a(false);
            if (!adxVar.e && adxVar.b != null) {
                adxVar.b.c();
            }
            if (adxVar.b != null) {
                adxVar.b.a();
            }
            ban.g(new Runnable() { // from class: adx.c.1
                @Override // java.lang.Runnable
                public void run() {
                    adxVar.b = null;
                }
            });
        }
    }
}
