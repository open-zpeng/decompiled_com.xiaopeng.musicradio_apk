package com.xiaopeng.speech.protocol.node.combo;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class ComboNode_Processor implements ICommandProcessor {
    private ComboNode a;

    public ComboNode_Processor(ComboNode comboNode) {
        this.a = comboNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2090731182:
                if (str.equals("command://combo.exit.user.scenario")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -2050544765:
                if (str.equals("command://combo.mode.invisible.fast.close")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1861214251:
                if (str.equals("data://combo.mode.wait.tts")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1439089727:
                if (str.equals("command://combo.mode.fridge")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1170878131:
                if (str.equals("command://combo.mode.bio.off")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -814414287:
                if (str.equals("command://combo.mode.wait")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -780117185:
                if (str.equals("command://combo.mode.ventilate.off")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -719028020:
                if (str.equals("command://combo.mode.bio")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -597830030:
                if (str.equals("command://combo.mode.invisible.off")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -260120463:
                if (str.equals("command://combo.mode.invisible")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 174005252:
                if (str.equals("data://combo.mode.ventilate.tts")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 356292407:
                if (str.equals("data://combo.mode.invisible.tts")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 802818498:
                if (str.equals("command://combo.mode.fridge.off")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1008063422:
                if (str.equals("command://combo.mode.ventilate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1059045797:
                if (str.equals("data://combo.mode.fridge.tts")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1114869502:
                if (str.equals("data://combo.mode.meditation.tts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1618652110:
                if (str.equals("command://combo.enter.user.scenario")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1682644018:
                if (str.equals("command://combo.mode.wait.off")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2039944914:
                if (str.equals("data://combo.mode.bio.tts")) {
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
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"command://combo.mode.bio", "command://combo.mode.ventilate", "command://combo.mode.invisible", "command://combo.mode.invisible.off", "command://combo.mode.fridge", "data://combo.mode.invisible.tts", "data://combo.mode.meditation.tts", "command://combo.mode.invisible.fast.close", "data://combo.mode.bio.tts", "data://combo.mode.ventilate.tts", "data://combo.mode.fridge.tts", "command://combo.mode.bio.off", "command://combo.mode.ventilate.off", "command://combo.mode.fridge.off", "data://combo.mode.wait.tts", "command://combo.mode.wait", "command://combo.mode.wait.off", "command://combo.enter.user.scenario", "command://combo.exit.user.scenario"};
    }
}
