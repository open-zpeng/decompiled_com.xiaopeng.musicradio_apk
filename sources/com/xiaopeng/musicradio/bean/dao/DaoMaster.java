package com.xiaopeng.musicradio.bean.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
/* loaded from: classes.dex */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 60;

    public static void createAllTables(Database database, boolean z) {
        SearchHistoryBeanDao.createTable(database, z);
        LocalLoveDao.createTable(database, z);
        ReissueInfoDao.createTable(database, z);
        TempSheetMusicInfoDao.createTable(database, z);
        MusicUrlInfoDao.createTable(database, z);
        ReadHistoryInfoDao.createTable(database, z);
        ReadingInfoDao.createTable(database, z);
        XpCacheInfoDao.createTable(database, z);
        AudioLogoInfoDao.createTable(database, z);
        MusicInfoDao.createTable(database, z);
        NetRadioHistoryDao.createTable(database, z);
        MusicAlbumCustomDao.createTable(database, z);
        NetRadioCollectDao.createTable(database, z);
        MusicAlbumCollectDao.createTable(database, z);
        LatelyMusicInfoDao.createTable(database, z);
        ReadLoveInfoDao.createTable(database, z);
        AudioParseInfoDao.createTable(database, z);
        MusicRadioItemDao.createTable(database, z);
        MusicLoveInfoDao.createTable(database, z);
    }

    public static void dropAllTables(Database database, boolean z) {
        SearchHistoryBeanDao.dropTable(database, z);
        LocalLoveDao.dropTable(database, z);
        ReissueInfoDao.dropTable(database, z);
        TempSheetMusicInfoDao.dropTable(database, z);
        MusicUrlInfoDao.dropTable(database, z);
        ReadHistoryInfoDao.dropTable(database, z);
        ReadingInfoDao.dropTable(database, z);
        XpCacheInfoDao.dropTable(database, z);
        AudioLogoInfoDao.dropTable(database, z);
        MusicInfoDao.dropTable(database, z);
        NetRadioHistoryDao.dropTable(database, z);
        MusicAlbumCustomDao.dropTable(database, z);
        NetRadioCollectDao.dropTable(database, z);
        MusicAlbumCollectDao.dropTable(database, z);
        LatelyMusicInfoDao.dropTable(database, z);
        ReadLoveInfoDao.dropTable(database, z);
        AudioParseInfoDao.dropTable(database, z);
        MusicRadioItemDao.dropTable(database, z);
        MusicLoveInfoDao.dropTable(database, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new StandardDatabase(sQLiteDatabase));
    }

    public DaoMaster(Database database) {
        super(database, 60);
        registerDaoClass(SearchHistoryBeanDao.class);
        registerDaoClass(LocalLoveDao.class);
        registerDaoClass(ReissueInfoDao.class);
        registerDaoClass(TempSheetMusicInfoDao.class);
        registerDaoClass(MusicUrlInfoDao.class);
        registerDaoClass(ReadHistoryInfoDao.class);
        registerDaoClass(ReadingInfoDao.class);
        registerDaoClass(XpCacheInfoDao.class);
        registerDaoClass(AudioLogoInfoDao.class);
        registerDaoClass(MusicInfoDao.class);
        registerDaoClass(NetRadioHistoryDao.class);
        registerDaoClass(MusicAlbumCustomDao.class);
        registerDaoClass(NetRadioCollectDao.class);
        registerDaoClass(MusicAlbumCollectDao.class);
        registerDaoClass(LatelyMusicInfoDao.class);
        registerDaoClass(ReadLoveInfoDao.class);
        registerDaoClass(AudioParseInfoDao.class);
        registerDaoClass(MusicRadioItemDao.class);
        registerDaoClass(MusicLoveInfoDao.class);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public DaoSession newSession() {
        return new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        return new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }

    /* loaded from: classes.dex */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String str) {
            super(context, str, 60);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 60);
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onCreate(Database database) {
            Log.i("greenDAO", "Creating tables for schema version 60");
            DaoMaster.createAllTables(database, false);
        }
    }

    /* loaded from: classes.dex */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }

        @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
        public void onUpgrade(Database database, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            DaoMaster.dropAllTables(database, true);
            onCreate(database);
        }
    }
}
