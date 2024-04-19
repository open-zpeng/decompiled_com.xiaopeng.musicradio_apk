package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import defpackage.bcr;
/* compiled from: VipXmlyBuyingDlg.java */
/* renamed from: bdb  reason: default package */
/* loaded from: classes2.dex */
public class bdb extends b<Object, com.xiaopeng.musicradio.vip.buying.presenter.b> implements View.OnClickListener {
    private Context a;
    private View b;
    private TextView l;
    private View m;

    public bdb(Context context) {
        super(context, f.i.NewBaseDialog, true);
        this.c = "XmlyVipBuyingDialog";
        this.a = context;
        c();
        d();
        e();
        Window window = getWindow();
        if (window != null) {
            window.setType(2038);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.height = -2;
                attributes.width = -2;
                attributes.gravity = 17;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == bcr.a.tv_vip_contact) {
            ((com.xiaopeng.musicradio.vip.buying.presenter.b) this.d).a(this.a, "400 838 5616");
        }
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    /* renamed from: a */
    public com.xiaopeng.musicradio.vip.buying.presenter.b f() {
        return new com.xiaopeng.musicradio.vip.buying.presenter.b();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return bcr.b.dialog_xmly_vip_buying;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = findViewById(bcr.a.btn_close);
        this.m = findViewById(bcr.a.rl_info_layout);
        this.l = (TextView) findViewById(bcr.a.tv_vip_contact);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
        this.l.setText("400 838 5616");
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.b.setOnClickListener(this);
        this.l.setOnClickListener(this);
    }
}
