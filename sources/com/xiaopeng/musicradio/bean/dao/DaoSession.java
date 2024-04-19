package com.xiaopeng.musicradio.bean.dao;

import com.xiaopeng.musicradio.bean.db.AudioLogoInfo;
import com.xiaopeng.musicradio.bean.db.AudioParseInfo;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.bean.db.LocalLove;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCollect;
import com.xiaopeng.musicradio.bean.db.MusicAlbumCustom;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.MusicLoveInfo;
import com.xiaopeng.musicradio.bean.db.MusicRadioItem;
import com.xiaopeng.musicradio.bean.db.MusicUrlInfo;
import com.xiaopeng.musicradio.bean.db.NetRadioCollect;
import com.xiaopeng.musicradio.bean.db.NetRadioHistory;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import com.xiaopeng.musicradio.bean.db.SearchHistoryBean;
import com.xiaopeng.musicradio.bean.db.TempSheetMusicInfo;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;
/* loaded from: classes.dex */
public class DaoSession extends AbstractDaoSession {
    private final AudioLogoInfoDao audioLogoInfoDao;
    private final DaoConfig audioLogoInfoDaoConfig;
    private final AudioParseInfoDao audioParseInfoDao;
    private final DaoConfig audioParseInfoDaoConfig;
    private final LatelyMusicInfoDao latelyMusicInfoDao;
    private final DaoConfig latelyMusicInfoDaoConfig;
    private final LocalLoveDao localLoveDao;
    private final DaoConfig localLoveDaoConfig;
    private final MusicAlbumCollectDao musicAlbumCollectDao;
    private final DaoConfig musicAlbumCollectDaoConfig;
    private final MusicAlbumCustomDao musicAlbumCustomDao;
    private final DaoConfig musicAlbumCustomDaoConfig;
    private final MusicInfoDao musicInfoDao;
    private final DaoConfig musicInfoDaoConfig;
    private final MusicLoveInfoDao musicLoveInfoDao;
    private final DaoConfig musicLoveInfoDaoConfig;
    private final MusicRadioItemDao musicRadioItemDao;
    private final DaoConfig musicRadioItemDaoConfig;
    private final MusicUrlInfoDao musicUrlInfoDao;
    private final DaoConfig musicUrlInfoDaoConfig;
    private final NetRadioCollectDao netRadioCollectDao;
    private final DaoConfig netRadioCollectDaoConfig;
    private final NetRadioHistoryDao netRadioHistoryDao;
    private final DaoConfig netRadioHistoryDaoConfig;
    private final ReadHistoryInfoDao readHistoryInfoDao;
    private final DaoConfig readHistoryInfoDaoConfig;
    private final ReadLoveInfoDao readLoveInfoDao;
    private final DaoConfig readLoveInfoDaoConfig;
    private final ReadingInfoDao readingInfoDao;
    private final DaoConfig readingInfoDaoConfig;
    private final ReissueInfoDao reissueInfoDao;
    private final DaoConfig reissueInfoDaoConfig;
    private final SearchHistoryBeanDao searchHistoryBeanDao;
    private final DaoConfig searchHistoryBeanDaoConfig;
    private final TempSheetMusicInfoDao tempSheetMusicInfoDao;
    private final DaoConfig tempSheetMusicInfoDaoConfig;
    private final XpCacheInfoDao xpCacheInfoDao;
    private final DaoConfig xpCacheInfoDaoConfig;

