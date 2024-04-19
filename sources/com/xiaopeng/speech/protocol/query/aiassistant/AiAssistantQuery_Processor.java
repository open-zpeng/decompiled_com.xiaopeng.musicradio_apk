package com.xiaopeng.speech.protocol.query.aiassistant;

import com.xiaopeng.speech.annotation.IQueryProcessor;
/* loaded from: classes2.dex */
public class AiAssistantQuery_Processor implements IQueryProcessor {
    private AiAssistantQuery a;

    public AiAssistantQuery_Processor(AiAssistantQuery aiAssistantQuery) {
        this.a = aiAssistantQuery;
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public Object a(String str, String str2) {
        if (((str.hashCode() == -497888784 && str.equals("gui.ai.video.open")) ? (char) 0 : (char) 65535) != 0) {
            return null;
        }
        return Integer.valueOf(this.a.b(str, str2));
    }

    @Override // com.xiaopeng.speech.annotation.IQueryProcessor
    public String[] a() {
        return new String[]{"gui.ai.video.open"};
    }
}
