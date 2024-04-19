package com.xiaopeng.musicradio.mine.history.program.presenter;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.a;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.common.presenter.ReadDataBasePresenter;
import com.xiaopeng.musicradio.mine.history.program.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class HistoryProgramPresenter extends ReadDataBasePresenter<c> {
    public HistoryProgramPresenter(int i, String str) {
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
        LogUtils.i("HistoryProgramPresenter", "onDestroy");
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(e eVar) {
        final LiveData<f<RdAlbumBean>> b = amn.b(eVar);
        b.a(new o<f<RdAlbumBean>>() { // from class: com.xiaopeng.musicradio.mine.history.program.presenter.HistoryProgramPresenter.1
            @Override // androidx.lifecycle.o
            public void a(f<RdAlbumBean> fVar) {
                b.b((o) this);
                HistoryProgramPresenter.this.a((f) fVar);
                c a = HistoryProgramPresenter.this.a();
                if (HistoryProgramPresenter.this.i() || fVar == null || !(a instanceof View)) {
                    return;
                }
                aks.a().a((View) HistoryProgramPresenter.this.a(), HistoryProgramPresenter.this.b(fVar.o));
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
    public void onEvent(age.l lVar) {
        a("PlayState");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.g gVar) {
        a("ChangeAudioType");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(age.c cVar) {
        a("Info");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(age.e eVar) {
        a("ListSignRefresh");
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

    private boolean y() {
        return (aei.a().c() != 3 || TextUtils.isEmpty(amn.d()) || amn.a() == null) ? false : true;
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        if (!p() || a() == null) {
            return;
        }
        boolean y = y();
        LogUtils.i("HistoryProgramPresenter", "updatePlayingStatus:playing=" + y + ",from=" + str);
        if (y) {
            ProgramBean a = amn.a();
            RdAlbumBean rdAlbumBean = new RdAlbumBean();
            rdAlbumBean.setId(a.getAlbumId());
            a().a(true, (c.a) new c.a<RdAlbumBean>(rdAlbumBean) { // from class: com.xiaopeng.musicradio.mine.history.program.presenter.HistoryProgramPresenter.2
                @Override // com.xiaopeng.musicradio.datalist.c.a
                public boolean a(RdAlbumBean rdAlbumBean2) {
                    return rdAlbumBean2 != null && rdAlbumBean2.getId() == ((RdAlbumBean) this.a).getId();
                }
            });
            return;
        }
        a().a(false, (c.a) null);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public a r() {
        return akr.a().c(this.q);
    }
}
