package com.xiaopeng.musicradio.music.player.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.lib.utils.view.ShakeUtil;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.commonui.base.BaseFrameLayout;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.player.presenter.MusicPlayListPresenter;
import com.xiaopeng.musicradio.music.player.view.k;
import com.xiaopeng.musicradio.utils.ak;
import com.xiaopeng.musicradio.utils.bj;
import com.xiaopeng.musicradio.widget.recyclerview.EmptyRecyclerView;
import com.xiaopeng.speech.vui.VuiEngine;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class MusicPlayListLayout extends BaseFrameLayout<f, MusicPlayListPresenter> implements f {
    private EmptyRecyclerView c;
    private k d;
    private int e;
    private int f;
    private int g;
    private Runnable h;

    public MusicPlayListLayout(Context context) {
        super(context);
        this.g = 0;
        this.h = new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.4
            @Override // java.lang.Runnable
            public void run() {
                MusicPlayListLayout.this.i();
            }
        };
    }

    public MusicPlayListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.h = new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.4
            @Override // java.lang.Runnable
            public void run() {
                MusicPlayListLayout.this.i();
            }
        };
    }

    public MusicPlayListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.h = new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.4
            @Override // java.lang.Runnable
            public void run() {
                MusicPlayListLayout.this.i();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: g */
    public MusicPlayListPresenter a() {
        return new MusicPlayListPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = (EmptyRecyclerView) findViewById(b.d.rv_list);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.addItemDecoration(new com.xiaopeng.musicradio.widget.recyclerview.j(12, 0, 12));
        this.d = new k(getContext());
        this.c.setAdapter(this.d);
        this.c.a("PlayerMainMusic", VuiEngine.getInstance(getContext()), true, true);
        this.c.c(1);
        enableViewVuiMode(true);
        this.c.addOnScrollListener(new RecyclerView.m() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (recyclerView == null || recyclerView.getAdapter() == null) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int a = recyclerView.getAdapter().a();
                int r = linearLayoutManager.r();
                int childCount = recyclerView.getChildCount();
                MusicPlayListLayout.this.e = linearLayoutManager.p();
                MusicPlayListLayout.this.f = linearLayoutManager.r();
                if (i == 0 && r == a - 1 && childCount > 0 && ShakeUtil.canExecuteLong(MusicPlayListLayout.this.c.getId(), 1000)) {
                    if (MusicPlayListLayout.this.d.k() || !((MusicPlayListPresenter) MusicPlayListLayout.this.b).d()) {
                        return;
                    }
                    if (NetUtils.isNetworkAvailable(com.xiaopeng.musicradio.a.a)) {
                        ((MusicPlayListPresenter) MusicPlayListLayout.this.b).e();
                        MusicPlayListLayout.this.b(0, true);
                    } else {
                        ak.b(com.xiaopeng.musicradio.a.a, bj.b(-1, null));
                        return;
                    }
                }
                MusicPlayListLayout.this.g = i;
                MusicPlayListLayout.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (((MusicPlayListPresenter) this.b).f()) {
            ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    if (MusicPlayListLayout.this.c == null || MusicPlayListLayout.this.c.getAdapter() == null) {
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) MusicPlayListLayout.this.c.getLayoutManager();
                    MusicPlayListLayout.this.e = linearLayoutManager.p();
                    MusicPlayListLayout.this.f = linearLayoutManager.r();
                    if (MusicPlayListLayout.this.g != 0 || MusicPlayListLayout.this.d.o() == null || MusicPlayListLayout.this.d.o().size() <= 0 || MusicPlayListLayout.this.e < 0 || MusicPlayListLayout.this.f < 0) {
                        return;
                    }
                    if (MusicPlayListLayout.this.f > MusicPlayListLayout.this.d.o().size() - 1) {
                        MusicPlayListLayout musicPlayListLayout = MusicPlayListLayout.this;
                        musicPlayListLayout.f = musicPlayListLayout.d.o().size() - 1;
                    }
                    List<k.d> subList = MusicPlayListLayout.this.d.o().subList(MusicPlayListLayout.this.e, MusicPlayListLayout.this.f + 1);
                    ArrayList arrayList = new ArrayList();
                    for (k.d dVar : subList) {
                        if (dVar.c.getMusicFrom() == 61) {
                            arrayList.add(dVar.c);
                        }
                    }
                    ((bas) com.xiaopeng.musicradio.service.c.a().b(bas.class)).requestMusicInfos(arrayList);
                }
            }, 150L);
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a(new k.c() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.3
            @Override // com.xiaopeng.musicradio.music.player.view.k.c
            public void a(MusicInfo musicInfo) {
                ((MusicPlayListPresenter) MusicPlayListLayout.this.b).a(musicInfo);
            }

            @Override // com.xiaopeng.musicradio.music.player.view.k.c
            public void b(MusicInfo musicInfo) {
                ((MusicPlayListPresenter) MusicPlayListLayout.this.b).b(musicInfo);
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return b.e.layout_music_play_list;
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void a(List<k.d> list, boolean z) {
        int a = this.d.a();
        this.d.a(list);
        this.c.b(200);
        if (z) {
            if (a == 0 || a == list.size()) {
                getHandler().removeCallbacks(this.h);
                getHandler().postDelayed(this.h, 200L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int c = ((MusicPlayListPresenter) this.b).c();
        if (c >= 0) {
            this.c.a(c);
            this.c.b();
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.xui.widget.XFrameLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        postDelayed(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.5
            @Override // java.lang.Runnable
            public void run() {
                MusicPlayListLayout.this.C_();
            }
        }, 1000L);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void C_() {
        this.d.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, boolean z) {
        if (i == 2) {
            if (this.d.k()) {
                ArrayList arrayList = new ArrayList(this.d.n());
                arrayList.remove(arrayList.size() - 1);
                this.d.a(arrayList);
            }
        } else if (this.d.k()) {
        } else {
            k.d dVar = new k.d();
            dVar.f = true;
            ArrayList arrayList2 = new ArrayList(this.d.n());
            arrayList2.add(dVar);
            this.d.a(arrayList2);
        }
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void a(int i, boolean z) {
        b(i, z);
    }

    @Override // com.xiaopeng.musicradio.music.player.view.f
    public void D_() {
        if (this.c.isComputingLayout()) {
            this.c.post(new Runnable() { // from class: com.xiaopeng.musicradio.music.player.view.MusicPlayListLayout.6
                @Override // java.lang.Runnable
                public void run() {
                    if (MusicPlayListLayout.this.d == null || MusicPlayListLayout.this.d.a() <= 0) {
                        return;
                    }
                    MusicPlayListLayout.this.d.a(MusicPlayListLayout.this.e, (MusicPlayListLayout.this.f - MusicPlayListLayout.this.e) + 1);
                }
            });
            return;
        }
        k kVar = this.d;
        if (kVar == null || kVar.a() <= 0) {
            return;
        }
        k kVar2 = this.d;
        int i = this.e;
        kVar2.a(i, (this.f - i) + 1);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            i();
        }
    }
}
