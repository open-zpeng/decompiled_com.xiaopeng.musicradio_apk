package com.xiaopeng.speech.protocol.node.personalCenter;

import com.xiaopeng.lib.framework.aiassistantmodule.interactive.Constants;
import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.common.util.c;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PersonalCenterNode extends bfc<a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        int i;
        c.b("PersonalCenterNode", "data = " + str2 + " , event = " + str);
        try {
            i = new JSONObject(str2).optInt(Constants.INDEX);
        } catch (Throwable unused) {
            c.c("CaracNode", "onControlProfileHabitSelect string data error, data = " + str2);
            i = 0;
        }
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        c.b("PersonalCenterNode", "data = " + str2 + " , event = " + str);
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }
}
