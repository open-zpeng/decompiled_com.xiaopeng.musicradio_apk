package com.xiaopeng.musicradio.search.home.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.search.home.view.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agh;
import defpackage.agp;
import defpackage.agq;
import defpackage.ayg;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class SearchActivityMainPresenter extends BasePresenter<c> {
    private boolean b;
    private Disposable c;
    private boolean d = false;

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        e();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHistorySearchKeyword(ayg.b bVar) {
        LogUtils.i("SearchActivityMainPresenter", "onSearchHistoryKeyword:" + bVar.b());
        if (TextUtils.isEmpty(bVar.b())) {
            if (a() != null) {
                a().a();
            }
        } else {
            if (a() != null && bVar.a()) {
                a().a(bVar.b());
            }
            ayj.a().a(bVar.b());
        }
        if (a() != null) {
            a().b(bVar.b());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onExitSearchActivity(agp.c cVar) {
        if (a() != null) {
            a().b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveVoiceSearchCountDownSeconds(agh.e eVar) {
        if (!this.b || a() == null) {
            return;
        }
        a().a(10 - eVar.a());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealPlayState(age.l lVar) {
        if ((lVar.b() == 0 || lVar.b() == 3) && this.b) {
            u.c(new agh.d(false));
            if (lVar.a() != 1) {
                u.c(new agh.d(true));
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveVoiceSearchTimerEvent(agh.d dVar) {
        if (this.b && this.d) {
            if (dVar.a()) {
                LogUtils.i("SearchActivityMainPresenter", "initCloseVoiceSearch");
                c();
                return;
            }
            LogUtils.i("SearchActivityMainPresenter", "disposeCloseVoiceSearch");
            e();
            u.c(new agh.e(-1));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void exitNonVoiceSearchEvent(agp.a aVar) {
        if (a() != null) {
            a().b();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void exitNonVoiceSearchEvent(agp.b bVar) {
        if (a() == null || this.d || a().ap_() || a() == null) {
            return;
        }
        a().b();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveLogout(agq.v vVar) {
        if (a() == null || this.d) {
            return;
        }
        a().b();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveKugouBindChanged(agq.h hVar) {
        if (hVar.a() || a() == null || this.d) {
            return;
        }
        a().b();
    }

    private void e() {
        Disposable disposable = this.c;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.c.dispose();
    }

    public void c() {
        e();
        this.c = Observable.interval(1L, TimeUnit.SECONDS).take(11L).subscribe(new Consumer<Long>() { // from class: com.xiaopeng.musicradio.search.home.presenter.SearchActivityMainPresenter.1
            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(Long l) {
                u.c(new agh.e(l.intValue()));
                if (SearchActivityMainPresenter.this.a() == null || l.longValue() != 10) {
                    return;
                }
                LogUtils.i("SearchActivityMainPresenter", "closeVoiceSearch");
                SearchActivityMainPresenter.this.a().b();
            }
        });
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.d;
    }

    public void b(boolean z) {
        this.b = z;
    }
}
