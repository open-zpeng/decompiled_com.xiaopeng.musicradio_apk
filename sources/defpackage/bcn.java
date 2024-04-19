package defpackage;

import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
/* compiled from: IInfoTransfer.java */
/* renamed from: bcn  reason: default package */
/* loaded from: classes2.dex */
public interface bcn {
    LatelyMusicInfo a(MusicInfo musicInfo);

    MusicInfo a(LatelyMusicInfo latelyMusicInfo);

    MusicRadioItem a(MusicAlbumCustom musicAlbumCustom);
}
