package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.mvpbase.b;
import com.xiaopeng.xui.utils.XuiUtils;
import com.xiaopeng.xui.widget.XImageView;
import defpackage.bcr;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.SoftReference;
/* compiled from: VipBuyingDlg.java */
/* renamed from: bda  reason: default package */
/* loaded from: classes2.dex */
public class bda extends b<bcy, com.xiaopeng.musicradio.vip.buying.presenter.a> implements View.OnClickListener, bcy {
    private Context a;
    private View b;
    private TextView l;
    private TextView m;
    private LoadingTipsView n;
    private XImageView o;
    private View p;
    private a q;
    private Disposable r;

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void d() {
    }

    public bda(Context context) {
        super(context, f.i.NewBaseDialog, true);
        this.q = new a();
        this.c = "VipBuyingDialog";
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
        if (view.getId() == bcr.a.tv_qq_vip_contact) {
            ((bdn) c.a().b(bdn.class)).start("https://y.qq.com/jzt/service_terms/1e602e.html", null);
        }
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    /* renamed from: g */
    public com.xiaopeng.musicradio.vip.buying.presenter.a f() {
        return new com.xiaopeng.musicradio.vip.buying.presenter.a();
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected int b() {
        return bcr.b.dialog_vip_buying;
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void c() {
        this.b = findViewById(bcr.a.btn_close);
        this.l = (TextView) findViewById(bcr.a.tv_nick_name);
        this.n = (LoadingTipsView) findViewById(bcr.a.loading_tips_view);
        this.o = (XImageView) findViewById(bcr.a.iv_img);
        this.p = findViewById(bcr.a.rl_info_layout);
        this.m = (TextView) findViewById(bcr.a.tv_qq_vip_contact);
    }

    @Override // com.xiaopeng.musicradio.widget.mvpbase.b
    protected void e() {
        this.b.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: bda.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bda.this.n.getState() == 2) {
                    bda.this.k();
                    bda.this.q.a(null);
                    bda.this.q.b(null);
                    ((com.xiaopeng.musicradio.vip.buying.presenter.a) bda.this.d).h();
                }
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        k();
        ((com.xiaopeng.musicradio.vip.buying.presenter.a) this.d).h();
    }

    private void a(String str) {
        Disposable disposable = this.r;
        if (disposable != null && !disposable.isDisposed()) {
            this.r.dispose();
        }
        this.r = Flowable.just(str).observeOn(Schedulers.io()).map(new Function<String, SoftReference<Bitmap>>() { // from class: bda.4
            @Override // io.reactivex.functions.Function
            /* renamed from: a */
            public SoftReference<Bitmap> apply(String str2) {
                return new SoftReference<>(acy.a(str2, XuiUtils.dip2px(240.0f), -16777216, null));
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<SoftReference<Bitmap>>() { // from class: bda.2
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(SoftReference<Bitmap> softReference) {
                bda.this.a(softReference.get());
            }
        }, new Consumer<Throwable>() { // from class: bda.3
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Throwable th) {
                bda.this.a((Bitmap) null);
            }
        });
    }

    @Override // defpackage.bcy
    public void a(String str, String str2) {
        this.l.setText(str);
        this.q.b(true);
        this.q.a(null);
        a(str2);
        h();
    }

    @Override // defpackage.bcy
    public void a() {
        this.q.a(false);
        this.q.b(false);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        if (bitmap == null) {
            this.q.a(false);
        } else {
            this.o.setImageBitmap(bitmap);
            this.q.a(true);
        }
        h();
    }

    private void h() {
        if (this.q.c()) {
            return;
        }
        if (this.q.d()) {
            l();
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.l.setVisibility(4);
        this.p.setVisibility(4);
        this.n.setState(1);
    }

    private void l() {
        this.l.setVisibility(0);
        this.p.setVisibility(0);
        this.n.setState(0);
    }

    private void m() {
        this.l.setVisibility(4);
        this.p.setVisibility(4);
        this.n.setState(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VipBuyingDlg.java */
    /* renamed from: bda$a */
    /* loaded from: classes2.dex */
    public class a {
        private Boolean b;
        private Boolean c;

        private a() {
        }

        public boolean a() {
            Boolean bool = this.b;
            return bool != null && bool.booleanValue();
        }

        public void a(Boolean bool) {
            this.b = bool;
        }

        public boolean b() {
            Boolean bool = this.c;
            return bool != null && bool.booleanValue();
        }

        public void b(Boolean bool) {
            this.c = bool;
        }

        public boolean c() {
            return this.b == null || this.c == null;
        }

        public boolean d() {
            return a() && b();
        }
    }
}
