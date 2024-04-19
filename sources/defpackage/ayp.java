package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.collection.presenter.SearchResultCollectionPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ayg;
import java.util.List;
/* compiled from: SearchResultCollectionViewProxy.java */
/* renamed from: ayp  reason: default package */
/* loaded from: classes2.dex */
public class ayp extends aeu<ayn, SearchResultCollectionPresenter> implements ayn {
    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public ayp(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultCollectionPresenter g() {
        Log.d("SearchResultCollectionViewProxy_", "createPresenter: create P");
        return new SearchResultCollectionPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<MixSearchResultBean.CollectBean> collectList = dataBean.getCollectList();
        Log.d("SearchResultCollectionViewProxy_", "updateData result is: " + collectList.size());
        if (collectList.size() == 0) {
            h();
        } else {
            a(collectList, 0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultCollectionViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchCollect")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestSearchCollectList")) {
            try {
                String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
                Log.i("SearchResultCollectionViewProxy_", "byte monoMessage key: " + keyword);
                ayi.a().a(keyword);
                u.c(new ayg.b(keyword, true));
                u.c(new ayg.a());
                ((SearchResultCollectionPresenter) this.c).c(1);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("SearchResultCollectionViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        } else if (TextUtils.equals(str, "loadNextPage")) {
            ((SearchResultCollectionPresenter) this.c).g();
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: ayp.1
            @Override // java.lang.Runnable
            public void run() {
                MixSearchResultBean.CollectBean d = bhx.d(bArr);
                if (d != null) {
                    ((SearchResultCollectionPresenter) ayp.this.c).c(d.getId(), d.getName());
                }
            }
        });
    }

    @Override // defpackage.azo
    public void as_() {
        c_("UpdatePlayState", "");
    }

    @Override // defpackage.azp
    public void a(boolean z, int i, int i2) {
        Log.d("SearchResultCollectionViewProxy_", "showLoading loading: " + z + ",,page,," + i + ",,totalPage,," + i2);
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    public void h() {
        Log.d("SearchResultCollectionViewProxy_", "showNoData: no result");
        a((List<MixSearchResultBean.CollectBean>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<MixSearchResultBean.CollectBean>) null, 1);
    }

    public void a(List<MixSearchResultBean.CollectBean> list, int i) {
        Log.i("SearchResultCollectionViewProxy_", "msgId:SearchResultCollectionViewProxy_search_collection_getdatalist" + list);
        Netsearch.CollectList.a a = Netsearch.CollectList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MixSearchResultBean.CollectBean collectBean : list) {
                a.a(Music.MusicAlbum.newBuilder().a(collectBean.getId()).b(be.e(collectBean.getName())).c(be.e(collectBean.getLogo())).build());
            }
        }
        Log.i("SearchResultCollectionViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultCollectionViewProxy_search_collection_getdatalist", (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("SearchResultCollectionViewProxy_", "msgId:SearchResultCollectionViewProxy_search_collect_hasmore--" + z);
        a("SearchResultCollectionViewProxy_search_collect_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }
}
