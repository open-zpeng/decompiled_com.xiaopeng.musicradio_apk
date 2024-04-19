package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.ReadingInfoDao;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.bean.db.ReadingInfo;
import com.xiaopeng.musicradio.bean.xpbean.FMAlbumDetailBean;
import com.xiaopeng.musicradio.bean.xpbean.RdAlbumBean;
import com.xiaopeng.musicradio.utils.u;
import defpackage.age;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ReadingRepository.java */
/* renamed from: axk  reason: default package */
/* loaded from: classes2.dex */
public class axk {
    private ConcurrentHashMap<Long, RdAlbumBean> a;
    private List<Long> b;
    private ReadingInfoDao c;

    private axk() {
        this.a = new ConcurrentHashMap<>();
        this.b = new ArrayList();
        this.c = aff.a().b().getReadingInfoDao();
    }

    public static axk a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReadingRepository.java */
    /* renamed from: axk$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final axk a = new axk();
    }

    public ReadingInfo a(long j) {
        return this.c.load(Long.valueOf(j));
    }

    public void a(final ReadingInfo readingInfo) {
        ban.e(new Runnable() { // from class: axk.1
            @Override // java.lang.Runnable
            public void run() {
                readingInfo.setUpdateTime(System.currentTimeMillis());
                axk.this.c.insertOrReplace(readingInfo);
                axk.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        final int count = (int) this.c.count();
        if (count > 1024) {
            ban.e(new Runnable() { // from class: axk.2
                @Override // java.lang.Runnable
                public void run() {
                    axk.this.c.deleteInTx(axk.this.c.queryBuilder().orderAsc(ReadingInfoDao.Properties.UpdateTime).limit(count - 1024).list());
                }
            });
        }
    }

    public void a(final long j, final Runnable runnable, final Runnable runnable2) {
        if (this.b.contains(Long.valueOf(j))) {
            LogUtils.d("ReadingRepository", "albumId " + j + " is running, return");
            return;
        }
        this.b.add(Long.valueOf(j));
        axp.a().a(j, new avc<FMAlbumDetailBean>() { // from class: axk.3
            @Override // defpackage.avc
            public void a(FMAlbumDetailBean fMAlbumDetailBean) {
                RdAlbumBean data = fMAlbumDetailBean.getData();
                if (data != null) {
                    axk.this.a.put(Long.valueOf(fMAlbumDetailBean.getData().getId()), data);
                    u.c(new age.o());
                    runnable.run();
                } else {
                    runnable2.run();
                }
                axk.this.b.remove(Long.valueOf(j));
            }

            @Override // defpackage.avc
            public void a(int i, String str) {
                runnable2.run();
                axk.this.b.remove(Long.valueOf(j));
            }
        });
    }

    public String b(long j) {
        RdAlbumBean rdAlbumBean;
        if (!c(j) || (rdAlbumBean = this.a.get(Long.valueOf(j))) == null) {
            return "";
        }
        if (!TextUtils.isEmpty(rdAlbumBean.getLargeLogo())) {
            return rdAlbumBean.getLargeLogo();
        }
        if (TextUtils.isEmpty(rdAlbumBean.getMediumLogo())) {
            return !TextUtils.isEmpty(rdAlbumBean.getSmallLogo()) ? rdAlbumBean.getSmallLogo() : "";
        }
        return rdAlbumBean.getMediumLogo();
    }

    public boolean c(long j) {
        return this.a.containsKey(Long.valueOf(j));
    }

    public void a(ReadHistoryInfo readHistoryInfo) {
        RdAlbumBean rdAlbumBean = this.a.get(Long.valueOf(readHistoryInfo.getAlbumId()));
        if (rdAlbumBean != null) {
            readHistoryInfo.setAlbumName(rdAlbumBean.getTitle());
            readHistoryInfo.setLogo(rdAlbumBean.getSmallLogo());
            readHistoryInfo.setMediumLogo(rdAlbumBean.getMediumLogo());
            readHistoryInfo.setLargeLogo(rdAlbumBean.getLargeLogo());
        }
    }
}
