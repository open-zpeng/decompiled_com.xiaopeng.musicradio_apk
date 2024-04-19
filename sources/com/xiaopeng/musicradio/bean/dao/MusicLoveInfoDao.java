package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.MusicLoveInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class MusicLoveInfoDao extends AbstractDao<MusicLoveInfo, String> {
    public static final String TABLENAME = "MUSIC_LOVE_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Hash = new Property(0, String.class, "hash", true, "HASH");
        public static final Property Song = new Property(1, String.class, "song", false, "SONG");
        public static final Property Singer = new Property(2, String.class, "singer", false, "SINGER");
        public static final Property Logo = new Property(3, String.class, "logo", false, "LOGO");
        public static final Property Uid = new Property(4, String.class, "uid", false, "UID");
        public static final Property MusicFrom = new Property(5, Integer.TYPE, "musicFrom", false, "MUSIC_FROM");
        public static final Property Lrc = new Property(6, String.class, "lrc", false, "LRC");
        public static final Property Ts = new Property(7, Long.TYPE, "ts", false, "TS");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicLoveInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public MusicLoveInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_LOVE_INFO\" (\"HASH\" TEXT PRIMARY KEY NOT NULL ,\"SONG\" TEXT,\"SINGER\" TEXT,\"LOGO\" TEXT,\"UID\" TEXT,\"MUSIC_FROM\" INTEGER NOT NULL ,\"LRC\" TEXT,\"TS\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_LOVE_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicLoveInfo musicLoveInfo) {
        databaseStatement.clearBindings();
        String hash = musicLoveInfo.getHash();
        if (hash != null) {
            databaseStatement.bindString(1, hash);
        }
        String song = musicLoveInfo.getSong();
        if (song != null) {
            databaseStatement.bindString(2, song);
        }
        String singer = musicLoveInfo.getSinger();
        if (singer != null) {
            databaseStatement.bindString(3, singer);
        }
        String logo = musicLoveInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(4, logo);
        }
        String uid = musicLoveInfo.getUid();
        if (uid != null) {
            databaseStatement.bindString(5, uid);
        }
        databaseStatement.bindLong(6, musicLoveInfo.getMusicFrom());
        String lrc = musicLoveInfo.getLrc();
        if (lrc != null) {
            databaseStatement.bindString(7, lrc);
        }
        databaseStatement.bindLong(8, musicLoveInfo.getTs());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicLoveInfo musicLoveInfo) {
        sQLiteStatement.clearBindings();
        String hash = musicLoveInfo.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(1, hash);
        }
        String song = musicLoveInfo.getSong();
        if (song != null) {
            sQLiteStatement.bindString(2, song);
        }
        String singer = musicLoveInfo.getSinger();
        if (singer != null) {
            sQLiteStatement.bindString(3, singer);
        }
        String logo = musicLoveInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(4, logo);
        }
        String uid = musicLoveInfo.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(5, uid);
        }
        sQLiteStatement.bindLong(6, musicLoveInfo.getMusicFrom());
        String lrc = musicLoveInfo.getLrc();
        if (lrc != null) {
            sQLiteStatement.bindString(7, lrc);
        }
        sQLiteStatement.bindLong(8, musicLoveInfo.getTs());
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
    public MusicLoveInfo readEntity(Cursor cursor, int i) {
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
        int i7 = i + 6;
        return new MusicLoveInfo(string, string2, string3, string4, string5, cursor.getInt(i + 5), cursor.isNull(i7) ? null : cursor.getString(i7), cursor.getLong(i + 7));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicLoveInfo musicLoveInfo, int i) {
        int i2 = i + 0;
        musicLoveInfo.setHash(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        musicLoveInfo.setSong(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        musicLoveInfo.setSinger(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        musicLoveInfo.setLogo(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        musicLoveInfo.setUid(cursor.isNull(i6) ? null : cursor.getString(i6));
        musicLoveInfo.setMusicFrom(cursor.getInt(i + 5));
        int i7 = i + 6;
        musicLoveInfo.setLrc(cursor.isNull(i7) ? null : cursor.getString(i7));
        musicLoveInfo.setTs(cursor.getLong(i + 7));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(MusicLoveInfo musicLoveInfo, long j) {
        return musicLoveInfo.getHash();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(MusicLoveInfo musicLoveInfo) {
        if (musicLoveInfo != null) {
            return musicLoveInfo.getHash();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicLoveInfo musicLoveInfo) {
        return musicLoveInfo.getHash() != null;
    }
}
