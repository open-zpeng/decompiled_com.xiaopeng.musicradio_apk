package com.xiaopeng.speech.protocol.query.appstore;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class AppAndAppletQuery_Processor implements IQueryProcessor {
    private AppAndAppletQuery a;

    public AppAndAppletQuery_Processor(AppAndAppletQuery appAndAppletQuery) {
        this.a = appAndAppletQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1511576655:
                if (str.equals("gui.third.app.open")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1201339175:
                if (str.equals("gui.app.page.close")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -649881094:
                if (str.equals("gui.applet.page.close")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -176939191:
                if (str.equals("gui.app.page.open")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 51075875:
                if (str.equals("gui.appshop.page.close")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 371669303:
                if (str.equals("gui.applet.close")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 374572401:
                if (str.equals("gui.third.app.close")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 417650623:
                if (str.equals("gui.appshop.page.open")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 533586440:
                if (str.equals("gui.applet.page.open")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 982181675:
                if (str.equals("gui.applet.open")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1115443664:
                if (str.equals("gui.current.close")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1121989518:
                if (str.equals("has.dialog.close.byhand")) {
                    c = 11;
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
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            case 2:
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Integer.valueOf(this.a.e(str, str2));
            case 4:
                return Integer.valueOf(this.a.f(str, str2));
            case 5:
                return Integer.valueOf(this.a.g(str, str2));
            case 6:
                return Integer.valueOf(this.a.h(str, str2));
            case 7:
                return Integer.valueOf(this.a.i(str, str2));
            case '\b':
                return Integer.valueOf(this.a.j(str, str2));
            case '\t':
                return Integer.valueOf(this.a.k(str, str2));
            case '\n':
                return Integer.valueOf(this.a.l(str, str2));
            case 11:
                return Boolean.valueOf(this.a.m(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"gui.appshop.page.open", "gui.appshop.page.close", "gui.app.page.open", "gui.app.page.close", "gui.applet.page.open", "gui.applet.page.close", "gui.third.app.open", "gui.third.app.close", "gui.applet.open", "gui.applet.close", "gui.current.close", "has.dialog.close.byhand"};
    }
}
