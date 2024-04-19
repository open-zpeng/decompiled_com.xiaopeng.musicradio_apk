package com.xiaopeng.speech.protocol.node.carac;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class CaracNode_Processor implements ICommandProcessor {
    private CaracNode a;

    public CaracNode_Processor(CaracNode caracNode) {
        this.a = caracNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2049213332:
                if (str.equals("command://ac.temp.passenger.up")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -2031004713:
                if (str.equals("command://ac.modes.eco.on")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case -1997714566:
                if (str.equals("command://ac.temp.dual.off")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1997710125:
                if (str.equals("command://ac.temp.dual.syn")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1982458101:
                if (str.equals("command://ac.temp.driver.down")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -1877455440:
                if (str.equals("command://ac.open.fast.fridge")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case -1754019960:
                if (str.equals("command://ac.right.rear.seat.heat.close")) {
                    c = ']';
                    break;
                }
                c = 65535;
                break;
            case -1659193971:
                if (str.equals("command://ac.left.rear.seat.heat.set")) {
                    c = '^';
                    break;
                }
                c = 65535;
                break;
            case -1611128182:
                if (str.equals("command://ac.seat.heating.down")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case -1610800078:
                if (str.equals("command://ac.seat.heating.open")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1520877577:
                if (str.equals("command://ac.wind.auto.sweep.off")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case -1495695801:
                if (str.equals("command://card.ac.panel")) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case -1474634240:
                if (str.equals("command://ac.blow.head.window.off")) {
                    c = 'f';
                    break;
                }
                c = 65535;
                break;
            case -1402704680:
                if (str.equals("command://ac.wind.unidirection")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case -1379253628:
                if (str.equals("command://ac.exit.fast.fridge")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -1179765898:
                if (str.equals("command://ac.intelligent.psn.on")) {
                    c = 'T';
                    break;
                }
                c = 65535;
                break;
            case -1143304767:
                if (str.equals("command://ac.seat.heat.passenger.up")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case -1125717353:
                if (str.equals("command://ac.wind.outlet.off")) {
                    c = 'Y';
                    break;
                }
                c = 65535;
                break;
            case -1082711556:
                if (str.equals("command://ac.seat.heat.passenger.set")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -1067108253:
                if (str.equals("command://ac.left.rear.seat.heat.close")) {
                    c = '\\';
                    break;
                }
                c = 65535;
                break;
            case -1064721728:
                if (str.equals("command://ac.hvac.on")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1054854969:
                if (str.equals("command://ac.temp.max")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1054854731:
                if (str.equals("command://ac.temp.min")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case -1054849083:
                if (str.equals("command://ac.temp.set")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1032797908:
                if (str.equals("command://ac.demist.foot.on")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -997211612:
                if (str.equals("command://ac.wind.up")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -970874129:
                if (str.equals("command://ac.purifier.open")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -933998679:
                if (str.equals("command://ac.nature.on")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -902370839:
                if (str.equals("command://ac.seat.psn.heat.close")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -848796933:
                if (str.equals("command://ac.wind.max")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case -848796695:
                if (str.equals("command://ac.wind.min")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -848791047:
                if (str.equals("command://ac.wind.set")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -794660614:
                if (str.equals("command://ac.inner.off")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -686815348:
                if (str.equals("command://ac.defrost.demist.front.on")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -684339037:
                if (str.equals("command://ac.open.fresh.air")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -543155733:
                if (str.equals("command://ac.wind.down")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -543093835:
                if (str.equals("command://ac.wind.free")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -533834088:
                if (str.equals("command://ac.heating.on")) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case -530897568:
                if (str.equals("command://ac.ac.off")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -515974873:
                if (str.equals("command://ac.aqs.on")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -363842875:
                if (str.equals("command://ac.wind.mirror.on")) {
                    c = 'V';
                    break;
                }
                c = 65535;
                break;
            case -324663506:
                if (str.equals("command://ac.blow.head.window.on")) {
                    c = 'd';
                    break;
                }
                c = 65535;
                break;
            case -299710995:
                if (str.equals("command://ac.defrost.demist.rear.off")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -202489381:
                if (str.equals("command://ac.temp.driver.max")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -202489143:
                if (str.equals("command://ac.temp.driver.min")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case -202483495:
                if (str.equals("command://ac.temp.driver.set")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -43518477:
                if (str.equals("command://ac.purifier.close")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -28747719:
                if (str.equals("command://ac.seat.psn.heat.open")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 54152895:
                if (str.equals("command://ac.seat.ventilate.on")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 54153083:
                if (str.equals("command://ac.seat.ventilate.up")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case 67141408:
                if (str.equals("command://ac.blow.foot.on")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 104157399:
                if (str.equals("command://ac.left.rear.seat.heat.down")) {
                    c = 'b';
                    break;
                }
                c = 65535;
                break;
            case 104485503:
                if (str.equals("command://ac.left.rear.seat.heat.open")) {
                    c = 'Z';
                    break;
                }
                c = 65535;
                break;
            case 183560546:
                if (str.equals("command://ac.defrost.demist.front.off")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 339726725:
                if (str.equals("command://ac.mirror.rear.heat.on")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 343152168:
                if (str.equals("command://ac.wind.evade")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case 343970304:
                if (str.equals("command://ac.wind.front")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 348580471:
                if (str.equals("command://ac.exit.fresh.air")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case 363678332:
                if (str.equals("command://ac.seat.heating.max")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 363678570:
                if (str.equals("command://ac.seat.heating.min")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 409110340:
                if (str.equals("command://ac.temp.driver.up")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 428424718:
                if (str.equals("command://ac.temp.passenger.dual.off")) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case 428429159:
                if (str.equals("command://ac.temp.passenger.dual.syn")) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case 501001602:
                if (str.equals("command://ac.seat.ventilate.down")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 520162008:
                if (str.equals("command://ac.temp.up")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 579107870:
                if (str.equals("command://ac.blow.window.on")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case 607537788:
                if (str.equals("command://ac.seat.ventilate.driver.set")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 631012310:
                if (str.equals("command://ac.heating.off")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case 667102452:
                if (str.equals("command://ac.inner.on")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 795243080:
                if (str.equals("command://ac.seat.heat.passenger.down")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case 816190956:
                if (str.equals("command://ac.seat.heat.drive.set")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case 843015811:
                if (str.equals("command://ac.seat.heating.up")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 875138608:
                if (str.equals("command://ac.blow.head.foot.on")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 898888115:
                if (str.equals("command://ac.temp.passenger.max")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 898888353:
                if (str.equals("command://ac.temp.passenger.min")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 898894001:
                if (str.equals("command://ac.temp.passenger.set")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 916309008:
                if (str.equals("command://ac.left.rear.seat.heat.up")) {
                    c = '`';
                    break;
                }
                c = 65535;
                break;
            case 960163233:
                if (str.equals("command://ac.defrost.demist.rear.on")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1012713970:
                if (str.equals("command://ac.right.rear.seat.heat.set")) {
                    c = '_';
                    break;
                }
                c = 65535;
                break;
            case 1110811877:
                if (str.equals("command://ac.nature.off")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case 1184647975:
                if (str.equals("command://ac.aqs.off")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 1279594251:
                if (str.equals("command://ac.right.rear.seat.heat.up")) {
                    c = 'a';
                    break;
                }
                c = 65535;
                break;
            case 1301962337:
                if (str.equals("command://ac.auto.on")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1328924946:
                if (str.equals("command://ac.right.rear.seat.heat.down")) {
                    c = 'c';
                    break;
                }
                c = 65535;
                break;
            case 1329253050:
                if (str.equals("command://ac.right.rear.seat.heat.open")) {
                    c = '[';
                    break;
                }
                c = 65535;
                break;
            case 1336412759:
                if (str.equals("command://ac.wind.auto.sweep.on")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 1349159863:
                if (str.equals("command://ac.wind.outlet.on")) {
                    c = 'X';
                    break;
                }
                c = 65535;
                break;
            case 1353364654:
                if (str.equals("command://ac.hvac.off")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1360839242:
                if (str.equals("command://ac.wind.direction.set")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1368347598:
                if (str.equals("command://ac.ac.on")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1463363191:
                if (str.equals("command://ac.modes.eco.off")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 1542451310:
                if (str.equals("command://ac.blow.head.on")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1593613584:
                if (str.equals("command://ac.seat.heating.close")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1605772617:
                if (str.equals("command://ac.wind.mirror.off")) {
                    c = 'W';
                    break;
                }
                c = 65535;
                break;
            case 1658979743:
                if (str.equals("command://ac.temp.down")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1678737540:
                if (str.equals("command://ac.seat.ventilate.max")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1678737778:
                if (str.equals("command://ac.seat.ventilate.min")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 1678739599:
                if (str.equals("command://ac.seat.ventilate.off")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1706126637:
                if (str.equals("command://ac.auto.off")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1941593737:
                if (str.equals("command://ac.mirror.rear.heat.off")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2004070256:
                if (str.equals("command://ac.blow.head.window.foot.on")) {
                    c = 'e';
                    break;
                }
                c = 65535;
                break;
            case 2081962680:
                if (str.equals("command://ac.intelligent.psn.off")) {
                    c = 'U';
                    break;
                }
                c = 65535;
                break;
            case 2095473203:
                if (str.equals("command://ac.temp.passenger.down")) {
                    c = 30;
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
                this.a.aH(str, str2);
                return;
            case 'U':
                this.a.aI(str, str2);
                return;
            case 'V':
                this.a.aJ(str, str2);
                return;
            case 'W':
                this.a.aK(str, str2);
                return;
            case 'X':
                this.a.aL(str, str2);
                return;
            case 'Y':
                this.a.aM(str, str2);
                return;
            case 'Z':
                this.a.aN(str, str2);
                return;
            case '[':
                this.a.aO(str, str2);
                return;
            case '\\':
                this.a.aP(str, str2);
                return;
            case ']':
                this.a.aQ(str, str2);
                return;
            case '^':
                this.a.aR(str, str2);
                return;
            case '_':
                this.a.aS(str, str2);
                return;
            case '`':
                this.a.aT(str, str2);
                return;
            case 'a':
                this.a.aU(str, str2);
                return;
            case 'b':
                this.a.aV(str, str2);
                return;
            case 'c':
                this.a.aW(str, str2);
                return;
            case 'd':
                this.a.aX(str, str2);
                return;
            case 'e':
                this.a.aY(str, str2);
                return;
            case 'f':
                this.a.aZ(str, str2);
                return;
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://ac.hvac.off", "command://ac.hvac.on", "command://ac.ac.on", "command://ac.ac.off", "command://ac.auto.on", "command://ac.auto.off", "command://ac.blow.foot.on", "command://ac.blow.head.foot.on", "command://ac.blow.head.on", "command://ac.defrost.demist.front.off", "command://ac.defrost.demist.front.on", "command://ac.defrost.demist.rear.off", "command://ac.defrost.demist.rear.on", "command://ac.demist.foot.on", "command://ac.inner.off", "command://ac.inner.on", "command://ac.wind.down", "command://ac.wind.up", "command://ac.wind.set", "command://ac.mirror.rear.heat.off", "command://ac.mirror.rear.heat.on", "command://ac.temp.down", "command://ac.temp.up", "command://ac.temp.set", "command://ac.purifier.open", "command://ac.purifier.close", "command://ac.temp.driver.up", "command://ac.temp.driver.down", "command://ac.temp.driver.set", "command://ac.temp.passenger.up", "command://ac.temp.passenger.down", "command://ac.temp.passenger.set", "command://ac.temp.dual.syn", "command://ac.temp.dual.off", "command://ac.wind.max", "command://ac.wind.min", "command://ac.temp.min", "command://ac.temp.max", "command://ac.temp.driver.min", "command://ac.temp.driver.max", "command://ac.temp.passenger.min", "command://ac.temp.passenger.max", "command://ac.seat.heating.open", "command://ac.seat.heating.close", "command://ac.seat.psn.heat.open", "command://ac.seat.psn.heat.close", "command://ac.seat.heating.max", "command://ac.seat.heating.min", "command://ac.seat.heating.up", "command://ac.seat.heating.down", "command://ac.seat.ventilate.on", "command://ac.seat.ventilate.off", "command://ac.seat.ventilate.max", "command://ac.seat.ventilate.min", "command://ac.seat.ventilate.down", "command://ac.seat.ventilate.up", "command://ac.seat.ventilate.driver.set", "command://ac.seat.heat.drive.set", "command://ac.seat.heat.passenger.set", "command://ac.seat.heat.passenger.up", "command://ac.seat.heat.passenger.down", "command://ac.open.fast.fridge", "command://ac.open.fresh.air", "command://ac.exit.fast.fridge", "command://ac.exit.fresh.air", "command://ac.wind.direction.set", "command://ac.wind.unidirection", "command://ac.wind.evade", "command://ac.wind.front", "command://ac.wind.free", "command://ac.wind.auto.sweep.on", "command://ac.wind.auto.sweep.off", "command://ac.aqs.on", "command://ac.aqs.off", "command://ac.modes.eco.on", "command://ac.modes.eco.off", "command://ac.heating.on", "command://ac.heating.off", "command://ac.nature.on", "command://ac.nature.off", "command://ac.blow.window.on", "command://ac.temp.passenger.dual.syn", "command://ac.temp.passenger.dual.off", "command://card.ac.panel", "command://ac.intelligent.psn.on", "command://ac.intelligent.psn.off", "command://ac.wind.mirror.on", "command://ac.wind.mirror.off", "command://ac.wind.outlet.on", "command://ac.wind.outlet.off", "command://ac.left.rear.seat.heat.open", "command://ac.right.rear.seat.heat.open", "command://ac.left.rear.seat.heat.close", "command://ac.right.rear.seat.heat.close", "command://ac.left.rear.seat.heat.set", "command://ac.right.rear.seat.heat.set", "command://ac.left.rear.seat.heat.up", "command://ac.right.rear.seat.heat.up", "command://ac.left.rear.seat.heat.down", "command://ac.right.rear.seat.heat.down", "command://ac.blow.head.window.on", "command://ac.blow.head.window.foot.on", "command://ac.blow.head.window.off"};
    }
}
