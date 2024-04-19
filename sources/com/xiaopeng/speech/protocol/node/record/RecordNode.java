package com.xiaopeng.speech.protocol.node.record;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
import com.xiaopeng.speech.protocol.node.record.bean.AsrResult;
import com.xiaopeng.speech.protocol.node.record.bean.RecordErrReason;
import com.xiaopeng.speech.protocol.node.record.bean.Volume;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class RecordNode extends bfc<a> {
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        AsrResult a2 = AsrResult.a(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(a2);
            }
        }
    }

    @SpeechAnnotation
    public void c(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }

    @SpeechAnnotation
    public void d(String str, String str2) {
        boolean z;
        Object[] a = this.b.a();
        try {
            z = new JSONObject(str2).optBoolean("isStopRecord");
        } catch (JSONException e) {
            e.printStackTrace();
            z = false;
        }
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(z);
            }
        }
    }

    @SpeechAnnotation
    public void e(String str, String str2) {
        Object[] a = this.b.a();
        RecordErrReason a2 = RecordErrReason.a(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(a2);
            }
        }
    }

    @SpeechAnnotation
    public void f(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    @SpeechAnnotation
    public void g(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }

    @SpeechAnnotation
    public void h(String str, String str2) {
        Object[] a = this.b.a();
        Volume a2 = Volume.a(str2);
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(a2);
            }
        }
    }

    @SpeechAnnotation
    public void i(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).d();
            }
        }
    }
}
