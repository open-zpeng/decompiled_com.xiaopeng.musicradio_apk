package com.xiaopeng.musicradio.program.choice.presenter.banner;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.banner.c;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.speech.vui.utils.LogUtils;
import defpackage.age;
import defpackage.agg;
import defpackage.ago;
import defpackage.agq;
import defpackage.amp;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ChoiceBannerPresenter extends BaseProgramPresenter<c> implements amp.a {
    private long c;
    private ReadHistoryInfo b = null;
    private boolean d = true;

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        amp.a().a(this);
        if (iVar != null) {
            if (axe.c().e() == 0) {
                if (a() != null) {
                    a().setLoadingState(1);
                }
                axe.c().a(true, true);
            } else if (axe.c().e() == 2) {
                f(2);
            } else if (axe.c().e() == 3) {
                f(3);
            } else if (axe.c().e() == 1) {
                f(1);
            } else {
                f(axe.c().e());
            }
            b(3);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        amp.a().b(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (a() != null) {
            a().h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHistoryChanged(agq.n nVar) {
        b(3);
    }

    @Override // defpackage.amp.a
    public void p_() {
        b(3);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealBannerDataEvent(ago.d dVar) {
        if (dVar.b() == 1) {
            f(dVar.a());
        }
    }

    private void f(int i) {
        LogUtils.i("ChoiceBannerPresenter", "handleBannerState:" + i);
        if (i == 2) {
            if (a() != null) {
                List<TodayNewsCardBean.DataBean.ListBean> d = axe.c().d();
                a().a(d, false);
                if (d != null && d.size() > 0) {
                    if (a() != null) {
                        a().setLoadingState(0);
                    }
                } else if (a() != null) {
                    a().setLoadingState(3);
                }
            }
        } else if (i == 3) {
            if (a() != null) {
                a().setLoadingState(2);
            }
        } else if (i == 1) {
            if (a() != null) {
                a().setLoadingState(1);
            }
        } else if (i != 4 || a() == null) {
        } else {
            List<TodayNewsCardBean.DataBean.ListBean> d2 = axe.c().d();
            a().a(d2, true);
            if (d2 != null && d2.size() > 0) {
                if (a() != null) {
                    a().setLoadingState(0);
                }
            } else if (a() != null) {
                a().setLoadingState(3);
            }
            axe.c().a(2);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioTypeChangeEvent(agg.g gVar) {
        if (gVar.a() == 3 || a() == null) {
            return;
        }
        b(3);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealProgramInfo(age.c cVar) {
        b(3);
    }

    public void c() {
        axe.c().a(false, true);
    }

    public void a(int i) {
        TodayNewsCardBean.DataBean.ListBean listBean = axe.c().d().get(i);
        if (e(listBean.getCardId())) {
            return;
        }
        a(listBean.getTrackInfoBos(), listBean);
    }

    public void b(final int i) {
        ban.e(new Runnable() { // from class: com.xiaopeng.musicradio.program.choice.presenter.banner.ChoiceBannerPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                final List<ReadHistoryInfo> a = axi.a().a(i);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.choice.presenter.banner.ChoiceBannerPresenter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.size() > 0) {
                            ((ReadHistoryInfo) a.get(0)).getTrackTitle();
                            String albumName = ((ReadHistoryInfo) a.get(0)).getAlbumName();
                            String string = a.a.getResources().getString(b.f.reading_percent, ((ReadHistoryInfo) a.get(0)).getPlayingPercent());
                            String logo = ((ReadHistoryInfo) a.get(0)).getLogo();
                            if (TextUtils.isEmpty(logo)) {
                                logo = ((ReadHistoryInfo) a.get(0)).getLargeLogo();
                            }
                            if (TextUtils.isEmpty(logo)) {
                                logo = ((ReadHistoryInfo) a.get(0)).getMediumLogo();
                            }
                            ChoiceBannerPresenter.this.c = ((ReadHistoryInfo) a.get(0)).getAlbumId();
                            if (ChoiceBannerPresenter.this.a() != null) {
                                ChoiceBannerPresenter.this.a().a(albumName, string, logo, ChoiceBannerPresenter.this.b(((ReadHistoryInfo) a.get(0)).getAlbumId()));
                                if (ChoiceBannerPresenter.this.b(ChoiceBannerPresenter.this.c)) {
                                    ChoiceBannerPresenter.this.a().a(2);
                                } else {
                                    ChoiceBannerPresenter.this.a().a(3);
                                }
                            }
                            ChoiceBannerPresenter.this.b = (ReadHistoryInfo) a.get(0);
                        } else if (ChoiceBannerPresenter.this.a() != null) {
                            ChoiceBannerPresenter.this.a().ag_();
                        }
                    }
                });
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        ProgramBean r;
        if (a() != null) {
            a().a(3);
        }
        if (lVar.b() != 3 || a() == null || (r = axn.i().r()) == null) {
            return;
        }
        if (r.getOriginalAlbumId() > 0 && r.getOriginalAlbumId() == this.c) {
            a().a(lVar.a());
        } else if (r.getAlbumId() == this.c) {
            a().a(lVar.a());
        }
    }

    public void d() {
        if (b(this.c)) {
            int playState = axn.i().getPlayState();
            if (playState == 1) {
                return;
            }
            if (playState == 3) {
                axn.i().play();
                return;
            } else if (playState == 2) {
                axn.i().pause();
                return;
            } else {
                return;
            }
        }
        RdAlbumBean a = aq.a(this.b);
        if (a != null) {
            a.setFromSource("near");
            b(a);
            return;
        }
        LogUtils.e("ChoiceBannerPresenter", "playControlHistory transferbean failed, null");
    }

    public void e() {
        if (ShakeUtil.canExecuteLong(b.d.history_layout)) {
            sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/history").navigation();
            axt.b();
        }
    }

    public void c(int i) {
        u.e(new ago.b(i));
    }

    public void f() {
        if (a() == null || axe.c().d().size() <= 0) {
            return;
        }
        a().a(axe.c().d(), true);
    }
}
