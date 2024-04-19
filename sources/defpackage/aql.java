package defpackage;

import android.util.Log;
import com.lzy.okgo.db.CacheManager;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import defpackage.amp;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: XmlyManagerModel.java */
/* renamed from: aql  reason: default package */
/* loaded from: classes2.dex */
public class aql implements amp.a {
    private List<aqd> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: XmlyManagerModel.java */
    /* renamed from: aql$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aql a = new aql();
    }

    public static aql b() {
        return a.a;
    }

    public aql() {
        u.a(this);
        amp.a().a(this);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveLogout(agq.s sVar) {
        LogUtils.i("XmlyManagerModel", "ReadingUnBinded: ");
        f();
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveReadingBinded(agq.r rVar) {
        LogUtils.i("XmlyManagerModel", "ReadingBinded: ");
        ban.e(new Runnable() { // from class: aql.1
            @Override // java.lang.Runnable
            public void run() {
                aql.this.c();
            }
        });
    }

    public void c() {
        Log.i("XmlyManagerModel", "readingBindedSuccess: ");
        ay.b("should_down_read_love", true);
        bcv bcvVar = (bcv) c.a().b(bcv.class);
        if (bcvVar != null) {
            bcvVar.fetchUserInfo();
        }
        d();
    }

    @Override // defpackage.amp.a
    public void p_() {
        ban.d(new Runnable() { // from class: aql.2
            @Override // java.lang.Runnable
            public void run() {
                boolean e = aqf.a().e();
                Log.i("XmlyManagerModel", "onDataFetch:isReadingBinded" + e);
                if (e) {
                    aql.this.e();
                    afi.d().h();
                }
            }
        });
    }

    private void h() {
        LogUtils.i("XmlyManagerModel", "clearUserData: ");
        ban.e(new Runnable() { // from class: aql.3
            @Override // java.lang.Runnable
            public void run() {
                CacheManager.getInstance().clear();
                afi.d().g();
                Log.i("XmlyManagerModel", "run: clearUserData");
                for (aqd aqdVar : aql.this.a) {
                    aqdVar.b();
                }
            }
        });
    }

    public void d() {
        for (aqd aqdVar : this.a) {
            if (aqf.a().e()) {
                aqdVar.c();
            }
        }
    }

    public void e() {
        for (aqd aqdVar : this.a) {
            if (aqf.a().e()) {
                aqdVar.e();
            }
        }
    }

    public void f() {
        LogUtils.i("XmlyManagerModel", "onUnAuthed");
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onPowerStateChange(agg.s sVar) {
        if (sVar.a()) {
            g();
        } else {
            i();
        }
    }

    private void i() {
        LogUtils.i("XmlyManagerModel", "onPowerOff");
    }

    public void g() {
        Log.i("XmlyManagerModel", "onPowerOn: ");
        ban.b(new Runnable() { // from class: aql.4
            @Override // java.lang.Runnable
            public void run() {
                if (aqf.a().e()) {
                    ban.e(new Runnable() { // from class: aql.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aql.this.c();
                        }
                    });
                }
            }
        }, 1000L);
    }

    public void a(aqd aqdVar) {
        this.a.add(aqdVar);
    }
}
