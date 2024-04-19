package defpackage;

import com.google.android.exoplayer2.PlaybackException;
import com.xiaopeng.speech.common.util.b;
import com.xiaopeng.speech.common.util.c;
import com.xiaopeng.speech.common.util.e;
import defpackage.bep;
/* compiled from: Recognizer.java */
/* renamed from: bfo  reason: default package */
/* loaded from: classes2.dex */
public class bfo {
    private final e b;
    private volatile bfl d;
    private volatile bfn e;
    private final String a = "Recognizer";
    private b<bfl> c = new b<>("IRecognizerProxy");
    private final bep.a f = new bep.a() { // from class: bfo.6
        @Override // defpackage.bep.a
        public void a(bew bewVar) {
            c.b("Recognizer", "on connect");
            try {
                bfl m = bewVar.m();
                bfo.this.c.c(m);
                bfo.this.d = m;
            } catch (Throwable unused) {
                c.c("Recognizer", "on connect error");
            }
        }

        @Override // defpackage.bep.a
        public void a() {
            bfo.this.c.c(null);
            bfo.this.d = null;
        }
    };

    public bfo(e eVar) {
        this.b = eVar;
        this.c.a(eVar);
    }

    public void a(final bfm bfmVar) {
        this.c.a((b<bfl>) new b.a<bfl, Object>() { // from class: bfo.1
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfl bflVar) {
                if (bfb.b().g().g()) {
                    bfb.b().e().c();
                }
                bfo.this.b(bfmVar);
                return null;
            }
        });
    }

    public void a() {
        this.c.a((b<bfl>) new b.a<bfl, Object>() { // from class: bfo.2
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfl bflVar) {
                bfo.this.d();
                return null;
            }
        });
    }

    public boolean b() {
        try {
            return e();
        } catch (Throwable th) {
            c.a("Recognizer", "error: ", th);
            return false;
        }
    }

    public void a(final String str, final String str2) {
        this.c.a((b<bfl>) new b.a<bfl, Object>() { // from class: bfo.3
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfl bflVar) {
                bfo.this.b(str, str2);
                return null;
            }
        });
    }

    public void a(final String str, final int i) {
        this.c.a((b<bfl>) new b.a<bfl, Object>() { // from class: bfo.4
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfl bflVar) {
                bfo.this.b(str, i);
                return null;
            }
        });
    }

    public void a(final String str, final boolean z) {
        this.c.a((b<bfl>) new b.a<bfl, Object>() { // from class: bfo.5
            @Override // com.xiaopeng.speech.common.util.b.a
            public Object a(bfl bflVar) {
                bfo.this.b(str, z);
                return null;
            }
        });
    }

    public bep.a c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bfm bfmVar) {
        c.b("Recognizer", "startListening with RecognizeListener");
        bfl bflVar = this.d;
        if (bflVar == null) {
            c.c("Recognizer", "service is disconnected");
            bfmVar.a(PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, "service is disconnected");
        } else if (b()) {
            c.c("Recognizer", "last asr still running");
            bfmVar.a(PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, "last asr still running");
        } else {
            this.e = new bfn(bfmVar);
            bflVar.a(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        c.b("Recognizer", "stop listening");
        bfl bflVar = this.d;
        if (bflVar == null || !b()) {
            return;
        }
        bflVar.a();
    }

    private boolean e() {
        bfl bflVar = this.d;
        return bflVar != null && bflVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        bfl bflVar = this.d;
        if (bflVar != null) {
            bflVar.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i) {
        bfl bflVar = this.d;
        if (bflVar != null) {
            bflVar.a(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z) {
        bfl bflVar = this.d;
        if (bflVar != null) {
            bflVar.a(str, z);
        }
    }
}
