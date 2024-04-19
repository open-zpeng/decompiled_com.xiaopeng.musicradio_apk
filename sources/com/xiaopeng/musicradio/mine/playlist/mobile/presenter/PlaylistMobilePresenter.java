package com.xiaopeng.musicradio.mine.playlist.mobile.presenter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.mine.playlist.mobile.view.a;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@Deprecated
/* loaded from: classes.dex */
public class PlaylistMobilePresenter extends MsDataBasePresenter<a> {
    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("PlaylistMobilePresenter", "onDestroy");
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(final e eVar) {
        a(a(true) ? 1 : 0);
        final LiveData<List<MusicAlbumCollect>> b = aml.b(eVar.f);
        b.a(new o<List<MusicAlbumCollect>>() { // from class: com.xiaopeng.musicradio.mine.playlist.mobile.presenter.PlaylistMobilePresenter.1
            @Override // androidx.lifecycle.o
            public void a(List<MusicAlbumCollect> list) {
                b.b((o) this);
                PlaylistMobilePresenter.this.a(f.a(eVar, list, "getMobileAlbumList"));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void b(f fVar) {
        a a = a();
        if (a != null) {
            v();
            a.a((List) null, -1);
        }
        a(0);
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
    public void onEvent(alq alqVar) {
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
        boolean a = aml.a(ListSignBean.LISTSIGN_PHONE_MUSIC);
        LogUtils.i("PlaylistMobilePresenter", "updatePlayingStatus:playing=" + a + ",from=" + str);
        if (a) {
            final ListSignBean listSignBean = (ListSignBean) z.a(aml.e(), (Class<Object>) ListSignBean.class);
            if (listSignBean != null) {
                a().a(true, (c.a) new c.a<MusicAlbumCollect>(null) { // from class: com.xiaopeng.musicradio.mine.playlist.mobile.presenter.PlaylistMobilePresenter.2
                    @Override // com.xiaopeng.musicradio.datalist.c.a
                    public boolean a(MusicAlbumCollect musicAlbumCollect) {
                        return (musicAlbumCollect == null || musicAlbumCollect == null || listSignBean.collectId != musicAlbumCollect.getId()) ? false : true;
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
    public com.xiaopeng.musicradio.datalist.a r() {
        return alr.a().b(this.q);
    }
}
