package defpackage;

import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.TempSheetMusicInfo;
import com.xiaopeng.musicradio.bean.dui.MusicSearchInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: MusicInfoSearchOperation.java */
/* renamed from: anx  reason: default package */
/* loaded from: classes2.dex */
public class anx {
    private int a = 50;
    private ArrayList<MusicSearchInfo> d = new ArrayList<>();
    private ConcurrentHashMap<String, List<MusicInfo>> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Integer> c = new ConcurrentHashMap<>();

    /* compiled from: MusicInfoSearchOperation.java */
    /* renamed from: anx$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final anx a = new anx();
    }

    public static anx a() {
        return a.a;
    }

    public anx() {
        avt.a().a(new Runnable() { // from class: anx.1
            @Override // java.lang.Runnable
            public void run() {
                anx.this.b();
            }
        });
    }

    public void b() {
        for (TempSheetMusicInfo tempSheetMusicInfo : aob.a().b(40)) {
            MusicInfo musicInfo = tempSheetMusicInfo.getMusicInfo();
            int type = tempSheetMusicInfo.getType();
            if (!this.c.containsKey(musicInfo.getMusicFromTitle())) {
                this.c.put(musicInfo.getMusicFromTitle(), Integer.valueOf(type));
            }
            if (this.b.containsKey(musicInfo.getMusicFromTitle())) {
                this.b.get(musicInfo.getMusicFromTitle()).add(musicInfo);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(musicInfo);
                this.b.put(musicInfo.getMusicFromTitle(), arrayList);
            }
        }
        if (this.b.size() > 0) {
            d();
        }
    }

    public void a(List<MusicInfo> list, String str, int i) {
        if (!this.c.containsKey(str)) {
            this.c.put(str, Integer.valueOf(i));
        }
        if (this.d.size() == this.a) {
            ConcurrentHashMap<String, List<MusicInfo>> concurrentHashMap = this.b;
            ArrayList<MusicSearchInfo> arrayList = this.d;
            concurrentHashMap.remove(arrayList.get(arrayList.size() - 1).getMusicFromTitle());
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.c;
            ArrayList<MusicSearchInfo> arrayList2 = this.d;
            concurrentHashMap2.remove(arrayList2.get(arrayList2.size() - 1).getMusicFromTitle());
            aob a2 = aob.a();
            ArrayList<MusicSearchInfo> arrayList3 = this.d;
            a2.a(arrayList3.get(arrayList3.size() - 1).getMusicFromTitle());
            ArrayList<MusicSearchInfo> arrayList4 = this.d;
            arrayList4.remove(arrayList4.get(arrayList4.size() - 1));
        }
        if (this.b.containsKey(str)) {
            aob.a().a(list, i);
            this.b.remove(str);
        } else {
            aob.a().a(list, i);
        }
        for (MusicInfo musicInfo : list) {
            if (this.b.containsKey(musicInfo.getMusicFromTitle())) {
                this.b.get(musicInfo.getMusicFromTitle()).add(musicInfo);
            } else {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(musicInfo);
                this.b.put(musicInfo.getMusicFromTitle(), arrayList5);
            }
        }
        d();
    }

    public void b(List<MusicInfo> list, String str, int i) {
        if (this.b.containsKey(str)) {
            aob.a().a(str);
            aob.a().a(list, i);
            this.b.remove(str);
            this.b.put(str, list);
            d();
            return;
        }
        a(list, str, i);
    }

    private void d() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            String obj = str.toString();
            List<MusicInfo> list = this.b.get(obj);
            MusicSearchInfo musicSearchInfo = new MusicSearchInfo();
            musicSearchInfo.setMusicFromTitle(obj);
            musicSearchInfo.setCreatTime(list.get(0).getCreatime());
            musicSearchInfo.setLogo(list.get(0).getLogo());
            musicSearchInfo.setMusicInfos(list);
            ConcurrentHashMap<String, Integer> concurrentHashMap = this.c;
            if (concurrentHashMap != null && concurrentHashMap.containsKey(obj)) {
                musicSearchInfo.setType(this.c.get(obj).intValue());
            } else {
                musicSearchInfo.setType(0);
            }
            arrayList.add(musicSearchInfo);
        }
        Collections.sort(arrayList);
        this.d.clear();
        this.d.addAll(arrayList);
    }

    public List<MusicInfo> a(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        return new ArrayList();
    }

    public void c() {
        ConcurrentHashMap<String, List<MusicInfo>> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.c;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        ArrayList<MusicSearchInfo> arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
