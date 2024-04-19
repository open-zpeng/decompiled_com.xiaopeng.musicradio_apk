package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.xpbean.SongQualityBean;
import com.xiaopeng.musicradio.bean.xpbean.TryFileInfo;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class MusicInfoDao extends AbstractDao<MusicInfo, String> {
    public static final String TABLENAME = "MUSIC_INFO";
    private final afo fileListConverter;
    private final afq tryFileInfoConverter;

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Hash = new Property(0, String.class, "hash", true, "HASH");
        public static final Property AlbumId = new Property(1, Long.TYPE, "albumId", false, "ALBUM_ID");
        public static final Property Duration = new Property(2, Long.TYPE, "duration", false, "DURATION");
        public static final Property Song = new Property(3, String.class, "song", false, "SONG");
        public static final Property AlbumName = new Property(4, String.class, "albumName", false, "ALBUM_NAME");
        public static final Property AlbumLogo = new Property(5, String.class, "albumLogo", false, "ALBUM_LOGO");
        public static final Property ArtistId = new Property(6, Long.TYPE, "artistId", false, "ARTIST_ID");
        public static final Property Data = new Property(7, String.class, "data", false, "DATA");
        public static final Property Singer = new Property(8, String.class, "singer", false, "SINGER");
        public static final Property SingerIds = new Property(9, String.class, "singerIds", false, "SINGER_IDS");
        public static final Property Logo = new Property(10, String.class, "logo", false, "LOGO");
        public static final Property ArtistLogo = new Property(11, String.class, "artistLogo", false, "ARTIST_LOGO");
        public static final Property LrcData = new Property(12, String.class, "lrcData", false, "LRC_DATA");
        public static final Property MusicFrom = new Property(13, Integer.TYPE, "musicFrom", false, "MUSIC_FROM");
        public static final Property OldMusicFrom = new Property(14, Integer.TYPE, "oldMusicFrom", false, "OLD_MUSIC_FROM");
        public static final Property OldCreateTime = new Property(15, Long.TYPE, "oldCreateTime", false, "OLD_CREATE_TIME");
        public static final Property Size = new Property(16, Integer.TYPE, "size", false, "SIZE");
        public static final Property InfoNeed = new Property(17, Integer.TYPE, "infoNeed", false, "INFO_NEED");
        public static final Property Quality = new Property(18, Integer.TYPE, "quality", false, "QUALITY");
        public static final Property Uid = new Property(19, String.class, "uid", false, "UID");
        public static final Property Ts = new Property(20, Long.TYPE, "ts", false, "TS");
        public static final Property CanPlay = new Property(21, Boolean.TYPE, "canPlay", false, "CAN_PLAY");
        public static final Property Style = new Property(22, String.class, TtmlNode.TAG_STYLE, false, "STYLE");
        public static final Property PlayTime = new Property(23, Long.TYPE, "playTime", false, "PLAY_TIME");
        public static final Property Creatime = new Property(24, Long.TYPE, "creatime", false, "CREATIME");
        public static final Property EndTime = new Property(25, Long.TYPE, "endTime", false, "END_TIME");
        public static final Property MusicFromTitle = new Property(26, String.class, "musicFromTitle", false, "MUSIC_FROM_TITLE");
        public static final Property OldMusicFromTitle = new Property(27, String.class, "oldMusicFromTitle", false, "OLD_MUSIC_FROM_TITLE");
        public static final Property PlayCount = new Property(28, Integer.TYPE, "playCount", false, "PLAY_COUNT");
        public static final Property InfoType = new Property(29, Integer.TYPE, "infoType", false, "INFO_TYPE");
        public static final Property CanFold = new Property(30, Boolean.TYPE, "canFold", false, "CAN_FOLD");
        public static final Property SongId = new Property(31, String.class, "songId", false, "SONG_ID");
        public static final Property SearchSongText = new Property(32, String.class, "searchSongText", false, "SEARCH_SONG_TEXT");
        public static final Property IsShortListen = new Property(33, Boolean.class, "isShortListen", false, "IS_SHORT_LISTEN");
        public static final Property ShortDurationS = new Property(34, Integer.class, "shortDurationS", false, "SHORT_DURATION_S");
        public static final Property NeedVip = new Property(35, Boolean.TYPE, "needVip", false, "NEED_VIP");
        public static final Property MusicSource = new Property(36, String.class, "musicSource", false, "MUSIC_SOURCE");
        public static final Property TryFileInfo = new Property(37, String.class, "tryFileInfo", false, "TRY_FILE_INFO");
        public static final Property ListenUrlRefreshTime = new Property(38, Long.TYPE, "listenUrlRefreshTime", false, "LISTEN_URL_REFRESH_TIME");
        public static final Property Append = new Property(39, Boolean.TYPE, RequestParameters.SUBRESOURCE_APPEND, false, "APPEND");
        public static final Property TryPlayable = new Property(40, Boolean.TYPE, "tryPlayable", false, "TRY_PLAYABLE");
        public static final Property Playable = new Property(41, Boolean.TYPE, "playable", false, "PLAYABLE");
        public static final Property Path = new Property(42, String.class, "path", false, "PATH");
        public static final Property From = new Property(43, Integer.TYPE, "from", false, "FROM");
        public static final Property FileList = new Property(44, String.class, "fileList", false, "FILE_LIST");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicInfoDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.tryFileInfoConverter = new afq();
        this.fileListConverter = new afo();
    }

    public MusicInfoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.tryFileInfoConverter = new afq();
        this.fileListConverter = new afo();
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_INFO\" (\"HASH\" TEXT PRIMARY KEY NOT NULL ,\"ALBUM_ID\" INTEGER NOT NULL ,\"DURATION\" INTEGER NOT NULL ,\"SONG\" TEXT,\"ALBUM_NAME\" TEXT,\"ALBUM_LOGO\" TEXT,\"ARTIST_ID\" INTEGER NOT NULL ,\"DATA\" TEXT,\"SINGER\" TEXT,\"SINGER_IDS\" TEXT,\"LOGO\" TEXT,\"ARTIST_LOGO\" TEXT,\"LRC_DATA\" TEXT,\"MUSIC_FROM\" INTEGER NOT NULL ,\"OLD_MUSIC_FROM\" INTEGER NOT NULL ,\"OLD_CREATE_TIME\" INTEGER NOT NULL ,\"SIZE\" INTEGER NOT NULL ,\"INFO_NEED\" INTEGER NOT NULL ,\"QUALITY\" INTEGER NOT NULL ,\"UID\" TEXT,\"TS\" INTEGER NOT NULL ,\"CAN_PLAY\" INTEGER NOT NULL ,\"STYLE\" TEXT,\"PLAY_TIME\" INTEGER NOT NULL ,\"CREATIME\" INTEGER NOT NULL ,\"END_TIME\" INTEGER NOT NULL ,\"MUSIC_FROM_TITLE\" TEXT,\"OLD_MUSIC_FROM_TITLE\" TEXT,\"PLAY_COUNT\" INTEGER NOT NULL ,\"INFO_TYPE\" INTEGER NOT NULL ,\"CAN_FOLD\" INTEGER NOT NULL ,\"SONG_ID\" TEXT,\"SEARCH_SONG_TEXT\" TEXT,\"IS_SHORT_LISTEN\" INTEGER,\"SHORT_DURATION_S\" INTEGER,\"NEED_VIP\" INTEGER NOT NULL ,\"MUSIC_SOURCE\" TEXT,\"TRY_FILE_INFO\" TEXT,\"LISTEN_URL_REFRESH_TIME\" INTEGER NOT NULL ,\"APPEND\" INTEGER NOT NULL ,\"TRY_PLAYABLE\" INTEGER NOT NULL ,\"PLAYABLE\" INTEGER NOT NULL ,\"PATH\" TEXT,\"FROM\" INTEGER NOT NULL ,\"FILE_LIST\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_INFO\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicInfo musicInfo) {
        databaseStatement.clearBindings();
        String hash = musicInfo.getHash();
        if (hash != null) {
            databaseStatement.bindString(1, hash);
        }
        databaseStatement.bindLong(2, musicInfo.getAlbumId());
        databaseStatement.bindLong(3, musicInfo.getDuration());
        String song = musicInfo.getSong();
        if (song != null) {
            databaseStatement.bindString(4, song);
        }
        String albumName = musicInfo.getAlbumName();
        if (albumName != null) {
            databaseStatement.bindString(5, albumName);
        }
        String albumLogo = musicInfo.getAlbumLogo();
        if (albumLogo != null) {
            databaseStatement.bindString(6, albumLogo);
        }
        databaseStatement.bindLong(7, musicInfo.getArtistId());
        String data = musicInfo.getData();
        if (data != null) {
            databaseStatement.bindString(8, data);
        }
        String singer = musicInfo.getSinger();
        if (singer != null) {
            databaseStatement.bindString(9, singer);
        }
        String singerIds = musicInfo.getSingerIds();
        if (singerIds != null) {
            databaseStatement.bindString(10, singerIds);
        }
        String logo = musicInfo.getLogo();
        if (logo != null) {
            databaseStatement.bindString(11, logo);
        }
        String artistLogo = musicInfo.getArtistLogo();
        if (artistLogo != null) {
            databaseStatement.bindString(12, artistLogo);
        }
        String lrcData = musicInfo.getLrcData();
        if (lrcData != null) {
            databaseStatement.bindString(13, lrcData);
        }
        databaseStatement.bindLong(14, musicInfo.getMusicFrom());
        databaseStatement.bindLong(15, musicInfo.getOldMusicFrom());
        databaseStatement.bindLong(16, musicInfo.getOldCreateTime());
        databaseStatement.bindLong(17, musicInfo.getSize());
        databaseStatement.bindLong(18, musicInfo.getInfoNeed());
        databaseStatement.bindLong(19, musicInfo.getQuality());
        String uid = musicInfo.getUid();
        if (uid != null) {
            databaseStatement.bindString(20, uid);
        }
        databaseStatement.bindLong(21, musicInfo.getTs());
        databaseStatement.bindLong(22, musicInfo.getCanPlay() ? 1L : 0L);
        String style = musicInfo.getStyle();
        if (style != null) {
            databaseStatement.bindString(23, style);
        }
        databaseStatement.bindLong(24, musicInfo.getPlayTime());
        databaseStatement.bindLong(25, musicInfo.getCreatime());
        databaseStatement.bindLong(26, musicInfo.getEndTime());
        String musicFromTitle = musicInfo.getMusicFromTitle();
        if (musicFromTitle != null) {
            databaseStatement.bindString(27, musicFromTitle);
        }
        String oldMusicFromTitle = musicInfo.getOldMusicFromTitle();
        if (oldMusicFromTitle != null) {
            databaseStatement.bindString(28, oldMusicFromTitle);
        }
        databaseStatement.bindLong(29, musicInfo.getPlayCount());
        databaseStatement.bindLong(30, musicInfo.getInfoType());
        databaseStatement.bindLong(31, musicInfo.getCanFold() ? 1L : 0L);
        String songId = musicInfo.getSongId();
        if (songId != null) {
            databaseStatement.bindString(32, songId);
        }
        String searchSongText = musicInfo.getSearchSongText();
        if (searchSongText != null) {
            databaseStatement.bindString(33, searchSongText);
        }
        Boolean isShortListen = musicInfo.getIsShortListen();
        if (isShortListen != null) {
            databaseStatement.bindLong(34, isShortListen.booleanValue() ? 1L : 0L);
        }
        Integer shortDurationS = musicInfo.getShortDurationS();
        if (shortDurationS != null) {
            databaseStatement.bindLong(35, shortDurationS.intValue());
        }
        databaseStatement.bindLong(36, musicInfo.getNeedVip() ? 1L : 0L);
        String musicSource = musicInfo.getMusicSource();
        if (musicSource != null) {
            databaseStatement.bindString(37, musicSource);
        }
        TryFileInfo tryFileInfo = musicInfo.getTryFileInfo();
        if (tryFileInfo != null) {
            databaseStatement.bindString(38, this.tryFileInfoConverter.convertToDatabaseValue(tryFileInfo));
        }
        databaseStatement.bindLong(39, musicInfo.getListenUrlRefreshTime());
        databaseStatement.bindLong(40, musicInfo.getAppend() ? 1L : 0L);
        databaseStatement.bindLong(41, musicInfo.getTryPlayable() ? 1L : 0L);
        databaseStatement.bindLong(42, musicInfo.getPlayable() ? 1L : 0L);
        String path = musicInfo.getPath();
        if (path != null) {
            databaseStatement.bindString(43, path);
        }
        databaseStatement.bindLong(44, musicInfo.getFrom());
        List<SongQualityBean.DataBean.SongQuality> fileList = musicInfo.getFileList();
        if (fileList != null) {
            databaseStatement.bindString(45, this.fileListConverter.convertToDatabaseValue(fileList));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicInfo musicInfo) {
        sQLiteStatement.clearBindings();
        String hash = musicInfo.getHash();
        if (hash != null) {
            sQLiteStatement.bindString(1, hash);
        }
        sQLiteStatement.bindLong(2, musicInfo.getAlbumId());
        sQLiteStatement.bindLong(3, musicInfo.getDuration());
        String song = musicInfo.getSong();
        if (song != null) {
            sQLiteStatement.bindString(4, song);
        }
        String albumName = musicInfo.getAlbumName();
        if (albumName != null) {
            sQLiteStatement.bindString(5, albumName);
        }
        String albumLogo = musicInfo.getAlbumLogo();
        if (albumLogo != null) {
            sQLiteStatement.bindString(6, albumLogo);
        }
        sQLiteStatement.bindLong(7, musicInfo.getArtistId());
        String data = musicInfo.getData();
        if (data != null) {
            sQLiteStatement.bindString(8, data);
        }
        String singer = musicInfo.getSinger();
        if (singer != null) {
            sQLiteStatement.bindString(9, singer);
        }
        String singerIds = musicInfo.getSingerIds();
        if (singerIds != null) {
            sQLiteStatement.bindString(10, singerIds);
        }
        String logo = musicInfo.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(11, logo);
        }
        String artistLogo = musicInfo.getArtistLogo();
        if (artistLogo != null) {
            sQLiteStatement.bindString(12, artistLogo);
        }
        String lrcData = musicInfo.getLrcData();
        if (lrcData != null) {
            sQLiteStatement.bindString(13, lrcData);
        }
        sQLiteStatement.bindLong(14, musicInfo.getMusicFrom());
        sQLiteStatement.bindLong(15, musicInfo.getOldMusicFrom());
        sQLiteStatement.bindLong(16, musicInfo.getOldCreateTime());
        sQLiteStatement.bindLong(17, musicInfo.getSize());
        sQLiteStatement.bindLong(18, musicInfo.getInfoNeed());
        sQLiteStatement.bindLong(19, musicInfo.getQuality());
        String uid = musicInfo.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(20, uid);
        }
        sQLiteStatement.bindLong(21, musicInfo.getTs());
        sQLiteStatement.bindLong(22, musicInfo.getCanPlay() ? 1L : 0L);
        String style = musicInfo.getStyle();
        if (style != null) {
            sQLiteStatement.bindString(23, style);
        }
        sQLiteStatement.bindLong(24, musicInfo.getPlayTime());
        sQLiteStatement.bindLong(25, musicInfo.getCreatime());
        sQLiteStatement.bindLong(26, musicInfo.getEndTime());
        String musicFromTitle = musicInfo.getMusicFromTitle();
        if (musicFromTitle != null) {
            sQLiteStatement.bindString(27, musicFromTitle);
        }
        String oldMusicFromTitle = musicInfo.getOldMusicFromTitle();
        if (oldMusicFromTitle != null) {
            sQLiteStatement.bindString(28, oldMusicFromTitle);
        }
        sQLiteStatement.bindLong(29, musicInfo.getPlayCount());
        sQLiteStatement.bindLong(30, musicInfo.getInfoType());
        sQLiteStatement.bindLong(31, musicInfo.getCanFold() ? 1L : 0L);
        String songId = musicInfo.getSongId();
        if (songId != null) {
            sQLiteStatement.bindString(32, songId);
        }
        String searchSongText = musicInfo.getSearchSongText();
        if (searchSongText != null) {
            sQLiteStatement.bindString(33, searchSongText);
        }
        Boolean isShortListen = musicInfo.getIsShortListen();
        if (isShortListen != null) {
            sQLiteStatement.bindLong(34, isShortListen.booleanValue() ? 1L : 0L);
        }
        Integer shortDurationS = musicInfo.getShortDurationS();
        if (shortDurationS != null) {
            sQLiteStatement.bindLong(35, shortDurationS.intValue());
        }
        sQLiteStatement.bindLong(36, musicInfo.getNeedVip() ? 1L : 0L);
        String musicSource = musicInfo.getMusicSource();
        if (musicSource != null) {
            sQLiteStatement.bindString(37, musicSource);
        }
        TryFileInfo tryFileInfo = musicInfo.getTryFileInfo();
        if (tryFileInfo != null) {
            sQLiteStatement.bindString(38, this.tryFileInfoConverter.convertToDatabaseValue(tryFileInfo));
        }
        sQLiteStatement.bindLong(39, musicInfo.getListenUrlRefreshTime());
        sQLiteStatement.bindLong(40, musicInfo.getAppend() ? 1L : 0L);
        sQLiteStatement.bindLong(41, musicInfo.getTryPlayable() ? 1L : 0L);
        sQLiteStatement.bindLong(42, musicInfo.getPlayable() ? 1L : 0L);
        String path = musicInfo.getPath();
        if (path != null) {
            sQLiteStatement.bindString(43, path);
        }
        sQLiteStatement.bindLong(44, musicInfo.getFrom());
        List<SongQualityBean.DataBean.SongQuality> fileList = musicInfo.getFileList();
        if (fileList != null) {
            sQLiteStatement.bindString(45, this.fileListConverter.convertToDatabaseValue(fileList));
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
    public MusicInfo readEntity(Cursor cursor, int i) {
        Boolean valueOf;
        int i2 = i + 0;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        long j = cursor.getLong(i + 1);
        long j2 = cursor.getLong(i + 2);
        int i3 = i + 3;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 4;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 5;
        String string4 = cursor.isNull(i5) ? null : cursor.getString(i5);
        long j3 = cursor.getLong(i + 6);
        int i6 = i + 7;
        String string5 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 8;
        String string6 = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i + 9;
        String string7 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 10;
        String string8 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 11;
        String string9 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 12;
        String string10 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = cursor.getInt(i + 13);
        int i13 = cursor.getInt(i + 14);
        long j4 = cursor.getLong(i + 15);
        int i14 = cursor.getInt(i + 16);
        int i15 = cursor.getInt(i + 17);
        int i16 = cursor.getInt(i + 18);
        int i17 = i + 19;
        String string11 = cursor.isNull(i17) ? null : cursor.getString(i17);
        long j5 = cursor.getLong(i + 20);
        boolean z = cursor.getShort(i + 21) != 0;
        int i18 = i + 22;
        String string12 = cursor.isNull(i18) ? null : cursor.getString(i18);
        long j6 = cursor.getLong(i + 23);
        long j7 = cursor.getLong(i + 24);
        long j8 = cursor.getLong(i + 25);
        int i19 = i + 26;
        String string13 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 27;
        String string14 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = cursor.getInt(i + 28);
        int i22 = cursor.getInt(i + 29);
        boolean z2 = cursor.getShort(i + 30) != 0;
        int i23 = i + 31;
        String string15 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 32;
        String string16 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 33;
        if (cursor.isNull(i25)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i25) != 0);
        }
        int i26 = i + 34;
        Integer valueOf2 = cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26));
        boolean z3 = cursor.getShort(i + 35) != 0;
        int i27 = i + 36;
        String string17 = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i + 37;
        TryFileInfo convertToEntityProperty = cursor.isNull(i28) ? null : this.tryFileInfoConverter.convertToEntityProperty(cursor.getString(i28));
        long j9 = cursor.getLong(i + 38);
        boolean z4 = cursor.getShort(i + 39) != 0;
        boolean z5 = cursor.getShort(i + 40) != 0;
        boolean z6 = cursor.getShort(i + 41) != 0;
        int i29 = i + 42;
        String string18 = cursor.isNull(i29) ? null : cursor.getString(i29);
        int i30 = i + 44;
        return new MusicInfo(string, j, j2, string2, string3, string4, j3, string5, string6, string7, string8, string9, string10, i12, i13, j4, i14, i15, i16, string11, j5, z, string12, j6, j7, j8, string13, string14, i21, i22, z2, string15, string16, valueOf, valueOf2, z3, string17, convertToEntityProperty, j9, z4, z5, z6, string18, cursor.getInt(i + 43), cursor.isNull(i30) ? null : this.fileListConverter.convertToEntityProperty(cursor.getString(i30)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicInfo musicInfo, int i) {
        Boolean valueOf;
        int i2 = i + 0;
        musicInfo.setHash(cursor.isNull(i2) ? null : cursor.getString(i2));
        musicInfo.setAlbumId(cursor.getLong(i + 1));
        musicInfo.setDuration(cursor.getLong(i + 2));
        int i3 = i + 3;
        musicInfo.setSong(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 4;
        musicInfo.setAlbumName(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 5;
        musicInfo.setAlbumLogo(cursor.isNull(i5) ? null : cursor.getString(i5));
        musicInfo.setArtistId(cursor.getLong(i + 6));
        int i6 = i + 7;
        musicInfo.setData(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 8;
        musicInfo.setSinger(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 9;
        musicInfo.setSingerIds(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 10;
        musicInfo.setLogo(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 11;
        musicInfo.setArtistLogo(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 12;
        musicInfo.setLrcData(cursor.isNull(i11) ? null : cursor.getString(i11));
        musicInfo.setMusicFrom(cursor.getInt(i + 13));
        musicInfo.setOldMusicFrom(cursor.getInt(i + 14));
        musicInfo.setOldCreateTime(cursor.getLong(i + 15));
        musicInfo.setSize(cursor.getInt(i + 16));
        musicInfo.setInfoNeed(cursor.getInt(i + 17));
        musicInfo.setQuality(cursor.getInt(i + 18));
        int i12 = i + 19;
        musicInfo.setUid(cursor.isNull(i12) ? null : cursor.getString(i12));
        musicInfo.setTs(cursor.getLong(i + 20));
        musicInfo.setCanPlay(cursor.getShort(i + 21) != 0);
        int i13 = i + 22;
        musicInfo.setStyle(cursor.isNull(i13) ? null : cursor.getString(i13));
        musicInfo.setPlayTime(cursor.getLong(i + 23));
        musicInfo.setCreatime(cursor.getLong(i + 24));
        musicInfo.setEndTime(cursor.getLong(i + 25));
        int i14 = i + 26;
        musicInfo.setMusicFromTitle(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 27;
        musicInfo.setOldMusicFromTitle(cursor.isNull(i15) ? null : cursor.getString(i15));
        musicInfo.setPlayCount(cursor.getInt(i + 28));
        musicInfo.setInfoType(cursor.getInt(i + 29));
        musicInfo.setCanFold(cursor.getShort(i + 30) != 0);
        int i16 = i + 31;
        musicInfo.setSongId(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 32;
        musicInfo.setSearchSongText(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 33;
        if (cursor.isNull(i18)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i18) != 0);
        }
        musicInfo.setIsShortListen(valueOf);
        int i19 = i + 34;
        musicInfo.setShortDurationS(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
        musicInfo.setNeedVip(cursor.getShort(i + 35) != 0);
        int i20 = i + 36;
        musicInfo.setMusicSource(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 37;
        musicInfo.setTryFileInfo(cursor.isNull(i21) ? null : this.tryFileInfoConverter.convertToEntityProperty(cursor.getString(i21)));
        musicInfo.setListenUrlRefreshTime(cursor.getLong(i + 38));
        musicInfo.setAppend(cursor.getShort(i + 39) != 0);
        musicInfo.setTryPlayable(cursor.getShort(i + 40) != 0);
        musicInfo.setPlayable(cursor.getShort(i + 41) != 0);
        int i22 = i + 42;
        musicInfo.setPath(cursor.isNull(i22) ? null : cursor.getString(i22));
        musicInfo.setFrom(cursor.getInt(i + 43));
        int i23 = i + 44;
        musicInfo.setFileList(cursor.isNull(i23) ? null : this.fileListConverter.convertToEntityProperty(cursor.getString(i23)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final String updateKeyAfterInsert(MusicInfo musicInfo, long j) {
        return musicInfo.getHash();
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public String getKey(MusicInfo musicInfo) {
        if (musicInfo != null) {
            return musicInfo.getHash();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicInfo musicInfo) {
        return musicInfo.getHash() != null;
    }
}
