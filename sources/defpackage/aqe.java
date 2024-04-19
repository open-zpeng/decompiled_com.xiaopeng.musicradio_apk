package defpackage;

import android.util.Log;
import com.lzy.okgo.db.CacheManager;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.db.XpCacheInfo;
import com.xiaopeng.musicradio.service.c;
import com.xiaopeng.musicradio.utils.ad;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import defpackage.amp;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: QqManagerModel.java */
/* renamed from: aqe  reason: default package */
/* loaded from: classes2.dex */
public class aqe implements amp.a {
    private List<aqb> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QqManagerModel.java */
    /* renamed from: aqe$a */
    /* loaded from: classes2.dex */
    public static class a {
        static final aqe a = new aqe();
    }

    public static aqe b() {
        return a.a;
    }

    public aqe() {
        u.a(this);
        amp.a().a(this);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveLogout(agq.m mVar) {
        LogUtils.i("QqManagerModel", "receiveLogout: ");
        e();
        u.c(new agq.h(false));
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void receiveMusicBinded(agq.g gVar) {
        LogUtils.i("QqManagerModel", "receiveMusicBinded: ");
        ban.e(new Runnable() { // from class: aqe.1
            @Override // java.lang.Runnable
            public void run() {
                aqe.this.c();
            }
        });
    }

    public void c() {
        Log.i("QqManagerModel", "musicBindedSuccess: ");
        bct bctVar = (bct) c.a().b(bct.class);
        if (bctVar != null) {
            bctVar.fetchUserInfo();
        }
        u.c(new agq.h(true));
        d();
    }

    @Override // defpackage.amp.a
    public void p_() {
        ban.d(new Runnable() { // from class: aqe.2
            @Override // java.lang.Runnable
            public void run() {
                boolean d = apx.a().d();
                Log.i("QqManagerModel", "onDataFetch:isMusicBinded" + d);
                if (d) {
                    aqe.this.d();
                }
            }
        });
    }

    private void h() {
        ban.e(new Runnable() { // from class: aqe.3
            @Override // java.lang.Runnable
            public void run() {
                afk.a().b(XpCacheInfo.KEY_MUSIC_PLAY_LIST);
                afk.a().b(XpCacheInfo.KEY_DSP_CUSTOM_MUSIC);
            }
        });
        afk.a().b();
        LogUtils.i("QqManagerModel", "clearUserData: ");
        ban.e(new Runnable() { // from class: aqe.4
            @Override // java.lang.Runnable
            public void run() {
                arf arfVar;
                CacheManager.getInstance().clear();
                Log.i("QqManagerModel", "run: clearUserData");
                for (aqb aqbVar : aqe.this.a) {
                    aqbVar.c();
                }
                if (aei.a().c() != 0 || (arfVar = (arf) c.a().b(arf.class)) == null) {
                    return;
                }
                String listSign = arfVar.getListSign();
                boolean a2 = ad.a(listSign);
                boolean b = ad.b(listSign);
                if (a2 || b) {
                    return;
                }
                aei.a().b(-1);
            }
        });
    }

    public void d() {
        for (aqb aqbVar : this.a) {
            if (apx.a().d()) {
                aqbVar.d();
            }
        }
    }

    public void e() {
        LogUtils.i("QqManagerModel", "onUnAuthed");
        h();
    }

    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED)
    public void onPowerStateChange(agg.s sVar) {
        if (sVar.a()) {
            f();
        } else {
            i();
        }
    }

    private void i() {
        LogUtils.i("QqManagerModel", "onPowerOff");
    }

    public void f() {
        Log.i("QqManagerModel", "onPowerOn: ");
        ban.b(new Runnable() { // from class: aqe.5
            @Override // java.lang.Runnable
            public void run() {
                if (apx.a().d()) {
                    u.c(new agq.h(true));
                }
            }
        }, 1000L);
    }

    public void a(aqb aqbVar) {
        this.a.add(aqbVar);
    }

    public void g() {
        u.c(new agg.ai(-1));
        ban.j(new Runnable() { // from class: aqe.6
            @Override // java.lang.Runnable
            public void run() {
                arf arfVar;
                if (aei.a().c() != 0 || (arfVar = (arf) c.a().b(arf.class)) == null) {
                    return;
                }
                String listSign = arfVar.getListSign();
                boolean a2 = ad.a(listSign);
                boolean b = ad.b(listSign);
                if (a2 || b) {
                    return;
                }
                aei.a().g();
                arfVar.resetUserData();
                arfVar.resetPlayList();
                arfVar.clearUserData();
            }
        });
    }
}
