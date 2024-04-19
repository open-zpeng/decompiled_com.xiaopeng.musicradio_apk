package com.xiaopeng.musicradio.music.concentration.recommend.view;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.music.concentration.recommend.presenter.MsRmCategoryDetailPresenter;
/* compiled from: MsRmCategoryDetailFragment.java */
@Route(path = "/music/activity/rm_category_detail")
/* loaded from: classes.dex */
public class f extends com.xiaopeng.musicradio.commonui.base.b<Object, MsRmCategoryDetailPresenter> {
    private MsRmCategoryDetailLayout d;

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
        return b.e.music_fragment_rm_category;
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
        MsRmCategoryDetailLayout msRmCategoryDetailLayout;
        this.d = (MsRmCategoryDetailLayout) a(b.d.rm_category_layout);
        Bundle arguments = getArguments();
        if (arguments == null || (msRmCategoryDetailLayout = this.d) == null) {
            return;
        }
        msRmCategoryDetailLayout.setmId(arguments.getString("rm_category_id"));
        this.d.setmType(arguments.getInt("rm_category_type"));
        this.d.setmName(arguments.getString("rm_category_name"));
        this.d.setmSort(arguments.getInt("rm_category_sort"));
        this.d.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public MsRmCategoryDetailPresenter ao_() {
        return new MsRmCategoryDetailPresenter();
    }
}
