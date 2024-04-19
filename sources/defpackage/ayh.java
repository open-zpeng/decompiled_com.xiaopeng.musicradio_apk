package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import com.xiaopeng.xui.widget.XRelativeLayout;
import com.xiaopeng.xui.widget.XTextView;
/* compiled from: SearchLoginDlg.java */
/* renamed from: ayh  reason: default package */
/* loaded from: classes2.dex */
public class ayh extends b implements View.OnClickListener {
    private Context a;
    private View b;
    private XRelativeLayout l;
    private XRelativeLayout m;
    private XTextView n;
    private XTextView o;
    private String p;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected e f() {
        return null;
    }

    public ayh(Context context) {
        super(context, f.i.NewBaseDialog, true);
        this.p = null;
        this.c = "SearchLoginDialog";
        this.a = context;
        c();
        d();
        e();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return a.e.dialog_search_login;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = findViewById(a.d.btn_close);
        this.l = (XRelativeLayout) findViewById(a.d.weixin_login);
        this.m = (XRelativeLayout) findViewById(a.d.qq_login);
        this.n = (XTextView) findViewById(a.d.weixin_last_login);
        this.o = (XTextView) findViewById(a.d.qq_last_login);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
        a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.b.setOnClickListener(this);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: ayh.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ayh.this.dismiss();
                adp.a(ayh.this.p);
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() { // from class: ayh.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ayh.this.dismiss();
                adp.b(ayh.this.p);
            }
        });
    }

    private void a() {
        String b = ((aqs) apx.a().b()).b();
        if (TextUtils.equals(b, "qq")) {
            this.o.setVisibility(0);
            this.n.setVisibility(8);
        } else if (TextUtils.equals(b, "wx")) {
            this.o.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            this.o.setVisibility(8);
            this.n.setVisibility(8);
        }
    }

    public void a(String str) {
        this.p = str;
    }
}
