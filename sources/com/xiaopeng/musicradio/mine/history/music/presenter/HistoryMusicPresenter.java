package com.xiaopeng.musicradio.mine.history.music.presenter;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.mine.history.music.view.c;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class HistoryMusicPresenter extends MsDataBasePresenter<c> {
    private Disposable p;

    public HistoryMusicPresenter(int i) {
        this(i, null);
    }

    public HistoryMusicPresenter(int i, String str) {
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
        LogUtils.i("HistoryMusicPresenter", "onDestroy");
        u.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void e() {
        super.e();
        if (a() != null) {
            v();
            a().j_();
        }
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(final e eVar) {
        final LiveData<List<MusicInfo>> a2 = aml.a((int) IInputController.KEYCODE_KNOB_WIND_SPD_UP);
        a2.a(new o<List<MusicInfo>>() { // from class: com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter.1
            @Override // androidx.lifecycle.o
            public void a(List<MusicInfo> list) {
                a2.b((o) this);
                akx.a().a(list);
                c a3 = HistoryMusicPresenter.this.a();
                if (a3 != null) {
                    List a4 = ae.a(list, eVar.f);
                    HistoryMusicPresenter.this.v();
                    a3.a(a4, -1);
                    if (HistoryMusicPresenter.this.i() || !(a3 instanceof View)) {
                        return;
                    }
                    aks.a().a((View) HistoryMusicPresenter.this.a(), HistoryMusicPresenter.this.b(a4));
                }
            }
        });
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
    public void onEvent(agq.l lVar) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setAlbumId(lVar.b());
        musicInfo.setHash(lVar.a());
        if (!p() || a() == null) {
            return;
        }
        a().a(new a(musicInfo));
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
    public void onEvent(agq.k kVar) {
        if (kVar.a() == null) {
            Disposable disposable = this.p;
            if (disposable != null && !disposable.isDisposed()) {
                this.p.dispose();
            }
            this.p = Flowable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    HistoryMusicPresenter.this.p = null;
                    if (!HistoryMusicPresenter.this.p() || HistoryMusicPresenter.this.a() == null) {
                        return;
                    }
                    HistoryMusicPresenter.this.v();
                    HistoryMusicPresenter.this.a().j_();
                }
            });
            return;
        }
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setAlbumId(kVar.b());
        musicInfo.setHash(kVar.a());
        if (!p() || a() == null) {
            return;
        }
        a().a(new a(musicInfo));
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
        return aei.a().c() == 0 && aml.a() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    public void u() {
        super.u();
        if (!p() || a() == null) {
            return;
        }
        a().s();
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        if (!p() || a() == null) {
            return;
        }
        boolean y = y();
        LogUtils.i("HistoryMusicPresenter", "updatePlayingStatus:playing=" + y + ",from=" + str);
        if (y) {
            a().a(true, (c.a) new a(aml.a()));
            return;
        }
        a().a(false, (c.a) null);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public com.xiaopeng.musicradio.datalist.a r() {
        return akr.a().b(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends c.a<MusicInfo> {
        public a(MusicInfo musicInfo) {
            super(musicInfo);
        }

        @Override // com.xiaopeng.musicradio.datalist.c.a
        public boolean a(MusicInfo musicInfo) {
            return this.a != 0 && ((MusicInfo) this.a).equals(musicInfo);
        }
    }
}
