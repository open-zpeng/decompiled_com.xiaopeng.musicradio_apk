package com.xiaopeng.speech.protocol.node.command;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.protocol.node.command.bean.CommandBean;
/* loaded from: classes2.dex */
public class CommandNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        CommandBean a2 = CommandBean.a(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(a2);
            }
        }
    }
}
