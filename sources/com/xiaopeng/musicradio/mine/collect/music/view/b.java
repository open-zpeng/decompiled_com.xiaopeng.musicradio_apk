package com.xiaopeng.musicradio.mine.collect.music.view;

import android.content.Context;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter;
import java.util.List;
/* compiled from: CollectedMusicViewProxy.java */
/* loaded from: classes.dex */
public class b extends ain<c, CollectedMusicPresenter> implements c {
    private int i;
    private int j;

    @Override // defpackage.aiq
    protected void a(f fVar, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(Object obj) {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void b(Object obj) {
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void t() {
    }

    public b(Context context, String str) {
        super(context, str);
        this.i = 1;
        this.j = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public CollectedMusicPresenter g() {
        return new CollectedMusicPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void s() {
        i();
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        b((List<MusicInfo>) list);
        d(list);
        a(list);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    public void a(final String str, final long j) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.b.1
            @Override // java.lang.Runnable
            public void run() {
                List<MusicInfo> b = aig.a().b();
                if (b != null && !b.isEmpty()) {
                    aml.a(new MusicListPlayReq(b, b.this.a(str, j, b), b.this.i, 50, b.this.j, aml.a((Integer) 50)));
                } else {
                    LogUtils.i("CollectedMusicViewProxy", "playById:empty");
                }
            }
        });
    }

    @Override // defpackage.ain
    protected void a(MusicInfo musicInfo) {
        if (musicInfo != null) {
            a(musicInfo.getHash(), musicInfo.getAlbumId());
        } else {
            a((String) null, 0L);
        }
    }

    public void a(List list) {
        a("CollectedMusicViewProxy_mine_collect_datalist", amb.a(false, false, false, list));
    }
}
