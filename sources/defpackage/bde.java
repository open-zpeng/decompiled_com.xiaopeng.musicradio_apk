package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.VipSaleInfo;
import com.xiaopeng.musicradio.bean.VipSaleResult;
import com.xiaopeng.musicradio.bean.VipUrlInfo;
import com.xiaopeng.musicradio.bean.VipUrlResult;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: VipDataModel.java */
/* renamed from: bde  reason: default package */
/* loaded from: classes2.dex */
public class bde {
    private List<VipSaleInfo> a;
    private List<VipSaleInfo> b;
    private List<VipSaleInfo> c;
    private List<VipSaleInfo> d;
    private VipUrlInfo e;
    private VipUrlInfo f;
    private VipUrlInfo g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private Handler k;

    /* compiled from: VipDataModel.java */
    /* renamed from: bde$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bde a = new bde();
    }

    public static bde a() {
        return a.a;
    }

    private bde() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = new Handler(Looper.getMainLooper());
        u.a(this);
    }

    public void b() {
        Log.i("VipDataModel", "loadSaleData");
        bdg.a().c(new avc<VipSaleResult>() { // from class: bde.1
            @Override // defpackage.avc
            public void a(int i, String str) {
            }

            @Override // defpackage.avc
            public void a(VipSaleResult vipSaleResult) {
                if (vipSaleResult == null || vipSaleResult.getData() == null || vipSaleResult.getData().getBannerMap() == null) {
                    return;
                }
                bde.this.h = true;
                bde.this.a.clear();
                bde.this.b.clear();
                bde.this.d.clear();
                VipSaleResult.DataBean.BannerMapBean bannerMap = vipSaleResult.getData().getBannerMap();
                if (bannerMap.getQqMain() != null) {
                    bde.this.a.addAll(bannerMap.getQqMain());
                }
                if (bannerMap.getReadingMain() != null) {
                    bde.this.b.addAll(bannerMap.getReadingMain());
                }
                if (bannerMap.getUserMain() != null) {
                    bde.this.d.addAll(bannerMap.getUserMain());
                }
                if (bannerMap.getRadioMain() != null) {
                    bde.this.c.addAll(bannerMap.getRadioMain());
                }
                u.c(new agg.al());
            }
        });
    }

    public void c() {
        Log.i("VipDataModel", "vipUrlList");
        if (this.i) {
            return;
        }
        bdg.a().e(new avc<VipUrlResult>() { // from class: bde.2
            @Override // defpackage.avc
            public void a(VipUrlResult vipUrlResult) {
                if (vipUrlResult == null || vipUrlResult.getData() == null || vipUrlResult.getData().getBuyUrlList() == null) {
                    return;
                }
                bde.this.i = true;
                if (vipUrlResult.getData().getBuyUrlList().getQqBuyUrl() != null) {
                    bde.this.e = vipUrlResult.getData().getBuyUrlList().getQqBuyUrl();
                }
                if (vipUrlResult.getData().getBuyUrlList().getReadingBuyUrl() != null) {
                    bde.this.g = vipUrlResult.getData().getBuyUrlList().getReadingBuyUrl();
                }
                u.c(new agg.aj(true));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                u.c(new agg.aj(false));
            }
        });
    }

    public void d() {
        Log.i("VipDataModel", "userBuyUrl");
    }

    public List<VipSaleInfo> e() {
        return this.a;
    }

    public List<VipSaleInfo> f() {
        return this.b;
    }

    public List<VipSaleInfo> g() {
        return this.d;
    }

    public List<VipSaleInfo> h() {
        return this.c;
    }

    public VipUrlInfo i() {
        return this.e;
    }

    public VipUrlInfo j() {
        return this.f;
    }

    public VipUrlInfo k() {
        return this.g;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (this.j == null) {
            this.j = new Runnable() { // from class: bde.3
                @Override // java.lang.Runnable
                public void run() {
                    if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a) && NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        if (!bde.this.h) {
                            bde.this.b();
                        }
                        if (bde.this.i) {
                            return;
                        }
                        bde.this.c();
                    }
                }
            };
        }
        this.k.removeCallbacks(this.j);
        this.k.postDelayed(this.j, 2000L);
    }
}
