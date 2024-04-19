package defpackage;

import android.util.Log;
import com.lzy.okgo.db.CacheManager;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: UserManagerModel.java */
@Deprecated
/* renamed from: aqk  reason: default package */
/* loaded from: classes2.dex */
public class aqk {
    private bam a;
    private List<aqc> b = new ArrayList();

    /* compiled from: UserManagerModel.java */
    /* renamed from: aqk$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final aqk a = new aqk();
    }

    public static aqk a() {
        return a.a;
    }

    public aqk() {
        u.a(this);
        aqe.b();
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveLogout(agq.v vVar) {
        LogUtils.i("UserManagerModel", "receiveLogout: ");
        c();
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void netValid(agg.p pVar) {
        if (aqi.a().f()) {
            Log.i("UserManagerModel", "netValid: ========");
            b();
            aqg.c().a();
        }
    }

    private void d() {
        LogUtils.i("UserManagerModel", "clearUserData: ");
        ban.e(new Runnable() { // from class: aqk.1
            @Override // java.lang.Runnable
            public void run() {
                CacheManager.getInstance().clear();
                Log.i("UserManagerModel", "run: clearUserData");
                for (aqc aqcVar : aqk.this.b) {
                    aqcVar.a();
                }
            }
        });
    }

    public void b() {
        for (aqc aqcVar : this.b) {
            if (!aqcVar.c() || apx.a().d()) {
                aqcVar.b();
            }
        }
    }

    public void c() {
        LogUtils.i("UserManagerModel", "onUnAuthed");
        d();
        bam bamVar = this.a;
        if (bamVar != null) {
            bamVar.a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onPowerStateChange(agg.s sVar) {
        if (sVar.a()) {
            return;
        }
        e();
    }

    private void e() {
        LogUtils.i("UserManagerModel", "onPowerOff");
        ay.a("should_down_read_love", false);
    }
}
