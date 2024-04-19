package com.xiaopeng.musicradio.program.category.presenter;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.irdeto.securesdk.core.SSUtils;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.program.category.view.d;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.ap;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.ar;
import com.xiaopeng.musicradio.utils.at;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import defpackage.awn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class RdDetailPresenter extends BasePresenter<d> {
    private RdAlbumBean e;
    private ReadHistoryInfo j;
    private long n;
    private long o;
    private Call p;
    private int q;
    private int r;
    private int b = -1;
    private int c = -1;
    private int d = 1;
    private String f = null;
    private List<String> g = new ArrayList();
    private List<String> h = new ArrayList();
    private String i = "reading_album_";
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealAudioTypeChangeEvent(agg.g gVar) {
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.g.clear();
        this.h.clear();
        String string = bundle.getString("auto_play", "");
        String string2 = bundle.getString("track_id", "");
        String string3 = bundle.getString("album_id", "");
        String string4 = bundle.getString("album_bean_gson", "");
        String string5 = bundle.getString(SSUtils.O000OO00, "");
        String string6 = bundle.getString("card_id", "");
        if (!"0".equalsIgnoreCase(string5)) {
            try {
                this.q = Integer.parseInt(string5);
            } catch (Exception unused) {
            }
        }
        if (!"0".equalsIgnoreCase(string6)) {
            try {
                this.r = Integer.parseInt(string6);
            } catch (Exception unused2) {
            }
        }
        b(string.equalsIgnoreCase("true"));
        this.n = ap.b(string2);
        this.o = ap.b(string3);
        final RdAlbumBean rdAlbumBean = (RdAlbumBean) z.a(string4, (Class<Object>) RdAlbumBean.class);
        if (rdAlbumBean != null) {
            a(rdAlbumBean);
            ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.1
                @Override // java.lang.Runnable
                public void run() {
                    afk.a().a("key_cache_albumbena", z.a(rdAlbumBean));
                    u.c(new age.q());
                }
            });
        } else if (this.o > 0) {
            l();
            if (a() != null) {
                a().aa_();
            }
        } else {
            Log.i("RdAlbumDetailPresenter", "setBundle: ========");
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.4
                @Override // java.lang.Runnable
                public void run() {
                    String a = afk.a().a("key_cache_albumbena");
                    Log.d("RdAlbumDetailPresenter", "cache bean=" + a);
                    if (TextUtils.isEmpty(a)) {
                        return;
                    }
                    RdAlbumBean rdAlbumBean2 = (RdAlbumBean) z.a(a, (Class<Object>) RdAlbumBean.class);
                    rdAlbumBean2.setFromSource("near");
                    RdDetailPresenter.this.a(rdAlbumBean2);
                }
            });
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        D();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().ac_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAlbumReload(agq.p pVar) {
        this.o = pVar.a();
        l();
        n();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(awn.a aVar) {
        if (a() != null) {
            a().e_(f());
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(boolean z) {
        this.m = z;
        Log.d("RdAlbumDetailPresenter", "RdDetailManagerViewProxy_: setmBFirstReq mBFirstReq ====== " + this.m);
    }

    public void b(int i) {
        this.d = c(i);
    }

    public void b(boolean z) {
        this.l = z;
    }

    public void a(final RdAlbumBean rdAlbumBean) {
        this.e = rdAlbumBean;
        if (this.e != null) {
            int i = this.q;
            if (i > 0) {
                this.i = ad.a(i).toJson();
            }
            int i2 = this.r;
            if (i2 > 0) {
                this.i = ad.b(i2).toJson();
            } else {
                this.i = "reading_album_" + this.e.getId();
            }
            ban.d(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.5
                @Override // java.lang.Runnable
                public void run() {
                    ReadingInfo a = axk.a().a(rdAlbumBean.getId());
                    RdDetailPresenter.this.j = axi.a().a(rdAlbumBean.getId());
                    if (a != null) {
                        RdDetailPresenter.this.f = a.getSort();
                    }
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (RdDetailPresenter.this.a() != null) {
                                RdDetailPresenter.this.a().aa_();
                                RdDetailPresenter.this.a().e_(RdDetailPresenter.this.f());
                                if (TextUtils.isEmpty(RdDetailPresenter.this.f)) {
                                    return;
                                }
                                RdDetailPresenter.this.a().a(RdDetailPresenter.this.f);
                            }
                        }
                    });
                    HashMap hashMap = new HashMap();
                    hashMap.put(VuiConstants.ELEMENT_TYPE, "show");
                    hashMap.put("album", rdAlbumBean.getTitle());
                    hashMap.put("albumclass", rdAlbumBean.getCategoryName());
                    bci.i(hashMap);
                }
            });
        }
    }

    public RdAlbumBean e() {
        return this.e;
    }

    public boolean f() {
        if (this.e != null) {
            return axj.a().c(this.e.getId());
        }
        return false;
    }

    public void g() {
        this.f = null;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f)) {
            return;
        }
        this.f = str;
        if (a() != null) {
            a().a(this.f);
        }
        axk.a().a(new ReadingInfo(this.e.getId(), this.f));
        this.d = 1;
        n();
    }

    public String h() {
        return this.f;
    }

    public List<String> i() {
        if (this.b == -1) {
            return new ArrayList();
        }
        if (this.g.isEmpty()) {
            int i = 1;
            while (true) {
                int i2 = this.c;
                if (i > i2) {
                    break;
                }
                int i3 = i + 20;
                int i4 = i3 - 1;
                if (i4 > i2) {
                    this.g.add("" + i + "~" + this.c);
                    break;
                }
                this.g.add("" + i + "~" + i4);
                i = i3;
            }
        }
        if (this.h.isEmpty()) {
            int i5 = this.c;
            while (true) {
                if (i5 < 1) {
                    break;
                }
                int i6 = (i5 - 20) + 1;
                if (i6 < 1) {
                    this.h.add("" + i5 + "~1");
                    break;
                }
                this.h.add("" + i5 + "~" + i6);
                i5 += -20;
            }
        }
        if ("timeAsc".equals(this.f)) {
            return this.g;
        }
        return this.h;
    }

    public List<String> j() {
        if (this.b == -1) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            int i2 = this.c;
            if (i > i2) {
                break;
            }
            int i3 = i + 20;
            int i4 = i3 - 1;
            if (i4 > i2) {
                arrayList.add("" + i + "~" + this.c);
                break;
            }
            arrayList.add("" + i + "~" + i4);
            i = i3;
        }
        int i5 = this.c;
        while (true) {
            if (i5 < 1) {
                break;
            }
            int i6 = (i5 - 20) + 1;
            if (i6 < 1) {
                arrayList2.add("" + i5 + "~1");
                break;
            }
            arrayList2.add("" + i5 + "~" + i6);
            i5 += -20;
        }
        return "timeAsc".equals(this.f) ? arrayList : arrayList2;
    }

    public String k() {
        List<String> i = i();
        int i2 = this.d - 1;
        return i.size() > i2 ? i.get(i2) : "";
    }

    public int c(int i) {
        if ("timeAsc".equals(this.f)) {
            for (String str : this.g) {
                String[] split = str.split("~");
                long longValue = Long.valueOf(split[0]).longValue();
                long longValue2 = Long.valueOf(split[1]).longValue();
                long j = i;
                if (j >= longValue && j <= longValue2) {
                    return this.g.indexOf(str) + 1;
                }
            }
        } else {
            for (String str2 : this.h) {
                String[] split2 = str2.split("~");
                long longValue3 = Long.valueOf(split2[0]).longValue();
                long longValue4 = Long.valueOf(split2[1]).longValue();
                long j2 = i;
                if (j2 <= longValue3 && j2 >= longValue4) {
                    return this.h.indexOf(str2) + 1;
                }
            }
        }
        return 1;
    }

    public void l() {
        LogUtils.i("RdAlbumDetailPresenter", "loadByAlbumId.. mLoadAlbumId: " + this.o);
        if (this.o > 0) {
            if (a() != null) {
                a().a();
            }
            D();
            this.p = axp.a().a(this.o, new avc<FMAlbumDetailBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.6
                @Override // defpackage.avc
                public void a(FMAlbumDetailBean fMAlbumDetailBean) {
                    LogUtils.i("RdAlbumDetailPresenter", "openRdAlbum success!");
                    RdAlbumBean data = fMAlbumDetailBean.getData();
                    if (data != null) {
                        RdDetailPresenter.this.a(data);
                    }
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    LogUtils.i("RdAlbumDetailPresenter", "openRdAlbum err: " + str);
                    ak.b(com.xiaopeng.musicradio.a.a, bj.b(i, str));
                    if (RdDetailPresenter.this.a() != null) {
                        RdDetailPresenter.this.a().a(i, str);
                    }
                }
            });
        }
    }

    private boolean A() {
        LogUtils.d("RdAlbumDetailPresenter", "interceptTargetWhenFirstReq.. mTargetTrackId: " + this.n);
        return B();
    }

    private boolean B() {
        ProgramBean r = axn.i().r();
        if (r != null && r.getAlbumId() == this.e.getId()) {
            this.n = r.getTrackId();
            return a(this.e.getId(), r.getTrackId());
        }
        ReadHistoryInfo readHistoryInfo = this.j;
        if (readHistoryInfo != null && readHistoryInfo.getTrackId() > 0) {
            this.n = this.j.getTrackId();
            return a(this.e.getId(), this.j.getTrackId());
        } else if (this.n > 0) {
            return a(this.e.getId(), this.n);
        } else {
            return false;
        }
    }

    public void m() {
        if (a() != null) {
            a().a();
            a().a(this.f);
        }
        if (this.m) {
            this.m = false;
            ar.a(this.e);
        }
        Log.d("RdAlbumDetailPresenter", "getAlbumTracks m_Sort: " + this.f);
        D();
        this.p = axp.a().b((long) this.r, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.7
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                RdDetailPresenter.this.c = fMAlbumTracksBean.getData().getPage().getTotal();
                RdDetailPresenter.this.b = fMAlbumTracksBean.getData().getPage().getTotalPage();
                RdDetailPresenter.this.i();
                RdDetailPresenter.this.f = fMAlbumTracksBean.getData().getSort();
                if (TextUtils.isEmpty(RdDetailPresenter.this.f)) {
                    RdDetailPresenter.this.f = "timeDesc";
                }
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(RdDetailPresenter.this.f);
                }
                RdDetailPresenter.this.d = fMAlbumTracksBean.getData().getPage().getPage();
                for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                    listBean.setAlbumId(RdDetailPresenter.this.r);
                    listBean.setLargeLogo(RdDetailPresenter.this.e.getLargeLogo());
                    listBean.setMediumLogo(RdDetailPresenter.this.e.getMediumLogo());
                    listBean.setSmallLogo(RdDetailPresenter.this.e.getSmallLogo());
                }
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(fMAlbumTracksBean);
                }
                RdDetailPresenter.this.a(fMAlbumTracksBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(i, str);
                }
            }
        });
    }

    public void n() {
        if (this.r > 0) {
            m();
            return;
        }
        if (a() != null) {
            a().a();
            a().a(this.f);
        }
        if (this.m) {
            this.m = false;
            ar.a(this.e);
            if (A()) {
                return;
            }
        }
        Log.i("RdAlbumDetailPresenter", "getAlbumTracks m_Sort: " + this.f + ",mCurPage:" + this.d);
        D();
        this.p = axp.a().a(this.e.getId(), this.d, 20, this.f, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.8
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                RdDetailPresenter.this.c = fMAlbumTracksBean.getData().getPage().getTotal();
                RdDetailPresenter.this.b = fMAlbumTracksBean.getData().getPage().getTotalPage();
                RdDetailPresenter.this.i();
                RdDetailPresenter.this.f = fMAlbumTracksBean.getData().getSort();
                if (TextUtils.isEmpty(RdDetailPresenter.this.f)) {
                    RdDetailPresenter.this.f = "timeDesc";
                }
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(RdDetailPresenter.this.f);
                }
                RdDetailPresenter.this.d = fMAlbumTracksBean.getData().getPage().getPage();
                Log.i("RdAlbumDetailPresenter", "getAlbumTracks response: ==> " + RdDetailPresenter.this.d + ",mSort:" + RdDetailPresenter.this.f);
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(fMAlbumTracksBean);
                }
                RdDetailPresenter.this.a(fMAlbumTracksBean);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(i, str);
                }
            }
        }, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FMAlbumTracksBean fMAlbumTracksBean) {
        if (C()) {
            this.k = true;
            if (a() != null) {
                if (this.n > 0) {
                    final ArrayList arrayList = new ArrayList();
                    final int i = -1;
                    for (int i2 = 0; i2 < fMAlbumTracksBean.getData().getList().size(); i2++) {
                        ProgramBean a = aq.a(fMAlbumTracksBean.getData().getList().get(i2), this.e);
                        if (a != null) {
                            arrayList.add(a);
                            if (a.getTrackId() == this.n) {
                                i = i2;
                            }
                        }
                    }
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.9
                        @Override // java.lang.Runnable
                        public void run() {
                            at.a(RdDetailPresenter.this.i, RdDetailPresenter.this.d, RdDetailPresenter.this.b, 20, RdDetailPresenter.this.f, RdDetailPresenter.this.e, arrayList, i);
                        }
                    });
                } else {
                    ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.10
                        @Override // java.lang.Runnable
                        public void run() {
                            if (RdDetailPresenter.this.a() != null) {
                                RdDetailPresenter.this.a().Z_();
                            }
                        }
                    });
                }
                HashMap hashMap = new HashMap();
                hashMap.put(VuiConstants.ELEMENT_TYPE, "reading");
                hashMap.put("source", "click");
                bci.d(hashMap);
            }
        } else if (w() && a() != null) {
            a().ab_();
        }
    }

    private boolean C() {
        return (!this.l || this.k || w()) ? false : true;
    }

    private void D() {
        Call call = this.p;
        if (call != null) {
            call.cancel();
        }
    }

    private boolean a(long j, final long j2) {
        if (j != this.e.getId()) {
            Log.i("RdAlbumDetailPresenter", "getSpecialIdAlbumTracks cancel: mAlbumBean.getId() : " + this.e.getId() + ", albubmId: " + j);
            return false;
        }
        D();
        this.p = axp.a().b(j, j2, 20, this.f, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.11
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                RdDetailPresenter.this.c = fMAlbumTracksBean.getData().getPage().getTotal();
                RdDetailPresenter.this.b = fMAlbumTracksBean.getData().getPage().getTotalPage();
                RdDetailPresenter.this.i();
                RdDetailPresenter.this.d = fMAlbumTracksBean.getData().getPage().getPage();
                RdDetailPresenter.this.f = fMAlbumTracksBean.getData().getSort();
                if (TextUtils.isEmpty(RdDetailPresenter.this.f)) {
                    RdDetailPresenter.this.f = "timeDesc";
                }
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(RdDetailPresenter.this.f);
                }
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().b(fMAlbumTracksBean);
                    RdDetailPresenter.this.a().a(j2);
                }
                if (!fMAlbumTracksBean.isFromCache()) {
                    RdDetailPresenter.this.a(fMAlbumTracksBean);
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < fMAlbumTracksBean.getData().getList().size(); i2++) {
                    ProgramBean a = aq.a(fMAlbumTracksBean.getData().getList().get(i2), RdDetailPresenter.this.e);
                    if (a != null && a.getTrackId() == RdDetailPresenter.this.n) {
                        i = i2;
                    }
                }
                if (i != -1) {
                    RdDetailPresenter.this.a(fMAlbumTracksBean);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(i, str);
                }
            }
        }, null);
        return true;
    }

    public void c(final boolean z) {
        if (a() != null) {
            a().a();
        }
        final int i = z ? this.d + 1 : this.d - 1;
        if (i < 1) {
            return;
        }
        D();
        Log.i("RdAlbumDetailPresenter", "getTracksNextOrPrePage m_Sort: " + this.f + ",mCurPage:" + i);
        this.p = axp.a().a(this.e.getId(), i, 20, this.f, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.2
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                RdDetailPresenter.this.c = fMAlbumTracksBean.getData().getPage().getTotal();
                RdDetailPresenter.this.b = fMAlbumTracksBean.getData().getPage().getTotalPage();
                RdDetailPresenter.this.d = i;
                Log.i("RdAlbumDetailPresenter", "getTracksNextOrPrePage response: ==> " + RdDetailPresenter.this.d);
                if (z) {
                    if (RdDetailPresenter.this.a() != null) {
                        RdDetailPresenter.this.a().a(fMAlbumTracksBean);
                    }
                } else if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().c(fMAlbumTracksBean);
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                if (RdDetailPresenter.this.a() != null) {
                    RdDetailPresenter.this.a().a(i2, str);
                }
            }
        }, (String) null);
    }

    public boolean o() {
        return this.d < this.b;
    }

    public boolean p() {
        return this.d > 1;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingBinded(agq.r rVar) {
        a(this.e.getId(), this.n);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        LogUtils.i("RdAlbumDetailPresenter", "updatePlayState playState = %d", Integer.valueOf(lVar.a()));
        if (3 == lVar.b()) {
            ProgramBean r = axn.i().r();
            if (r != null && r.getAlbumId() == this.e.getId()) {
                if (a() != null) {
                    a().h_(lVar.a());
                }
            } else if (a() != null) {
                a().h_(3);
            }
        } else if (a() != null) {
            a().h_(3);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealInfoChangeEvent(age.c cVar) {
        LogUtils.i("RdAlbumDetailPresenter", "updateInfo type = %d", Integer.valueOf(cVar.a()));
        if (cVar.a() == 3) {
            ProgramBean r = axn.i().r();
            if (r == null || r.getAlbumId() != this.e.getId() || a() == null || axn.i().getPlayState() != 1) {
                return;
            }
            a().h_(1);
        } else if (a() != null) {
            a().h_(axn.i().getPlayState());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoveRead(agq.o oVar) {
        if (oVar.a() != this.e.getId() || a() == null) {
            return;
        }
        a().e_(oVar.b());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadStatusUpdate(agq.q qVar) {
        if (a() != null) {
            a().a(qVar.a(), qVar.c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHistoryChanged(final agq.n nVar) {
        if (this.e == null || nVar.a() != this.e.getId()) {
            return;
        }
        if (nVar.b()) {
            ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.program.category.presenter.RdDetailPresenter.3
                @Override // java.lang.Runnable
                public void run() {
                    RdDetailPresenter.this.j = axi.a().a(nVar.a());
                }
            });
        } else {
            this.j = null;
        }
    }

    public void q() {
        at.a();
    }

    public void r() {
        axn.i().pause();
    }

    public void a(List<ProgramBean> list) {
        if (axn.i().c() == 3) {
            axn.i().a(2);
        }
        at.a(this.i, this.d, this.b, 20, this.f, this.e, list);
    }

    public void a(List<ProgramBean> list, int i) {
        axm axmVar = new axm(this.i, this.d, this.b, 20, this.f, this.e, false, list, i);
        int i2 = this.r;
        if (i2 > 0) {
            axmVar.c(i2);
        } else {
            int i3 = this.q;
            if (i3 > 0) {
                axmVar.a(i3);
            }
        }
        axn.i().b(axmVar);
    }

    public boolean b(List<ProgramBean> list, int i) {
        if (list == null || i <= -1 || i >= list.size()) {
            return false;
        }
        list.get(i);
        return aqh.a().e();
    }

    public boolean c(List<ProgramBean> list, int i) {
        if (list == null || i <= -1 || i >= list.size()) {
            return false;
        }
        list.get(i);
        return aqh.a().g();
    }

    public void d(List<ProgramBean> list, int i) {
        boolean z;
        ProgramBean r = axn.i().r();
        if (i != -1 && r != null && list.get(i).getTrackId() == r.getTrackId() && list.get(i).getAlbumId() == r.getAlbumId()) {
            if (axn.i().getPlayState() != 2) {
                at.a();
            }
            u.c(new agg.r(3));
            a(list, i);
            return;
        }
        if (list == null) {
            z = true;
        } else {
            if (this.j != null) {
                ProgramBean programBean = i == -1 ? null : list.get(i);
                if (programBean != null && this.j.getTrackId() == programBean.getTrackId()) {
                    z = true;
                }
            }
            z = false;
        }
        axm axmVar = new axm(this.i, this.d, this.b, 20, this.f, this.e, z, list, (z || i != -1) ? i : 0);
        axmVar.a(this.q);
        axmVar.c(this.r);
        if (list != null) {
            Log.i("RdAlbumDetailPresenter", "play: size = " + list.size());
        }
        at.a(axmVar);
    }

    public void s() {
        if (this.e != null) {
            axh.a().a(aq.a(this.e, System.currentTimeMillis()), false);
        }
    }

    public boolean t() {
        return this.j != null;
    }

    public ReadHistoryInfo u() {
        return this.j;
    }

    public boolean v() {
        return TextUtils.equals(axn.i().s(), this.i);
    }

    public boolean w() {
        return axn.i().c(this.i);
    }

    public int x() {
        if (v()) {
            return axn.i().getPlayState();
        }
        return -1;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealNetValid(agg.p pVar) {
        if (a() != null) {
            a().Y_();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealLoadFail(age.g gVar) {
        if (gVar.a() != 3 || a() == null) {
            return;
        }
        a().a(gVar.b(), (String) null);
    }

    public int y() {
        return this.q;
    }

    public int z() {
        return this.r;
    }
}
