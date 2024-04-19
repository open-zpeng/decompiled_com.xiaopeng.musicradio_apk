package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaopeng.musicradio.bean.db.NetRadioHistory;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class NetRadioHistoryDao extends AbstractDao<NetRadioHistory, Long> {
    public static final String TABLENAME = "NET_RADIO_HISTORY";
    private final afm playingInfoConverter;
    private final afn programInfosConverter;

    /* loaded from: classes.dex */
    public static class Properties {
        public static final Property Id = new Property(0, Long.TYPE, "id", true, "_id");
        public static final Property Name = new Property(1, String.class, "name", false, "NAME");
        public static final Property PicUrl = new Property(2, String.class, "picUrl", false, "PIC_URL");
        public static final Property UpdateTime = new Property(3, Long.TYPE, "updateTime", false, "UPDATE_TIME");
        public static final Property Hz = new Property(4, Double.TYPE, "hz", false, "HZ");
        public static final Property AreaCode = new Property(5, String.class, "areaCode", false, "AREA_CODE");
        public static final Property PlayCount = new Property(6, Integer.TYPE, "playCount", false, "PLAY_COUNT");
        public static final Property PlayUrl = new Property(7, String.class, "playUrl", false, "PLAY_URL");
        public static final Property PlayingInfo = new Property(8, String.class, "playingInfo", false, "PLAYING_INFO");
        public static final Property ProgramInfos = new Property(9, String.class, "programInfos", false, "PROGRAM_INFOS");
        public static final Property CacheTime = new Property(10, Long.TYPE, "cacheTime", false, "CACHE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public NetRadioHistoryDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.playingInfoConverter = new afm();
        this.programInfosConverter = new afn();
    }

    public NetRadioHistoryDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.playingInfoConverter = new afm();
        this.programInfosConverter = new afn();
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"NET_RADIO_HISTORY\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"NAME\" TEXT,\"PIC_URL\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL ,\"HZ\" REAL NOT NULL ,\"AREA_CODE\" TEXT,\"PLAY_COUNT\" INTEGER NOT NULL ,\"PLAY_URL\" TEXT,\"PLAYING_INFO\" TEXT,\"PROGRAM_INFOS\" TEXT,\"CACHE_TIME\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"NET_RADIO_HISTORY\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, NetRadioHistory netRadioHistory) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, netRadioHistory.getId());
        String name = netRadioHistory.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String picUrl = netRadioHistory.getPicUrl();
        if (picUrl != null) {
            databaseStatement.bindString(3, picUrl);
        }
        databaseStatement.bindLong(4, netRadioHistory.getUpdateTime());
        databaseStatement.bindDouble(5, netRadioHistory.getHz());
        String areaCode = netRadioHistory.getAreaCode();
        if (areaCode != null) {
            databaseStatement.bindString(6, areaCode);
        }
        databaseStatement.bindLong(7, netRadioHistory.getPlayCount());
        String playUrl = netRadioHistory.getPlayUrl();
        if (playUrl != null) {
            databaseStatement.bindString(8, playUrl);
        }
        NetRadioProgramInfo playingInfo = netRadioHistory.getPlayingInfo();
        if (playingInfo != null) {
            databaseStatement.bindString(9, this.playingInfoConverter.convertToDatabaseValue(playingInfo));
        }
        List<NetRadioProgramInfo> programInfos = netRadioHistory.getProgramInfos();
        if (programInfos != null) {
            databaseStatement.bindString(10, this.programInfosConverter.convertToDatabaseValue(programInfos));
        }
        databaseStatement.bindLong(11, netRadioHistory.getCacheTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, NetRadioHistory netRadioHistory) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, netRadioHistory.getId());
        String name = netRadioHistory.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String picUrl = netRadioHistory.getPicUrl();
        if (picUrl != null) {
            sQLiteStatement.bindString(3, picUrl);
        }
        sQLiteStatement.bindLong(4, netRadioHistory.getUpdateTime());
        sQLiteStatement.bindDouble(5, netRadioHistory.getHz());
        String areaCode = netRadioHistory.getAreaCode();
        if (areaCode != null) {
            sQLiteStatement.bindString(6, areaCode);
        }
        sQLiteStatement.bindLong(7, netRadioHistory.getPlayCount());
        String playUrl = netRadioHistory.getPlayUrl();
        if (playUrl != null) {
            sQLiteStatement.bindString(8, playUrl);
        }
        NetRadioProgramInfo playingInfo = netRadioHistory.getPlayingInfo();
        if (playingInfo != null) {
            sQLiteStatement.bindString(9, this.playingInfoConverter.convertToDatabaseValue(playingInfo));
        }
        List<NetRadioProgramInfo> programInfos = netRadioHistory.getProgramInfos();
        if (programInfos != null) {
            sQLiteStatement.bindString(10, this.programInfosConverter.convertToDatabaseValue(programInfos));
        }
        sQLiteStatement.bindLong(11, netRadioHistory.getCacheTime());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public NetRadioHistory readEntity(Cursor cursor, int i) {
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 5;
        int i5 = i + 7;
        int i6 = i + 8;
        int i7 = i + 9;
        return new NetRadioHistory(cursor.getLong(i + 0), cursor.isNull(i2) ? null : cursor.getString(i2), cursor.isNull(i3) ? null : cursor.getString(i3), cursor.getLong(i + 3), cursor.getDouble(i + 4), cursor.isNull(i4) ? null : cursor.getString(i4), cursor.getInt(i + 6), cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : this.playingInfoConverter.convertToEntityProperty(cursor.getString(i6)), cursor.isNull(i7) ? null : this.programInfosConverter.convertToEntityProperty(cursor.getString(i7)), cursor.getLong(i + 10));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, NetRadioHistory netRadioHistory, int i) {
        netRadioHistory.setId(cursor.getLong(i + 0));
        int i2 = i + 1;
        netRadioHistory.setName(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        netRadioHistory.setPicUrl(cursor.isNull(i3) ? null : cursor.getString(i3));
        netRadioHistory.setUpdateTime(cursor.getLong(i + 3));
        netRadioHistory.setHz(cursor.getDouble(i + 4));
        int i4 = i + 5;
        netRadioHistory.setAreaCode(cursor.isNull(i4) ? null : cursor.getString(i4));
        netRadioHistory.setPlayCount(cursor.getInt(i + 6));
        int i5 = i + 7;
        netRadioHistory.setPlayUrl(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 8;
        netRadioHistory.setPlayingInfo(cursor.isNull(i6) ? null : this.playingInfoConverter.convertToEntityProperty(cursor.getString(i6)));
        int i7 = i + 9;
        netRadioHistory.setProgramInfos(cursor.isNull(i7) ? null : this.programInfosConverter.convertToEntityProperty(cursor.getString(i7)));
        netRadioHistory.setCacheTime(cursor.getLong(i + 10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(NetRadioHistory netRadioHistory, long j) {
        netRadioHistory.setId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(NetRadioHistory netRadioHistory) {
        if (netRadioHistory != null) {
            return Long.valueOf(netRadioHistory.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(NetRadioHistory netRadioHistory) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }
}
