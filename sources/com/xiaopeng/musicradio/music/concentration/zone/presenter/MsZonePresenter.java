package com.xiaopeng.musicradio.music.concentration.zone.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.VipMusicMainZoneResult;
import com.xiaopeng.musicradio.music.concentration.zone.view.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MsZonePresenter extends MusicBasePresenter<b> {
    private ArrayList<VipMusicMainZoneResult.DataBean.ListBean> c = new ArrayList<>();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsZonePresenter", "onCreateView");
        if (this.c.size() > 0) {
            j();
        } else {
            d();
        }
    }

    public void d() {
        if (a() != null) {
            a().r_();
        }
        aqz.a().j(new avc<VipMusicMainZoneResult>() { // from class: com.xiaopeng.musicradio.music.concentration.zone.presenter.MsZonePresenter.1
            @Override // defpackage.avc
            public void a(VipMusicMainZoneResult vipMusicMainZoneResult) {
                if (MsZonePresenter.this.a() != null && vipMusicMainZoneResult != null && vipMusicMainZoneResult.getData().getList() != null) {
                    if (vipMusicMainZoneResult.getData().getList().size() != 0) {
                        MsZonePresenter.this.c.clear();
                        for (VipMusicMainZoneResult.DataBean.ListBean listBean : vipMusicMainZoneResult.getData().getList()) {
                            MsZonePresenter.this.c.add(listBean);
                        }
                        if (MsZonePresenter.this.a() != null) {
                            MsZonePresenter.this.a().a(MsZonePresenter.this.c);
                            MsZonePresenter.this.k();
                        }
                    } else if (MsZonePresenter.this.a() != null) {
                        MsZonePresenter.this.a().b("");
                    }
                } else if (MsZonePresenter.this.a() != null) {
                    MsZonePresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsZonePresenter.this.a() != null) {
                    MsZonePresenter.this.a().a(str);
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void h() {
        if (this.c.size() == 0) {
            d();
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }
}
