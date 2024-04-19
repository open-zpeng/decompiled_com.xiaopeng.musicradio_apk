package com.xiaopeng.musicradio.netradio.main.view;

import android.annotation.SuppressLint;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.widget.NoScrollViewPager;
import com.xiaopeng.musicradio.netradio.main.presenter.NrMainPresenter;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bn;
import com.xiaopeng.musicradio.widget.MusicRecyclerTabLayout;
import com.xiaopeng.xui.vui.floatinglayer.VuiFloatingLayerManager;
import defpackage.aeo;
import defpackage.beo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: NrMainFragment.java */
@Route(path = "/netradio/fragment/main")
/* loaded from: classes2.dex */
public class g extends com.xiaopeng.musicradio.commonui.vui.b<c, NrMainPresenter> implements c {
    private MusicRecyclerTabLayout d;
    private NoScrollViewPager e;
    private aeo f;
    private View g;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public boolean n() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainNetRadioLocalLeft";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return beo.d.netradio_fragment_main;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (MusicRecyclerTabLayout) a(beo.c.tab_netradio_main);
        this.e = (NoScrollViewPager) a(beo.c.netradio_viewpager);
        this.g = this.d;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        aw.a((Object) this.e, "mOffscreenPageLimit", (Object) 0);
        this.f = new aeo(getChildFragmentManager());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new aeo.a("/netradio/fragment/concentration", be.a(beo.e.netradio_selection)));
        arrayList.add(new aeo.a("/netradio/fragment/category", be.a(beo.e.netradio_category)));
        this.f.a((List<aeo.a>) arrayList);
        this.e.setAdapter(this.f);
        this.d.setUpWithViewPager(this.e);
        this.d.setVuiLayoutLoadable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b
    public void d() {
        super.d();
        this.f.a(getChildFragmentManager());
        NoScrollViewPager noScrollViewPager = this.e;
        noScrollViewPager.a(noScrollViewPager.getCurrentItem(), false, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected com.xiaopeng.musicradio.commonui.base.e b() {
        return bn.a().b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public NrMainPresenter ao_() {
        return new NrMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    public View k() {
        return this.g;
    }

    @Override // com.xiaopeng.musicradio.netradio.main.view.c
    public void g_(int i) {
        this.d.a(i);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    @SuppressLint({"WrongConstant"})
    public void onVuiEvent(View view, bio bioVar) {
        if (view == null) {
            return;
        }
        VuiFloatingLayerManager.show(view, 0, 0, 0, false);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, defpackage.bie
    @SuppressLint({"WrongConstant"})
    public boolean onInterceptVuiEvent(View view, bio bioVar) {
        if (view != null) {
            VuiFloatingLayerManager.show(view, 0, 0, 0, false);
        }
        return false;
    }
}
