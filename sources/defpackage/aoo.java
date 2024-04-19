package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicCollectSongListBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agc;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RankHandler.java */
/* renamed from: aoo  reason: default package */
/* loaded from: classes2.dex */
public class aoo extends aok {
    public aoo(amq amqVar) {
        super(amqVar);
    }

    @Override // defpackage.aok
    protected Observable<MusicCollectSongListBean> a(ListSignBean listSignBean, boolean z, int i, int i2) {
        return aqx.b(listSignBean.getCollectId(), listSignBean.getNType(), i, 50);
    }

    @Override // defpackage.aok
    protected void b(ListSignBean listSignBean, boolean z, List<MusicInfo> list, int i, int i2) {
        if (i == 1 && list.size() > 3) {
            int size = list.size();
            if (size >= 3) {
                size = 3;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < size; i3++) {
                MusicInfo musicInfo = list.get(i3);
                MusicRadioItem.SongInfo songInfo = new MusicRadioItem.SongInfo();
                songInfo.setSongName(musicInfo.getSinger() + " - " + musicInfo.getSong());
                arrayList.add(songInfo);
            }
            atj.a().a(listSignBean.getCollectId(), arrayList);
            u.c(new agc.b(arrayList, listSignBean.getCollectId()));
        }
        this.a.a(z, i, i2, list);
    }
}
