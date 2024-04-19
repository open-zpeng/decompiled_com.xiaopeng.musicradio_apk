package defpackage;

import android.text.TextUtils;
import com.xiaopeng.lib.framework.moduleinterface.carcontroller.IInputController;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.LatelyMusicInfoDao;
import com.xiaopeng.musicradio.bean.db.LatelyMusicInfo;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agq;
import defpackage.aoa;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: LatelyMusicOperation.java */
/* renamed from: anr  reason: default package */
/* loaded from: classes2.dex */
public class anr extends apy {
    private final LatelyMusicInfoDao a = aff.a().b().getLatelyMusicInfoDao();
    private final aoa<LatelyMusicInfo> b = new aoa<>("LatelyMusicOperation", IInputController.KEYCODE_KNOB_WIND_SPD_UP);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LatelyMusicOperation.java */
    /* renamed from: anr$b */
    /* loaded from: classes2.dex */
    public static class b {
        static final anr a = new anr();
    }

    public static anr a() {
        return b.a;
    }

    public void a(LatelyMusicInfo latelyMusicInfo) {
        LatelyMusicInfo unique = this.a.queryBuilder().where(LatelyMusicInfoDao.Properties.Hash.eq(latelyMusicInfo.getHash()), new WhereCondition[0]).where(LatelyMusicInfoDao.Properties.Uid.eq(g()), new WhereCondition[0]).unique();
        if (unique != null) {
            latelyMusicInfo.setCacheId(unique.getCacheId());
        }
        this.b.a(0, (int) latelyMusicInfo);
        this.a.insertOrReplace(latelyMusicInfo);
        e();
        u.c(new agq.j(latelyMusicInfo.getHash()));
    }

    public void b(LatelyMusicInfo latelyMusicInfo) {
        try {
            this.b.a((aoa<LatelyMusicInfo>) latelyMusicInfo);
            this.a.update(latelyMusicInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e() {
        String g = g();
        int count = (int) a(g, false).count();
        if (count > 500) {
            QueryBuilder<LatelyMusicInfo> offset = a(g, true).offset(IInputController.KEYCODE_KNOB_WIND_SPD_UP);
            int i = count - IInputController.KEYCODE_KNOB_WIND_SPD_UP;
            List<LatelyMusicInfo> list = offset.limit(i).list();
            LogUtils.i("LatelyMusicOperation", "checkMax:" + i + ",size=" + list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.a.delete(list.get(i2));
            }
        }
    }

    public void a(List<String> list) {
        this.b.a(list, new a());
        List<LatelyMusicInfo> list2 = this.a.queryBuilder().where(LatelyMusicInfoDao.Properties.Hash.in(list), new WhereCondition[0]).where(LatelyMusicInfoDao.Properties.Uid.eq(g()), new WhereCondition[0]).list();
        if (!list2.isEmpty()) {
            this.a.deleteInTx(list2);
        }
        u.c(new agq.j(null));
    }

    public void b(final List<String> list) {
        ban.e(new Runnable() { // from class: anr.1
            @Override // java.lang.Runnable
            public void run() {
                anr.this.a(list);
            }
        });
    }

    public LatelyMusicInfo a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (LatelyMusicInfo latelyMusicInfo : b()) {
                if (str.equals(latelyMusicInfo.getHash())) {
                    return latelyMusicInfo;
                }
            }
        }
        return null;
    }

    public List<LatelyMusicInfo> b() {
        String g = g();
        List<LatelyMusicInfo> a2 = this.b.a(g);
        if (a2 != null) {
            return a2;
        }
        List<LatelyMusicInfo> list = a(g, true).limit(IInputController.KEYCODE_KNOB_WIND_SPD_UP).list();
        this.b.a(g, list);
        return list;
    }

    public QueryBuilder<LatelyMusicInfo> a(String str, boolean z) {
        QueryBuilder<LatelyMusicInfo> where = this.a.queryBuilder().where(LatelyMusicInfoDao.Properties.Uid.eq(str), new WhereCondition[0]);
        return z ? where.orderDesc(LatelyMusicInfoDao.Properties.Ts) : where;
    }

    public void b(String str) {
        try {
            List<LatelyMusicInfo> list = this.a.queryBuilder().where(LatelyMusicInfoDao.Properties.Uid.eq(str), new WhereCondition[0]).list();
            if (list.isEmpty()) {
                return;
            }
            this.a.deleteInTx(list);
        } catch (Exception e) {
            LogUtils.e("LatelyMusicOperation", "deleteSyncByUid:" + e.getLocalizedMessage());
        }
    }

    public void c() {
        this.b.a();
    }

    public long d() {
        return this.a.queryBuilder().where(LatelyMusicInfoDao.Properties.Uid.eq(g()), new WhereCondition[0]).count();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LatelyMusicOperation.java */
    /* renamed from: anr$a */
    /* loaded from: classes2.dex */
    public static class a implements aoa.a<LatelyMusicInfo, String> {
        @Override // defpackage.aoa.a
        public boolean a() {
            return true;
        }

        private a() {
        }

        @Override // defpackage.aoa.a
        public boolean a(LatelyMusicInfo latelyMusicInfo, String str) {
            return (latelyMusicInfo == null || str == null || !str.equals(latelyMusicInfo.getHash())) ? false : true;
        }
    }
}
