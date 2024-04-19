package com.xiaopeng.musicradio.mine.collect.music.presenter;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.collect.music.view.c;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agl;
import defpackage.agq;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class CollectedMusicPresenter extends MsDataBasePresenter<c> {
    protected int p;

    public CollectedMusicPresenter() {
        this(50, null);
    }

    public CollectedMusicPresenter(int i, String str) {
        super(50, str);
        this.p = i;
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("CollectedMusicPresenter", "onDestroy");
        u.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void e() {
        super.e();
        if (p()) {
            h();
        }
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(e eVar) {
        LogUtils.i("CollectedMusicPresenter", "getDataListPosted");
        final LiveData<f<MusicInfo>> a2 = aml.a(eVar);
        a2.a(new o<f<MusicInfo>>() { // from class: com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter.1
            @Override // androidx.lifecycle.o
            public void a(f<MusicInfo> fVar) {
                a2.b((o) this);
                if (fVar == null) {
                    return;
                }
                if (CollectedMusicPresenter.this.p >= 50) {
                    CollectedMusicPresenter.this.a((f) fVar);
                    return;
                }
                c a3 = CollectedMusicPresenter.this.a();
                aig.a().a(fVar.o);
                if (a3 != null) {
                    List a4 = ae.a(fVar.o, CollectedMusicPresenter.this.p);
                    CollectedMusicPresenter.this.v();
                    a3.a(a4, fVar.e);
                    if (CollectedMusicPresenter.this.a() instanceof View) {
                        ahz.a().a((View) CollectedMusicPresenter.this.a(), CollectedMusicPresenter.this.b(a4));
                    }
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void b(f fVar) {
        c a2 = a();
        if (a2 != null) {
            if (!fVar.l) {
                v();
                a2.a((List) null, fVar.e);
                return;
            }
            a2.a(fVar.g, fVar.e);
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
    public void onEvent(ahy ahyVar) {
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.e eVar) {
        if (!p() || a() == null) {
            return;
        }
        a().t();
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public com.xiaopeng.musicradio.datalist.a r() {
        return aia.a().b(this.q);
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
        boolean c = aml.c();
        LogUtils.i("CollectedMusicPresenter", "updatePlayingStatus:playing=" + c + ",from=" + str);
        if (c) {
            a().a(true, (c.a) new a(aml.a()));
            return;
        }
        a().a(false, (c.a) null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter, com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.datalist.a.InterfaceC0133a
    public void a(Object... objArr) {
        agl.a aVar = (agl.a) a(objArr, 0, agl.a.class);
        MusicInfo musicInfo = (aVar == null || !aVar.b) ? null : aVar.a;
        if (musicInfo == null) {
            super.a(objArr);
        } else if (!p() || a() == null) {
        } else {
            boolean c = aml.c();
            LogUtils.i("CollectedMusicPresenter", "updatePlayingStatus:playing=" + c + ",from=onDataDirty");
            if (c) {
                a().a(true, (c.a) new a(musicInfo));
            } else {
                a().a(false, (c.a) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
