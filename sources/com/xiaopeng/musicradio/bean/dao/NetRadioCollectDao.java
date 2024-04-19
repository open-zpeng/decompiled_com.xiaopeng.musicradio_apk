package com.xiaopeng.musicradio.bean.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.xiaopeng.musicradio.bean.db.NetRadioCollect;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class NetRadioCollectDao extends AbstractDao<NetRadioCollect, Long> {
    public static final String TABLENAME = "NET_RADIO_COLLECT";
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
        public static final Property Append = new Property(8, Boolean.TYPE, RequestParameters.SUBRESOURCE_APPEND, false, "APPEND");
        public static final Property PlayingInfo = new Property(9, String.class, "playingInfo", false, "PLAYING_INFO");
        public static final Property ProgramInfos = new Property(10, String.class, "programInfos", false, "PROGRAM_INFOS");
        public static final Property CacheTime = new Property(11, Long.TYPE, "cacheTime", false, "CACHE_TIME");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public NetRadioCollectDao(DaoConfig daoConfig) {
        super(daoConfig);
        this.playingInfoConverter = new afm();
        this.programInfosConverter = new afn();
    }

    public NetRadioCollectDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        this.playingInfoConverter = new afm();
        this.programInfosConverter = new afn();
    }

    public static void createTable(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"NET_RADIO_COLLECT\" (\"_id\" INTEGER PRIMARY KEY NOT NULL ,\"NAME\" TEXT,\"PIC_URL\" TEXT,\"UPDATE_TIME\" INTEGER NOT NULL ,\"HZ\" REAL NOT NULL ,\"AREA_CODE\" TEXT,\"PLAY_COUNT\" INTEGER NOT NULL ,\"PLAY_URL\" TEXT,\"APPEND\" INTEGER NOT NULL ,\"PLAYING_INFO\" TEXT,\"PROGRAM_INFOS\" TEXT,\"CACHE_TIME\" INTEGER NOT NULL );");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"NET_RADIO_COLLECT\"");
        database.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, NetRadioCollect netRadioCollect) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, netRadioCollect.getId());
        String name = netRadioCollect.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String picUrl = netRadioCollect.getPicUrl();
        if (picUrl != null) {
            databaseStatement.bindString(3, picUrl);
        }
        databaseStatement.bindLong(4, netRadioCollect.getUpdateTime());
        databaseStatement.bindDouble(5, netRadioCollect.getHz());
        String areaCode = netRadioCollect.getAreaCode();
        if (areaCode != null) {
            databaseStatement.bindString(6, areaCode);
        }
        databaseStatement.bindLong(7, netRadioCollect.getPlayCount());
        String playUrl = netRadioCollect.getPlayUrl();
        if (playUrl != null) {
            databaseStatement.bindString(8, playUrl);
        }
        databaseStatement.bindLong(9, netRadioCollect.getAppend() ? 1L : 0L);
        NetRadioProgramInfo playingInfo = netRadioCollect.getPlayingInfo();
        if (playingInfo != null) {
            databaseStatement.bindString(10, this.playingInfoConverter.convertToDatabaseValue(playingInfo));
        }
        List<NetRadioProgramInfo> programInfos = netRadioCollect.getProgramInfos();
        if (programInfos != null) {
            databaseStatement.bindString(11, this.programInfosConverter.convertToDatabaseValue(programInfos));
        }
        databaseStatement.bindLong(12, netRadioCollect.getCacheTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, NetRadioCollect netRadioCollect) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, netRadioCollect.getId());
        String name = netRadioCollect.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String picUrl = netRadioCollect.getPicUrl();
        if (picUrl != null) {
            sQLiteStatement.bindString(3, picUrl);
        }
        sQLiteStatement.bindLong(4, netRadioCollect.getUpdateTime());
        sQLiteStatement.bindDouble(5, netRadioCollect.getHz());
        String areaCode = netRadioCollect.getAreaCode();
        if (areaCode != null) {
            sQLiteStatement.bindString(6, areaCode);
        }
        sQLiteStatement.bindLong(7, netRadioCollect.getPlayCount());
        String playUrl = netRadioCollect.getPlayUrl();
        if (playUrl != null) {
            sQLiteStatement.bindString(8, playUrl);
        }
        sQLiteStatement.bindLong(9, netRadioCollect.getAppend() ? 1L : 0L);
        NetRadioProgramInfo playingInfo = netRadioCollect.getPlayingInfo();
        if (playingInfo != null) {
            sQLiteStatement.bindString(10, this.playingInfoConverter.convertToDatabaseValue(playingInfo));
        }
        List<NetRadioProgramInfo> programInfos = netRadioCollect.getProgramInfos();
        if (programInfos != null) {
            sQLiteStatement.bindString(11, this.programInfosConverter.convertToDatabaseValue(programInfos));
        }
        sQLiteStatement.bindLong(12, netRadioCollect.getCacheTime());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public NetRadioCollect readEntity(Cursor cursor, int i) {
        NetRadioProgramInfo netRadioProgramInfo;
        List<NetRadioProgramInfo> convertToEntityProperty;
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        String string = cursor.isNull(i2) ? null : cursor.getString(i2);
        int i3 = i + 2;
        String string2 = cursor.isNull(i3) ? null : cursor.getString(i3);
        long j2 = cursor.getLong(i + 3);
        double d = cursor.getDouble(i + 4);
        int i4 = i + 5;
        String string3 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = cursor.getInt(i + 6);
        int i6 = i + 7;
        String string4 = cursor.isNull(i6) ? null : cursor.getString(i6);
        boolean z = cursor.getShort(i + 8) != 0;
        int i7 = i + 9;
        NetRadioProgramInfo convertToEntityProperty2 = cursor.isNull(i7) ? null : this.playingInfoConverter.convertToEntityProperty(cursor.getString(i7));
        int i8 = i + 10;
        if (cursor.isNull(i8)) {
            netRadioProgramInfo = convertToEntityProperty2;
            convertToEntityProperty = null;
        } else {
            netRadioProgramInfo = convertToEntityProperty2;
            convertToEntityProperty = this.programInfosConverter.convertToEntityProperty(cursor.getString(i8));
        }
        return new NetRadioCollect(j, string, string2, j2, d, string3, i5, string4, z, netRadioProgramInfo, convertToEntityProperty, cursor.getLong(i + 11));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, NetRadioCollect netRadioCollect, int i) {
        netRadioCollect.setId(cursor.getLong(i + 0));
        int i2 = i + 1;
        netRadioCollect.setName(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        netRadioCollect.setPicUrl(cursor.isNull(i3) ? null : cursor.getString(i3));
        netRadioCollect.setUpdateTime(cursor.getLong(i + 3));
        netRadioCollect.setHz(cursor.getDouble(i + 4));
        int i4 = i + 5;
        netRadioCollect.setAreaCode(cursor.isNull(i4) ? null : cursor.getString(i4));
        netRadioCollect.setPlayCount(cursor.getInt(i + 6));
        int i5 = i + 7;
        netRadioCollect.setPlayUrl(cursor.isNull(i5) ? null : cursor.getString(i5));
        netRadioCollect.setAppend(cursor.getShort(i + 8) != 0);
        int i6 = i + 9;
        netRadioCollect.setPlayingInfo(cursor.isNull(i6) ? null : this.playingInfoConverter.convertToEntityProperty(cursor.getString(i6)));
        int i7 = i + 10;
        netRadioCollect.setProgramInfos(cursor.isNull(i7) ? null : this.programInfosConverter.convertToEntityProperty(cursor.getString(i7)));
        netRadioCollect.setCacheTime(cursor.getLong(i + 11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(NetRadioCollect netRadioCollect, long j) {
        netRadioCollect.setId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(NetRadioCollect netRadioCollect) {
        if (netRadioCollect != null) {
            return Long.valueOf(netRadioCollect.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(NetRadioCollect netRadioCollect) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }
}
