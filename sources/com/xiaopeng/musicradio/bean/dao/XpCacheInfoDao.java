package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lzy.okgo.cache.CacheEntity;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class XpCacheInfoDao extends AbstractDao<XpCacheInfo, String> {
    public static final String TABLENAME = "XP_CACHE_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Key = new Property(0, String.class, CacheEntity.KEY, true, "KEY");
        public static final Property Value = new Property(1, String.class, "value", false, "VALUE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public XpCacheInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public XpCacheInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"XP_CACHE_INFO\" (\"KEY\" TEXT PRIMARY KEY NOT NULL ,\"VALUE\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"XP_CACHE_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, XpCacheInfo xpCacheInfo) {
        databaseStatement.clearBindings();
        String key = xpCacheInfo.getKey();
        if (key != null) {
            databaseStatement.bindString(1, key);
        }
        String value = xpCacheInfo.getValue();
        if (value != null) {
            databaseStatement.bindString(2, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, XpCacheInfo xpCacheInfo) {
        sQLiteStatement.clearBindings();
        String key = xpCacheInfo.getKey();
        if (key != null) {
            sQLiteStatement.bindString(1, key);
        }
        String value = xpCacheInfo.getValue();
        if (value != null) {
            sQLiteStatement.bindString(2, value);
        }
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public XpCacheInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        return new XpCacheInfo(cursor.isNull(i2) ? null : cursor.getString(i2), cursor.isNull(i3) ? null : cursor.getString(i3));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, XpCacheInfo xpCacheInfo, int i) {
        int i2 = i + 0;
        xpCacheInfo.setKey(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        xpCacheInfo.setValue(cursor.isNull(i3) ? null : cursor.getString(i3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(XpCacheInfo xpCacheInfo, long j) {
        return xpCacheInfo.getKey();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(XpCacheInfo xpCacheInfo) {
        if (xpCacheInfo != null) {
            return xpCacheInfo.getKey();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(XpCacheInfo xpCacheInfo) {
        return xpCacheInfo.getKey() != null;
    }
}
