package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.ListSignBean;
import com.xiaopeng.musicradio.bean.dao.MusicRadioItemDao;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agl;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: MusicRadioOperation.java */
/* renamed from: ams  reason: default package */
/* loaded from: classes2.dex */
public class ams extends apy {
    private MusicRadioItemDao a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MusicRadioOperation.java */
    /* renamed from: ams$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final ams a = new ams();
    }

    public static ams a() {
        return a.a;
    }

    private ams() {
        this.a = aff.a().b().getMusicRadioItemDao();
    }

    public synchronized void a(final MusicRadioItem musicRadioItem) {
        if (musicRadioItem == null) {
            return;
        }
        Log.i("MusicRadioOperation", "recordItem: title:" + musicRadioItem.getTitle() + " name:" + musicRadioItem.getName());
        if (TextUtils.isEmpty(musicRadioItem.getTitle())) {
            musicRadioItem.setTitle("");
        }
        if (TextUtils.isEmpty(musicRadioItem.getName())) {
            musicRadioItem.setTitle("");
        }
        musicRadioItem.setCacheTime(System.currentTimeMillis());
        final String g = g();
        musicRadioItem.setUid(g);
        ban.e(new Runnable() { // from class: ams.1
            @Override // java.lang.Runnable
            public void run() {
                MusicRadioItem a2 = ams.this.a(g, musicRadioItem);
                if (a2 != null) {
                    musicRadioItem.setCacheId(a2.getCacheId());
                }
                ams.this.a.insertOrReplace(musicRadioItem);
                ams.this.b();
                u.c(new agl.c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MusicRadioItem a(String str, MusicRadioItem musicRadioItem) {
        return this.a.queryBuilder().where(MusicRadioItemDao.Properties.Uid.eq(str), MusicRadioItemDao.Properties.Id.eq(Long.valueOf(musicRadioItem.getId())), MusicRadioItemDao.Properties.Type.eq(musicRadioItem.getType())).unique();
    }

    public void b(MusicRadioItem musicRadioItem) {
        List<MusicRadioItem> list = this.a.queryBuilder().where(MusicRadioItemDao.Properties.Uid.eq(g()), MusicRadioItemDao.Properties.Id.eq(Long.valueOf(musicRadioItem.getId())), MusicRadioItemDao.Properties.Type.eq(musicRadioItem.getType())).list();
        if (!list.isEmpty()) {
            this.a.deleteInTx(list);
        }
        u.c(new agl.c());
    }

    public List<MusicRadioItem> a(int i, long j) {
        MusicAlbumCustom a2;
        List<MusicRadioItem> list = a(true).where(MusicRadioItemDao.Properties.CacheTime.lt(Long.valueOf(j)), new WhereCondition[0]).limit(i).list();
        LinkedList linkedList = new LinkedList();
        for (MusicRadioItem musicRadioItem : list) {
            if (ListSignBean.LISTSIGN_RECOMMEN_MUSIC.equals(musicRadioItem.getType()) && (a2 = anu.a().a(musicRadioItem.getId())) != null && (!Objects.equals(musicRadioItem.getTitle(), a2.getName()) || !Objects.equals(musicRadioItem.getLogo(), a2.getLogo()))) {
                musicRadioItem.setTitle(a2.getName());
                musicRadioItem.setName(a2.getName());
                musicRadioItem.setLogo(a2.getLogo());
                musicRadioItem.setLogoUrl(a2.getLogo());
                linkedList.add(musicRadioItem);
            }
        }
        if (!linkedList.isEmpty()) {
            try {
                this.a.updateInTx(linkedList);
            } catch (Throwable th) {
                LogUtils.e("MusicRadioOperation", "getHistoryList:" + th.getMessage());
            }
        }
        return list;
    }

    public void a(final String str, final long j) {
        ban.e(new Runnable() { // from class: ams.2
            @Override // java.lang.Runnable
            public void run() {
                ams amsVar = ams.this;
                List<MusicRadioItem> b = amsVar.b(amsVar.g(), j);
                if (b.isEmpty()) {
                    return;
                }
                for (MusicRadioItem musicRadioItem : b) {
                    musicRadioItem.setLogoUrl(str);
                }
                ams.this.a.updateInTx(b);
                u.c(new agl.c());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int count = (int) a(false).count();
        if (count > 200) {
            int i = count - 200;
            List<MusicRadioItem> list = a(true).offset(200).limit(i).list();
            LogUtils.i("MusicRadioOperation", "checkMax:" + i + ",size=" + list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.a.delete(list.get(i2));
            }
        }
    }

    public QueryBuilder<MusicRadioItem> a(boolean z) {
        QueryBuilder<MusicRadioItem> where = this.a.queryBuilder().where(MusicRadioItemDao.Properties.Uid.eq(g()), MusicRadioItemDao.Properties.Type.in(ListSignBean.LISTSIGN_RECOMMEN_MUSIC, ListSignBean.LISTSIGN_RANK_MUSIC));
        return z ? where.orderDesc(MusicRadioItemDao.Properties.CacheTime) : where;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MusicRadioItem> b(String str, long j) {
        return this.a.queryBuilder().where(MusicRadioItemDao.Properties.Uid.eq(str), MusicRadioItemDao.Properties.Id.eq(Long.valueOf(j))).list();
    }
}
