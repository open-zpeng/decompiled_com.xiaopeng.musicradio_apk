package defpackage;

import android.text.TextUtils;
import com.xiaopeng.musicradio.bean.dao.XpCacheInfoDao;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: XpCacheOperation.java */
/* renamed from: afk  reason: default package */
/* loaded from: classes2.dex */
public class afk {
    private XpCacheInfoDao a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XpCacheOperation.java */
    /* renamed from: afk$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final afk a = new afk(aff.a().b().getXpCacheInfoDao());
    }

    public static afk a() {
        return a.a;
    }

    public afk(XpCacheInfoDao xpCacheInfoDao) {
        this.a = xpCacheInfoDao;
    }

    public void a(String str, String str2) {
        XpCacheInfo xpCacheInfo = new XpCacheInfo();
        xpCacheInfo.setKey(str);
        xpCacheInfo.setValue(str2);
        this.a.insertOrReplace(xpCacheInfo);
    }

    public void b(final String str, final String str2) {
        ban.e(new Runnable() { // from class: afk.1
            @Override // java.lang.Runnable
            public void run() {
                XpCacheInfo xpCacheInfo = new XpCacheInfo();
                xpCacheInfo.setKey(str);
                xpCacheInfo.setValue(str2);
                afk.this.a.insertOrReplace(xpCacheInfo);
            }
        });
    }

    public String a(String str) {
        XpCacheInfo load = this.a.load(str);
        if (load == null) {
            return null;
        }
        return load.getValue();
    }

    public void b() {
        ban.e(new Runnable() { // from class: afk.2
            @Override // java.lang.Runnable
            public void run() {
                afk.this.a.queryBuilder().where(XpCacheInfoDao.Properties.Key.like("%music_data_%"), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
            }
        });
    }

    public void c() {
        this.a.deleteAll();
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.deleteByKey(str);
    }
}
