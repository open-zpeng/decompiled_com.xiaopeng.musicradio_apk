package com.xiaopeng.speech.protocol.query.speech.vui;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechVuiQuery_Processor implements IQueryProcessor {
    private SpeechVuiQuery a;

    public SpeechVuiQuery_Processor(SpeechVuiQuery speechVuiQuery) {
        this.a = speechVuiQuery;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        switch (str.hashCode()) {
            case -2145092778:
                if (str.equals("vui.xtablayout.selecttab")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1914744341:
                if (str.equals("vui.element.enabled")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1689433816:
                if (str.equals("vui.xslider.setvalue")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1559106607:
                if (str.equals("vui.switch.checked")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1526015973:
                if (str.equals("vui.statefulbutton.checked")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1065770734:
                if (str.equals("vui.element.checkbox.checked")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -235119162:
                if (str.equals("vui.element.scroll.state")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -162510757:
                if (str.equals("vui.statefulbutton.setvalue")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 561567344:
                if (str.equals("vui.switch_opened")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1029533589:
                if (str.equals("vui.rebuild.scene")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1554959696:
                if (str.equals("vui.element.radiobutton.checked")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1920063277:
                if (str.equals("vui.scrollview.childview.visible")) {
                    c = '\n';
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
                return Boolean.valueOf(this.a.e());
            case '\b':
                return Boolean.valueOf(this.a.i(str, str2));
            case '\t':
                return Boolean.valueOf(this.a.j(str, str2));
            case '\n':
                return this.a.k(str, str2);
            case 11:
                return Boolean.valueOf(this.a.l(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"vui.switch.checked", "vui.xtablayout.selecttab", "vui.xslider.setvalue", "vui.statefulbutton.checked", "vui.statefulbutton.setvalue", "vui.element.enabled", "vui.element.scroll.state", "vui.switch_opened", "vui.element.checkbox.checked", "vui.element.radiobutton.checked", "vui.scrollview.childview.visible", "vui.rebuild.scene"};
    }
}
