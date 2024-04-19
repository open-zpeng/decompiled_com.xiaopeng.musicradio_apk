package defpackage;

import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.dao.ReissueInfoDao;
import com.xiaopeng.musicradio.bean.db.ReissueInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;
/* compiled from: ReissueOperation.java */
/* renamed from: afi  reason: default package */
/* loaded from: classes2.dex */
public class afi extends afe {
    private HashSet<String> d;
    private HashSet<String> e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReissueOperation.java */
    /* renamed from: afi$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final afi a = new afi();
    }

    public static afi d() {
        return a.a;
    }

    private afi() {
        this.d = new HashSet<>();
        this.e = new HashSet<>();
    }

    public void e() {
        synchronized (this.d) {
            this.d.clear();
        }
        this.a.queryBuilder().where(ReissueInfoDao.Properties.ReissueType.eq(1), new WhereCondition[0]).buildDelete();
    }

    public void c(final List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ban.e(new Runnable() { // from class: afi.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (afi.this.d) {
                    afi.this.d.addAll(list);
                }
            }
        });
    }

    public void f() {
        synchronized (this.d) {
            LogUtils.i("ReissueOperation", "mQqFailedIds:" + this.d.size());
            if (this.d.isEmpty()) {
                return;
            }
            ban.e(new Runnable() { // from class: afi.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        List<ReissueInfo> loadAll = afi.this.a.loadAll();
                        ArrayList arrayList = new ArrayList();
                        synchronized (afi.this.d) {
                            for (ReissueInfo reissueInfo : loadAll) {
                                if (afi.this.d.contains(reissueInfo.getObjectId())) {
                                    arrayList.add(reissueInfo);
                                }
                            }
                            afi.this.d.clear();
                        }
                        LogUtils.i("ReissueOperation", "failedList:" + arrayList.size());
                        afi.this.b.a(arrayList);
                    } catch (Exception e) {
                        LogUtils.e("ReissueOperation", e);
                    }
                }
            });
        }
    }

    public void g() {
        synchronized (this.e) {
            this.e.clear();
        }
        this.a.queryBuilder().where(ReissueInfoDao.Properties.ReissueType.eq(2), new WhereCondition[0]).buildDelete();
    }

    public void d(final List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ban.e(new Runnable() { // from class: afi.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (afi.this.e) {
                    afi.this.e.addAll(list);
                }
            }
        });
    }

    public void h() {
        synchronized (this.e) {
            LogUtils.i("ReissueOperation", "mXmlyFailedIds:" + this.e.size());
            if (this.e.isEmpty()) {
                return;
            }
            ban.e(new Runnable() { // from class: afi.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        List<ReissueInfo> loadAll = afi.this.a.loadAll();
                        ArrayList arrayList = new ArrayList();
                        synchronized (afi.this.e) {
                            for (ReissueInfo reissueInfo : loadAll) {
                                if (afi.this.e.contains(reissueInfo.getObjectId())) {
                                    arrayList.add(reissueInfo);
                                }
                            }
                            afi.this.e.clear();
                        }
                        LogUtils.i("ReissueOperation", "failedList:Xmly:" + arrayList.size());
                        afi.this.b.a(arrayList);
                    } catch (Exception e) {
                        LogUtils.e("ReissueOperation", e);
                    }
                }
            });
        }
    }
}
