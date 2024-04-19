package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.bean.xpbean.TryFileInfo;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class LatelyMusicInfoDao extends AbstractDao<LatelyMusicInfo, Long> {
    public static final String TABLENAME = "LATELY_MUSIC_INFO";
    private final afo fileListConverter;
    private final afq tryFileInfoConverter;

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property CacheId = new Property(0, Long.class, "cacheId", true, "_id");
        public static final Property Hash = new Property(1, String.class, "hash", false, "HASH");
        public static final Property SongId = new Property(2, String.class, "songId", false, "SONG_ID");
        public static final Property Song = new Property(3, String.class, "song", false, "SONG");
        public static final Property Singer = new Property(4, String.class, "singer", false, "SINGER");
        public static final Property SingerIds = new Property(5, String.class, "singerIds", false, "SINGER_IDS");
        public static final Property Logo = new Property(6, String.class, "logo", false, "LOGO");
        public static final Property Uid = new Property(7, String.class, "uid", false, "UID");
        public static final Property MusicFrom = new Property(8, Integer.TYPE, "musicFrom", false, "MUSIC_FROM");
        public static final Property OldMusicFrom = new Property(9, Integer.TYPE, "oldMusicFrom", false, "OLD_MUSIC_FROM");
        public static final Property MusicFromTitle = new Property(10, String.class, "musicFromTitle", false, "MUSIC_FROM_TITLE");
        public static final Property OldMusicFromTitle = new Property(11, String.class, "oldMusicFromTitle", false, "OLD_MUSIC_FROM_TITLE");
        public static final Property Ts = new Property(12, Long.TYPE, "ts", false, "TS");
        public static final Property Data = new Property(13, String.class, "data", false, "DATA");
        public static final Property LrcData = new Property(14, String.class, "lrcData", false, "LRC_DATA");
        public static final Property CanPlay = new Property(15, Boolean.TYPE, "canPlay", false, "CAN_PLAY");
        public static final Property ArtistId = new Property(16, Long.TYPE, "artistId", false, "ARTIST_ID");
        public static final Property InfoNeed = new Property(17, Integer.TYPE, "infoNeed", false, "INFO_NEED");
        public static final Property NeedVip = new Property(18, Boolean.TYPE, "needVip", false, "NEED_VIP");
        public static final Property PlayTime = new Property(19, Long.TYPE, "playTime", false, "PLAY_TIME");
        public static final Property AlbumId = new Property(20, Long.TYPE, "albumId", false, "ALBUM_ID");
        public static final Property ListenUrlRefreshTime = new Property(21, Long.TYPE, "listenUrlRefreshTime", false, "LISTEN_URL_REFRESH_TIME");
        public static final Property FileList = new Property(22, String.class, "fileList", false, "FILE_LIST");
        public static final Property TryFileInfo = new Property(23, String.class, "tryFileInfo", false, "TRY_FILE_INFO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LatelyMusicInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.fileListConverter = new afo();
        this.tryFileInfoConverter = new afq();
    }

    public LatelyMusicInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.fileListConverter = new afo();
        this.tryFileInfoConverter = new afq();
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"LATELY_MUSIC_INFO\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"HASH\" TEXT,\"SONG_ID\" TEXT,\"SONG\" TEXT,\"SINGER\" TEXT,\"SINGER_IDS\" TEXT,\"LOGO\" TEXT,\"UID\" TEXT,\"MUSIC_FROM\" INTEGER NOT NULL ,\"OLD_MUSIC_FROM\" INTEGER NOT NULL ,\"MUSIC_FROM_TITLE\" TEXT,\"OLD_MUSIC_FROM_TITLE\" TEXT,\"TS\" INTEGER NOT NULL ,\"DATA\" TEXT,\"LRC_DATA\" TEXT,\"CAN_PLAY\" INTEGER NOT NULL ,\"ARTIST_ID\" INTEGER NOT NULL ,\"INFO_NEED\" INTEGER NOT NULL ,\"NEED_VIP\" INTEGER NOT NULL ,\"PLAY_TIME\" INTEGER NOT NULL ,\"ALBUM_ID\" INTEGER NOT NULL ,\"LISTEN_URL_REFRESH_TIME\" INTEGER NOT NULL ,\"FILE_LIST\" TEXT,\"TRY_FILE_INFO\" TEXT);");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_LATELY_MUSIC_INFO_HASH_UID ON LATELY_MUSIC_INFO (\"HASH\" ASC,\"UID\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"LATELY_MUSIC_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, LatelyMusicInfo latelyMusicInfo) {
        databaseStatement.clearBindings();
        Long cacheId = latelyMusicInfo.getCacheId();
        if (cacheId != null) {
            databaseStatement.bindLong(1, cacheId.longValue());
        }
        String hash = latelyMusicInfo.getHash();
        if (hash != null) {
            databaseStatement.bindString(2, hash);
        }
        String songId = latelyMusicInfo.getSongId();
        if (songId != null) {
            databaseStatement.bindString(3, songId);
        }
        String song = latelyMusicInfo.getSong();
        if (song != null) {
            databaseStatement.bindString(4, song);
        }
        String singer = latelyMusicInfo.getSinger();
        if (singer != null) {
            databaseStatement.bindString(5, singer);
        }
        String singerIds = latelyMusicInfo.getSingerIds();
        if (singerIds != null) {
            databaseStatement.bindString(6, singerIds);
        }
        String logo = latelyMusicInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(7, logo);
        }
        String uid = latelyMusicInfo.getUid();
        if (uid != null) {
            databaseStatement.bindString(8, uid);
        }
        databaseStatement.bindLong(9, latelyMusicInfo.getMusicFrom());
        databaseStatement.bindLong(10, latelyMusicInfo.getOldMusicFrom());
        String musicFromTitle = latelyMusicInfo.getMusicFromTitle();
        if (musicFromTitle != null) {
            databaseStatement.bindString(11, musicFromTitle);
        }
        String oldMusicFromTitle = latelyMusicInfo.getOldMusicFromTitle();
        if (oldMusicFromTitle != null) {
            databaseStatement.bindString(12, oldMusicFromTitle);
        }
        databaseStatement.bindLong(13, latelyMusicInfo.getTs());
        String data = latelyMusicInfo.getData();
        if (data != null) {
            databaseStatement.bindString(14, data);
        }
        String lrcData = latelyMusicInfo.getLrcData();
        if (lrcData != null) {
            databaseStatement.bindString(15, lrcData);
        }
        databaseStatement.bindLong(16, latelyMusicInfo.getCanPlay() ? 1L : 0L);
        databaseStatement.bindLong(17, latelyMusicInfo.getArtistId());
        databaseStatement.bindLong(18, latelyMusicInfo.getInfoNeed());
        databaseStatement.bindLong(19, latelyMusicInfo.getNeedVip() ? 1L : 0L);
        databaseStatement.bindLong(20, latelyMusicInfo.getPlayTime());
        databaseStatement.bindLong(21, latelyMusicInfo.getAlbumId());
        databaseStatement.bindLong(22, latelyMusicInfo.getListenUrlRefreshTime());
        List<SongQualityBean.DataBean.SongQuality> fileList = latelyMusicInfo.getFileList();
        if (fileList != null) {
            databaseStatement.bindString(23, this.fileListConverter.convertToDatabaseValue(fileList));
        }
        TryFileInfo tryFileInfo = latelyMusicInfo.getTryFileInfo();
        if (tryFileInfo != null) {
            databaseStatement.bindString(24, this.tryFileInfoConverter.convertToDatabaseValue(tryFileInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, LatelyMusicInfo latelyMusicInfo) {
        sQLiteStatement.clearBindings();
        Long cacheId = latelyMusicInfo.getCacheId();
        if (cacheId != null) {
            sQLiteStatement.bindLong(1, cacheId.longValue());
        }
        String hash = latelyMusicInfo.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(2, hash);
        }
        String songId = latelyMusicInfo.getSongId();
        if (songId != null) {
            sQLiteStatement.bindString(3, songId);
        }
        String song = latelyMusicInfo.getSong();
        if (song != null) {
            sQLiteStatement.bindString(4, song);
        }
        String singer = latelyMusicInfo.getSinger();
        if (singer != null) {
            sQLiteStatement.bindString(5, singer);
        }
        String singerIds = latelyMusicInfo.getSingerIds();
        if (singerIds != null) {
            sQLiteStatement.bindString(6, singerIds);
        }
        String logo = latelyMusicInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(7, logo);
        }
        String uid = latelyMusicInfo.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(8, uid);
        }
        sQLiteStatement.bindLong(9, latelyMusicInfo.getMusicFrom());
        sQLiteStatement.bindLong(10, latelyMusicInfo.getOldMusicFrom());
        String musicFromTitle = latelyMusicInfo.getMusicFromTitle();
        if (musicFromTitle != null) {
            sQLiteStatement.bindString(11, musicFromTitle);
        }
        String oldMusicFromTitle = latelyMusicInfo.getOldMusicFromTitle();
        if (oldMusicFromTitle != null) {
            sQLiteStatement.bindString(12, oldMusicFromTitle);
        }
        sQLiteStatement.bindLong(13, latelyMusicInfo.getTs());
        String data = latelyMusicInfo.getData();
        if (data != null) {
            sQLiteStatement.bindString(14, data);
        }
        String lrcData = latelyMusicInfo.getLrcData();
        if (lrcData != null) {
            sQLiteStatement.bindString(15, lrcData);
        }
        sQLiteStatement.bindLong(16, latelyMusicInfo.getCanPlay() ? 1L : 0L);
        sQLiteStatement.bindLong(17, latelyMusicInfo.getArtistId());
        sQLiteStatement.bindLong(18, latelyMusicInfo.getInfoNeed());
        sQLiteStatement.bindLong(19, latelyMusicInfo.getNeedVip() ? 1L : 0L);
        sQLiteStatement.bindLong(20, latelyMusicInfo.getPlayTime());
        sQLiteStatement.bindLong(21, latelyMusicInfo.getAlbumId());
        sQLiteStatement.bindLong(22, latelyMusicInfo.getListenUrlRefreshTime());
        List<SongQualityBean.DataBean.SongQuality> fileList = latelyMusicInfo.getFileList();
        if (fileList != null) {
            sQLiteStatement.bindString(23, this.fileListConverter.convertToDatabaseValue(fileList));
        }
        TryFileInfo tryFileInfo = latelyMusicInfo.getTryFileInfo();
        if (tryFileInfo != null) {
            sQLiteStatement.bindString(24, this.tryFileInfoConverter.convertToDatabaseValue(tryFileInfo));
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
    public LatelyMusicInfo readEntity(Cursor cursor, int i) {
        long j;
        List<SongQualityBean.DataBean.SongQuality> convertToEntityProperty;
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        String string5 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 6;
        String string6 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 7;
        String string7 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = cursor.getInt(i + 8);
        int i11 = cursor.getInt(i + 9);
        int i12 = i + 10;
        String string8 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string9 = cursor.isNull(i13) ? null : cursor.getString(i13);
        long j2 = cursor.getLong(i + 12);
        int i14 = i + 13;
        String string10 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 14;
        String string11 = cursor.isNull(i15) ? null : cursor.getString(i15);
        boolean z = cursor.getShort(i + 15) != 0;
        long j3 = cursor.getLong(i + 16);
        int i16 = cursor.getInt(i + 17);
        boolean z2 = cursor.getShort(i + 18) != 0;
        long j4 = cursor.getLong(i + 19);
        long j5 = cursor.getLong(i + 20);
        long j6 = cursor.getLong(i + 21);
        int i17 = i + 22;
        if (cursor.isNull(i17)) {
            j = j2;
            convertToEntityProperty = null;
        } else {
            j = j2;
            convertToEntityProperty = this.fileListConverter.convertToEntityProperty(cursor.getString(i17));
        }
        int i18 = i + 23;
        return new LatelyMusicInfo(valueOf, string, string2, string3, string4, string5, string6, string7, i10, i11, string8, string9, j, string10, string11, z, j3, i16, z2, j4, j5, j6, convertToEntityProperty, cursor.isNull(i18) ? null : this.tryFileInfoConverter.convertToEntityProperty(cursor.getString(i18)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, LatelyMusicInfo latelyMusicInfo, int i) {
        int i2 = i + 0;
        latelyMusicInfo.setCacheId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        latelyMusicInfo.setHash(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        latelyMusicInfo.setSongId(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        latelyMusicInfo.setSong(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        latelyMusicInfo.setSinger(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        latelyMusicInfo.setSingerIds(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 6;
        latelyMusicInfo.setLogo(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        latelyMusicInfo.setUid(cursor.isNull(i9) ? null : cursor.getString(i9));
        latelyMusicInfo.setMusicFrom(cursor.getInt(i + 8));
        latelyMusicInfo.setOldMusicFrom(cursor.getInt(i + 9));
        int i10 = i + 10;
        latelyMusicInfo.setMusicFromTitle(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 11;
        latelyMusicInfo.setOldMusicFromTitle(cursor.isNull(i11) ? null : cursor.getString(i11));
        latelyMusicInfo.setTs(cursor.getLong(i + 12));
        int i12 = i + 13;
        latelyMusicInfo.setData(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 14;
        latelyMusicInfo.setLrcData(cursor.isNull(i13) ? null : cursor.getString(i13));
        latelyMusicInfo.setCanPlay(cursor.getShort(i + 15) != 0);
        latelyMusicInfo.setArtistId(cursor.getLong(i + 16));
        latelyMusicInfo.setInfoNeed(cursor.getInt(i + 17));
        latelyMusicInfo.setNeedVip(cursor.getShort(i + 18) != 0);
        latelyMusicInfo.setPlayTime(cursor.getLong(i + 19));
        latelyMusicInfo.setAlbumId(cursor.getLong(i + 20));
        latelyMusicInfo.setListenUrlRefreshTime(cursor.getLong(i + 21));
        int i14 = i + 22;
        latelyMusicInfo.setFileList(cursor.isNull(i14) ? null : this.fileListConverter.convertToEntityProperty(cursor.getString(i14)));
        int i15 = i + 23;
        latelyMusicInfo.setTryFileInfo(cursor.isNull(i15) ? null : this.tryFileInfoConverter.convertToEntityProperty(cursor.getString(i15)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(LatelyMusicInfo latelyMusicInfo, long j) {
        latelyMusicInfo.setCacheId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(LatelyMusicInfo latelyMusicInfo) {
        if (latelyMusicInfo != null) {
            return latelyMusicInfo.getCacheId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(LatelyMusicInfo latelyMusicInfo) {
        return latelyMusicInfo.getCacheId() != null;
    }
}
