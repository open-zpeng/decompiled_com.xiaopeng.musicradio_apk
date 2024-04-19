package com.xiaopeng.musicradio.mine.collect.music.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter;
import com.xiaopeng.musicradio.proto.Mine;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CollectMusicActivityProxy.java */
/* loaded from: classes.dex */
public class a extends ain<c, CollectedMusicPresenter> implements c {
    private int i;
    private int j;

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(Object obj) {
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void b(Object obj) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "CollectMusicActivityProxy_mine_collect_datalist";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void t() {
    }

    public a(Context context, String str) {
        super(context, str);
        this.i = 1;
        this.j = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public CollectedMusicPresenter g() {
        return new CollectedMusicPresenter();
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
    public void a(boolean z, c.a aVar) {
        i();
    }

    @Override // defpackage.ain, defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            List<String> list = null;
            try {
                list = Mine.MineMusicDeleteReq.parseFrom(bArr).getDataListList();
            } catch (Exception e) {
                LogUtils.e("CollectMusicActivityProxy", "monoMessage:" + e.getLocalizedMessage());
            }
            if (list != null) {
                a(list);
            }
        }
    }

    private void a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            MusicInfo musicInfo = this.f.get(str);
            if (musicInfo != null) {
                arrayList.add(musicInfo);
                this.f.remove(str);
                this.e.remove(musicInfo);
            }
        }
        LogUtils.i("CollectMusicActivityProxy", "delete:" + arrayList.size());
        aml.a(arrayList);
    }

    public void a(final String str, final long j) {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.a.1
            @Override // java.lang.Runnable
            public void run() {
                List g = ((CollectedMusicPresenter) a.this.c).g();
                if (g != null && !g.isEmpty()) {
                    aml.a(new MusicListPlayReq(g, a.this.a(str, j, g), a.this.i, 50, a.this.j, aml.a((Integer) 50)));
                } else {
                    LogUtils.i("CollectMusicActivityProxy", "playById:empty");
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

    @Override // defpackage.aiq
    protected int a(int i) {
        return aml.h();
    }
}
