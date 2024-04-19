package com.xiaopeng.musicradio.mine.history.music.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.common.view.DataListFrameLayout;
import com.xiaopeng.musicradio.mine.history.music.presenter.HistoryMusicPresenter;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aht;
import java.util.List;
/* loaded from: classes.dex */
public class HistoryMusicView extends DataListFrameLayout<c, HistoryMusicPresenter> implements bic, c {
    private com.xiaopeng.musicradio.mine.widget.a c;
    private akw d;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public HistoryMusicView(Context context) {
        this(context, null);
    }

    public HistoryMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HistoryMusicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    public void onResume(i iVar) {
        super.onResume(iVar);
        com.xiaopeng.musicradio.mine.widget.a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public HistoryMusicPresenter a() {
        return new HistoryMusicPresenter(6, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = new com.xiaopeng.musicradio.mine.widget.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        gn<Integer, Integer> b = aml.b(10, this.c.a());
        this.c.a(aht.e.title_history_music, b.a.intValue(), b.b.intValue(), 2);
        this.d = new akw(getContext()) { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicView.1
            @Override // defpackage.aep
            protected int f() {
                return 6;
            }
        };
        this.c.c.setAdapter(this.d);
        Resources resources = getResources();
        this.c.c.addItemDecoration(new ais(this.c.c.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_music_view_item_width), resources.getDimensionPixelSize(aht.a.mine_music_view_item_margin_top)));
        ae.a(this, 8);
        amk.a(this.c.g, b.a.intValue(), "his_ms_play_all");
        amk.a(this.c.f, getContext().getString(aht.e.title_history_music), "title_history_music");
        amk.a((BaseRecycleView) this.c.c, "MainMineHistory", false, true, "ms_list");
        com.xiaopeng.musicradio.datalist.b a = new b.a(getContext()).a((com.xiaopeng.musicradio.datalist.c) this.d).a((DataListPresenter) this.b).a(this.c.c).a(this).a();
        a.a("HISTORY_MUSIC", (Object) true);
        a.a("FROM_MAIN", "FROM_MAIN");
        amo.a((RecyclerView) this.c.c, 6);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a((c.b) new c.b<ViewDataBinding, MusicInfo>() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicView.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicInfo musicInfo, int i) {
                LogUtils.i("HistoryMusicView", "onItemClicked:" + i);
                aml.a(view, akx.a().b(), musicInfo, aml.a((Integer) 10));
            }
        });
        this.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ajc.a(HistoryMusicView.this.c.g.getText().toString());
                amk.a(view, akx.a().b(), aml.a((Integer) 10));
            }
        });
        this.c.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.music.view.HistoryMusicView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ajc.b();
                sp.a().a("/mine/activity/history/music").navigation();
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
        StringBuilder sb = new StringBuilder();
        sb.append("onDataListLoaded:");
        sb.append(list != null ? Integer.valueOf(list.size()) : "null");
        LogUtils.i("HistoryMusicView", sb.toString());
        this.d.a(((HistoryMusicPresenter) this.b).a(list));
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

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void s() {
        gn<Integer, Integer> b = aml.b(10, this.c.a());
        this.c.a(b.a.intValue(), b.b.intValue());
        amk.a(this.c.g, b.a.intValue(), "his_ms_play_all");
        amk.a("MainMineHistory", this.c.g);
    }

    @Override // com.xiaopeng.musicradio.mine.history.music.view.c
    public void a(c.a aVar) {
        this.d.a(aVar);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
        akw akwVar = this.d;
        if (akwVar != null) {
            akwVar.d();
        }
    }
}
