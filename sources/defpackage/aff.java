package defpackage;

import com.xiaopeng.musicradio.bean.dao.DaoMaster;
import com.xiaopeng.musicradio.bean.dao.DaoSession;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
/* compiled from: DbHelper.java */
/* renamed from: aff  reason: default package */
/* loaded from: classes2.dex */
public class aff {
    private final DaoSession a;

    private aff() {
        this.a = new DaoMaster(new afh(com.xiaopeng.musicradio.a.a, SkillStatisticsBean.PAGE_MUSIC, null).getWritableDatabase()).newSession();
    }

    public static aff a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DbHelper.java */
    /* renamed from: aff$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final aff a = new aff();
    }

    public DaoSession b() {
        return this.a;
    }

    public static void c() {
        a();
    }

    public static int d() {
        return afg.b;
    }
}
