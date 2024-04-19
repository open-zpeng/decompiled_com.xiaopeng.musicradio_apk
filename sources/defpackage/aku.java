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
import com.xiaopeng.musicradio.mine.history.main.presenter.MineHistoryPresenter;
import com.xiaopeng.musicradio.mine.widget.b;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.utils.g;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import defpackage.aht;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MineHistoryFragment.java */
@Route(path = "/mine/fragment/history")
/* renamed from: aku  reason: default package */
/* loaded from: classes2.dex */
public class aku extends d<aju, akt, MineHistoryPresenter> implements akt {
    private com.xiaopeng.musicradio.mine.widget.d e;
    private e f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    public void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMineHistory";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajc.a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        Integer c;
        super.d();
        if (aqh.a().d() || (c = aks.a().c()) == null) {
            return;
        }
        c_(c.intValue());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return aht.d.fragment_mine_history;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = new com.xiaopeng.musicradio.mine.widget.d((ViewGroup) k());
    }

    @Override // com.xiaopeng.musicradio.commonui.base.d, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.f = new e();
        ArrayList arrayList = new ArrayList();
        ae.a(this.f, arrayList, g.a(), new b(aht.d.history_music_view_layout, "history_music_view_layout", aks.a()));
        ae.a(this.f, arrayList, g.b(), new b(aht.d.history_album_view_layout, "history_album_view_layout", aks.a()));
        ae.a(this.f, arrayList, g.c(), new b(aht.d.history_program_view_layout, "history_program_view_layout", aks.a()));
        ae.a(this.f, arrayList, g.d(), new b(aht.d.history_netradio_view_layout, "history_netradio_view_layout", aks.a()));
        this.f.a((List<?>) arrayList);
        this.e.a(aht.e.empty_no_history);
        this.e.b(1);
        ((aju) this.d).d.setAdapter(this.f);
        ((aju) this.d).d.setItemViewCacheSize(4);
        ((aju) this.d).d.setDrawingCacheEnabled(true);
        ((aju) this.d).d.setDrawingCacheQuality(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        ((aju) this.d).d.addOnScrollListener(new RecyclerView.m() { // from class: aku.1
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
        ((aju) this.d).d.addItemDecoration(new aiu(0));
        amk.a((BaseRecycleView) ((aju) this.d).d, o(), true, false, "fragment_list");
        amk.a(((aju) this.d).d, big.SCROLLBYY);
        amk.b((View) ((aju) this.d).d, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public MineHistoryPresenter ao_() {
        return new MineHistoryPresenter();
    }

    @Override // defpackage.akt
    public void c_(int i) {
        this.e.b(i);
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
