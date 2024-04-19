package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.NetRadioHistoryDao;
import com.xiaopeng.musicradio.bean.db.NetRadioHistory;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.utils.an;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: NetRadioHistoryOperation.java */
/* renamed from: apr  reason: default package */
/* loaded from: classes2.dex */
public class apr {
    private NetRadioHistoryDao a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetRadioHistoryOperation.java */
    /* renamed from: apr$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final apr a = new apr();
    }

    public static apr a() {
        return a.a;
    }

    private apr() {
        this.a = aff.a().b().getNetRadioHistoryDao();
    }

    private QueryBuilder<NetRadioHistory> b() {
        return this.a.queryBuilder().orderDesc(NetRadioHistoryDao.Properties.CacheTime);
    }

    public List<NetRadioInfo> a(int i, long j) {
        QueryBuilder<NetRadioHistory> b = b();
        b.where(NetRadioHistoryDao.Properties.CacheTime.lt(Long.valueOf(j)), new WhereCondition[0]).limit(i);
        List<NetRadioHistory> list = b.list();
        ArrayList arrayList = new ArrayList();
        for (NetRadioHistory netRadioHistory : list) {
            arrayList.add(an.a(netRadioHistory));
        }
        return arrayList;
    }

    public void a(NetRadioInfo netRadioInfo) {
        final NetRadioHistory a2 = an.a(netRadioInfo);
        a2.setCacheTime(System.currentTimeMillis());
        ban.e(new Runnable() { // from class: apr.1
            @Override // java.lang.Runnable
            public void run() {
                apr.this.a.insertOrReplace(a2);
                apr.this.c();
                u.c(new agg.n());
            }
        });
    }

    public void b(final NetRadioInfo netRadioInfo) {
        ban.e(new Runnable() { // from class: apr.2
            @Override // java.lang.Runnable
            public void run() {
                apr.this.a.deleteByKey(Long.valueOf(netRadioInfo.getId()));
                u.c(new agg.n());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int count = (int) this.a.count();
        if (count > 200) {
            int i = count - 200;
            List<NetRadioHistory> list = b().offset(200).limit(i).list();
            LogUtils.i("NetRadioHistoryOperation", "checkMax:" + i + ",size=" + list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.a.delete(list.get(i2));
            }
        }
    }
}
