package defpackage;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.xpbean.GuessLikeListBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.ReadingTrackListBean;
import com.xiaopeng.musicradio.bean.xpbean.TodayNewsCardBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ago;
import defpackage.agq;
import defpackage.amp;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ProgramDataModel.java */
/* renamed from: axe  reason: default package */
/* loaded from: classes2.dex */
public class axe implements amp.a, amp.b {
    private static int g;
    private Call<TodayNewsCardBean> a;
    private int b;
    private boolean c;
    private Disposable d;
    private int e;
    private List<RdAlbumBean> f;
    private int h;
    private int i;
    private int j;
    private List<TodayNewsCardBean.DataBean.ListBean> k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramDataModel.java */
    /* renamed from: axe$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final axe a = new axe();
    }

    static /* synthetic */ int e(axe axeVar) {
        int i = axeVar.e;
        axeVar.e = i + 1;
        return i;
    }

    public static axe c() {
        return a.a;
    }

    private axe() {
        this.b = 0;
        this.c = false;
        this.e = 0;
        this.f = new ArrayList();
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = new ArrayList();
        u.a(this);
        amp.a().a(this);
    }

    public List<TodayNewsCardBean.DataBean.ListBean> d() {
        return this.k;
    }

    public int e() {
        return this.b;
    }

    public void a(int i) {
        this.b = i;
    }

    @Override // defpackage.amp.a
    public void p_() {
        this.c = true;
        a(false, true);
    }

    @Override // defpackage.amp.b
    public void q_() {
        a(false, true);
    }

    public void a(final boolean z, boolean z2) {
        Call<TodayNewsCardBean> call;
        LogUtils.i("ProgramDataModel", "callGetBannerData isFirst:" + z + ", fromNet:" + z2);
        if (z2) {
            if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && ((call = this.a) == null || call.isExecuted())) {
                u.c(new ago.d(1, 1));
                this.b = 1;
                amp.a().a(this, false);
                this.a = axp.a().b(new avc<TodayNewsCardBean>() { // from class: axe.1
                    @Override // defpackage.avc
                    public void a(TodayNewsCardBean todayNewsCardBean) {
                        axe.this.i();
                        axe.this.e = 0;
                        axe.this.k.clear();
                        axe.this.k.addAll(todayNewsCardBean.getData().getList());
                        if ((axe.this.c || z) && !todayNewsCardBean.isFromCache()) {
                            axe.this.b = 4;
                        } else {
                            axe.this.b = 2;
                        }
                        LogUtils.i("ProgramDataModel", "getBannerData response ==> state: " + axe.this.b);
                        if (!todayNewsCardBean.isFromCache()) {
                            LogUtils.i("ProgramDataModel", "reset igon state in none cache response");
                            axe.this.c = false;
                        } else {
                            LogUtils.i("ProgramDataModel", "not in cache response");
                        }
                        u.c(new ago.d(1, axe.this.b));
                    }

                    @Override // defpackage.avc
                    public void a(int i, String str) {
                        if (axe.this.k.size() > 0) {
                            return;
                        }
                        amp.a().a(axe.this, true);
                        u.c(new ago.d(1, 3));
                        axe.this.b = 3;
                        LogUtils.i("ProgramDataModel", "getBannerData error ==> code: " + i + ",msg: " + str);
                        axe.e(axe.this);
                        axe.this.h();
                    }
                });
                return;
            }
            amp.a().a(this, true);
            u.c(new ago.d(1, 3));
            this.b = 3;
            return;
        }
        u.c(new ago.d(1, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        int i = this.e;
        if (i <= 10) {
            this.d = Observable.timer(c(i), TimeUnit.SECONDS).subscribe(new Consumer<Long>() { // from class: axe.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Long l) {
                    LogUtils.d("ProgramDataModel", "retry get banner data @" + axe.this.e);
                    axe.this.a(false, true);
                }
            });
            return;
        }
        LogUtils.i("ProgramDataModel", "retry exceeds max retry count:10");
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Disposable disposable = this.d;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.d.dispose();
    }

