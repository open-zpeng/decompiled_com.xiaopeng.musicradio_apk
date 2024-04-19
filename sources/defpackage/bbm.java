package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.List;
/* compiled from: UsbMusicRequestManager.java */
/* renamed from: bbm  reason: default package */
/* loaded from: classes2.dex */
public class bbm extends bbn<MusicInfo> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UsbMusicRequestManager.java */
    /* renamed from: bbm$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final bbm a = new bbm();
    }

    @Override // defpackage.bbn
    protected int b() {
        return 1;
    }

    public static bbm a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public String b(MusicInfo musicInfo) {
        return musicInfo == null ? "" : musicInfo.getHash();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean c(MusicInfo musicInfo) {
        Log.i("UsbMusicRequestManager", "shouldRequestLogo: " + musicInfo);
        return musicInfo.isHasParse() && musicInfo.getLogo() == null && !"parse_no_song".equals(musicInfo.getSongId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    public void a(List<baw> list) {
        bbh.a().b(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbn
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public String a(MusicInfo musicInfo) {
        if (TextUtils.isEmpty(musicInfo.getSong())) {
            return null;
        }
        return TextUtils.isEmpty(musicInfo.getSinger()) ? musicInfo.getSong() : String.format("%s %s", musicInfo.getSong(), musicInfo.getSinger());
    }
}
