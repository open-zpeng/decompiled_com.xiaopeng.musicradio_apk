package com.xiaopeng.musicradio.search.result.program.presenter;

import androidx.lifecycle.i;
import com.google.gson.reflect.TypeToken;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agh;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultProgramPresenter extends BaseSearchResultListPresenter<azg> {
    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected int e() {
        return 5;
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter, com.xiaopeng.musicradio.search.common.presenter.BaseSearchPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
    }

    @Override // com.xiaopeng.musicradio.search.common.presenter.BaseSearchResultListPresenter
    protected void a(String str, int i) {
        List<RdAlbumBean> list = (List) z.a(str, new TypeToken<List<RdAlbumBean>>() { // from class: com.xiaopeng.musicradio.search.result.program.presenter.SearchResultProgramPresenter.1
        }.getType());
        this.b = 1;
        MixSearchResultBean.DataBean dataBean = new MixSearchResultBean.DataBean();
        this.c = i;
        dataBean.setReadingAlbumList(list);
        if (a() != 0) {
            ((azg) a()).a(false, this.b, this.c);
            ((azg) a()).a(dataBean, this.b, this.c);
            u.c(new agh.d(true));
            if (list.size() <= 0 || ayi.a().g()) {
                return;
            }
            ((awh) c.a().b(awh.class)).playReading(list.get(0));
            ayi.a().a(true);
        }
    }
}
