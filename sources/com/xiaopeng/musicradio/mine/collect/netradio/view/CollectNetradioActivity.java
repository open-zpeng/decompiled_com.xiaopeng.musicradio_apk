package com.xiaopeng.musicradio.mine.collect.netradio.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.netradio.presenter.CollectedNetradioPresenter;
import defpackage.aht;
@Route(path = "/mine/activity/collect/netradio")
/* loaded from: classes.dex */
public class CollectNetradioActivity extends com.xiaopeng.musicradio.mine.common.view.a<ajm, c, CollectedNetradioPresenter> implements c {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineCollectNetRadio";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        amm.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public CollectedNetradioPresenter e() {
        return new CollectedNetradioPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new aii(this, 20, this, true) { // from class: com.xiaopeng.musicradio.mine.collect.netradio.view.CollectNetradioActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 28;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_netradio_list;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        setTitle(aht.e.title_collected_netradio);
        ((ajm) this.f).e.a(aht.b.ic_32_setting, aht.e.management, true);
        Resources resources = getResources();
        ((ajm) this.f).d.addItemDecoration(new ais(((ajm) this.f).d.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_netradio_view_item_width), resources.getDimensionPixelSize(aht.a.mine_netradio_view_item_margin_top)));
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((ajm) this.f).d).a(true).a(this).a();
        amo.a((RecyclerView) ((ajm) this.f).d, 40);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, NetRadioInfo>() { // from class: com.xiaopeng.musicradio.mine.collect.netradio.view.CollectNetradioActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, NetRadioInfo netRadioInfo, int i) {
                LogUtils.i("CollectNetradioActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + CollectNetradioActivity.this.j.p());
                if (view.getId() == aht.c.btn_delete || CollectNetradioActivity.this.j.p() != 0) {
                    CollectNetradioActivity.this.a(netRadioInfo);
                } else {
                    amm.a(netRadioInfo);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetRadioInfo netRadioInfo) {
        amm.a(netRadioInfo, false);
        this.j.d(netRadioInfo);
        w();
    }
}
