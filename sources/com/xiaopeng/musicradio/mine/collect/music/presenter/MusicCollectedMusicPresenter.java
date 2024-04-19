package com.xiaopeng.musicradio.mine.collect.music.presenter;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter;
import defpackage.agl;
import defpackage.agq;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MusicCollectedMusicPresenter extends CollectedMusicPresenter {
    public MusicCollectedMusicPresenter() {
        this(50, null);
    }

    public MusicCollectedMusicPresenter(int i, String str) {
        super(50, str);
        this.p = i;
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter, com.xiaopeng.musicradio.mine.common.presenter.DataBasePresenter, com.xiaopeng.musicradio.datalist.DataListPresenter, com.xiaopeng.musicradio.datalist.a.InterfaceC0133a
    public void a(Object... objArr) {
        agl.a aVar = (agl.a) a(objArr, 0, agl.a.class);
        MusicInfo musicInfo = (aVar == null || !aVar.b) ? null : aVar.a;
        if (musicInfo == null || !p() || a() == null) {
            return;
        }
        boolean c = aml.c();
        LogUtils.i("MusicCollectedMusicPresenter", "updatePlayingStatus:playing=" + c + ",from=onDataDirty");
        if (c) {
            a().a(true, (c.a) new CollectedMusicPresenter.a(musicInfo));
        } else {
            a().a(false, (c.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter, com.xiaopeng.musicradio.datalist.DataListPresenter
    public void e() {
        super.e();
        aml.e(1);
        if (p()) {
            h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicLove(agq.l lVar) {
        if (!p() || a() == null) {
            return;
        }
        boolean c = lVar.c();
        MusicInfo d = lVar.d();
        if (c) {
            a().b(d);
        } else {
            a().a(d);
        }
    }
}
