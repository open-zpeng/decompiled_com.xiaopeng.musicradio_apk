package defpackage;

import androidx.lifecycle.LiveData;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.datalist.e;
import com.xiaopeng.musicradio.datalist.f;
import com.xiaopeng.musicradio.service.c;
import io.reactivex.annotations.NonNull;
/* compiled from: NetRadioUtils.java */
/* renamed from: amm  reason: default package */
/* loaded from: classes2.dex */
public class amm {
    @NonNull
    public static LiveData<f<NetRadioInfo>> a(e eVar) {
        return (LiveData) ((aua) c.a().b(aua.class)).getCollectedNetRadioList(eVar);
    }

    @NonNull
    public static LiveData<f<NetRadioInfo>> b(e eVar) {
        return (LiveData) ((aua) c.a().b(aua.class)).getHistoryNetRadioList(eVar);
    }

    public static void a(NetRadioInfo netRadioInfo) {
        ((aua) c.a().b(aua.class)).play(netRadioInfo);
    }

    public static NetRadioInfo a() {
        NetRadioProgramInfo netRadioProgramInfo = (NetRadioProgramInfo) ((aua) c.a().b(aua.class)).getPlayingInfo();
        if (netRadioProgramInfo != null) {
            return netRadioProgramInfo.getParentInfo();
        }
        return null;
    }

    public static int b() {
        return ((aua) c.a().b(aua.class)).getPlayState();
    }

    public static boolean c() {
        return aei.a().c() == 6 && a() != null;
    }

    public static boolean b(NetRadioInfo netRadioInfo) {
        int c = aei.a().c();
        if (netRadioInfo != null) {
            NetRadioInfo a = a();
            return c == 6 && a != null && a.getId() == netRadioInfo.getId();
        }
        return false;
    }

    public static void a(NetRadioInfo netRadioInfo, boolean z) {
        ((aua) c.a().b(aua.class)).setCollectedNetRadio(netRadioInfo, z);
    }

    public static void c(NetRadioInfo netRadioInfo) {
        ((aua) c.a().b(aua.class)).removeHistoryNetRadio(netRadioInfo);
    }

    public static void d() {
        ((aua) c.a().b(aua.class)).checkoutDataCollect();
    }

    public static boolean d(NetRadioInfo netRadioInfo) {
        return ((aua) c.a().b(aua.class)).isCollected(netRadioInfo);
    }
}
