package com.xiaopeng.musicradio.mine.playlist.blue.presenter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.mine.common.presenter.MsDataBasePresenter;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class PlaylistBluePresenter extends MsDataBasePresenter<com.xiaopeng.musicradio.mine.playlist.blue.view.a> {
    public PlaylistBluePresenter(int i, String str) {
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
        u.b(this);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public void a(final e eVar) {
        final LiveData<List<MusicInfo>> c = aml.c(1000);
        c.a(new o<List<MusicInfo>>() { // from class: com.xiaopeng.musicradio.mine.playlist.blue.presenter.PlaylistBluePresenter.1
            @Override // androidx.lifecycle.o
            public void a(List<MusicInfo> list) {
                c.b((o) this);
                alo.a().a(list);
                if (PlaylistBluePresenter.this.a() != null) {
                    List a2 = ae.a(list, eVar.f);
                    PlaylistBluePresenter.this.v();
                    PlaylistBluePresenter.this.a().a(a2, -1);
                }
            }
        });
    }

    public void y() {
        aml.a(alo.a().b(), aml.a((Integer) 20));
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
        a().a(new b(musicInfo));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.f fVar) {
        if (!p() || a() == null) {
            return;
        }
        a().a(new a(fVar.a));
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
    public boolean x() {
        if ("FROM_MAIN".equals(this.q)) {
            return false;
        }
        return super.x();
    }

    @Override // com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter
    protected void a(String str) {
        if (!p() || a() == null) {
            return;
        }
        boolean c = aml.c();
        LogUtils.i("PlaylistBluePresenter", "updatePlayingStatus:playing=" + c + ",from=" + str);
        if (c) {
            a().a(true, (c.a) new b(aml.a()));
            return;
        }
        a().a(false, (c.a) null);
    }

    @Override // com.xiaopeng.musicradio.datalist.DataListPresenter
    public com.xiaopeng.musicradio.datalist.a r() {
        return alr.a().a(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends c.a<MusicInfo> {
        public b(MusicInfo musicInfo) {
            super(musicInfo);
        }

        @Override // com.xiaopeng.musicradio.datalist.c.a
        public boolean a(MusicInfo musicInfo) {
            return this.a != 0 && ((MusicInfo) this.a).equals(musicInfo);
        }
    }

    /* loaded from: classes.dex */
    private class a extends c.a<MusicInfo> {
        public HashSet<String> b;

        public a(HashSet<String> hashSet) {
            super(null);
            this.b = hashSet;
        }

        @Override // com.xiaopeng.musicradio.datalist.c.a
        public boolean a(MusicInfo musicInfo) {
            return musicInfo != null && this.b.contains(musicInfo.getHash());
        }
    }
}
