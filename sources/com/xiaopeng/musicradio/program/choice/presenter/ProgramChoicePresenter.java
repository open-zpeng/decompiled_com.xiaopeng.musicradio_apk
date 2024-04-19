package com.xiaopeng.musicradio.program.choice.presenter;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.HotRankListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.age;
import defpackage.agg;
import defpackage.agh;
import defpackage.ago;
import defpackage.amp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ProgramChoicePresenter extends BasePresenter<awt> implements amp.a {
    private static final Map<String, Integer> b = new HashMap();
    private long c;
    private int d = 1;
    private int e = 1;
    private int f = 0;
    private List<HotRankListBean.DataBean.RankBean> g = null;
    private boolean h;

    static {
        b.put("daily", 0);
        b.put("guesslike", 1);
        b.put("hotrank", 2);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        amp.a().a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        amp.a().b(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        LogUtils.i("ProgramChoicePresenter", " onResume initData");
        if (this.g == null || this.c != amp.a().b()) {
            c();
        } else {
            d();
        }
        this.c = amp.a().b();
    }

    public void c() {
        LogUtils.i("ProgramChoicePresenter", " Hotrank initData");
        if (a() != null) {
            a().ae_();
        }
        if (this.h) {
            return;
        }
        this.h = true;
        this.f = 1;
        d();
        axp.a().c(new avc<HotRankListBean>() { // from class: com.xiaopeng.musicradio.program.choice.presenter.ProgramChoicePresenter.1
            @Override // defpackage.avc
            public void a(HotRankListBean hotRankListBean) {
                ProgramChoicePresenter.this.h = false;
                ProgramChoicePresenter.this.g = hotRankListBean.getData().getRankList();
                ProgramChoicePresenter.this.f = 0;
                if (ProgramChoicePresenter.this.a() != null) {
                    ProgramChoicePresenter.this.a().a(hotRankListBean.getData().getRankList());
                    LogUtils.i("ProgramChoicePresenter", " initData ==> response");
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                ProgramChoicePresenter.this.h = false;
                ProgramChoicePresenter.this.f = 2;
                ProgramChoicePresenter.this.d();
                if (ProgramChoicePresenter.this.a() != null) {
                    ProgramChoicePresenter.this.a().a(null);
                    LogUtils.i("ProgramChoicePresenter", " initData ==> error code：" + i + ",msg: " + str);
                }
            }
        });
    }

    public void d() {
        int i;
        e();
        LogUtils.i("ProgramChoicePresenter", "checkLoadingTipsState daily:" + this.d + ", guessLike state:" + this.e + ", hotRank state:" + this.f);
        int i2 = this.f;
        if (i2 == 1 || (i = this.e) == 1) {
            if (a() != null) {
                a().ae_();
            }
        } else if (i2 == 2 || this.d == 2 || i == 2) {
            if (a() != null) {
                a().a();
            }
        } else if (a() != null) {
            a().ad_();
        }
    }

    private void e() {
        int e = axe.c().e();
        LogUtils.i("ProgramChoicePresenter", "updateDailyLoadingState:" + e);
        if (e == 1) {
            this.d = 1;
        } else if (e == 3) {
            this.d = 2;
        } else {
            this.d = 0;
        }
        this.e = axe.c().f();
    }

    public void a(RdAlbumBean rdAlbumBean) {
        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(rdAlbumBean))).navigation();
    }

    public void b(RdAlbumBean rdAlbumBean) {
        if (a(rdAlbumBean.getId())) {
            axn.i().pause();
        } else {
            axn.i().a(rdAlbumBean);
        }
    }

    public void a(String str, int i) {
        sp.a().a("/program/activity/sub").withString("fragment_uri", ("/program/fragment/sub/rank?rank_id=" + i) + "&category_name=" + Uri.encode(str)).navigation();
    }

    private boolean a(long j) {
        ProgramBean r = axn.i().r();
        return r != null && r.getAlbumId() == j && f();
    }

    private boolean f() {
        return axn.i().getPlayState() == 2 || axn.i().getPlayState() == 1;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDataLoadingEvent(ago.d dVar) {
        if (dVar.b() == 1) {
            d();
        } else if (dVar.b() == 2) {
            LogUtils.d("liangyc", "update guess like state:" + dVar.a());
            this.e = dVar.a();
            d();
        }
    }

    @Override // defpackage.amp.a
    public void p_() {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(ago.e eVar) {
        List<HotRankListBean.DataBean.RankBean> list = this.g;
        if (list == null || list.size() == 0) {
            c();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        List<HotRankListBean.DataBean.RankBean> list = this.g;
        if (list == null || list.size() == 0) {
            if (a() != null) {
                a().ae_();
            }
            c();
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onSwitchElement(agh.a aVar) {
        Integer num;
        if (TextUtils.isEmpty(aVar.b()) || (num = b.get(aVar.b())) == null || a() == null || aVar.a() != 1) {
            return;
        }
        u.d(aVar);
        a().i_(num.intValue());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.b() != 3 || a() == null) {
            return;
        }
        a().af_();
    }
}
