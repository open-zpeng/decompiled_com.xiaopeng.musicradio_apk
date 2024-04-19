package com.xiaopeng.speech.protocol.query.speech.carcontrol;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechCarControlQuery_Processor implements IQueryProcessor {
    private SpeechCarControlQuery a;

    public SpeechCarControlQuery_Processor(SpeechCarControlQuery speechCarControlQuery) {
        this.a = speechCarControlQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2060488725:
                if (str.equals("carcontrol.front.collision.state")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -1974077749:
                if (str.equals("carcontrol.lightmehome.state")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1952147251:
                if (str.equals("carcontrol.seat.position")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1941037730:
                if (str.equals("carcontrol.belt.electric.state")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1878001850:
                if (str.equals("carcontrol.lamp.far")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1741151858:
                if (str.equals("carcontrol.lamp.headgroup")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1664162452:
                if (str.equals("carcontrol.warn.blind.area.state")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -1599309710:
                if (str.equals("carcontrol.trunk.state")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1375618344:
                if (str.equals("carcontrol.warn.lane.departure.state")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -1368961668:
                if (str.equals("carcontrol.wiper.level")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -1288966170:
                if (str.equals("carcontrol.tire.pressure")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -1209587430:
                if (str.equals("carcontrol.icm.volume.warn")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -1073244956:
                if (str.equals("carcontrol.seat.error")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1021329318:
                if (str.equals("control.cruise.status")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -1008347830:
                if (str.equals("carcontrol.lcc.state")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -870356283:
                if (str.equals("carcontrol.lamp.inner")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -786298349:
                if (str.equals("carcontrol.lock.state")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -722435495:
                if (str.equals("carcontrol.meter.limit.intel")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -555222776:
                if (str.equals("carcontrol.speed.car")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -501644054:
                if (str.equals("carcontrol.belt.rearseat.state")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -372830826:
                if (str.equals("carcontrol.window.lock_state")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -346554662:
                if (str.equals("carcontrol.door.sate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -258533676:
                if (str.equals("carcontrol.meter.last.start")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -139083951:
                if (str.equals("carcontrol.lock.drive.auto")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -126307048:
                if (str.equals("carcontrol.window.sate")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -122050850:
                if (str.equals("carcontrol.is.car.trip")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -86335604:
                if (str.equals("carcontrol.drive.mode")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -65424329:
                if (str.equals("carcontrol.atws.state")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -20170038:
                if (str.equals("carcontrol.recycle.lv")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 106241666:
                if (str.equals("carcontrol.meter.last.charge")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 224275343:
                if (str.equals("carcontrol.warn.radar.slow.state")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 234544457:
                if (str.equals("carcontrol.lamp.rearfog")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 404150481:
                if (str.equals("carcontrol.icm.state")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 465177042:
                if (str.equals("carcontrol.speed.limit.state")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 467392178:
                if (str.equals("carcontrol.speed.limit.value")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 473786283:
                if (str.equals("carcontrol.brake.emergency.warn")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 646093110:
                if (str.equals("carcontrol.seat.welcome.mode.state")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 714771718:
                if (str.equals("carcontrol.ig.state")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 717411520:
                if (str.equals("carcontrol.shift.state")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 768526207:
                if (str.equals("carcontrol.seat.main.human.state")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 778341606:
                if (str.equals("carcontrol.rotation.steer")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 793162096:
                if (str.equals("carcontrol.icm.wind.lv")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 918463002:
                if (str.equals("carcontrol.icm.driver.temp")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1238236251:
                if (str.equals("carcontrol.seat.direction")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1294982829:
                if (str.equals("carcontrol.lock.unlock.response")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1319619428:
                if (str.equals("carcontrol.oled.state")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1355038943:
                if (str.equals("carcontrol.warn.side.rever.state")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 1375556580:
                if (str.equals("control.charge.power.status")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case 1436055782:
                if (str.equals("carcontrol.lamp.location")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1501829463:
                if (str.equals("carcontrol.meter.a")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1501829464:
                if (str.equals("carcontrol.meter.b")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1574537530:
                if (str.equals("carcontrol.meter.total")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1693782079:
                if (str.equals("carcontrol.acc.state")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 1902828131:
                if (str.equals("carcontrol.lock.parking.auto")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1911726553:
                if (str.equals("carcontrol.lamp.near")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1955438847:
                if (str.equals("carcontrol.mode.welcome.state")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2019589129:
                if (str.equals("carcontrol.icm.wind.mode")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 2043201887:
                if (str.equals("carcontrol.tire.pressure.warnings")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 2063463053:
                if (str.equals("carcontrol.lane.change.assist.state")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 2133982950:
                if (str.equals("carcontrol.steer.eps")) {
                    c = 25;
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
                return Boolean.valueOf(this.a.d(str, str2));
            case 3:
                return Boolean.valueOf(this.a.e(str, str2));
            case 4:
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return Boolean.valueOf(this.a.g(str, str2));
            case 6:
                return Boolean.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Boolean.valueOf(this.a.l(str, str2));
            case 11:
                return Boolean.valueOf(this.a.m(str, str2));
            case '\f':
                return Boolean.valueOf(this.a.n(str, str2));
            case '\r':
                return Integer.valueOf(this.a.o(str, str2));
            case 14:
                return Boolean.valueOf(this.a.p(str, str2));
            case 15:
                return Boolean.valueOf(this.a.q(str, str2));
            case 16:
                return Boolean.valueOf(this.a.r(str, str2));
            case 17:
                return Integer.valueOf(this.a.s(str, str2));
            case 18:
                return this.a.t(str, str2);
            case 19:
                return this.a.u(str, str2);
            case 20:
                return this.a.v(str, str2);
            case 21:
                return Boolean.valueOf(this.a.w(str, str2));
            case 22:
                return this.a.x(str, str2);
            case 23:
                return Boolean.valueOf(this.a.y(str, str2));
            case 24:
                return Integer.valueOf(this.a.z(str, str2));
            case 25:
                return Integer.valueOf(this.a.A(str, str2));
            case 26:
                return Integer.valueOf(this.a.B(str, str2));
            case 27:
                return Boolean.valueOf(this.a.C(str, str2));
            case 28:
                return Integer.valueOf(this.a.D(str, str2));
            case 29:
                return Double.valueOf(this.a.E(str, str2));
            case 30:
                return Double.valueOf(this.a.F(str, str2));
            case 31:
                return Double.valueOf(this.a.G(str, str2));
            case ' ':
                return Double.valueOf(this.a.H(str, str2));
            case '!':
                return Double.valueOf(this.a.I(str, str2));
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
                return Boolean.valueOf(this.a.P(str, str2));
            case ')':
                return Integer.valueOf(this.a.Q(str, str2));
            case '*':
                return Integer.valueOf(this.a.R(str, str2));
            case '+':
                return Integer.valueOf(this.a.S(str, str2));
            case ',':
                return Double.valueOf(this.a.T(str, str2));
            case '-':
                return Double.valueOf(this.a.U(str, str2));
            case '.':
                return Boolean.valueOf(this.a.V(str, str2));
            case '/':
                return Integer.valueOf(this.a.W(str, str2));
            case '0':
                return Integer.valueOf(this.a.X(str, str2));
            case '1':
                return Double.valueOf(this.a.Y(str, str2));
            case '2':
                return Integer.valueOf(this.a.Z(str, str2));
            case '3':
                return Boolean.valueOf(this.a.aa(str, str2));
            case '4':
                return Integer.valueOf(this.a.ab(str, str2));
            case '5':
                return this.a.ac(str, str2);
            case '6':
                return this.a.ad(str, str2);
            case '7':
                return Integer.valueOf(this.a.ae(str, str2));
            case '8':
                return Integer.valueOf(this.a.af(str, str2));
            case '9':
                return Integer.valueOf(this.a.ag(str, str2));
            case ':':
                return Integer.valueOf(this.a.ah(str, str2));
            case ';':
                return Integer.valueOf(this.a.ai(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"carcontrol.lamp.rearfog", "carcontrol.lamp.near", "carcontrol.lamp.location", "carcontrol.lamp.far", "carcontrol.lamp.headgroup", "carcontrol.lamp.inner", "carcontrol.brake.emergency.warn", "carcontrol.atws.state", "carcontrol.oled.state", "carcontrol.lightmehome.state", "carcontrol.lock.drive.auto", "carcontrol.lock.parking.auto", "carcontrol.lock.state", "carcontrol.trunk.state", "carcontrol.mode.welcome.state", "carcontrol.belt.electric.state", "carcontrol.belt.rearseat.state", "carcontrol.lock.unlock.response", "carcontrol.door.sate", "carcontrol.window.sate", "carcontrol.seat.direction", "carcontrol.seat.error", "carcontrol.seat.position", "carcontrol.seat.welcome.mode.state", "carcontrol.drive.mode", "carcontrol.steer.eps", "carcontrol.icm.volume.warn", "carcontrol.speed.limit.state", "carcontrol.speed.limit.value", "carcontrol.meter.a", "carcontrol.meter.b", "carcontrol.meter.total", "carcontrol.meter.last.charge", "carcontrol.meter.last.start", "carcontrol.front.collision.state", "carcontrol.meter.limit.intel", "carcontrol.lane.change.assist.state", "carcontrol.warn.side.rever.state", "carcontrol.warn.lane.departure.state", "carcontrol.warn.blind.area.state", "carcontrol.warn.radar.slow.state", "carcontrol.recycle.lv", "carcontrol.shift.state", "carcontrol.seat.main.human.state", "carcontrol.rotation.steer", "carcontrol.speed.car", "carcontrol.icm.state", "carcontrol.ig.state", "carcontrol.icm.wind.mode", "carcontrol.icm.driver.temp", "carcontrol.icm.wind.lv", "carcontrol.is.car.trip", "carcontrol.wiper.level", "carcontrol.tire.pressure", "carcontrol.tire.pressure.warnings", "carcontrol.acc.state", "carcontrol.lcc.state", "carcontrol.window.lock_state", "control.charge.power.status", "control.cruise.status"};
    }
}
