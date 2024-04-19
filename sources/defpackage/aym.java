package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumBean;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Music;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.album.presenter.SearchResultAlbumPresenter;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.u;
import defpackage.ayg;
import java.util.List;
/* compiled from: SearchResultAlbumViewProxy.java */
/* renamed from: aym  reason: default package */
/* loaded from: classes2.dex */
public class aym extends aeu<ayk, SearchResultAlbumPresenter> implements ayk {
    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public aym(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultAlbumPresenter g() {
        Log.d("SearchResultAlbumViewProxy_", "createPresenter: create P");
        return new SearchResultAlbumPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<MusicAlbumBean> albumList = dataBean.getAlbumList();
        Log.d("SearchResultAlbumViewProxy_", "updateData result is: " + albumList.size());
        if (albumList.size() == 0) {
            h();
        } else {
            a(albumList, 0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultAlbumViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchAlbum")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestSearchAlbumList")) {
            try {
                String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
                Log.i("SearchResultAlbumViewProxy_", "byte monoMessage key: " + keyword);
                ayi.a().a(keyword);
                u.c(new ayg.b(keyword, true));
                u.c(new ayg.a());
                ((SearchResultAlbumPresenter) this.c).c(1);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("SearchResultAlbumViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        } else if (TextUtils.equals(str, "loadNextPage")) {
            ((SearchResultAlbumPresenter) this.c).g();
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: aym.1
            @Override // java.lang.Runnable
            public void run() {
                MusicAlbumBean c = bhx.c(bArr);
                if (c != null) {
                    ((SearchResultAlbumPresenter) aym.this.c).d(c.getId(), c.getName());
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
        Log.d("SearchResultAlbumViewProxy_", "showLoading loading: " + z + ",,page,," + i + ",,totalPage,," + i2);
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    public void h() {
        Log.d("SearchResultAlbumViewProxy_", "showNoData: no result");
        a((List<MusicAlbumBean>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<MusicAlbumBean>) null, 1);
    }

    public void a(List<MusicAlbumBean> list, int i) {
        Log.i("SearchResultAlbumViewProxy_", "msgId:SearchResultAlbumViewProxy_search_album_getdatalist" + list);
        Netsearch.AlbumList.a a = Netsearch.AlbumList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MusicAlbumBean musicAlbumBean : list) {
                a.a(Music.MusicAlbum.newBuilder().a(musicAlbumBean.getId()).b(be.e(musicAlbumBean.getName())).c(be.e(musicAlbumBean.getLogo())).build());
            }
        }
        Log.i("SearchResultAlbumViewProxy_", "msgId listBuilder:" + a.a());
        a("SearchResultAlbumViewProxy_search_album_getdatalist", (AbstractMessageLite) a.build());
    }

    private void a(boolean z) {
        Log.i("SearchResultAlbumViewProxy_", "msgId:SearchResultAlbumViewProxy_search_album_hasmore--" + z);
        a("SearchResultAlbumViewProxy_search_album_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }
}
