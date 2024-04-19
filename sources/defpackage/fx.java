package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import defpackage.gb;
import defpackage.gc;
/* compiled from: CallbackWithHandler.java */
/* renamed from: fx  reason: default package */
/* loaded from: classes3.dex */
class fx {
    private final gc.c a;
    private final Handler b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(gc.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(final Typeface typeface) {
        final gc.c cVar = this.a;
        this.b.post(new Runnable() { // from class: fx.1
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(typeface);
            }
        });
    }

    private void a(final int i) {
        final gc.c cVar = this.a;
        this.b.post(new Runnable() { // from class: fx.2
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(gb.a aVar) {
        if (aVar.a()) {
            a(aVar.a);
        } else {
            a(aVar.b);
        }
    }
}
