package com.xiaopeng.musicradio.mine.collect.netradio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.netradio.presenter.CollectedNetradioPresenter;
import com.xiaopeng.musicradio.mine.common.view.DataListFrameLayout;
import com.xiaopeng.musicradio.utils.ae;
import com.xiaopeng.musicradio.widget.recyclerview.BaseRecycleView;
import defpackage.aht;
import java.util.List;
/* loaded from: classes.dex */
public class CollectedNetradioView extends DataListFrameLayout<c, CollectedNetradioPresenter> implements bic, c {
    private com.xiaopeng.musicradio.mine.widget.a c;
    private aii d;

    @Override // defpackage.bic
    public bin onBuildVuiElement(String str, bia biaVar) {
        return null;
    }

    @Override // defpackage.bic
    public boolean onVuiElementEvent(View view, bio bioVar) {
        return false;
    }

    public CollectedNetradioView(Context context) {
        this(context, null);
    }

    public CollectedNetradioView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollectedNetradioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    /* renamed from: e */
    public CollectedNetradioPresenter a() {
        return new CollectedNetradioPresenter(4, "FROM_MAIN");
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void b() {
        this.c = new com.xiaopeng.musicradio.mine.widget.a(this);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void c() {
        this.c.a(aht.e.title_collected_netradio, 0, 1);
        this.d = new aii(getContext());
        this.c.c.setAdapter(this.d);
        this.c.c.addItemDecoration(new ait(getResources().getDimensionPixelSize(aht.a.mine_netradio_view_item_margin_left)));
        amk.a(this.c.f, getContext().getString(aht.e.title_collected_netradio), "title_collected_netradio");
        amk.a((BaseRecycleView) this.c.c, "MainMineCollect", false, true, "nr_list");
        new b.a(getContext()).a((com.xiaopeng.musicradio.datalist.c) this.d).a((DataListPresenter) this.b).a(this.c.c).a(this).a().a("FROM_MAIN", "FROM_MAIN");
        amo.a((RecyclerView) this.c.c, 5);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.BaseFrameLayout
    protected void d() {
        this.d.a((c.b) new c.b<ViewDataBinding, NetRadioInfo>() { // from class: com.xiaopeng.musicradio.mine.collect.netradio.view.CollectedNetradioView.1
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, NetRadioInfo netRadioInfo, int i) {
                LogUtils.i("CollectedNetradioView", "onItemClicked:" + i);
                amm.a(netRadioInfo);
            }
        });
        this.c.a(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.mine.collect.netradio.view.CollectedNetradioView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                aja.e();
                sp.a().a("/mine/activity/collect/netradio").navigation();
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
        aii aiiVar = this.d;
        if (aiiVar != null) {
            aiiVar.d();
        }
    }
}
