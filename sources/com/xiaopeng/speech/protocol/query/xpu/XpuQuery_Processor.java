package com.xiaopeng.speech.protocol.query.xpu;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class XpuQuery_Processor implements IQueryProcessor {
    private XpuQuery a;

    public XpuQuery_Processor(XpuQuery xpuQuery) {
        this.a = xpuQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1809695763) {
            if (hashCode == -603903460 && str.equals("xpu.is.on.alc")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("xpu.is.on.autopilot")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return Integer.valueOf(this.a.b(str, str2));
            case 1:
                return Integer.valueOf(this.a.c(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"xpu.is.on.autopilot", "xpu.is.on.alc"};
    }
}
