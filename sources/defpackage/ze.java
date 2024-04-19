package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: Multimaps.java */
/* renamed from: ze  reason: default package */
/* loaded from: classes3.dex */
public final class ze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(zd<?, ?> zdVar, @NullableDecl Object obj) {
        if (obj == zdVar) {
            return true;
        }
        if (obj instanceof zd) {
            return zdVar.a().equals(((zd) obj).a());
        }
        return false;
    }
}
