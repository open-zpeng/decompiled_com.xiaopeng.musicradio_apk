package com.xiaopeng.musicradio.model.dui;

import android.util.Log;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.bean.netradio.DuiFmInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.utils.z;
import java.util.ArrayList;
/* compiled from: DuiFmModel.java */
/* loaded from: classes.dex */
public class c extends bgo implements com.xiaopeng.speech.protocol.node.fm.a {
    public void b() {
    }

    /* compiled from: DuiFmModel.java */
    /* loaded from: classes.dex */
    private static class a {
        private static c a = new c();
    }

    private c() {
    }

    public static c a() {
        return a.a;
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void c() {
        LogUtils.i("DuiFmModel", "收到本地电台语音消息： 打开 ");
        h();
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void d() {
        LogUtils.i("DuiFmModel", "收到本地电台语音消息： 关闭 onFmLocalOff");
        if (aei.a().c() == 6) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.1
                @Override // java.lang.Runnable
                public void run() {
                    ags.a().a(false);
                    aps.i().pause();
                }
            });
        }
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void e() {
        LogUtils.i("DuiFmModel", "收到本地电台语音消息： 打开 onFmNetworkOn");
        h();
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void f() {
        LogUtils.i("DuiFmModel", "收到本地电台语音消息： 打开 onFmNetworkOff");
        if (aei.a().c() == 6) {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.2
                @Override // java.lang.Runnable
                public void run() {
                    ags.a().a(false);
                    aps.i().pause();
                }
            });
        }
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void a(final String str) {
        LogUtils.i("DuiFmModel", "FMChannel  : " + str);
        try {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.3
                @Override // java.lang.Runnable
                public void run() {
                    NetRadioInfo netRadioInfo = (NetRadioInfo) z.a(((DuiFmInfo) z.a(str, (Class<Object>) DuiFmInfo.class)).getFmInfo(), (Class<Object>) NetRadioInfo.class);
                    amw.a().c();
                    if (netRadioInfo != null) {
                        aps.i().a(netRadioInfo);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void a(String str, final String str2) {
        LogUtils.i("DuiFmModel", "onFmPlayChannelName == command = " + str + str2);
        try {
            ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.4
                @Override // java.lang.Runnable
                public void run() {
                    NetRadioInfo netRadioInfo = (NetRadioInfo) z.a(((DuiFmInfo) z.a(str2, (Class<Object>) DuiFmInfo.class)).getFmInfo(), (Class<Object>) NetRadioInfo.class);
                    amw.a().c();
                    if (netRadioInfo != null) {
                        aps.i().a(netRadioInfo);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaopeng.speech.protocol.node.fm.a
    public void g() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.5
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<NetRadioInfo> b = apt.a().b();
                if (b.size() > 0) {
                    amw.a().c();
                    aps.i().a(b.get(0));
                }
            }
        });
    }

    private void h() {
        ban.g(new Runnable() { // from class: com.xiaopeng.musicradio.model.dui.c.6
            @Override // java.lang.Runnable
            public void run() {
                String b = apd.a().b();
                Log.i("DuiFmModel", "run: " + b);
                amw.a().c();
                apt.a().a(b);
            }
        });
    }
}
