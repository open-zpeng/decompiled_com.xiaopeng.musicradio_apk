package com.xiaopeng.speech.protocol.query.media;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class MediaQuery_Processor implements IQueryProcessor {
    private MediaQuery a;

    public MediaQuery_Processor(MediaQuery mediaQuery) {
        this.a = mediaQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        if (((str.hashCode() == -931837998 && str.equals("media.info.query")) ? (char) 0 : (char) 65535) != 0) {
            return null;
        }
        return this.a.b(str, str2);
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"media.info.query"};
    }
}
