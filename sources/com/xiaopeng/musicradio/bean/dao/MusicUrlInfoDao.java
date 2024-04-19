package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lzy.okgo.model.Progress;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class MusicUrlInfoDao extends AbstractDao<MusicUrlInfo, String> {
    public static final String TABLENAME = "MUSIC_URL_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Hash = new Property(0, String.class, "hash", true, "HASH");
        public static final Property Url = new Property(1, String.class, Progress.URL, false, DataTypes.OBJ_URL);
        public static final Property UpdateTime = new Property(2, Long.TYPE, "updateTime", false, "UPDATE_TIME");
        public static final Property Song = new Property(3, String.class, "song", false, "SONG");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicUrlInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public MusicUrlInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_URL_INFO\" (\"HASH\" TEXT PRIMARY KEY NOT NULL ,\"URL\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL ,\"SONG\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_URL_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicUrlInfo musicUrlInfo) {
        databaseStatement.clearBindings();
        String hash = musicUrlInfo.getHash();
        if (hash != null) {
            databaseStatement.bindString(1, hash);
        }
        String url = musicUrlInfo.getUrl();
        if (url != null) {
            databaseStatement.bindString(2, url);
        }
        databaseStatement.bindLong(3, musicUrlInfo.getUpdateTime());
        String song = musicUrlInfo.getSong();
        if (song != null) {
            databaseStatement.bindString(4, song);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicUrlInfo musicUrlInfo) {
        sQLiteStatement.clearBindings();
        String hash = musicUrlInfo.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(1, hash);
        }
        String url = musicUrlInfo.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(2, url);
        }
        sQLiteStatement.bindLong(3, musicUrlInfo.getUpdateTime());
        String song = musicUrlInfo.getSong();
        if (song != null) {
            sQLiteStatement.bindString(4, song);
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
    public MusicUrlInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        long j = cursor.getLong(i + 2);
        int i4 = i + 3;
        return new MusicUrlInfo(string, string2, j, cursor.isNull(i4) ? null : cursor.getString(i4));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicUrlInfo musicUrlInfo, int i) {
        int i2 = i + 0;
        musicUrlInfo.setHash(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        musicUrlInfo.setUrl(cursor.isNull(i3) ? null : cursor.getString(i3));
        musicUrlInfo.setUpdateTime(cursor.getLong(i + 2));
        int i4 = i + 3;
        musicUrlInfo.setSong(cursor.isNull(i4) ? null : cursor.getString(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(MusicUrlInfo musicUrlInfo, long j) {
        return musicUrlInfo.getHash();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(MusicUrlInfo musicUrlInfo) {
        if (musicUrlInfo != null) {
            return musicUrlInfo.getHash();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicUrlInfo musicUrlInfo) {
        return musicUrlInfo.getHash() != null;
    }
}
