package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.commonui.base.d;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.datalist.h;
import com.xiaopeng.musicradio.datalist.i;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.mine.playlist.main.presenter.MinePlaylistPresenter;
import com.xiaopeng.musicradio.utils.q;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aep;
import defpackage.aht;
import java.util.List;
/* compiled from: MinePlaylistFragment.java */
@Route(path = "/mine/fragment/playlist")
/* renamed from: alt  reason: default package */
/* loaded from: classes2.dex */
public class alt extends d<ajy, als, MinePlaylistPresenter> implements aep.b, als, h, i {
    protected boolean e;
    private b f;
    private com.xiaopeng.musicradio.mine.widget.d g;
    private alw h;
    private int i = -1;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMinePlaylist";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajd.a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        if (!aqh.a().d()) {
            b(3);
        } else if (this.d == 0 || ((ajy) this.d).f.getChildCount() <= 0) {
        } else {
            ((ajy) this.d).f.scrollToPosition(0);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return aht.d.fragment_mine_playlist;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.g = new com.xiaopeng.musicradio.mine.widget.d((ViewGroup) k());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        Context context = ((ajy) this.d).f.getContext();
        this.h = new alw(context, 20, this, false, false, false) { // from class: alt.1
            @Override // defpackage.aep
            protected int f() {
                return 20;
            }
        };
        this.g.a(aht.e.empty_no_playlist);
        amk.a((BaseRecycleView) ((ajy) this.d).f, o(), true, true, "fragment_list");
        ((ajy) this.d).f.enableVuiInvisibleFeature(1);
        Resources resources = getResources();
        ((ajy) this.d).f.addItemDecoration(new ais(((ajy) this.d).f.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_album_view_item_width), resources.getDimensionPixelSize(aht.a.dp_39)));
        ((ajy) this.d).f.addItemDecoration(new air(getResources().getDimensionPixelSize(aht.a.mine_data_list_item_margin_bottom)));
        new b.a(context).a((c) this.h).a((DataListPresenter) this.b).a(((ajy) this.d).f).a(true).a(this).a();
        amo.a((RecyclerView) ((ajy) this.d).f, 30);
        ((ajy) this.d).d.setGotoLoginText(aht.e.goto_login_playlist);
        ((ajy) this.d).d.setGotoLoginCallback(new MineLoadingTipsView.a() { // from class: alt.2
            @Override // com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView.a
            public boolean a() {
                return !aqh.a().d();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        t();
        if (this.h.a() > 0) {
            this.h.d();
            ((MinePlaylistPresenter) this.b).w();
        }
    }

    private void t() {
        if (aqh.a().d()) {
            ((ajy) this.d).e.setVisibility(0);
        } else {
            ((ajy) this.d).e.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    public void E_() {
        super.E_();
        this.h.a((c.b) new c.b<ViewDataBinding, Object>() { // from class: alt.3
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, Object obj, int i) {
                LogUtils.i("MinePlaylistFragment", "onItemClicked:" + i);
                ajb.a(view.getResources().getString(aht.e.title_playlist_user));
                aml.a(view, (MusicRadioItem) obj, "user");
            }
        });
        ((ajy) this.d).c.setOnClickListener(new View.OnClickListener() { // from class: alt.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                alt.this.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public MinePlaylistPresenter ao_() {
        return new MinePlaylistPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        this.e = true;
        s();
    }

    @Override // com.xiaopeng.musicradio.datalist.i
    public void h_() {
        alw alwVar = this.h;
        if (alwVar == null || alwVar.a() <= 0) {
            b(1);
        }
    }

    protected void s() {
        if (this.h.a() > 0) {
            b(0);
        } else if (this.h.k()) {
        } else {
            b(3);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        alw alwVar = this.h;
        if (alwVar != null) {
            alwVar.a(z, aVar);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
        alw alwVar = this.h;
        if (alwVar != null) {
            alwVar.d();
        }
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return ale.a().c();
    }

    public void b(int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        this.g.b(i);
        if (i == 3 || i == 1) {
            t();
            ((ajy) this.d).f.setVisibility(4);
        } else {
            ((ajy) this.d).e.setVisibility(0);
            ((ajy) this.d).f.setVisibility(0);
        }
        afd.a(o(), ((ajy) this.d).d);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return amk.a();
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public void setDataHolder(b bVar) {
        this.f = bVar;
    }

    @Override // com.xiaopeng.musicradio.datalist.h
    public b getDataHolder() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (q.a(getActivity())) {
            return;
        }
        ajb.a();
        q.a(getActivity(), new ama(((ajy) this.d).c.getContext()));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!acs.b(configuration) || this.h.a() <= 0) {
            return;
        }
        this.h.d();
        ((MinePlaylistPresenter) this.b).w();
    }

    @Override // defpackage.aep.b
    public void a() {
        if (this.e) {
            s();
        }
        if (this.h.a() > 0) {
            this.h.d();
        }
    }
}
