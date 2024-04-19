package com.xiaopeng.musicradio.mine.history.netradio.view;

import android.content.Context;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.history.netradio.presenter.HistoryNetradioPresenter;
import java.util.List;
/* compiled from: HistoryNetRadioViewProxy.java */
/* loaded from: classes.dex */
public class b extends aio<c, HistoryNetradioPresenter> implements c {
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
    public HistoryNetradioPresenter g() {
        return new HistoryNetradioPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        List g = ((HistoryNetradioPresenter) this.c).g();
        d(g);
        a(g);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    public void a(List list) {
        a("HistoryNetRadioViewProxy_mine_history_datalist", amb.b(false, false, false, list));
    }
}
