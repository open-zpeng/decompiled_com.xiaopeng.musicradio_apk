package defpackage;

import com.xiaopeng.musicradio.bean.dao.TempSheetMusicInfoDao;
import com.xiaopeng.musicradio.bean.db.MusicInfo;
import com.xiaopeng.musicradio.bean.db.TempSheetMusicInfo;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: TempMusicInfoOperation.java */
/* renamed from: aob  reason: default package */
/* loaded from: classes2.dex */
public class aob {
    private TempSheetMusicInfoDao a;

    /* compiled from: TempMusicInfoOperation.java */
    /* renamed from: aob$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aob a = new aob(aff.a().b().getTempSheetMusicInfoDao());
    }

    public static aob a() {
        return a.a;
    }

    public aob(TempSheetMusicInfoDao tempSheetMusicInfoDao) {
        this.a = tempSheetMusicInfoDao;
    }

    public List<MusicInfo> a(int i) {
        List<TempSheetMusicInfo> list = this.a.queryBuilder().where(TempSheetMusicInfoDao.Properties.MusicFrom.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (TempSheetMusicInfo tempSheetMusicInfo : list) {
                arrayList.add(z.a(tempSheetMusicInfo.getMusicJson(), (Class<Object>) MusicInfo.class));
            }
        }
        return arrayList;
    }

    public List<TempSheetMusicInfo> b(int i) {
        return this.a.queryBuilder().where(TempSheetMusicInfoDao.Properties.MusicFrom.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
    }

    public void a(final String str) {
        avt.a().a(new Runnable() { // from class: aob.1
            @Override // java.lang.Runnable
            public void run() {
                aob.this.a.deleteInTx(aob.this.a.queryBuilder().where(TempSheetMusicInfoDao.Properties.FromTitle.eq(str), new WhereCondition[0]).list());
            }
        });
    }

    public void c(final int i) {
        avt.a().a(new Runnable() { // from class: aob.2
            @Override // java.lang.Runnable
            public void run() {
                aob.this.a.deleteInTx(aob.this.a.queryBuilder().where(TempSheetMusicInfoDao.Properties.MusicFrom.eq(Integer.valueOf(i)), new WhereCondition[0]).list());
            }
        });
    }

    public void a(List<MusicInfo> list, final int i) {
        final ArrayList arrayList = new ArrayList(list);
        avt.a().a(new Runnable() { // from class: aob.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList2 = new ArrayList();
                for (MusicInfo musicInfo : arrayList) {
                    TempSheetMusicInfo tempSheetMusicInfo = new TempSheetMusicInfo();
                    tempSheetMusicInfo.setMusicFrom(musicInfo.getMusicFrom());
                    tempSheetMusicInfo.setFromTitle(musicInfo.getMusicFromTitle());
                    tempSheetMusicInfo.setHash(musicInfo.getHash());
                    tempSheetMusicInfo.setSongId(musicInfo.getSongId());
                    tempSheetMusicInfo.setMusicJson(z.a(musicInfo));
                    tempSheetMusicInfo.setType(i);
                    tempSheetMusicInfo.setAlbumId(musicInfo.getAlbumId());
                    arrayList2.add(tempSheetMusicInfo);
                }
                aob.this.a.insertOrReplaceInTx(arrayList2);
            }
        });
    }

    public void b(List<MusicInfo> list, final int i) {
        final ArrayList arrayList = new ArrayList(list);
        avt.a().a(new Runnable() { // from class: aob.4
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList2 = new ArrayList();
                for (MusicInfo musicInfo : arrayList) {
                    TempSheetMusicInfo tempSheetMusicInfo = new TempSheetMusicInfo();
                    tempSheetMusicInfo.setMusicFrom(i);
                    tempSheetMusicInfo.setFromTitle(musicInfo.getMusicFromTitle());
                    tempSheetMusicInfo.setHash(musicInfo.getHash());
                    tempSheetMusicInfo.setSongId(musicInfo.getSongId());
                    tempSheetMusicInfo.setMusicJson(z.a(musicInfo));
                    tempSheetMusicInfo.setAlbumId(musicInfo.getAlbumId());
                    arrayList2.add(tempSheetMusicInfo);
                }
                aob.this.a.insertOrReplaceInTx(arrayList2);
            }
        });
    }

    public void a(final MusicInfo musicInfo, final int i) {
        avt.a().a(new Runnable() { // from class: aob.5
            @Override // java.lang.Runnable
            public void run() {
                TempSheetMusicInfo tempSheetMusicInfo = new TempSheetMusicInfo();
                tempSheetMusicInfo.setMusicFrom(i);
                tempSheetMusicInfo.setFromTitle(musicInfo.getMusicFromTitle());
                tempSheetMusicInfo.setHash(musicInfo.getHash());
                tempSheetMusicInfo.setSongId(musicInfo.getSongId());
                tempSheetMusicInfo.setMusicJson(z.a(musicInfo));
                tempSheetMusicInfo.setAlbumId(musicInfo.getAlbumId());
                aob.this.a.insertOrReplace(tempSheetMusicInfo);
            }
        });
    }

    public void b() {
        avt.a().a(new Runnable() { // from class: aob.6
            @Override // java.lang.Runnable
            public void run() {
                aob.this.a.deleteAll();
            }
        });
    }
}
