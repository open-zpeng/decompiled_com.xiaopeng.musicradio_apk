package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.main.presenter.MsConcentrationPresenter;
import com.xiaopeng.musicradio.utils.bm;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.a;
import com.xiaopeng.musicradio.widget.recyclerview.e;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MsConcentrationFragment.java */
@Route(path = "/music/fragment/concentration")
/* renamed from: aru  reason: default package */
/* loaded from: classes2.dex */
public class aru extends b<art, MsConcentrationPresenter> implements art {
    private e d;
    private BaseRecycleView e;
    private List<Object> f;
    private GridLayoutManager g;
    private LoadingTipsView o;
    private int h = 5;
    private int i = 15;
    private int j = 15;
    private int k = 24;
    private int l = 6;
    private int m = 12;
    private int n = 6;
    private boolean p = false;
    private int q = 2;
    private int r = 14;
    private int s = 15;
    private int t = 17;
    private int u = 26;
    private int v = 31;
    private int w = 8;
    private int x = -1;

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainMusicConcentration";
    }

    public void s() {
    }

    @Override // defpackage.art
    public void w_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.music_fragment_concentration;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.e = (BaseRecycleView) a(b.d.music_rv_list);
        this.o = (LoadingTipsView) a(b.d.music_loading_view);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        Log.i("MsConcentrationFragment", "setView: ========");
        this.o.setAutoClickLoadingEnable(false);
        this.g = new GridLayoutManager(getContext(), this.k);
        this.g.a(new GridLayoutManager.c() { // from class: aru.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int a(int i) {
                Object obj = aru.this.f.get(i);
                if (obj instanceof ash) {
                    return aru.this.l;
                }
                if (obj instanceof asa) {
                    return aru.this.m;
                }
                if (obj instanceof aso) {
                    return aru.this.k;
                }
                if (obj instanceof arx) {
                    return aru.this.l;
                }
                return obj instanceof ask ? aru.this.n : aru.this.k;
            }
        });
        this.g.f(this.k);
        this.e.addItemDecoration(new a(this.k, false, 58));
        this.e.setHasFixedSize(true);
        this.e.setLayoutManager(this.g);
        this.f = new ArrayList();
        this.d = new e();
        u();
        t();
        v();
    }

    private void t() {
        this.d.a(ars.class, new aro());
        this.d.a(arr.class, new asg(this));
        this.d.a(ash.class, new asf());
        this.d.a(asp.class, new asn());
        this.d.a(aso.class, new asm());
        this.d.a(asl.class, new asj());
        this.d.a(ask.class, new asi());
        this.d.a(asb.class, new arz());
        this.d.a(asa.class, new ary());
        this.d.a(arq.class, new arw(this));
        this.d.a(arx.class, new arv());
        this.e.setItemViewCacheSize(50);
    }

    private void u() {
        this.e.addItemDecoration(new j(0, 0, 0));
        this.e.getRecycledViewPool().a(0, 1);
        this.e.getRecycledViewPool().a(1, 1);
        this.e.getRecycledViewPool().a(2, 12);
        this.e.getRecycledViewPool().a(3, 1);
        this.e.getRecycledViewPool().a(4, 1);
        this.e.getRecycledViewPool().a(7, 1);
        this.e.getRecycledViewPool().a(8, 4);
        this.e.getRecycledViewPool().a(5, 1);
        this.e.getRecycledViewPool().a(6, 8);
        this.e.getRecycledViewPool().a(9, 1);
        this.e.getRecycledViewPool().a(10, 12);
    }

    private void v() {
        this.e.initVuiAttr("MainMusicConcentration", VuiEngine.getInstance(getContext()), true, false, true);
        this.f.add(new ars());
        this.f.add(new arr());
        for (int i = 0; i < 12; i++) {
            this.f.add(new ash(null));
        }
        this.f.add(new asp());
        for (int i2 = 0; i2 < 1; i2++) {
            this.f.add(new aso(0, "", null));
        }
        this.f.add(new asl());
        for (int i3 = 0; i3 < 8; i3++) {
            this.f.add(new ask(null));
        }
        this.f.add(new asb());
        for (int i4 = 0; i4 < 4; i4++) {
            this.f.add(new asa(null));
        }
        this.f.add(new arq());
        for (int i5 = 0; i5 < 12; i5++) {
            this.f.add(new arx(null));
        }
        ((q) this.e.getItemAnimator()).a(false);
        this.e.setHasFixedSize(true);
        this.d.a(this.f);
        this.e.setAdapter(this.d);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.o.setOnClickListener(new View.OnClickListener() { // from class: aru.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (aru.this.o.getState() == 2) {
                    ((MsConcentrationPresenter) aru.this.b).c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public MsConcentrationPresenter ao_() {
        return new MsConcentrationPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainMusicLocalLeft", "MainLocalTop");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected com.xiaopeng.musicradio.commonui.base.e b() {
        return bm.a().b();
    }

    @Override // defpackage.art
    public void e_(int i) {
        Log.i("MsConcentrationFragment", "selectElement: ======= " + i);
        if (!this.p) {
            this.x = i;
        } else if (i == 39) {
            this.g.b(i, 0);
        } else {
            this.e.c(i);
        }
    }

    @Override // defpackage.art
    public void a(String str) {
        this.e.setVisibility(8);
        this.w = 8;
        b(2);
        ((MsConcentrationPresenter) this.b).a(false);
        this.p = false;
    }

    @Override // defpackage.art
    public void a() {
        this.e.setVisibility(4);
        this.w = 8;
        b(1);
    }

    @Override // defpackage.art
    public void v_() {
        ((MsConcentrationPresenter) this.b).a(true);
        if (this.w != 0) {
            this.e.setVisibility(0);
            this.w = 0;
            this.p = true;
            int i = this.x;
            if (i >= 0) {
                this.e.c(i);
                this.x = -1;
            }
        }
        b(0);
    }

    @Override // defpackage.art
    public void a(List<MusicRadioItem> list) {
        e(list);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.e.isComputingLayout()) {
            this.e.postDelayed(new Runnable() { // from class: aru.3
                @Override // java.lang.Runnable
                public void run() {
                    aru.this.w();
                }
            }, 500L);
        } else {
            VuiEngine.getInstance(getContext()).updateScene("MainMusicConcentration", this.e);
        }
    }

    @Override // defpackage.art
    public void a(int i, String str, List<MusicRadioItem> list) {
        b(i, str, list);
    }

    @Override // defpackage.art
    public void b(List<MusicRadioItem> list) {
        f(list);
    }

    @Override // defpackage.art
    public void c(List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> list) {
        g(list);
    }

    @Override // defpackage.art
    public void d(List<MusicRadioItem> list) {
        h(list);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.i("MsConcentrationFragment", "onCreateView: ============");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.i("MsConcentrationFragment", "onResume: ===============");
        if (this.o.getState() == 2) {
            this.o.performClick();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.i("MsConcentrationFragment", "onPause: ================");
    }

    public void e(List<MusicRadioItem> list) {
        for (int i = 0; i < list.size(); i++) {
            ash ashVar = (ash) this.f.get(this.q + i);
            ashVar.a(list.get(i));
            ashVar.a(i);
        }
        this.d.a(this.q, list.size());
    }

    public void b(int i, String str, List<MusicRadioItem> list) {
        aso asoVar = (aso) this.f.get(this.s);
        asoVar.a(i);
        asoVar.a(str);
        asoVar.a(list);
        this.d.a(this.s, list.size());
        asp aspVar = (asp) this.f.get(this.r);
        aspVar.a(i);
        aspVar.a(str);
        this.d.c(this.r);
    }

    public void f(List<MusicRadioItem> list) {
        for (int i = 0; i < list.size(); i++) {
            asa asaVar = (asa) this.f.get(this.u + i);
            asaVar.a(list.get(i));
            asaVar.a(i);
        }
        this.d.a(this.u, list.size());
    }

    public void g(List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> list) {
        for (int i = 0; i < list.size(); i++) {
            ask askVar = (ask) this.f.get(this.t + i);
            askVar.a(list.get(i));
            askVar.a(i);
        }
        this.d.a(this.t, list.size());
    }

    public void h(List<MusicRadioItem> list) {
        for (int i = 0; i < list.size(); i++) {
            arx arxVar = (arx) this.f.get(this.v + i);
            arxVar.a(list.get(i));
            arxVar.a(i);
        }
        this.d.a(this.v, list.size());
    }

    private void b(int i) {
        this.o.setState(i);
        if (i == 1) {
            this.o.setClickable(false);
        } else {
            this.o.setClickable(true);
        }
    }
}
