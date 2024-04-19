package defpackage;

import android.util.Log;
import com.xiaopeng.musicradio.bean.netradio.NetRadioInfo;
import com.xiaopeng.musicradio.bean.netradio.NetRadioProgramInfo;
import com.xiaopeng.musicradio.utils.bc;
import com.xiaopeng.musicradio.utils.be;
import com.xiaopeng.musicradio.utils.bg;
import com.xiaopeng.musicradio.utils.z;
import defpackage.apo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* compiled from: RadioDataProvider.java */
/* renamed from: apu  reason: default package */
/* loaded from: classes2.dex */
public abstract class apu<T> {
    private apo c;
    protected List<T> a = new ArrayList();
    protected int b = -1;
    private Runnable d = new Runnable() { // from class: apu.3
        @Override // java.lang.Runnable
        public void run() {
            apu.this.f();
        }
    };

    /* compiled from: RadioDataProvider.java */
    /* renamed from: apu$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(NetRadioProgramInfo netRadioProgramInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o() {
        return "SP_RADIO_CURRENT_INFO";
    }

    protected abstract void a(a aVar, NetRadioInfo netRadioInfo);

    protected abstract void a(NetRadioInfo netRadioInfo);

    protected abstract apo c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract NetRadioProgramInfo e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        this.b++;
        Log.i("RadioDataProvider", "next: " + this.b + " size = " + this.a.size());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        this.b--;
        Log.i("RadioDataProvider", "pre: " + this.b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final a aVar) {
        Log.i("RadioDataProvider", "rebootPlay: ");
        avt.a().a(new Runnable() { // from class: apu.1
            @Override // java.lang.Runnable
            public void run() {
                String b;
                int b2 = apu.this.k().b("SP_CURRENT_DATA_RPOVIDER", -1);
                if (b2 == -1) {
                    b = apu.this.k().b(apu.this.o(), "");
                } else {
                    String format = String.format("%d_%s", Integer.valueOf(b2), "SP_RADIO_CURRENT_INFO");
                    b = apu.this.k().b(format, "");
                    apu.this.k().a(format, "");
                    apu.this.k().a("SP_CURRENT_DATA_RPOVIDER", -1);
                }
                Log.i("RadioDataProvider", "run: " + b + " playIndex = " + apu.this.i());
                if (be.a((CharSequence) b)) {
                    return;
                }
                final NetRadioInfo netRadioInfo = (NetRadioInfo) z.a(b, (Class<Object>) NetRadioInfo.class);
                if (netRadioInfo.getPlayingInfo() != null) {
                    netRadioInfo.getPlayingInfo().setType(2);
                }
                Log.i("RadioDataProvider", "run: " + netRadioInfo);
                if (netRadioInfo.getProgramInfos() != null) {
                    for (NetRadioProgramInfo netRadioProgramInfo : netRadioInfo.getProgramInfos()) {
                        netRadioProgramInfo.setParentInfo(netRadioInfo);
                    }
                }
                ban.g(new Runnable() { // from class: apu.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar == null || netRadioInfo == null) {
                            return;
                        }
                        apu.this.a(aVar, netRadioInfo);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final NetRadioInfo netRadioInfo) {
        avt.a().a(new Runnable() { // from class: apu.2
            @Override // java.lang.Runnable
            public void run() {
                Log.i("RadioDataProvider", "run: " + apu.this.o() + " json = " + z.a(netRadioInfo));
                apu.this.k().a(apu.this.o(), z.a(netRadioInfo));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(NetRadioProgramInfo netRadioProgramInfo) {
        if (netRadioProgramInfo == null) {
            return;
        }
        p();
        amv.a().a(this.d);
        if (be.a((CharSequence) netRadioProgramInfo.getStartTime()) || be.a((CharSequence) netRadioProgramInfo.getEndTime())) {
            return;
        }
        Log.i("RadioDataProvider", "updateNextProgram: " + netRadioProgramInfo.getStartTime() + " endTime = " + netRadioProgramInfo.getEndTime());
        String endTime = netRadioProgramInfo.getEndTime();
        if (be.a(endTime, "00:00")) {
            endTime = "24:00";
        }
        Date a2 = bg.a(netRadioProgramInfo.getStartTime());
        Date a3 = bg.a(endTime);
        if (a2 == null || a3 == null) {
            return;
        }
        int hours = a3.getHours() - a2.getHours();
        int minutes = a3.getMinutes() - a2.getMinutes();
        long g = bg.g(System.currentTimeMillis());
        long f = bg.f(System.currentTimeMillis());
        long j = (hours * 3600) + (minutes * 60);
        long b = j - ((((3600 * g) + (60 * f)) + bg.b(System.currentTimeMillis())) % j);
        Log.i("RadioDataProvider", "updateNextProgram: h = " + hours + " m = " + minutes + " currentHour = " + g + " currentMin = " + f + " nextTime = " + b);
        amv.a().a(this.d, b * 1000);
    }

    protected void f() {
        p();
        this.c = c();
        apo apoVar = this.c;
        if (apoVar != null) {
            apoVar.a(new apo.a() { // from class: apu.4
                @Override // defpackage.apo.a
                public void a(NetRadioInfo netRadioInfo) {
                    Log.i("RadioDataProvider", "onUpdate: " + netRadioInfo);
                    apu.this.a(netRadioInfo);
                }
            });
        }
    }

    private void p() {
        apo apoVar = this.c;
        if (apoVar != null) {
            apoVar.a();
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        k().a("SP_BACK_POS", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return k().b("SP_BACK_POS", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Log.i("RadioDataProvider", "cancel: ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Log.i("RadioDataProvider", "savePlayIndex: " + this.b);
        k().a("SP_RADIO_PLAY_INDEX", this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        int b = k().b("SP_RADIO_PLAY_INDEX", -1);
        if (b == -1) {
            int b2 = k().b("SP_BACK_INDEX", -1);
            Log.i("RadioDataProvider", "getPlayIndex: ======" + b2);
            if (b2 != -1) {
                k().a("SP_RADIO_PLAY_INDEX", b2);
                k().a("SP_BACK_INDEX", -1);
                return b2;
            }
            return b;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        Log.i("RadioDataProvider", "savePlayState: ======" + i);
        k().a("SP_RADIO_PLAY_STATE_KEY", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        int b = k().b("SP_RADIO_PLAY_STATE_KEY", -1);
        Log.i("RadioDataProvider", "getLastPlayState: " + b);
        return b;
    }

    protected bc k() {
        return bc.a(com.xiaopeng.musicradio.a.a, "SP_RADIO_PROVIDER");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return e() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.a.size() > 0;
    }

    public List<T> n() {
        return this.a;
    }
}