    private int c(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return c(i - 1) + c(i - 2);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveReadingBinded(agq.r rVar) {
        ban.d(new Runnable() { // from class: axe.3
            @Override // java.lang.Runnable
            public void run() {
                List<ReadHistoryInfo> d = axi.a().d();
                ArrayList arrayList = new ArrayList();
                for (ReadHistoryInfo readHistoryInfo : d) {
                    if (readHistoryInfo.getTrackPaymentType() == 2) {
                        arrayList.add(Long.valueOf(readHistoryInfo.getTrackId()));
                    }
                    if (arrayList.size() >= 48) {
                        a(arrayList);
                        arrayList.clear();
                    }
                }
                if (arrayList.size() > 0) {
                    a(arrayList);
                }
            }

            private void a(List<Long> list) {
                axp.a().a(list, new avc<ReadingTrackListBean>() { // from class: axe.3.1
                    @Override // defpackage.avc
                    public void a(int i, String str) {
                    }

                    @Override // defpackage.avc
                    public void a(final ReadingTrackListBean readingTrackListBean) {
                        ban.d(new Runnable() { // from class: axe.3.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                for (ReadingTrackListBean.DataBean.ListBean listBean : readingTrackListBean.getData().getList()) {
                                    LogUtils.i("ProgramDataModel", "update history record albumId:" + listBean.getAlbumId() + " to authoroized:" + listBean.isAuthorized());
                                    axi.a().a(listBean.getAlbumId()).setTrackAuthorized(listBean.isAuthorized());
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    public void b(final int i) {
        int i2 = this.h;
        if (i2 == 0 || i <= i2) {
            OkGo.getInstance().cancelTag("getGuessLike");
            axp.a().a(i, new avc<GuessLikeListBean>() { // from class: axe.4
                @Override // defpackage.avc
                public void a(GuessLikeListBean guessLikeListBean) {
                    if (guessLikeListBean.getData().getPageBean().getPage() == 1) {
                        axe.this.f.clear();
                    }
                    if ((guessLikeListBean.getData().getPageBean().getPage() == 1 && guessLikeListBean.getData().getList().size() == 0) ? false : true) {
                        u.c(new ago.d(2, 0));
                        axe.this.j = 0;
                    } else {
                        u.c(new ago.d(2, 2));
                        axe.this.j = 2;
                    }
                    LogUtils.i("ProgramDataModel", "getGuessLikePage response ==> state: " + axe.this.j);
                    for (int i3 = 0; i3 < guessLikeListBean.getData().getList().size(); i3++) {
                        if (!axe.this.f.contains(guessLikeListBean.getData().getList().get(i3))) {
                            axe.this.f.add(guessLikeListBean.getData().getList().get(i3));
                        }
                    }
                    axe.this.i = guessLikeListBean.getData().getPageBean().getPage();
                    axe.this.h = guessLikeListBean.getData().getPageBean().getTotalPage();
                    if (axe.this.i == 1) {
                        axe.this.a(false);
                    }
                }

                @Override // defpackage.avc
                public void a(int i3, String str) {
                    if (i == 1) {
                        u.c(new ago.d(2, 2));
                        axe.this.j = 2;
                    } else {
                        u.c(new ago.d(2, 0));
                        axe.this.j = 0;
                    }
                    LogUtils.i("ProgramDataModel", "getGuessLikePage error ==> code: " + i3 + ",msg: " + str);
                }
            });
        }
    }

    public int f() {
        return this.j;
    }

    public void a(boolean z) {
        int i;
        if (z) {
            g++;
            if (this.f.size() - (g * 6) < 12 && (i = this.i) < this.h) {
                b(i + 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = (g * 6) + i2;
            if (i3 < this.f.size()) {
                arrayList.add(this.f.get(i3));
            } else if (i3 - this.f.size() < this.f.size()) {
                List<RdAlbumBean> list = this.f;
                arrayList.add(list.get(i3 - list.size()));
                z2 = true;
            }
        }
        if (z2) {
            g = 0;
        }
        u.e(new ago.g(arrayList));
    }

    public List<RdAlbumBean> g() {
        return this.f;
    }
}
