package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.xpbean.CollectListBean;
/* compiled from: BizTransferUtil.java */
/* renamed from: ang  reason: default package */
/* loaded from: classes2.dex */
public class ang {
    public static MusicAlbumCollect a(CollectListBean.DataBean.ListBean listBean) {
        MusicAlbumCollect musicAlbumCollect = new MusicAlbumCollect();
        musicAlbumCollect.setCreateTime(listBean.getCreateTime());
        musicAlbumCollect.setType(4);
        musicAlbumCollect.setName(listBean.getName());
        musicAlbumCollect.setDescription(listBean.getDescription());
        musicAlbumCollect.setLogo(listBean.getLogo());
        musicAlbumCollect.setId(listBean.getId());
        return musicAlbumCollect;
    }

    public static MusicAlbumCustom b(CollectListBean.DataBean.ListBean listBean) {
        MusicAlbumCustom musicAlbumCustom = new MusicAlbumCustom();
        musicAlbumCustom.setCreateTime(listBean.getCreateTime());
        musicAlbumCustom.setName(listBean.getName());
        musicAlbumCustom.setLogo(listBean.getLogo());
        musicAlbumCustom.setId(listBean.getId());
        return musicAlbumCustom;
    }
}
