package defpackage;

import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import defpackage.apc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: MusicDataMgr.java */
/* renamed from: amr  reason: default package */
/* loaded from: classes2.dex */
public class amr {
    private String a = "begin";
    private final String b = "JourneyMusicInfo";
    private float c = -1.0f;
    private int d = 8;
    private int e = 0;
    private int f = 1;
    private HashMap<Integer, ArrayList<MusicRadioItem>> g = new HashMap<>();
    private HashMap<String, MusicInfo> h = new HashMap<>();
    private ArrayList<MusicRadioItem> i = new ArrayList<>();
    private final ArrayList<String> j = new ArrayList<>(Arrays.asList("酷狗飙升榜", "酷狗TOP500", "网络红歌榜", "DJ热歌榜", "会员专享热歌榜", "华语新歌榜", "欧美新歌榜", "韩国新歌榜", "日本新歌榜", "粤语新歌榜", "酷狗分享榜", "腾讯音乐人原创榜", "5sing音乐榜", "电音热歌榜", "繁星音乐榜"));
    private final ArrayList<String> k = new ArrayList<>(Arrays.asList("酷狗", "酷狗", "网络", "DJ", "会员专享", "华语", "欧美", "韩国", "日本", "粤语", "酷狗", "腾讯音乐人", "5sing", "电音", "繁星"));
    private final ArrayList<String> l = new ArrayList<>(Arrays.asList("飙升榜", "TOP500", "红歌榜", "热歌榜", "热歌榜", "新歌榜", "新歌榜", "新歌榜", "新歌榜", "新歌榜", "分享榜", "原创榜", "音乐榜", "歌榜", "音乐榜"));
    private List<MusicRadioItem> m = new ArrayList();

    /* compiled from: MusicDataMgr.java */
    /* renamed from: amr$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final amr a = new amr();
    }

    public static amr a() {
        return a.a;
    }

    public ArrayList<MusicInfo> b() {
        ArrayList<MusicInfo> arrayList = new ArrayList<>();
        for (apc.a aVar : apc.a().c()) {
            MusicInfo musicInfo = new MusicInfo();
            musicInfo.setHash(ListSignBean.LOCAL_PREFIX + aVar.b.hashCode());
            musicInfo.setSong(aVar.a);
            musicInfo.setLogo(aVar.c);
            musicInfo.setData(aVar.b);
            musicInfo.setSinger(aVar.d);
            musicInfo.setLrcData("");
            musicInfo.setMusicFrom(60);
            arrayList.add(musicInfo);
        }
        return arrayList;
    }

    public List<MusicRadioItem> c() {
        return this.m;
    }

    public void a(List<MusicRadioItem> list) {
        this.m.clear();
        this.m.addAll(list);
    }
}
