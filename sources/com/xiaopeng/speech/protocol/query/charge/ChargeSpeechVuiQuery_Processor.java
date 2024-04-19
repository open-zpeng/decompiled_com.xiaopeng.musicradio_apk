package com.xiaopeng.speech.protocol.query.charge;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class ChargeSpeechVuiQuery_Processor implements IQueryProcessor {
    private ChargeSpeechVuiQuery a;

    public ChargeSpeechVuiQuery_Processor(ChargeSpeechVuiQuery chargeSpeechVuiQuery) {
        this.a = chargeSpeechVuiQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2140516078:
                if (str.equals("vui.switch.checked.com.xiaopeng.chargecontrol")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -730105805:
                if (str.equals("vui.element.radiobutton.checked.com.xiaopeng.chargecontrol")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -405850515:
                if (str.equals("vui.xtablayout.selecttab.com.xiaopeng.chargecontrol")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -343060995:
                if (str.equals("vui.element.scroll.state.com.xiaopeng.chargecontrol")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -72881480:
                if (str.equals("vui.element.enabled.com.xiaopeng.chargecontrol")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 33969499:
                if (str.equals("vui.xslider.setvalue.com.xiaopeng.chargecontrol")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 96497224:
                if (str.equals("vui.statefulbutton.setvalue.com.xiaopeng.chargecontrol")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 703355697:
                if (str.equals("vui.element.checkbox.checked.com.xiaopeng.chargecontrol")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1386874504:
                if (str.equals("vui.statefulbutton.checked.com.xiaopeng.chargecontrol")) {
                    c = 3;
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
        return new String[]{"vui.switch.checked.com.xiaopeng.chargecontrol", "vui.xtablayout.selecttab.com.xiaopeng.chargecontrol", "vui.xslider.setvalue.com.xiaopeng.chargecontrol", "vui.statefulbutton.checked.com.xiaopeng.chargecontrol", "vui.statefulbutton.setvalue.com.xiaopeng.chargecontrol", "vui.element.enabled.com.xiaopeng.chargecontrol", "vui.element.scroll.state.com.xiaopeng.chargecontrol", "vui.element.checkbox.checked.com.xiaopeng.chargecontrol", "vui.element.radiobutton.checked.com.xiaopeng.chargecontrol"};
    }
}
