package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.c;
import com.xiaopeng.musicradio.utils.u;
import defpackage.agg;
import defpackage.agq;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* compiled from: ModuleManager.java */
/* renamed from: arc  reason: default package */
/* loaded from: classes2.dex */
public class arc {
    private Map<Class<?>, arb> a = new HashMap();

    /* compiled from: ModuleManager.java */
    /* renamed from: arc$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final arc a = new arc();
    }

    public static arc a() {
        return a.a;
    }

    public arc() {
        u.a(this);
    }

    public void b() {
        Log.i("ModuleManager", "init: ===========");
        a("com.xiaopeng.musicradio.CommonInit");
        a("com.xiaopeng.musicradio.MusicInit");
        a("com.xiaopeng.musicradio.ProgramInit");
        a("com.xiaopeng.musicradio.LoginInit");
        a("com.xiaopeng.musicradio.NetRadioInit");
        a("com.xiaopeng.musicradio.VipInit");
        a("com.xiaopeng.musicradio.MineInit");
        a("com.xiaopeng.musicradio.WebViewInit");
        a("com.xiaopeng.musicradio.PlayerComponentInit");
        a("com.xiaopeng.musicradio.MusicAppInit");
        a("com.xiaopeng.musicradio.search.SearchInit");
        a("com.xiaopeng.musicradio.usb.UsbInit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(String str) {
        try {
            a((Class<? extends arb>) Class.forName(str));
        } catch (Exception e) {
            LogUtils.e("ModuleManager", "registerModule:%s fail, %s", str, e.toString());
        }
    }

    private void a(Class<? extends arb> cls) {
        if (cls != null) {
            if (this.a.get(cls) != null) {
                LogUtils.w("ModuleManager", "clazz(%s) had register", cls.getName());
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                arb newInstance = cls.newInstance();
                if (c.a(com.xiaopeng.musicradio.a.a)) {
                    newInstance.registerService();
                    newInstance.initNow();
                } else {
                    newInstance.initPlayer();
                }
                this.a.put(cls, newInstance);
                LogUtils.i("ModuleManager", "moduleInit %s takes :%d ms", cls.getName(), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Exception e) {
                LogUtils.e(e, "registerModule %s fail, %s", cls.getName(), e.toString());
            }
        }
    }

    public void c() {
        for (Map.Entry<Class<?>, arb> entry : this.a.entrySet()) {
            arb value = entry.getValue();
            value.initDelay();
            LogUtils.w("ModuleManager", "delayInit clazz(%s)", value.getClass().getName());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPowerStateChange(agg.s sVar) {
        for (Map.Entry<Class<?>, arb> entry : this.a.entrySet()) {
            arb value = entry.getValue();
            if (sVar.a()) {
                value.igOn();
            } else {
                value.igOff();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveMusicBinded(agq.g gVar) {
        for (Map.Entry<Class<?>, arb> entry : this.a.entrySet()) {
            entry.getValue().onMusicBinded();
        }
    }
}
