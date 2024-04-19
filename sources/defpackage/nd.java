package defpackage;

import java.io.IOException;
/* compiled from: TypeAdapter.java */
/* renamed from: nd  reason: default package */
/* loaded from: classes3.dex */
public abstract class nd<T> {
    public abstract T a(mj mjVar);

    public final ne a(T t) {
        try {
            lq lqVar = new lq();
            a(lqVar, t);
            return lqVar.a();
        } catch (IOException e) {
            throw new mu(e);
        }
    }

    public abstract void a(mk mkVar, T t);
}
