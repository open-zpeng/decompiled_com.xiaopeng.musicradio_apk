package com.xiaopeng.speech.protocol.query.speech.vui;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class CarSpeechUIVuiQuery_Processor implements IQueryProcessor {
    private CarSpeechUIVuiQuery a;

    public CarSpeechUIVuiQuery_Processor(CarSpeechUIVuiQuery carSpeechUIVuiQuery) {
        this.a = carSpeechUIVuiQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1732965939:
                if (str.equals("vui.xslider.setvalue.com.xiaopeng.carspeechservice")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1581896649:
                if (str.equals("vui.element.checkbox.checked.com.xiaopeng.carspeechservice")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1313067648:
                if (str.equals("vui.statefulbutton.checked.com.xiaopeng.carspeechservice")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -973678603:
                if (str.equals("vui.element.radiobutton.checked.com.xiaopeng.carspeechservice")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -841064778:
                if (str.equals("vui.switch.checked.com.xiaopeng.carspeechservice")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -465782917:
                if (str.equals("vui.xtablayout.selecttab.com.xiaopeng.carspeechservice")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1309650368:
                if (str.equals("vui.statefulbutton.setvalue.com.xiaopeng.carspeechservice")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1786033643:
                if (str.equals("vui.element.scroll.state.com.xiaopeng.carspeechservice")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1935252304:
                if (str.equals("vui.element.enabled.com.xiaopeng.carspeechservice")) {
                    c = 5;
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
                return Integer.valueOf(this.a.d(str, str2));
            case 3:
                return Boolean.valueOf(this.a.e(str, str2));
            case 4:
                return this.a.f(str, str2);
            case 5:
                return Boolean.valueOf(this.a.g(str, str2));
            case 6:
                return Boolean.valueOf(this.a.h(str, str2));
            case 7:
                return Boolean.valueOf(this.a.i(str, str2));
            case '\b':
                return Boolean.valueOf(this.a.j(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"vui.switch.checked.com.xiaopeng.carspeechservice", "vui.xtablayout.selecttab.com.xiaopeng.carspeechservice", "vui.xslider.setvalue.com.xiaopeng.carspeechservice", "vui.statefulbutton.checked.com.xiaopeng.carspeechservice", "vui.statefulbutton.setvalue.com.xiaopeng.carspeechservice", "vui.element.enabled.com.xiaopeng.carspeechservice", "vui.element.scroll.state.com.xiaopeng.carspeechservice", "vui.element.checkbox.checked.com.xiaopeng.carspeechservice", "vui.element.radiobutton.checked.com.xiaopeng.carspeechservice"};
    }
}
