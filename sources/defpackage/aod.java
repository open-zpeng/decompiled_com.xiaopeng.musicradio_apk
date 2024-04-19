package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.ab;
import java.util.ArrayList;
/* compiled from: AlbumHandler.java */
/* renamed from: aod  reason: default package */
/* loaded from: classes2.dex */
public class aod extends aoc {
    public aod(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(ListSignBean listSignBean, final boolean z, int i, int i2, int i3, boolean z2) {
        aqz.a().b(listSignBean.getCollectId(), new avc<MusicAlbumSongListBean>() { // from class: aod.1
            @Override // defpackage.avc
            public void a(MusicAlbumSongListBean musicAlbumSongListBean) {
                ArrayList arrayList = new ArrayList();
                for (MusicSongBean musicSongBean : musicAlbumSongListBean.getData().getList()) {
                    MusicInfo a = ab.a(musicSongBean);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                aod.this.a.a(z, 1, 1, arrayList);
            }

            @Override // defpackage.avc
            public void a(int i4, String str) {
                aod.this.a.a(z, i4, str);
            }
        });
    }
}
