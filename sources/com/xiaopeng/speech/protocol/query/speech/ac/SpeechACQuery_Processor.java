package com.xiaopeng.speech.protocol.query.speech.ac;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechACQuery_Processor implements IQueryProcessor {
    private SpeechACQuery a;

    public SpeechACQuery_Processor(SpeechACQuery speechACQuery) {
        this.a = speechACQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1445200882:
                if (str.equals("ac.quality.outside.lv")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1366962097:
                if (str.equals("ac.pm25.value")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1250437706:
                if (str.equals("ac.circulation.mode")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1220798579:
                if (str.equals("ac.quality.outside.state")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1002248266:
                if (str.equals("ac.auto.mode")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -611810135:
                if (str.equals("ac.seat.blow.lv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -6974638:
                if (str.equals("ac.front.defrost")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 204821931:
                if (str.equals("ac.seat.heat.lv")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 262066763:
                if (str.equals("ac.back.defrost.state")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 634597058:
                if (str.equals("ac.auto.mode.lv")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 641228857:
                if (str.equals("ac.power")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 846916078:
                if (str.equals("ac.psn.seat.heat.lv")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1036740945:
                if (str.equals("ac.driver.psn")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1221934520:
                if (str.equals("ac.inner.temp")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1268308502:
                if (str.equals("ac.quality.state")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1399563517:
                if (str.equals("ac.wind.mode")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1486533834:
                if (str.equals("ac.sync.state")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1626812139:
                if (str.equals("ac.wind.speed.lv")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1982026407:
                if (str.equals("ac.back.mirror.heat.state")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2074304014:
                if (str.equals("ac.driver.temp")) {
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
                return Double.valueOf(this.a.c(str, str2));
            case 2:
                return Double.valueOf(this.a.d(str, str2));
            case 3:
                return Boolean.valueOf(this.a.e(str, str2));
            case 4:
                return Boolean.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Boolean.valueOf(this.a.l(str, str2));
            case 11:
                return Integer.valueOf(this.a.m(str, str2));
            case '\f':
                return Integer.valueOf(this.a.n(str, str2));
            case '\r':
                return Integer.valueOf(this.a.o(str, str2));
            case 14:
                return Boolean.valueOf(this.a.p(str, str2));
            case 15:
                return Boolean.valueOf(this.a.q(str, str2));
            case 16:
                return Integer.valueOf(this.a.r(str, str2));
            case 17:
                return Integer.valueOf(this.a.s(str, str2));
            case 18:
                return Double.valueOf(this.a.t(str, str2));
            case 19:
                return Integer.valueOf(this.a.u(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"ac.power", "ac.driver.temp", "ac.driver.psn", "ac.sync.state", "ac.auto.mode", "ac.auto.mode.lv", "ac.circulation.mode", "ac.front.defrost", "ac.wind.mode", "ac.wind.speed.lv", "ac.quality.state", "ac.pm25.value", "ac.quality.outside.state", "ac.quality.outside.lv", "ac.back.defrost.state", "ac.back.mirror.heat.state", "ac.seat.heat.lv", "ac.seat.blow.lv", "ac.inner.temp", "ac.psn.seat.heat.lv"};
    }
}
