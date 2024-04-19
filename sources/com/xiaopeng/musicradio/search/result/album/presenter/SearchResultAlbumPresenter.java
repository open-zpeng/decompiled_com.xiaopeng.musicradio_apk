package com.xiaopeng.musicradio.search.result.album.presenter;

import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultAlbumPresenter extends BaseSearchResultListPresenter<ayk> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected int e() {
        return 2;
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter, com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected void a(final String str, final int i) {
        ban.f(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.album.presenter.SearchResultAlbumPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = (ArrayList) z.a(str, new TypeToken<List<MusicAlbumBean>>() { // from class: com.xiaopeng.musicradio.search.result.album.presenter.SearchResultAlbumPresenter.1.1
                }.getType());
                SearchResultAlbumPresenter.this.b = 1;
                final MixSearchResultBean.DataBean dataBean = new MixSearchResultBean.DataBean();
                dataBean.setAlbumList(arrayList);
                SearchResultAlbumPresenter.this.c = i;
                final MusicAlbumBean musicAlbumBean = (arrayList.size() <= 0 || ayi.a().g()) ? null : (MusicAlbumBean) arrayList.get(0);
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.album.presenter.SearchResultAlbumPresenter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SearchResultAlbumPresenter.this.a() != 0) {
                            ((ayk) SearchResultAlbumPresenter.this.a()).a(false, SearchResultAlbumPresenter.this.b, SearchResultAlbumPresenter.this.c);
                            ((ayk) SearchResultAlbumPresenter.this.a()).a(dataBean, SearchResultAlbumPresenter.this.b, SearchResultAlbumPresenter.this.c);
                            u.c(new agh.d(true));
                            if (musicAlbumBean != null) {
                                SearchResultAlbumPresenter.this.d(musicAlbumBean.getId(), musicAlbumBean.getName());
                                ayi.a().a(true);
                            }
                        }
                    }
                });
            }
        });
    }
}
