package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.LocalLove;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class LocalLoveDao extends AbstractDao<LocalLove, Long> {
    public static final String TABLENAME = "LOCAL_LOVE";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property CacheId = new Property(0, Long.class, "cacheId", true, "_id");
        public static final Property Hash = new Property(1, String.class, "hash", false, "HASH");
        public static final Property Uid = new Property(2, String.class, "uid", false, "UID");
        public static final Property CacheTime = new Property(3, Long.TYPE, "cacheTime", false, "CACHE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LocalLoveDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public LocalLoveDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"LOCAL_LOVE\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"HASH\" TEXT,\"UID\" TEXT,\"CACHE_TIME\" INTEGER NOT NULL );");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_LOCAL_LOVE_HASH_UID ON LOCAL_LOVE (\"HASH\" ASC,\"UID\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"LOCAL_LOVE\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, LocalLove localLove) {
        databaseStatement.clearBindings();
        Long cacheId = localLove.getCacheId();
        if (cacheId != null) {
            databaseStatement.bindLong(1, cacheId.longValue());
        }
        String hash = localLove.getHash();
        if (hash != null) {
            databaseStatement.bindString(2, hash);
        }
        String uid = localLove.getUid();
        if (uid != null) {
            databaseStatement.bindString(3, uid);
        }
        databaseStatement.bindLong(4, localLove.getCacheTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, LocalLove localLove) {
        sQLiteStatement.clearBindings();
        Long cacheId = localLove.getCacheId();
        if (cacheId != null) {
            sQLiteStatement.bindLong(1, cacheId.longValue());
        }
        String hash = localLove.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(2, hash);
        }
        String uid = localLove.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(3, uid);
        }
        sQLiteStatement.bindLong(4, localLove.getCacheTime());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public LocalLove readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        return new LocalLove(valueOf, string, cursor.isNull(i4) ? null : cursor.getString(i4), cursor.getLong(i + 3));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, LocalLove localLove, int i) {
        int i2 = i + 0;
        localLove.setCacheId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        localLove.setHash(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        localLove.setUid(cursor.isNull(i4) ? null : cursor.getString(i4));
        localLove.setCacheTime(cursor.getLong(i + 3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(LocalLove localLove, long j) {
        localLove.setCacheId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(LocalLove localLove) {
        if (localLove != null) {
            return localLove.getCacheId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(LocalLove localLove) {
        return localLove.getCacheId() != null;
    }
}
