package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.exoplayer2.util.MimeTypes;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class AudioParseInfoDao extends AbstractDao<AudioParseInfo, String> {
    public static final String TABLENAME = "AUDIO_PARSE_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Id = new Property(0, String.class, "id", true, DataTypes.OBJ_ID);
        public static final Property Path = new Property(1, String.class, "path", false, "PATH");
        public static final Property Song = new Property(2, String.class, "song", false, "SONG");
        public static final Property Singer = new Property(3, String.class, "singer", false, "SINGER");
        public static final Property AlbumTitle = new Property(4, String.class, "albumTitle", false, "ALBUM_TITLE");
        public static final Property Logo = new Property(5, String.class, "logo", false, "LOGO");
        public static final Property Audio = new Property(6, Boolean.TYPE, MimeTypes.BASE_TYPE_AUDIO, false, "AUDIO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AudioParseInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public AudioParseInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"AUDIO_PARSE_INFO\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"PATH\" TEXT,\"SONG\" TEXT,\"SINGER\" TEXT,\"ALBUM_TITLE\" TEXT,\"LOGO\" TEXT,\"AUDIO\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"AUDIO_PARSE_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, AudioParseInfo audioParseInfo) {
        databaseStatement.clearBindings();
        String id = audioParseInfo.getId();
        if (id != null) {
            databaseStatement.bindString(1, id);
        }
        String path = audioParseInfo.getPath();
        if (path != null) {
            databaseStatement.bindString(2, path);
        }
        String song = audioParseInfo.getSong();
        if (song != null) {
            databaseStatement.bindString(3, song);
        }
        String singer = audioParseInfo.getSinger();
        if (singer != null) {
            databaseStatement.bindString(4, singer);
        }
        String albumTitle = audioParseInfo.getAlbumTitle();
        if (albumTitle != null) {
            databaseStatement.bindString(5, albumTitle);
        }
        String logo = audioParseInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(6, logo);
        }
        databaseStatement.bindLong(7, audioParseInfo.getAudio() ? 1L : 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, AudioParseInfo audioParseInfo) {
        sQLiteStatement.clearBindings();
        String id = audioParseInfo.getId();
        if (id != null) {
            sQLiteStatement.bindString(1, id);
        }
        String path = audioParseInfo.getPath();
        if (path != null) {
            sQLiteStatement.bindString(2, path);
        }
        String song = audioParseInfo.getSong();
        if (song != null) {
            sQLiteStatement.bindString(3, song);
        }
        String singer = audioParseInfo.getSinger();
        if (singer != null) {
            sQLiteStatement.bindString(4, singer);
        }
        String albumTitle = audioParseInfo.getAlbumTitle();
        if (albumTitle != null) {
            sQLiteStatement.bindString(5, albumTitle);
        }
        String logo = audioParseInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(6, logo);
        }
        sQLiteStatement.bindLong(7, audioParseInfo.getAudio() ? 1L : 0L);
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
    public AudioParseInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string5 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        return new AudioParseInfo(string, string2, string3, string4, string5, cursor.isNull(i7) ? null : cursor.getString(i7), cursor.getShort(i + 6) != 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, AudioParseInfo audioParseInfo, int i) {
        int i2 = i + 0;
        audioParseInfo.setId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        audioParseInfo.setPath(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        audioParseInfo.setSong(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        audioParseInfo.setSinger(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        audioParseInfo.setAlbumTitle(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        audioParseInfo.setLogo(cursor.isNull(i7) ? null : cursor.getString(i7));
        audioParseInfo.setAudio(cursor.getShort(i + 6) != 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(AudioParseInfo audioParseInfo, long j) {
        return audioParseInfo.getId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(AudioParseInfo audioParseInfo) {
        if (audioParseInfo != null) {
            return audioParseInfo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(AudioParseInfo audioParseInfo) {
        return audioParseInfo.getId() != null;
    }
}
