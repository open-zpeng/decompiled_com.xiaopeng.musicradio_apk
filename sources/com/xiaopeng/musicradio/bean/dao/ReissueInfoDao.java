package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lzy.okgo.model.Progress;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.tag.datatype.DataTypes;
/* loaded from: classes.dex */
public class ReissueInfoDao extends AbstractDao<ReissueInfo, String> {
    public static final String TABLENAME = "REISSUE_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property ObjectId = new Property(0, String.class, "objectId", true, "OBJECT_ID");
        public static final Property Url = new Property(1, String.class, Progress.URL, false, DataTypes.OBJ_URL);
        public static final Property Value = new Property(2, String.class, "value", false, "VALUE");
        public static final Property Type = new Property(3, String.class, VuiConstants.ELEMENT_TYPE, false, "TYPE");
        public static final Property ReissueType = new Property(4, Integer.TYPE, "reissueType", false, "REISSUE_TYPE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReissueInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public ReissueInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"REISSUE_INFO\" (\"OBJECT_ID\" TEXT PRIMARY KEY NOT NULL ,\"URL\" TEXT,\"VALUE\" TEXT,\"TYPE\" TEXT,\"REISSUE_TYPE\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"REISSUE_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ReissueInfo reissueInfo) {
        databaseStatement.clearBindings();
        String objectId = reissueInfo.getObjectId();
        if (objectId != null) {
            databaseStatement.bindString(1, objectId);
        }
        String url = reissueInfo.getUrl();
        if (url != null) {
            databaseStatement.bindString(2, url);
        }
        String value = reissueInfo.getValue();
        if (value != null) {
            databaseStatement.bindString(3, value);
        }
        String type = reissueInfo.getType();
        if (type != null) {
            databaseStatement.bindString(4, type);
        }
        databaseStatement.bindLong(5, reissueInfo.getReissueType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ReissueInfo reissueInfo) {
        sQLiteStatement.clearBindings();
        String objectId = reissueInfo.getObjectId();
        if (objectId != null) {
            sQLiteStatement.bindString(1, objectId);
        }
        String url = reissueInfo.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(2, url);
        }
        String value = reissueInfo.getValue();
        if (value != null) {
            sQLiteStatement.bindString(3, value);
        }
        String type = reissueInfo.getType();
        if (type != null) {
            sQLiteStatement.bindString(4, type);
        }
        sQLiteStatement.bindLong(5, reissueInfo.getReissueType());
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
    public ReissueInfo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 1;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        return new ReissueInfo(string, string2, string3, cursor.isNull(i5) ? null : cursor.getString(i5), cursor.getInt(i + 4));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ReissueInfo reissueInfo, int i) {
        int i2 = i + 0;
        reissueInfo.setObjectId(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 1;
        reissueInfo.setUrl(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        reissueInfo.setValue(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        reissueInfo.setType(cursor.isNull(i5) ? null : cursor.getString(i5));
        reissueInfo.setReissueType(cursor.getInt(i + 4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(ReissueInfo reissueInfo, long j) {
        return reissueInfo.getObjectId();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(ReissueInfo reissueInfo) {
        if (reissueInfo != null) {
            return reissueInfo.getObjectId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ReissueInfo reissueInfo) {
        return reissueInfo.getObjectId() != null;
    }
}
