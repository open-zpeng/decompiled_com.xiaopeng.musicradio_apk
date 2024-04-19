package com.xiaopeng.speech.protocol.node.wakeup;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
/* loaded from: classes2.dex */
public class WakeupStatusNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        bgi a = bgi.a(str2);
        Object[] a2 = this.b.a();
        if (a2 != null) {
            for (Object obj : a2) {
                ((a) obj).a(a.a, a.b, a.c);
            }
        }
    }
}
