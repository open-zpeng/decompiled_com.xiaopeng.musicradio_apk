package com.xiaopeng.musicradio.music.concentration.zone.detail.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMoreDetails;
import com.xiaopeng.musicradio.music.concentration.zone.detail.view.a;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
/* loaded from: classes.dex */
public class MsZoneChildDetailActPresenter extends MusicBasePresenter<a> {
    private int c = 1;
    private boolean d = true;

    static /* synthetic */ int b(MsZoneChildDetailActPresenter msZoneChildDetailActPresenter) {
        int i = msZoneChildDetailActPresenter.c;
        msZoneChildDetailActPresenter.c = i + 1;
        return i;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsZoneChildDetailActPresenter", "onCreateView");
    }

    public void b(String str) {
        if (this.d) {
            if (this.c == 1 && a() != null) {
                a().r_();
            }
            aqz.a().a(str, this.c, new avc<VipMusicMoreDetails>() { // from class: com.xiaopeng.musicradio.music.concentration.zone.detail.presenter.MsZoneChildDetailActPresenter.1
                @Override // defpackage.avc
                public void a(VipMusicMoreDetails vipMusicMoreDetails) {
                    if (vipMusicMoreDetails.getData().getList().size() < 0) {
                        MsZoneChildDetailActPresenter.this.d = false;
                    } else if (MsZoneChildDetailActPresenter.this.a() != null) {
                        MsZoneChildDetailActPresenter.this.a().a(vipMusicMoreDetails, MsZoneChildDetailActPresenter.this.c);
                        MsZoneChildDetailActPresenter.b(MsZoneChildDetailActPresenter.this);
                        MsZoneChildDetailActPresenter.this.k();
                    }
                    if (MsZoneChildDetailActPresenter.this.c == 1 && vipMusicMoreDetails.getData().getList().size() == 0 && MsZoneChildDetailActPresenter.this.a() != null) {
                        MsZoneChildDetailActPresenter.this.a().b("");
                    }
                }

                @Override // defpackage.avc
                public void a(int i, String str2) {
                    if (MsZoneChildDetailActPresenter.this.a() != null) {
                        MsZoneChildDetailActPresenter.this.a().a(str2);
                    }
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
    }

    public void a(int i) {
        if (i == 1) {
            this.d = true;
        }
        this.c = i;
    }

    public int d() {
        return this.c;
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().a();
        }
    }
}
