package com.xiaopeng.speech.protocol.query.carair;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class CarAirQuery_Processor implements IQueryProcessor {
    private CarAirQuery a;

    public CarAirQuery_Processor(CarAirQuery carAirQuery) {
        this.a = carAirQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2107526581:
                if (str.equals("ac.outside.air.status")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1859599012:
                if (str.equals("ac.outside.air.quality.level")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -1730121586:
                if (str.equals("ac.left.rear.seat.heat.lv")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1412576213:
                if (str.equals("ac.support.psn.seat.heat")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1303288855:
                if (str.equals("ac.support.decimal.value")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1296863527:
                if (str.equals("ac.wind.outlet.status")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1288077686:
                if (str.equals("card.ac.panel.status")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1281041456:
                if (str.equals("ac.support.seat.blow")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1280869874:
                if (str.equals("ac.support.seat.heat")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1142835157:
                if (str.equals("ac.support.temp.dual")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -882663067:
                if (str.equals("ac.air.quality.level")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538746711:
                if (str.equals("ac.intelligent.passenger.status")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -510636961:
                if (str.equals("ac.is.fast.fridge")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -508546549:
                if (str.equals("ac.support.pm25")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 173810349:
                if (str.equals("ac.is.support.perfume")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 389659321:
                if (str.equals("ac.dri.wind.direction.mode")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 433798074:
                if (str.equals("ac.support.rear.seat.heat")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 500789806:
                if (str.equals("ac.get.temp.max")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 500790044:
                if (str.equals("ac.get.temp.min")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 656839565:
                if (str.equals("ac.get.seat.blow.max")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 656839803:
                if (str.equals("ac.get.seat.blow.min")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 706847842:
                if (str.equals("ac.get.wind.max")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 706848080:
                if (str.equals("ac.get.wind.min")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 722046538:
                if (str.equals("ac.get.heat.max")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 722046776:
                if (str.equals("ac.get.heat.min")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 783003410:
                if (str.equals("ac.is.fresh.air")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 844632651:
                if (str.equals("ac.right.rear.seat.heat.lv")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1338650683:
                if (str.equals("ac.support.auto.off")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1386894569:
                if (str.equals("ac.mirror.rear.heat.status")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1399563517:
                if (str.equals("ac.wind.mode")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1460629481:
                if (str.equals("ac.psn.wind.direction.mode")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1639524806:
                if (str.equals("ac.outside.air.quality")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1649865015:
                if (str.equals("ac.support.purifier")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2119585779:
                if (str.equals("ac.support.demist.foot")) {
                    c = 1;
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
                return Boolean.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Integer.valueOf(this.a.e(str, str2));
            case 4:
                return Double.valueOf(this.a.f(str, str2));
            case 5:
                return Double.valueOf(this.a.g(str, str2));
            case 6:
                return Boolean.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Boolean.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Boolean.valueOf(this.a.l(str, str2));
            case 11:
                return Boolean.valueOf(this.a.m(str, str2));
            case '\f':
                return Integer.valueOf(this.a.n(str, str2));
            case '\r':
                return Integer.valueOf(this.a.o(str, str2));
            case 14:
                return Boolean.valueOf(this.a.p(str, str2));
            case 15:
                return Integer.valueOf(this.a.q(str, str2));
            case 16:
                return Integer.valueOf(this.a.r(str, str2));
            case 17:
                return Boolean.valueOf(this.a.s(str, str2));
            case 18:
                return Boolean.valueOf(this.a.t(str, str2));
            case 19:
                return Boolean.valueOf(this.a.u(str, str2));
            case 20:
                return this.a.v(str, str2);
            case 21:
                return Integer.valueOf(this.a.w(str, str2));
            case 22:
                return Integer.valueOf(this.a.x(str, str2));
            case 23:
                return Integer.valueOf(this.a.y(str, str2));
            case 24:
                return Integer.valueOf(this.a.z(str, str2));
            case 25:
                return Integer.valueOf(this.a.A(str, str2));
            case 26:
                return Integer.valueOf(this.a.B(str, str2));
            case 27:
                return Integer.valueOf(this.a.C(str, str2));
            case 28:
                return Integer.valueOf(this.a.D(str, str2));
            case 29:
                return Integer.valueOf(this.a.E(str, str2));
            case 30:
                return Boolean.valueOf(this.a.F(str, str2));
            case 31:
                return Integer.valueOf(this.a.G(str, str2));
            case ' ':
                return Integer.valueOf(this.a.H(str, str2));
            case '!':
                return Boolean.valueOf(this.a.I(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"ac.support.auto.off", "ac.support.demist.foot", "ac.get.wind.max", "ac.get.wind.min", "ac.get.temp.max", "ac.get.temp.min", "ac.support.decimal.value", "ac.support.purifier", "ac.support.pm25", "ac.air.quality.level", "ac.support.seat.heat", "ac.support.psn.seat.heat", "ac.get.heat.max", "ac.get.heat.min", "ac.support.seat.blow", "ac.get.seat.blow.max", "ac.get.seat.blow.min", "ac.is.fast.fridge", "ac.is.fresh.air", "ac.support.temp.dual", "ac.wind.outlet.status", "ac.outside.air.status", "ac.wind.mode", "ac.mirror.rear.heat.status", "ac.outside.air.quality", "ac.dri.wind.direction.mode", "ac.psn.wind.direction.mode", "card.ac.panel.status", "ac.outside.air.quality.level", "ac.intelligent.passenger.status", "ac.support.rear.seat.heat", "ac.left.rear.seat.heat.lv", "ac.right.rear.seat.heat.lv", "ac.is.support.perfume"};
    }
}
