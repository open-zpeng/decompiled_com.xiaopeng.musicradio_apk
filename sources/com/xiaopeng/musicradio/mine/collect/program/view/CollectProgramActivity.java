package com.xiaopeng.musicradio.mine.collect.program.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.datalist.DataListPresenter;
import com.xiaopeng.musicradio.datalist.b;
import com.xiaopeng.musicradio.datalist.c;
import com.xiaopeng.musicradio.mine.collect.program.presenter.CollectedProgramPresenter;
import defpackage.aht;
@Route(path = "/mine/activity/collect/program")
/* loaded from: classes.dex */
public class CollectProgramActivity extends com.xiaopeng.musicradio.mine.common.view.a<ajq, c, CollectedProgramPresenter> implements c {
    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "MineCollectProgram";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.vui.a, com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        amn.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: q */
    public CollectedProgramPresenter e() {
        return new CollectedProgramPresenter(50, null);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a
    protected com.xiaopeng.musicradio.datalist.c r() {
        return new aik(this, 20, this, true) { // from class: com.xiaopeng.musicradio.mine.collect.program.view.CollectProgramActivity.1
            @Override // defpackage.aep
            protected int f() {
                return 28;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return aht.d.activity_program_list;
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        super.T_();
        setTitle(aht.e.title_collected_program);
        ((ajq) this.f).e.a(aht.b.ic_32_setting, aht.e.management, true);
        Resources resources = getResources();
        ((ajq) this.f).d.addItemDecoration(new ais(((ajq) this.f).d.getSpanCount(), resources.getDimensionPixelSize(aht.a.mine_album_view_item_width), resources.getDimensionPixelSize(aht.a.mine_album_view_item_margin_top)));
        new b.a(this).a(this.j).a((DataListPresenter) this.b).a(((ajq) this.f).d).a(true).a(this).a();
        amo.a((RecyclerView) ((ajq) this.f).d, 40);
    }

    @Override // com.xiaopeng.musicradio.mine.common.view.a, com.xiaopeng.musicradio.commonui.base.c, com.xiaopeng.musicradio.commonui.base.a
    public void i() {
        super.i();
        this.j.a((c.b) new c.b<ViewDataBinding, RdAlbumBean>() { // from class: com.xiaopeng.musicradio.mine.collect.program.view.CollectProgramActivity.2
            @Override // com.xiaopeng.musicradio.datalist.c.b
            public void a(View view, ViewDataBinding viewDataBinding, RdAlbumBean rdAlbumBean, int i) {
                LogUtils.i("CollectProgramActivity", "onItemClicked:" + i + ListSignBean.COLLECTID_SUFFIX + CollectProgramActivity.this.j.p());
                if (view.getId() == aht.c.btn_delete || CollectProgramActivity.this.j.p() != 0) {
                    CollectProgramActivity.this.a(rdAlbumBean);
                } else {
                    amn.a(view, rdAlbumBean, "collect");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RdAlbumBean rdAlbumBean) {
        amn.a(rdAlbumBean, false);
        this.j.d(rdAlbumBean);
        w();
    }
}
