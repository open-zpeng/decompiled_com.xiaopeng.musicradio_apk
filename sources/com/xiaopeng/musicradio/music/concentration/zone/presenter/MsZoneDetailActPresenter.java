package com.xiaopeng.musicradio.music.concentration.zone.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.VipMusicMoreInfo;
import com.xiaopeng.musicradio.music.concentration.zone.view.a;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
/* loaded from: classes.dex */
public class MsZoneDetailActPresenter extends MusicBasePresenter<a> {
    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsAuditionDetailActPresenter", "onCreateView");
    }

    public void b(String str) {
        if (a() != null) {
            a().r_();
        }
        aqz.a().b(str, new avc<VipMusicMoreInfo>() { // from class: com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZoneDetailActPresenter.1
            @Override // defpackage.avc
            public void a(VipMusicMoreInfo vipMusicMoreInfo) {
                if (MsZoneDetailActPresenter.this.a() != null) {
                    MsZoneDetailActPresenter.this.a().a(vipMusicMoreInfo);
                    MsZoneDetailActPresenter.this.k();
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                if (MsZoneDetailActPresenter.this.a() != null) {
                    MsZoneDetailActPresenter.this.a().a(str2);
                }
            }
        });
    }
}
