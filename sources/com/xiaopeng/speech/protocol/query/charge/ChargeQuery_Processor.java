package com.xiaopeng.speech.protocol.query.charge;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class ChargeQuery_Processor implements IQueryProcessor {
    private ChargeQuery a;

    public ChargeQuery_Processor(ChargeQuery chargeQuery) {
        this.a = chargeQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1573444385:
                if (str.equals("charge.has.charging.order")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1304630877:
                if (str.equals("charge.support.endurance.mode")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1051995197:
                if (str.equals("charge.get.restart.status")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -909786873:
                if (str.equals("charge.get.trunk.power.status")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -649353844:
                if (str.equals("charge.support.open.port")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 133650785:
                if (str.equals("charge.limits.adjust.max")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 133651023:
                if (str.equals("charge.limits.adjust.min")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 146588932:
                if (str.equals("charge.has.sun.roof")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 208008097:
                if (str.equals("charge.support.smart.mode")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 317374728:
                if (str.equals("charge.has.car.refrigerator")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 420332312:
                if (str.equals("powercenter.charge.status")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 665776654:
                if (str.equals("charge.discharge.limit.max.value")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1164694924:
                if (str.equals("charge.get.stop.status")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1352058264:
                if (str.equals("gui.page.open.status.charge")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1438255228:
                if (str.equals("charge.discharge.limit.min.value")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1499862672:
                if (str.equals("charge.get.start.status")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1865070220:
                if (str.equals("charge.support.limits.adjust")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1890968681:
                if (str.equals("charge.trunk.power.status.open")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2074342788:
                if (str.equals("charge.is.ready.page")) {
                    c = '\t';
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
                return Boolean.valueOf(this.a.b(str, str2));
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Integer.valueOf(this.a.e(str, str2));
            case 4:
                return Boolean.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Boolean.valueOf(this.a.j(str, str2));
            case '\t':
                return Boolean.valueOf(this.a.k(str, str2));
            case '\n':
                return Integer.valueOf(this.a.l(str, str2));
            case 11:
                return Integer.valueOf(this.a.m(str, str2));
            case '\f':
                return Boolean.valueOf(this.a.n(str, str2));
            case '\r':
                return Boolean.valueOf(this.a.o(str, str2));
            case 14:
                return Integer.valueOf(this.a.p(str, str2));
            case 15:
                return Integer.valueOf(this.a.q(str, str2));
            case 16:
                return Integer.valueOf(this.a.r(str, str2));
            case 17:
                return Integer.valueOf(this.a.s(str, str2));
            case 18:
                return Boolean.valueOf(this.a.t(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"charge.support.open.port", "charge.get.start.status", "charge.get.stop.status", "charge.get.restart.status", "charge.support.limits.adjust", "charge.limits.adjust.min", "charge.limits.adjust.max", "charge.support.smart.mode", "charge.has.charging.order", "charge.is.ready.page", "powercenter.charge.status", "gui.page.open.status.charge", "charge.has.car.refrigerator", "charge.has.sun.roof", "charge.get.trunk.power.status", "charge.discharge.limit.min.value", "charge.discharge.limit.max.value", "charge.trunk.power.status.open", "charge.support.endurance.mode"};
    }
}
