package com.xiaopeng.musicradio.program.choice.presenter.rank;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.program.choice.view.rank.a;
import com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class RankLayoutPresenter extends BaseProgramPresenter<a> {
    private RdAlbumBean b;

    @Override // com.xiaopeng.musicradio.program.common.presenter.BaseProgramPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        if (a() != null) {
            a(axn.i().getPlayState());
        }
        if (a() != null) {
            a().f();
        }
    }

    public void a(RdAlbumBean rdAlbumBean) {
        this.b = rdAlbumBean;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPlayStateChanged(age.l lVar) {
        if (lVar.b() != 3 || a() == null) {
            return;
        }
        a(lVar.a());
    }

    private void a(int i) {
        RdAlbumBean rdAlbumBean;
        ProgramBean r = axn.i().r();
        if (r != null && (rdAlbumBean = this.b) != null && rdAlbumBean.getId() == r.getAlbumId()) {
            if (a() != null) {
                a().a(i);
            }
        } else if (a() != null) {
            a().a(3);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateSpeechState(agg.y yVar) {
        if (a() != null) {
            a().e();
        }
    }
}
