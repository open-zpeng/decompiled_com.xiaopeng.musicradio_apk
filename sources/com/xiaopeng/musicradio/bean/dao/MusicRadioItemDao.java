package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.lzy.okgo.model.Progress;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.xpbean.MusicSongBean;
import com.xiaopeng.speech.vui.constants.VuiConstants;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.jaudiotagger.audio.asf.data.ContentDescription;
import org.jaudiotagger.tag.datatype.DataTypes;
import org.jaudiotagger.tag.id3.AbstractID3v1Tag;
/* loaded from: classes.dex */
public class MusicRadioItemDao extends AbstractDao<MusicRadioItem, Long> {
    public static final String TABLENAME = "MUSIC_RADIO_ITEM";
    private final afl firstSongInfoBoConverter;
    private final afp songInfosConverter;

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property CacheId = new Property(0, Long.class, "cacheId", true, "_id");
        public static final Property SysUid = new Property(1, Long.TYPE, "sysUid", false, "SYS_UID");
        public static final Property Uid = new Property(2, String.class, "uid", false, "UID");
        public static final Property CacheTime = new Property(3, Long.TYPE, "cacheTime", false, "CACHE_TIME");
        public static final Property Id = new Property(4, Long.TYPE, "id", false, DataTypes.OBJ_ID);
        public static final Property LogoUrl = new Property(5, String.class, "logoUrl", false, "LOGO_URL");
        public static final Property IconUrl = new Property(6, String.class, "iconUrl", false, "ICON_URL");
        public static final Property NightIconUrl = new Property(7, String.class, "nightIconUrl", false, "NIGHT_ICON_URL");
        public static final Property Tag = new Property(8, String.class, Progress.TAG, false, AbstractID3v1Tag.TAG);
        public static final Property CategoryId = new Property(9, Long.TYPE, "categoryId", false, "CATEGORY_ID");
        public static final Property ArtistId = new Property(10, Long.TYPE, "artistId", false, "ARTIST_ID");
        public static final Property Title = new Property(11, String.class, "title", false, ContentDescription.KEY_TITLE);
        public static final Property Type = new Property(12, String.class, VuiConstants.ELEMENT_TYPE, false, "TYPE");
        public static final Property Singer = new Property(13, String.class, "singer", false, "SINGER");
        public static final Property SongName = new Property(14, String.class, "songName", false, "SONG_NAME");
        public static final Property CoverUrl = new Property(15, String.class, "coverUrl", false, "COVER_URL");
        public static final Property FirstSongInfoBo = new Property(16, String.class, "firstSongInfoBo", false, "FIRST_SONG_INFO_BO");
        public static final Property Logo = new Property(17, String.class, "logo", false, "LOGO");
        public static final Property Name = new Property(18, String.class, "name", false, "NAME");
        public static final Property RankId = new Property(19, Long.TYPE, "rankId", false, "RANK_ID");
        public static final Property RankName = new Property(20, String.class, "rankName", false, "RANK_NAME");
        public static final Property ImgUrl = new Property(21, String.class, "imgUrl", false, "IMG_URL");
        public static final Property RankType = new Property(22, Integer.TYPE, "rankType", false, "RANK_TYPE");
        public static final Property SongInfos = new Property(23, String.class, "songInfos", false, "SONG_INFOS");
        public static final Property NeedVip = new Property(24, Boolean.TYPE, "needVip", false, "NEED_VIP");
        public static final Property ClickType = new Property(25, String.class, "clickType", false, "CLICK_TYPE");
        public static final Property SheetType = new Property(26, String.class, "sheetType", false, "SHEET_TYPE");
        public static final Property SheetName = new Property(27, String.class, "sheetName", false, "SHEET_NAME");
        public static final Property PreTime = new Property(28, Long.TYPE, "preTime", false, "PRE_TIME");
        public static final Property NowTime = new Property(29, Long.TYPE, "nowTime", false, "NOW_TIME");
        public static final Property PreLogoUrl = new Property(30, String.class, "preLogoUrl", false, "PRE_LOGO_URL");
        public static final Property NowLogoUrl = new Property(31, String.class, "nowLogoUrl", false, "NOW_LOGO_URL");
        public static final Property PlayState = new Property(32, Integer.TYPE, "playState", false, "PLAY_STATE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public MusicRadioItemDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.firstSongInfoBoConverter = new afl();
        this.songInfosConverter = new afp();
    }

