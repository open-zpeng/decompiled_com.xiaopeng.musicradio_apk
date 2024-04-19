package com.xiaopeng.musicradio.search.result.song.presenter;

import android.text.TextUtils;
import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultSongPresenter extends BaseSearchResultListPresenter<azk> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected int e() {
        return 1;
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter, com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected void a(final String str, final int i) {
        ban.f(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = (ArrayList) z.a(str, new TypeToken<List<MusicSongBean>>() { // from class: com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter.1.1
                }.getType());
                SearchResultSongPresenter.this.b = 1;
                final MixSearchResultBean.DataBean dataBean = new MixSearchResultBean.DataBean();
                dataBean.setSongList(arrayList);
                SearchResultSongPresenter.this.c = i;
                final String str2 = "";
                if (arrayList.size() > 0 && !ayi.a().g()) {
                    str2 = z.a(arrayList.get(0));
                }
                ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (SearchResultSongPresenter.this.a() != 0) {
                            ((azk) SearchResultSongPresenter.this.a()).a(false, SearchResultSongPresenter.this.b, SearchResultSongPresenter.this.c);
                            ((azk) SearchResultSongPresenter.this.a()).a(dataBean, SearchResultSongPresenter.this.b, SearchResultSongPresenter.this.c);
                            u.c(new agh.d(true));
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            arf arfVar = (arf) c.a().b(arf.class);
                            if (arfVar != null) {
                                arfVar.playMusic(str2, str, ListSignBean.LISTSIGN_SEARCH_SONG);
                            }
                            ayi.a().a(true);
                        }
                    }
                });
            }
        });
    }
}
