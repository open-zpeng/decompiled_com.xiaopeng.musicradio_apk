package com.xiaopeng.speech.protocol.node.autoparking;

import com.xiaopeng.speech.annotation.SpeechAnnotation;
/* loaded from: classes2.dex */
public class AutoParkingNode extends bfc<a> {
    private volatile boolean d;

    private void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void b(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void c(String str, String str2) {
        e();
        this.d = false;
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void d(String str, String str2) {
        e();
        this.d = false;
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).a(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void e(String str, String str2) {
        bgs a = bgs.a(str2);
        Object[] a2 = this.b.a();
        if (a2 != null) {
            for (Object obj : a2) {
                ((a) obj).a(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SpeechAnnotation
    public void f(String str, String str2) {
        Object[] a = this.b.a();
        if (a != null) {
            for (Object obj : a) {
                ((a) obj).c();
            }
        }
    }
}
