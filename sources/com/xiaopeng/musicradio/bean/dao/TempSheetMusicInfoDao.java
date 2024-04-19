package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.TempSheetMusicInfo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class TempSheetMusicInfoDao extends AbstractDao<TempSheetMusicInfo, Long> {
    public static final String TABLENAME = "TEMP_SHEET_MUSIC_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property PkId = new Property(0, Long.class, "pkId", true, "_id");
        public static final Property Hash = new Property(1, String.class, "hash", false, "HASH");
        public static final Property MusicFrom = new Property(2, Integer.TYPE, "musicFrom", false, "MUSIC_FROM");
        public static final Property FromTitle = new Property(3, String.class, "fromTitle", false, "FROM_TITLE");
        public static final Property AlbumId = new Property(4, Long.TYPE, "albumId", false, "ALBUM_ID");
        public static final Property Type = new Property(5, Integer.TYPE, VuiConstants.ELEMENT_TYPE, false, "TYPE");
        public static final Property MusicJson = new Property(6, String.class, "musicJson", false, "MUSIC_JSON");
        public static final Property SongId = new Property(7, String.class, "songId", false, "SONG_ID");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TempSheetMusicInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public TempSheetMusicInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"TEMP_SHEET_MUSIC_INFO\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"HASH\" TEXT,\"MUSIC_FROM\" INTEGER NOT NULL ,\"FROM_TITLE\" TEXT,\"ALBUM_ID\" INTEGER NOT NULL ,\"TYPE\" INTEGER NOT NULL ,\"MUSIC_JSON\" TEXT,\"SONG_ID\" TEXT);");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_TEMP_SHEET_MUSIC_INFO_HASH_MUSIC_FROM_FROM_TITLE_ALBUM_ID ON TEMP_SHEET_MUSIC_INFO (\"HASH\" ASC,\"MUSIC_FROM\" ASC,\"FROM_TITLE\" ASC,\"ALBUM_ID\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TEMP_SHEET_MUSIC_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TempSheetMusicInfo tempSheetMusicInfo) {
        databaseStatement.clearBindings();
        Long pkId = tempSheetMusicInfo.getPkId();
        if (pkId != null) {
            databaseStatement.bindLong(1, pkId.longValue());
        }
        String hash = tempSheetMusicInfo.getHash();
        if (hash != null) {
            databaseStatement.bindString(2, hash);
        }
        databaseStatement.bindLong(3, tempSheetMusicInfo.getMusicFrom());
        String fromTitle = tempSheetMusicInfo.getFromTitle();
        if (fromTitle != null) {
            databaseStatement.bindString(4, fromTitle);
        }
        databaseStatement.bindLong(5, tempSheetMusicInfo.getAlbumId());
        databaseStatement.bindLong(6, tempSheetMusicInfo.getType());
        String musicJson = tempSheetMusicInfo.getMusicJson();
        if (musicJson != null) {
            databaseStatement.bindString(7, musicJson);
        }
        String songId = tempSheetMusicInfo.getSongId();
        if (songId != null) {
            databaseStatement.bindString(8, songId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TempSheetMusicInfo tempSheetMusicInfo) {
        sQLiteStatement.clearBindings();
        Long pkId = tempSheetMusicInfo.getPkId();
        if (pkId != null) {
            sQLiteStatement.bindLong(1, pkId.longValue());
        }
        String hash = tempSheetMusicInfo.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(2, hash);
        }
        sQLiteStatement.bindLong(3, tempSheetMusicInfo.getMusicFrom());
        String fromTitle = tempSheetMusicInfo.getFromTitle();
        if (fromTitle != null) {
            sQLiteStatement.bindString(4, fromTitle);
        }
        sQLiteStatement.bindLong(5, tempSheetMusicInfo.getAlbumId());
        sQLiteStatement.bindLong(6, tempSheetMusicInfo.getType());
        String musicJson = tempSheetMusicInfo.getMusicJson();
        if (musicJson != null) {
            sQLiteStatement.bindString(7, musicJson);
        }
        String songId = tempSheetMusicInfo.getSongId();
        if (songId != null) {
            sQLiteStatement.bindString(8, songId);
        }
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
    public TempSheetMusicInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = cursor.getInt(i + 2);
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        long j = cursor.getLong(i + 4);
        int i6 = cursor.getInt(i + 5);
        int i7 = i + 6;
        int i8 = i + 7;
        return new TempSheetMusicInfo(valueOf, string, i4, string2, j, i6, cursor.isNull(i7) ? null : cursor.getString(i7), cursor.isNull(i8) ? null : cursor.getString(i8));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TempSheetMusicInfo tempSheetMusicInfo, int i) {
        int i2 = i + 0;
        tempSheetMusicInfo.setPkId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        tempSheetMusicInfo.setHash(cursor.isNull(i3) ? null : cursor.getString(i3));
        tempSheetMusicInfo.setMusicFrom(cursor.getInt(i + 2));
        int i4 = i + 3;
        tempSheetMusicInfo.setFromTitle(cursor.isNull(i4) ? null : cursor.getString(i4));
        tempSheetMusicInfo.setAlbumId(cursor.getLong(i + 4));
        tempSheetMusicInfo.setType(cursor.getInt(i + 5));
        int i5 = i + 6;
        tempSheetMusicInfo.setMusicJson(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 7;
        tempSheetMusicInfo.setSongId(cursor.isNull(i6) ? null : cursor.getString(i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(TempSheetMusicInfo tempSheetMusicInfo, long j) {
        tempSheetMusicInfo.setPkId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TempSheetMusicInfo tempSheetMusicInfo) {
        if (tempSheetMusicInfo != null) {
            return tempSheetMusicInfo.getPkId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TempSheetMusicInfo tempSheetMusicInfo) {
        return tempSheetMusicInfo.getPkId() != null;
    }
}