    public DaoSession(Database database, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(database);
        this.searchHistoryBeanDaoConfig = map.get(SearchHistoryBeanDao.class).clone();
        this.searchHistoryBeanDaoConfig.initIdentityScope(identityScopeType);
        this.localLoveDaoConfig = map.get(LocalLoveDao.class).clone();
        this.localLoveDaoConfig.initIdentityScope(identityScopeType);
        this.reissueInfoDaoConfig = map.get(ReissueInfoDao.class).clone();
        this.reissueInfoDaoConfig.initIdentityScope(identityScopeType);
        this.tempSheetMusicInfoDaoConfig = map.get(TempSheetMusicInfoDao.class).clone();
        this.tempSheetMusicInfoDaoConfig.initIdentityScope(identityScopeType);
        this.musicUrlInfoDaoConfig = map.get(MusicUrlInfoDao.class).clone();
        this.musicUrlInfoDaoConfig.initIdentityScope(identityScopeType);
        this.readHistoryInfoDaoConfig = map.get(ReadHistoryInfoDao.class).clone();
        this.readHistoryInfoDaoConfig.initIdentityScope(identityScopeType);
        this.readingInfoDaoConfig = map.get(ReadingInfoDao.class).clone();
        this.readingInfoDaoConfig.initIdentityScope(identityScopeType);
        this.xpCacheInfoDaoConfig = map.get(XpCacheInfoDao.class).clone();
        this.xpCacheInfoDaoConfig.initIdentityScope(identityScopeType);
        this.audioLogoInfoDaoConfig = map.get(AudioLogoInfoDao.class).clone();
        this.audioLogoInfoDaoConfig.initIdentityScope(identityScopeType);
        this.musicInfoDaoConfig = map.get(MusicInfoDao.class).clone();
        this.musicInfoDaoConfig.initIdentityScope(identityScopeType);
        this.netRadioHistoryDaoConfig = map.get(NetRadioHistoryDao.class).clone();
        this.netRadioHistoryDaoConfig.initIdentityScope(identityScopeType);
        this.musicAlbumCustomDaoConfig = map.get(MusicAlbumCustomDao.class).clone();
        this.musicAlbumCustomDaoConfig.initIdentityScope(identityScopeType);
        this.netRadioCollectDaoConfig = map.get(NetRadioCollectDao.class).clone();
        this.netRadioCollectDaoConfig.initIdentityScope(identityScopeType);
        this.musicAlbumCollectDaoConfig = map.get(MusicAlbumCollectDao.class).clone();
        this.musicAlbumCollectDaoConfig.initIdentityScope(identityScopeType);
        this.latelyMusicInfoDaoConfig = map.get(LatelyMusicInfoDao.class).clone();
        this.latelyMusicInfoDaoConfig.initIdentityScope(identityScopeType);
        this.readLoveInfoDaoConfig = map.get(ReadLoveInfoDao.class).clone();
        this.readLoveInfoDaoConfig.initIdentityScope(identityScopeType);
        this.audioParseInfoDaoConfig = map.get(AudioParseInfoDao.class).clone();
        this.audioParseInfoDaoConfig.initIdentityScope(identityScopeType);
        this.musicRadioItemDaoConfig = map.get(MusicRadioItemDao.class).clone();
        this.musicRadioItemDaoConfig.initIdentityScope(identityScopeType);
        this.musicLoveInfoDaoConfig = map.get(MusicLoveInfoDao.class).clone();
        this.musicLoveInfoDaoConfig.initIdentityScope(identityScopeType);
        this.searchHistoryBeanDao = new SearchHistoryBeanDao(this.searchHistoryBeanDaoConfig, this);
        this.localLoveDao = new LocalLoveDao(this.localLoveDaoConfig, this);
        this.reissueInfoDao = new ReissueInfoDao(this.reissueInfoDaoConfig, this);
        this.tempSheetMusicInfoDao = new TempSheetMusicInfoDao(this.tempSheetMusicInfoDaoConfig, this);
        this.musicUrlInfoDao = new MusicUrlInfoDao(this.musicUrlInfoDaoConfig, this);
        this.readHistoryInfoDao = new ReadHistoryInfoDao(this.readHistoryInfoDaoConfig, this);
        this.readingInfoDao = new ReadingInfoDao(this.readingInfoDaoConfig, this);
        this.xpCacheInfoDao = new XpCacheInfoDao(this.xpCacheInfoDaoConfig, this);
        this.audioLogoInfoDao = new AudioLogoInfoDao(this.audioLogoInfoDaoConfig, this);
        this.musicInfoDao = new MusicInfoDao(this.musicInfoDaoConfig, this);
        this.netRadioHistoryDao = new NetRadioHistoryDao(this.netRadioHistoryDaoConfig, this);
        this.musicAlbumCustomDao = new MusicAlbumCustomDao(this.musicAlbumCustomDaoConfig, this);
        this.netRadioCollectDao = new NetRadioCollectDao(this.netRadioCollectDaoConfig, this);
        this.musicAlbumCollectDao = new MusicAlbumCollectDao(this.musicAlbumCollectDaoConfig, this);
        this.latelyMusicInfoDao = new LatelyMusicInfoDao(this.latelyMusicInfoDaoConfig, this);
        this.readLoveInfoDao = new ReadLoveInfoDao(this.readLoveInfoDaoConfig, this);
        this.audioParseInfoDao = new AudioParseInfoDao(this.audioParseInfoDaoConfig, this);
        this.musicRadioItemDao = new MusicRadioItemDao(this.musicRadioItemDaoConfig, this);
        this.musicLoveInfoDao = new MusicLoveInfoDao(this.musicLoveInfoDaoConfig, this);
        registerDao(SearchHistoryBean.class, this.searchHistoryBeanDao);
        registerDao(LocalLove.class, this.localLoveDao);
        registerDao(ReissueInfo.class, this.reissueInfoDao);
        registerDao(TempSheetMusicInfo.class, this.tempSheetMusicInfoDao);
        registerDao(MusicUrlInfo.class, this.musicUrlInfoDao);
        registerDao(ReadHistoryInfo.class, this.readHistoryInfoDao);
        registerDao(ReadingInfo.class, this.readingInfoDao);
        registerDao(XpCacheInfo.class, this.xpCacheInfoDao);
        registerDao(AudioLogoInfo.class, this.audioLogoInfoDao);
        registerDao(MusicInfo.class, this.musicInfoDao);
        registerDao(NetRadioHistory.class, this.netRadioHistoryDao);
        registerDao(MusicAlbumCustom.class, this.musicAlbumCustomDao);
        registerDao(NetRadioCollect.class, this.netRadioCollectDao);
        registerDao(MusicAlbumCollect.class, this.musicAlbumCollectDao);
        registerDao(LatelyMusicInfo.class, this.latelyMusicInfoDao);
        registerDao(ReadLoveInfo.class, this.readLoveInfoDao);
        registerDao(AudioParseInfo.class, this.audioParseInfoDao);
        registerDao(MusicRadioItem.class, this.musicRadioItemDao);
        registerDao(MusicLoveInfo.class, this.musicLoveInfoDao);
    }

