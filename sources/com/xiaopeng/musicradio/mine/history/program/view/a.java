package com.xiaopeng.musicradio.mine.history.program.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.history.program.presenter.HistoryProgramPresenter;
import java.util.List;
/* compiled from: HistoryProgramActivityProxy.java */
/* loaded from: classes.dex */
public class a extends aip<c, HistoryProgramPresenter> implements c {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "HistoryProgramActivityProxy_mine_history_datalist";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    public a(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public HistoryProgramPresenter g() {
        return new HistoryProgramPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    @Override // defpackage.aip, defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        RdAlbumBean d;
        super.a(str, bArr);
        if (!RequestParameters.SUBRESOURCE_DELETE.equals(str) || (d = amc.d(bArr)) == null) {
            return;
        }
        b(d);
    }

    private void b(RdAlbumBean rdAlbumBean) {
        RdAlbumBean a = a(rdAlbumBean.getId());
        if (a == null) {
            return;
        }
        amn.c(a);
        ((HistoryProgramPresenter) this.c).g().remove(a);
    }
}
