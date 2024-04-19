package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.xiaopeng.lib.utils.LogUtils;
import java.util.Locale;
/* compiled from: TextToSpeechUtils.java */
/* renamed from: acz  reason: default package */
/* loaded from: classes2.dex */
public class acz {
    private static volatile acz c;
    private volatile TextToSpeech a;
    private volatile Application b;

    private acz() {
    }

    public static acz a() {
        if (c == null) {
            synchronized (acz.class) {
                if (c == null) {
                    c = new acz();
                }
            }
        }
        return c;
    }

    public synchronized void a(Application application) {
        LogUtils.d("TextToSpeechUtils", "init: ");
        this.b = application;
        this.a = new TextToSpeech(application, new TextToSpeech.OnInitListener() { // from class: -$$Lambda$acz$njR69x9eLuYQ4dwUWxj8ZB-djdY
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i) {
                acz.this.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        LogUtils.d("TextToSpeechUtils", "init mTextToSpeech status = " + i);
        if (i != 0) {
            return;
        }
        ban.g(new Runnable() { // from class: -$$Lambda$acz$OpszLKtZQzNvO6DGJkGEdmYEmkY
            @Override // java.lang.Runnable
            public final void run() {
                acz.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.a == null) {
            return;
        }
        int language = this.a.setLanguage(Locale.CHINESE);
        LogUtils.d("TextToSpeechUtils", "init setLanguage CHINESE " + language);
        this.a.setOnUtteranceProgressListener(new UtteranceProgressListener() { // from class: acz.1
            @Override // android.speech.tts.UtteranceProgressListener
            public void onStart(String str) {
                LogUtils.d("TextToSpeechUtils", "onStart " + str);
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onDone(String str) {
                LogUtils.d("TextToSpeechUtils", "onDone " + str);
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onError(String str) {
                LogUtils.d("TextToSpeechUtils", "onError " + str);
            }
        });
    }

    public void a(String str) {
        a(str, 0);
    }

    public void a(String str, int i) {
        if (this.a == null) {
            LogUtils.e("TextToSpeechUtils", "speak: not init");
            return;
        }
        LogUtils.d("TextToSpeechUtils", "speak txt=" + str);
        this.a.speak(str, 0, new Bundle(), "com.xiaopeng.musicradio");
    }
}
