package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.TempSheetMusicInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: MusicInfoPhoneImportOperation.java */
/* renamed from: anw  reason: default package */
/* loaded from: classes2.dex */
public class anw {
    private HashMap<String, List<MusicInfo>> a = new HashMap<>();

    /* compiled from: MusicInfoPhoneImportOperation.java */
    /* renamed from: anw$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final anw a = new anw();
    }

    public static anw a() {
        return a.a;
    }

    public anw() {
        avt.a().a(new Runnable() { // from class: anw.1
            @Override // java.lang.Runnable
            public void run() {
                anw.this.b();
            }
        });
    }

    public void b() {
        for (TempSheetMusicInfo tempSheetMusicInfo : aob.a().b(35)) {
            MusicInfo musicInfo = tempSheetMusicInfo.getMusicInfo();
            tempSheetMusicInfo.getType();
            if (this.a.containsKey(musicInfo.getMusicFromTitle())) {
                this.a.get(musicInfo.getMusicFromTitle()).add(musicInfo);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(musicInfo);
                this.a.put(musicInfo.getMusicFromTitle(), arrayList);
            }
        }
    }

    public void c() {
        HashMap<String, List<MusicInfo>> hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
