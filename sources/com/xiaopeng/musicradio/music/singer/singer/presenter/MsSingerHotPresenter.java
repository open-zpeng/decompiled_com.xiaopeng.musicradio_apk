package com.xiaopeng.musicradio.music.singer.singer.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.music.singer.singer.view.b;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MsSingerHotPresenter extends MusicBasePresenter<b> {
    private ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> c = new ArrayList<>();
    private HashMap<Integer, ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean>> d = new HashMap<>();
    private int e = 0;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsSingerHotPresenter", "onCreate");
        if (this.d.size() > 0) {
            j();
        }
    }

    public void d() {
        final int i = this.e;
        if (this.d.containsKey(Integer.valueOf(i))) {
            ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> arrayList = this.d.get(Integer.valueOf(i));
            if (a() != null && arrayList != null && arrayList.size() > 0) {
                a().a(arrayList);
                return;
            }
        }
        if (a() != null) {
            a().r_();
        }
        aqz.a().a(i, new avc<SingerResultBean>() { // from class: com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerHotPresenter.1
            @Override // defpackage.avc
            public void a(SingerResultBean singerResultBean) {
                if (singerResultBean.getData() != null && singerResultBean.getData().getArtistGroups() != null && singerResultBean.getData().getArtistGroups().size() >= 0) {
                    MsSingerHotPresenter.this.c.clear();
                    MsSingerHotPresenter.this.c.addAll(singerResultBean.getData().getArtistGroups().get(0).getList());
                    if (MsSingerHotPresenter.this.a() != null) {
                        MsSingerHotPresenter.this.k();
                        if (i == MsSingerHotPresenter.this.e) {
                            MsSingerHotPresenter.this.d.put(Integer.valueOf(MsSingerHotPresenter.this.e), new ArrayList(MsSingerHotPresenter.this.c));
                            MsSingerHotPresenter.this.a().a(MsSingerHotPresenter.this.c);
                        }
                    }
                } else if (MsSingerHotPresenter.this.a() != null) {
                    MsSingerHotPresenter.this.a().a("");
                }
            }

            @Override // defpackage.avc
            public void a(int i2, String str) {
                if (MsSingerHotPresenter.this.a() != null) {
                    MsSingerHotPresenter.this.a().a("");
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().a(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_SINGER_EXTRA) && str.contains(ListSignBean.LISTSIGN_ARTIST_RADIO);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(a.a) && this.c.size() == 0) {
            d();
        }
    }

    public void a(int i) {
        this.e = i;
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }
}
