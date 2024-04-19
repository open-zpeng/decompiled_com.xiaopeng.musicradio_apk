package defpackage;

import android.util.Log;
import androidx.lifecycle.n;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.MD5Utils;
import com.xiaopeng.musicradio.bean.dao.MusicAlbumCollectDao;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.agq;
import defpackage.ark;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: MusicAlbumOperation.java */
/* renamed from: ant  reason: default package */
/* loaded from: classes2.dex */
public class ant extends apy {
    private HashSet<Long> b = new HashSet<>();
    private MusicAlbumCollectDao a = aff.a().b().getMusicAlbumCollectDao();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicAlbumOperation.java */
    /* renamed from: ant$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ant a = new ant();
    }

    public static ant a() {
        return a.a;
    }

    public void a(String str) {
        boolean d = apx.a().d();
        LogUtils.i("MusicAlbumOperation", "initCached:isMusicBinded=" + d + ",from=" + str);
        if (d) {
            final String g = g();
            ban.e(new Runnable() { // from class: ant.1
                @Override // java.lang.Runnable
                public void run() {
                    List<MusicAlbumCollect> list = ant.this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Type.eq(4), MusicAlbumCollectDao.Properties.Uid.eq(g)).list();
                    HashSet hashSet = new HashSet();
                    for (MusicAlbumCollect musicAlbumCollect : list) {
                        hashSet.add(Long.valueOf(musicAlbumCollect.getId()));
                    }
                    ant.this.a(hashSet);
                }
            });
        }
    }

    public void a(final String str, final List<MusicAlbumCollect> list, final HashSet<Long> hashSet, final boolean z) {
        ban.e(new Runnable() { // from class: ant.2
            @Override // java.lang.Runnable
            public void run() {
                String b = ant.this.b(str);
                String a2 = afk.a().a(b);
                String md5 = MD5Utils.getMD5(z.a(list));
                if (a2 != null && a2.equals(md5)) {
                    u.c(new ark.a(0, z));
                    LogUtils.i("MusicAlbumOperation", "saveCollectedList:TYPE_NO_UPDATED:" + list.size());
                    return;
                }
                ant.this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Uid.eq(str), new WhereCondition[0]).where(MusicAlbumCollectDao.Properties.Type.eq(4), new WhereCondition[0]).where(MusicAlbumCollectDao.Properties.Append.notEq(true), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
                ant.this.a.detachAll();
                ant.this.a.insertOrReplaceInTx(list);
                afk.a().a(b, md5);
                ant.this.a(hashSet);
                u.c(new ark.a(1));
                LogUtils.i("MusicAlbumOperation", "saveCollectedList:TYPE_UPDATED:" + list.size());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashSet<Long> hashSet) {
        synchronized (this.b) {
            this.b.clear();
            this.b.addAll(hashSet);
        }
        u.c(new agq.f(-1L, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.b) {
            this.b.add(Long.valueOf(j));
        }
        u.c(new agq.f(j, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        synchronized (this.b) {
            this.b.remove(Long.valueOf(j));
        }
        u.c(new agq.f(j, false));
    }

    public void a(final MusicAlbumCollect musicAlbumCollect, final n<Boolean> nVar) {
        ban.e(new Runnable() { // from class: ant.3
            @Override // java.lang.Runnable
            public void run() {
                MusicAlbumCollect unique = ant.this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Id.eq(Long.valueOf(musicAlbumCollect.getId())), MusicAlbumCollectDao.Properties.Uid.eq(musicAlbumCollect.getUid()), MusicAlbumCollectDao.Properties.Type.eq(Integer.valueOf(musicAlbumCollect.getType()))).unique();
                if (unique != null) {
                    musicAlbumCollect.setCacheId(unique.getCacheId());
                }
                ant.this.a.insertOrReplace(musicAlbumCollect);
                ant.this.b(musicAlbumCollect.getId());
                n nVar2 = nVar;
                if (nVar2 != null) {
                    nVar2.a((n) true);
                }
            }
        });
    }

    public void b(final MusicAlbumCollect musicAlbumCollect, final n<Boolean> nVar) {
        final String g = g();
        ban.e(new Runnable() { // from class: ant.4
            @Override // java.lang.Runnable
            public void run() {
                List<MusicAlbumCollect> list = ant.this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Id.eq(Long.valueOf(musicAlbumCollect.getId())), MusicAlbumCollectDao.Properties.Type.eq(4), MusicAlbumCollectDao.Properties.Uid.eq(g)).list();
                if (!list.isEmpty()) {
                    ant.this.a.deleteInTx(list);
                }
                ant.this.c(musicAlbumCollect.getId());
                n nVar2 = nVar;
                if (nVar2 != null) {
                    nVar2.a((n) true);
                }
            }
        });
    }

    public boolean a(long j) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(Long.valueOf(j));
        }
        return contains;
    }

    public long b() {
        return this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Uid.eq(g()), MusicAlbumCollectDao.Properties.Type.eq(4)).count();
    }

    public List<MusicAlbumCollect> a(int i, long j, Property property) {
        return this.a.queryBuilder().where(MusicAlbumCollectDao.Properties.Uid.eq(g()), MusicAlbumCollectDao.Properties.Type.eq(4), MusicAlbumCollectDao.Properties.CacheTime.lt(Long.valueOf(j))).orderDesc(property).limit(i).list();
    }

    public String b(String str) {
        return "col_album_hash_" + str;
    }

    public void c() {
        Log.i("MusicAlbumOperation", "deleteAll: ==");
        synchronized (this.b) {
            this.b.clear();
        }
        this.a.deleteAll();
        u.c(new ark.a(1));
    }
}
