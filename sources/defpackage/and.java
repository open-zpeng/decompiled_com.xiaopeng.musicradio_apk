package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.SongListBean;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.service.MusicMineService;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.amp;
import defpackage.ark;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: MusicFetchModel.java */
/* renamed from: and  reason: default package */
/* loaded from: classes2.dex */
public class and implements amp.a {
    private static long a;
    private String b;
    private a c;
    private AtomicLong d;
    private AtomicBoolean e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicFetchModel.java */
    /* renamed from: and$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final and a = new and();
    }

    public void a(boolean z, String str) {
    }

    public static and b() {
        return b.a;
    }

    private and() {
        this.d = new AtomicLong(0L);
        this.e = new AtomicBoolean(true);
        u.a(this);
        amp.a().a(this);
        a = System.currentTimeMillis() - 31536000000L;
    }

    public String c() {
        return ((aqs) apx.a().b()).a();
    }

    public void d() {
        this.d.set(0L);
    }

    public void e() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.c();
            this.c = null;
        }
        this.b = null;
        a(true, "clear");
        this.d.set(0L);
    }

    public boolean a(int i) {
        return System.currentTimeMillis() - this.d.get() > (i != 1 ? i != 3 ? 30000L : 60000L : 1000L);
    }

    public void a(String str) {
        String c = c();
        LogUtils.i("MusicFetchModel", "fetchCollectedMusic:openId=" + c + ",from=" + str);
        if (!apx.a().d()) {
            if (this.c != null) {
                LogUtils.i("MusicFetchModel", "fetchCollectedMusic:dispose:logout");
                this.c.c();
                this.c = null;
                return;
            }
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            if (aVar.b() && Objects.equals(this.b, c)) {
                LogUtils.i("MusicFetchModel", "fetchCollectedMusic:isRunning");
                return;
            } else if (this.c.b()) {
                LogUtils.i("MusicFetchModel", "fetchCollectedMusic:dispose:changed");
                this.c.c();
                this.c = null;
            }
        }
        this.b = c;
        long currentTimeMillis = System.currentTimeMillis();
        a = currentTimeMillis - 31536000000L;
        this.d.set(currentTimeMillis);
        this.c = new a(c);
        this.c.a();
    }

    public static List<MusicInfo> a(int i, List<MusicSongBean> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MusicInfo b2 = ab.b(list.get(i2));
            if (b2 != null) {
                b2.setCreatime(a - ((i * 50) + i2));
                b2.setPlayTime(b2.getCreatime());
                b2.setCanUp(false);
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public static long a(int i, int i2) {
        return a - ((i * 50) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.d.set(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, long j) {
        this.d.set(0L);
        LogUtils.w("MusicFetchModel", "error: " + i + " msg=" + str + ",time=" + (System.currentTimeMillis() - j));
        u.c(new ark.f(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return !Objects.equals(this.b, str);
    }

    public boolean a(int i, String str) {
        if (a(i)) {
            a(str);
            return true;
        }
        return false;
    }

    @Override // defpackage.amp.a
    public void p_() {
        if (System.currentTimeMillis() - this.d.get() > 3600000) {
            a(true, "onDataFetch");
        }
        this.d.set(0L);
        a(1, "onDataFetch");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(agg.p pVar) {
        if (!com.xiaopeng.musicradio.model.car.a.a().f() || a(3, "NetWorkValid")) {
            return;
        }
        afi.d().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final int i, final int i2) {
        if (Objects.equals(str, this.b) && NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a()) && i <= i2) {
            anf.a(i, 50, new avc<SongListBean>() { // from class: and.1
                @Override // defpackage.avc
                public void a(SongListBean songListBean) {
                    List<MusicSongBean> list;
                    if (Objects.equals(str, and.this.c())) {
                        SongListBean.DataBean data = songListBean != null ? songListBean.getData() : null;
                        if ((data != null ? data.getPage() : null) == null || data == null || (list = data.getList()) == null) {
                            return;
                        }
                        apb.a().a(and.a(i, list), true);
                        and.this.a(str, i + 1, i2);
                    }
                }

                @Override // defpackage.avc
                public void a(int i3, String str2) {
                    and.b().a(true, "error");
                }
            });
        }
    }

    /* compiled from: MusicFetchModel.java */
    /* renamed from: and$a */
    /* loaded from: classes2.dex */
    public static class a {
        private final String a;
        private boolean b;
        private long c;
        private AtomicBoolean d = new AtomicBoolean(false);

