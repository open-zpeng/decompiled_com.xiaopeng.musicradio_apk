package com.xiaopeng.musicradio.search.result.collection.presenter;

import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultCollectionPresenter extends BaseSearchResultListPresenter<ayn> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected int e() {
        return 3;
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter, com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected void a(final String str, final int i) {
        ban.f(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.collection.presenter.SearchResultCollectionPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = (ArrayList) z.a(str, new TypeToken<List<MixSearchResultBean.CollectBean>>() { // from class: com.xiaopeng.musicradio.search.result.collection.presenter.SearchResultCollectionPresenter.1.1
                }.getType());
                SearchResultCollectionPresenter.this.b = 1;
                final MixSearchResultBean.DataBean dataBean = new MixSearchResultBean.DataBean();
                dataBean.setCollectList(arrayList);
                SearchResultCollectionPresenter.this.c = i;
                final MixSearchResultBean.CollectBean collectBean = (arrayList.size() <= 0 || ayi.a().g()) ? null : (MixSearchResultBean.CollectBean) arrayList.get(0);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.collection.presenter.SearchResultCollectionPresenter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SearchResultCollectionPresenter.this.a() != 0) {
                            ((ayn) SearchResultCollectionPresenter.this.a()).a(false, SearchResultCollectionPresenter.this.b, SearchResultCollectionPresenter.this.c);
                            ((ayn) SearchResultCollectionPresenter.this.a()).a(dataBean, SearchResultCollectionPresenter.this.b, SearchResultCollectionPresenter.this.c);
                            u.c(new agh.d(true));
                            if (collectBean != null) {
                                SearchResultCollectionPresenter.this.c(collectBean.getId(), collectBean.getName());
                                SearchResultCollectionPresenter.this.a(collectBean.getId(), collectBean.getName(), collectBean.getLogo());
                                ayi.a().a(true);
                            }
                        }
                    }
                });
            }
        });
    }
}
