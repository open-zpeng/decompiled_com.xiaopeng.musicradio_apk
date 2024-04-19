package com.xiaopeng.musicradio.search.result.mix.view;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.exoplayer2.C;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.result.mix.presenter.SearchResultMixPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.VuiRecyclerViewWithLoading;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.agh;
import defpackage.agq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: SearchResultMixFragment.java */
@Route(path = "/search/fragment/result/mix")
/* loaded from: classes2.dex */
public class b extends com.xiaopeng.musicradio.commonui.vui.b<a, SearchResultMixPresenter> implements axz, a {
    private VuiRecyclerViewWithLoading d;
    private e e;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "SearchResultMix";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.e.fragment_search_result_mix;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (VuiRecyclerViewWithLoading) a(a.d.mix_recyclerview);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.d.addItemDecoration(new j(40, 100));
        s();
        this.d.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.search.result.mix.view.b.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    u.c(new agh.d(true));
                } else if (i == 1) {
                    u.c(new agh.d(false));
                }
            }
        });
        this.d.setOnTipsViewClick(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.search.result.mix.view.b.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.d.getTipsState() == 2) {
                    ((SearchResultMixPresenter) b.this.b).e();
                }
            }
        });
        this.d.setNoRecordTipText(a.f.no_search_result_hint);
        this.d.initVuiAttr(o(), VuiEngine.getInstance(this.a), true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        if (view != null) {
            VuiFloatingLayerManager.show(view, 0, 0, 0, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public SearchResultMixPresenter ao_() {
        return new SearchResultMixPresenter();
    }

    private void s() {
        this.e = new e();
        this.e.a(azb.class, new ayv(this));
        this.e.a(ayw.class, new ayq(this));
        this.e.a(ayy.class, new ays(this));
        this.e.a(aza.class, new ayu(this));
        this.e.a(ayz.class, new ayt(this));
        this.d.setLayoutManager(new LinearLayoutManager(getContext()));
        this.d.setAdapter(this.e);
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
        if (z) {
            this.d.setTipsState(1);
        } else {
            this.d.setTipsState(0);
        }
    }

    public void r() {
        this.d.setTipsState(3);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        this.d.setTipViewClickable(true);
        this.d.setTipsState(2);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("SearchResultLocalLeftTab", "vui_search_local_top");
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (dataBean.getSongList() != null && dataBean.getSongList().size() > 0) {
            arrayList.add(new azb(dataBean.getSongList(), 0));
            i3 = 0 + (dataBean.getSongList().size() <= 6 ? dataBean.getSongList().size() : 6);
            azz.a(dataBean.getSongList());
        }
        if (w.f() == 1 && dataBean.getAlbumList() != null && dataBean.getAlbumList().size() > 0) {
            arrayList.add(new ayw(dataBean.getAlbumList(), i3));
            i3 += dataBean.getAlbumList().size() > 4 ? 4 : dataBean.getAlbumList().size();
        }
        if (dataBean.getCollectList() != null && dataBean.getCollectList().size() > 0) {
            arrayList.add(new ayy(dataBean.getCollectList(), i3));
            i3 += dataBean.getCollectList().size() > 4 ? 4 : dataBean.getCollectList().size();
        }
        if (dataBean.getReadingAlbumList() != null && dataBean.getReadingAlbumList().size() > 0) {
            arrayList.add(new aza(dataBean.getReadingAlbumList(), i3));
            i3 += dataBean.getReadingAlbumList().size() <= 4 ? dataBean.getReadingAlbumList().size() : 4;
        }
        if (dataBean.getRadioList() != null && dataBean.getRadioList().size() > 0) {
            arrayList.add(new ayz(dataBean.getRadioList(), i3));
        }
        this.e.a((List<?>) arrayList);
        if (arrayList.size() == 0) {
            r();
        }
        VuiEngine.getInstance(this.a).updateScene(o(), this.d);
    }

    @Override // defpackage.azo
    public void as_() {
        if (this.d.getAdapter() != null) {
            this.d.getAdapter().d();
        }
    }

    @Override // defpackage.azo
    public boolean u() {
        return this.e.f().size() > 0;
    }

    @Override // defpackage.azo
    public void v() {
        this.e.a((List<?>) new ArrayList());
    }

    @Override // defpackage.axz
    public int a(String str, long j) {
        return ((SearchResultMixPresenter) this.b).a(str, j);
    }

    @Override // defpackage.axz
    public boolean a(long j) {
        return ((SearchResultMixPresenter) this.b).b(j);
    }

    @Override // defpackage.axz
    public boolean k_(int i) {
        return ((SearchResultMixPresenter) this.b).b(i);
    }

    @Override // defpackage.axz
    public boolean a(long j, String str) {
        return ((SearchResultMixPresenter) this.b).e(j, str);
    }

    @Override // defpackage.axz
    public void b(long j, String str) {
        ((SearchResultMixPresenter) this.b).d(j, str);
    }

    @Override // defpackage.axz
    public boolean c(long j, String str) {
        return ((SearchResultMixPresenter) this.b).f(j, str);
    }

    @Override // defpackage.axz
    public void a(long j, String str, String str2) {
        ((SearchResultMixPresenter) this.b).c(j, str);
        ((SearchResultMixPresenter) this.b).a(j, str, str2);
    }

    @Override // defpackage.axz
    public void a(RdAlbumBean rdAlbumBean) {
        ((SearchResultMixPresenter) this.b).a(rdAlbumBean);
    }

    @Override // defpackage.axz
    public void a(NetRadioInfo netRadioInfo) {
        ((SearchResultMixPresenter) this.b).a(netRadioInfo);
    }

    @Override // defpackage.axz
    public void a(MusicSongBean musicSongBean) {
        ((SearchResultMixPresenter) this.b).a(musicSongBean);
    }

    @Override // defpackage.axz
    public void b(MusicSongBean musicSongBean) {
        ((SearchResultMixPresenter) this.b).b(musicSongBean);
    }

    @Override // defpackage.axz
    public boolean c(MusicSongBean musicSongBean) {
        return ((SearchResultMixPresenter) this.b).c(musicSongBean);
    }

    @Override // defpackage.axz
    public void b(long j, String str, String str2) {
        sp.a().a("/music/activity/fav_singer_collect_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", j).withString("detail_LOGO", str).withString("detail_title", str2).navigation();
    }

    @Override // defpackage.axz
    public void c(long j, String str, String str2) {
        ((arf) com.xiaopeng.musicradio.service.c.a().b(arf.class)).startCollectDetail(j, str, str2, null);
    }

    @Override // defpackage.axz
    public void b(RdAlbumBean rdAlbumBean) {
        sp.a().a("/program/activity/sub").withFlags(C.ENCODING_PCM_MU_LAW).withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(rdAlbumBean))).navigation();
        u.c(new agh.d(false));
    }

    @Override // defpackage.axz
    public void a(MusicSongBean musicSongBean, List<MusicSongBean> list, int i) {
        ((SearchResultMixPresenter) this.b).a(musicSongBean, list, i);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("SearchResultMixFragment", "onCreate: ========");
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("SearchResultMixFragment", "onDestroyView: ===========");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.i("SearchResultMixFragment", "onDestroy: ================");
    }

    @Override // defpackage.azq
    public void a(agq.l lVar) {
        List<?> f;
        e eVar = this.e;
        if (eVar == null || (f = eVar.f()) == null) {
            return;
        }
        for (Object obj : f) {
            if (obj instanceof azb) {
                List<MusicSongBean> b = ((azb) obj).b();
                if (b != null) {
                    for (MusicSongBean musicSongBean : b) {
                        if (Objects.equals(musicSongBean.getHash(), lVar.a())) {
                            musicSongBean.setHot(lVar.c());
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
