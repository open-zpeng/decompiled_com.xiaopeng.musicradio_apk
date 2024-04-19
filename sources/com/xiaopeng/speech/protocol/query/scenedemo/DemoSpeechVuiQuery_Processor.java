package com.xiaopeng.speech.protocol.query.scenedemo;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class DemoSpeechVuiQuery_Processor implements IQueryProcessor {
    private DemoSpeechVuiQuery a;

    public DemoSpeechVuiQuery_Processor(DemoSpeechVuiQuery demoSpeechVuiQuery) {
        this.a = demoSpeechVuiQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -1983407089:
                if (str.equals("vui.element.scroll.state.com.xiaopeng.speech.scenedemo")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1834188428:
                if (str.equals("vui.element.enabled.com.xiaopeng.speech.scenedemo")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1207439375:
                if (str.equals("vui.xslider.setvalue.com.xiaopeng.speech.scenedemo")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1056370085:
                if (str.equals("vui.element.checkbox.checked.com.xiaopeng.speech.scenedemo")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -787541084:
                if (str.equals("vui.statefulbutton.checked.com.xiaopeng.speech.scenedemo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -448152039:
                if (str.equals("vui.element.radiobutton.checked.com.xiaopeng.speech.scenedemo")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -315538214:
                if (str.equals("vui.switch.checked.com.xiaopeng.speech.scenedemo")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 59743647:
                if (str.equals("vui.xtablayout.selecttab.com.xiaopeng.speech.scenedemo")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1835176932:
                if (str.equals("vui.statefulbutton.setvalue.com.xiaopeng.speech.scenedemo")) {
                    c = 4;
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
        return new String[]{"vui.switch.checked.com.xiaopeng.speech.scenedemo", "vui.xtablayout.selecttab.com.xiaopeng.speech.scenedemo", "vui.xslider.setvalue.com.xiaopeng.speech.scenedemo", "vui.statefulbutton.checked.com.xiaopeng.speech.scenedemo", "vui.statefulbutton.setvalue.com.xiaopeng.speech.scenedemo", "vui.element.enabled.com.xiaopeng.speech.scenedemo", "vui.element.scroll.state.com.xiaopeng.speech.scenedemo", "vui.element.checkbox.checked.com.xiaopeng.speech.scenedemo", "vui.element.radiobutton.checked.com.xiaopeng.speech.scenedemo"};
    }
}
