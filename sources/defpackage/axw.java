package defpackage;

import android.util.Log;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
/* compiled from: RxMusicPlugins.java */
/* renamed from: axw  reason: default package */
/* loaded from: classes2.dex */
public class axw {
    private static final Consumer<Throwable> a = new Consumer<Throwable>() { // from class: axw.1
        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(Throwable th) {
            Log.w("RxMusicPlugins", "Uncaught exception occurred in RxJava: ", th);
        }
    };

    public static void a() {
        RxJavaPlugins.setErrorHandler(a);
    }
}
