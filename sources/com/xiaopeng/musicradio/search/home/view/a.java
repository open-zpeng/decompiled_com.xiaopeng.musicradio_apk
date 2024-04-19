package com.xiaopeng.musicradio.search.home.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.user.SearchHistoryBean;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.home.presenter.HomeMainSearchFragmentPresenter;
import com.xiaopeng.musicradio.utils.be;
import defpackage.agq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: HomeMainSearchFragmentProxy.java */
/* loaded from: classes2.dex */
public class a extends aeu<b, HomeMainSearchFragmentPresenter> implements b {
    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void a(int i, int i2) {
    }

    @Override // defpackage.azq
    public void a(agq.l lVar) {
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void an_() {
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void b(List<MusicSongBean> list) {
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public boolean h() {
        return false;
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void i() {
    }

    public a(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public HomeMainSearchFragmentPresenter g() {
        Log.d("HomeMainSearchFragmentProxy_", "createPresenter: create P");
        return new HomeMainSearchFragmentPresenter();
    }

    @Override // com.xiaopeng.musicradio.search.home.view.b
    public void a(List<String> list) {
        if (list != null) {
            Log.d("HomeMainSearchFragmentProxy_", "updateSearchHistory search history is: " + list.size());
            if (list.size() == 0) {
                j();
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new SearchHistoryBean(list.get(i)));
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            new HashMap().put("historyWords", strArr);
            Log.d("HomeMainSearchFragmentProxy_", "updateSearchHistory: " + strArr.length);
            a(arrayList, 0);
            return;
        }
        j();
        Log.d("HomeMainSearchFragmentProxy_", "updateSearchHistory no history: ");
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("HomeMainSearchFragmentProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "requestSerachHistoryList")) {
            ((HomeMainSearchFragmentPresenter) this.c).f();
        } else if ("clearHistory".equalsIgnoreCase(str)) {
            ((HomeMainSearchFragmentPresenter) this.c).e();
        }
    }

    public void j() {
        Log.d("HomeMainSearchFragmentProxy_", "showNoData: no result");
        a((List<SearchHistoryBean>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<SearchHistoryBean>) null, 1);
    }

    public void a(List<SearchHistoryBean> list, int i) {
        Log.i("HomeMainSearchFragmentProxy_", "msgId:HomeMainSearchFragmentProxy_search_history_getdatalist" + list);
        Netsearch.HistoryList.a a = Netsearch.HistoryList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (SearchHistoryBean searchHistoryBean : list) {
                a.a(Netsearch.SearchHistoryBean.newBuilder().a(be.e(searchHistoryBean.getHistory())).build());
            }
        }
        Log.i("HomeMainSearchFragmentProxy_", "msgId listBuilder:" + a.a());
        a("HomeMainSearchFragmentProxy_search_history_getdatalist", (AbstractMessageLite) a.build());
    }
}
