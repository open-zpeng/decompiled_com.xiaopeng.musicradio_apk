package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.bean.xpbean.user.ReadingListAlbumsBean;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.awn;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProgramFetchModel.java */
/* renamed from: anm  reason: default package */
/* loaded from: classes2.dex */
public class anm {
    private static long d;
    private boolean a;
    private boolean b;
    private a c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramFetchModel.java */
    /* renamed from: anm$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final anm a = new anm();
    }

    public static anm a() {
        return b.a;
    }

    private anm() {
        this.a = false;
        this.b = true;
        d = System.currentTimeMillis() - 31536000000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        return !Objects.equals(str, aqh.a().c());
    }

    public void b() {
        this.a = false;
        this.b = false;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
            this.c = null;
        }
    }

    public void c() {
        boolean e = aqf.a().e();
        String c2 = aqh.a().c();
        Log.i("ProgramFetchModel", "downReadLove: " + e + ListSignBean.COLLECTID_SUFFIX + c2);
        if (!e || TextUtils.isEmpty(c2)) {
            return;
        }
        d = System.currentTimeMillis() - 31536000000L;
        this.b = true;
        if (!ay.c("should_down_read_love", true) || this.a) {
            return;
        }
        LogUtils.i("ProgramFetchModel", "downloadUserData: down readlove");
        this.a = true;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
        this.c = new a(c2);
        this.c.b();
    }

    public void d() {
        Log.i("ProgramFetchModel", "redownloadProgram: ");
        if (!this.b || axj.a().e() == 0) {
            ay.b("should_down_read_love", true);
            this.a = false;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.a = false;
        ay.a("should_down_read_love", false);
        u.c(new awn.a(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, long j) {
        LogUtils.w("ProgramFetchModel", "error: " + i + " msg=" + str + ",time=" + (System.currentTimeMillis() - j));
        this.a = false;
        this.b = false;
        u.c(new awn.a(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProgramFetchModel.java */
    /* renamed from: anm$a */
    /* loaded from: classes2.dex */
    public static class a {
        private final String a;
        private Disposable b;
        private boolean c;
        private long d;
        private AtomicBoolean e = new AtomicBoolean(false);

        public a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            this.e.set(z);
            if (z || anm.a().a(this.a)) {
                return;
            }
            anm.a().a = false;
        }

        public void a() {
            this.c = true;
            Disposable disposable = this.b;
            if (disposable == null || disposable.isDisposed()) {
                return;
            }
            this.b.dispose();
        }

