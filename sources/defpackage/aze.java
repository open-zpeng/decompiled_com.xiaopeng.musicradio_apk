package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netradio;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.netradio.presenter.SearchResultNetRadioPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ayg;
import java.util.List;
/* compiled from: SearchResultNetRadioViewProxy.java */
/* renamed from: aze  reason: default package */
/* loaded from: classes2.dex */
public class aze extends aeu<azc, SearchResultNetRadioPresenter> implements azc {
    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public aze(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultNetRadioPresenter g() {
        Log.d("SearchResultNetRadioViewProxy_", "createPresenter: create P");
        return new SearchResultNetRadioPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<NetRadioInfo> radioList = dataBean.getRadioList();
        Log.d("SearchResultNetRadioViewProxy_", "updateData result is: " + radioList.size());
        if (radioList.size() == 0) {
            h();
        } else {
            a(radioList, 0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultNetRadioViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchRadio")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestSearchRadioList")) {
            try {
                String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
                Log.i("SearchResultNetRadioViewProxy_", "byte monoMessage key: " + keyword);
                ayi.a().a(keyword);
                u.c(new ayg.b(keyword, true));
                u.c(new ayg.a());
                ((SearchResultNetRadioPresenter) this.c).c(1);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("SearchResultNetRadioViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        } else if (TextUtils.equals(str, "loadNextPage")) {
            ((SearchResultNetRadioPresenter) this.c).g();
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: aze.1
            @Override // java.lang.Runnable
            public void run() {
                NetRadioInfo f = bhx.f(bArr);
                if (f != null) {
                    ((SearchResultNetRadioPresenter) aze.this.c).a(f);
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
        Log.d("SearchResultNetRadioViewProxy_", "showLoading loading: " + z + ",,page,," + i + ",,totalPage,," + i2);
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    public void h() {
        Log.d("SearchResultNetRadioViewProxy_", "showNoData: no result");
        a((List<NetRadioInfo>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<NetRadioInfo>) null, 1);
    }

    public void a(List<NetRadioInfo> list, int i) {
        Log.i("SearchResultNetRadioViewProxy_", "msgId:SearchResultNetRadioViewProxy_search_radio_getdatalist" + list);
        Netradio.RadioInfoList.a a = Netradio.RadioInfoList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (NetRadioInfo netRadioInfo : list) {
                a.a(bhw.a(netRadioInfo));
            }
        }
        Log.i("SearchResultNetRadioViewProxy_", "msgId listBuilder:" + a.a());
        Netradio.RadioInfoList build = a.build();
        Log.i("SearchResultNetRadioViewProxy_", "msgId list:" + build.getRadioListList());
        a("SearchResultNetRadioViewProxy_search_radio_getdatalist", (AbstractMessageLite) build);
    }

    private void a(boolean z) {
        Log.i("SearchResultNetRadioViewProxy_", "msgId:SearchResultNetRadioViewProxy_search_radio_hasmore--" + z);
        a("SearchResultNetRadioViewProxy_search_radio_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }
}
