package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import java.util.HashMap;
import java.util.List;
/* compiled from: RankDataOperation.java */
/* renamed from: atj  reason: default package */
/* loaded from: classes2.dex */
public class atj {
    private HashMap<Long, List<MusicRadioItem.SongInfo>> a = new HashMap<>();
    private HashMap<Long, String> b = new HashMap<>();

    /* compiled from: RankDataOperation.java */
    /* renamed from: atj$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final atj a = new atj();
    }

    public static atj a() {
        return a.a;
    }

    public void a(long j, List<MusicRadioItem.SongInfo> list) {
        this.a.put(Long.valueOf(j), list);
    }

    public List<MusicRadioItem.SongInfo> a(long j) {
        if (this.a.containsKey(Long.valueOf(j))) {
            return this.a.get(Long.valueOf(j));
        }
        return null;
    }

    public void a(long j, String str) {
        this.b.put(Long.valueOf(j), str);
    }

    public String b(long j) {
        if (this.b.containsKey(Long.valueOf(j))) {
            return this.b.get(Long.valueOf(j));
        }
        return null;
    }
}
