package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.AudioLogoInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class AudioLogoInfoDao extends AbstractDao<AudioLogoInfo, String> {
    public static final String TABLENAME = "AUDIO_LOGO_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Name = new Property(0, String.class, "name", true, "NAME");
        public static final Property Logo = new Property(1, String.class, "logo", false, "LOGO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AudioLogoInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public AudioLogoInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"AUDIO_LOGO_INFO\" (\"NAME\" TEXT PRIMARY KEY NOT NULL ,\"LOGO\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"AUDIO_LOGO_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, AudioLogoInfo audioLogoInfo) {
        databaseStatement.clearBindings();
        String name = audioLogoInfo.getName();
        if (name != null) {
            databaseStatement.bindString(1, name);
        }
        String logo = audioLogoInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(2, logo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, AudioLogoInfo audioLogoInfo) {
        sQLiteStatement.clearBindings();
        String name = audioLogoInfo.getName();
        if (name != null) {
            sQLiteStatement.bindString(1, name);
        }
        String logo = audioLogoInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(2, logo);
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
    public AudioLogoInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        return new AudioLogoInfo(cursor.isNull(i2) ? null : cursor.getString(i2), cursor.isNull(i3) ? null : cursor.getString(i3));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, AudioLogoInfo audioLogoInfo, int i) {
        int i2 = i + 0;
        audioLogoInfo.setName(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        audioLogoInfo.setLogo(cursor.isNull(i3) ? null : cursor.getString(i3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(AudioLogoInfo audioLogoInfo, long j) {
        return audioLogoInfo.getName();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(AudioLogoInfo audioLogoInfo) {
        if (audioLogoInfo != null) {
            return audioLogoInfo.getName();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(AudioLogoInfo audioLogoInfo) {
        return audioLogoInfo.getName() != null;
    }
}
