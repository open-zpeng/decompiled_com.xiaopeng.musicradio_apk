package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class ReadingInfoDao extends AbstractDao<ReadingInfo, Long> {
    public static final String TABLENAME = "READING_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property AlbumId = new Property(0, Long.TYPE, "albumId", true, "_id");
        public static final Property Sort = new Property(1, String.class, "sort", false, "SORT");
        public static final Property UpdateTime = new Property(2, Long.TYPE, "updateTime", false, "UPDATE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReadingInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public ReadingInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"READING_INFO\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"SORT\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"READING_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ReadingInfo readingInfo) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, readingInfo.getAlbumId());
        String sort = readingInfo.getSort();
        if (sort != null) {
            databaseStatement.bindString(2, sort);
        }
        databaseStatement.bindLong(3, readingInfo.getUpdateTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ReadingInfo readingInfo) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, readingInfo.getAlbumId());
        String sort = readingInfo.getSort();
        if (sort != null) {
            sQLiteStatement.bindString(2, sort);
        }
        sQLiteStatement.bindLong(3, readingInfo.getUpdateTime());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ReadingInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 1;
        return new ReadingInfo(cursor.getLong(i + 0), cursor.isNull(i2) ? null : cursor.getString(i2), cursor.getLong(i + 2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ReadingInfo readingInfo, int i) {
        readingInfo.setAlbumId(cursor.getLong(i + 0));
        int i2 = i + 1;
        readingInfo.setSort(cursor.isNull(i2) ? null : cursor.getString(i2));
        readingInfo.setUpdateTime(cursor.getLong(i + 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(ReadingInfo readingInfo, long j) {
        readingInfo.setAlbumId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ReadingInfo readingInfo) {
        if (readingInfo != null) {
            return Long.valueOf(readingInfo.getAlbumId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ReadingInfo readingInfo) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }
}
