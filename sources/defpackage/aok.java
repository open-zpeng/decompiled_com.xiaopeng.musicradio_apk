package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.music.b;
import com.xiaopeng.musicradio.utils.ab;
import defpackage.aon;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: MusicCollectPreloadHandler.java */
/* renamed from: aok  reason: default package */
/* loaded from: classes2.dex */
public abstract class aok extends aoc<MusicCollectSongListBean> {
    protected abstract Observable<MusicCollectSongListBean> a(ListSignBean listSignBean, boolean z, int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return -1;
    }

    public aok(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(final ListSignBean listSignBean, final boolean z, final int i, int i2, final int i3, boolean z2) {
        this.b = new aon<>();
        this.b.a(listSignBean, i, i2, 10, i3, z2, new aon.a<MusicCollectSongListBean>() { // from class: aok.1
            @Override // defpackage.aon.a
            public Observable<MusicCollectSongListBean> a(int i4, int i5) {
                return aok.this.a(listSignBean, z, i4, i5);
            }

            @Override // defpackage.aon.a
            public int a(MusicCollectSongListBean musicCollectSongListBean) {
                int b = aok.this.b();
                if (b > 0) {
                    return b;
                }
                if (musicCollectSongListBean.getData().getPage() == null) {
                    return 1;
                }
                return musicCollectSongListBean.getData().getPage().getTotalPage();
            }

            @Override // defpackage.aon.a
            public void a(List<MusicCollectSongListBean> list) {
                int i4;
                int i5;
                Log.i("AbsFindHandler", "responsePageData: size = " + list.size());
                List<MusicInfo> q = apk.i().q();
                HashMap hashMap = new HashMap();
                for (MusicInfo musicInfo : q) {
                    hashMap.put(musicInfo.getHash(), musicInfo);
                }
                TreeMap treeMap = new TreeMap();
                for (MusicCollectSongListBean musicCollectSongListBean : list) {
                    treeMap.put(Integer.valueOf(musicCollectSongListBean.getData().getPage().getPage()), musicCollectSongListBean);
                }
                ArrayList arrayList = new ArrayList();
                int i6 = i3;
                int i7 = i;
                for (Map.Entry entry : treeMap.entrySet()) {
                    MusicCollectSongListBean.DataBean data = ((MusicCollectSongListBean) entry.getValue()).getData();
                    for (MusicSongBean musicSongBean : data.getList()) {
                        MusicInfo a = ab.a(musicSongBean);
                        if (a != null && !hashMap.containsKey(musicSongBean.getHash())) {
                            arrayList.add(a);
                        }
                    }
                    if (data.getPage() != null) {
                        i6 = data.getPage().getTotalPage();
                        i7 = Math.max(data.getPage().getPage(), i);
                    }
                }
                if (arrayList.size() == 0 && i7 == i6) {
                    i5 = i7 - 1;
                    i4 = i5;
                } else {
                    i4 = i6;
                    i5 = i7;
                }
                LogUtils.i("AbsFindHandler", "page = %d, totalPage = %d, resultSize = %d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(arrayList.size()));
                aok.this.a(listSignBean, z, arrayList, i5, i4);
            }

            @Override // defpackage.aon.a
            public void a(ListSignBean listSignBean2, MusicCollectSongListBean musicCollectSongListBean, int i4) {
                List<MusicInfo> q = apk.i().q();
                HashMap hashMap = new HashMap();
                for (MusicInfo musicInfo : q) {
                    hashMap.put(musicInfo.getHash(), musicInfo);
                }
                ArrayList arrayList = new ArrayList();
                for (MusicSongBean musicSongBean : musicCollectSongListBean.getData().getList()) {
                    MusicInfo a = ab.a(musicSongBean);
                    if (a != null && !hashMap.containsKey(musicSongBean.getHash())) {
                        arrayList.add(a);
                    }
                }
                aok.this.b(listSignBean2, z, arrayList, i, i4);
            }

            @Override // defpackage.aon.a
            public void a() {
                aok.this.a.a(z, 101, a.a.getResources().getString(b.f.server_error_tip));
            }
        });
    }

    protected void a(ListSignBean listSignBean, boolean z, List<MusicInfo> list, int i, int i2) {
        this.a.a(z, i, i2, list);
    }

    protected void b(ListSignBean listSignBean, boolean z, List<MusicInfo> list, int i, int i2) {
        Log.i("AbsFindHandler", "responseFirstPageData: size = " + list.size() + " totalPage = " + i2);
        this.a.a(z, i, i2, list);
    }
}
