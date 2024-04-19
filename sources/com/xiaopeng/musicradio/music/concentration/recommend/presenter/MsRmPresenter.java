package com.xiaopeng.musicradio.music.concentration.recommend.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.music.concentration.recommend.view.e;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsRmPresenter extends MusicBasePresenter<e> {
    private ArrayList<MusicRadioItem> c = new ArrayList<>();
    private ArrayList<MusicRadioItem> d = new ArrayList<>();
    private int e = 1;
    private int f = 10;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRmPresenter", "onCreateView");
        if (this.c.size() > 0) {
            j();
        } else {
            d();
        }
    }

    public void d() {
        g();
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

    public void g() {
        if (this.e == 1 && this.c.size() == 0 && a() != null) {
            a().r_();
        }
        aqz.a().a("100823", 1, 1, this.e, new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmPresenter.1
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsRmPresenter msRmPresenter = MsRmPresenter.this;
                msRmPresenter.a(recommentMusicResult, msRmPresenter.e);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsRmPresenter.this.e != 1 || MsRmPresenter.this.a() == null) {
                    return;
                }
                MsRmPresenter.this.a().a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecommentMusicResult recommentMusicResult, int i) {
        if (recommentMusicResult.getData() != null && recommentMusicResult.getData().getList().size() >= 0) {
            if (i == 1) {
                this.c.clear();
            }
            if (recommentMusicResult.getData().getList().size() == 0) {
                if (i != 1 || a() == null) {
                    return;
                }
                a().b("");
                return;
            }
            PageBean page = recommentMusicResult.getData().getPage();
            if (page != null) {
                this.f = page.getTotalPage();
                this.e = page.getPage() + 1;
            }
            for (MusicRadioItem musicRadioItem : recommentMusicResult.getData().getList()) {
                musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                musicRadioItem.setTitle(musicRadioItem.getName());
                musicRadioItem.setName(musicRadioItem.getName());
                musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                this.c.add(musicRadioItem);
            }
            if (i == 1) {
                if (this.c.size() > 12) {
                    i();
                } else {
                    g();
                }
            }
        } else if (this.e == 1 && a() != null) {
            a().a("");
        }
    }

    public void i() {
        if (this.c.size() >= 12) {
            l();
            if (this.c.size() <= 48) {
                int i = this.e;
                if (i >= this.f) {
                    this.c.addAll(this.d);
                    this.d.clear();
                    return;
                } else if (i > 1) {
                    g();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        this.c.addAll(this.d);
        this.d.clear();
        l();
        if (this.e < this.f) {
            g();
        }
    }

    private void l() {
        if (this.c.size() >= 12) {
            List<MusicRadioItem> subList = this.c.subList(0, 12);
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
