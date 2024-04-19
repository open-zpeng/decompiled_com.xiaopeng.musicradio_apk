package com.xiaopeng.musicradio.music.singer.singer.view;

import android.view.View;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.musicradio.bean.SingerMainInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerNomalPresenter;
import com.xiaopeng.musicradio.widget.LoadingTipsView;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import com.xiaopeng.musicradio.widget.recyclerview.j;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.xui.widget.quicksidebar.XQuickSideBarTipsView;
import com.xiaopeng.xui.widget.quicksidebar.XQuickSideBarView;
import com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MsSingerNomalLayout extends BaseFrameLayout<c, MsSingerNomalPresenter> implements c, OnQuickSideBarTouchListener {
    private BaseRecycleView c;
    private LoadingTipsView d;
    private atp e;
    private XQuickSideBarView f;
    private XQuickSideBarTipsView g;
    private ArrayList<String> h;
    private ArrayList<Integer> i;
    private LinearLayoutManager j;
    private MsSingerSelectLayout k;
    private boolean l;
    private int m;
    private String n;
    private int o;
    private int p;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: f */
    public MsSingerNomalPresenter a() {
        return new MsSingerNomalPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.music_layout_singer_nomal;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (BaseRecycleView) findViewById(b.d.nomal_recycleview);
        this.d = (LoadingTipsView) findViewById(b.d.loading_item);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.e = new atp(getContext());
        this.c.setAdapter(this.e);
        this.j = new LinearLayoutManager(getContext());
        this.c.setLayoutManager(this.j);
        this.d.setAutoClickLoadingEnable(false);
        this.c.addItemDecoration(new j(0, 50, 0));
        this.c.initVuiAttr("MusicSinger", VuiEngine.getInstance(getContext()), true, true, true);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerNomalLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((MsSingerNomalPresenter) MsSingerNomalLayout.this.b).a(MsSingerNomalLayout.this.o, MsSingerNomalLayout.this.p);
            }
        });
        this.c.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.singer.singer.view.MsSingerNomalLayout.2
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                LinearLayoutManager linearLayoutManager;
                int p;
                int r;
                int i3;
                SingerMainInfo g;
                super.onScrolled(recyclerView, i, i2);
                if (!MsSingerNomalLayout.this.l || recyclerView == null || recyclerView.getChildAt(0) == null || (r = linearLayoutManager.r()) <= (p = (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()).p()) || (i3 = p + ((r - p) / 2)) >= MsSingerNomalLayout.this.e.a() || (g = MsSingerNomalLayout.this.e.g(i3)) == null) {
                    return;
                }
                MsSingerNomalLayout.this.n = g.getmLetter();
                MsSingerNomalLayout.this.f.setSideBarHighLight(MsSingerNomalLayout.this.n);
            }
        });
    }

    @Override // com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener
    public void onLetterScrolling(String str, int i) {
        this.g.setText(str);
        this.j.b(this.i.get(i).intValue(), 0);
    }

    @Override // com.xiaopeng.xui.widget.quicksidebar.listener.OnQuickSideBarTouchListener
    public void onLetterTouched(boolean z) {
        this.g.display(z);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void r_() {
        this.l = false;
        this.c.setVisibility(8);
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        a(1);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void a(String str) {
        this.l = false;
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        a(2);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.g
    public void b(String str) {
        this.l = false;
        this.c.setVisibility(8);
        this.f.setVisibility(8);
        a(3);
    }

    private void a(int i) {
        this.d.setState(i);
        if (i == 1) {
            this.d.setClickable(false);
        } else {
            this.d.setClickable(true);
        }
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.c
    public void a(ArrayList<Integer> arrayList, ArrayList<SingerMainInfo> arrayList2, ArrayList<String> arrayList3) {
        if (arrayList.size() > 0 && arrayList2.size() > 0 && arrayList3.size() > 0) {
            a(0);
            this.c.setVisibility(0);
            this.h.clear();
            this.h.addAll(arrayList3);
            this.i.clear();
            this.i.addAll(arrayList);
            this.e.a((List) arrayList2, true);
            this.f.setLetters(this.h);
            this.f.setVisibility(0);
            this.l = true;
            this.f.setSideBarHighLight(this.h.get(0));
            return;
        }
        b("");
    }

    public void setSingerSelectLayout(MsSingerSelectLayout msSingerSelectLayout) {
        this.k = msSingerSelectLayout;
    }

    public void setQuickSideBarBig(XQuickSideBarView xQuickSideBarView) {
        this.f = xQuickSideBarView;
        this.f.setOnQuickSideBarTouchListener(this);
    }

    public void setQuickBarTipsView(XQuickSideBarTipsView xQuickSideBarTipsView) {
        this.g = xQuickSideBarTipsView;
        this.g.setAnimationHideTips(true);
    }

    @Override // com.xiaopeng.musicradio.music.singer.singer.view.c
    public void e() {
        this.e.d();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        this.e.d();
        XQuickSideBarView xQuickSideBarView = this.f;
        if (xQuickSideBarView == null || this.g == null) {
            return;
        }
        xQuickSideBarView.setSideBarHighLight(this.n);
        this.g.setVisibility(8);
    }

    public void setType(int i) {
        this.m = i;
    }
}
