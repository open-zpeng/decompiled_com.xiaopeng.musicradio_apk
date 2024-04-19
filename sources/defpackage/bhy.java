package defpackage;

import android.util.Log;
import com.xiaopeng.speech.common.util.c;
/* compiled from: SpeechProtocol.java */
/* renamed from: bhy  reason: default package */
/* loaded from: classes2.dex */
public class bhy {
    private bfo a;

    /* compiled from: SpeechProtocol.java */
    /* renamed from: bhy$a */
    /* loaded from: classes2.dex */
    private static class a {
        static final bhy a = new bhy();
    }

    public static bhy a() {
        return a.a;
    }

    public void b() {
        Log.d("SpeechProtocol", "init");
        this.a = bfb.b().i();
        bfo bfoVar = this.a;
        if (bfoVar != null) {
            bfoVar.a("otp_keep_audio_record", true);
            this.a.a("otp_enable_punct", true);
            this.a.a("otp_audio_format", 1);
            this.a.a("otp_asr_buffer", false);
        }
    }

    public void a(bfm bfmVar) {
        Log.d("SpeechProtocol", "start");
        bfo bfoVar = this.a;
        if (bfoVar == null) {
            c.b("SpeechProtocol", "startRecord failure recognizer is null");
            return;
        }
        bfoVar.a("otp_audio_save_path", (String) null);
        this.a.a("otp_eos", 2000);
        this.a.a("otp_max_time", 60000);
        this.a.a("otp_disable_asr", false);
        this.a.a(bfmVar);
    }

    public void c() {
        Log.d("SpeechProtocol", "stop");
        bfo bfoVar = this.a;
        if (bfoVar != null) {
            bfoVar.a();
        }
    }
}
