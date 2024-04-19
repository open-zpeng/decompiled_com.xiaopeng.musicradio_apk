package com.xiaopeng.musicradio;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.xiaopeng.lib.framework.aiassistantmodule.AiAssistantModuleEntry;
import com.xiaopeng.lib.framework.configuration.ConfigurationModuleEntry;
import com.xiaopeng.lib.framework.ipcmodule.IpcModuleEntry;
import com.xiaopeng.lib.framework.module.Module;
import com.xiaopeng.musicradio.common.KeepLiveService;
import com.xiaopeng.musicradio.common.g;
import com.xiaopeng.musicradio.model.mediacenter.MediaCenterModel;
import com.xiaopeng.musicradio.utils.ah;
import com.xiaopeng.musicradio.utils.ai;
import com.xiaopeng.musicradio.utils.aw;
import com.xiaopeng.musicradio.utils.ay;
import com.xiaopeng.musicradio.utils.d;
import com.xiaopeng.musicradio.utils.h;
import com.xiaopeng.musicradio.utils.s;
import com.xiaopeng.musicradio.utils.u;
import com.xiaopeng.musicradio.utils.y;
import com.xiaopeng.speech.protocol.bean.stats.SkillStatisticsBean;
import com.xiaopeng.speech.vui.VuiEngine;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.xui.Xui;
import defpackage.abg;
import defpackage.agg;
import defpackage.aho;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MusicApp extends a {
    private static MusicApp c;
    private agt d = new agt(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaopeng.musicradio.a, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Log.i("MusicApp", "attachBaseContext: =====");
        super.attachBaseContext(context);
    }

    @Override // com.xiaopeng.musicradio.a, android.app.Application
    public void onCreate() {
        c = this;
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.xiaopeng.musicradio.utils.c.a(this)) {
            super.onCreate();
            u.a(new afy(), new agb());
            b();
            if (com.xiaopeng.musicradio.utils.c.d(this)) {
                Log.i("MusicApp", "onCreate: ========end(sub process):" + (System.currentTimeMillis() - currentTimeMillis));
                android.webkit.a.a();
                bee.a((Application) this);
                Xui.setVuiEnable(true);
                VuiEngine.getInstance(this).setProcessName("webview");
                com.xiaopeng.speech.common.util.c.a(false);
                LogUtils.setLogEnable(false);
                VuiEngine.getInstance(this).subscribe("com.xiaopeng.musicradio.WebViewVuiObserver");
                VuiEngine.getInstance(this).disableViewVuiMode();
                return;
            }
            if (com.xiaopeng.musicradio.utils.c.c(this)) {
                arc.a().b();
            }
            ace.a(this);
            Log.i("MusicApp", "onCreate: ========end(sub process):" + (System.currentTimeMillis() - currentTimeMillis));
            return;
        }
        Log.i("MusicApp", "onCreate: versionName = " + com.xiaopeng.musicradio.utils.c.e(this));
        setTheme(aho.f.AppTheme);
        aci.a();
        super.onCreate();
        u.a(new afy(), new agb());
        c();
        aw.a((Object) getResources(), "setDrawableCacheEnabled", (Class<?>) Boolean.TYPE, (Object) true);
        afb.a(this);
        b();
        bee.a((Application) this);
        com.xiaopeng.musicradio.model.common.a.a();
        ay.a(this, "xp_music");
        arc.a().b();
        amw.a();
        ah.a();
        aff.c();
        axw.a();
        ban.b(new Runnable() { // from class: com.xiaopeng.musicradio.MusicApp.1
            @Override // java.lang.Runnable
            public void run() {
                ags.a().b();
            }
        }, 0L);
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.MusicApp.2
            @Override // java.lang.Runnable
            public void run() {
                a.b = true;
                Log.i("MusicApp", "AppInit: ==========  ");
                u.f(new agg.c());
            }
        }, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        ban.i(new Runnable() { // from class: com.xiaopeng.musicradio.MusicApp.3
            @Override // java.lang.Runnable
            public void run() {
                KeepLiveService.a(MusicApp.this);
            }
        });
        ace.a(this);
        s.a(this);
        apa.a();
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.MusicApp.4
            @Override // java.lang.Runnable
            public void run() {
                MusicApp.this.d();
            }
        });
        new d().a(this);
        y.a(this);
        g();
        Xui.init(this);
        Xui.setVuiEnable(true);
        Xui.setFontScaleDynamicChangeEnable(true);
        VuiEngine.getInstance(this).setLoglevel(LogUtils.LOG_DEBUG_LEVEL);
        VuiEngine.getInstance(this).subscribe("com.xiaopeng.musicradio.MusicVuiObserver");
        VuiEngine.getInstance(this).disableViewVuiMode();
        me.yokeyword.fragmentation.a.d().a(0).a(false).a();
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.MusicApp.5
            @Override // java.lang.Runnable
            public void run() {
                u.f(new agg.b());
            }
        });
        aex.a().b();
        Log.i("MusicApp", "onCreate: ========end:" + (System.currentTimeMillis() - currentTimeMillis));
        aci.b();
        this.d.a();
    }

    private void b() {
        Log.i("MusicApp", "commonInit:api_config=2");
        abg.a(true);
        abg.a(SkillStatisticsBean.PAGE_MUSIC);
        abg.a(new abg.a() { // from class: com.xiaopeng.musicradio.MusicApp.6
            @Override // defpackage.abg.a
            public void a(HashMap<String, Object> hashMap) {
                bcl.a().a(hashMap);
            }

            @Override // defpackage.abg.a
            public void b(HashMap<String, Object> hashMap) {
                hashMap.put("openid", aqi.a().b());
            }
        });
        f();
        ban.a();
        bee.a((Application) this);
        bah.a().b();
        sp.a((Application) this);
    }

    private void c() {
        Log.i("MusicApp", "registerModule: ===========");
        h.a();
        Module.register(ConfigurationModuleEntry.class, new ConfigurationModuleEntry());
        Module.register(IpcModuleEntry.class, new IpcModuleEntry(this));
        Module.register(AiAssistantModuleEntry.class, new AiAssistantModuleEntry(getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Log.i("MusicApp", "initModuleDelay() ============ " + getPackageName());
        e();
        bfb.b().a(a.a);
        bfb.b().a("音乐");
        MediaCenterModel.getInstance();
        ai.a().init(this, getPackageName());
        arc.a().c();
        g.a().b();
        amx.a().b();
    }

    private void e() {
        Log.i("MusicApp", "initLocation: =========");
        apd.a();
    }

    private void f() {
        auu.a((Application) this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        com.xiaopeng.lib.utils.LogUtils.i("MusicApp", "onTrimMemory: " + i);
        super.onTrimMemory(i);
        Glide.get(this).onTrimMemory(i);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        Glide.get(this).onLowMemory();
    }

    private void g() {
        Log.i("MusicApp", "preLoad: ==========");
        bcf.a();
    }
}
