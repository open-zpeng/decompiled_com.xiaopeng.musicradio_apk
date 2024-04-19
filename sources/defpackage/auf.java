package defpackage;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.commonui.vui.b;
import com.xiaopeng.musicradio.netradio.category.main.presenter.NrCategoryMainPresenter;
import defpackage.beo;
import java.util.Arrays;
import java.util.List;
/* compiled from: NrCategoryMainFragment.java */
@Route(path = "/netradio/fragment/category")
/* renamed from: auf  reason: default package */
/* loaded from: classes2.dex */
public class auf extends b<Object, NrCategoryMainPresenter> {
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
        return "MainNetRadioCategory";
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected int e() {
        return beo.d.netradio_fragment_category;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: a */
    public NrCategoryMainPresenter ao_() {
        return new NrCategoryMainPresenter();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b
    public List<String> p() {
        return Arrays.asList("MainNetRadioLocalLeft", "MainLocalTop");
    }
}
