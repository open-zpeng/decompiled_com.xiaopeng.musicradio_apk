package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.program.presenter.SearchResultProgramPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ayg;
import java.util.List;
/* compiled from: SearchResultProgramViewProxy.java */
/* renamed from: azi  reason: default package */
/* loaded from: classes2.dex */
public class azi extends aeu<azg, SearchResultProgramPresenter> implements azg {
    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public azi(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultProgramPresenter g() {
        Log.d("SearchResultProgramViewProxy_", "createPresenter: create P");
        return new SearchResultProgramPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<RdAlbumBean> readingAlbumList = dataBean.getReadingAlbumList();
        Log.d("SearchResultProgramViewProxy_", "updateData result is: " + readingAlbumList.size());
        if (readingAlbumList.size() == 0) {
            h();
        } else {
            a(readingAlbumList, 0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultProgramViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchProgram")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestSearchProgramList")) {
            try {
                String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
                Log.i("SearchResultProgramViewProxy_", "byte monoMessage key: " + keyword);
                ayi.a().a(keyword);
                u.c(new ayg.b(keyword, true));
                u.c(new ayg.a());
                ((SearchResultProgramPresenter) this.c).c(1);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("SearchResultProgramViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        } else if (TextUtils.equals(str, "loadNextPage")) {
            ((SearchResultProgramPresenter) this.c).g();
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: azi.1
            @Override // java.lang.Runnable
            public void run() {
                RdAlbumBean g = bhx.g(bArr);
                if (g != null) {
                    ((SearchResultProgramPresenter) azi.this.c).a(g);
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
        Log.d("SearchResultProgramViewProxy_", "showLoading loading: " + z + ",,page,," + i + ",,totalPage,," + i2);
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    public void h() {
        Log.d("SearchResultProgramViewProxy_", "showNoData: no result");
        a((List<RdAlbumBean>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<RdAlbumBean>) null, 1);
        a(2);
    }

    private void a(int i) {
        Log.i("SearchResultProgramViewProxy_", "ShowLoadingTip" + i);
        c_("ShowLoadingTip", String.valueOf(i));
    }

    public void a(List<RdAlbumBean> list, int i) {
        Log.i("SearchResultProgramViewProxy_", "msgId:SearchResultProgramViewProxy_search_program_getdatalist" + list);
        Netsearch.ProgramList.a a = Netsearch.ProgramList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (RdAlbumBean rdAlbumBean : list) {
                a.a(bhw.a(rdAlbumBean));
            }
        }
        Log.i("SearchResultProgramViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultProgramViewProxy_search_program_getdatalist", (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("SearchResultProgramViewProxy_", "msgId:SearchResultProgramViewProxy_search_program_hasmore--" + z);
        a("SearchResultProgramViewProxy_search_program_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }
}
