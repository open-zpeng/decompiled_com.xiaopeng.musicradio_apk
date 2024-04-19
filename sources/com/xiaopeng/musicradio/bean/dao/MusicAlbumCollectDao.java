package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.audio.asf.data.ContentDescription;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class MusicAlbumCollectDao extends AbstractDao<MusicAlbumCollect, Long> {
    public static final String TABLENAME = "MUSIC_ALBUM_COLLECT";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property CacheId = new Property(0, Long.class, "cacheId", true, "_id");
        public static final Property Uid = new Property(1, String.class, "uid", false, "UID");
        public static final Property Id = new Property(2, Long.TYPE, "id", false, DataTypes.OBJ_ID);
        public static final Property Logo = new Property(3, String.class, "logo", false, "LOGO");
        public static final Property Name = new Property(4, String.class, "name", false, "NAME");
        public static final Property SongCount = new Property(5, Integer.TYPE, "songCount", false, "SONG_COUNT");
        public static final Property Description = new Property(6, String.class, "description", false, ContentDescription.KEY_DESCRIPTION);
        public static final Property Type = new Property(7, Integer.TYPE, VuiConstants.ELEMENT_TYPE, false, "TYPE");
        public static final Property CreateTime = new Property(8, Long.TYPE, "createTime", false, "CREATE_TIME");
        public static final Property Append = new Property(9, Boolean.TYPE, RequestParameters.SUBRESOURCE_APPEND, false, "APPEND");
        public static final Property CacheTime = new Property(10, Long.TYPE, "cacheTime", false, "CACHE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicAlbumCollectDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public MusicAlbumCollectDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_ALBUM_COLLECT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"UID\" TEXT,\"ID\" INTEGER NOT NULL ,\"LOGO\" TEXT,\"NAME\" TEXT,\"SONG_COUNT\" INTEGER NOT NULL ,\"DESCRIPTION\" TEXT,\"TYPE\" INTEGER NOT NULL ,\"CREATE_TIME\" INTEGER NOT NULL ,\"APPEND\" INTEGER NOT NULL ,\"CACHE_TIME\" INTEGER NOT NULL );");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_MUSIC_ALBUM_COLLECT_UID_ID_TYPE ON MUSIC_ALBUM_COLLECT (\"UID\" ASC,\"ID\" ASC,\"TYPE\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_ALBUM_COLLECT\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicAlbumCollect musicAlbumCollect) {
        databaseStatement.clearBindings();
        Long cacheId = musicAlbumCollect.getCacheId();
        if (cacheId != null) {
            databaseStatement.bindLong(1, cacheId.longValue());
        }
        String uid = musicAlbumCollect.getUid();
        if (uid != null) {
            databaseStatement.bindString(2, uid);
        }
        databaseStatement.bindLong(3, musicAlbumCollect.getId());
        String logo = musicAlbumCollect.getLogo();
        if (logo != null) {
            databaseStatement.bindString(4, logo);
        }
        String name = musicAlbumCollect.getName();
        if (name != null) {
            databaseStatement.bindString(5, name);
        }
        databaseStatement.bindLong(6, musicAlbumCollect.getSongCount());
        String description = musicAlbumCollect.getDescription();
        if (description != null) {
            databaseStatement.bindString(7, description);
        }
        databaseStatement.bindLong(8, musicAlbumCollect.getType());
        databaseStatement.bindLong(9, musicAlbumCollect.getCreateTime());
        databaseStatement.bindLong(10, musicAlbumCollect.getAppend() ? 1L : 0L);
        databaseStatement.bindLong(11, musicAlbumCollect.getCacheTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicAlbumCollect musicAlbumCollect) {
        sQLiteStatement.clearBindings();
        Long cacheId = musicAlbumCollect.getCacheId();
        if (cacheId != null) {
            sQLiteStatement.bindLong(1, cacheId.longValue());
        }
        String uid = musicAlbumCollect.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(2, uid);
        }
        sQLiteStatement.bindLong(3, musicAlbumCollect.getId());
        String logo = musicAlbumCollect.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(4, logo);
        }
        String name = musicAlbumCollect.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        sQLiteStatement.bindLong(6, musicAlbumCollect.getSongCount());
        String description = musicAlbumCollect.getDescription();
        if (description != null) {
            sQLiteStatement.bindString(7, description);
        }
        sQLiteStatement.bindLong(8, musicAlbumCollect.getType());
        sQLiteStatement.bindLong(9, musicAlbumCollect.getCreateTime());
        sQLiteStatement.bindLong(10, musicAlbumCollect.getAppend() ? 1L : 0L);
        sQLiteStatement.bindLong(11, musicAlbumCollect.getCacheTime());
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
    public MusicAlbumCollect readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 3;
        int i5 = i + 4;
        int i6 = i + 6;
        return new MusicAlbumCollect(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.getLong(i + 2), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.isNull(i5) ? null : cursor.getString(i5), cursor.getInt(i + 5), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.getInt(i + 7), cursor.getLong(i + 8), cursor.getShort(i + 9) != 0, cursor.getLong(i + 10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicAlbumCollect musicAlbumCollect, int i) {
        int i2 = i + 0;
        musicAlbumCollect.setCacheId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        musicAlbumCollect.setUid(cursor.isNull(i3) ? null : cursor.getString(i3));
        musicAlbumCollect.setId(cursor.getLong(i + 2));
        int i4 = i + 3;
        musicAlbumCollect.setLogo(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        musicAlbumCollect.setName(cursor.isNull(i5) ? null : cursor.getString(i5));
        musicAlbumCollect.setSongCount(cursor.getInt(i + 5));
        int i6 = i + 6;
        musicAlbumCollect.setDescription(cursor.isNull(i6) ? null : cursor.getString(i6));
        musicAlbumCollect.setType(cursor.getInt(i + 7));
        musicAlbumCollect.setCreateTime(cursor.getLong(i + 8));
        musicAlbumCollect.setAppend(cursor.getShort(i + 9) != 0);
        musicAlbumCollect.setCacheTime(cursor.getLong(i + 10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(MusicAlbumCollect musicAlbumCollect, long j) {
        musicAlbumCollect.setCacheId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(MusicAlbumCollect musicAlbumCollect) {
        if (musicAlbumCollect != null) {
            return musicAlbumCollect.getCacheId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicAlbumCollect musicAlbumCollect) {
        return musicAlbumCollect.getCacheId() != null;
    }
}
