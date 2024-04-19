package com.xiaopeng.speech.protocol.node.app;

import com.xiaopeng.speech.annotation.ICommandProcessor;
/* loaded from: classes2.dex */
public class AppNode_Processor implements ICommandProcessor {
    private AppNode a;

    public AppNode_Processor(AppNode appNode) {
        this.a = appNode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public void a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2098758070:
                if (str.equals("command://start.page")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1740381936:
                if (str.equals("command://app.launcher.exit")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1284156689:
                if (str.equals("command://youku.search.result")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1266760065:
                if (str.equals("command://gui.carspeech.debug.open")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -210825502:
                if (str.equals("command://app.ai.homepage.close")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -210679123:
                if (str.equals("command://app.page.open")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -135994987:
                if (str.equals("command://system.debug.open")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 277054473:
                if (str.equals("command://appstore.open")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 636922058:
                if (str.equals("command://system.keyevent.back")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 963391520:
                if (str.equals("command://app.ai.homepage.open")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1150874049:
                if (str.equals("command://trigger.intent")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1242343382:
                if (str.equals("native://app.active")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1440847352:
                if (str.equals("native://app.query")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1863838566:
                if (str.equals("command://app.open")) {
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
            default:
                return;
        }
    }

    @Override // com.xiaopeng.speech.annotation.ICommandProcessor
    public String[] a() {
        return new String[]{"native://app.query", "command://app.open", "command://app.page.open", "command://system.keyevent.back", "command://appstore.open", "command://trigger.intent", "command://system.debug.open", "native://app.active", "command://app.ai.homepage.open", "command://app.ai.homepage.close", "command://app.launcher.exit", "command://start.page", "command://gui.carspeech.debug.open", "command://youku.search.result"};
    }
}
