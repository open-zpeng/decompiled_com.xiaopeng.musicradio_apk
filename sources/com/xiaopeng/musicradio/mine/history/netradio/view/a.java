package com.xiaopeng.musicradio.mine.history.netradio.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.history.netradio.presenter.HistoryNetradioPresenter;
import java.util.List;
/* compiled from: HistoryNetRadioActivityProxy.java */
/* loaded from: classes.dex */
public class a extends aio<c, HistoryNetradioPresenter> implements c {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "HistoryNetRadioActivityProxy_mine_history_datalist";
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
    public HistoryNetradioPresenter g() {
        return new HistoryNetradioPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    @Override // defpackage.aio, defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        NetRadioInfo c;
        super.a(str, bArr);
        if (!RequestParameters.SUBRESOURCE_DELETE.equals(str) || (c = amc.c(bArr)) == null) {
            return;
        }
        b(c);
    }

    private void b(NetRadioInfo netRadioInfo) {
        NetRadioInfo c = c(netRadioInfo.getId());
        if (c == null) {
            return;
        }
        amm.c(c);
        ((HistoryNetradioPresenter) this.c).g().remove(c);
    }
}
