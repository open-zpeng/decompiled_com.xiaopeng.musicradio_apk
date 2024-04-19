package com.xiaopeng.musicradio.netradio.concentration.allradio.view;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.netradio.concentration.allradio.presenter.NrAllradioDetailPresenter;
import com.xiaopeng.musicradio.netradio.main.view.NrCategoryOrAreaDetailLayout;
import com.xiaopeng.musicradio.utils.be;
import defpackage.beo;
/* compiled from: NrAllradioDetailFragment.java */
@Route(path = "/netradio/fragment/allradio_detail")
/* loaded from: classes.dex */
public class c extends com.xiaopeng.musicradio.commonui.base.b<Object, NrAllradioDetailPresenter> {
    @Autowired(name = "radio_id")
    protected int d;
    private NrCategoryOrAreaDetailLayout e;

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return beo.d.netradio_fragment_allradio_detail;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        NrCategoryOrAreaDetailLayout nrCategoryOrAreaDetailLayout;
        sp.a().a(this);
        this.e = (NrCategoryOrAreaDetailLayout) a(beo.c.allradio_detail_layout);
        Bundle arguments = getArguments();
        if (arguments == null || (nrCategoryOrAreaDetailLayout = this.e) == null) {
            return;
        }
        nrCategoryOrAreaDetailLayout.setmId(arguments.getInt("radio_id"));
        this.e.a("1", be.a(beo.e.netradio_allradio_title));
        this.e.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public NrAllradioDetailPresenter ao_() {
        return new NrAllradioDetailPresenter();
    }
}
