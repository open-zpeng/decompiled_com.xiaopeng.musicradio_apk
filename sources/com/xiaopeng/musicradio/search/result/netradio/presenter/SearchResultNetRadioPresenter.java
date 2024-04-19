package com.xiaopeng.musicradio.search.result.netradio.presenter;

import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultNetRadioPresenter extends BaseSearchResultListPresenter<azc> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected int e() {
        return 6;
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter, com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected void a(final String str, final int i) {
        ban.f(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.netradio.presenter.SearchResultNetRadioPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = (ArrayList) z.a(str, new TypeToken<List<NetRadioInfo>>() { // from class: com.xiaopeng.musicradio.search.result.netradio.presenter.SearchResultNetRadioPresenter.1.1
                }.getType());
                SearchResultNetRadioPresenter.this.b = 1;
                final MixSearchResultBean.DataBean dataBean = new MixSearchResultBean.DataBean();
                dataBean.setRadioList(arrayList);
                SearchResultNetRadioPresenter.this.c = i;
                final NetRadioInfo netRadioInfo = (arrayList.size() <= 0 || ayi.a().g()) ? null : (NetRadioInfo) arrayList.get(0);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.netradio.presenter.SearchResultNetRadioPresenter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SearchResultNetRadioPresenter.this.a() != 0) {
                            ((azc) SearchResultNetRadioPresenter.this.a()).a(false, SearchResultNetRadioPresenter.this.b, SearchResultNetRadioPresenter.this.c);
                            ((azc) SearchResultNetRadioPresenter.this.a()).a(dataBean, SearchResultNetRadioPresenter.this.b, SearchResultNetRadioPresenter.this.c);
                            u.c(new agh.d(true));
                            if (netRadioInfo != null) {
                                SearchResultNetRadioPresenter.this.a(netRadioInfo);
                                ayi.a().a(true);
                            }
                        }
                    }
                });
            }
        });
    }
}
