package com.xiaopeng.musicradio.mine.collect.netradio.view;

import android.content.Context;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.collect.netradio.presenter.CollectedNetradioPresenter;
import java.util.List;
/* compiled from: CollectedNetRadioViewProxy.java */
/* loaded from: classes.dex */
public class b extends aio<c, CollectedNetradioPresenter> implements c {
    @Override // defpackage.aiq
    protected void a(f fVar, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    public b(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public CollectedNetradioPresenter g() {
        return new CollectedNetradioPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        List g = ((CollectedNetradioPresenter) this.c).g();
        d(g);
        a(g);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    public void a(List list) {
        a("CollectedNetRadioViewProxy_mine_collect_datalist", amb.b(false, false, false, list));
    }
}
