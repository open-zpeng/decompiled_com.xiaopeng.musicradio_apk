package com.xiaopeng.speech.protocol.query.speech.combo;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class ComboQuery_Processor implements IQueryProcessor {
    private ComboQuery a;

    public ComboQuery_Processor(ComboQuery comboQuery) {
        this.a = comboQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -2089284112) {
            if (str.equals("combo.enter.user.mode")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == -1068777799) {
            if (str.equals("combo.get.current.user.mode")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != -949369482) {
            if (hashCode == 1765601312 && str.equals("combo.check.user.mode")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("combo.exit.user.mode")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return this.a.b(str, str2);
            case 1:
                return this.a.c(str, str2);
            case 2:
                return this.a.d(str, str2);
            case 3:
                return this.a.e(str, str2);
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"combo.enter.user.mode", "combo.exit.user.mode", "combo.check.user.mode", "combo.get.current.user.mode"};
    }
}
