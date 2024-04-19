package defpackage;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: Ordering.java */
/* renamed from: zh  reason: default package */
/* loaded from: classes3.dex */
public abstract class zh<T> implements Comparator<T> {
    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    public static <T> zh<T> a(Comparator<T> comparator) {
        return comparator instanceof zh ? (zh) comparator : new ys(comparator);
    }

    public <F> zh<F> a(yh<F, ? extends T> yhVar) {
        return new yp(yhVar, this);
    }
}