    public void clear() {
        this.searchHistoryBeanDaoConfig.clearIdentityScope();
        this.localLoveDaoConfig.clearIdentityScope();
        this.reissueInfoDaoConfig.clearIdentityScope();
        this.tempSheetMusicInfoDaoConfig.clearIdentityScope();
        this.musicUrlInfoDaoConfig.clearIdentityScope();
        this.readHistoryInfoDaoConfig.clearIdentityScope();
        this.readingInfoDaoConfig.clearIdentityScope();
        this.xpCacheInfoDaoConfig.clearIdentityScope();
        this.audioLogoInfoDaoConfig.clearIdentityScope();
        this.musicInfoDaoConfig.clearIdentityScope();
        this.netRadioHistoryDaoConfig.clearIdentityScope();
        this.musicAlbumCustomDaoConfig.clearIdentityScope();
        this.netRadioCollectDaoConfig.clearIdentityScope();
        this.musicAlbumCollectDaoConfig.clearIdentityScope();
        this.latelyMusicInfoDaoConfig.clearIdentityScope();
        this.readLoveInfoDaoConfig.clearIdentityScope();
        this.audioParseInfoDaoConfig.clearIdentityScope();
        this.musicRadioItemDaoConfig.clearIdentityScope();
        this.musicLoveInfoDaoConfig.clearIdentityScope();
    }

    public SearchHistoryBeanDao getSearchHistoryBeanDao() {
        return this.searchHistoryBeanDao;
    }

    public LocalLoveDao getLocalLoveDao() {
        return this.localLoveDao;
    }

    public ReissueInfoDao getReissueInfoDao() {
        return this.reissueInfoDao;
    }

    public TempSheetMusicInfoDao getTempSheetMusicInfoDao() {
        return this.tempSheetMusicInfoDao;
    }

    public MusicUrlInfoDao getMusicUrlInfoDao() {
        return this.musicUrlInfoDao;
    }

    public ReadHistoryInfoDao getReadHistoryInfoDao() {
        return this.readHistoryInfoDao;
    }

    public ReadingInfoDao getReadingInfoDao() {
        return this.readingInfoDao;
    }

    public XpCacheInfoDao getXpCacheInfoDao() {
        return this.xpCacheInfoDao;
    }

    public AudioLogoInfoDao getAudioLogoInfoDao() {
        return this.audioLogoInfoDao;
    }

    public MusicInfoDao getMusicInfoDao() {
        return this.musicInfoDao;
    }

    public NetRadioHistoryDao getNetRadioHistoryDao() {
        return this.netRadioHistoryDao;
    }

    public MusicAlbumCustomDao getMusicAlbumCustomDao() {
        return this.musicAlbumCustomDao;
    }

    public NetRadioCollectDao getNetRadioCollectDao() {
        return this.netRadioCollectDao;
    }

    public MusicAlbumCollectDao getMusicAlbumCollectDao() {
        return this.musicAlbumCollectDao;
    }

    public LatelyMusicInfoDao getLatelyMusicInfoDao() {
        return this.latelyMusicInfoDao;
    }

    public ReadLoveInfoDao getReadLoveInfoDao() {
        return this.readLoveInfoDao;
    }

    public AudioParseInfoDao getAudioParseInfoDao() {
        return this.audioParseInfoDao;
    }

    public MusicRadioItemDao getMusicRadioItemDao() {
        return this.musicRadioItemDao;
    }

    public MusicLoveInfoDao getMusicLoveInfoDao() {
        return this.musicLoveInfoDao;
    }
}
