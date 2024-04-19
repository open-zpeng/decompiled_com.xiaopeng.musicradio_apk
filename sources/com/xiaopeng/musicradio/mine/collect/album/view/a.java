package com.xiaopeng.musicradio.mine.collect.album.view;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.lib.utils.view.ToastUtils;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.album.presenter.CollectedAlbumPresenter;
import defpackage.aht;
import java.util.List;
/* compiled from: CollectAlbumActivityProxy.java */
/* loaded from: classes.dex */
public class a extends aim<c, CollectedAlbumPresenter> implements c {
    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "CollectAlbumActivityProxy_mine_collect_datalist";
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
    public CollectedAlbumPresenter g() {
        return new CollectedAlbumPresenter(50, null);
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
        final MusicRadioItem a = a(musicRadioItem.getId(), musicRadioItem.getType());
        if (a == null) {
            return;
        }
        final LiveData<Boolean> a2 = aml.a(a, false);
        a2.a(new o<Boolean>() { // from class: com.xiaopeng.musicradio.mine.collect.album.view.a.1
            @Override // androidx.lifecycle.o
            public void a(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    a2.b((o) this);
                    ((CollectedAlbumPresenter) a.this.c).g().remove(a);
                    return;
                }
                Application a3 = com.xiaopeng.musicradio.a.a();
                ToastUtils.getToast(a3, a3.getString(aht.e.delete_album_fail_template, a.getTitle()));
            }
        });
    }
}
