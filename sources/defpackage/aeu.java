package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
/* compiled from: AbsViewProxy.java */
/* renamed from: aeu  reason: default package */
/* loaded from: classes2.dex */
public abstract class aeu<UIInterface, Presenter extends BasePresenter<UIInterface>> implements aev {
    protected Context a;
    protected String b;
    protected Presenter c;
    protected boolean d;

    public void a(String str, Boolean bool) {
    }

    public void a(String str, Number number) {
    }

    public void a(String str, Object obj) {
    }

    @Override // defpackage.aev
    public void a(String str, byte[] bArr) {
    }

    public void c_(String str, String str2) {
    }

    protected abstract Presenter g();

    public aeu(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public boolean c() {
        return this.d;
    }

    @Override // defpackage.aev
    public void d() {
        this.c = g();
        this.c.a(this);
        this.c.onCreate(null);
    }

    @Override // defpackage.aev
    public void e() {
        this.d = true;
    }

    @Override // defpackage.aev
    public void f() {
        this.c.onStart(null);
    }

    public void a(String str, AbstractMessageLite abstractMessageLite) {
        aex.a().a(str, abstractMessageLite == null ? "".getBytes() : abstractMessageLite.toByteArray());
    }

    public void b(String str, AbstractMessageLite abstractMessageLite) {
        aex.a().b(str, abstractMessageLite == null ? "".getBytes() : abstractMessageLite.toByteArray());
    }
}
