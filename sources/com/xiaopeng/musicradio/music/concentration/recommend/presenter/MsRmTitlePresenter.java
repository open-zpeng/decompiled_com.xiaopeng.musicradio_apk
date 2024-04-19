package com.xiaopeng.musicradio.music.concentration.recommend.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.music.concentration.recommend.view.d;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsRmTitlePresenter extends MusicBasePresenter<d> {
    private ArrayList<MusicRadioItem> c = new ArrayList<>();
    private ArrayList<MusicRadioItem> d = new ArrayList<>();
    private int e = 1;
    private int f = 10;
    private boolean g = false;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRmTitlePresenter", "onCreateView");
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
        if (this.g) {
            return;
        }
        this.g = true;
        aqz.a().a("100823", 1, 1, this.e, new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmTitlePresenter.1
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsRmTitlePresenter.this.a(recommentMusicResult);
                MsRmTitlePresenter.this.g = false;
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                MsRmTitlePresenter.this.g = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecommentMusicResult recommentMusicResult) {
        if (recommentMusicResult.getData() == null || recommentMusicResult.getData().getList().size() < 0) {
            return;
        }
        PageBean page = recommentMusicResult.getData().getPage();
        int page2 = page != null ? page.getPage() : 1;
        if (page2 == 1) {
            if (this.c.size() > 0) {
                return;
            }
            this.c.clear();
        }
        if (recommentMusicResult.getData().getList().size() == 0) {
            if (page2 != 1 || a() == null) {
                return;
            }
            a().b("");
            return;
        }
        if (page != null) {
            this.f = page.getTotalPage();
            this.e = page.getPage() + 1;
        }
        for (MusicRadioItem musicRadioItem : recommentMusicResult.getData().getList()) {
            musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
            musicRadioItem.setTitle(musicRadioItem.getName());
            musicRadioItem.setName(musicRadioItem.getName());
            musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
            if (!this.c.contains(musicRadioItem) && !this.d.contains(musicRadioItem)) {
                this.c.add(musicRadioItem);
            }
        }
        if (page2 == 1) {
            if (this.c.size() > 12) {
                i();
            } else {
                g();
            }
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
