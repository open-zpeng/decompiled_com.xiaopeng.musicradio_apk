package com.xiaopeng.musicradio.program.choice.presenter.guesslike;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.choice.view.guesslike.d;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.ago;
import defpackage.agq;
import defpackage.amp;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class GuessLikePresenter extends BaseProgramPresenter<d> implements amp.a {
    private static int c = 0;
    private static boolean f = false;
    private List<RdAlbumBean> b = new ArrayList();
    private int d = 0;
    private int e = 0;
    private boolean g = false;
    private String h = "";

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        amp.a().a(this);
        if (!f || e()) {
            h();
            f = true;
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        amp.a().b(this);
    }

    private boolean e() {
        if (a() != null) {
            return !a().ai_();
        }
        return true;
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (iVar != null) {
            if (a() != null && this.g) {
                a().ah_();
            }
            this.g = true;
            if (f()) {
                if (a() != null) {
                    a().a(new ArrayList());
                    a().a(true, false);
                }
                h();
            }
        }
    }

    private boolean f() {
        if (TextUtils.isEmpty(this.h) && TextUtils.isEmpty(aqh.a().c())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            return true;
        }
        return !str.equals(aqh.a().c());
    }

    private void h() {
        c = 0;
        axe.c().b(1);
        this.h = aqh.a().c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReload(ago.e eVar) {
        if (eVar.a() == 2 || this.b.size() != 0) {
            return;
        }
        if (a() != null) {
            a().a(true, false);
        }
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.b() != 3 || a() == null) {
            return;
        }
        ProgramBean r = axn.i().r();
        if (r != null) {
            a().a(r.getAlbumId(), lVar.a());
        } else {
            a().a(0L, 3);
        }
    }

    @Override // defpackage.amp.a
    public void p_() {
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onGuessLikeLoadingStateChanged(ago.d dVar) {
        if (dVar.b() == 2) {
            switch (dVar.a()) {
                case 0:
                    if (a() != null) {
                        a().a(false, true);
                        return;
                    }
                    return;
                case 1:
                    if (a() != null) {
                        a().a(true, false);
                        return;
                    }
                    return;
                case 2:
                case 3:
                    if (a() != null) {
                        a().a(false, false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onUpdateGuessLikeData(ago.g gVar) {
        u.d(gVar);
        if (a() != null) {
            a().a(gVar.a());
        }
    }

    public void c() {
        sp.a().a("/program/activity/sub").withString("fragment_uri", "/program/fragment/sub/guess_you_like?category_name=" + Uri.encode(a.a.getResources().getString(b.f.guess_like_title_2))).navigation();
    }

    public void d() {
        axe.c().b(1);
        if (a() != null) {
            a().a(true, true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechEvent(agg.y yVar) {
        if (a() != null) {
            a().ah_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveUserLogin(agq.u uVar) {
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingUnbinded(agq.s sVar) {
        this.h = aqh.a().c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingBinded(agq.r rVar) {
        this.h = aqh.a().c();
    }
}
