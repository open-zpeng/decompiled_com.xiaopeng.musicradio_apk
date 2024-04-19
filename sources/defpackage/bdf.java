package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.VipSaleInfoV2;
import com.xiaopeng.musicradio.bean.VipSaleResultV2;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: VipDataModelV2.java */
/* renamed from: bdf  reason: default package */
/* loaded from: classes2.dex */
public class bdf {
    private List<VipSaleInfoV2> a;
    private List<VipSaleInfoV2> b;
    private List<VipSaleInfoV2> c;
    private List<VipSaleInfoV2> d;
    private List<VipSaleInfoV2> e;
    private List<VipSaleInfoV2> f;
    private List<VipSaleInfoV2> g;
    private List<VipSaleInfoV2> h;
    private List<VipSaleInfoV2> i;
    private List<VipSaleInfoV2> j;
    private boolean k;
    private Runnable l;
    private Handler m;

    /* compiled from: VipDataModelV2.java */
    /* renamed from: bdf$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bdf a = new bdf();
    }

    public static bdf a() {
        return a.a;
    }

    private bdf() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.m = new Handler(Looper.getMainLooper());
        u.a(this);
    }

    public void b() {
        Log.i("VipDataModelV2", "loadSaleData");
        bdg.a().d(new avc<VipSaleResultV2>() { // from class: bdf.1
            @Override // defpackage.avc
            public void a(int i, String str) {
            }

            @Override // defpackage.avc
            public void a(VipSaleResultV2 vipSaleResultV2) {
                if (vipSaleResultV2 == null || vipSaleResultV2.getData() == null || vipSaleResultV2.getData().getBannerMap() == null) {
                    return;
                }
                bdf.this.k = true;
                bdf.this.g.clear();
                bdf.this.b.clear();
                bdf.this.e.clear();
                bdf.this.h.clear();
                bdf.this.a.clear();
                bdf.this.d.clear();
                bdf.this.c.clear();
                bdf.this.f.clear();
                bdf.this.i.clear();
                bdf.this.j.clear();
                VipSaleResultV2.DataBean.BannerMapBean bannerMap = vipSaleResultV2.getData().getBannerMap();
                if (bannerMap.getQqMain() != null) {
                    bdf.this.g.addAll(bannerMap.getQqMain());
                }
                if (bannerMap.getNeteaseMain() != null) {
                    bdf.this.b.addAll(bannerMap.getNeteaseMain());
                }
                if (bannerMap.getKugouMain() != null) {
                    bdf.this.e.addAll(bannerMap.getKugouMain());
                }
                if (bannerMap.getReadingMain() != null) {
                    bdf.this.h.addAll(bannerMap.getReadingMain());
                }
                if (bannerMap.getQqUserMain() != null) {
                    bdf.this.a.addAll(bannerMap.getQqUserMain());
                }
                if (bannerMap.getNeteaseUserMain() != null) {
                    bdf.this.d.addAll(bannerMap.getNeteaseUserMain());
                }
                if (bannerMap.getKugouUserMan() != null) {
                    bdf.this.c.addAll(bannerMap.getKugouUserMan());
                }
                if (bannerMap.getReadingUserMain() != null) {
                    bdf.this.f.addAll(bannerMap.getReadingUserMain());
                }
                if (bannerMap.getRadioMain() != null) {
                    bdf.this.i.addAll(bannerMap.getRadioMain());
                }
                if (bannerMap.getRadioUserMain() != null) {
                    bdf.this.j.addAll(bannerMap.getRadioUserMain());
                }
                u.c(new agg.am());
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (this.l == null) {
            this.l = new Runnable() { // from class: bdf.2
                @Override // java.lang.Runnable
                public void run() {
                    if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && !bdf.this.k) {
                        bdf.this.b();
                    }
                }
            };
        }
        this.m.removeCallbacks(this.l);
        this.m.postDelayed(this.l, 2000L);
    }

    public List<VipSaleInfoV2> c() {
        return this.a;
    }

    public List<VipSaleInfoV2> d() {
        return this.b;
    }

    public List<VipSaleInfoV2> e() {
        return this.c;
    }

    public List<VipSaleInfoV2> f() {
        return this.d;
    }

    public List<VipSaleInfoV2> g() {
        return this.e;
    }

    public List<VipSaleInfoV2> h() {
        return this.f;
    }

    public List<VipSaleInfoV2> i() {
        return this.g;
    }

    public List<VipSaleInfoV2> j() {
        return this.h;
    }

    public List<VipSaleInfoV2> k() {
        return this.i;
    }

    public List<VipSaleInfoV2> l() {
        return this.j;
    }
}
