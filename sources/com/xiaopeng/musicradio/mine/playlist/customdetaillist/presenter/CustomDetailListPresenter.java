package com.xiaopeng.musicradio.mine.playlist.customdetaillist.presenter;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class CustomDetailListPresenter extends MsDataBasePresenter<com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.a> {
    public HashMap<String, Boolean> p;
    private long r;
    private int s;

    public CustomDetailListPresenter() {
        super(50, null);
        this.p = new HashMap<>();
    }

    public void a(long j) {
        this.r = j;
    }

    public int y() {
        return this.s;
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        LogUtils.i("CustomDetailListPresenter", "onDestroy");
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(final e eVar) {
        LogUtils.i("CustomDetailListPresenter", "getDataListPosted");
        final LiveData<f<MusicInfo>> a2 = aml.a(this.r, eVar);
        a2.a(new o<f<MusicInfo>>() { // from class: com.xiaopeng.musicradio.mine.playlist.customdetaillist.presenter.CustomDetailListPresenter.1
            @Override // androidx.lifecycle.o
            public void a(f<MusicInfo> fVar) {
                if (eVar.d == 1) {
                    amg.a(a2, this);
                } else {
                    a2.b((o) this);
                }
                if (fVar == null) {
                    return;
                }
                CustomDetailListPresenter.this.s = fVar.f;
                List<MusicInfo> list = fVar.o;
                if (list != null) {
                    for (MusicInfo musicInfo : list) {
                        Boolean bool = CustomDetailListPresenter.this.p.get(musicInfo.getHash());
                        if (bool != null) {
                            musicInfo.setHot(bool.booleanValue());
                        }
                    }
                }
                CustomDetailListPresenter.this.a((f) fVar);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void b(f fVar) {
        com.xiaopeng.musicradio.mine.playlist.customdetaillist.view.a a2 = a();
        if (a2 != null) {
            if (!fVar.l) {
                v();
                a2.a((List) null, this.s);
                return;
            }
            a2.a(fVar.g, fVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(boolean z, Throwable th) {
        super.a(z, th);
        if (z) {
            return;
        }
        a(2);
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.l lVar) {
        String a2 = lVar.a();
        boolean c = lVar.c();
        this.p.put(a2, Boolean.valueOf(c));
        List<MusicInfo> g = g();
        if (!TextUtils.isEmpty(a2)) {
            for (MusicInfo musicInfo : g) {
                if (a2.equals(musicInfo.getHash())) {
                    musicInfo.setHot(c);
                    LogUtils.i("CustomDetailListPresenter", "dealMusicLove:" + lVar.a() + ListSignBean.COLLECTID_SUFFIX + lVar.c() + ",musicInfo=" + musicInfo.isHttpCache());
                }
            }
        }
        MusicInfo musicInfo2 = new MusicInfo();
        musicInfo2.setAlbumId(lVar.b());
        musicInfo2.setHash(a2);
        if (!p() || a() == null) {
            return;
        }
        a().a(new a(musicInfo2));
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public com.xiaopeng.musicradio.datalist.a r() {
        return new alp(true);
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        if (!p() || a() == null) {
            return;
        }
        boolean c = aml.c();
        LogUtils.i("CustomDetailListPresenter", "updatePlayingStatus:playing=" + c + ",from=" + str);
        if (c) {
            a().a(true, (c.a) new a(aml.a()));
            return;
        }
        a().a(false, (c.a) null);
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
