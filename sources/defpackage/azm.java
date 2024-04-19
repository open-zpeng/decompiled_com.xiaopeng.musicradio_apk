package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.xiaopeng.musicradio.bean.search.MixSearchResultBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.proto.Common;
import com.xiaopeng.musicradio.proto.Netsearch;
import com.xiaopeng.musicradio.search.result.song.presenter.SearchResultSongPresenter;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import defpackage.ayg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: SearchResultSongViewProxy.java */
/* renamed from: azm  reason: default package */
/* loaded from: classes2.dex */
public class azm extends aeu<azk, SearchResultSongPresenter> implements azk {
    private List<MusicSongBean> e;

    @Override // defpackage.azq
    public void a(agq.l lVar) {
    }

    @Override // defpackage.azo
    public boolean u() {
        return false;
    }

    @Override // defpackage.azo
    public void v() {
    }

    public azm(Context context, String str) {
        super(context, str);
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aeu
    /* renamed from: a */
    public SearchResultSongPresenter g() {
        Log.d("SearchResultSongViewProxy_", "createPresenter: create P");
        return new SearchResultSongPresenter();
    }

    @Override // defpackage.azo
    public void a(MixSearchResultBean.DataBean dataBean, int i, int i2) {
        List<MusicSongBean> songList = dataBean.getSongList();
        this.e.clear();
        this.e.addAll(songList);
        Log.d("SearchResultSongViewProxy_", "updateData result is: " + songList.size());
        if (songList.size() == 0) {
            i();
        } else {
            a(songList, 0);
        }
    }

    @Override // defpackage.aeu, defpackage.aev
    public void a(String str, byte[] bArr) {
        super.a(str, bArr);
        Log.i("SearchResultSongViewProxy_", "byte monoMessage: " + str + ",,,," + bArr);
        if (TextUtils.equals(str, "playSearchSong")) {
            a(bArr);
        } else if (TextUtils.equals(str, "requestSearchSongList")) {
            try {
                String keyword = Netsearch.Keyword.parseFrom(bArr).getKeyword();
                Log.i("SearchResultSongViewProxy_", "byte monoMessage key: " + keyword);
                ayi.a().a(keyword);
                u.c(new ayg.b(keyword, true));
                u.c(new ayg.a());
                ((SearchResultSongPresenter) this.c).c(1);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
                Log.e("SearchResultSongViewProxy_", "byte monoMessage key: " + e.getMessage());
            }
        } else if (TextUtils.equals(str, "loadNextPage")) {
            ((SearchResultSongPresenter) this.c).g();
        } else if (TextUtils.equals(str, "favOrNot")) {
            b(bArr);
        } else if (TextUtils.equals(str, "playAllMusic")) {
            h();
        }
    }

    public void a(final byte[] bArr) {
        ban.g(new Runnable() { // from class: azm.1
            @Override // java.lang.Runnable
            public void run() {
                MusicSongBean c = azm.this.c(bArr);
                Log.d("SearchResultSongViewProxy_", "byte playSearchSong : " + c);
                if (c != null) {
                    ((SearchResultSongPresenter) azm.this.c).a(c);
                }
            }
        });
    }

    public void b(final byte[] bArr) {
        ban.g(new Runnable() { // from class: azm.2
            @Override // java.lang.Runnable
            public void run() {
                MusicSongBean c = azm.this.c(bArr);
                Log.d("SearchResultSongViewProxy_", "byte favOrNot : " + c);
                if (c != null) {
                    ((SearchResultSongPresenter) azm.this.c).b(c);
                    boolean c2 = ((SearchResultSongPresenter) azm.this.c).c(c);
                    Log.d("SearchResultSongViewProxy_", "is_Love : " + c2);
                    new HashMap().put("isLove", Boolean.valueOf(c2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MusicSongBean c(byte[] bArr) {
        return bhx.b(bArr);
    }

    public void h() {
        ban.g(new Runnable() { // from class: azm.3
            @Override // java.lang.Runnable
            public void run() {
                if (azm.this.e.size() > 0) {
                    ((SearchResultSongPresenter) azm.this.c).a((MusicSongBean) azm.this.e.get(0), azm.this.e, 0);
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
        Log.d("SearchResultSongViewProxy_", "showLoading loading: " + z + ",,page,," + i + ",,totalPage,," + i2);
        if (i >= 1 && i2 >= 1 && i < i2) {
            a(true);
        } else {
            a(false);
        }
    }

    public void i() {
        Log.d("SearchResultSongViewProxy_", "showNoData: no result");
        a((List<MusicSongBean>) null, 2);
    }

    @Override // defpackage.azp
    public void a(String str, int i) {
        a((List<MusicSongBean>) null, 1);
    }

    public void a(List<MusicSongBean> list, int i) {
        Log.i("SearchResultSongViewProxy_", "msgId:SearchResultSongViewProxy_search_song_getdatalist" + list);
        Netsearch.SongList.a a = Netsearch.SongList.newBuilder().a(i);
        if (list != null && list.size() > 0) {
            for (MusicSongBean musicSongBean : list) {
                a.a(bhw.a(musicSongBean));
            }
        }
        Log.i("SearchResultSongViewProxy_", "msgId listBuilder:" + a.a());
        Netsearch.SongList build = a.build();
        Log.i("SearchResultSongViewProxy_", "msgId list:" + build.getSongListList());
        a("SearchResultSongViewProxy_search_song_getdatalist", (AbstractMessageLite) build);
    }

    private void a(boolean z) {
        Log.i("SearchResultSongViewProxy_", "msgId:SearchResultSongViewProxy_search_song_hasmore--" + z);
        a("SearchResultSongViewProxy_search_song_hasmore", (AbstractMessageLite) Common.BoolParam.newBuilder().a(z).build());
    }
}
