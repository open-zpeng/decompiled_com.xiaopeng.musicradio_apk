package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lzy.okgo.cache.CacheEntity;
import com.xiaopeng.musicradio.bean.db.SearchHistoryBean;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class SearchHistoryBeanDao extends AbstractDao<SearchHistoryBean, Long> {
    public static final String TABLENAME = "SEARCH_HISTORY_BEAN";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property Key = new Property(1, String.class, CacheEntity.KEY, false, "KEY");
        public static final Property KeyPinYin = new Property(2, String.class, "keyPinYin", false, "KEY_PIN_YIN");
        public static final Property UpdateTs = new Property(3, Long.class, "updateTs", false, "UPDATE_TS");
        public static final Property SysUid = new Property(4, Long.TYPE, "sysUid", false, "SYS_UID");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public SearchHistoryBeanDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public SearchHistoryBeanDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"SEARCH_HISTORY_BEAN\" (\"_id\" INTEGER PRIMARY KEY ,\"KEY\" TEXT NOT NULL ,\"KEY_PIN_YIN\" TEXT,\"UPDATE_TS\" INTEGER,\"SYS_UID\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"SEARCH_HISTORY_BEAN\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, SearchHistoryBean searchHistoryBean) {
        databaseStatement.clearBindings();
        Long id = searchHistoryBean.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        databaseStatement.bindString(2, searchHistoryBean.getKey());
        String keyPinYin = searchHistoryBean.getKeyPinYin();
        if (keyPinYin != null) {
            databaseStatement.bindString(3, keyPinYin);
        }
        Long updateTs = searchHistoryBean.getUpdateTs();
        if (updateTs != null) {
            databaseStatement.bindLong(4, updateTs.longValue());
        }
        databaseStatement.bindLong(5, searchHistoryBean.getSysUid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, SearchHistoryBean searchHistoryBean) {
        sQLiteStatement.clearBindings();
        Long id = searchHistoryBean.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        sQLiteStatement.bindString(2, searchHistoryBean.getKey());
        String keyPinYin = searchHistoryBean.getKeyPinYin();
        if (keyPinYin != null) {
            sQLiteStatement.bindString(3, keyPinYin);
        }
        Long updateTs = searchHistoryBean.getUpdateTs();
        if (updateTs != null) {
            sQLiteStatement.bindLong(4, updateTs.longValue());
        }
        sQLiteStatement.bindLong(5, searchHistoryBean.getSysUid());
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
    public SearchHistoryBean readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        String string = cursor.getString(i + 1);
        int i3 = i + 2;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 3;
        return new SearchHistoryBean(valueOf, string, string2, cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)), cursor.getLong(i + 4));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, SearchHistoryBean searchHistoryBean, int i) {
        int i2 = i + 0;
        searchHistoryBean.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        searchHistoryBean.setKey(cursor.getString(i + 1));
        int i3 = i + 2;
        searchHistoryBean.setKeyPinYin(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        searchHistoryBean.setUpdateTs(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        searchHistoryBean.setSysUid(cursor.getLong(i + 4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(SearchHistoryBean searchHistoryBean, long j) {
        searchHistoryBean.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(SearchHistoryBean searchHistoryBean) {
        if (searchHistoryBean != null) {
            return searchHistoryBean.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(SearchHistoryBean searchHistoryBean) {
        return searchHistoryBean.getId() != null;
    }
}
