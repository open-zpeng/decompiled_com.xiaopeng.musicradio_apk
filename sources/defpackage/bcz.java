package defpackage;

import android.content.Context;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.vip.buying.presenter.VipBuyingPresenter2;
import com.xiaopeng.musicradio.vip.buying.presenter.a;
/* compiled from: ViewBuyingViewProxy.java */
/* renamed from: bcz  reason: default package */
/* loaded from: classes2.dex */
public class bcz extends aeu<bcy, VipBuyingPresenter2> implements bcy {
    private a e;

    public bcz(Context context, String str) {
        super(context, str);
        this.e = new a();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void e() {
        super.e();
        this.e.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: b */
    public VipBuyingPresenter2 g() {
        return new VipBuyingPresenter2();
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        if ("getAccountInfo".equals(str)) {
            this.e.h();
        }
    }

    @Override // defpackage.bcy
    public void a(String str, String str2) {
        a(bdi.a(false, str, str2));
    }

    @Override // defpackage.bcy
    public void a() {
        a(bdi.a(true, "", ""));
    }

    public void a(AbstractMessageLite abstractMessageLite) {
        a("VipBuyingViewProxy_vip_buying_getaccountinfo", abstractMessageLite);
    }
}
