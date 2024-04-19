package defpackage;

import androidx.lifecycle.i;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: LoaderManager.java */
/* renamed from: ja  reason: default package */
/* loaded from: classes3.dex */
public abstract class ja {

    /* compiled from: LoaderManager.java */
    /* renamed from: ja$a */
    /* loaded from: classes3.dex */
    public interface a<D> {
        void a(jc<D> jcVar);

        void a(jc<D> jcVar, D d);
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public static <T extends i & w> ja a(T t) {
        return new jb(t, t.getViewModelStore());
    }
}
