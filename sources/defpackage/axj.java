package defpackage;

import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.musicradio.bean.dao.ReadLoveInfoDao;
import com.xiaopeng.musicradio.bean.db.ReadLoveInfo;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: ReadLoveOperation.java */
/* renamed from: axj  reason: default package */
/* loaded from: classes2.dex */
public class axj {
    ConcurrentHashMap<Long, ReadLoveInfo> a = new ConcurrentHashMap<>();
    private volatile boolean c = false;
    private ReadLoveInfoDao b = aff.a().b().getReadLoveInfoDao();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReadLoveOperation.java */
    /* renamed from: axj$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final axj a = new axj();
    }

    public static axj a() {
        return a.a;
    }

    public axj() {
        ban.a(new Runnable() { // from class: axj.1
            @Override // java.lang.Runnable
            public void run() {
                List<ReadLoveInfo> c = axj.this.c();
                if (c != null) {
                    for (ReadLoveInfo readLoveInfo : c) {
                        axj.this.a.put(Long.valueOf(readLoveInfo.getAlbumId()), readLoveInfo);
                    }
                }
                axj.this.c = true;
            }
        });
    }

    public void a(final ReadLoveInfo readLoveInfo) {
        this.a.put(Long.valueOf(readLoveInfo.getAlbumId()), readLoveInfo);
        ban.e(new Runnable() { // from class: axj.2
            @Override // java.lang.Runnable
            public void run() {
                axj.this.b.insertOrReplace(readLoveInfo);
                axj.this.b();
            }
        });
    }

    public void b(ReadLoveInfo readLoveInfo) {
        this.a.put(Long.valueOf(readLoveInfo.getAlbumId()), readLoveInfo);
        this.b.insertOrReplace(readLoveInfo);
    }

    public void a(long j) {
        this.a.remove(Long.valueOf(j));
        this.b.deleteByKey(Long.valueOf(j));
    }

    public synchronized void b() {
        int count = (int) this.b.count();
        if (count > 500) {
            List<ReadLoveInfo> list = this.b.queryBuilder().orderAsc(ReadLoveInfoDao.Properties.Ts).limit(count - IInputController.KEYCODE_KNOB_WIND_SPD_UP).list();
            for (int i = 0; i < list.size(); i++) {
                this.b.deleteByKey(Long.valueOf(list.get(i).getAlbumId()));
                this.a.remove(Long.valueOf(list.get(i).getAlbumId()));
            }
        }
    }

    public void b(final long j) {
        this.a.remove(Long.valueOf(j));
        ban.e(new Runnable() { // from class: axj.3
            @Override // java.lang.Runnable
            public void run() {
                axj.this.b.deleteByKey(Long.valueOf(j));
            }
        });
    }

    public List<ReadLoveInfo> c() {
        return this.b.queryBuilder().orderDesc(ReadLoveInfoDao.Properties.Ts).list();
    }

    public List<ReadLoveInfo> a(int i, long j) {
        QueryBuilder<ReadLoveInfo> orderDesc = this.b.queryBuilder().orderDesc(ReadLoveInfoDao.Properties.Ts);
        orderDesc.where(ReadLoveInfoDao.Properties.Ts.lt(Long.valueOf(j)), new WhereCondition[0]).limit(i);
        return orderDesc.list();
    }

    public void d() {
        this.b.deleteAll();
        this.a.clear();
    }

    public long e() {
        if (this.c) {
            return this.a.size();
        }
        return this.b.count();
    }

    public boolean c(long j) {
        if (this.c) {
            return this.a.containsKey(Long.valueOf(j));
        }
        return this.b.load(Long.valueOf(j)) != null;
    }

    public HashMap<Long, ReadLoveInfo> f() {
        return new HashMap<>(this.a);
    }
}
