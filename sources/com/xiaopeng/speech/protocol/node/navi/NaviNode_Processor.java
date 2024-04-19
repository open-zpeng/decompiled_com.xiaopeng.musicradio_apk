package com.xiaopeng.speech.protocol.node.navi;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class NaviNode_Processor implements ICommandProcessor {
    private NaviNode a;

    public NaviNode_Processor(NaviNode naviNode) {
        this.a = naviNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2136970098:
                if (str.equals("command://navi.control.close")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2132799004:
                if (str.equals("command://navi.drive.radar.route")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -2121968904:
                if (str.equals("command://navi.control.start")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case -1987448085:
                if (str.equals("command://navi.search.close")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1909621251:
                if (str.equals("command://navi.auto.reroute.ask.first")) {
                    c = 'M';
                    break;
                }
                c = 65535;
                break;
            case -1907058252:
                if (str.equals("native://navi.control.charge.close")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1667606279:
                if (str.equals("command://navi.map.zoomin.max")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case -1667539314:
                if (str.equals("command://navi.auto.reroute.never")) {
                    c = 'N';
                    break;
                }
                c = 65535;
                break;
            case -1518898323:
                if (str.equals("command://navi.control.overview.close")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1475394262:
                if (str.equals("command://navi.drive.avoid.charge")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1467020709:
                if (str.equals("command://navi.ribbon.map.open")) {
                    c = 'C';
                    break;
                }
                c = 65535;
                break;
            case -1380219901:
                if (str.equals("command://navi.map.zoomin")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1361583363:
                if (str.equals("native://navi.select.route.count")) {
                    c = '>';
                    break;
                }
                c = 65535;
                break;
            case -1316967297:
                if (str.equals("native://navi.control.settings.open")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1274994428:
                if (str.equals("command://navi.control.vol.on")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case -1169768037:
                if (str.equals("native://navi.navigating.get")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1141056686:
                if (str.equals("command://navi.drive.highway.first")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1121697225:
                if (str.equals("native://navi.address.get")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case -982285267:
                if (str.equals("command://navi.drive.avoid.controls.off")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -977315249:
                if (str.equals("command://navi.control.speech.eye")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -957206192:
                if (str.equals("command://navi.control.speech.eye.off")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -873701781:
                if (str.equals("command://navi.parking.select")) {
                    c = '9';
                    break;
                }
                c = 65535;
                break;
            case -870121750:
                if (str.equals("command://navi.control.vol.off")) {
                    c = '7';
                    break;
                }
                c = 65535;
                break;
            case -793405345:
                if (str.equals("command://navi.drive.highway.no")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -780474528:
                if (str.equals("command://navi.drive.highway.no.off")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -741372363:
                if (str.equals("command://navi.control.overview.open")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -735619553:
                if (str.equals("command://navi.address.pending.route")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case -682936661:
                if (str.equals("command://navi.drive.avoid.charge.off")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -629123846:
                if (str.equals("command://navi.route.select")) {
                    c = '<';
                    break;
                }
                c = 65535;
                break;
            case -585100656:
                if (str.equals("native://navi.waypoint.search")) {
                    c = '?';
                    break;
                }
                c = 65535;
                break;
            case -573495894:
                if (str.equals("command://navi.control.history")) {
                    c = 'E';
                    break;
                }
                c = 65535;
                break;
            case -550413506:
                if (str.equals("command://navi.side.road")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case -483469262:
                if (str.equals("command://navi.park.recommend.off")) {
                    c = 'H';
                    break;
                }
                c = 65535;
                break;
            case -483373155:
                if (str.equals("command://navi.drive.avoid.congestion")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -471273732:
                if (str.equals("command://navi.map.show.set")) {
                    c = 'O';
                    break;
                }
                c = 65535;
                break;
            case -463743293:
                if (str.equals("command://navi.confirm.ok")) {
                    c = ':';
                    break;
                }
                c = 65535;
                break;
            case -432687108:
                if (str.equals("command://navi.control.smart.scale.off")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -336305704:
                if (str.equals("command://navi.poi.details.favorite.add")) {
                    c = 'P';
                    break;
                }
                c = 65535;
                break;
            case -336302782:
                if (str.equals("command://navi.poi.details.favorite.del")) {
                    c = 'Q';
                    break;
                }
                c = 65535;
                break;
            case -287805857:
                if (str.equals("command://navi.control.waypoint.start")) {
                    c = '@';
                    break;
                }
                c = 65535;
                break;
            case -257936759:
                if (str.equals("command://navi.control.security.remind")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -245623106:
                if (str.equals("command://navi.control.display.car")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case -60216351:
                if (str.equals("command://navi.confirm.cancel")) {
                    c = ';';
                    break;
                }
                c = 65535;
                break;
            case 30697630:
                if (str.equals("command://navi.control.road.ahead.off")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 162862128:
                if (str.equals("command://navi.map.zoomout")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 189975919:
                if (str.equals("command://navi.control.display.north")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 219354725:
                if (str.equals("command://navi.drive.radar.route.off")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 235759773:
                if (str.equals("command://navi.control.road.ahead")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 255171078:
                if (str.equals("command://navi.control.speech.general")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 295754221:
                if (str.equals("native://navi.route.nearby.search")) {
                    c = '8';
                    break;
                }
                c = 65535;
                break;
            case 338160499:
                if (str.equals("command://navi.control.speech.detail")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 354485006:
                if (str.equals("native://navi.control.charge.open")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 398795396:
                if (str.equals("command://navi.map.overview")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 431524135:
                if (str.equals("command://navi.control.speech.super.simple")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 560836717:
                if (str.equals("command://navi.alerts.preference.set")) {
                    c = 'J';
                    break;
                }
                c = 65535;
                break;
            case 592257019:
                if (str.equals("command://navi.scale.level.set")) {
                    c = 'I';
                    break;
                }
                c = 65535;
                break;
            case 757845918:
                if (str.equals("command://navi.drive.avoid.congestion.off")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 771097812:
                if (str.equals("command://navi.control.speech.simple")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 784930555:
                if (str.equals("command://navi.control.smart.scale")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 838195437:
                if (str.equals("command://navi.road.info.close")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 858683573:
                if (str.equals("command://navi.road.info.open")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 950634676:
                if (str.equals("command://navi.control.history.close")) {
                    c = 'S';
                    break;
                }
                c = 65535;
                break;
            case 1047011356:
                if (str.equals("command://navi.main.road")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1082133391:
                if (str.equals("command://navi.address.set")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 1137052564:
                if (str.equals("command://navi.map.zoomout.min")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 1247853748:
                if (str.equals("native://navi.settings.info")) {
                    c = 'F';
                    break;
                }
                c = 65535;
                break;
            case 1255072401:
                if (str.equals("native://navi.poi.search")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1356046610:
                if (str.equals("native://navi.nearby.search")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 1631355563:
                if (str.equals("command://navi.avoid.route.set")) {
                    c = 'K';
                    break;
                }
                c = 65535;
                break;
            case 1632960358:
                if (str.equals("command://navi.small.map.close")) {
                    c = 'B';
                    break;
                }
                c = 65535;
                break;
            case 1687314057:
                if (str.equals("command://navi.auto.reroute.better.route")) {
                    c = 'L';
                    break;
                }
                c = 65535;
                break;
            case 1735961708:
                if (str.equals("native://navi.select.parking.count")) {
                    c = '=';
                    break;
                }
                c = 65535;
                break;
            case 1755806727:
                if (str.equals("command://navi.ribbon.map.close")) {
                    c = 'D';
                    break;
                }
                c = 65535;
                break;
            case 1759009930:
                if (str.equals("command://navi.control.security.remind.off")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1777247148:
                if (str.equals("command://navi.drive.avoid.controls")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1793190503:
                if (str.equals("command://navi.control.display.3d")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 1832000151:
                if (str.equals("command://navi.control.settings.close")) {
                    c = 'R';
                    break;
                }
                c = 65535;
                break;
            case 1854152476:
                if (str.equals("command://navi.small.map.open")) {
                    c = 'A';
                    break;
                }
                c = 65535;
                break;
            case 1890678995:
                if (str.equals("command://navi.drive.highway.first.off")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1961191760:
                if (str.equals("command://navi.control.favorite.close")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 1963423819:
                if (str.equals("command://navi.enter.find.path")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 2040031459:
                if (str.equals("command://navi.exit.find.path")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 2062614204:
                if (str.equals("command://navi.park.recommend.on")) {
                    c = 'G';
                    break;
                }
                c = 65535;
                break;
            case 2141835250:
                if (str.equals("command://navi.control.favorite.open")) {
                    c = '\b';
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
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://navi.control.close", "command://navi.map.zoomin", "command://navi.map.zoomout", "command://navi.road.info.open", "command://navi.road.info.close", "command://navi.control.overview.open", "command://navi.control.overview.close", "command://navi.map.overview", "command://navi.control.favorite.open", "native://navi.control.settings.open", "native://navi.control.charge.open", "native://navi.control.charge.close", "command://navi.drive.avoid.congestion", "command://navi.drive.avoid.congestion.off", "command://navi.drive.avoid.charge", "command://navi.drive.avoid.charge.off", "command://navi.drive.highway.first.off", "command://navi.drive.avoid.controls", "command://navi.drive.avoid.controls.off", "command://navi.drive.radar.route", "command://navi.drive.radar.route.off", "command://navi.control.speech.super.simple", "command://navi.control.speech.general", "command://navi.control.speech.eye", "command://navi.control.speech.eye.off", "command://navi.control.smart.scale", "command://navi.control.smart.scale.off", "command://navi.control.security.remind", "command://navi.control.road.ahead", "command://navi.drive.highway.no", "command://navi.drive.highway.no.off", "command://navi.drive.highway.first", "native://navi.navigating.get", "native://navi.poi.search", "command://navi.control.security.remind.off", "command://navi.enter.find.path", "command://navi.exit.find.path", "command://navi.search.close", "command://navi.main.road", "command://navi.side.road", "command://navi.control.favorite.close", "command://navi.control.road.ahead.off", "command://navi.map.zoomin.max", "command://navi.map.zoomout.min", "native://navi.nearby.search", "native://navi.address.get", "command://navi.address.pending.route", "command://navi.address.set", "command://navi.control.start", "command://navi.control.speech.simple", "command://navi.control.speech.detail", "command://navi.control.display.north", "command://navi.control.display.car", "command://navi.control.display.3d", "command://navi.control.vol.on", "command://navi.control.vol.off", "native://navi.route.nearby.search", "command://navi.parking.select", "command://navi.confirm.ok", "command://navi.confirm.cancel", "command://navi.route.select", "native://navi.select.parking.count", "native://navi.select.route.count", "native://navi.waypoint.search", "command://navi.control.waypoint.start", "command://navi.small.map.open", "command://navi.small.map.close", "command://navi.ribbon.map.open", "command://navi.ribbon.map.close", "command://navi.control.history", "native://navi.settings.info", "command://navi.park.recommend.on", "command://navi.park.recommend.off", "command://navi.scale.level.set", "command://navi.alerts.preference.set", "command://navi.avoid.route.set", "command://navi.auto.reroute.better.route", "command://navi.auto.reroute.ask.first", "command://navi.auto.reroute.never", "command://navi.map.show.set", "command://navi.poi.details.favorite.add", "command://navi.poi.details.favorite.del", "command://navi.control.settings.close", "command://navi.control.history.close"};
    }
}
