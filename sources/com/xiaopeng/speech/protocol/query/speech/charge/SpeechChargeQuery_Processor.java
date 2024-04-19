package com.xiaopeng.speech.protocol.query.speech.charge;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechChargeQuery_Processor implements IQueryProcessor {
    private SpeechChargeQuery a;

    public SpeechChargeQuery_Processor(SpeechChargeQuery speechChargeQuery) {
        this.a = speechChargeQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2112164824:
                if (str.equals("charge.mileage.num")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1562235108:
                if (str.equals("charge.gun.lock.st")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1431793793:
                if (str.equals("charge.add.electri")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1056966063:
                if (str.equals("charge.dc.charging.current")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1033894871:
                if (str.equals("charge.dc.charging.volt")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -954113537:
                if (str.equals("charge.wltp.mileage.num")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -927637931:
                if (str.equals("charge.aver.veh.consume")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -735246937:
                if (str.equals("charge.battery.cool.state")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -685146427:
                if (str.equals("charge.charging.error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -672173746:
                if (str.equals("charge.charging.state")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -460071101:
                if (str.equals("charge.cold.warn.tip")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -370089957:
                if (str.equals("charge.ac.input.state")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 105277287:
                if (str.equals("charge.get.aver.consume.100km")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 185907206:
                if (str.equals("charge.cltc.mileage.num")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 299529912:
                if (str.equals("charge.hvac.consume")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 391995010:
                if (str.equals("charge.get.limit.soc")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 497707660:
                if (str.equals("charge.ac.charging.volt")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 610188398:
                if (str.equals("charge.electric.percent")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 855595168:
                if (str.equals("charge.charging.gun.state")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 959650120:
                if (str.equals("charge.endurance.mileage.mode")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 984976355:
                if (str.equals("charge.battery.warm.state")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1026255738:
                if (str.equals("charge.charging.max.soc")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1416974162:
                if (str.equals("charge.soh")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1476449550:
                if (str.equals("charge.ac.charging.current")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Integer.valueOf(this.a.e(str, str2));
            case 4:
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Double.valueOf(this.a.j(str, str2));
            case '\t':
                return Boolean.valueOf(this.a.k(str, str2));
            case '\n':
                return Double.valueOf(this.a.l(str, str2));
            case 11:
                return Boolean.valueOf(this.a.m(str, str2));
            case '\f':
                return Double.valueOf(this.a.n(str, str2));
            case '\r':
                return Double.valueOf(this.a.o(str, str2));
            case 14:
                return Double.valueOf(this.a.p(str, str2));
            case 15:
                return Double.valueOf(this.a.q(str, str2));
            case 16:
                return Boolean.valueOf(this.a.r(str, str2));
            case 17:
                return this.a.s(str, str2);
            case 18:
                return this.a.t(str, str2);
            case 19:
                return Double.valueOf(this.a.u(str, str2));
            case 20:
                return Boolean.valueOf(this.a.v(str, str2));
            case 21:
                return Integer.valueOf(this.a.w(str, str2));
            case 22:
                return Boolean.valueOf(this.a.x(str, str2));
            case 23:
                return this.a.y(str, str2);
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"charge.add.electri", "charge.charging.error", "charge.charging.gun.state", "charge.charging.state", "charge.mileage.num", "charge.wltp.mileage.num", "charge.cltc.mileage.num", "charge.endurance.mileage.mode", "charge.electric.percent", "charge.cold.warn.tip", "charge.hvac.consume", "charge.battery.warm.state", "charge.ac.charging.current", "charge.ac.charging.volt", "charge.dc.charging.current", "charge.dc.charging.volt", "charge.ac.input.state", "charge.aver.veh.consume", "charge.charging.max.soc", "charge.soh", "charge.gun.lock.st", "charge.get.limit.soc", "charge.battery.cool.state", "charge.get.aver.consume.100km"};
    }
}
