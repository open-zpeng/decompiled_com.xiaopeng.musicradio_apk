package com.xiaopeng.musicradio.mine.history.album.presenter;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.mine.history.album.view.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class HistoryAlbumPresenter extends MsDataBasePresenter<c> {
    public HistoryAlbumPresenter(int i, String str) {
        super(i, str);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("CollectedAlbumPresenter", "onDestroy");
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(e eVar) {
        final LiveData<f<MusicRadioItem>> c = aml.c(eVar);
        c.a(new o<f<MusicRadioItem>>() { // from class: com.xiaopeng.musicradio.mine.history.album.presenter.HistoryAlbumPresenter.1
            @Override // androidx.lifecycle.o
            public void a(f<MusicRadioItem> fVar) {
                c.b((o) this);
                HistoryAlbumPresenter.this.a((f) fVar);
                c a = HistoryAlbumPresenter.this.a();
                if (HistoryAlbumPresenter.this.i() || fVar == null || !(a instanceof View)) {
                    return;
                }
                aks.a().a((View) HistoryAlbumPresenter.this.a(), HistoryAlbumPresenter.this.b(fVar.o));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void b(f fVar) {
        c a = a();
        if (a != null) {
            v();
            a.a((List) null, -1);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(age.c cVar) {
        a("Info");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(age.l lVar) {
        a("PlayState");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(akq akqVar) {
        if (!p() || a() == null) {
            return;
        }
        v();
        a().j_();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (!p() || a() == null) {
            return;
        }
        v();
        a().j_();
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        if (!p() || a() == null) {
            return;
        }
        boolean d = aml.d();
        LogUtils.i("CollectedAlbumPresenter", "updatePlayingStatus:playing=" + d + ",from=" + str);
        if (d) {
            final ListSignBean listSignBean = (ListSignBean) z.a(aml.e(), (Class<Object>) ListSignBean.class);
            if (listSignBean != null) {
                a().a(true, (c.a) new c.a<MusicRadioItem>(null) { // from class: com.xiaopeng.musicradio.mine.history.album.presenter.HistoryAlbumPresenter.2
                    @Override // com.xiaopeng.musicradio.datalist.c.a
                    public boolean a(MusicRadioItem musicRadioItem) {
                        return musicRadioItem != null && listSignBean.getCollectId() == musicRadioItem.getId();
                    }
                });
                return;
            } else {
                a().a(false, (c.a) null);
                return;
            }
        }
        a().a(false, (c.a) null);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public a r() {
        return akr.a().a(this.q);
    }
}
