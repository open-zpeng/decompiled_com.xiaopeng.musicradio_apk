package defpackage;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: Objects.java */
/* renamed from: yi  reason: default package */
/* loaded from: classes3.dex */
public final class yi extends yg {
    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
