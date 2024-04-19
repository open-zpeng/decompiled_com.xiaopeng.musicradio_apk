package com.xiaopeng.musicradio.mine.history.program.view;

import android.content.Context;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.history.program.presenter.HistoryProgramPresenter;
import java.util.List;
/* compiled from: HistoryProgramViewProxy.java */
/* loaded from: classes.dex */
public class b extends aip<c, HistoryProgramPresenter> implements c {
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
    public HistoryProgramPresenter g() {
        return new HistoryProgramPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        List g = ((HistoryProgramPresenter) this.c).g();
        d(g);
        a(g);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    public void a(List list) {
        a("HistoryProgramViewProxy_mine_history_datalist", amb.c(false, false, false, list));
    }
}
