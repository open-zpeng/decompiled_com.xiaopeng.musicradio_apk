package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.bean.xpbean.SongListBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ab;
import defpackage.aon;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: CollectMusicHandler.java */
/* renamed from: aoh  reason: default package */
/* loaded from: classes2.dex */
public class aoh extends aoc {
    public aoh(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(ListSignBean listSignBean, final boolean z, final int i, int i2, final int i3, boolean z2) {
        this.b = new aon<>();
        this.b.a(listSignBean, i, i2, 10, i3, z2, new aon.a<SongListBean>() { // from class: aoh.1
            @Override // defpackage.aon.a
            public Observable<SongListBean> a(int i4, int i5) {
                return anf.a(i4, i5);
            }

            @Override // defpackage.aon.a
            public int a(SongListBean songListBean) {
                if (songListBean.getData().getPage() == null) {
                    return 1;
                }
                return songListBean.getData().getPage().getTotalPage();
            }

            @Override // defpackage.aon.a
            public void a(List<SongListBean> list) {
                TreeMap treeMap = new TreeMap();
                for (SongListBean songListBean : list) {
                    treeMap.put(Integer.valueOf(songListBean.getData().getPage().getPage()), songListBean);
                }
                ArrayList arrayList = new ArrayList();
                int i4 = i3;
                int i5 = i;
                for (Map.Entry entry : treeMap.entrySet()) {
                    SongListBean.DataBean data = ((SongListBean) entry.getValue()).getData();
                    for (MusicSongBean musicSongBean : data.getList()) {
                        MusicInfo b = ab.b(musicSongBean);
                        if (b != null) {
                            arrayList.add(b);
                        }
                    }
                    if (data.getPage() != null) {
                        i4 = data.getPage().getTotalPage();
                        i5 = Math.max(data.getPage().getPage(), i);
                    }
                }
                LogUtils.i("AbsFindHandler", "page = %d, totalPage = %d, resultSize = %d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(arrayList.size()));
                aoh.this.a.a(z, i5, i4, arrayList);
            }

            @Override // defpackage.aon.a
            public void a(ListSignBean listSignBean2, SongListBean songListBean, int i4) {
                ArrayList arrayList = new ArrayList();
                for (MusicSongBean musicSongBean : songListBean.getData().getList()) {
                    MusicInfo b = ab.b(musicSongBean);
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                aoh.this.a.a(z, i, i4, arrayList);
            }

            @Override // defpackage.aon.a
            public void a() {
                aoh.this.a.a(z, 101, a.a.getResources().getString(b.f.server_error_tip));
            }
        });
    }
}
