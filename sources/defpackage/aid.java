package defpackage;

import android.content.Context;
import com.xiaopeng.musicradio.mine.collect.main.presenter.MineCollectPresenter;
/* compiled from: MineCollectViewProxy.java */
/* renamed from: aid  reason: default package */
/* loaded from: classes2.dex */
public class aid extends aeu<aib, MineCollectPresenter> implements aib {
    @Override // defpackage.aib
    public void b_(int i) {
    }

    public aid(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.aeu, defpackage.aev
    public void e() {
        super.e();
        aml.e(2);
        aml.f();
        amn.e();
        amm.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public MineCollectPresenter g() {
        return new MineCollectPresenter();
    }
}
