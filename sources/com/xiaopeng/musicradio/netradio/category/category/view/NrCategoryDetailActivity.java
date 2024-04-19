package com.xiaopeng.musicradio.netradio.category.category.view;

import android.content.res.Configuration;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.netradio.category.category.presenter.NrCategoryDetailActPresenter;
import com.xiaopeng.musicradio.netradio.main.view.NrCategoryOrAreaDetailLayout;
import com.xiaopeng.musicradio.widget.DialogTopLayout;
import defpackage.beo;
@Route(path = "/xpnetradio/activity/category_detail")
/* loaded from: classes.dex */
public class NrCategoryDetailActivity extends com.xiaopeng.musicradio.commonui.vui.a<Object, NrCategoryDetailActPresenter> {
    @Autowired(name = "radio_id")
    protected int f;
    @Autowired(name = "radio_title")
    protected String g;
    private DialogTopLayout h;
    private NrCategoryOrAreaDetailLayout i;

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void i() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.a
    public String m() {
        return "RadioCategoryDetail";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    /* renamed from: a */
    public NrCategoryDetailActPresenter e() {
        return new NrCategoryDetailActPresenter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.a
    public int f() {
        return beo.d.netradio_activity_category_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void g() {
        this.h = (DialogTopLayout) findViewById(beo.c.category_detail_top_title);
        this.i = (NrCategoryOrAreaDetailLayout) findViewById(beo.c.category_detail_layout);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a
    public void T_() {
        sp.a().a(this);
        this.h.setTitle(this.g);
        this.i.setmId(this.f);
        if (this.f == 0) {
            this.i.a("1", this.g);
        } else {
            this.i.a("2", this.g);
        }
        this.i.g();
        this.h.setCloseListener(new View.OnClickListener() { // from class: com.xiaopeng.musicradio.netradio.category.category.view.NrCategoryDetailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NrCategoryDetailActivity.this.finish();
            }
        });
        this.h.a(false);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.a, androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        baj.a().b();
    }
}
