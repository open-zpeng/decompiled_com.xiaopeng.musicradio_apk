package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class MusicAlbumCustomDao extends AbstractDao<MusicAlbumCustom, Long> {
    public static final String TABLENAME = "MUSIC_ALBUM_CUSTOM";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property CacheId = new Property(0, Long.class, "cacheId", true, "_id");
        public static final Property Uid = new Property(1, String.class, "uid", false, "UID");
        public static final Property Id = new Property(2, Long.TYPE, "id", false, DataTypes.OBJ_ID);
        public static final Property Logo = new Property(3, String.class, "logo", false, "LOGO");
        public static final Property Name = new Property(4, String.class, "name", false, "NAME");
        public static final Property CreateTime = new Property(5, Long.TYPE, "createTime", false, "CREATE_TIME");
        public static final Property CacheTime = new Property(6, Long.TYPE, "cacheTime", false, "CACHE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicAlbumCustomDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public MusicAlbumCustomDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_ALBUM_CUSTOM\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"UID\" TEXT,\"ID\" INTEGER NOT NULL ,\"LOGO\" TEXT,\"NAME\" TEXT,\"CREATE_TIME\" INTEGER NOT NULL ,\"CACHE_TIME\" INTEGER NOT NULL );");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_MUSIC_ALBUM_CUSTOM_UID_ID ON MUSIC_ALBUM_CUSTOM (\"UID\" ASC,\"ID\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_ALBUM_CUSTOM\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicAlbumCustom musicAlbumCustom) {
        databaseStatement.clearBindings();
        Long cacheId = musicAlbumCustom.getCacheId();
        if (cacheId != null) {
            databaseStatement.bindLong(1, cacheId.longValue());
        }
        String uid = musicAlbumCustom.getUid();
        if (uid != null) {
            databaseStatement.bindString(2, uid);
        }
        databaseStatement.bindLong(3, musicAlbumCustom.getId());
        String logo = musicAlbumCustom.getLogo();
        if (logo != null) {
            databaseStatement.bindString(4, logo);
        }
        String name = musicAlbumCustom.getName();
        if (name != null) {
            databaseStatement.bindString(5, name);
        }
        databaseStatement.bindLong(6, musicAlbumCustom.getCreateTime());
        databaseStatement.bindLong(7, musicAlbumCustom.getCacheTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicAlbumCustom musicAlbumCustom) {
        sQLiteStatement.clearBindings();
        Long cacheId = musicAlbumCustom.getCacheId();
        if (cacheId != null) {
            sQLiteStatement.bindLong(1, cacheId.longValue());
        }
        String uid = musicAlbumCustom.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(2, uid);
        }
        sQLiteStatement.bindLong(3, musicAlbumCustom.getId());
        String logo = musicAlbumCustom.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(4, logo);
        }
        String name = musicAlbumCustom.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        sQLiteStatement.bindLong(6, musicAlbumCustom.getCreateTime());
        sQLiteStatement.bindLong(7, musicAlbumCustom.getCacheTime());
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
    public MusicAlbumCustom readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        long j = cursor.getLong(i + 2);
        int i4 = i + 3;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 4;
        return new MusicAlbumCustom(valueOf, string, j, string2, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.getLong(i + 5), cursor.getLong(i + 6));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicAlbumCustom musicAlbumCustom, int i) {
        int i2 = i + 0;
        musicAlbumCustom.setCacheId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        musicAlbumCustom.setUid(cursor.isNull(i3) ? null : cursor.getString(i3));
        musicAlbumCustom.setId(cursor.getLong(i + 2));
        int i4 = i + 3;
        musicAlbumCustom.setLogo(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        musicAlbumCustom.setName(cursor.isNull(i5) ? null : cursor.getString(i5));
        musicAlbumCustom.setCreateTime(cursor.getLong(i + 5));
        musicAlbumCustom.setCacheTime(cursor.getLong(i + 6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(MusicAlbumCustom musicAlbumCustom, long j) {
        musicAlbumCustom.setCacheId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(MusicAlbumCustom musicAlbumCustom) {
        if (musicAlbumCustom != null) {
            return musicAlbumCustom.getCacheId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicAlbumCustom musicAlbumCustom) {
        return musicAlbumCustom.getCacheId() != null;
    }
}
