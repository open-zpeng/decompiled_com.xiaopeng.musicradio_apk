package defpackage;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.result.singer.presenter.SearchResultSingerPresenter;
/* compiled from: SearchResultSingerFragment.java */
@Route(path = "/search/fragment/result/singer")
/* renamed from: azj  reason: default package */
/* loaded from: classes2.dex */
public class azj extends azt<Object, SearchResultSingerPresenter> {
    @Override // com.xiaopeng.musicradio.commonui.base.b
    protected void E_() {
    }

    @Override // defpackage.azt
    protected void a() {
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
    }

    @Override // defpackage.azt, com.xiaopeng.musicradio.commonui.base.b
    protected void g() {
    }

    @Override // defpackage.azt
    protected int r() {
        return 0;
    }

    @Override // defpackage.azt
    protected axy s() {
        return null;
    }

    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.commonui.base.b
    /* renamed from: w */
    public SearchResultSingerPresenter ao_() {
        return new SearchResultSingerPresenter();
    }
}
