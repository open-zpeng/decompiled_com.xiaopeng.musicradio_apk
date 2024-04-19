package com.xiaopeng.musicradio.music.concentration.recommend.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.common.PageBean;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.RecommentMusicResult;
import com.xiaopeng.musicradio.bean.xpbean.XpPlayMusicResult;
import com.xiaopeng.musicradio.music.concentration.recommend.view.b;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter;
import defpackage.age;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MsRmCategoryLayoutPresenter extends BaseDealNetValidPresenter<b> {
    private String d;
    private boolean b = false;
    private String c = "0";
    private int e = 1;
    private int f = 1;
    private int g = 1;
    private boolean h = true;
    private boolean i = false;
    private int j = 10;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsRmCategoryLayoutPresenter", "onCreateView");
        if (this.i) {
            a(apk.i().x());
        }
    }

    public void c() {
        int i = this.e;
        if (i == 1) {
            d();
        } else if (i == 2) {
            f();
        } else if (i == 3) {
            List<MusicRadioItem> c = amr.a().c();
            if (c.size() > 0) {
                b a = a();
                if (a != null) {
                    a.a(new ArrayList(c));
                }
                b(apk.i().x());
                this.i = true;
                this.h = false;
                return;
            }
            g();
        }
    }

    public void d() {
        if (this.g == 1 && !this.i && a() != null) {
            a().r_();
        }
        aqz.a().a(this.c, this.e, this.f, this.g, new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryLayoutPresenter.1
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsRmCategoryLayoutPresenter.this.a(recommentMusicResult);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsRmCategoryLayoutPresenter.this.a() != null) {
                    MsRmCategoryLayoutPresenter.this.a().a(str);
                }
            }
        });
    }

    public void f() {
        if (this.g == 1 && !this.i && a() != null) {
            a().r_();
        }
        aqz.a().b(this.d, this.e, this.f, this.g, new avc<RecommentMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryLayoutPresenter.2
            @Override // defpackage.avc
            public void a(RecommentMusicResult recommentMusicResult) {
                MsRmCategoryLayoutPresenter.this.a(recommentMusicResult);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (MsRmCategoryLayoutPresenter.this.a() != null) {
                    MsRmCategoryLayoutPresenter.this.a().a(str);
                }
            }
        });
    }

    public void g() {
        if (a() != null) {
            a().r_();
        }
        aqz.a().h(new avc<XpPlayMusicResult>() { // from class: com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryLayoutPresenter.3
            @Override // defpackage.avc
            public void a(XpPlayMusicResult xpPlayMusicResult) {
                b a = MsRmCategoryLayoutPresenter.this.a();
                if (a == null || xpPlayMusicResult == null || xpPlayMusicResult.getData() == null || xpPlayMusicResult.getData().getCollectList() == null || xpPlayMusicResult.getData().getCollectList().size() <= 0) {
                    if (a != null) {
                        a.a("");
                        return;
                    }
                    return;
                }
                List<MusicRadioItem> collectList = xpPlayMusicResult.getData().getCollectList();
                for (MusicRadioItem musicRadioItem : collectList) {
                    musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                    musicRadioItem.setTitle(musicRadioItem.getName());
                    musicRadioItem.setName(musicRadioItem.getName());
                    musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                }
                a.a(collectList);
                MsRmCategoryLayoutPresenter.this.b(apk.i().x());
                MsRmCategoryLayoutPresenter.this.i = true;
                MsRmCategoryLayoutPresenter.this.h = false;
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                b a = MsRmCategoryLayoutPresenter.this.a();
                if (a != null) {
                    a.a(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecommentMusicResult recommentMusicResult) {
        if (recommentMusicResult.getData() != null && recommentMusicResult.getData().getList() != null && recommentMusicResult.getData().getList().size() >= 0) {
            PageBean page = recommentMusicResult.getData().getPage();
            int page2 = page != null ? page.getPage() : 1;
            List<MusicRadioItem> list = recommentMusicResult.getData().getList();
            if (list.size() != 0) {
                for (MusicRadioItem musicRadioItem : list) {
                    musicRadioItem.setType(ListSignBean.LISTSIGN_RECOMMEN_MUSIC);
                    musicRadioItem.setTitle(musicRadioItem.getName());
                    musicRadioItem.setName(musicRadioItem.getName());
                    musicRadioItem.setLogoUrl(musicRadioItem.getLogo());
                }
                if (a() != null) {
                    if (page2 == 1) {
                        a().a(list);
                        b(apk.i().x());
                    } else {
                        a().b(list);
                    }
                }
                this.i = true;
            } else if (page2 == 1) {
                if (a() != null) {
                    a().b("");
                }
            } else if (a() != null) {
                a().b(list);
            }
            if (page != null) {
                this.j = page.getTotalPage();
                if (!recommentMusicResult.isFromCache()) {
                    this.g = page.getPage() + 1;
                }
                if (this.g > this.j) {
                    this.h = false;
                }
            }
        } else if (this.g == 1 && a() != null) {
            a().a("");
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (!NetUtils.isNetworkAvailable(a.a) || this.i) {
            return;
        }
        c();
    }

    public void a(String str) {
        b(str);
        h();
    }

    public void b(String str) {
        ListSignBean listSignBean = (ListSignBean) z.a(str, (Class<Object>) ListSignBean.class);
        if (listSignBean != null) {
            String extra = listSignBean.getExtra();
            String prefix = listSignBean.getPrefix();
            if (TextUtils.equals(extra, ListSignBean.MUSIC_RADIO_SING_EXTRA) && TextUtils.equals(prefix, ListSignBean.LISTSIGN_RECOMMEN_MUSIC)) {
                if (this.b) {
                    return;
                }
                this.b = true;
                return;
            }
            this.b = false;
            return;
        }
        this.b = false;
    }

    public void h() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        if (!this.b || a() == null) {
            return;
        }
        a().a(this.b);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChangeAudioType(agg.g gVar) {
        a(apk.i().x());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioInfo(age.c cVar) {
        a(apk.i().x());
    }

    public void c(String str) {
        this.c = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f = i;
    }

    public boolean i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public int k() {
        return this.e;
    }

    public void c(int i) {
        this.g = i;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechStateChange(agg.y yVar) {
        if (a() != null) {
            a().e();
        }
    }
}
