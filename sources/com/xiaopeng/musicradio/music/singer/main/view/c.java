package com.xiaopeng.musicradio.music.singer.main.view;

import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.framework.carcontrollermodule.controller.McuController;
import com.xiaopeng.musicradio.bean.SingerMainInfo;
import com.xiaopeng.musicradio.bean.xpbean.SingerType;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.main.presenter.SingerMainPresenter;
import com.xiaopeng.musicradio.music.singer.main.view.SingerSelectLayout;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.quicksidebar.XQuickSideBarTipsView;
import com.xiaopeng.xui.widget.quicksidebar.XQuickSideBarView;
import com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MsSingerMainFragment.java */
@Route(path = "/music/fragment/singer")
/* loaded from: classes.dex */
public class c extends com.xiaopeng.musicradio.commonui.vui.b<b, SingerMainPresenter> implements SingerSelectLayout.a, b, OnQuickSideBarTouchListener {
    private SingerSelectLayout d;
    private BaseRecycleView e;
    private LoadingTipsView f;
    private XQuickSideBarView i;
    private XQuickSideBarTipsView j;
    private LinearLayoutManager k;
    private atp l;
    private ArrayList<String> g = new ArrayList<>();
    private ArrayList<Integer> h = new ArrayList<>();
    private String m = McuController.CAR_STAGE_A;
    private boolean n = false;
    private Runnable o = new Runnable() { // from class: com.xiaopeng.musicradio.music.singer.main.view.c.3
        @Override // java.lang.Runnable
        public void run() {
            c.this.l.d();
            if (c.this.i == null || c.this.j == null) {
                return;
            }
            c.this.i.setSideBarHighLight(c.this.m);
            c.this.j.setVisibility(8);
        }
    };

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void a(List<SingerType> list, List<SingerType> list2) {
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void c_(boolean z) {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MusicSinger";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.music_fragment_singer_qq;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        this.d = (SingerSelectLayout) a(b.d.singer_select_layout);
        this.i = (XQuickSideBarView) a(b.d.quicksidebarview_big);
        this.j = (XQuickSideBarTipsView) a(b.d.quickSideBarTipsView);
        this.e = (BaseRecycleView) a(b.d.hot_recycleview);
        this.f = (LoadingTipsView) a(b.d.loading_item);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
        this.l = new atp(getContext());
        this.e.setAdapter(this.l);
        this.k = new LinearLayoutManager(getContext());
        this.e.setLayoutManager(this.k);
        this.f.setAutoClickLoadingEnable(false);
        this.e.addItemDecoration(new j(0, 100, 0));
        this.e.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
        this.i.setOnQuickSideBarTouchListener(this);
        this.j.setAnimationHideTips(true);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.singer.main.view.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.f.getState() == 3 || c.this.f.getState() == 2) {
                    if (!((SingerMainPresenter) c.this.b).g()) {
                        ((SingerMainPresenter) c.this.b).d();
                    } else if (((SingerMainPresenter) c.this.b).i()) {
                    } else {
                        ((SingerMainPresenter) c.this.b).a(((SingerMainPresenter) c.this.b).l(), ((SingerMainPresenter) c.this.b).m());
                    }
                }
            }
        });
        this.d.setStateChange(this);
        this.e.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.singer.main.view.c.2
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                SingerMainInfo g;
                super.onScrolled(recyclerView, i, i2);
                if (!c.this.n || recyclerView == null || c.this.g.size() <= 0 || c.this.l.a() <= 0 || recyclerView.getChildAt(0) == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int p = linearLayoutManager.p();
                int r = linearLayoutManager.r();
                if (p != 0) {
                    if (r == c.this.l.a() - 1) {
                        SingerMainInfo g2 = c.this.l.g(r);
                        if (g2 != null) {
                            c.this.m = g2.getmLetter();
                            c.this.i.setSideBarHighLight(c.this.m);
                            return;
                        }
                        return;
                    } else if (r <= p || p >= c.this.l.a() || (g = c.this.l.g(p)) == null) {
                        return;
                    } else {
                        c.this.m = g.getmLetter();
                        c.this.i.setSideBarHighLight(c.this.m);
                        return;
                    }
                }
                c cVar = c.this;
                cVar.m = (String) cVar.g.get(0);
                c.this.i.setSideBarHighLight(c.this.m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: r */
    public SingerMainPresenter ao_() {
        return new SingerMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainMusicLocalLeft", "MainLocalTop");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.i("MsSingerMainFragment", "onDestroy");
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void a() {
        Log.i("MsSingerMainFragment", "showLoadingView: ");
        this.i.setVisibility(8);
        this.e.setVisibility(8);
        b(1);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void a(String str) {
        Log.i("MsSingerMainFragment", "showErrorView: ");
        this.i.setVisibility(8);
        this.e.setVisibility(8);
        b(2);
    }

    public void b(String str) {
        Log.i("MsSingerMainFragment", "showNoDataView: ");
        this.i.setVisibility(8);
        this.e.setVisibility(8);
        b(3);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void a(List<SingerType> list) {
        Log.i("MsSingerMainFragment", "setTypeDatas: ");
        this.d.setVisibility(0);
        this.d.setTypeData(list);
        VuiEngine.getInstance(getContext()).updateScene("MusicSinger", this.d);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void b(List<SingerType> list) {
        Log.i("MsSingerMainFragment", "setAreaDatas: ");
        this.d.setVisibility(0);
        this.d.setAreaData(list);
    }

    @Override // com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener
    public void onLetterScrolling(String str, int i) {
        Log.i("MsSingerMainFragment", "onLetterScrolling: ");
        this.j.setText(str);
        this.k.b(this.h.get(i).intValue(), 0);
    }

    @Override // com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener
    public void onLetterTouched(boolean z) {
        this.j.display(z);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void a(ArrayList<Integer> arrayList, ArrayList<SingerMainInfo> arrayList2, ArrayList<String> arrayList3) {
        Log.i("MsSingerMainFragment", "setData: ");
        if (arrayList.size() > 0 && arrayList2.size() > 0 && arrayList3.size() > 0) {
            b(0);
            this.e.setVisibility(0);
            this.g.clear();
            this.g.addAll(arrayList3);
            this.h.clear();
            this.h.addAll(arrayList);
            this.l.a((List) arrayList2, true);
            this.i.setLetters(this.g);
            this.i.setVisibility(0);
            this.n = true;
            this.i.setSideBarHighLight(this.g.get(0));
            this.k.b(0, 0);
            return;
        }
        b("");
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.SingerSelectLayout.a
    public void c(String str) {
        Log.i("MsSingerMainFragment", "selectType: ");
        if (str.equals(((SingerMainPresenter) this.b).m())) {
            return;
        }
        ((SingerMainPresenter) this.b).c(str);
        ((SingerMainPresenter) this.b).a(((SingerMainPresenter) this.b).l(), str);
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.SingerSelectLayout.a
    public void d(String str) {
        Log.i("MsSingerMainFragment", "selectArea: ");
        if (str.equals(((SingerMainPresenter) this.b).l())) {
            return;
        }
        ((SingerMainPresenter) this.b).b(str);
        ((SingerMainPresenter) this.b).a(str, ((SingerMainPresenter) this.b).m());
    }

    private void b(int i) {
        Log.i("MsSingerMainFragment", "showLoadingTip: ");
        this.f.setState(i);
        if (i == 1) {
            this.f.setClickable(false);
        } else {
            this.f.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.music.singer.main.view.b
    public void J_() {
        this.l.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        k().removeCallbacks(this.o);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Log.i("MsSingerMainFragment", "onResume: ");
        if (k() != null) {
            k().removeCallbacks(this.o);
            k().postDelayed(this.o, 300L);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        XQuickSideBarView xQuickSideBarView = this.i;
        if (xQuickSideBarView != null) {
            xQuickSideBarView.setSideBarHighLight(this.m);
        }
    }
}
