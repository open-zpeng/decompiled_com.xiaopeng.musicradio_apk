package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.search.a;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.search.widget.view.PlayAllButton;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView;
import com.xiaopeng.musicradio.widget.recyclerview.h;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.XTextView;
import defpackage.agh;
import defpackage.azo;
import java.util.Arrays;
import java.util.List;
/* compiled from: SearchResultBaseListFragment.java */
/* renamed from: azt  reason: default package */
/* loaded from: classes2.dex */
public abstract class azt<UIInterface extends azo, Presenter extends BaseSearchResultListPresenter<UIInterface>> extends b<UIInterface, Presenter> implements axz, azo {
    protected PlayAllButton d;
    protected GridLayoutManager e;
    protected ListVuiRecyclerView f;
    protected FrameLayout g;
    private XTextView h;

    protected int A() {
        return 0;
    }

    protected abstract void a();

    protected int ar_() {
        return 33;
    }

    protected int at_() {
        return 4;
    }

    protected abstract int r();

    protected abstract axy s();

    protected int x() {
        return a.b.dp_30;
    }

    protected int z() {
        return a.b.dp_0;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return a.e.fragment_searchresult_list;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.f = (ListVuiRecyclerView) a(a.d.search_result_list);
        this.h = (XTextView) a(a.d.title);
        this.d = (PlayAllButton) a(a.d.play_all);
        this.g = (FrameLayout) a(a.d.top_bar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    public void g() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(x());
        int ar_ = ar_();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(z());
        int A = A();
        h hVar = new h(at_(), ar_, false);
        hVar.a(dimensionPixelSize);
        hVar.c(dimensionPixelSize2);
        hVar.b(A);
        this.f.addItemDecoration(hVar);
        this.e = new GridLayoutManager(getContext(), at_());
        this.f.setGridLayoutManager(this.e);
        this.f.setOnLoadMoreListener(new ListVuiRecyclerView.c() { // from class: azt.1
            @Override // com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView.c
            public void a(boolean z) {
                if (azt.this.s() == null || azt.this.s().l() == null) {
                    return;
                }
                if (z) {
                    azt.this.s().l().setVisibility(0);
                } else {
                    azt.this.s().l().setVisibility(8);
                }
            }

            @Override // com.xiaopeng.musicradio.widget.recyclerview.ListVuiRecyclerView.c
            public void a() {
                if (NetUtils.isNetworkAvailable(azt.this.getContext())) {
                    azt.this.a();
                    return;
                }
                ak.a(azt.this.getContext(), a.f.net_error_tip);
                if (azt.this.s() != null && azt.this.s().l() != null) {
                    azt.this.s().l().setVisibility(8);
                }
                azt.this.f.c();
            }
        });
        this.f.addOnScrollListener(new RecyclerView.m() { // from class: azt.2
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
        this.f.setOnTipsViewClick(new View.OnClickListener() { // from class: azt.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((BaseSearchResultListPresenter) azt.this.b).c(1);
            }
        });
        this.f.setNoRecordTipText(a.f.no_search_result_hint);
        this.f.initVuiAttr(o(), VuiEngine.getInstance(this.a));
        this.h.setText(r());
        this.f.getRecycledViewPool().a(0, 30);
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
        if (z) {
            if (i == 1) {
                this.f.setTipViewClickable(false);
                this.f.setTipsState(1);
                this.g.setVisibility(8);
                return;
            }
            return;
        }
        this.f.setTipsState(0);
        if (i >= 1 && i2 >= 1 && i < i2) {
            this.f.setLoadMoreEnable(true);
        } else {
            this.f.setLoadMoreEnable(false);
        }
        this.f.c();
        this.g.setVisibility(0);
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("SearchResultLocalLeftTab", "vui_search_local_top");
    }

    @Override // defpackage.axz
    public int a(String str, long j) {
        return ((BaseSearchResultListPresenter) this.b).a(str, j);
    }

    @Override // defpackage.axz
    public boolean a(long j) {
        return ((BaseSearchResultListPresenter) this.b).b(j);
    }

    @Override // defpackage.axz
    public boolean k_(int i) {
        return ((BaseSearchResultListPresenter) this.b).b(i);
    }

    @Override // defpackage.axz
    public void a(NetRadioInfo netRadioInfo) {
        ((BaseSearchResultListPresenter) this.b).a(netRadioInfo);
    }

    @Override // defpackage.axz
    public boolean a(long j, String str) {
        return ((BaseSearchResultListPresenter) this.b).e(j, str);
    }

    @Override // defpackage.axz
    public void b(long j, String str) {
        ((BaseSearchResultListPresenter) this.b).d(j, str);
    }

    @Override // defpackage.axz
    public void a(long j, String str, String str2) {
        ((BaseSearchResultListPresenter) this.b).c(j, str);
        ((BaseSearchResultListPresenter) this.b).a(j, str, str2);
    }

    @Override // defpackage.axz
    public boolean c(long j, String str) {
        return ((BaseSearchResultListPresenter) this.b).f(j, str);
    }

    @Override // defpackage.axz
    public void a(MusicSongBean musicSongBean) {
        ((BaseSearchResultListPresenter) this.b).a(musicSongBean);
    }

    @Override // defpackage.axz
    public void b(MusicSongBean musicSongBean) {
        ((BaseSearchResultListPresenter) this.b).b(musicSongBean);
    }

    @Override // defpackage.axz
    public void a(RdAlbumBean rdAlbumBean) {
        ((BaseSearchResultListPresenter) this.b).a(rdAlbumBean);
    }

    public void B() {
        this.f.setTipsState(3);
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        if (i == 1) {
            this.f.setTipsState(2);
        } else {
            this.f.setTipsState(0);
        }
        this.f.setTipViewClickable(true);
        if (s() == null || s().l() == null) {
            return;
        }
        s().l().setVisibility(8);
    }

    @Override // defpackage.azo
    public void as_() {
        if (this.f.getAdapter() != null) {
            this.f.getAdapter().d();
        }
    }

    @Override // defpackage.axz
    public boolean c(MusicSongBean musicSongBean) {
        return ((BaseSearchResultListPresenter) this.b).c(musicSongBean);
    }

    @Override // defpackage.axz
    public void b(long j, String str, String str2) {
        sp.a().a("/music/activity/fav_singer_collect_detail").addFlags(C.ENCODING_PCM_MU_LAW).addFlags(C.ENCODING_PCM_A_LAW).withLong("detail_id", j).withString("detail_LOGO", str).withString("detail_title", str2).navigation();
    }

    @Override // defpackage.axz
    public void c(long j, String str, String str2) {
        ((arf) c.a().b(arf.class)).startCollectDetail(j, str, str2, null);
    }

    @Override // defpackage.axz
    public void b(RdAlbumBean rdAlbumBean) {
        sp.a().a("/program/activity/sub").withFlags(C.ENCODING_PCM_MU_LAW).withString("fragment_uri", "/program/fragment/sub/detail?album_bean_gson=" + Uri.encode(z.a(rdAlbumBean))).navigation();
        u.c(new agh.d(false));
    }

    @Override // defpackage.axz
    public void a(MusicSongBean musicSongBean, List<MusicSongBean> list, int i) {
        ((BaseSearchResultListPresenter) this.b).a(musicSongBean, list, i);
    }
}
