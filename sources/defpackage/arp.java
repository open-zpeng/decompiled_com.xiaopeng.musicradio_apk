package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DailyDataOperation.java */
/* renamed from: arp  reason: default package */
/* loaded from: classes2.dex */
public class arp {
    ArrayList<MusicInfo> a = new ArrayList<>();

    /* compiled from: DailyDataOperation.java */
    /* renamed from: arp$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final arp a = new arp();
    }

    public static arp a() {
        return a.a;
    }

    public ArrayList<MusicInfo> b() {
        return this.a;
    }

    public void a(List<MusicInfo> list) {
        this.a.clear();
        this.a.addAll(list);
    }
}
