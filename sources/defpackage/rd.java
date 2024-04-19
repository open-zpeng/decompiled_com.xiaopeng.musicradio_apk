package defpackage;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.d;
import java.lang.ref.WeakReference;
/* compiled from: KeyframeParser.java */
/* renamed from: rd  reason: default package */
/* loaded from: classes3.dex */
class rd {
    private static final Interpolator a = new LinearInterpolator();
    private static bm<WeakReference<Interpolator>> b;

    rd() {
    }

    private static bm<WeakReference<Interpolator>> a() {
        if (b == null) {
            b = new bm<>();
        }
        return b;
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> a2;
        synchronized (rd.class) {
            a2 = a().a(i);
        }
        return a2;
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (rd.class) {
            b.b(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> sd<T> a(JsonReader jsonReader, d dVar, float f, rw<T> rwVar, boolean z) {
        if (z) {
            return a(dVar, jsonReader, f, rwVar);
        }
        return a(jsonReader, f, rwVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static <T> sd<T> a(d dVar, JsonReader jsonReader, float f, rw<T> rwVar) {
        Interpolator interpolator;
        T t;
        char c;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        float f2 = 0.0f;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = rwVar.b(jsonReader, f);
                    break;
                case 2:
                    t2 = rwVar.b(jsonReader, f);
                    break;
                case 3:
                    pointF = rc.b(jsonReader, f);
                    break;
                case 4:
                    pointF2 = rc.b(jsonReader, f);
                    break;
                case 5:
                    z = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointF3 = rc.b(jsonReader, f);
                    break;
                case 7:
                    pointF4 = rc.b(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = a;
            t = t3;
        } else if (pointF != null && pointF2 != null) {
            float f3 = -f;
            pointF.x = sb.b(pointF.x, f3, f);
            pointF.y = sb.b(pointF.y, -100.0f, 100.0f);
            pointF2.x = sb.b(pointF2.x, f3, f);
            pointF2.y = sb.b(pointF2.y, -100.0f, 100.0f);
            int a2 = sc.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            WeakReference<Interpolator> a3 = a(a2);
            Interpolator interpolator2 = a3 != null ? a3.get() : null;
            if (a3 == null || interpolator2 == null) {
                interpolator2 = ig.a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    a(a2, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
            t = t2;
        } else {
            interpolator = a;
            t = t2;
        }
        sd<T> sdVar = new sd<>(dVar, t3, t, interpolator, f2, null);
        sdVar.f = pointF3;
        sdVar.g = pointF4;
        return sdVar;
    }

    private static <T> sd<T> a(JsonReader jsonReader, float f, rw<T> rwVar) {
        return new sd<>(rwVar.b(jsonReader, f));
    }
}
