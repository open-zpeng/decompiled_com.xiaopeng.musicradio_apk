package com.xiaopeng.musicradio.mine.collect.music.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.MusicListPlayReq;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.music.presenter.CollectedMusicPresenter;
import com.xiaopeng.musicradio.mine.common.view.DataListFrameLayout;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aht;
import java.util.List;
/* loaded from: classes.dex */
public class CollectedMusicView extends DataListFrameLayout<c, CollectedMusicPresenter> implements bic, c {
    private com.xiaopeng.musicradio.mine.widget.a c;
    private aif d;
    private int e;
    private int f;

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(Object obj) {
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void b(Object obj) {
    }

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void t() {
    }

    public CollectedMusicView(Context context) {
        this(context, null);
    }

    public CollectedMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollectedMusicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 1;
        this.f = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public CollectedMusicPresenter a() {
        return new CollectedMusicPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        com.xiaopeng.musicradio.mine.widget.a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = new com.xiaopeng.musicradio.mine.widget.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        gn<Integer, Integer> b = aml.b(50, this.c.a());
        this.c.a(aht.e.title_collected_music, b.a.intValue(), b.b.intValue(), 2);
        this.d = new aif(getContext()) { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectedMusicView.1
            @Override // defpackage.aep
            protected int f() {
                return 6;
            }
        };
        this.c.c.setAdapter(this.d);
        this.c.c.setItemViewCacheSize(6);
        Resources resources = getResources();
        this.c.c.addItemDecoration(new ais(this.c.c.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_music_view_item_width), resources.getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        ae.a(this, 8);
        amk.a(this.c.f, getContext().getString(aht.e.title_collected_music), "title_collected_music");
        amk.a(this.c.g, b.a.intValue(), "clt_ms_play_all");
        amk.a((BaseRecycleView) this.c.c, "MainMineCollect", false, true, "ms_list");
        new b.a(getContext()).a((com.xiaopeng.musicradio.datalist.c) this.d).a((DataListPresenter) this.b).a(this.c.c).a(this).a().a("FROM_MAIN", "FROM_MAIN");
        amo.a((RecyclerView) this.c.c, 6);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectedMusicView.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("CollectedMusicView", "onItemClicked:" + i);
                if (view.getId() == aht.c.iv_icon) {
                    ((CollectedMusicPresenter) CollectedMusicView.this.b).h();
                }
                aml.a(view, new MusicListPlayReq(aig.a().b(), musicInfo, CollectedMusicView.this.e, 50, CollectedMusicView.this.f, aml.a((Integer) 50)));
            }
        });
        this.c.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectedMusicView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                aja.b();
                sp.a().a("/mine/activity/collect/music").navigation();
            }
        });
        this.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.music.view.CollectedMusicView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                aja.a(CollectedMusicView.this.c.g.getText().toString());
                List<MusicInfo> b = aig.a().b();
                if (b.isEmpty()) {
                    return;
                }
                aml.a(new MusicListPlayReq(b, null, CollectedMusicView.this.e, 50, CollectedMusicView.this.f, aml.a((Integer) 50)));
            }
        });
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public int getContentViewId() {
        return aht.d.mine_category_view;
    }

    @Override // com.xiaopeng.musicradio.datalist.m
    public boolean i_() {
        return ale.a().c();
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(List list, int i) {
        this.d.a(list);
        if (this.d.a() <= 0) {
            ae.a(this, 8);
        } else {
            ae.a(this, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        this.d.a(z, aVar);
        s();
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void s() {
        gn<Integer, Integer> b = aml.b(50, this.c.a());
        this.c.a(b.a.intValue(), b.b.intValue());
        amk.a(this.c.g, b.a.intValue(), "clt_ms_play_all");
        amk.a("MainMineCollect", this.c.g);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
        aif aifVar = this.d;
        if (aifVar != null) {
            aifVar.d();
        }
    }

    @Override // com.xiaopeng.musicradio.mine.collect.music.view.c
    public void a(int i, int i2) {
        this.e = i;
        this.f = i2;
    }
}
