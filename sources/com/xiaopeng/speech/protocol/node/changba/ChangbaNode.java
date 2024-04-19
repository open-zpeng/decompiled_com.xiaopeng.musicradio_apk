package com.xiaopeng.speech.protocol.node.changba;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.protocol.node.changba.bean.ChangbaBean;
/* loaded from: classes2.dex */
public class ChangbaNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        ChangbaBean a2 = ChangbaBean.a(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(a2);
            }
        }
    }
}
