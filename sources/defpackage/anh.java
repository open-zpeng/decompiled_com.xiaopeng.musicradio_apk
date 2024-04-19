package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.xpbean.user.QqCollectIdTxBean;
import com.xiaopeng.musicradio.bean.xpbean.user.QqSongIdsTxBean;
import com.xiaopeng.musicradio.utils.z;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ReissueInfoFactory.java */
/* renamed from: anh  reason: default package */
/* loaded from: classes2.dex */
public class anh {
    public static ReissueInfo a(MusicInfo musicInfo) {
        QqSongIdsTxBean qqSongIdsTxBean = new QqSongIdsTxBean(musicInfo.getSongId());
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("music_love" + musicInfo.getHash());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/music/user/favourite/addSongs");
        reissueInfo.setType("music_love");
        reissueInfo.setValue(z.a(qqSongIdsTxBean));
        reissueInfo.setReissueType(1);
        return reissueInfo;
    }

    public static ReissueInfo b(MusicInfo musicInfo) {
        QqSongIdsTxBean qqSongIdsTxBean = new QqSongIdsTxBean(musicInfo.getSongId());
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("music_love" + musicInfo.getHash());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/music/user/favourite/deleteSongs");
        reissueInfo.setType("music_love");
        reissueInfo.setReissueType(1);
        reissueInfo.setValue(z.a(qqSongIdsTxBean));
        return reissueInfo;
    }

    public static List<ReissueInfo> a(List<MusicInfo> list) {
        LinkedList linkedList = new LinkedList();
        for (MusicInfo musicInfo : list) {
            String a = z.a(new QqSongIdsTxBean(musicInfo.getSongId()));
            ReissueInfo reissueInfo = new ReissueInfo();
            reissueInfo.setObjectId("music_love" + musicInfo.getHash());
            reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/music/user/favourite/deleteSongs");
            reissueInfo.setType("music_love");
            reissueInfo.setReissueType(1);
            reissueInfo.setValue(a);
            linkedList.add(reissueInfo);
        }
        return linkedList;
    }

    public static ReissueInfo a(MusicAlbumCollect musicAlbumCollect) {
        QqCollectIdTxBean qqCollectIdTxBean = new QqCollectIdTxBean(String.valueOf(musicAlbumCollect.getId()));
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("music_album_love" + musicAlbumCollect.getId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/music/user/favourite/createCollect");
        reissueInfo.setType("music_album_love");
        reissueInfo.setValue(z.a(qqCollectIdTxBean));
        reissueInfo.setReissueType(1);
        return reissueInfo;
    }

    public static ReissueInfo b(MusicAlbumCollect musicAlbumCollect) {
        QqCollectIdTxBean qqCollectIdTxBean = new QqCollectIdTxBean(String.valueOf(musicAlbumCollect.getId()));
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("music_album_love" + musicAlbumCollect.getId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/music/user/favourite/deleteCollect");
        reissueInfo.setType("music_album_love");
        reissueInfo.setValue(z.a(qqCollectIdTxBean));
        reissueInfo.setReissueType(1);
        return reissueInfo;
    }
}
