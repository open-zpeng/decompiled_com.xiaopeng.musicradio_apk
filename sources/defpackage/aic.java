package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.commonui.base.d;
import com.xiaopeng.musicradio.mine.collect.main.presenter.MineCollectPresenter;
import com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView;
import com.xiaopeng.musicradio.mine.widget.b;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.g;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MineCollectFragment.java */
@Route(path = "/mine/fragment/collect")
/* renamed from: aic  reason: default package */
/* loaded from: classes2.dex */
public class aic extends d<ajs, aib, MineCollectPresenter> implements aib {
    private com.xiaopeng.musicradio.mine.widget.d e;
    private e f;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMineCollect";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aja.a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        Integer d;
        Integer c;
        super.d();
        if (!aqh.a().d() && (c = ahz.a().c()) != null) {
            b_(c.intValue());
        }
        if (aqh.a().e() || (d = ahz.a().d()) == null) {
            return;
        }
        b_(d.intValue());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return aht.d.fragment_mine_collect;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = new com.xiaopeng.musicradio.mine.widget.d((ViewGroup) k());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.f = new e();
        ArrayList arrayList = new ArrayList();
        ae.a(this.f, arrayList, g.a(), new b(aht.d.collected_music_view_layout, "collected_music_view_layout", ahz.a()));
        ae.a(this.f, arrayList, g.b(), new b(aht.d.collected_album_view_layout, "collected_album_view_layout", ahz.a()));
        ae.a(this.f, arrayList, g.c(), new b(aht.d.collected_program_view_layout, "collected_program_view_layout", ahz.a()));
        ae.a(this.f, arrayList, g.d(), new b(aht.d.collected_netradio_view_layout, "collected_netradio_view_layout", ahz.a()));
        this.f.a((List<?>) arrayList);
        this.e.a(aht.e.empty_no_collected);
        this.e.b(1);
        ((ajs) this.d).d.setAdapter(this.f);
        amk.a((BaseRecycleView) ((ajs) this.d).d, o(), true, false, "fragment_list");
        amk.a(((ajs) this.d).d, big.SCROLLBYY);
        ((ajs) this.d).d.setItemViewCacheSize(4);
        ((ajs) this.d).d.setDrawingCacheEnabled(true);
        ((ajs) this.d).d.setDrawingCacheQuality(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        ((ajs) this.d).d.addOnScrollListener(new RecyclerView.m() { // from class: aic.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    y.c(a.a());
                } else if (i == 1 || i == 2) {
                    y.b(a.a());
                }
            }
        });
        ((ajs) this.d).d.addItemDecoration(new aiu(0));
        amk.b((View) ((ajs) this.d).d, false);
        ((ajs) this.d).c.setGotoLoginText(aht.e.goto_login_collect);
        ((ajs) this.d).c.setGotoLoginCallback(new MineLoadingTipsView.a() { // from class: aic.2
            @Override // com.xiaopeng.musicradio.mine.common.view.MineLoadingTipsView.a
            public boolean a() {
                return (aqh.a().d() || aqh.a().e()) ? false : true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public MineCollectPresenter ao_() {
        return new MineCollectPresenter();
    }

    @Override // defpackage.aib
    public void b_(int i) {
        this.e.b(i);
        afd.a(o(), ((ajs) this.d).c);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return amk.a();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    public void onVuiEvent(View view, bio bioVar) {
        if (amk.a(view, bioVar)) {
            return;
        }
        super.onVuiEvent(view, bioVar);
    }
}
