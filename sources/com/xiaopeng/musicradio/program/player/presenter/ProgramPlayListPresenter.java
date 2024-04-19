package com.xiaopeng.musicradio.program.player.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.program.ProgramBean;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumTracksBean;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.aq;
import com.xiaopeng.musicradio.utils.at;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import defpackage.agg;
import defpackage.agq;
import defpackage.axm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2.dex */
public class ProgramPlayListPresenter extends BasePresenter<com.xiaopeng.musicradio.program.player.view.a> {
    private static String j;
    private long g;
    private long h;
    private int i;
    private Call m;
    private ProgramBean n;
    private int o;
    private String b = "reading_album_";
    private String c = null;
    private int d = 1;
    private int e = -1;
    private int f = -1;
    private List<String> k = new ArrayList();
    private List<String> l = new ArrayList();

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        u.a(this);
        if (iVar != null) {
            d(true);
            if (j != null) {
                if (aqh.a().c() == null || !aqh.a().c().equalsIgnoreCase(j)) {
                    j = aqh.a().c();
                    if (a() != null) {
                        a().i();
                    }
                    a(true, true);
                }
            }
        }
    }

    public void c() {
        d(true);
        if (j != null) {
            if (aqh.a().c() == null || !aqh.a().c().equalsIgnoreCase(j)) {
                j = aqh.a().c();
                if (a() != null) {
                    a().i();
                }
                a(true);
            }
        }
    }

    private void d(boolean z) {
        boolean e = e(z);
        q();
        if (axn.i().r() == null || axn.i().w() == null || !z) {
            return;
        }
        Log.i("ProgramPlayListPresente", "getAlbumTracks: ======");
        a(!e, z);
    }

    private boolean e(boolean z) {
        this.n = axn.i().r();
        if (this.n != null) {
            ahq<ProgramBean> w = axn.i().w();
            if (!d()) {
                if (!this.b.contains(this.n.getAlbumId() + "")) {
                    this.b += this.n.getAlbumId();
                    this.g = 0L;
                    this.h = 0L;
                    this.i = 0;
                }
            } else if (w instanceof axm) {
                axm axmVar = (axm) w;
                this.b = ad.a(axmVar.B()).toJson();
                this.g = axmVar.B();
                this.h = axmVar.D();
                this.e = axmVar.h();
                this.d = axmVar.g();
                this.i = axmVar.C();
                if (this.i > 0) {
                    this.b = ad.b(axmVar.C()).toJson();
                } else {
                    this.b = ad.a(axmVar.B()).toJson();
                }
            } else {
                this.b = ad.a(0L).toJson();
                this.g = 0L;
                this.h = 0L;
                this.i = 0;
            }
            LogUtils.d("ProgramPlayListPresente", "update channel id:" + this.g);
            if (w != null) {
                this.c = w.u();
                this.d = w.g();
                if (TextUtils.isEmpty(this.c)) {
                    String str = this.b;
                    if (str != null && str.contains("headspeech")) {
                        this.c = "timeDesc";
                    } else {
                        this.c = "timeAsc";
                    }
                }
                Log.i("ProgramPlayListPresente", "refreshData: ========= " + this.d + " sort = " + this.c);
                if (a() != null) {
                    a().a(this.c);
                }
                List<ProgramBean> j2 = axn.i().j();
                FMAlbumTracksBean fMAlbumTracksBean = new FMAlbumTracksBean();
                ArrayList arrayList = new ArrayList();
                if (j2 != null && j2.size() > 0) {
                    FMAlbumTracksBean.DataBean dataBean = new FMAlbumTracksBean.DataBean();
                    dataBean.setList(arrayList);
                    fMAlbumTracksBean.setData(dataBean);
                    for (ProgramBean programBean : j2) {
                        FMAlbumTracksBean.DataBean.ListBean listBean = new FMAlbumTracksBean.DataBean.ListBean();
                        FMAlbumTracksBean.DataBean.ListBean.ArtistBean artistBean = new FMAlbumTracksBean.DataBean.ListBean.ArtistBean();
                        listBean.setArtist(artistBean);
                        listBean.setAlbumId(programBean.getAlbumId());
                        listBean.setId((int) programBean.getTrackId());
                        listBean.setTitle(programBean.getTitle());
                        listBean.setSmallLogo(programBean.getSmallLogo());
                        listBean.setMediumLogo(programBean.getMediumLogo());
                        listBean.setLargeLogo(programBean.getLargeLogo());
                        artistBean.setId(programBean.getArtistId());
                        artistBean.setName(programBean.getArtistName());
                        listBean.setListenUrl(programBean.getListenUrl());
                        listBean.setDuration(programBean.getDuration());
                        listBean.setUpdateTime(programBean.getUpdateTime());
                        listBean.setAlbumId(programBean.getAlbumId());
                        listBean.setOrderNum(programBean.getOrderNum());
                        listBean.setPaymentType(programBean.getPaymentType());
                        listBean.setAuthorized(programBean.isAuthorized());
                        listBean.setCreateTime(programBean.getCreateTime());
                        arrayList.add(listBean);
                    }
                }
                this.o = arrayList.size();
                r0 = arrayList.size() > 0;
                if (a() != null && r0) {
                    a().a(fMAlbumTracksBean, this.d, this.e);
                }
            }
        }
        return r0;
    }

    private void q() {
        if (a() != null) {
            Log.i("ProgramPlayListPresente", "refreshType: listSign = " + axn.i().s());
            if (d()) {
                a().a(true);
            } else {
                a().a(false);
            }
        }
    }

    public boolean d() {
        LogUtils.d("ProgramPlayListPresente", "head speech judge:" + axn.i().s());
        return !TextUtils.isEmpty(axn.i().s()) && axn.i().s().contains("headspeech");
    }

    public void a(List<ProgramBean> list, int i) {
        if (this.g > 0) {
            axm a = new axm.a().a(ad.a(this.g).toJson()).a(true).b(10).a(this.d).d(this.e).a();
            if (i == -1) {
                at.a(a);
                return;
            }
            axm.a aVar = new axm.a();
            axm a2 = aVar.a("reading_album_" + list.get(i).getAlbumId()).a(new ArrayList(list)).a(false).c(i).a(this.d).a(this.g).d(this.e).b(this.h).a();
            a2.a((ahp) a);
            at.a(a2);
        } else if (this.i > 0) {
            axm a3 = new axm.a().a(ad.b(this.i).toJson()).a(true).b(10).a(this.d).d(this.e).e(this.i).a();
            if (i == -1) {
                at.a(a3);
                return;
            }
            axm.a aVar2 = new axm.a();
            axm a4 = aVar2.a("reading_album_" + list.get(i).getAlbumId()).a(new ArrayList(list)).a(false).c(i).a(this.d).e(this.i).d(this.e).b(this.h).a();
            a4.a((ahp) a3);
            at.a(a4);
        }
    }

    public void a(String str) {
        Log.i("ProgramPlayListPresente", "setTracksSort: old = " + this.c + " new = " + str);
        if (TextUtils.isEmpty(str) || str.equals(this.c)) {
            return;
        }
        this.c = str;
        if (a() != null) {
            a().a(this.c);
        }
        if (this.n != null) {
            axk.a().a(new ReadingInfo(this.n.getAlbumId(), this.c));
        }
        this.d = 1;
        a(true);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = str;
        if (a() != null) {
            a().a(this.c);
        }
        if (this.n != null) {
            axk.a().a(new ReadingInfo(this.n.getAlbumId(), this.c));
        }
        this.d = 1;
        a(true);
    }

    public String e() {
        return this.c;
    }

    public void a(boolean z) {
        a(z, false);
    }

    public void a(boolean z, final boolean z2) {
        if (this.n.getCardId() > 0) {
            b(z);
            return;
        }
        if (a() != null && z) {
            a().al_();
        }
        r();
        Log.i("ProgramPlayListPresente", "getAlbumTracks: mCurPage = " + this.d + " sort = " + this.c + " mPlayBean = " + this.n);
        this.m = axp.a().a(this.n.getAlbumId(), this.d, 20, this.c, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter.1
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                Log.i("ProgramPlayListPresente", "response: " + fMAlbumTracksBean);
                ProgramPlayListPresenter.this.f = fMAlbumTracksBean.getData().getPage().getTotal();
                ProgramPlayListPresenter.this.e = fMAlbumTracksBean.getData().getPage().getTotalPage();
                ProgramPlayListPresenter.this.g();
                ProgramPlayListPresenter.this.c = fMAlbumTracksBean.getData().getSort();
                if (TextUtils.isEmpty(ProgramPlayListPresenter.this.c)) {
                    ProgramPlayListPresenter.this.c = "timeDesc";
                }
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(ProgramPlayListPresenter.this.c);
                }
                ProgramPlayListPresenter.this.d = fMAlbumTracksBean.getData().getPage().getPage();
                List<ProgramBean> j2 = axn.i().j();
                if (j2.size() > 0) {
                    for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                        for (ProgramBean programBean : j2) {
                            if (listBean.getId() == programBean.getTrackId()) {
                                programBean.setAuthorized(listBean.isAuthorized());
                            }
                        }
                    }
                }
                if (z2 && ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().i();
                }
                Log.i("ProgramPlayListPresente", "getAlbumTracks response: ========= " + ProgramPlayListPresenter.this.d);
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(fMAlbumTracksBean, ProgramPlayListPresenter.this.d, ProgramPlayListPresenter.this.e);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(i, str);
                }
            }
        }, (String) null);
    }

    public void b(boolean z) {
        if (a() != null && z) {
            a().al_();
        }
        r();
        this.m = axp.a().b(this.n.getCardId(), new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter.2
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                if (fMAlbumTracksBean.getData() == null) {
                    a(-1, "empty data");
                    return;
                }
                ProgramPlayListPresenter.this.f = fMAlbumTracksBean.getData().getPage().getTotal();
                ProgramPlayListPresenter.this.e = 1;
                ProgramPlayListPresenter.this.g();
                ProgramPlayListPresenter.this.c = fMAlbumTracksBean.getData().getSort();
                if (TextUtils.isEmpty(ProgramPlayListPresenter.this.c)) {
                    ProgramPlayListPresenter.this.c = "timeDesc";
                }
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(ProgramPlayListPresenter.this.c);
                }
                ProgramPlayListPresenter.this.d = fMAlbumTracksBean.getData().getPage().getPage();
                for (FMAlbumTracksBean.DataBean.ListBean listBean : fMAlbumTracksBean.getData().getList()) {
                    listBean.setAlbumId(ProgramPlayListPresenter.this.i);
                    listBean.setLargeLogo(ProgramPlayListPresenter.this.n.getLargeLogo());
                    listBean.setMediumLogo(ProgramPlayListPresenter.this.n.getMediumLogo());
                    listBean.setSmallLogo(ProgramPlayListPresenter.this.n.getSmallLogo());
                }
                Log.i("ProgramPlayListPresente", "getAlbumTracks response: ========= " + ProgramPlayListPresenter.this.d);
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(fMAlbumTracksBean, ProgramPlayListPresenter.this.d, 1);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(i, str);
                }
            }
        });
    }

    public void b(List<ProgramBean> list, int i) {
        ProgramBean r = axn.i().r();
        if (i != -1 && r != null && list.get(i).getTrackId() == r.getTrackId() && list.get(i).getAlbumId() == r.getAlbumId()) {
            if (axn.i().getPlayState() != 2) {
                axn.i().play();
            }
            e(list, i);
            return;
        }
        axm axmVar = new axm(this.b, this.d, this.e, 20, this.c, aq.b(this.n), false, list, i);
        axmVar.a(this.g);
        axmVar.b(this.h);
        axmVar.b(this.e);
        LogUtils.i("ProgramPlayListPresente", "play setTotalPage:" + this.e);
        axn.i().a((ahp<ProgramBean>) axmVar);
    }

    public boolean c(List<ProgramBean> list, int i) {
        if (list == null || i <= -1 || i >= list.size()) {
            return false;
        }
        list.get(i);
        return aqh.a().e();
    }

    public boolean d(List<ProgramBean> list, int i) {
        if (list == null || i <= -1 || i >= list.size()) {
            return false;
        }
        list.get(i);
        return aqh.a().g();
    }

    public void e(List<ProgramBean> list, int i) {
        axm axmVar = new axm(this.b, this.d, this.e, 20, this.c, aq.b(this.n), false, list, i);
        axmVar.a(this.g);
        axmVar.b(this.h);
        axn.i().b(axmVar);
    }

    public String f() {
        List<String> g = g();
        int i = this.d - 1;
        return g.size() > i ? g.get(i) : "";
    }

    public int a(int i) {
        if ("timeAsc".equals(this.c)) {
            for (String str : this.k) {
                String[] split = str.split("~");
                long longValue = Long.valueOf(split[0]).longValue();
                long longValue2 = Long.valueOf(split[1]).longValue();
                long j2 = i;
                if (j2 >= longValue && j2 <= longValue2) {
                    return this.k.indexOf(str) + 1;
                }
            }
        } else {
            for (String str2 : this.l) {
                String[] split2 = str2.split("~");
                long longValue3 = Long.valueOf(split2[0]).longValue();
                long longValue4 = Long.valueOf(split2[1]).longValue();
                long j3 = i;
                if (j3 <= longValue3 && j3 >= longValue4) {
                    return this.l.indexOf(str2) + 1;
                }
            }
        }
        return 1;
    }

    public List<String> g() {
        if (this.e == -1) {
            return Collections.emptyList();
        }
        if (this.k.isEmpty()) {
            int i = 1;
            while (true) {
                int i2 = this.f;
                if (i > i2) {
                    break;
                }
                int i3 = i + 20;
                int i4 = i3 - 1;
                if (i4 > i2) {
                    this.k.add(i + "~" + this.f);
                    break;
                }
                this.k.add(i + "~" + i4);
                i = i3;
            }
        }
        if (this.l.isEmpty()) {
            int i5 = this.f;
            while (true) {
                if (i5 < 1) {
                    break;
                }
                int i6 = (i5 - 20) + 1;
                if (i6 < 1) {
                    this.l.add(i5 + "~1");
                    break;
                }
                this.l.add(i5 + "~" + i6);
                i5 += -20;
            }
        }
        if ("timeAsc".equals(this.c)) {
            return this.k;
        }
        return this.l;
    }

    public void h() {
        this.k.clear();
        this.l.clear();
    }

    private void r() {
        Call call = this.m;
        if (call != null) {
            call.cancel();
        }
    }

    public void c(final boolean z) {
        if (a() != null) {
            a().al_();
        }
        int i = z ? this.d + 1 : this.d - 1;
        final int i2 = i < 1 ? 1 : i;
        r();
        this.m = axp.a().a(this.n.getAlbumId(), i2, 20, this.c, new avc<FMAlbumTracksBean>() { // from class: com.xiaopeng.musicradio.program.player.presenter.ProgramPlayListPresenter.3
            @Override // defpackage.avc
            public void a(FMAlbumTracksBean fMAlbumTracksBean) {
                ProgramPlayListPresenter.this.f = fMAlbumTracksBean.getData().getPage().getTotal();
                ProgramPlayListPresenter.this.e = fMAlbumTracksBean.getData().getPage().getTotalPage();
                ProgramPlayListPresenter.this.d = i2;
                Log.i("ProgramPlayListPresente", "getTracksNextOrPrePage response: ========== " + ProgramPlayListPresenter.this.d);
                if (z) {
                    if (ProgramPlayListPresenter.this.a() != null) {
                        ProgramPlayListPresenter.this.a().a(fMAlbumTracksBean, ProgramPlayListPresenter.this.d, ProgramPlayListPresenter.this.e);
                    }
                } else if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(fMAlbumTracksBean);
                }
            }

            @Override // defpackage.avc
            public void a(int i3, String str) {
                if (ProgramPlayListPresenter.this.a() != null) {
                    ProgramPlayListPresenter.this.a().a(i3, str);
                }
            }
        }, (String) null);
    }

    public boolean i() {
        return this.d < this.e;
    }

    public boolean j() {
        return this.d > 1;
    }

    public int k() {
        return this.e;
    }

    public int l() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
        Log.i("ProgramPlayListPresente", "setCurPage: " + this.d);
    }

    public boolean m() {
        return axn.i().c(this.b);
    }

    public void n() {
        axn.i().play();
    }

    public void o() {
        axn.i().pause();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealMusicEvent(age.l lVar) {
        LogUtils.i("ProgramPlayListPresente", "updatePlayState playState = %d", Integer.valueOf(lVar.a()));
        if (3 == lVar.b()) {
            axn.i().r();
            if (a() != null) {
                a().am_();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onListChange(age.d dVar) {
        if (dVar.a() == 3) {
            d(false);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter, com.xiaopeng.musicradio.commonui.lifecycle.a
    public void onDestroy(i iVar) {
        super.onDestroy(iVar);
        r();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSpeechShow(agg.y yVar) {
        if (a() != null) {
            a().h();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dealReadStatusUpdate(agq.q qVar) {
        if (a() != null) {
            a().a(qVar.a(), qVar.c());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReadingBinded(agq.r rVar) {
        if (a() != null) {
            a().i();
        }
        a(true);
    }

    public ProgramBean p() {
        return axn.i().r();
    }
}