    public MusicRadioItemDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.firstSongInfoBoConverter = new afl();
        this.songInfosConverter = new afp();
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"MUSIC_RADIO_ITEM\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"SYS_UID\" INTEGER NOT NULL ,\"UID\" TEXT,\"CACHE_TIME\" INTEGER NOT NULL ,\"ID\" INTEGER NOT NULL ,\"LOGO_URL\" TEXT,\"ICON_URL\" TEXT,\"NIGHT_ICON_URL\" TEXT,\"TAG\" TEXT,\"CATEGORY_ID\" INTEGER NOT NULL ,\"ARTIST_ID\" INTEGER NOT NULL ,\"TITLE\" TEXT,\"TYPE\" TEXT,\"SINGER\" TEXT,\"SONG_NAME\" TEXT,\"COVER_URL\" TEXT,\"FIRST_SONG_INFO_BO\" TEXT,\"LOGO\" TEXT,\"NAME\" TEXT,\"RANK_ID\" INTEGER NOT NULL ,\"RANK_NAME\" TEXT,\"IMG_URL\" TEXT,\"RANK_TYPE\" INTEGER NOT NULL ,\"SONG_INFOS\" TEXT,\"NEED_VIP\" INTEGER NOT NULL ,\"CLICK_TYPE\" TEXT,\"SHEET_TYPE\" TEXT,\"SHEET_NAME\" TEXT,\"PRE_TIME\" INTEGER NOT NULL ,\"NOW_TIME\" INTEGER NOT NULL ,\"PRE_LOGO_URL\" TEXT,\"NOW_LOGO_URL\" TEXT,\"PLAY_STATE\" INTEGER NOT NULL );");
        database.execSQL("CREATE UNIQUE INDEX " + str + "IDX_MUSIC_RADIO_ITEM_SYS_UID_UID_ID_TYPE ON MUSIC_RADIO_ITEM (\"SYS_UID\" ASC,\"UID\" ASC,\"ID\" ASC,\"TYPE\" ASC);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"MUSIC_RADIO_ITEM\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, MusicRadioItem musicRadioItem) {
        databaseStatement.clearBindings();
        Long cacheId = musicRadioItem.getCacheId();
        if (cacheId != null) {
            databaseStatement.bindLong(1, cacheId.longValue());
        }
        databaseStatement.bindLong(2, musicRadioItem.getSysUid());
        String uid = musicRadioItem.getUid();
        if (uid != null) {
            databaseStatement.bindString(3, uid);
        }
        databaseStatement.bindLong(4, musicRadioItem.getCacheTime());
        databaseStatement.bindLong(5, musicRadioItem.getId());
        String logoUrl = musicRadioItem.getLogoUrl();
        if (logoUrl != null) {
            databaseStatement.bindString(6, logoUrl);
        }
        String iconUrl = musicRadioItem.getIconUrl();
        if (iconUrl != null) {
            databaseStatement.bindString(7, iconUrl);
        }
        String nightIconUrl = musicRadioItem.getNightIconUrl();
        if (nightIconUrl != null) {
            databaseStatement.bindString(8, nightIconUrl);
        }
        String tag = musicRadioItem.getTag();
        if (tag != null) {
            databaseStatement.bindString(9, tag);
        }
        databaseStatement.bindLong(10, musicRadioItem.getCategoryId());
        databaseStatement.bindLong(11, musicRadioItem.getArtistId());
        String title = musicRadioItem.getTitle();
        if (title != null) {
            databaseStatement.bindString(12, title);
        }
        String type = musicRadioItem.getType();
        if (type != null) {
            databaseStatement.bindString(13, type);
        }
        String singer = musicRadioItem.getSinger();
        if (singer != null) {
            databaseStatement.bindString(14, singer);
        }
        String songName = musicRadioItem.getSongName();
        if (songName != null) {
            databaseStatement.bindString(15, songName);
        }
        String coverUrl = musicRadioItem.getCoverUrl();
        if (coverUrl != null) {
            databaseStatement.bindString(16, coverUrl);
        }
        MusicSongBean firstSongInfoBo = musicRadioItem.getFirstSongInfoBo();
        if (firstSongInfoBo != null) {
            databaseStatement.bindString(17, this.firstSongInfoBoConverter.convertToDatabaseValue(firstSongInfoBo));
        }
        String logo = musicRadioItem.getLogo();
        if (logo != null) {
            databaseStatement.bindString(18, logo);
        }
        String name = musicRadioItem.getName();
        if (name != null) {
            databaseStatement.bindString(19, name);
        }
        databaseStatement.bindLong(20, musicRadioItem.getRankId());
        String rankName = musicRadioItem.getRankName();
        if (rankName != null) {
            databaseStatement.bindString(21, rankName);
        }
        String imgUrl = musicRadioItem.getImgUrl();
        if (imgUrl != null) {
            databaseStatement.bindString(22, imgUrl);
        }
        databaseStatement.bindLong(23, musicRadioItem.getRankType());
        List<MusicRadioItem.SongInfo> songInfos = musicRadioItem.getSongInfos();
        if (songInfos != null) {
            databaseStatement.bindString(24, this.songInfosConverter.convertToDatabaseValue(songInfos));
        }
        databaseStatement.bindLong(25, musicRadioItem.getNeedVip() ? 1L : 0L);
        String clickType = musicRadioItem.getClickType();
        if (clickType != null) {
            databaseStatement.bindString(26, clickType);
        }
        String sheetType = musicRadioItem.getSheetType();
        if (sheetType != null) {
            databaseStatement.bindString(27, sheetType);
        }
        String sheetName = musicRadioItem.getSheetName();
        if (sheetName != null) {
            databaseStatement.bindString(28, sheetName);
        }
        databaseStatement.bindLong(29, musicRadioItem.getPreTime());
        databaseStatement.bindLong(30, musicRadioItem.getNowTime());
        String preLogoUrl = musicRadioItem.getPreLogoUrl();
        if (preLogoUrl != null) {
            databaseStatement.bindString(31, preLogoUrl);
        }
        String nowLogoUrl = musicRadioItem.getNowLogoUrl();
        if (nowLogoUrl != null) {
            databaseStatement.bindString(32, nowLogoUrl);
        }
        databaseStatement.bindLong(33, musicRadioItem.getPlayState());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, MusicRadioItem musicRadioItem) {
        sQLiteStatement.clearBindings();
        Long cacheId = musicRadioItem.getCacheId();
        if (cacheId != null) {
            sQLiteStatement.bindLong(1, cacheId.longValue());
        }
        sQLiteStatement.bindLong(2, musicRadioItem.getSysUid());
        String uid = musicRadioItem.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(3, uid);
        }
        sQLiteStatement.bindLong(4, musicRadioItem.getCacheTime());
        sQLiteStatement.bindLong(5, musicRadioItem.getId());
        String logoUrl = musicRadioItem.getLogoUrl();
        if (logoUrl != null) {
            sQLiteStatement.bindString(6, logoUrl);
        }
        String iconUrl = musicRadioItem.getIconUrl();
        if (iconUrl != null) {
            sQLiteStatement.bindString(7, iconUrl);
        }
        String nightIconUrl = musicRadioItem.getNightIconUrl();
        if (nightIconUrl != null) {
            sQLiteStatement.bindString(8, nightIconUrl);
        }
        String tag = musicRadioItem.getTag();
        if (tag != null) {
            sQLiteStatement.bindString(9, tag);
        }
        sQLiteStatement.bindLong(10, musicRadioItem.getCategoryId());
        sQLiteStatement.bindLong(11, musicRadioItem.getArtistId());
        String title = musicRadioItem.getTitle();
        if (title != null) {
            sQLiteStatement.bindString(12, title);
        }
        String type = musicRadioItem.getType();
        if (type != null) {
            sQLiteStatement.bindString(13, type);
        }
        String singer = musicRadioItem.getSinger();
        if (singer != null) {
            sQLiteStatement.bindString(14, singer);
        }
        String songName = musicRadioItem.getSongName();
        if (songName != null) {
            sQLiteStatement.bindString(15, songName);
        }
        String coverUrl = musicRadioItem.getCoverUrl();
        if (coverUrl != null) {
            sQLiteStatement.bindString(16, coverUrl);
        }
        MusicSongBean firstSongInfoBo = musicRadioItem.getFirstSongInfoBo();
        if (firstSongInfoBo != null) {
            sQLiteStatement.bindString(17, this.firstSongInfoBoConverter.convertToDatabaseValue(firstSongInfoBo));
        }
        String logo = musicRadioItem.getLogo();
        if (logo != null) {
            sQLiteStatement.bindString(18, logo);
        }
        String name = musicRadioItem.getName();
        if (name != null) {
            sQLiteStatement.bindString(19, name);
        }
        sQLiteStatement.bindLong(20, musicRadioItem.getRankId());
        String rankName = musicRadioItem.getRankName();
        if (rankName != null) {
            sQLiteStatement.bindString(21, rankName);
        }
        String imgUrl = musicRadioItem.getImgUrl();
        if (imgUrl != null) {
            sQLiteStatement.bindString(22, imgUrl);
        }
        sQLiteStatement.bindLong(23, musicRadioItem.getRankType());
        List<MusicRadioItem.SongInfo> songInfos = musicRadioItem.getSongInfos();
        if (songInfos != null) {
            sQLiteStatement.bindString(24, this.songInfosConverter.convertToDatabaseValue(songInfos));
        }
        sQLiteStatement.bindLong(25, musicRadioItem.getNeedVip() ? 1L : 0L);
        String clickType = musicRadioItem.getClickType();
        if (clickType != null) {
            sQLiteStatement.bindString(26, clickType);
        }
        String sheetType = musicRadioItem.getSheetType();
        if (sheetType != null) {
            sQLiteStatement.bindString(27, sheetType);
        }
        String sheetName = musicRadioItem.getSheetName();
        if (sheetName != null) {
            sQLiteStatement.bindString(28, sheetName);
        }
        sQLiteStatement.bindLong(29, musicRadioItem.getPreTime());
        sQLiteStatement.bindLong(30, musicRadioItem.getNowTime());
        String preLogoUrl = musicRadioItem.getPreLogoUrl();
        if (preLogoUrl != null) {
            sQLiteStatement.bindString(31, preLogoUrl);
        }
        String nowLogoUrl = musicRadioItem.getNowLogoUrl();
        if (nowLogoUrl != null) {
            sQLiteStatement.bindString(32, nowLogoUrl);
        }
        sQLiteStatement.bindLong(33, musicRadioItem.getPlayState());
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
    public MusicRadioItem readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        long j = cursor.getLong(i + 1);
        int i3 = i + 2;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        long j2 = cursor.getLong(i + 3);
        long j3 = cursor.getLong(i + 4);
        int i4 = i + 5;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 6;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 7;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 8;
        String string5 = cursor.isNull(i7) ? null : cursor.getString(i7);
        long j4 = cursor.getLong(i + 9);
        long j5 = cursor.getLong(i + 10);
        int i8 = i + 11;
        String string6 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 12;
        String string7 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 13;
        String string8 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 14;
        String string9 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 15;
        String string10 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 16;
        MusicSongBean convertToEntityProperty = cursor.isNull(i13) ? null : this.firstSongInfoBoConverter.convertToEntityProperty(cursor.getString(i13));
        int i14 = i + 17;
        String string11 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 18;
        String string12 = cursor.isNull(i15) ? null : cursor.getString(i15);
        long j6 = cursor.getLong(i + 19);
        int i16 = i + 20;
        String string13 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 21;
        String string14 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = cursor.getInt(i + 22);
        int i19 = i + 23;
        List<MusicRadioItem.SongInfo> convertToEntityProperty2 = cursor.isNull(i19) ? null : this.songInfosConverter.convertToEntityProperty(cursor.getString(i19));
        boolean z = cursor.getShort(i + 24) != 0;
        int i20 = i + 25;
        String string15 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 26;
        String string16 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 27;
        String string17 = cursor.isNull(i22) ? null : cursor.getString(i22);
        long j7 = cursor.getLong(i + 28);
        long j8 = cursor.getLong(i + 29);
        int i23 = i + 30;
        String string18 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 31;
        return new MusicRadioItem(valueOf, j, string, j2, j3, string2, string3, string4, string5, j4, j5, string6, string7, string8, string9, string10, convertToEntityProperty, string11, string12, j6, string13, string14, i18, convertToEntityProperty2, z, string15, string16, string17, j7, j8, string18, cursor.isNull(i24) ? null : cursor.getString(i24), cursor.getInt(i + 32));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, MusicRadioItem musicRadioItem, int i) {
        int i2 = i + 0;
        musicRadioItem.setCacheId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        musicRadioItem.setSysUid(cursor.getLong(i + 1));
        int i3 = i + 2;
        musicRadioItem.setUid(cursor.isNull(i3) ? null : cursor.getString(i3));
        musicRadioItem.setCacheTime(cursor.getLong(i + 3));
        musicRadioItem.setId(cursor.getLong(i + 4));
        int i4 = i + 5;
        musicRadioItem.setLogoUrl(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 6;
        musicRadioItem.setIconUrl(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 7;
        musicRadioItem.setNightIconUrl(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 8;
        musicRadioItem.setTag(cursor.isNull(i7) ? null : cursor.getString(i7));
        musicRadioItem.setCategoryId(cursor.getLong(i + 9));
        musicRadioItem.setArtistId(cursor.getLong(i + 10));
        int i8 = i + 11;
        musicRadioItem.setTitle(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 12;
        musicRadioItem.setType(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 13;
        musicRadioItem.setSinger(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 14;
        musicRadioItem.setSongName(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 15;
        musicRadioItem.setCoverUrl(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 16;
        musicRadioItem.setFirstSongInfoBo(cursor.isNull(i13) ? null : this.firstSongInfoBoConverter.convertToEntityProperty(cursor.getString(i13)));
        int i14 = i + 17;
        musicRadioItem.setLogo(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 18;
        musicRadioItem.setName(cursor.isNull(i15) ? null : cursor.getString(i15));
        musicRadioItem.setRankId(cursor.getLong(i + 19));
        int i16 = i + 20;
        musicRadioItem.setRankName(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 21;
        musicRadioItem.setImgUrl(cursor.isNull(i17) ? null : cursor.getString(i17));
        musicRadioItem.setRankType(cursor.getInt(i + 22));
        int i18 = i + 23;
        musicRadioItem.setSongInfos(cursor.isNull(i18) ? null : this.songInfosConverter.convertToEntityProperty(cursor.getString(i18)));
        musicRadioItem.setNeedVip(cursor.getShort(i + 24) != 0);
        int i19 = i + 25;
        musicRadioItem.setClickType(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i20 = i + 26;
        musicRadioItem.setSheetType(cursor.isNull(i20) ? null : cursor.getString(i20));
        int i21 = i + 27;
        musicRadioItem.setSheetName(cursor.isNull(i21) ? null : cursor.getString(i21));
        musicRadioItem.setPreTime(cursor.getLong(i + 28));
        musicRadioItem.setNowTime(cursor.getLong(i + 29));
        int i22 = i + 30;
        musicRadioItem.setPreLogoUrl(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i + 31;
        musicRadioItem.setNowLogoUrl(cursor.isNull(i23) ? null : cursor.getString(i23));
        musicRadioItem.setPlayState(cursor.getInt(i + 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(MusicRadioItem musicRadioItem, long j) {
        musicRadioItem.setCacheId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(MusicRadioItem musicRadioItem) {
        if (musicRadioItem != null) {
            return musicRadioItem.getCacheId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(MusicRadioItem musicRadioItem) {
        return musicRadioItem.getCacheId() != null;
    }
}
