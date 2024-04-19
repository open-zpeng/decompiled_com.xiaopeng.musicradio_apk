package com.xiaopeng.speech.protocol.node.floater;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.protocol.bean.WindowAnimState;
/* loaded from: classes2.dex */
public class FloaterSpeechNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        int parseInt = Integer.parseInt(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(parseInt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        WindowAnimState fromJson = WindowAnimState.fromJson(str2);
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(fromJson);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void d(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str2);
            }
        }
    }
}
