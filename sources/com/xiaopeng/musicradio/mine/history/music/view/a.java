package com.xiaopeng.musicradio.mine.history.music.view;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter;
import com.xiaopeng.musicradio.proto.Mine;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HistoryMusicActivityProxy.java */
/* loaded from: classes.dex */
public class a extends ain<c, HistoryMusicPresenter> implements c {
    @Override // defpackage.aiq
    protected void a(f fVar, boolean z) {
    }

    @Override // defpackage.aiq
    protected String h() {
        return "HistoryMusicActivityProxy_mine_history_datalist";
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
    }

    public a(Context context, String str) {
        super(context, str);
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public HistoryMusicPresenter g() {
        return new HistoryMusicPresenter(IInputController.KEYCODE_KNOB_WIND_SPD_UP);
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void s() {
        i();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        b(list);
        d(list);
        a(h(), list);
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

    @Override // defpackage.ain, defpackage.aiq, defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        if (RequestParameters.SUBRESOURCE_DELETE.equals(str)) {
            List<String> list = null;
            try {
                list = Mine.MineMusicDeleteReq.parseFrom(bArr).getDataListList();
            } catch (Exception e) {
                LogUtils.e("HistoryMusicActivityProxy", "monoMessage:" + e.getLocalizedMessage());
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
        LogUtils.i("HistoryMusicActivityProxy", "delete:" + arrayList.size());
        aml.b(arrayList);
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
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.mine.history.music.view.a.1
            @Override // java.lang.Runnable
            public void run() {
                List<MusicInfo> b = akx.a().b();
                if (b == null || b.isEmpty()) {
                    return;
                }
                MusicInfo a = a.this.a(str, j, b);
                if (a == null) {
                    aml.a(b, aml.a((Integer) 10));
                } else {
                    aml.a(b, a, aml.a((Integer) 10));
                }
            }
        });
    }
}
