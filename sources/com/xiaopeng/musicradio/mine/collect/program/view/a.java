package com.xiaopeng.musicradio.mine.collect.program.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.program.presenter.CollectedProgramPresenter;
import java.util.List;
/* compiled from: CollectProgramActivityProxy.java */
/* loaded from: classes.dex */
public class a extends aip<c, CollectedProgramPresenter> implements c {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "CollectProgramActivityProxy_mine_collect_datalist";
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
    public CollectedProgramPresenter g() {
        return new CollectedProgramPresenter(50, null);
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
        amn.a(a, false);
        ((CollectedProgramPresenter) this.c).g().remove(a);
    }
}
