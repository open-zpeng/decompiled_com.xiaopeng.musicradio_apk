package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.xui.widget.XLoading;
/* compiled from: LoginFlowLayout.java */
/* renamed from: adf  reason: default package */
/* loaded from: classes2.dex */
public class adf extends LinearLayout implements View.OnClickListener {
    private Context a;
    private ImageView b;
    private ImageView c;
    private XLoading d;
    private ImageView e;
    private adh f;

    public void setQrCodePresenter(adh adhVar) {
        this.f = adhVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtils.d("LoginFlowFragment", "onClick v=" + this.a.getResources().getResourceName(view.getId()));
        if (view.getId() == f.C0131f.iv_qr_retry) {
            b();
        }
    }

    public void a() {
        LogUtils.d("LoginFlowFragment", "showAccountSameDialog");
        this.b.setVisibility(0);
        this.c.setImageResource(f.e.ic_qr_login_refresh_for_overtime);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public void b() {
        LogUtils.d("LoginFlowFragment", "showRequestQrDialog");
        this.f.b();
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    public void a(Bitmap bitmap) {
        LogUtils.d("LoginFlowFragment", "showQrLoginDialog");
        this.b.setImageBitmap(bitmap);
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public void c() {
        LogUtils.d("LoginFlowFragment", "showQrLoggingDialog");
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    public void d() {
        LogUtils.d("LoginFlowFragment", "showQrLoginFailDialog");
        this.b.setVisibility(8);
        this.c.setImageResource(f.e.ic_qr_login_refresh);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(0);
    }

    public void e() {
        LogUtils.d("LoginFlowFragment", "showQrLoginOvertimeDialog");
        this.b.setVisibility(0);
        this.c.setImageResource(f.e.ic_qr_login_refresh_for_overtime);
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }
}
