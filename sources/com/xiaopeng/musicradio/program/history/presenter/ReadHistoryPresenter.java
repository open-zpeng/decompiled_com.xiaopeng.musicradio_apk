package com.xiaopeng.musicradio.program.history.presenter;

import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.program.history.view.a;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import defpackage.awn;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ReadHistoryPresenter extends BasePresenter<a> {
    private List<ReadHistoryInfo> b;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    public void c() {
        ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.program.history.presenter.ReadHistoryPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                List<ReadHistoryInfo> d = axi.a().d();
                if (ReadHistoryPresenter.this.b == null) {
                    ReadHistoryPresenter.this.b = new ArrayList();
                }
                ReadHistoryPresenter.this.b.clear();
                if (d != null) {
                    ReadHistoryPresenter.this.b.addAll(d);
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.history.presenter.ReadHistoryPresenter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ReadHistoryPresenter.this.a() != null) {
                            ReadHistoryPresenter.this.a().ak_();
                        }
                        if (ReadHistoryPresenter.this.a() != null) {
                            ReadHistoryPresenter.this.a().a(ReadHistoryPresenter.this.b);
                        }
                    }
                });
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onResume(i iVar) {
        super.onResume(iVar);
        c();
    }

    public void a(ReadHistoryInfo readHistoryInfo) {
        axh.a().a(aq.b(readHistoryInfo), false);
    }

    public void a(ReadHistoryInfo readHistoryInfo, int i) {
        axh.a().a(readHistoryInfo.getAlbumId());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHistoryChanged(agq.n nVar) {
        c();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().aj_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadLove(agq.o oVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).getAlbumId() == oVar.a()) {
                if (a() != null) {
                    a().a(i);
                    return;
                }
                return;
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealDownloadProgram(awn.a aVar) {
        if (a() != null) {
            a().aj_();
        }
    }
}
