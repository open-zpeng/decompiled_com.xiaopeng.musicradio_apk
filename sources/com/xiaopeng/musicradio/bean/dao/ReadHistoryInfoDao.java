package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.tag.id3.ID3v24Frames;
/* loaded from: classes.dex */
public class ReadHistoryInfoDao extends AbstractDao<ReadHistoryInfo, Long> {
    public static final String TABLENAME = "READ_HISTORY_INFO";

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property AlbumId = new Property(0, Long.TYPE, "albumId", true, "_id");
        public static final Property AlbumName = new Property(1, String.class, "albumName", false, "ALBUM_NAME");
        public static final Property ArtistId = new Property(2, Long.TYPE, "artistId", false, "ARTIST_ID");
        public static final Property Artist = new Property(3, String.class, "artist", false, "ARTIST");
        public static final Property Logo = new Property(4, String.class, "logo", false, "LOGO");
        public static final Property LargeLogo = new Property(5, String.class, "largeLogo", false, "LARGE_LOGO");
        public static final Property MediumLogo = new Property(6, String.class, "mediumLogo", false, "MEDIUM_LOGO");
        public static final Property TrackId = new Property(7, Long.TYPE, "trackId", false, "TRACK_ID");
        public static final Property TrackTitle = new Property(8, String.class, "trackTitle", false, "TRACK_TITLE");
        public static final Property Seek = new Property(9, Long.TYPE, "seek", false, ID3v24Frames.FRAME_ID_SEEK);
        public static final Property Duration = new Property(10, Long.TYPE, "duration", false, "DURATION");
        public static final Property Uid = new Property(11, String.class, "uid", false, "UID");
        public static final Property UpdateTime = new Property(12, Long.TYPE, "updateTime", false, "UPDATE_TIME");
        public static final Property Ts = new Property(13, Long.TYPE, "ts", false, "TS");
        public static final Property Sort = new Property(14, String.class, "sort", false, "SORT");
        public static final Property OrderNum = new Property(15, Integer.TYPE, "orderNum", false, "ORDER_NUM");
        public static final Property ShortIntro = new Property(16, String.class, "shortIntro", false, "SHORT_INTRO");
        public static final Property Intro = new Property(17, String.class, "intro", false, "INTRO");
        public static final Property PlayCount = new Property(18, Long.TYPE, "playCount", false, "PLAY_COUNT");
        public static final Property CategoryName = new Property(19, String.class, "categoryName", false, "CATEGORY_NAME");
        public static final Property PaymentType = new Property(20, Integer.TYPE, "paymentType", false, "PAYMENT_TYPE");
        public static final Property Authorized = new Property(21, Boolean.TYPE, "authorized", false, "AUTHORIZED");
        public static final Property TrackPaymentType = new Property(22, Integer.TYPE, "trackPaymentType", false, "TRACK_PAYMENT_TYPE");
        public static final Property TrackAuthorized = new Property(23, Boolean.TYPE, "trackAuthorized", false, "TRACK_AUTHORIZED");
        public static final Property ChannelId = new Property(24, Long.TYPE, "channelId", false, "CHANNEL_ID");
        public static final Property CardId = new Property(25, Integer.TYPE, "cardId", false, "CARD_ID");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReadHistoryInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public ReadHistoryInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"READ_HISTORY_INFO\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"ALBUM_NAME\" TEXT,\"ARTIST_ID\" INTEGER NOT NULL ,\"ARTIST\" TEXT,\"LOGO\" TEXT,\"LARGE_LOGO\" TEXT,\"MEDIUM_LOGO\" TEXT,\"TRACK_ID\" INTEGER NOT NULL ,\"TRACK_TITLE\" TEXT,\"SEEK\" INTEGER NOT NULL ,\"DURATION\" INTEGER NOT NULL ,\"UID\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL ,\"TS\" INTEGER NOT NULL ,\"SORT\" TEXT,\"ORDER_NUM\" INTEGER NOT NULL ,\"SHORT_INTRO\" TEXT,\"INTRO\" TEXT,\"PLAY_COUNT\" INTEGER NOT NULL ,\"CATEGORY_NAME\" TEXT,\"PAYMENT_TYPE\" INTEGER NOT NULL ,\"AUTHORIZED\" INTEGER NOT NULL ,\"TRACK_PAYMENT_TYPE\" INTEGER NOT NULL ,\"TRACK_AUTHORIZED\" INTEGER NOT NULL ,\"CHANNEL_ID\" INTEGER NOT NULL ,\"CARD_ID\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"READ_HISTORY_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ReadHistoryInfo readHistoryInfo) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, readHistoryInfo.getAlbumId());
        String albumName = readHistoryInfo.getAlbumName();
        if (albumName != null) {
            databaseStatement.bindString(2, albumName);
        }
        databaseStatement.bindLong(3, readHistoryInfo.getArtistId());
        String artist = readHistoryInfo.getArtist();
        if (artist != null) {
            databaseStatement.bindString(4, artist);
        }
        String logo = readHistoryInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(5, logo);
        }
        String largeLogo = readHistoryInfo.getLargeLogo();
        if (largeLogo != null) {
            databaseStatement.bindString(6, largeLogo);
        }
        String mediumLogo = readHistoryInfo.getMediumLogo();
        if (mediumLogo != null) {
            databaseStatement.bindString(7, mediumLogo);
        }
        databaseStatement.bindLong(8, readHistoryInfo.getTrackId());
        String trackTitle = readHistoryInfo.getTrackTitle();
        if (trackTitle != null) {
            databaseStatement.bindString(9, trackTitle);
        }
        databaseStatement.bindLong(10, readHistoryInfo.getSeek());
        databaseStatement.bindLong(11, readHistoryInfo.getDuration());
        String uid = readHistoryInfo.getUid();
        if (uid != null) {
            databaseStatement.bindString(12, uid);
        }
        databaseStatement.bindLong(13, readHistoryInfo.getUpdateTime());
        databaseStatement.bindLong(14, readHistoryInfo.getTs());
        String sort = readHistoryInfo.getSort();
        if (sort != null) {
            databaseStatement.bindString(15, sort);
        }
        databaseStatement.bindLong(16, readHistoryInfo.getOrderNum());
        String shortIntro = readHistoryInfo.getShortIntro();
        if (shortIntro != null) {
            databaseStatement.bindString(17, shortIntro);
        }
        String intro = readHistoryInfo.getIntro();
        if (intro != null) {
            databaseStatement.bindString(18, intro);
        }
        databaseStatement.bindLong(19, readHistoryInfo.getPlayCount());
        String categoryName = readHistoryInfo.getCategoryName();
        if (categoryName != null) {
            databaseStatement.bindString(20, categoryName);
        }
        databaseStatement.bindLong(21, readHistoryInfo.getPaymentType());
        databaseStatement.bindLong(22, readHistoryInfo.getAuthorized() ? 1L : 0L);
        databaseStatement.bindLong(23, readHistoryInfo.getTrackPaymentType());
        databaseStatement.bindLong(24, readHistoryInfo.getTrackAuthorized() ? 1L : 0L);
        databaseStatement.bindLong(25, readHistoryInfo.getChannelId());
        databaseStatement.bindLong(26, readHistoryInfo.getCardId());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ReadHistoryInfo readHistoryInfo) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, readHistoryInfo.getAlbumId());
        String albumName = readHistoryInfo.getAlbumName();
        if (albumName != null) {
            sQLiteStatement.bindString(2, albumName);
        }
        sQLiteStatement.bindLong(3, readHistoryInfo.getArtistId());
        String artist = readHistoryInfo.getArtist();
        if (artist != null) {
            sQLiteStatement.bindString(4, artist);
        }
        String logo = readHistoryInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(5, logo);
        }
        String largeLogo = readHistoryInfo.getLargeLogo();
        if (largeLogo != null) {
            sQLiteStatement.bindString(6, largeLogo);
        }
        String mediumLogo = readHistoryInfo.getMediumLogo();
        if (mediumLogo != null) {
            sQLiteStatement.bindString(7, mediumLogo);
        }
        sQLiteStatement.bindLong(8, readHistoryInfo.getTrackId());
        String trackTitle = readHistoryInfo.getTrackTitle();
        if (trackTitle != null) {
            sQLiteStatement.bindString(9, trackTitle);
        }
        sQLiteStatement.bindLong(10, readHistoryInfo.getSeek());
        sQLiteStatement.bindLong(11, readHistoryInfo.getDuration());
        String uid = readHistoryInfo.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(12, uid);
        }
        sQLiteStatement.bindLong(13, readHistoryInfo.getUpdateTime());
        sQLiteStatement.bindLong(14, readHistoryInfo.getTs());
        String sort = readHistoryInfo.getSort();
        if (sort != null) {
            sQLiteStatement.bindString(15, sort);
        }
        sQLiteStatement.bindLong(16, readHistoryInfo.getOrderNum());
        String shortIntro = readHistoryInfo.getShortIntro();
        if (shortIntro != null) {
            sQLiteStatement.bindString(17, shortIntro);
        }
        String intro = readHistoryInfo.getIntro();
        if (intro != null) {
            sQLiteStatement.bindString(18, intro);
        }
        sQLiteStatement.bindLong(19, readHistoryInfo.getPlayCount());
        String categoryName = readHistoryInfo.getCategoryName();
        if (categoryName != null) {
            sQLiteStatement.bindString(20, categoryName);
        }
        sQLiteStatement.bindLong(21, readHistoryInfo.getPaymentType());
        sQLiteStatement.bindLong(22, readHistoryInfo.getAuthorized() ? 1L : 0L);
        sQLiteStatement.bindLong(23, readHistoryInfo.getTrackPaymentType());
        sQLiteStatement.bindLong(24, readHistoryInfo.getTrackAuthorized() ? 1L : 0L);
        sQLiteStatement.bindLong(25, readHistoryInfo.getChannelId());
        sQLiteStatement.bindLong(26, readHistoryInfo.getCardId());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ReadHistoryInfo readEntity(Cursor cursor, int i) {
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        long j2 = cursor.getLong(i + 2);
        int i3 = i + 3;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 4;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 5;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 6;
        String string5 = cursor.isNull(i6) ? null : cursor.getString(i6);
        long j3 = cursor.getLong(i + 7);
        int i7 = i + 8;
        String string6 = cursor.isNull(i7) ? null : cursor.getString(i7);
        long j4 = cursor.getLong(i + 9);
        long j5 = cursor.getLong(i + 10);
        int i8 = i + 11;
        String string7 = cursor.isNull(i8) ? null : cursor.getString(i8);
        long j6 = cursor.getLong(i + 12);
        long j7 = cursor.getLong(i + 13);
        int i9 = i + 14;
        String string8 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = cursor.getInt(i + 15);
        int i11 = i + 16;
        String string9 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 17;
        String string10 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 19;
        return new ReadHistoryInfo(j, string, j2, string2, string3, string4, string5, j3, string6, j4, j5, string7, j6, j7, string8, i10, string9, string10, cursor.getLong(i + 18), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.getInt(i + 20), cursor.getShort(i + 21) != 0, cursor.getInt(i + 22), cursor.getShort(i + 23) != 0, cursor.getLong(i + 24), cursor.getInt(i + 25));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ReadHistoryInfo readHistoryInfo, int i) {
        readHistoryInfo.setAlbumId(cursor.getLong(i + 0));
        int i2 = i + 1;
        readHistoryInfo.setAlbumName(cursor.isNull(i2) ? null : cursor.getString(i2));
        readHistoryInfo.setArtistId(cursor.getLong(i + 2));
        int i3 = i + 3;
        readHistoryInfo.setArtist(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 4;
        readHistoryInfo.setLogo(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 5;
        readHistoryInfo.setLargeLogo(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 6;
        readHistoryInfo.setMediumLogo(cursor.isNull(i6) ? null : cursor.getString(i6));
        readHistoryInfo.setTrackId(cursor.getLong(i + 7));
        int i7 = i + 8;
        readHistoryInfo.setTrackTitle(cursor.isNull(i7) ? null : cursor.getString(i7));
        readHistoryInfo.setSeek(cursor.getLong(i + 9));
        readHistoryInfo.setDuration(cursor.getLong(i + 10));
        int i8 = i + 11;
        readHistoryInfo.setUid(cursor.isNull(i8) ? null : cursor.getString(i8));
        readHistoryInfo.setUpdateTime(cursor.getLong(i + 12));
        readHistoryInfo.setTs(cursor.getLong(i + 13));
        int i9 = i + 14;
        readHistoryInfo.setSort(cursor.isNull(i9) ? null : cursor.getString(i9));
        readHistoryInfo.setOrderNum(cursor.getInt(i + 15));
        int i10 = i + 16;
        readHistoryInfo.setShortIntro(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 17;
        readHistoryInfo.setIntro(cursor.isNull(i11) ? null : cursor.getString(i11));
        readHistoryInfo.setPlayCount(cursor.getLong(i + 18));
        int i12 = i + 19;
        readHistoryInfo.setCategoryName(cursor.isNull(i12) ? null : cursor.getString(i12));
        readHistoryInfo.setPaymentType(cursor.getInt(i + 20));
        readHistoryInfo.setAuthorized(cursor.getShort(i + 21) != 0);
        readHistoryInfo.setTrackPaymentType(cursor.getInt(i + 22));
        readHistoryInfo.setTrackAuthorized(cursor.getShort(i + 23) != 0);
        readHistoryInfo.setChannelId(cursor.getLong(i + 24));
        readHistoryInfo.setCardId(cursor.getInt(i + 25));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(ReadHistoryInfo readHistoryInfo, long j) {
        readHistoryInfo.setAlbumId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ReadHistoryInfo readHistoryInfo) {
        if (readHistoryInfo != null) {
            return Long.valueOf(readHistoryInfo.getAlbumId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ReadHistoryInfo readHistoryInfo) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }
}
