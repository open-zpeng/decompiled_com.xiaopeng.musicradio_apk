package com.xiaopeng.speech.protocol.query.speech.ui;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class SpeechUiQuery_Processor implements IQueryProcessor {
    private SpeechUiQuery a;

    public SpeechUiQuery_Processor(SpeechUiQuery speechUiQuery) {
        this.a = speechUiQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1584266840) {
            if (hashCode == -1417712984 && str.equals("is.superdialogue.opened")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("is.superdialogue.whitelist")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return Boolean.valueOf(this.a.b(str, str2));
            case 1:
                return Boolean.valueOf(this.a.c(str, str2));
            default:
                return null;
        }
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"is.superdialogue.whitelist", "is.superdialogue.opened"};
    }
}
