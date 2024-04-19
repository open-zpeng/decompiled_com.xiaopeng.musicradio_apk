package com.xiaopeng.speech.protocol.query.personalCenter;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class PersonalCenterVuiQuery_Processor implements IQueryProcessor {
    private PersonalCenterVuiQuery a;

    public PersonalCenterVuiQuery_Processor(PersonalCenterVuiQuery personalCenterVuiQuery) {
        this.a = personalCenterVuiQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1676441979:
                if (str.equals("vui.element.scroll.state.com.xiaopeng.caraccount")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1377418726:
                if (str.equals("vui.statefulbutton.setvalue.com.xiaopeng.caraccount")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003325425:
                if (str.equals("vui.element.radiobutton.checked.com.xiaopeng.caraccount")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -435247663:
                if (str.equals("vui.element.checkbox.checked.com.xiaopeng.caraccount")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 102757397:
                if (str.equals("vui.xtablayout.selecttab.com.xiaopeng.caraccount")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 384983952:
                if (str.equals("vui.switch.checked.com.xiaopeng.caraccount")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1183902695:
                if (str.equals("vui.xslider.setvalue.com.xiaopeng.caraccount")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1448450986:
                if (str.equals("vui.element.enabled.com.xiaopeng.caraccount")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1843237338:
                if (str.equals("vui.statefulbutton.checked.com.xiaopeng.caraccount")) {
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
        return new String[]{"vui.switch.checked.com.xiaopeng.caraccount", "vui.xtablayout.selecttab.com.xiaopeng.caraccount", "vui.xslider.setvalue.com.xiaopeng.caraccount", "vui.statefulbutton.checked.com.xiaopeng.caraccount", "vui.statefulbutton.setvalue.com.xiaopeng.caraccount", "vui.element.enabled.com.xiaopeng.caraccount", "vui.element.scroll.state.com.xiaopeng.caraccount", "vui.element.checkbox.checked.com.xiaopeng.caraccount", "vui.element.radiobutton.checked.com.xiaopeng.caraccount"};
    }
}
