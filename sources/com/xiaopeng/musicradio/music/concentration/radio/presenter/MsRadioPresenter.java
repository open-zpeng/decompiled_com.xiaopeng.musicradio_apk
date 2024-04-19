package com.xiaopeng.musicradio.music.concentration.radio.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.music.concentration.radio.view.b;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import defpackage.ath;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsRadioPresenter extends MusicBasePresenter<b> {
    private ArrayList<MusicRadioItem> c = new ArrayList<>();
    private ArrayList<MusicRadioItem> d = new ArrayList<>();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRadioPresenter", "onCreateView");
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
        ath.a().a(new ath.b() { // from class: com.xiaopeng.musicradio.music.concentration.radio.presenter.MsRadioPresenter.1
            @Override // defpackage.ath.b
            public void a(List<MusicRadioItem> list) {
                MsRadioPresenter.this.c.clear();
                MsRadioPresenter.this.d.clear();
                MsRadioPresenter.this.c.addAll(list);
                MsRadioPresenter.this.g();
            }

            @Override // defpackage.ath.b
            public void a() {
                if (MsRadioPresenter.this.a() != null) {
                    MsRadioPresenter.this.a().a("");
                }
            }
        }, -1);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_RADIO_SING_EXTRA) && str.contains(ListSignBean.LISTSIGN_TAGS);
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

    public void g() {
        if (this.c.size() >= 15) {
            i();
            return;
        }
        this.c.clear();
        this.c.addAll(this.d);
        this.d.clear();
        i();
    }

    private void i() {
        if (this.c.size() >= 15) {
            List<MusicRadioItem> subList = this.c.subList(0, 15);
            ArrayList<MusicRadioItem> arrayList = new ArrayList<>();
            arrayList.clear();
            arrayList.addAll(subList);
            this.c.removeAll(subList);
            this.d.addAll(arrayList);
            if (a() != null) {
                a().a(arrayList);
            }
        } else if (a() != null) {
            a().a(this.c);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(a.a) && this.c.size() == 0) {
            d();
        }
    }
}
