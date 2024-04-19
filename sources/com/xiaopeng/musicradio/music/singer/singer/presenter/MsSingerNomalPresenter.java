package com.xiaopeng.musicradio.music.singer.singer.presenter;

import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.lib.utils.NetUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.SingerMainInfo;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.music.singer.singer.view.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class MsSingerNomalPresenter extends MusicBasePresenter<c> {
    private ArrayList<Integer> c = new ArrayList<>();
    private ArrayList<SingerMainInfo> d = new ArrayList<>();
    private ArrayList<String> e = new ArrayList<>();
    private HashMap<String, ArrayList<Integer>> f = new HashMap<>();
    private HashMap<String, ArrayList<SingerMainInfo>> g = new HashMap<>();
    private HashMap<String, ArrayList<String>> h = new HashMap<>();
    private int i = 0;
    private int j = 0;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("MsSingerNomalPresenter", "onCreate");
    }

    public void a(final int i, final int i2) {
        final String str = i + "-" + i2;
        if (this.g.containsKey(str) && this.f.containsKey(str) && this.h.containsKey(str)) {
            ArrayList<SingerMainInfo> arrayList = this.g.get(str);
            ArrayList<Integer> arrayList2 = this.f.get(str);
            ArrayList<String> arrayList3 = this.h.get(str);
            if (a() != null && arrayList != null && arrayList.size() > 0 && arrayList2 != null && arrayList2.size() > 0 && arrayList3 != null && arrayList3.size() > 0) {
                a().a(this.f.get(str), this.g.get(str), this.h.get(str));
                return;
            }
        }
        if (a() != null) {
            a().r_();
        }
        aqz.a().a(i, i2, new avc<SingerResultBean>() { // from class: com.xiaopeng.musicradio.music.singer.singer.presenter.MsSingerNomalPresenter.1
            @Override // defpackage.avc
            public void a(SingerResultBean singerResultBean) {
                if (i == MsSingerNomalPresenter.this.i && i2 == MsSingerNomalPresenter.this.j) {
                    if (singerResultBean.getData() != null && singerResultBean.getData().getArtistGroups() != null && singerResultBean.getData().getArtistGroups().size() >= 0) {
                        MsSingerNomalPresenter.this.c.clear();
                        MsSingerNomalPresenter.this.e.clear();
                        MsSingerNomalPresenter.this.d.clear();
                        List<SingerResultBean.DataBean.ArtistGroupsBean> artistGroups = singerResultBean.getData().getArtistGroups();
                        artistGroups.remove(0);
                        ArrayList arrayList4 = new ArrayList();
                        for (SingerResultBean.DataBean.ArtistGroupsBean artistGroupsBean : artistGroups) {
                            arrayList4.addAll(artistGroupsBean.getList());
                        }
                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                            ((SingerResultBean.DataBean.ArtistGroupsBean.ListBean) arrayList4.get(i3)).setPosition(i3);
                        }
                        for (SingerResultBean.DataBean.ArtistGroupsBean artistGroupsBean2 : artistGroups) {
                            MsSingerNomalPresenter.this.c.add(Integer.valueOf(MsSingerNomalPresenter.this.d.size()));
                            MsSingerNomalPresenter.this.e.add(artistGroupsBean2.getTitle());
                            SingerMainInfo singerMainInfo = new SingerMainInfo();
                            singerMainInfo.setmTitle(artistGroupsBean2.getTitle());
                            singerMainInfo.setmIsTitle(true);
                            singerMainInfo.setmLetter(artistGroupsBean2.getTitle());
                            MsSingerNomalPresenter.this.d.add(singerMainInfo);
                            MsSingerNomalPresenter msSingerNomalPresenter = MsSingerNomalPresenter.this;
                            msSingerNomalPresenter.a(msSingerNomalPresenter.d, artistGroupsBean2.getList(), artistGroupsBean2.getTitle());
                        }
                        if (MsSingerNomalPresenter.this.a() != null) {
                            MsSingerNomalPresenter.this.k();
                            MsSingerNomalPresenter.this.f.put(str, new ArrayList(MsSingerNomalPresenter.this.c));
                            MsSingerNomalPresenter.this.g.put(str, new ArrayList(MsSingerNomalPresenter.this.d));
                            MsSingerNomalPresenter.this.h.put(str, new ArrayList(MsSingerNomalPresenter.this.e));
                            MsSingerNomalPresenter.this.a().a(MsSingerNomalPresenter.this.c, MsSingerNomalPresenter.this.d, MsSingerNomalPresenter.this.e);
                        }
                    } else if (MsSingerNomalPresenter.this.a() != null) {
                        MsSingerNomalPresenter.this.a().a("");
                    }
                }
            }

            @Override // defpackage.avc
            public void a(int i3, String str2) {
                if (MsSingerNomalPresenter.this.a() != null) {
                    MsSingerNomalPresenter.this.a().a("");
                }
            }
        });
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter
    public void e() {
        super.e();
        if (NetUtils.isNetworkAvailable(a.a) && this.d.size() == 0) {
            a(this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<SingerMainInfo> arrayList, List<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> list, String str) {
        int size = ((list.size() + 4) - 1) / 4;
        for (int i = 0; i < size; i++) {
            ArrayList<SingerResultBean.DataBean.ArtistGroupsBean.ListBean> arrayList2 = new ArrayList<>();
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                if (list.size() <= 4 && list.size() > 0) {
                    arrayList2.addAll(list);
                    break;
                }
                if (list.size() > 4) {
                    arrayList2.add(list.get(i2));
                }
                i2++;
            }
            list.removeAll(arrayList2);
            SingerMainInfo singerMainInfo = new SingerMainInfo();
            singerMainInfo.setmSingerBeans(arrayList2);
            singerMainInfo.setmIsTitle(false);
            singerMainInfo.setmLetter(str);
            arrayList.add(singerMainInfo);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().e();
        }
    }
}
