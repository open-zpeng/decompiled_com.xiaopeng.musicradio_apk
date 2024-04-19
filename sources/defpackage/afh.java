package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.xiaopeng.musicradio.a;
import com.xiaopeng.musicradio.bean.dao.AudioLogoInfoDao;
import com.xiaopeng.musicradio.bean.dao.AudioParseInfoDao;
import com.xiaopeng.musicradio.bean.dao.DaoMaster;
import com.xiaopeng.musicradio.bean.dao.LatelyMusicInfoDao;
import com.xiaopeng.musicradio.bean.dao.LocalLoveDao;
import com.xiaopeng.musicradio.bean.dao.MusicAlbumCollectDao;
import com.xiaopeng.musicradio.bean.dao.MusicAlbumCustomDao;
import com.xiaopeng.musicradio.bean.dao.MusicInfoDao;
import com.xiaopeng.musicradio.bean.dao.MusicLoveInfoDao;
import com.xiaopeng.musicradio.bean.dao.MusicRadioItemDao;
import com.xiaopeng.musicradio.bean.dao.MusicUrlInfoDao;
import com.xiaopeng.musicradio.bean.dao.NetRadioCollectDao;
import com.xiaopeng.musicradio.bean.dao.NetRadioHistoryDao;
import com.xiaopeng.musicradio.bean.dao.ReadHistoryInfoDao;
import com.xiaopeng.musicradio.bean.dao.ReadLoveInfoDao;
import com.xiaopeng.musicradio.bean.dao.ReadingInfoDao;
import com.xiaopeng.musicradio.bean.dao.ReissueInfoDao;
import com.xiaopeng.musicradio.bean.dao.SearchHistoryBeanDao;
import com.xiaopeng.musicradio.bean.dao.TempSheetMusicInfoDao;
import com.xiaopeng.musicradio.bean.dao.XpCacheInfoDao;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.l;
import org.greenrobot.greendao.database.Database;
/* compiled from: MyOpenHelper.java */
/* renamed from: afh  reason: default package */
/* loaded from: classes2.dex */
public class afh extends DaoMaster.OpenHelper {
    public afh(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory);
    }

    @Override // org.greenrobot.greendao.database.DatabaseOpenHelper
    public void onUpgrade(Database database, int i, int i2) {
        Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " with user data");
        if (i <= 14) {
            ay.b();
        }
        if (i <= 16) {
            l.a(a.a);
            DaoMaster.dropAllTables(database, true);
            onCreate(database);
        }
        if (i <= 26) {
            ay.b();
            afg.a(database, LatelyMusicInfoDao.class);
            a(database);
            afg.b = i;
            ban.a(new Runnable() { // from class: afh.1
                @Override // java.lang.Runnable
                public void run() {
                    afk.a().c();
                    afi.d().c();
                }
            });
        } else if (i <= 45) {
            a(database);
        }
        if (i <= 42) {
            afg.a(database, SearchHistoryBeanDao.class);
        }
        if (i <= 43) {
            afg.a(database, MusicInfoDao.class);
        }
        if (i <= 46) {
            afg.a(database, LatelyMusicInfoDao.class, MusicRadioItemDao.class, NetRadioHistoryDao.class, NetRadioCollectDao.class, MusicAlbumCollectDao.class);
        }
        if (i <= 47) {
            afg.a(database, MusicAlbumCustomDao.class);
        }
        if (i <= 49) {
            afg.a(database, LatelyMusicInfoDao.class, MusicInfoDao.class, TempSheetMusicInfoDao.class, MusicAlbumCollectDao.class);
        }
        if (i <= 50) {
            afg.a(database, MusicRadioItemDao.class, MusicAlbumCustomDao.class, LocalLoveDao.class);
        }
        if (i <= 51) {
            afg.a(database, ReadLoveInfoDao.class, NetRadioCollectDao.class, ReadHistoryInfoDao.class, MusicRadioItemDao.class, MusicAlbumCustomDao.class, LocalLoveDao.class);
        }
        if (i <= 52) {
            afg.a(database, ReadHistoryInfoDao.class, NetRadioCollectDao.class, ReadLoveInfoDao.class);
        }
        if (i == 53) {
            afg.a(database, ReadHistoryInfoDao.class);
        }
        if (i <= 54) {
            afg.a(database, MusicInfoDao.class, TempSheetMusicInfoDao.class, ReadHistoryInfoDao.class);
        }
        if (i <= 57) {
            afg.a(database, MusicInfoDao.class, LatelyMusicInfoDao.class, ReadHistoryInfoDao.class);
        }
        if (i <= 58) {
            afg.a(database, MusicInfoDao.class);
        }
        if (i <= 59) {
            afg.a(database, AudioParseInfoDao.class, AudioLogoInfoDao.class);
        }
        if (i <= 60) {
            afg.a(database, MusicInfoDao.class);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i("greenDAO", "onDowngrade schema from version " + i + " to " + i2 + " with user data");
        ay.b();
        l.a(a.a);
        DaoMaster.dropAllTables(wrap(sQLiteDatabase), true);
        onCreate(wrap(sQLiteDatabase));
    }

    private void a(Database database) {
        afg.a(database, MusicInfoDao.class, MusicLoveInfoDao.class, MusicUrlInfoDao.class, ReadHistoryInfoDao.class, ReadLoveInfoDao.class, ReissueInfoDao.class, SearchHistoryBeanDao.class, XpCacheInfoDao.class, ReadingInfoDao.class, TempSheetMusicInfoDao.class);
    }
}
