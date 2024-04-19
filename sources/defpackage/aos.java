package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.utils.ab;
import com.xiaopeng.musicradio.utils.ad;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MusicHistoryManager.java */
/* renamed from: aos  reason: default package */
/* loaded from: classes2.dex */
public class aos {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicHistoryManager.java */
    /* renamed from: aos$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aos a = new aos();
    }

    public static aos a() {
        return a.a;
    }

    public void a(final MusicInfo musicInfo) {
        if (musicInfo == null || TextUtils.isEmpty(musicInfo.getHash())) {
            LogUtils.d("MusicHistoryManager", "musicInfo null or hash null!");
        } else if (musicInfo.getMusicFrom() == 61) {
            LogUtils.d("MusicHistoryManager", "musicInfo MUSIC_FROM_USB");
        } else {
            ban.e(new Runnable() { // from class: aos.1
                @Override // java.lang.Runnable
                public void run() {
                    MusicUrlInfo a2;
                    LogUtils.i("MusicHistoryManager", "saveHistory: " + musicInfo);
                    MusicUrlInfo c = ab.c(musicInfo);
                    if (TextUtils.isEmpty(c.getUrl()) && (a2 = anz.a().a(musicInfo.getHash())) != null) {
                        c.setUrl(a2.getUrl());
                    }
                    anz.a().a(c);
                    anr.a().a(ab.b(musicInfo));
                }
            });
        }
    }

    public void a(List<MusicInfo> list) {
        LogUtils.i("MusicHistoryManager", "removeMusicHistory: " + list.size());
        final ArrayList arrayList = new ArrayList();
        for (MusicInfo musicInfo : list) {
            arrayList.add(musicInfo.getHash());
        }
        anr.a().b(arrayList);
        ban.e(new Runnable() { // from class: aos.2
            @Override // java.lang.Runnable
            public void run() {
                for (String str : arrayList) {
                    MusicUrlInfo a2 = anz.a().a(str);
                    if (a2 != null && !TextUtils.isEmpty(a2.getUrl())) {
                        apk.i().c(a2.getUrl());
                    }
                }
            }
        });
    }

    public void b() {
        int c = aei.a().c();
        boolean z = true;
        MusicInfo musicInfo = null;
        if (c == 0) {
            musicInfo = apk.i().d();
            if (musicInfo != null) {
                z = false;
            }
        } else if (c != -1) {
            z = false;
        }
        LogUtils.i("MusicHistoryManager", "tryRefreshPlayingInfo:audioType=" + c + ",musicInfo=" + musicInfo);
        if (z) {
            c();
        }
    }

    private void c() {
        ban.e(new Runnable() { // from class: aos.3
            @Override // java.lang.Runnable
            public void run() {
                List<LatelyMusicInfo> b = anr.a().b();
                if (b == null || b.isEmpty()) {
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                for (LatelyMusicInfo latelyMusicInfo : b) {
                    arrayList.add(ab.a(latelyMusicInfo));
                }
                final String b2 = ad.b(10);
                ban.g(new Runnable() { // from class: aos.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        apk i = apk.i();
                        List<MusicInfo> list = arrayList;
                        i.a(list, list.get(0), b2, false);
                    }
                });
            }
        });
    }
}
