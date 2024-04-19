package com.xiaopeng.musicradio.mine.playlist.main.presenter;

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
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MinePlaylistPresenter extends MsDataBasePresenter<als> {
    public MinePlaylistPresenter(int i, String str) {
        super(i, str);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter, com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        aml.g();
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("MinePlaylistPresenter", "onDestroy");
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(e eVar) {
        final LiveData<f<MusicRadioItem>> d = aml.d(eVar);
        d.a(new o<f<MusicRadioItem>>() { // from class: com.xiaopeng.musicradio.mine.playlist.main.presenter.MinePlaylistPresenter.1
            @Override // androidx.lifecycle.o
            public void a(f<MusicRadioItem> fVar) {
                d.b((o) this);
                MinePlaylistPresenter.this.a((f) fVar);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void b(f fVar) {
        als a = a();
        if (a == null || fVar.l) {
            return;
        }
        v();
        a.a((List) null, -1);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public a r() {
        return alr.a().c("FROM_MAIN");
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
    public void onSpeechShow(agg.y yVar) {
        if (!p() || a() == null) {
            return;
        }
        v();
        a().j_();
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        als a = a();
        if (a == null || !p()) {
            return;
        }
        boolean a2 = aml.a(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
        LogUtils.i("MinePlaylistPresenter", "updatePlayingStatus:playing=" + a2 + ",from=" + str);
        if (a2) {
            final ListSignBean listSignBean = (ListSignBean) z.a(aml.e(), (Class<Object>) ListSignBean.class);
            if (listSignBean != null) {
                a.a(true, (c.a) new c.a<MusicRadioItem>(null) { // from class: com.xiaopeng.musicradio.mine.playlist.main.presenter.MinePlaylistPresenter.2
                    @Override // com.xiaopeng.musicradio.datalist.c.a
                    public boolean a(MusicRadioItem musicRadioItem) {
                        return musicRadioItem != null && listSignBean.getCollectId() == musicRadioItem.getId();
                    }
                });
                return;
            } else {
                a.a(false, (c.a) null);
                return;
            }
        }
        a.a(false, (c.a) null);
    }
}
