package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.ReadHistoryInfoDao;
import com.xiaopeng.musicradio.bean.db.ReadHistoryInfo;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: ReadHistoryOperation.java */
/* renamed from: axi  reason: default package */
/* loaded from: classes2.dex */
public class axi {
    private ConcurrentHashMap<Long, ReadHistoryInfo> b = new ConcurrentHashMap<>();
    private final ReadHistoryInfoDao a = aff.a().b().getReadHistoryInfoDao();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReadHistoryOperation.java */
    /* renamed from: axi$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final axi a = new axi();
    }

    public static axi a() {
        return a.a;
    }

    public void a(final ReadHistoryInfo readHistoryInfo) {
        this.b.put(Long.valueOf(readHistoryInfo.getAlbumId()), readHistoryInfo);
        ban.e(new Runnable() { // from class: axi.1
            @Override // java.lang.Runnable
            public void run() {
                axi.this.a.insertOrReplace(readHistoryInfo);
                axi.this.b();
                u.c(new agq.n(readHistoryInfo.getAlbumId(), true));
            }
        });
    }

    public void b() {
        int count = (int) this.a.count();
        if (count > 200) {
            int i = count - 200;
            List<ReadHistoryInfo> list = e().offset(200).limit(i).list();
            LogUtils.i("ReadHistoryOperation", "checkMax:" + i + ",size=" + list.size());
            for (ReadHistoryInfo readHistoryInfo : list) {
                this.b.remove(Long.valueOf(readHistoryInfo.getAlbumId()));
                this.a.delete(readHistoryInfo);
            }
        }
    }

    public ReadHistoryInfo a(long j) {
        ReadHistoryInfo readHistoryInfo = this.b.get(Long.valueOf(j));
        if (readHistoryInfo == null && (readHistoryInfo = this.a.load(Long.valueOf(j))) != null) {
            this.b.put(Long.valueOf(readHistoryInfo.getAlbumId()), readHistoryInfo);
        }
        return readHistoryInfo;
    }

    public long c() {
        if (this.b.isEmpty()) {
            return this.a.count();
        }
        return this.b.size();
    }

    public List<ReadHistoryInfo> d() {
        List<ReadHistoryInfo> list = this.a.queryBuilder().orderDesc(ReadHistoryInfoDao.Properties.Ts).list();
        for (ReadHistoryInfo readHistoryInfo : list) {
            this.b.put(Long.valueOf(readHistoryInfo.getAlbumId()), readHistoryInfo);
        }
        return list;
    }

    private QueryBuilder<ReadHistoryInfo> e() {
        return this.a.queryBuilder().orderDesc(ReadHistoryInfoDao.Properties.Ts);
    }

    public List<ReadHistoryInfo> a(int i, long j) {
        QueryBuilder<ReadHistoryInfo> e = e();
        e.where(ReadHistoryInfoDao.Properties.Ts.lt(Long.valueOf(j)), new WhereCondition[0]).limit(i);
        return e.list();
    }

    public List<ReadHistoryInfo> a(int i) {
        return i <= 0 ? new ArrayList() : this.a.queryBuilder().orderDesc(ReadHistoryInfoDao.Properties.Ts).limit(i).list();
    }

    public void b(final long j) {
        this.b.remove(Long.valueOf(j));
        ban.e(new Runnable() { // from class: axi.2
            @Override // java.lang.Runnable
            public void run() {
                axi.this.a.deleteByKey(Long.valueOf(j));
                u.c(new agq.n(j, false));
            }
        });
    }
}
