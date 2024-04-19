package defpackage;

import defpackage.ls;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: lu  reason: default package */
/* loaded from: classes3.dex */
public final class lu<T> extends nd<T> {
    private final mq a;
    private final nd<T> b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lu(mq mqVar, nd<T> ndVar, Type type) {
        this.a = mqVar;
        this.b = ndVar;
        this.c = type;
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // defpackage.nd
    public T a(mj mjVar) {
        return this.b.a(mjVar);
    }

    @Override // defpackage.nd
    public void a(mk mkVar, T t) {
        nd<T> ndVar = this.b;
        Type a = a(this.c, t);
        if (a != this.c) {
            ndVar = this.a.a((mo) mo.a(a));
            if (ndVar instanceof ls.a) {
                nd<T> ndVar2 = this.b;
                if (!(ndVar2 instanceof ls.a)) {
                    ndVar = ndVar2;
                }
            }
        }
        ndVar.a(mkVar, t);
    }
}
