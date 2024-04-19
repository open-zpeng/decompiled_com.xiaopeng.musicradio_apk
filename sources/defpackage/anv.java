package defpackage;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.dao.MusicInfoDao;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: MusicInfoOperation.java */
/* renamed from: anv  reason: default package */
/* loaded from: classes2.dex */
public class anv extends apy {
    private MusicInfoDao a;
    private ConcurrentHashMap<String, MusicInfo> b = new ConcurrentHashMap<>();
    private AtomicBoolean c = new AtomicBoolean(false);
    private AtomicBoolean d = new AtomicBoolean(false);
    private final aoa<MusicInfo> e = new aoa<>("MusicInfoOperation(Collect)", e());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicInfoOperation.java */
    /* renamed from: anv$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final anv a = new anv(aff.a().b().getMusicInfoDao());
    }

    public int e() {
        return 10000;
    }

    public int f() {
        return 10000;
    }

    public static anv a() {
        return b.a;
    }

    public anv(MusicInfoDao musicInfoDao) {
        this.a = musicInfoDao;
    }

    public void b() {
        if (this.c.get() || this.d.get()) {
            return;
        }
        this.d.set(true);
        ban.e(new Runnable() { // from class: anv.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    anv.this.m();
                } catch (Exception e) {
                    LogUtils.e("MusicInfoOperation", "initAllList", e);
                }
                anv.this.d.set(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        long currentTimeMillis = System.currentTimeMillis();
        Log.i("MusicInfoOperation", "initAllList: ================ ");
        List<MusicInfo> n = n();
        Log.i("MusicInfoOperation", "initAllList: deletedLoveList=" + n.size());
        List<MusicInfo> o = o();
        Log.i("MusicInfoOperation", "initAllList: loveList=" + o.size());
        this.c.set(true);
        Log.i("MusicInfoOperation", "initAllList: time=" + (System.currentTimeMillis() - currentTimeMillis));
        d();
        u.c(new agl.a());
    }

    private List<MusicInfo> n() {
        List<MusicInfo> list = this.a.queryBuilder().where(MusicInfoDao.Properties.MusicFrom.eq(0), new WhereCondition[0]).list();
        if (list != null && !list.isEmpty()) {
            for (MusicInfo musicInfo : list) {
                this.b.put(musicInfo.getHash(), musicInfo);
            }
        }
        return list == null ? Collections.emptyList() : list;
    }

    private List<MusicInfo> o() {
        int e = e();
        List<MusicInfo> list = this.a.queryBuilder().where(MusicInfoDao.Properties.MusicFrom.eq(50), new WhereCondition[0]).limit(e).list();
        if (list != null && !list.isEmpty()) {
            for (MusicInfo musicInfo : list) {
                this.b.put(musicInfo.getHash(), musicInfo);
            }
            int size = list.size();
            if (size >= e) {
                a(50, list.get(size - 1).getCreatime());
            }
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        d();
        u.c(new agl.a());
        return list;
    }

    private void a(final int i, final long j) {
        ban.e(new Runnable() { // from class: anv.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                LogUtils.i("MusicInfoOperation", "deleteMax:" + i + ",lastCreateTime=" + j);
                anv.this.a.queryBuilder().where(MusicInfoDao.Properties.MusicFrom.eq(Integer.valueOf(i)), MusicInfoDao.Properties.Creatime.lt(Long.valueOf(j))).buildDelete().executeDeleteWithoutDetachingEntities();
                StringBuilder sb = new StringBuilder();
                sb.append("deleteMax:time=");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                LogUtils.i("MusicInfoOperation", sb.toString());
            }
        });
    }

    private void a(List<MusicInfo> list, List<MusicInfo> list2, int i, List<MusicInfo> list3) {
        while (i < list.size()) {
            MusicInfo musicInfo = list.get(i);
            if (list3 != null && musicInfo.getMusicFrom() == 50) {
                musicInfo.setOldMusicFrom(0);
                list3.add(musicInfo);
            } else {
                list2.add(musicInfo);
            }
            i++;
        }
    }

    public void a(MusicInfo musicInfo) {
        a(musicInfo, false);
    }

    public void a(MusicInfo musicInfo, boolean z) {
        this.b.put(musicInfo.getHash(), musicInfo);
        this.a.insertOrReplace(musicInfo);
        Log.i("MusicInfoOperation", "saveSync: " + musicInfo.getHash() + ",album=" + musicInfo.getAlbumId() + ",from = " + musicInfo.getMusicFrom() + ",updateOnly=" + z);
        d();
        u.c(new agl.a(musicInfo, z));
    }

    public void b(MusicInfo musicInfo) {
        b(musicInfo, false);
    }

    public void b(final MusicInfo musicInfo, final boolean z) {
        this.b.put(musicInfo.getHash(), musicInfo);
        ban.e(new Runnable() { // from class: anv.3
            @Override // java.lang.Runnable
            public void run() {
                Log.i("MusicInfoOperation", "saveAsync: " + musicInfo.getHash() + ",album=" + musicInfo.getAlbumId() + ",musicFrom = " + musicInfo.getMusicFrom() + ",updateOnly=" + z);
                anv.this.a.insertOrReplace(musicInfo);
            }
        });
        d();
        u.c(new agl.a(musicInfo, z));
    }

    private List<MusicInfo> c(List<MusicInfo> list) {
        LinkedList linkedList = new LinkedList();
        for (MusicInfo musicInfo : list) {
            MusicInfo musicInfo2 = this.b.get(musicInfo.getHash());
            if (musicInfo2 == null || !musicInfo2.isAppend() || musicInfo2.getMusicFrom() != 0) {
                linkedList.add(musicInfo);
            }
        }
        Log.i("MusicInfoOperation", "filterInsertList:" + list.size() + ListSignBean.COLLECTID_SUFFIX + linkedList.size());
        return linkedList;
    }

    public void a(List<MusicInfo> list, final boolean z) {
        final List<MusicInfo> c = c(list);
        if (!c.isEmpty()) {
            for (MusicInfo musicInfo : c) {
                this.b.put(musicInfo.getHash(), musicInfo);
            }
            ban.e(new Runnable() { // from class: anv.4
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    anv.this.a.insertOrReplaceInTx(c);
                    Log.i("MusicInfoOperation", "saveAsync:" + c.size() + ListSignBean.COLLECTID_SUFFIX + z + ListSignBean.COLLECTID_SUFFIX + (System.currentTimeMillis() - currentTimeMillis));
                }
            });
        }
        d();
        if (z) {
            u.c(new agl.a());
        }
    }

    public void a(final List<MusicInfo> list) {
        for (MusicInfo musicInfo : list) {
            this.b.remove(musicInfo.getHash());
            Log.i("MusicInfoOperation", "deleteAsync: " + musicInfo.getHash() + " musicFrom = " + musicInfo.getMusicFrom());
        }
        ban.e(new Runnable() { // from class: anv.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    anv.this.a.deleteInTx(list);
                } catch (Exception e) {
                    LogUtils.e("MusicInfoOperation", "deleteAsync", e);
                }
            }
        });
        d();
    }

    public void c(final MusicInfo musicInfo) {
        this.b.remove(musicInfo.getHash());
        ban.e(new Runnable() { // from class: anv.6
            @Override // java.lang.Runnable
            public void run() {
                Log.i("MusicInfoOperation", "deleteAsync: " + musicInfo.getHash() + ",album=" + musicInfo.getAlbumId() + " musicFrom = " + musicInfo.getMusicFrom());
                anv.this.a.delete(musicInfo);
            }
        });
        d();
        u.c(new agl.a(musicInfo));
    }

    public MusicInfo a(String str, boolean z) {
        if (!z) {
            return this.b.get(str);
        }
        return this.a.load(str);
    }

    public MusicInfo a(String str) {
        if (this.b.isEmpty()) {
            return this.a.load(str);
        }
        return this.b.get(str);
    }

    public MusicInfo a(String str, String str2) {
        MusicInfo musicInfo;
        for (Map.Entry<String, MusicInfo> entry : this.b.entrySet()) {
            MusicInfo value = entry.getValue();
            if (str.equals(value.getSong()) && str2.equals(value.getSinger())) {
                return value;
            }
        }
        try {
            musicInfo = this.a.queryBuilder().where(MusicInfoDao.Properties.Song.eq(str), MusicInfoDao.Properties.Singer.eq(str2)).unique();
            if (musicInfo != null) {
                try {
                    this.b.put(musicInfo.getHash(), musicInfo);
                    d();
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    return musicInfo;
                }
            }
        } catch (Exception e2) {
            e = e2;
            musicInfo = null;
        }
        return musicInfo;
    }

    public MusicInfo b(String str) {
        for (Map.Entry<String, MusicInfo> entry : this.b.entrySet()) {
            MusicInfo value = entry.getValue();
            if (str.equals(value.getSearchSongText())) {
                return value;
            }
        }
        MusicInfo musicInfo = null;
        try {
            MusicInfo unique = this.a.queryBuilder().where(MusicInfoDao.Properties.SearchSongText.eq(str), new WhereCondition[0]).unique();
            if (unique != null) {
                try {
                    this.b.put(unique.getHash(), unique);
                    d();
                    return unique;
                } catch (Exception e) {
                    musicInfo = unique;
                    e = e;
                    e.printStackTrace();
                    return musicInfo;
                }
            }
            return unique;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public boolean d(MusicInfo musicInfo) {
        if (musicInfo.isHttpCache()) {
            return apb.a().c(musicInfo);
        }
        return e(musicInfo);
    }

    public boolean e(MusicInfo musicInfo) {
        if (musicInfo == null) {
            return false;
        }
        if (musicInfo.isHot()) {
            return true;
        }
        return c(musicInfo.getHash());
    }

    public boolean a(MusicSongBean musicSongBean) {
        if (musicSongBean != null) {
            if (musicSongBean.isHot()) {
                return true;
            }
            return c(musicSongBean.getHash());
        }
        return false;
    }

    private boolean c(String str) {
        MusicInfo musicInfo;
        if (str == null || (musicInfo = this.b.get(str)) == null) {
            return false;
        }
        return !(musicInfo.getMusicFrom() == 0 && musicInfo.isAppend()) && musicInfo.getMusicFrom() == 50;
    }

    public void c() {
        Log.i("MusicInfoOperation", "deleteAll: ==");
        this.b.clear();
        this.a.deleteAll();
        d();
        u.c(new agl.a());
    }

    public List<MusicInfo> a(int i, boolean z) {
        String g = g();
        List<MusicInfo> a2 = a(i, g);
        if (a2 != null) {
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, MusicInfo> entry : this.b.entrySet()) {
            MusicInfo value = entry.getValue();
            if (value.getMusicFrom() == i || (i != 50 && value.getOldMusicFrom() == i)) {
                arrayList.add(value);
            }
        }
        if (z && !arrayList.isEmpty()) {
            arrayList.sort(new a(i));
            if (i == 50 && arrayList.size() > e()) {
                ArrayList arrayList2 = new ArrayList();
                a(arrayList, arrayList2, e(), null);
                if (!arrayList2.isEmpty()) {
                    Log.i("MusicInfoOperation", "deleteAsync:love:" + arrayList2.size());
                    a(arrayList2);
                }
            }
        }
        a(i, g, arrayList);
        return arrayList;
    }

    private List a(int i, String str) {
        List<MusicInfo> a2;
        if (i != 50 || (a2 = this.e.a(str)) == null) {
            return null;
        }
        return a2;
    }

    private void a(int i, String str, List list) {
        if (i == 50) {
            this.e.a(str, list);
        }
    }

    public void d() {
        this.e.a();
    }

    public void b(List<MusicInfo> list) {
        List<MusicInfo> a2 = a(50, false);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        LinkedList<MusicInfo> linkedList = new LinkedList();
        for (MusicInfo musicInfo : a2) {
            if (!musicInfo.isAppend() && !list.contains(musicInfo)) {
                linkedList.add(musicInfo);
            }
        }
        if (linkedList.isEmpty()) {
            return;
        }
        for (MusicInfo musicInfo2 : linkedList) {
            MusicInfo clone = musicInfo2.clone();
            clone.setMusicFrom(0);
            try {
                this.a.insertOrReplaceInTx(clone);
            } catch (Exception e) {
                LogUtils.e("MusicInfoOperation", "preUpdateCollectMusic:" + e.getMessage());
            }
            this.b.put(clone.getHash(), clone);
            apb.a().a(clone, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MusicInfoOperation.java */
    /* renamed from: anv$a */
    /* loaded from: classes2.dex */
    public static class a implements Comparator<MusicInfo> {
        private int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MusicInfo musicInfo, MusicInfo musicInfo2) {
            if (musicInfo == null || musicInfo2 == null) {
                return 0;
            }
            if (!musicInfo.isAppend() || musicInfo2.isAppend()) {
                if (musicInfo.isAppend() || !musicInfo2.isAppend()) {
                    long creatime = musicInfo.getCreatime();
                    long creatime2 = musicInfo2.getCreatime();
                    int i = this.a;
                    if (i != 50) {
                        if (musicInfo.getMusicFrom() != i && musicInfo.getOldMusicFrom() == i) {
                            creatime = musicInfo.getOldCreateTime();
                        }
                        if (musicInfo2.getMusicFrom() != i && musicInfo2.getOldMusicFrom() == i) {
                            creatime2 = musicInfo2.getOldCreateTime();
                        }
                    }
                    int i2 = (creatime > creatime2 ? 1 : (creatime == creatime2 ? 0 : -1));
                    if (i2 < 0) {
                        return 1;
                    }
                    return i2 > 0 ? -1 : 0;
                }
                return 1;
            }
            return -1;
        }
    }
}
