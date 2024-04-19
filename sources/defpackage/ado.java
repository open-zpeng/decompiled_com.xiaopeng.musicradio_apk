package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.xui.widget.XLoading;
/* compiled from: QLoginFlowLayout.java */
/* renamed from: ado  reason: default package */
/* loaded from: classes2.dex */
public class ado extends LinearLayout implements View.OnClickListener {
    private Context a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private XLoading f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private adq k;
    private adn l;

    public ado(Context context, ViewGroup viewGroup) {
        super(context);
        this.a = context;
        View inflate = LayoutInflater.from(this.a).inflate(f.g.dialog_qr_login, viewGroup, false);
        this.b = (ImageView) inflate.findViewById(f.C0131f.iv_qr_code_bg);
        this.c = (ImageView) inflate.findViewById(f.C0131f.iv_qr_code_overlay);
        this.d = (ImageView) inflate.findViewById(f.C0131f.iv_qr_code);
        this.e = (ImageView) inflate.findViewById(f.C0131f.iv_qr_retry);
        this.e.setOnClickListener(this);
        this.f = (XLoading) inflate.findViewById(f.C0131f.v_loading);
        this.g = (ImageView) inflate.findViewById(f.C0131f.iv_qr_code_fail);
        this.h = (TextView) inflate.findViewById(f.C0131f.tv_qr_code_tips);
        this.i = (TextView) inflate.findViewById(f.C0131f.tv_qq_service_agreement);
        this.i.setOnClickListener(this);
        this.j = (TextView) inflate.findViewById(f.C0131f.tv_qq_privacy);
        this.j.setOnClickListener(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        addView(inflate);
    }

    public void setQLoginFlowDialog(adn adnVar) {
        this.l = adnVar;
    }

    public void setQrCodePresenter(adq adqVar) {
        this.k = adqVar;
    }

    public void setQrCodeType(String str) {
        this.h.setText("wx".equals(str) ? f.h.vip_qr_code_tips_wx : f.h.vip_qr_code_tips_qq);
    }

    public void a(String str, boolean z) {
        if (z || !"wx".equals(str)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(f.d.qr_code_size_wx);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        this.d.setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtils.i("LoginFlowFragment", "onClick v=" + this.a.getResources().getResourceName(view.getId()));
        if (view.getId() == f.C0131f.iv_qr_retry) {
            a();
        } else if (view.getId() == f.C0131f.tv_qq_service_agreement) {
            this.l.g();
            ((bdn) c.a().b(bdn.class)).start("http://y.qq.com/y/static/protocol/car_service.html", null);
        } else if (view.getId() == f.C0131f.tv_qq_privacy) {
            this.l.g();
            ((bdn) c.a().b(bdn.class)).start("https://privacy.qq.com/document/preview/240edaf9672d4df0a7060a38fc91fa1d", null);
        }
    }

    public void a() {
        LogUtils.i("LoginFlowFragment", "showRequestQrDialog");
        this.k.b();
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.g.setVisibility(8);
    }

    public void a(Bitmap bitmap) {
        LogUtils.i("LoginFlowFragment", "showQrLoginDialog");
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setImageBitmap(bitmap);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
    }

    public void b() {
        LogUtils.i("LoginFlowFragment", "showQrLoginFailDialog");
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setImageResource(f.e.ic_qr_login_refresh);
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }

    public void c() {
        LogUtils.i("LoginFlowFragment", "showQrLoginOvertimeDialog");
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setImageResource(f.e.ic_qr_login_refresh_for_overtime);
        this.e.setVisibility(0);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
    }
}
