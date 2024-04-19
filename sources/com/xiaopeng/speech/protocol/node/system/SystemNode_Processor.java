package com.xiaopeng.speech.protocol.node.system;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class SystemNode_Processor implements ICommandProcessor {
    private SystemNode a;

    public SystemNode_Processor(SystemNode systemNode) {
        this.a = systemNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1919368988:
                if (str.equals("command://control.volume.notification.medium")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case -1597026812:
                if (str.equals("command://system.icm.brightness.up.percent")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -1344595949:
                if (str.equals("command://system.screen.brightness.auto.on")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case -1017521433:
                if (str.equals("command://system.icm.brightness.set.percent")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -1008260193:
                if (str.equals("command://system.bluetooth.off")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -931863087:
                if (str.equals("command://control.volume.notification.down")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case -601542604:
                if (str.equals("command://system.icm.brightness.down")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -537146671:
                if (str.equals("command://system.wifi.setting.open")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -453867971:
                if (str.equals("command://system.screen.brightness.up.percent")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -147779855:
                if (str.equals("command://system.volume.resume")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -95607791:
                if (str.equals("command://system.screen.on")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case -70327096:
                if (str.equals("command://system.wifi.on")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -53759242:
                if (str.equals("command://system.volume.unmute")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 60664270:
                if (str.equals("command://system.screen.brightness.set.percent")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 108495445:
                if (str.equals("command://control.volume.notification.max")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 108495683:
                if (str.equals("command://control.volume.notification.min")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 195917088:
                if (str.equals("command://system.volume.max")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 195917326:
                if (str.equals("command://system.volume.min")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 195922974:
                if (str.equals("command://system.volume.set")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 448747494:
                if (str.equals("command://system.screen.brightness.up")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 483297957:
                if (str.equals("command://system.theme.mode.auto")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 546271995:
                if (str.equals("command://system.music.sound.direction.set")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 605044356:
                if (str.equals("command://system.screen.brightness.down.percent")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 660212143:
                if (str.equals("command://system.bluetooth.on")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 662217111:
                if (str.equals("command://bluetooth.setting.open")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 759114577:
                if (str.equals("command://system.sound.scene.set")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 968795136:
                if (str.equals("command://system.music.sound.effect.style.set")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 979070195:
                if (str.equals("command://system.headrest.model.set")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 985423846:
                if (str.equals("command://system.theme.mode.day")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1026262393:
                if (str.equals("command://system.screen.brightness.max")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1026262631:
                if (str.equals("command://system.screen.brightness.min")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1026268279:
                if (str.equals("command://system.screen.brightness.set")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1209375344:
                if (str.equals("command://system.screen.mode.clean")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1267198395:
                if (str.equals("command://system.screen.brightness.auto.off")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 1331125629:
                if (str.equals("command://system.screen.off")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 1447822712:
                if (str.equals("command://system.music.sound.effect.model.set")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 1541025931:
                if (str.equals("command://system.icm.brightness.down.percent")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 1749108525:
                if (str.equals("command://system.screen.brightness.down")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1749559949:
                if (str.equals("command://system.screen.brightness.stop")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1778207846:
                if (str.equals("command://system.volume.down")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1778481629:
                if (str.equals("command://system.volume.mute")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1781718930:
                if (str.equals("command://system.icm.brightness.max")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1781719168:
                if (str.equals("command://system.icm.brightness.min")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1781724816:
                if (str.equals("command://system.icm.brightness.set")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1858590381:
                if (str.equals("command://system.icm.brightness.up")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1943162762:
                if (str.equals("command://control.volume.notification.up")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 1945982815:
                if (str.equals("command://system.volume.up")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2108970466:
                if (str.equals("command://system.theme.mode.night")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2114827174:
                if (str.equals("command://system.wifi.off")) {
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
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://system.screen.brightness.up", "command://system.screen.brightness.max", "command://system.screen.brightness.down", "command://system.screen.brightness.min", "command://system.theme.mode.auto", "command://system.theme.mode.day", "command://system.theme.mode.night", "command://system.screen.mode.clean", "command://system.wifi.off", "command://system.wifi.on", "command://system.bluetooth.off", "command://system.bluetooth.on", "command://system.volume.up", "command://system.volume.set", "command://system.volume.down", "command://system.volume.max", "command://system.volume.min", "command://system.volume.mute", "command://system.volume.unmute", "command://system.volume.resume", "command://system.screen.brightness.up.percent", "command://system.screen.brightness.set.percent", "command://system.screen.brightness.set", "command://system.icm.brightness.set", "command://system.icm.brightness.up", "command://system.icm.brightness.max", "command://system.icm.brightness.down", "command://system.icm.brightness.min", "command://bluetooth.setting.open", "command://system.wifi.setting.open", "command://system.screen.brightness.down.percent", "command://system.icm.brightness.up.percent", "command://system.icm.brightness.set.percent", "command://system.icm.brightness.down.percent", "command://system.screen.off", "command://system.screen.on", "command://system.screen.brightness.stop", "command://system.screen.brightness.auto.on", "command://system.screen.brightness.auto.off", "command://control.volume.notification.max", "command://control.volume.notification.min", "command://control.volume.notification.medium", "command://control.volume.notification.up", "command://control.volume.notification.down", "command://system.music.sound.direction.set", "command://system.music.sound.effect.model.set", "command://system.sound.scene.set", "command://system.music.sound.effect.style.set", "command://system.headrest.model.set"};
    }
}
