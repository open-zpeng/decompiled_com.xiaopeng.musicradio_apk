package com.xiaopeng.musicradio.music.singer.main.presenter;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.SingerMainInfo;
import com.xiaopeng.musicradio.bean.xpbean.MainHotSingerResultBean;
import com.xiaopeng.musicradio.bean.xpbean.SingerIndexResult;
import com.xiaopeng.musicradio.bean.xpbean.SingerResultBean;
import com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter;
import com.xiaopeng.musicradio.music.singer.main.view.b;
import com.xiaopeng.musicradio.utils.be;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class SingerMainPresenter extends MusicBasePresenter<b> {
    private String c = "";
    private String d = "";
    private boolean e = false;
    private boolean f = false;
    private ArrayList<Integer> g = new ArrayList<>();
    private ArrayList<SingerMainInfo> h = new ArrayList<>();
    private ArrayList<String> i = new ArrayList<>();

    @Override // com.xiaopeng.musicradio.widget.lifecycle.BaseDealNetValidPresenter, com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter
    public void onCreate(i iVar) {
        super.onCreate(iVar);
        Log.i("SingerMainPresenter", "onCreate");
        if (iVar != null) {
            d();
        }
    }

    public void d() {
        if (this.e) {
            return;
        }
        if (a() != null) {
            a().a();
        }
        aqz.a().i(new avc<SingerIndexResult>() { // from class: com.xiaopeng.musicradio.music.singer.main.presenter.SingerMainPresenter.1
            @Override // defpackage.avc
            public void a(SingerIndexResult singerIndexResult) {
                if (SingerMainPresenter.this.a() == null || singerIndexResult == null || singerIndexResult.getData() == null || singerIndexResult.getData().getSingerAreaBoList() == null || singerIndexResult.getData().getSingerAreaBoList().size() <= 0 || singerIndexResult.getData().getSingerTypeBoList() == null || singerIndexResult.getData().getSingerTypeBoList().size() <= 0) {
                    SingerMainPresenter.this.e = false;
                    if (SingerMainPresenter.this.a() != null) {
                        SingerMainPresenter.this.a().a("");
                        return;
                    }
                    return;
                }
                SingerMainPresenter.this.e = true;
                String areaCode = singerIndexResult.getData().getSingerAreaBoList().get(0).getAreaCode();
                String typeCode = singerIndexResult.getData().getSingerTypeBoList().get(0).getTypeCode();
                SingerMainPresenter.this.a().b(singerIndexResult.getData().getSingerAreaBoList());
                SingerMainPresenter.this.a().a(singerIndexResult.getData().getSingerTypeBoList());
                SingerMainPresenter.this.a().a(singerIndexResult.getData().getSingerAreaBoList(), singerIndexResult.getData().getSingerTypeBoList());
                SingerMainPresenter.this.c = areaCode;
                SingerMainPresenter.this.d = typeCode;
                SingerMainPresenter.this.a(typeCode, areaCode);
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                SingerMainPresenter.this.e = false;
                if (SingerMainPresenter.this.a() != null) {
                    SingerMainPresenter.this.a().a(str);
                }
            }
        });
    }

    public void a(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (a() != null) {
            a().a();
        }
        aqz.a().b(str, str2, new avc<MainHotSingerResultBean>() { // from class: com.xiaopeng.musicradio.music.singer.main.presenter.SingerMainPresenter.2
            @Override // defpackage.avc
            public void a(MainHotSingerResultBean mainHotSingerResultBean) {
                if (TextUtils.equals(str, SingerMainPresenter.this.c) && TextUtils.equals(str2, SingerMainPresenter.this.d)) {
                    if (SingerMainPresenter.this.a() == null || mainHotSingerResultBean.getData() == null || mainHotSingerResultBean.getData() == null || mainHotSingerResultBean.getData().size() < 0) {
                        SingerMainPresenter.this.f = false;
                        if (SingerMainPresenter.this.a() != null) {
                            SingerMainPresenter.this.a().a("");
                            return;
                        }
                        return;
                    }
                    SingerMainPresenter.this.f = true;
                    SingerMainPresenter.this.g.clear();
                    SingerMainPresenter.this.i.clear();
                    SingerMainPresenter.this.h.clear();
                    List<SingerResultBean.DataBean.ArtistGroupsBean> a = SingerMainPresenter.this.a(mainHotSingerResultBean.getData());
                    ArrayList arrayList = new ArrayList();
                    for (SingerResultBean.DataBean.ArtistGroupsBean artistGroupsBean : a) {
                        arrayList.addAll(artistGroupsBean.getList());
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((SingerResultBean.DataBean.ArtistGroupsBean.ListBean) arrayList.get(i)).setPosition(i);
                    }
                    for (SingerResultBean.DataBean.ArtistGroupsBean artistGroupsBean2 : a) {
                        SingerMainPresenter.this.g.add(Integer.valueOf(SingerMainPresenter.this.h.size()));
                        SingerMainPresenter.this.i.add(artistGroupsBean2.getTitle());
                        SingerMainInfo singerMainInfo = new SingerMainInfo();
                        singerMainInfo.setmTitle(artistGroupsBean2.getTitle());
                        singerMainInfo.setmIsTitle(true);
                        singerMainInfo.setmLetter(artistGroupsBean2.getTitle());
                        SingerMainPresenter.this.h.add(singerMainInfo);
                        SingerMainPresenter singerMainPresenter = SingerMainPresenter.this;
                        singerMainPresenter.a(singerMainPresenter.h, artistGroupsBean2.getList(), artistGroupsBean2.getTitle());
                    }
                    if (SingerMainPresenter.this.a() != null) {
                        SingerMainPresenter.this.k();
                        SingerMainPresenter.this.a().a(SingerMainPresenter.this.g, SingerMainPresenter.this.h, SingerMainPresenter.this.i);
                    }
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str3) {
                SingerMainPresenter.this.f = false;
                if (SingerMainPresenter.this.a() != null) {
                    SingerMainPresenter.this.a().a("");
                }
            }
        });
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public boolean g() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void c() {
        if (a() != null) {
            a().c_(this.b);
        }
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public boolean a(String str) {
        return str.contains(ListSignBean.MUSIC_SINGER_EXTRA) && str.contains(ListSignBean.LISTSIGN_ARTIST_RADIO);
    }

    @Override // com.xiaopeng.musicradio.music.main.presenter.MusicBasePresenter
    public void f() {
        if (a() != null) {
            a().J_();
        }
    }

    public String l() {
        return this.c;
    }

    public String m() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SingerResultBean.DataBean.ArtistGroupsBean> a(List<MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean> list) {
        if (list == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (MainHotSingerResultBean.DataBean.ArtistGroupsBean.ListBean listBean : list) {
            String trim = listBean.getName().trim();
            String str = "#";
            if (!TextUtils.isEmpty(trim) && trim.length() > 0) {
                String upperCase = trim.substring(0, 1).toUpperCase();
                if (be.g(upperCase)) {
                    str = "#";
                } else if (be.f(upperCase)) {
                    str = upperCase;
                } else if (be.h(upperCase)) {
                    String i = be.i(upperCase);
                    str = TextUtils.isEmpty(i) ? "#" : i.substring(0, 1).toUpperCase();
                }
                if (TextUtils.isEmpty(str)) {
                    str = "#";
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                SingerResultBean.DataBean.ArtistGroupsBean.ListBean listBean2 = new SingerResultBean.DataBean.ArtistGroupsBean.ListBean();
                listBean2.setId(listBean.getId());
                listBean2.setLogo(listBean.getLogo());
                listBean2.setName(listBean.getName());
                if (hashMap.containsKey(str)) {
                    ((ArrayList) hashMap.get(str)).add(listBean2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(listBean2);
                    hashMap.put(str, arrayList3);
                }
            }
        }
        Collections.sort(arrayList);
        if (arrayList.contains("#")) {
            arrayList.remove("#");
            arrayList.add("#");
        }
        for (String str2 : arrayList) {
            ArrayList arrayList4 = (ArrayList) hashMap.get(str2);
            if (arrayList4.size() > 0) {
                SingerResultBean.DataBean.ArtistGroupsBean artistGroupsBean = new SingerResultBean.DataBean.ArtistGroupsBean();
                artistGroupsBean.setTitle(str2);
                artistGroupsBean.setList(arrayList4);
                arrayList2.add(artistGroupsBean);
            }
        }
        return arrayList2;
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
}
