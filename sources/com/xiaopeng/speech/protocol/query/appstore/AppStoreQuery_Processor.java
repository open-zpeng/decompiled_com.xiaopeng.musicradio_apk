package com.xiaopeng.speech.protocol.query.appstore;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class AppStoreQuery_Processor implements IQueryProcessor {
    private AppStoreQuery a;

    public AppStoreQuery_Processor(AppStoreQuery appStoreQuery) {
        this.a = appStoreQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        if (((str.hashCode() == 305415920 && str.equals("appstore.get.open.status")) ? (char) 0 : (char) 65535) != 0) {
            return null;
        }
        return Integer.valueOf(this.a.b(str, str2));
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"appstore.get.open.status"};
    }
}