        public a(String str) {
            this.a = str;
        }

        public void a() {
            this.c = System.currentTimeMillis();
            a(true);
            anf.a(1, 50, new avc<SongListBean>() { // from class: and.a.1
                @Override // defpackage.avc
                public void a(SongListBean songListBean) {
                    SongListBean.DataBean data = songListBean != null ? songListBean.getData() : null;
                    SongListBean.DataBean.PageBean page = data != null ? data.getPage() : null;
                    if (data == null || page == null) {
                        Log.i("MusicFetchModel", "post:skip:pageBean=null");
                        a.this.a(false);
                        return;
                    }
                    final List<MusicSongBean> list = data.getList();
                    if (list != null) {
                        if (!and.b().b(a.this.a)) {
                            if (a.this.b) {
                                Log.i("MusicFetchModel", "post:skip:disposed:time=" + (System.currentTimeMillis() - a.this.c));
                                a.this.a(false);
                                return;
                            }
                            final int total = page.getTotal();
                            final int totalPage = page.getTotalPage();
                            Log.i("MusicFetchModel", "post:response:total = " + total + ",time=" + (System.currentTimeMillis() - a.this.c));
                            ban.e(new Runnable() { // from class: and.a.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Runnable a = a.this.a(list, a.this.c, total, totalPage);
                                    if (a == null) {
                                        a.this.a(false);
                                    } else {
                                        a.run();
                                    }
                                }
                            });
                            return;
                        }
                        Log.i("MusicFetchModel", "post:skip:mOpenId=" + a.this.a + ",time=" + (System.currentTimeMillis() - a.this.c));
                        a.this.a(false);
                        return;
                    }
                    Log.i("MusicFetchModel", "post:skip:list=null");
                    a.this.a(false);
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    and.b().a(i, str, a.this.c);
                    a.this.a(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            this.d.set(z);
            if (z) {
                return;
            }
            afi.d().f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable a(List<MusicSongBean> list, long j, final int i, final int i2) {
            MusicMineService musicMineService;
            if (and.b().b(this.a)) {
                Log.i("MusicFetchModel", "onFetchSucceed skip : mOpenId=" + this.a);
                return null;
            } else if (list == null || list.isEmpty()) {
                LogUtils.e("MusicFetchModel", "onFetchSucceed:list empty : " + list);
                return null;
            } else {
                int size = list.size();
                List<MusicInfo> a = and.a(0, list);
                Log.i("MusicFetchModel", "onFetchSucceed: insertList=" + a.size() + ",listSize=" + size);
                anv.a().b(a);
                anv.a().a(a, true);
                Log.i("MusicFetchModel", "onFetchSucceed:time=" + (System.currentTimeMillis() - j));
                u.c(new ark.f(true));
                and.b().f();
                Runnable runnable = new Runnable() { // from class: and.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        anc.a().a(a.this.a, i);
                        anc.a().b(a.this.a, i2);
                        a.this.a(false);
                    }
                };
                apb.a().a(a, true);
                if (i > 50 && (musicMineService = (MusicMineService) c.a().b(ard.class)) != null) {
                    musicMineService.getCollectedMusicList(new e(0, 0, true, 2, 0L, 50), true);
                }
                return runnable;
            }
        }

        public boolean b() {
            return this.d.get();
        }

        public void c() {
            this.b = true;
        }
    }
}
