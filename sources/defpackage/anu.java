package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.lib.utils.MD5Utils;
import com.xiaopeng.musicradio.bean.dao.MusicAlbumCustomDao;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.z;
import defpackage.ark;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: MusicCustomOperation.java */
/* renamed from: anu  reason: default package */
/* loaded from: classes2.dex */
public class anu extends apy {
    private HashMap<Long, MusicAlbumCustom> b = new HashMap<>();
    private MusicAlbumCustomDao a = aff.a().b().getMusicAlbumCustomDao();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicCustomOperation.java */
    /* renamed from: anu$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final anu a = new anu();
    }

    public static anu a() {
        return a.a;
    }

    public List<MusicAlbumCustom> a(int i, long j) {
        return this.a.queryBuilder().where(MusicAlbumCustomDao.Properties.Uid.eq(g()), MusicAlbumCustomDao.Properties.CacheTime.lt(Long.valueOf(j))).orderDesc(MusicAlbumCustomDao.Properties.CacheTime).limit(i).list();
    }

    public void a(final String str, final List<MusicAlbumCustom> list, final boolean z) {
        ban.e(new Runnable() { // from class: anu.1
            @Override // java.lang.Runnable
            public void run() {
                String a2 = anu.this.a(str);
                String a3 = afk.a().a(a2);
                String md5 = MD5Utils.getMD5(z.a(list));
                if (a3 != null && a3.equals(md5)) {
                    LogUtils.i("MusicCustomOperation", "save:TYPE_NO_UPDATED:" + list.size());
                    u.c(new ark.i(0, z));
                    return;
                }
                anu.this.a.queryBuilder().where(MusicAlbumCustomDao.Properties.Uid.eq(str), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
                anu.this.a.detachAll();
                anu.this.a.insertOrReplaceInTx(list);
                afk.a().a(a2, md5);
                anu.this.a(list);
                u.c(new ark.i(1));
                LogUtils.i("MusicCustomOperation", "save:TYPE_UPDATED:" + list.size());
            }
        });
    }

    public String a(String str) {
        return "mobile_custom_hash_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MusicAlbumCustom> list) {
        synchronized (this.b) {
            this.b.clear();
            for (MusicAlbumCustom musicAlbumCustom : list) {
                this.b.put(Long.valueOf(musicAlbumCustom.getId()), musicAlbumCustom);
            }
        }
    }

    public MusicAlbumCustom a(long j) {
        MusicAlbumCustom musicAlbumCustom;
        synchronized (this.b) {
            musicAlbumCustom = this.b.get(Long.valueOf(j));
        }
        return musicAlbumCustom;
    }

    public boolean b(long j) {
        boolean z;
        synchronized (this.b) {
            z = this.b.get(Long.valueOf(j)) != null;
        }
        return z;
    }

    public void b(String str) {
        boolean d = apx.a().d();
        LogUtils.i("MusicCustomOperation", "initCached:isMusicBinded=" + d + ",from=" + str);
        if (d) {
            final String g = g();
            ban.e(new Runnable() { // from class: anu.2
                @Override // java.lang.Runnable
                public void run() {
                    anu.this.a(anu.this.a.queryBuilder().where(MusicAlbumCustomDao.Properties.Uid.eq(g), new WhereCondition[0]).list());
                }
            });
        }
    }
}
