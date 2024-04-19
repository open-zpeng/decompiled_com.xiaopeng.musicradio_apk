package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicAlbumSongListBean;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.ab;
import java.util.ArrayList;
/* compiled from: PhoneMusicHandler.java */
/* renamed from: aom  reason: default package */
/* loaded from: classes2.dex */
public class aom extends aoc {
    public aom(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aoj
    public void a(ListSignBean listSignBean, final boolean z, int i, int i2, int i3, boolean z2) {
        aqz.a().a(listSignBean.getCollectId(), listSignBean.getNType(), new avc<MusicAlbumSongListBean>() { // from class: aom.1
            @Override // defpackage.avc
            public void a(MusicAlbumSongListBean musicAlbumSongListBean) {
                ArrayList arrayList = new ArrayList();
                for (MusicSongBean musicSongBean : musicAlbumSongListBean.getData().getList()) {
                    MusicInfo a = ab.a(musicSongBean);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                aom.this.a.a(z, 1, 1, arrayList);
            }

            @Override // defpackage.avc
            public void a(int i4, String str) {
                aom.this.a.a(z, i4, str);
            }
        });
    }
}
