package com.xiaopeng.musicradio.mine.history.music.view;

import android.content.Context;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter;
import com.xiaopeng.musicradio.utils.z;
import java.util.List;
/* compiled from: HistoryMusicViewProxy.java */
/* loaded from: classes.dex */
public class b extends ain<c, HistoryMusicPresenter> implements c {
    @Override // defpackage.aiq
    protected void a(f fVar, boolean z) {
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    public b(Context context, String str) {
        super(context, str);
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public HistoryMusicPresenter g() {
        return new HistoryMusicPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void s() {
        i();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        b(list);
        d(list);
        a(list);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        i();
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void a(c.a aVar) {
        if (this.e != null) {
            for (MusicInfo musicInfo : this.e) {
                if (aVar.a(musicInfo)) {
                    c_("OnLoveChanged", z.a(musicInfo));
                    return;
                }
            }
        }
    }

    @Override // defpackage.ain
    protected void a(MusicInfo musicInfo) {
        if (musicInfo != null) {
            a(musicInfo.getHash(), musicInfo.getAlbumId());
        } else {
            a((String) null, 0L);
        }
    }

    public void a(final String str, final long j) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.history.music.view.b.1
            @Override // java.lang.Runnable
            public void run() {
                List<MusicInfo> b = akx.a().b();
                if (b == null || b.isEmpty()) {
                    return;
                }
                MusicInfo a = b.this.a(str, j, b);
                if (a == null) {
                    aml.a(b, aml.a((Integer) 10));
                } else {
                    aml.a(b, a, aml.a((Integer) 10));
                }
            }
        });
    }

    public void a(List list) {
        a("HistoryMusicViewProxy_mine_history_datalist", amb.a(false, false, false, list));
    }
}
