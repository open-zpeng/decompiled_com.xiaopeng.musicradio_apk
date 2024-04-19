package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class ReadLoveInfoDao extends AbstractDao<ReadLoveInfo, Long> {
    public static final String TABLENAME = "READ_LOVE_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property AlbumId = new Property(0, Long.TYPE, "albumId", true, "_id");
        public static final Property AlbumName = new Property(1, String.class, "albumName", false, "ALBUM_NAME");
        public static final Property ArtistId = new Property(2, Long.TYPE, "artistId", false, "ARTIST_ID");
        public static final Property Artist = new Property(3, String.class, "artist", false, "ARTIST");
        public static final Property Uid = new Property(4, String.class, "uid", false, "UID");
        public static final Property Ts = new Property(5, Long.TYPE, "ts", false, "TS");
        public static final Property Logo = new Property(6, String.class, "logo", false, "LOGO");
        public static final Property UpdateTime = new Property(7, Long.TYPE, "updateTime", false, "UPDATE_TIME");
        public static final Property LargeLogo = new Property(8, String.class, "largeLogo", false, "LARGE_LOGO");
        public static final Property MediumLogo = new Property(9, String.class, "mediumLogo", false, "MEDIUM_LOGO");
        public static final Property ShortIntro = new Property(10, String.class, "shortIntro", false, "SHORT_INTRO");
        public static final Property Intro = new Property(11, String.class, "intro", false, "INTRO");
        public static final Property PlayCount = new Property(12, Long.TYPE, "playCount", false, "PLAY_COUNT");
        public static final Property CategoryName = new Property(13, String.class, "categoryName", false, "CATEGORY_NAME");
        public static final Property PaymentType = new Property(14, Integer.TYPE, "paymentType", false, "PAYMENT_TYPE");
        public static final Property Authorized = new Property(15, Boolean.TYPE, "authorized", false, "AUTHORIZED");
        public static final Property Append = new Property(16, Boolean.TYPE, RequestParameters.SUBRESOURCE_APPEND, false, "APPEND");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReadLoveInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public ReadLoveInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"READ_LOVE_INFO\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"ALBUM_NAME\" TEXT,\"ARTIST_ID\" INTEGER NOT NULL ,\"ARTIST\" TEXT,\"UID\" TEXT,\"TS\" INTEGER NOT NULL ,\"LOGO\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL ,\"LARGE_LOGO\" TEXT,\"MEDIUM_LOGO\" TEXT,\"SHORT_INTRO\" TEXT,\"INTRO\" TEXT,\"PLAY_COUNT\" INTEGER NOT NULL ,\"CATEGORY_NAME\" TEXT,\"PAYMENT_TYPE\" INTEGER NOT NULL ,\"AUTHORIZED\" INTEGER NOT NULL ,\"APPEND\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"READ_LOVE_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ReadLoveInfo readLoveInfo) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, readLoveInfo.getAlbumId());
        String albumName = readLoveInfo.getAlbumName();
        if (albumName != null) {
            databaseStatement.bindString(2, albumName);
        }
        databaseStatement.bindLong(3, readLoveInfo.getArtistId());
        String artist = readLoveInfo.getArtist();
        if (artist != null) {
            databaseStatement.bindString(4, artist);
        }
        String uid = readLoveInfo.getUid();
        if (uid != null) {
            databaseStatement.bindString(5, uid);
        }
        databaseStatement.bindLong(6, readLoveInfo.getTs());
        String logo = readLoveInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(7, logo);
        }
        databaseStatement.bindLong(8, readLoveInfo.getUpdateTime());
        String largeLogo = readLoveInfo.getLargeLogo();
        if (largeLogo != null) {
            databaseStatement.bindString(9, largeLogo);
        }
        String mediumLogo = readLoveInfo.getMediumLogo();
        if (mediumLogo != null) {
            databaseStatement.bindString(10, mediumLogo);
        }
        String shortIntro = readLoveInfo.getShortIntro();
        if (shortIntro != null) {
            databaseStatement.bindString(11, shortIntro);
        }
        String intro = readLoveInfo.getIntro();
        if (intro != null) {
            databaseStatement.bindString(12, intro);
        }
        databaseStatement.bindLong(13, readLoveInfo.getPlayCount());
        String categoryName = readLoveInfo.getCategoryName();
        if (categoryName != null) {
            databaseStatement.bindString(14, categoryName);
        }
        databaseStatement.bindLong(15, readLoveInfo.getPaymentType());
        databaseStatement.bindLong(16, readLoveInfo.getAuthorized() ? 1L : 0L);
        databaseStatement.bindLong(17, readLoveInfo.getAppend() ? 1L : 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ReadLoveInfo readLoveInfo) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, readLoveInfo.getAlbumId());
        String albumName = readLoveInfo.getAlbumName();
        if (albumName != null) {
            sQLiteStatement.bindString(2, albumName);
        }
        sQLiteStatement.bindLong(3, readLoveInfo.getArtistId());
        String artist = readLoveInfo.getArtist();
        if (artist != null) {
            sQLiteStatement.bindString(4, artist);
        }
        String uid = readLoveInfo.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(5, uid);
        }
        sQLiteStatement.bindLong(6, readLoveInfo.getTs());
        String logo = readLoveInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(7, logo);
        }
        sQLiteStatement.bindLong(8, readLoveInfo.getUpdateTime());
        String largeLogo = readLoveInfo.getLargeLogo();
        if (largeLogo != null) {
            sQLiteStatement.bindString(9, largeLogo);
        }
        String mediumLogo = readLoveInfo.getMediumLogo();
        if (mediumLogo != null) {
            sQLiteStatement.bindString(10, mediumLogo);
        }
        String shortIntro = readLoveInfo.getShortIntro();
        if (shortIntro != null) {
            sQLiteStatement.bindString(11, shortIntro);
        }
        String intro = readLoveInfo.getIntro();
        if (intro != null) {
            sQLiteStatement.bindString(12, intro);
        }
        sQLiteStatement.bindLong(13, readLoveInfo.getPlayCount());
        String categoryName = readLoveInfo.getCategoryName();
        if (categoryName != null) {
            sQLiteStatement.bindString(14, categoryName);
        }
        sQLiteStatement.bindLong(15, readLoveInfo.getPaymentType());
        sQLiteStatement.bindLong(16, readLoveInfo.getAuthorized() ? 1L : 0L);
        sQLiteStatement.bindLong(17, readLoveInfo.getAppend() ? 1L : 0L);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ReadLoveInfo readEntity(Cursor cursor, int i) {
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        long j2 = cursor.getLong(i + 2);
        int i3 = i + 3;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 4;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        long j3 = cursor.getLong(i + 5);
        int i5 = i + 6;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        long j4 = cursor.getLong(i + 7);
        int i6 = i + 8;
        String string5 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 9;
        String string6 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 10;
        String string7 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 11;
        String string8 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 13;
        return new ReadLoveInfo(j, string, j2, string2, string3, j3, string4, j4, string5, string6, string7, string8, cursor.getLong(i + 12), cursor.isNull(i10) ? null : cursor.getString(i10), cursor.getInt(i + 14), cursor.getShort(i + 15) != 0, cursor.getShort(i + 16) != 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ReadLoveInfo readLoveInfo, int i) {
        readLoveInfo.setAlbumId(cursor.getLong(i + 0));
        int i2 = i + 1;
        readLoveInfo.setAlbumName(cursor.isNull(i2) ? null : cursor.getString(i2));
        readLoveInfo.setArtistId(cursor.getLong(i + 2));
        int i3 = i + 3;
        readLoveInfo.setArtist(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 4;
        readLoveInfo.setUid(cursor.isNull(i4) ? null : cursor.getString(i4));
        readLoveInfo.setTs(cursor.getLong(i + 5));
        int i5 = i + 6;
        readLoveInfo.setLogo(cursor.isNull(i5) ? null : cursor.getString(i5));
        readLoveInfo.setUpdateTime(cursor.getLong(i + 7));
        int i6 = i + 8;
        readLoveInfo.setLargeLogo(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 9;
        readLoveInfo.setMediumLogo(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 10;
        readLoveInfo.setShortIntro(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 11;
        readLoveInfo.setIntro(cursor.isNull(i9) ? null : cursor.getString(i9));
        readLoveInfo.setPlayCount(cursor.getLong(i + 12));
        int i10 = i + 13;
        readLoveInfo.setCategoryName(cursor.isNull(i10) ? null : cursor.getString(i10));
        readLoveInfo.setPaymentType(cursor.getInt(i + 14));
        readLoveInfo.setAuthorized(cursor.getShort(i + 15) != 0);
        readLoveInfo.setAppend(cursor.getShort(i + 16) != 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(ReadLoveInfo readLoveInfo, long j) {
        readLoveInfo.setAlbumId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ReadLoveInfo readLoveInfo) {
        if (readLoveInfo != null) {
            return Long.valueOf(readLoveInfo.getAlbumId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ReadLoveInfo readLoveInfo) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }
}
