package com.xiaopeng.musicradio.mine.history.album.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.history.album.presenter.HistoryAlbumPresenter;
import java.util.List;
/* compiled from: HistoryAlbumActivityProxy.java */
/* loaded from: classes.dex */
public class a extends aim<c, HistoryAlbumPresenter> implements c {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "HistoryAlbumActivityProxy_mine_history_datalist";
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
    public HistoryAlbumPresenter g() {
        return new HistoryAlbumPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    @Override // defpackage.aim, defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        MusicRadioItem b;
        super.a(str, bArr);
        if (!RequestParameters.SUBRESOURCE_DELETE.equals(str) || (b = amc.b(bArr)) == null) {
            return;
        }
        b(b);
    }

    private void b(MusicRadioItem musicRadioItem) {
        MusicRadioItem a = a(musicRadioItem.getId(), musicRadioItem.getType());
        if (a == null) {
            return;
        }
        aml.d(a);
        ((HistoryAlbumPresenter) this.c).g().remove(a);
    }
}
