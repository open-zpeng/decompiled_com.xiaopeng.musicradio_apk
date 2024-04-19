package defpackage;

import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.utils.z;
/* compiled from: ReissueInfoFactory.java */
/* renamed from: ano  reason: default package */
/* loaded from: classes2.dex */
public class ano {
    public static ReissueInfo a(ReadLoveInfo readLoveInfo) {
        ann annVar = new ann(readLoveInfo.getAlbumId());
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("read_love" + readLoveInfo.getAlbumId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/addAlbum");
        reissueInfo.setType("read_love");
        reissueInfo.setValue(z.a(annVar));
        reissueInfo.setReissueType(2);
        return reissueInfo;
    }

    public static ReissueInfo b(ReadLoveInfo readLoveInfo) {
        ann annVar = new ann(readLoveInfo.getAlbumId());
        ReissueInfo reissueInfo = new ReissueInfo();
        reissueInfo.setObjectId("read_love" + readLoveInfo.getAlbumId());
        reissueInfo.setUrl("https://xmart.xiaopeng.com/media/v3/reading/user/favourite/cancelAlbum");
        reissueInfo.setType("read_love");
        reissueInfo.setValue(z.a(annVar));
        reissueInfo.setReissueType(2);
        return reissueInfo;
    }
}
