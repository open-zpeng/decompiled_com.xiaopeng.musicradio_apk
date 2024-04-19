package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: DailyHandler.java */
/* renamed from: aoi  reason: default package */
/* loaded from: classes2.dex */
public class aoi extends aoc {
    public aoi(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(ListSignBean listSignBean, final boolean z, final int i, int i2, int i3, boolean z2) {
        aqz.a().e(new avc<MusicCollectSongListBean>() { // from class: aoi.1
            @Override // defpackage.avc
            public void a(MusicCollectSongListBean musicCollectSongListBean) {
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
                arp.a().a(arrayList);
                aoi.this.a.a(z, i, musicCollectSongListBean.getData().getPage().getTotalPage(), arrayList);
            }

            @Override // defpackage.avc
            public void a(int i4, String str) {
                aoi.this.a.a(z, i4, str);
            }
        });
    }
}
