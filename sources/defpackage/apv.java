package defpackage;

import android.util.LruCache;
import com.lzy.okgo.adapter.Call;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSearchBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongListBean;
import com.xiaopeng.musicradio.search.api.bean.SearchResultServiceBean;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.w;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: SearchAndHistoryModel.java */
/* renamed from: apv  reason: default package */
/* loaded from: classes2.dex */
public class apv {
    private LruCache<String, List<MusicSongBean>> a;
    private List<MusicSongBean> b;
    private ConcurrentHashMap<String, MusicInfo> c;
    private String d;
    private Call<MusicSearchBean> e;

    /* compiled from: SearchAndHistoryModel.java */
    /* renamed from: apv$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final apv a = new apv();
    }

    public void a(String str) {
        List<MusicSongBean> list = this.b;
        if (list != null) {
            for (MusicSongBean musicSongBean : list) {
                if (musicSongBean.getHash().equalsIgnoreCase(str)) {
                    apk.i().b(ab.a(musicSongBean, 40, ""));
                    return;
                }
            }
        }
    }

    public static apv a() {
        return a.a;
    }

    private apv() {
        this.c = new ConcurrentHashMap<>();
        this.d = "";
        this.e = null;
        this.a = new LruCache<>(10);
        this.b = new ArrayList();
    }

    public void a(String str, List<MusicSongBean> list, String str2) {
        this.a.put(str, list);
        this.d = str2;
    }

    public void a(final arj arjVar) {
        if (w.f() != 2) {
            aqz.a().b(new avc<MusicSongListBean>() { // from class: apv.1
                @Override // defpackage.avc
                public void a(MusicSongListBean musicSongListBean) {
                    new ArrayList();
                    final List<MusicSongBean> list = musicSongListBean.getData().getList();
                    apv.this.b.clear();
                    apv.this.b.addAll(list);
                    ban.d(new Runnable() { // from class: apv.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arjVar != null) {
                                arjVar.a(z.a(list));
                            }
                        }
                    });
                }

                @Override // defpackage.avc
                public void a(int i, String str) {
                    arj arjVar2 = arjVar;
                    if (arjVar2 != null) {
                        arjVar2.a(null);
                    }
                }
            });
        } else if (arjVar != null) {
            arjVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(String str) {
        if (apk.i().d() == null || !apk.i().d().getHash().equalsIgnoreCase(str)) {
            return -1;
        }
        return apk.i().getPlayState();
    }

    public void a(final String str, final arj arjVar) {
        Call<MusicSearchBean> call = this.e;
        if (call != null) {
            call.cancel();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", str);
        hashMap.put("page", String.valueOf(1));
        hashMap.put("pageSize", String.valueOf(50));
        this.e = ((auz) auu.a("https://xmart.xiaopeng.com/media/v2/music/songs/manualSearch").params(hashMap, new boolean[0])).a(new ava(new avc<MusicSearchBean>() { // from class: apv.2
            @Override // defpackage.avc
            public void a(MusicSearchBean musicSearchBean) {
                ArrayList arrayList = new ArrayList();
                List<MusicSongBean> list = musicSearchBean.getData().getList();
                for (MusicSongBean musicSongBean : list) {
                    MusicInfo a2 = ab.a(musicSongBean);
                    apv.this.c.put(a2.getHash(), a2);
                    SearchResultServiceBean searchResultServiceBean = new SearchResultServiceBean();
                    searchResultServiceBean.c(a2.getSong());
                    searchResultServiceBean.c(a2.isNeedVip());
                    searchResultServiceBean.d(a2.getSinger());
                    searchResultServiceBean.b(1);
                    searchResultServiceBean.b(a2.getPlayCount());
                    searchResultServiceBean.a(a2.getHash());
                    searchResultServiceBean.a(a2.getAlbumId());
                    searchResultServiceBean.a(anv.a().e(a2));
                    searchResultServiceBean.a(apv.this.b(a2.getHash()));
                    searchResultServiceBean.c(a2.getMusicFrom());
                    searchResultServiceBean.b(a2.isSupportSQ());
                    arrayList.add(searchResultServiceBean);
                }
                apv.this.a.put(str, list);
                arj arjVar2 = arjVar;
                if (arjVar2 != null) {
                    arjVar2.a(arrayList, 1, str);
                }
            }

            @Override // defpackage.avc
            public void a(int i, String str2) {
                arj arjVar2 = arjVar;
                if (arjVar2 != null) {
                    arjVar2.a(null, 1, str);
                }
            }
        }));
    }

    public void a(String str, long j, String str2, boolean z) {
        List<MusicSongBean> list = this.a.get(str2);
        if (list != null) {
            for (MusicSongBean musicSongBean : list) {
                if (musicSongBean.getHash().equalsIgnoreCase(str) && musicSongBean.getAlbum() != null && j == musicSongBean.getAlbum().getId()) {
                    if (z) {
                        a(list, musicSongBean, str2);
                        return;
                    }
                    apk.i().b(ab.a(musicSongBean, 40, str2));
                    return;
                }
            }
        }
    }

    private void a(List<MusicSongBean> list, MusicSongBean musicSongBean, String str) {
        if (musicSongBean != null) {
            MusicInfo a2 = ab.a(musicSongBean, 40, str);
            ArrayList<MusicInfo> arrayList = new ArrayList<>();
            for (MusicSongBean musicSongBean2 : list) {
                arrayList.add(ab.a(musicSongBean2, 40, str));
            }
            if (a2 != null) {
                a(arrayList, a2, str);
            }
        }
    }

    private void a(ArrayList<MusicInfo> arrayList, MusicInfo musicInfo, String str) {
        List<MusicInfo> a2 = anx.a().a(str);
        if (a2.size() > 0) {
            arrayList.get(0).setLogo(musicInfo.getLogo());
            anx.a().b(arrayList, str, 0);
        } else {
            a2.addAll(arrayList);
            a2.get(0).setLogo(musicInfo.getLogo());
            anx.a().a(a2, str, 0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<MusicInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ab.a(it.next()));
        }
        apk.i().a(arrayList2, musicInfo, "");
        ah.a(4);
    }
}
