package com.xiaopeng.speech.protocol.query.ota;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class OtaQuery_Processor implements IQueryProcessor {
    private OtaQuery a;

    public OtaQuery_Processor(OtaQuery otaQuery) {
        this.a = otaQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        if (((str.hashCode() == 1851114339 && str.equals("is.latest.ota.version")) ? (char) 0 : (char) 65535) != 0) {
            return null;
        }
        return Boolean.valueOf(this.a.b(str, str2));
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"is.latest.ota.version"};
    }
}
