package com.xiaopeng.musicradio.mine.main.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.mine.common.presenter.MineBasePresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agl;
import defpackage.agq;
import defpackage.ark;
import defpackage.aud;
import defpackage.awn;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class MineEventPresenter extends MineBasePresenter<alg> {
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.g gVar) {
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.g gVar) {
        alg a = a();
        if (a != null) {
            a.a(true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.m mVar) {
        alg a = a();
        if (a != null) {
            a.a(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.r rVar) {
        alg a = a();
        if (a != null) {
            a.b(true);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.s sVar) {
        alg a = a();
        if (a != null) {
            a.b(false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.f fVar) {
        alg a = a();
        if (a != null) {
            a.a(fVar.a(), fVar.b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.l lVar) {
        alg a = a();
        if (a != null) {
            a.a(lVar.a(), lVar.b(), lVar.c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.o oVar) {
        alg a = a();
        if (a != null) {
            a.b(oVar.a(), oVar.b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.k kVar) {
        alg a = a();
        if (a != null) {
            a.c(kVar.a(), kVar.b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.j jVar) {
        alg a = a();
        if (a != null) {
            a.a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agl.c cVar) {
        alg a = a();
        if (a != null) {
            a.b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.n nVar) {
        alg a = a();
        if (a != null) {
            a.l_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agq.n nVar) {
        alg a = a();
        if (a != null) {
            a.k_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.f fVar) {
        alg a = a();
        if (a != null) {
            a.m_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.a aVar) {
        alg a = a();
        if (a != null) {
            a.n_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(ark.i iVar) {
        alg a = a();
        if (a != null) {
            a.h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(awn.a aVar) {
        alg a = a();
        if (a != null) {
            a.i();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(aud.b bVar) {
        alg a = a();
        if (a != null) {
            a.j();
        }
    }
}