        public void b() {
            this.d = System.currentTimeMillis();
            a(true);
            anl.a(1, 50, new avc<ReadingListAlbumsBean>() { // from class: anm.a.1
                @Override // defpackage.avc
                public void a(ReadingListAlbumsBean readingListAlbumsBean) {
                    ReadingListAlbumsBean.DataBean data = readingListAlbumsBean.getData();
                    ReadingListAlbumsBean.DataBean.PageBean page = data != null ? data.getPage() : null;
                    if (page != null) {
                        if (!anm.a().a(a.this.a)) {
                            if (a.this.c) {
                                Log.i("ProgramFetchModel", "post:skip:disposed:time=" + (System.currentTimeMillis() - a.this.d));
                                a.this.a(false);
                                return;
                            }
                            final List<RdAlbumBean> list = data.getList();
                            int total = page.getTotal();
                            Log.i("ProgramFetchModel", "post:response:total = " + total + ",time=" + (System.currentTimeMillis() - a.this.d));
                            if (total > 50) {
                                a.this.a(Math.min(total, (int) IInputController.KEYCODE_KNOB_WIND_SPD_UP), list);
                                return;
                            } else {
                                ban.e(new Runnable() { // from class: anm.a.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        a.this.a(list, a.this.d);
                                        a.this.a(false);
                                    }
                                });
                                return;
                            }
                        }
                        Log.i("ProgramFetchModel", "post:skip:mOpenId=" + a.this.a + ",time=" + (System.currentTimeMillis() - a.this.d));
                        a.this.a(false);
                        return;
                    }
                    Log.i("ProgramFetchModel", "post:skip:pageBean=null");
                    anm.a().a(-1, "pageBean=null", a.this.d);
                    a.this.a(false);
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    anm.a().a(i, str, a.this.d);
                    a.this.a(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<RdAlbumBean> a(ReadingListAlbumsBean readingListAlbumsBean) {
            ReadingListAlbumsBean.DataBean data = readingListAlbumsBean != null ? readingListAlbumsBean.getData() : null;
            if (data != null) {
                return data.getList();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, List<RdAlbumBean> list) {
            final int i2 = ((i + 50) - 1) / 50;
            Log.i("ProgramFetchModel", "fetch: totalPage = " + i2);
            final int min = Math.min(i2, 10);
            final SparseArray sparseArray = new SparseArray();
            sparseArray.put(1, list);
            this.b = Flowable.range(2, min).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).flatMap(new Function<Integer, Flowable<gn<Integer, ReadingListAlbumsBean>>>() { // from class: anm.a.5
                @Override // io.reactivex.functions.Function
                /* renamed from: a */
                public Flowable<gn<Integer, ReadingListAlbumsBean>> apply(Integer num) {
                    return a.this.a(num.intValue());
                }
            }).observeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<gn<Integer, ReadingListAlbumsBean>>() { // from class: anm.a.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(gn<Integer, ReadingListAlbumsBean> gnVar) {
                    Log.i("ProgramFetchModel", "accept: page =" + gnVar.a);
                    sparseArray.put(gnVar.a.intValue(), a.this.a(gnVar.b));
                }
            }, new Consumer<Throwable>() { // from class: anm.a.3
                @Override // io.reactivex.functions.Consumer
                /* renamed from: a */
                public void accept(Throwable th) {
                    anm a = anm.a();
                    a.a(-1, "accept Throwable:" + th.getMessage(), a.this.d);
                    a.this.b = null;
                    a.this.a(false);
                }
            }, new Action() { // from class: anm.a.4
                @Override // io.reactivex.functions.Action
                public void run() {
                    a.this.a(min, i2, sparseArray);
                    a.this.b = null;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(final int i, int i2, final SparseArray<List<RdAlbumBean>> sparseArray) {
            ban.a(new Runnable() { // from class: anm.a.6
                @Override // java.lang.Runnable
                public void run() {
                    final ArrayList arrayList = new ArrayList();
                    for (int i3 = 1; i3 <= i; i3++) {
                        List list = (List) sparseArray.get(i3);
                        if (list == null || list.isEmpty()) {
                            Log.i("ProgramFetchModel", "mergeAndPost: page empty: " + i3);
                        } else {
                            Log.i("ProgramFetchModel", "mergeAndPost:page=" + i3 + ",size=" + list.size());
                            arrayList.addAll(list);
                        }
                    }
                    ban.e(new Runnable() { // from class: anm.a.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long currentTimeMillis = System.currentTimeMillis();
                            a.this.a(arrayList, a.this.d);
                            LogUtils.i("ProgramFetchModel", "runOnDbWorker:time=" + (System.currentTimeMillis() - currentTimeMillis));
                            a.this.a(false);
                        }
                    });
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<RdAlbumBean> list, long j) {
            if (anm.a().a(this.a)) {
                Log.i("ProgramFetchModel", "onFetchSucceed skip : mOpenId=" + this.a);
            } else if (list == null || list.isEmpty()) {
                LogUtils.e("ProgramFetchModel", "onFetchSucceed:list empty : " + list);
                anm.a().f();
            } else {
                HashMap<Long, ReadLoveInfo> f = axj.a().f();
                Log.i("ProgramFetchModel", "onFetchSucceed: " + list.size() + ",loveMap=" + f.size() + ",time=" + (System.currentTimeMillis() - j));
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ReadLoveInfo a = aq.a(list.get(i2), anm.d - i2);
                    f.remove(Long.valueOf(a.getAlbumId()));
                    axj.a().b(a);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (Map.Entry<Long, ReadLoveInfo> entry : f.entrySet()) {
                    long longValue = entry.getKey().longValue();
                    if (currentTimeMillis - entry.getValue().getTs() > 60000) {
                        axj.a().a(longValue);
                        i++;
                    }
                }
                if (i > 0) {
                    Log.i("ProgramFetchModel", "onFetchSucceed:deleteCount=" + i);
                }
                axj.a().b();
                anm.a().f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Flowable<gn<Integer, ReadingListAlbumsBean>> a(final int i) {
            return Flowable.create(new FlowableOnSubscribe<gn<Integer, ReadingListAlbumsBean>>() { // from class: anm.a.7
                @Override // io.reactivex.FlowableOnSubscribe
                public void subscribe(final FlowableEmitter<gn<Integer, ReadingListAlbumsBean>> flowableEmitter) {
                    anl.a(i, 50, new avc<ReadingListAlbumsBean>() { // from class: anm.a.7.1
                        @Override // defpackage.avc
                        public void a(ReadingListAlbumsBean readingListAlbumsBean) {
                            if (!flowableEmitter.isCancelled()) {
                                flowableEmitter.onNext(new gn(Integer.valueOf(i), readingListAlbumsBean));
                            }
                            if (flowableEmitter.isCancelled()) {
                                return;
                            }
                            flowableEmitter.onComplete();
                        }

                        @Override // defpackage.avc
                        public void a(int i2, String str) {
                            flowableEmitter.tryOnError(new c(i2, str));
                        }
                    });
                }
            }, BackpressureStrategy.BUFFER);
        }
    }

    /* compiled from: ProgramFetchModel.java */
    /* renamed from: anm$c */
    /* loaded from: classes2.dex */
    public static class c extends RuntimeException {
        public int code;
        public String msg;

        public c(int i, String str) {
            super("RequestError:code=" + i + ",msg=" + str);
            this.code = i;
            this.msg = str;
        }
    }
}
