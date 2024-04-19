package com.xiaopeng.musicradio.program.category.view;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.program.b;
import com.xiaopeng.musicradio.program.category.presenter.ProgramCategoryPresenter;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProgramCategoryFragment.java */
@Route(path = "/program/fragment/category")
/* loaded from: classes2.dex */
public class f extends com.xiaopeng.musicradio.commonui.vui.b<Object, ProgramCategoryPresenter> {
    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void f() {
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public String o() {
        return "MainProgramCategory";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return b.e.fragment_category;
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainProgramLocalLeft", "MainLocalTop");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public ProgramCategoryPresenter ao_() {
        return new ProgramCategoryPresenter();
    }
}
