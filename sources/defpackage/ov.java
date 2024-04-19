package defpackage;

import com.airbnb.lottie.d;
/* compiled from: LottieCompositionCache.java */
/* renamed from: ov  reason: default package */
/* loaded from: classes3.dex */
public class ov {
    private static final ov a = new ov();
    private final bj<String, d> b = new bj<>(10485760);

    public static ov a() {
        return a;
    }

    ov() {
    }

    public d a(String str) {
        if (str == null) {
            return null;
        }
        return this.b.a((bj<String, d>) str);
    }

    public void a(String str, d dVar) {
        if (str == null) {
            return;
        }
        this.b.a(str, dVar);
    }
}
