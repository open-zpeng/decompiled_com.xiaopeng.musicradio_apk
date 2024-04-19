package com.xiaopeng.speech.protocol.node.carcontrol;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class CarcontrolNode_Processor implements ICommandProcessor {
    private CarcontrolNode a;

    public CarcontrolNode_Processor(CarcontrolNode carcontrolNode) {
        this.a = carcontrolNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2120833774:
                if (str.equals("command://control.psn.seat.move.up")) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case -2066594564:
                if (str.equals("command://control.window.passenger.open")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -2003475528:
                if (str.equals("command://control.seat.adjust")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case -1932172590:
                if (str.equals("command://charge.direct.port.on")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -1917375779:
                if (str.equals("command://control.mirror.rear.close")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1881291550:
                if (str.equals("command://control.light.position.off")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1839847196:
                if (str.equals("command://control.leg.highest")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1768222068:
                if (str.equals("command://control.wiper.speed.down")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -1721073980:
                if (str.equals("command://control.scissor.left.door.off")) {
                    c = 'b';
                    break;
                }
                c = 65535;
                break;
            case -1711827085:
                if (str.equals("command://control.light.atmosphere.on")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -1698181319:
                if (str.equals("command://control.low.volume.on")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case -1675857019:
                if (str.equals("command://control.query.tire.pressure")) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -1671052557:
                if (str.equals("command://control.energy.recycle.low")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1653284995:
                if (str.equals("command://control.light.language.on")) {
                    c = 'j';
                    break;
                }
                c = 65535;
                break;
            case -1606824866:
                if (str.equals("command://control.capsule.universal.set")) {
                    c = 'l';
                    break;
                }
                c = 65535;
                break;
            case -1606320269:
                if (str.equals("command://control.seat.move.foremost")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1527032229:
                if (str.equals("command://control.light.atmosphere.off")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -1515588522:
                if (str.equals("command://control.seat.resume")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -1513394514:
                if (str.equals("command://control.psn.seat.move.forward")) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case -1494382542:
                if (str.equals("command://control.seat.backrest.move.forward")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case -1463564858:
                if (str.equals("command://control.light.auto.on")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1458343142:
                if (str.equals("command://control.mirror.rear.on")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1430827874:
                if (str.equals("command://control.rear.mist.light.on")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1407167676:
                if (str.equals("command://control.light.atmosphere.brightness.up")) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case -1405991280:
                if (str.equals("command://control.rear.mist.light.off")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1375267742:
                if (str.equals("command://control.leg.down")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case -1281862925:
                if (str.equals("command://control.scissor.right.door.off")) {
                    c = 'c';
                    break;
                }
                c = 65535;
                break;
            case -1178928744:
                if (str.equals("command://control.wiper.medium")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case -1104013483:
                if (str.equals("command://control.low.volume.off")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -1026240870:
                if (str.equals("command://control.seat.backrest.move.back")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -1025760425:
                if (str.equals("command://control.seat.backrest.move.rear")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case -968493410:
                if (str.equals("command://control.window.right.rear.close")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -872634405:
                if (str.equals("command://control.scissor.right.door.on")) {
                    c = 'a';
                    break;
                }
                c = 65535;
                break;
            case -792915409:
                if (str.equals("command://control.window.left.close")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case -678703178:
                if (str.equals("command://control.window.rear.open")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -672533029:
                if (str.equals("command://control.light.atmosphere.brightness.max")) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -672532791:
                if (str.equals("command://control.light.atmosphere.brightness.min")) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case -672527143:
                if (str.equals("command://control.light.atmosphere.brightness.set")) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case -614876148:
                if (str.equals("command://control.light.position.on")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -509776894:
                if (str.equals("command://control.modes.driving.conservation")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -466933999:
                if (str.equals("command://control.seat.move.forward")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -461837539:
                if (str.equals("command://control.light.low.off")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -390627019:
                if (str.equals("command://control.psn.seat.backrest.move.forward")) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case -388893173:
                if (str.equals("command://control.scissor.left.door.pause")) {
                    c = 'd';
                    break;
                }
                c = 65535;
                break;
            case -310219003:
                if (str.equals("command://control.wiper.speed.up")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case -308548080:
                if (str.equals("command://control.window.driver.close")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -304980732:
                if (str.equals("command://charge.alternating.port.off")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -284285602:
                if (str.equals("command://control.trunk.close")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -263259933:
                if (str.equals("command://control.energy.recycle.down")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -263147037:
                if (str.equals("command://control.energy.recycle.high")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -67611537:
                if (str.equals("command://control.modes.driving.sport")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -50794088:
                if (str.equals("command://control.light.home.off")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 128955186:
                if (str.equals("command://control.window.driver.open")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 169414246:
                if (str.equals("command://control.modes.steering.normal")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 232191708:
                if (str.equals("command://charge.direct.port.off")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case 244379227:
                if (str.equals("command://control.leg.up")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case 261368709:
                if (str.equals("command://control.seat.restore")) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 275456150:
                if (str.equals("command://control.light.home.on")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 284513946:
                if (str.equals("command://control.wiper.superhigh")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 287772561:
                if (str.equals("command://control.light.language.off")) {
                    c = 'k';
                    break;
                }
                c = 65535;
                break;
            case 294159518:
                if (str.equals("command://control.trunk.unlock")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 342341845:
                if (str.equals("command://control.window.front.close")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 348886406:
                if (str.equals("command://control.window.passenger.close")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 404106359:
                if (str.equals("command://control.psn.seat.backrest.move.back")) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 407370447:
                if (str.equals("command://control.seat.move.up")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 423846412:
                if (str.equals("command://control.window.rear.close")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 439725323:
                if (str.equals("command://control.window.left.rear.open")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 561507053:
                if (str.equals("command://control.windows.close")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 572663477:
                if (str.equals("command://control.windows.open")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 579058598:
                if (str.equals("command://control.comfortable.driving.mode.open")) {
                    c = 'h';
                    break;
                }
                c = 65535;
                break;
            case 626057995:
                if (str.equals("command://control.light.atmosphere.brightness.down")) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case 640398363:
                if (str.equals("command://control.seat.move.back")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 640472022:
                if (str.equals("command://control.seat.move.down")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 640878808:
                if (str.equals("command://control.seat.move.rear")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 658134902:
                if (str.equals("command://control.energy.recycle.medium")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 731254135:
                if (str.equals("command://control.electric.curtain.open")) {
                    c = 'f';
                    break;
                }
                c = 65535;
                break;
            case 735391575:
                if (str.equals("command://control.window.left.rear.close")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 759755804:
                if (str.equals("command://control.comfortable.driving.mode.close")) {
                    c = 'i';
                    break;
                }
                c = 65535;
                break;
            case 775765482:
                if (str.equals("command://control.scissor.left.door.on")) {
                    c = '`';
                    break;
                }
                c = 65535;
                break;
            case 786135674:
                if (str.equals("command://control.scissor.right.door.pause")) {
                    c = 'e';
                    break;
                }
                c = 65535;
                break;
            case 829912197:
                if (str.equals("command://control.wiper.high")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 830243044:
                if (str.equals("command://control.wiper.slow")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case 902513266:
                if (str.equals("command://control.seat.backrest.move.foremost")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1026004922:
                if (str.equals("command://control.window.right.open")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case 1054474012:
                if (str.equals("command://control.energy.recycle.up")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1125696752:
                if (str.equals("command://control.seat.move.highest")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1182850155:
                if (str.equals("command://control.electric.curtain.close")) {
                    c = 'g';
                    break;
                }
                c = 65535;
                break;
            case 1216045284:
                if (str.equals("command://control.window.right.rear.open")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1390038351:
                if (str.equals("command://control.light.atmosphere.color")) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case 1439290046:
                if (str.equals("command://control.windows.ventilate.on")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1446655346:
                if (str.equals("command://control.leg.lowest")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 1509122673:
                if (str.equals("command://control.light.low.on")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1514182570:
                if (str.equals("command://charge.alternating.port.on")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case 1542318054:
                if (str.equals("command://control.seat.move.lowest")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1653758500:
                if (str.equals("command://control.trunk.open")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1668318320:
                if (str.equals("command://control.windows.ventilate.off")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1671611365:
                if (str.equals("command://control.light.resume")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 1730189960:
                if (str.equals("command://control.window.right.close")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 1775898419:
                if (str.equals("command://control.window.left.open")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case 1851379043:
                if (str.equals("command://control.xpedal.off")) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case 1860837227:
                if (str.equals("command://control.xpedal.on")) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case 1874129512:
                if (str.equals("command://control.light.auto.off")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1949772309:
                if (str.equals("command://control.modes.steering.sport")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1987631518:
                if (str.equals("command://control.psn.seat.move.back")) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case 1987705177:
                if (str.equals("command://control.psn.seat.move.down")) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case 2002557289:
                if (str.equals("command://control.modes.steering.soft")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 2036006535:
                if (str.equals("command://control.mirror.rear.set")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 2055024460:
                if (str.equals("command://control.modes.driving.normal")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2089614285:
                if (str.equals("command://control.window.front.open")) {
                    c = '%';
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
                this.a.b(str, str2);
                return;
            case 1:
                this.a.c(str, str2);
                return;
            case 2:
                this.a.d(str, str2);
                return;
            case 3:
                this.a.e(str, str2);
                return;
            case 4:
                this.a.f(str, str2);
                return;
            case 5:
                this.a.g(str, str2);
                return;
            case 6:
                this.a.h(str, str2);
                return;
            case 7:
                this.a.i(str, str2);
                return;
            case '\b':
                this.a.j(str, str2);
                return;
            case '\t':
                this.a.k(str, str2);
                return;
            case '\n':
                this.a.l(str, str2);
                return;
            case 11:
                this.a.m(str, str2);
                return;
            case '\f':
                this.a.n(str, str2);
                return;
            case '\r':
                this.a.o(str, str2);
                return;
            case 14:
                this.a.p(str, str2);
                return;
            case 15:
                this.a.q(str, str2);
                return;
            case 16:
                this.a.r(str, str2);
                return;
            case 17:
                this.a.s(str, str2);
                return;
            case 18:
                this.a.t(str, str2);
                return;
            case 19:
                this.a.u(str, str2);
                return;
            case 20:
                this.a.v(str, str2);
                return;
            case 21:
                this.a.w(str, str2);
                return;
            case 22:
                this.a.x(str, str2);
                return;
            case 23:
                this.a.y(str, str2);
                return;
            case 24:
                this.a.z(str, str2);
                return;
            case 25:
                this.a.A(str, str2);
                return;
            case 26:
                this.a.B(str, str2);
                return;
            case 27:
                this.a.C(str, str2);
                return;
            case 28:
                this.a.D(str, str2);
                return;
            case 29:
                this.a.E(str, str2);
                return;
            case 30:
                this.a.F(str, str2);
                return;
            case 31:
                this.a.G(str, str2);
                return;
            case ' ':
                this.a.H(str, str2);
                return;
            case '!':
                this.a.I(str, str2);
                return;
            case '\"':
                this.a.J(str, str2);
                return;
            case '#':
                this.a.K(str, str2);
                return;
            case '$':
                this.a.L(str, str2);
                return;
            case '%':
                this.a.M(str, str2);
                return;
            case '&':
                this.a.N(str, str2);
                return;
            case '\'':
                this.a.O(str, str2);
                return;
            case '(':
                this.a.P(str, str2);
                return;
            case ')':
                this.a.Q(str, str2);
                return;
            case '*':
                this.a.R(str, str2);
                return;
            case '+':
                this.a.S(str, str2);
                return;
            case ',':
                this.a.T(str, str2);
                return;
            case '-':
                this.a.U(str, str2);
                return;
            case '.':
                this.a.V(str, str2);
                return;
            case '/':
                this.a.W(str, str2);
                return;
            case '0':
                this.a.X(str, str2);
                return;
            case '1':
                this.a.Y(str, str2);
                return;
            case '2':
                this.a.Z(str, str2);
                return;
            case '3':
                this.a.aa(str, str2);
                return;
            case '4':
                this.a.ab(str, str2);
                return;
            case '5':
                this.a.ac(str, str2);
                return;
            case '6':
                this.a.ad(str, str2);
                return;
            case '7':
                this.a.ae(str, str2);
                return;
            case '8':
                this.a.af(str, str2);
                return;
            case '9':
                this.a.ag(str, str2);
                return;
            case ':':
                this.a.ah(str, str2);
                return;
            case ';':
                this.a.ai(str, str2);
                return;
            case '<':
                this.a.aj(str, str2);
                return;
            case '=':
                this.a.ak(str, str2);
                return;
            case '>':
                this.a.al(str, str2);
                return;
            case '?':
                this.a.am(str, str2);
                return;
            case '@':
                this.a.an(str, str2);
                return;
            case 'A':
                this.a.ao(str, str2);
                return;
            case 'B':
                this.a.ap(str, str2);
                return;
            case 'C':
                this.a.aq(str, str2);
                return;
            case 'D':
                this.a.ar(str, str2);
                return;
            case 'E':
                this.a.as(str, str2);
                return;
            case 'F':
                this.a.at(str, str2);
                return;
            case 'G':
                this.a.au(str, str2);
                return;
            case 'H':
                this.a.av(str, str2);
                return;
            case 'I':
                this.a.aw(str, str2);
                return;
            case 'J':
                this.a.ax(str, str2);
                return;
            case 'K':
                this.a.ay(str, str2);
                return;
            case 'L':
                this.a.az(str, str2);
                return;
            case 'M':
                this.a.aA(str, str2);
                return;
            case 'N':
                this.a.aB(str, str2);
                return;
            case 'O':
                this.a.aC(str, str2);
                return;
            case 'P':
                this.a.aD(str, str2);
                return;
            case 'Q':
                this.a.aE(str, str2);
                return;
            case 'R':
                this.a.aF(str, str2);
                return;
            case 'S':
                this.a.aG(str, str2);
                return;
            case 'T':
                this.a.e();
                return;
            case 'U':
                this.a.f();
                return;
            case 'V':
                this.a.g();
                return;
            case 'W':
                this.a.h();
                return;
            case 'X':
                this.a.i();
                return;
            case 'Y':
                this.a.j();
                return;
            case 'Z':
                this.a.k();
                return;
            case '[':
                this.a.l();
                return;
            case '\\':
                this.a.m();
                return;
            case ']':
                this.a.n();
                return;
            case '^':
                this.a.o();
                return;
            case '_':
                this.a.p();
                return;
            case '`':
                this.a.q();
                return;
            case 'a':
                this.a.r();
                return;
            case 'b':
                this.a.s();
                return;
            case 'c':
                this.a.t();
                return;
            case 'd':
                this.a.u();
                return;
            case 'e':
                this.a.v();
                return;
            case 'f':
                this.a.aH(str, str2);
                return;
            case 'g':
                this.a.aI(str, str2);
                return;
            case 'h':
                this.a.aJ(str, str2);
                return;
            case 'i':
                this.a.aK(str, str2);
                return;
            case 'j':
                this.a.aL(str, str2);
                return;
            case 'k':
                this.a.aM(str, str2);
                return;
            case 'l':
                this.a.aN(str, str2);
                return;
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://control.light.home.off", "command://control.light.home.on", "command://control.light.low.off", "command://control.light.low.on", "command://control.light.position.on", "command://control.light.position.off", "command://control.light.auto.on", "command://control.light.auto.off", "command://control.rear.mist.light.off", "command://control.rear.mist.light.on", "command://control.mirror.rear.close", "command://control.mirror.rear.on", "command://control.trunk.open", "command://control.window.driver.close", "command://control.window.driver.open", "command://control.window.passenger.close", "command://control.window.passenger.open", "command://control.windows.close", "command://control.windows.open", "command://control.trunk.close", "command://control.windows.ventilate.on", "command://control.windows.ventilate.off", "command://control.modes.driving.sport", "command://control.modes.driving.conservation", "command://control.modes.driving.normal", "command://control.modes.steering.soft", "command://control.modes.steering.normal", "command://control.modes.steering.sport", "command://control.energy.recycle.high", "command://control.energy.recycle.low", "command://control.energy.recycle.medium", "command://control.energy.recycle.up", "command://control.energy.recycle.down", "command://control.window.right.rear.open", "command://control.window.right.rear.close", "command://control.window.left.rear.open", "command://control.window.left.rear.close", "command://control.window.front.open", "command://control.window.front.close", "command://control.window.rear.open", "command://control.window.rear.close", "command://control.seat.move.up", "command://control.seat.move.down", "command://control.seat.move.highest", "command://control.seat.move.lowest", "command://control.seat.move.back", "command://control.seat.move.forward", "command://control.seat.move.rear", "command://control.seat.move.foremost", "command://control.seat.backrest.move.back", "command://control.seat.backrest.move.forward", "command://control.seat.backrest.move.rear", "command://control.seat.backrest.move.foremost", "command://control.seat.adjust", "command://control.light.resume", "command://control.seat.resume", "command://control.low.volume.on", "command://control.low.volume.off", "command://control.light.atmosphere.on", "command://control.light.atmosphere.off", "command://control.mirror.rear.set", "command://control.wiper.speed.up", "command://control.wiper.speed.down", "command://control.wiper.slow", "command://control.wiper.high", "command://control.wiper.medium", "command://control.wiper.superhigh", "command://control.trunk.unlock", "command://control.window.left.close", "command://control.window.left.open", "command://control.window.right.close", "command://control.window.right.open", "command://control.leg.up", "command://control.leg.down", "command://control.leg.highest", "command://control.leg.lowest", "command://control.seat.restore", "command://charge.direct.port.on", "command://charge.direct.port.off", "command://charge.alternating.port.off", "command://charge.alternating.port.on", "command://control.query.tire.pressure", "command://control.light.atmosphere.color", "command://control.light.atmosphere.brightness.set", "command://control.light.atmosphere.brightness.up", "command://control.light.atmosphere.brightness.down", "command://control.light.atmosphere.brightness.max", "command://control.light.atmosphere.brightness.min", "command://control.psn.seat.move.up", "command://control.psn.seat.move.down", "command://control.psn.seat.backrest.move.back", "command://control.psn.seat.backrest.move.forward", "command://control.psn.seat.move.back", "command://control.psn.seat.move.forward", "command://control.xpedal.on", "command://control.xpedal.off", "command://control.scissor.left.door.on", "command://control.scissor.right.door.on", "command://control.scissor.left.door.off", "command://control.scissor.right.door.off", "command://control.scissor.left.door.pause", "command://control.scissor.right.door.pause", "command://control.electric.curtain.open", "command://control.electric.curtain.close", "command://control.comfortable.driving.mode.open", "command://control.comfortable.driving.mode.close", "command://control.light.language.on", "command://control.light.language.off", "command://control.capsule.universal.set"};
    }
}
