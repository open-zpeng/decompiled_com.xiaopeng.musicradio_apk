package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.LocalLoveDao;
import com.xiaopeng.musicradio.bean.db.LocalLove;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: LocalLoveOperation.java */
/* renamed from: ans  reason: default package */
/* loaded from: classes2.dex */
public class ans extends apy {
    private HashSet<String> b = new HashSet<>();
    private LocalLoveDao a = aff.a().b().getLocalLoveDao();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalLoveOperation.java */
    /* renamed from: ans$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ans a = new ans();
    }

    public static ans a() {
        return a.a;
    }

    public void a(String str) {
        boolean d = apx.a().d();
        LogUtils.i("LocalLoveOperation", "initCached:isMusicBinded=" + d + ",from=" + str);
        if (d) {
            final String g = g();
            ban.e(new Runnable() { // from class: ans.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        List<LocalLove> list = ans.this.a.queryBuilder().where(LocalLoveDao.Properties.Uid.eq(g), new WhereCondition[0]).list();
                        synchronized (ans.this.b) {
                            for (LocalLove localLove : list) {
                                ans.this.b.add(localLove.getHash());
                            }
                        }
                    } catch (Exception e) {
                        LogUtils.e("LocalLoveOperation", "initCached", e);
                    }
                    u.c(new agq.k());
                }
            });
        }
    }

    public void b() {
        synchronized (this.b) {
            this.b.clear();
        }
    }

    public boolean a(MusicInfo musicInfo) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(musicInfo.getHash());
        }
        return contains;
    }

    private void a(final String str, final String str2) {
        synchronized (this.b) {
            this.b.add(str2);
        }
        ban.e(new Runnable() { // from class: ans.2
            @Override // java.lang.Runnable
            public void run() {
                LocalLove unique = ans.this.a.queryBuilder().where(LocalLoveDao.Properties.Uid.eq(str), LocalLoveDao.Properties.Hash.eq(str2)).unique();
                if (unique == null) {
                    unique = new LocalLove();
                    unique.setUid(str);
                    unique.setHash(str2);
                }
                unique.setCacheTime(System.currentTimeMillis());
                ans.this.a.insertOrReplace(unique);
            }
        });
    }

    private void b(final String str, final String str2) {
        synchronized (this.b) {
            this.b.remove(str2);
        }
        ban.e(new Runnable() { // from class: ans.3
            @Override // java.lang.Runnable
            public void run() {
                LocalLove unique = ans.this.a.queryBuilder().where(LocalLoveDao.Properties.Uid.eq(str), LocalLoveDao.Properties.Hash.eq(str2)).unique();
                if (unique != null) {
                    ans.this.a.deleteInTx(unique);
                }
            }
        });
    }

    public void a(final List<MusicInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        final String g = g();
        ban.e(new Runnable() { // from class: ans.4
            @Override // java.lang.Runnable
            public void run() {
                HashSet hashSet = new HashSet();
                boolean z = false;
                for (MusicInfo musicInfo : list) {
                    boolean a2 = ans.this.a(g, musicInfo);
                    z = z || a2;
                    if (a2) {
                        hashSet.add(musicInfo.getHash());
                    }
                }
                if (z) {
                    u.c(new agq.k(hashSet));
                }
            }
        });
    }

    public void b(final MusicInfo musicInfo) {
        ban.e(new Runnable() { // from class: ans.5
            @Override // java.lang.Runnable
            public void run() {
                ans ansVar = ans.this;
                if (ansVar.a(ansVar.g(), musicInfo)) {
                    u.c(new agq.k(musicInfo.getSongId(), musicInfo.getAlbumId()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, MusicInfo musicInfo) {
        if (musicInfo == null) {
            return false;
        }
        String hash = musicInfo.getHash();
        boolean a2 = a(musicInfo);
        if (a2 && !musicInfo.isHot()) {
            b(str, hash);
            MusicInfo a3 = anv.a().a(hash, false);
            if (a3 != null && a3.getMusicFrom() == 50 && !a3.isAppend()) {
                anv.a().c(musicInfo);
                u.c(new agq.l(musicInfo.getHash(), musicInfo.getAlbumId(), false, musicInfo));
            }
            return true;
        } else if (a2 || !musicInfo.isHot()) {
            return false;
        } else {
            a(str, hash);
            return true;
        }
    }
}
