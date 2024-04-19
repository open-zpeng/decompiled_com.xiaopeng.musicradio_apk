package defpackage;

import android.util.JsonReader;
import com.airbnb.lottie.d;
import java.util.List;
/* compiled from: AnimatableValueParser.java */
/* renamed from: qq  reason: default package */
/* loaded from: classes3.dex */
public class qq {
    public static oy a(JsonReader jsonReader, d dVar) {
        return a(jsonReader, dVar, true);
    }

    public static oy a(JsonReader jsonReader, d dVar, boolean z) {
        return new oy(a(jsonReader, z ? sc.a() : 1.0f, dVar, qv.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pa b(JsonReader jsonReader, d dVar) {
        return new pa(a(jsonReader, dVar, rb.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pc c(JsonReader jsonReader, d dVar) {
        return new pc(a(jsonReader, sc.a(), dVar, rl.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pd d(JsonReader jsonReader, d dVar) {
        return new pd(a(jsonReader, dVar, rp.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pe e(JsonReader jsonReader, d dVar) {
        return new pe(a(jsonReader, sc.a(), dVar, rq.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pg f(JsonReader jsonReader, d dVar) {
        return new pg(a(jsonReader, dVar, qu.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ox g(JsonReader jsonReader, d dVar) {
        return new ox(a(jsonReader, dVar, qs.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static oz a(JsonReader jsonReader, d dVar, int i) {
        return new oz(a(jsonReader, dVar, new qy(i)));
    }

    private static <T> List<sd<T>> a(JsonReader jsonReader, d dVar, rw<T> rwVar) {
        return re.a(jsonReader, dVar, 1.0f, rwVar);
    }

    private static <T> List<sd<T>> a(JsonReader jsonReader, float f, d dVar, rw<T> rwVar) {
        return re.a(jsonReader, dVar, f, rwVar);
    }
}
