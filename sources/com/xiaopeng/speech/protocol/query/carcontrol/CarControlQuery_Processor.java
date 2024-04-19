package com.xiaopeng.speech.protocol.query.carcontrol;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class CarControlQuery_Processor implements IQueryProcessor {
    private CarControlQuery a;

    public CarControlQuery_Processor(CarControlQuery carControlQuery) {
        this.a = carControlQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2121187452:
                if (str.equals("control.comfortable.driving.mode.support")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -2054773087:
                if (str.equals("gui.page.open.carcontrol")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -2034277098:
                if (str.equals("control.scissor.door.left.running.support")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1897516928:
                if (str.equals("control.light.atmosphere.color.status")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1678437728:
                if (str.equals("control.leg.height.get")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -1656659569:
                if (str.equals("carcontrol.extra.trunk.status")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1550136303:
                if (str.equals("control.scissor.door.right.running.support")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -1521777381:
                if (str.equals("control.wiper.current.level")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1482534751:
                if (str.equals("carcontrol.get.support.seat")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1431154399:
                if (str.equals("carcontrol.support.energy.recycle.reason")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1414817355:
                if (str.equals("control.capsule.mode")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -1412321594:
                if (str.equals("carcontrol.set.speech.wakeup.status")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1392585057:
                if (str.equals("charge.direct.port.on.status")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1268774449:
                if (str.equals("control.scissor.door.left.close.support")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -1193245651:
                if (str.equals("carcontrol.get.open.trunk")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1144792468:
                if (str.equals("control.light.atmosphere.brightness.status")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1139999239:
                if (str.equals("carcontrol.support.close.mirror")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1102263664:
                if (str.equals("control.trunk.unlock.support")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -952459949:
                if (str.equals("charge.direct.port.off.status")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -945429027:
                if (str.equals("control.vip.chair.status")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case -932480699:
                if (str.equals("charge.alternating.port.on.status")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -894608748:
                if (str.equals("control.xpedal.support")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -598119942:
                if (str.equals("xpu.ngp.status")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -178106686:
                if (str.equals("charge.direct.port.on.support")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 6319454:
                if (str.equals("control.get.windows.state.support")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 264514798:
                if (str.equals("carcontrol.support.driving.mode")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 325191539:
                if (str.equals("carcontrol.get.window.status")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 355863260:
                if (str.equals("carcontrol.mirror.status")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 359526324:
                if (str.equals("charge.alternating.port.off.support")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 425873261:
                if (str.equals("charge.alternating.port.off.status")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 484711863:
                if (str.equals("control.mirror.rear.set.support")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 548112633:
                if (str.equals("control.control.steering.mode.adjustable")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 580869774:
                if (str.equals("charge.direct.port.off.support")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 631100506:
                if (str.equals("control.scissor.door.right.open.support")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 676171332:
                if (str.equals("control.low.speed.analog.sound.support")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 689991955:
                if (str.equals("control.electric.curtain.support")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 700759210:
                if (str.equals("control.support.light.atmosphere")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 956386737:
                if (str.equals("carcontrol.support.energy.recycle")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1200226524:
                if (str.equals("charge.alternating.port.on.support")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1333952193:
                if (str.equals("carcontrol.get.close.trunk")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1338946660:
                if (str.equals("carcontrol.get.psn.support.seat")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1364128650:
                if (str.equals("control.scissor.door.right.close.support")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1397046919:
                if (str.equals("control.is.tairpressure.normal")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1654546805:
                if (str.equals("control.scissor.door.left.open.support")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1697319758:
                if (str.equals("control.lamp.signal.support")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1961007153:
                if (str.equals("carcontrol.trunk.status")) {
                    c = 28;
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
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return Boolean.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Boolean.valueOf(this.a.j(str, str2));
            case '\t':
                return Boolean.valueOf(this.a.k(str, str2));
            case '\n':
                return Boolean.valueOf(this.a.l(str, str2));
            case 11:
                return Boolean.valueOf(this.a.m(str, str2));
            case '\f':
                return Boolean.valueOf(this.a.n(str, str2));
            case '\r':
                return Boolean.valueOf(this.a.o(str, str2));
            case 14:
                return Boolean.valueOf(this.a.p(str, str2));
            case 15:
                return Boolean.valueOf(this.a.q(str, str2));
            case 16:
                return Integer.valueOf(this.a.r(str, str2));
            case 17:
                return Integer.valueOf(this.a.s(str, str2));
            case 18:
                return Integer.valueOf(this.a.t(str, str2));
            case 19:
                return Integer.valueOf(this.a.u(str, str2));
            case 20:
                return Integer.valueOf(this.a.v(str, str2));
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
                return Integer.valueOf(this.a.F(str, str2));
            case 31:
                return Integer.valueOf(this.a.G(str, str2));
            case ' ':
                return Integer.valueOf(this.a.H(str, str2));
            case '!':
                return Integer.valueOf(this.a.I(str, str2));
            case '\"':
                return Integer.valueOf(this.a.J(str, str2));
            case '#':
                return Integer.valueOf(this.a.K(str, str2));
            case '$':
                return Integer.valueOf(this.a.L(str, str2));
            case '%':
                return Integer.valueOf(this.a.M(str, str2));
            case '&':
                return Integer.valueOf(this.a.N(str, str2));
            case '\'':
                return Integer.valueOf(this.a.O(str, str2));
            case '(':
                return this.a.P(str, str2);
            case ')':
                return Integer.valueOf(this.a.Q(str, str2));
            case '*':
                return Integer.valueOf(this.a.R(str, str2));
            case '+':
                return Integer.valueOf(this.a.S(str, str2));
            case ',':
                return Integer.valueOf(this.a.T(str, str2));
            case '-':
                return Integer.valueOf(this.a.U(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"carcontrol.support.close.mirror", "carcontrol.mirror.status", "carcontrol.get.open.trunk", "carcontrol.get.close.trunk", "carcontrol.get.window.status", "carcontrol.support.energy.recycle", "carcontrol.get.support.seat", "carcontrol.support.driving.mode", "control.support.light.atmosphere", "control.is.tairpressure.normal", "control.trunk.unlock.support", "charge.alternating.port.on.support", "charge.direct.port.off.support", "charge.alternating.port.off.support", "charge.direct.port.on.support", "control.mirror.rear.set.support", "control.leg.height.get", "charge.alternating.port.off.status", "charge.direct.port.off.status", "charge.alternating.port.on.status", "charge.direct.port.on.status", "control.light.atmosphere.brightness.status", "control.light.atmosphere.color.status", "control.control.steering.mode.adjustable", "gui.page.open.carcontrol", "control.wiper.current.level", "carcontrol.get.psn.support.seat", "carcontrol.extra.trunk.status", "carcontrol.trunk.status", "carcontrol.set.speech.wakeup.status", "control.low.speed.analog.sound.support", "control.xpedal.support", "carcontrol.support.energy.recycle.reason", "control.scissor.door.left.open.support", "control.scissor.door.right.open.support", "control.scissor.door.left.close.support", "control.scissor.door.right.close.support", "control.scissor.door.left.running.support", "control.scissor.door.right.running.support", "control.electric.curtain.support", "control.get.windows.state.support", "control.comfortable.driving.mode.support", "control.lamp.signal.support", "xpu.ngp.status", "control.vip.chair.status", "control.capsule.mode"};
    }
}
