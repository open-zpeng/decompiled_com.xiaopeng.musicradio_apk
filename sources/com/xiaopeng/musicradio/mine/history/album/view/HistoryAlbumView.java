package com.xiaopeng.musicradio.mine.history.album.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.common.view.DataListFrameLayout;
import com.xiaopeng.musicradio.mine.history.album.presenter.HistoryAlbumPresenter;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aht;
import java.util.List;
/* loaded from: classes.dex */
public class HistoryAlbumView extends DataListFrameLayout<c, HistoryAlbumPresenter> implements bic, c {
    private com.xiaopeng.musicradio.mine.widget.a c;
    private ako d;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public HistoryAlbumView(Context context) {
        this(context, null);
    }

    public HistoryAlbumView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HistoryAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public HistoryAlbumPresenter a() {
        return new HistoryAlbumPresenter(4, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = new com.xiaopeng.musicradio.mine.widget.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.a(aht.e.title_history_album, 0, 1);
        this.d = new ako(getContext());
        this.c.c.setAdapter(this.d);
        this.c.c.addItemDecoration(new ait(getResources().getDimensionPixelSize(aht.a.mine_album_view_item_margin_left)));
        ae.a(this, 8);
        amk.a(this.c.f, getContext().getString(aht.e.title_history_album), "title_history_album");
        amk.a((BaseRecycleView) this.c.c, "MainMineHistory", false, true, "alb_list");
        new b.a(getContext()).a((com.xiaopeng.musicradio.datalist.c) this.d).a((DataListPresenter) this.b).a(this.c.c).a(this).a().a("FROM_MAIN", "FROM_MAIN");
        amo.a((RecyclerView) this.c.c, 5);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a((c.b) new c.b<ViewDataBinding, MusicRadioItem>() { // from class: com.xiaopeng.musicradio.mine.history.album.view.HistoryAlbumView.1
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, MusicRadioItem musicRadioItem, int i) {
                LogUtils.i("HistoryAlbumView", "onItemClicked:" + i);
                aml.a(view, musicRadioItem, "history");
            }
        });
        this.c.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.history.album.view.HistoryAlbumView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ajc.c();
                sp.a().a("/mine/activity/history/album").navigation();
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
        if (this.d.a() <= 0) {
            ae.a(this, 8);
        } else {
            ae.a(this, 0);
        }
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void a(boolean z, c.a aVar) {
        this.d.a(z, aVar);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.b
    public void j_() {
        ako akoVar = this.d;
        if (akoVar != null) {
            akoVar.d();
        }
    }
}
