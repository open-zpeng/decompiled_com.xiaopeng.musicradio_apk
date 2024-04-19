package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: XpAccountLoginDlg.java */
/* renamed from: bdv  reason: default package */
/* loaded from: classes2.dex */
public class bdv extends b implements View.OnClickListener {
    private boolean a;
    private ada b;
    private a l;
    private Context m;
    private ImageView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private View s;

    /* compiled from: XpAccountLoginDlg.java */
    /* renamed from: bdv$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected e f() {
        return null;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return f.g.dialog_xp_account_login;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.s = this.h.findViewById(f.C0131f.root_layout);
        this.n = (ImageView) findViewById(f.C0131f.iv_avatar);
        this.o = (TextView) findViewById(f.C0131f.tv_nick_name);
        this.p = (TextView) findViewById(f.C0131f.tv_phone);
        this.q = (TextView) findViewById(f.C0131f.btn_ok);
        this.r = (TextView) findViewById(f.C0131f.btn_login_other);
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        findViewById(f.C0131f.btn_close).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.C0131f.btn_close) {
            dismiss();
        } else if (view.getId() == f.C0131f.btn_ok) {
            this.a = true;
            this.l.a();
            dismiss();
        } else {
            this.a = true;
            this.l.b();
            dismiss();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
        y.a(com.xiaopeng.musicradio.a.a(), this.b.b(), f.e.img_header_default, this.n);
        this.o.setText(this.b.a());
        String c = this.b.c();
        if (TextUtils.isEmpty(c)) {
            this.p.setVisibility(8);
            return;
        }
        this.p.setText(this.m.getString(f.h.text_xp_id_template, c));
        this.p.setVisibility(0);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        u.b(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerChange(agg.s sVar) {
        if (sVar == null || sVar.a() || !isShowing()) {
            return;
        }
        dismiss();
    }
}
