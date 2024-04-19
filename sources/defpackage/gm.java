package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: ObjectsCompat.java */
/* renamed from: gm  reason: default package */
/* loaded from: classes3.dex */
public class gm {
    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
