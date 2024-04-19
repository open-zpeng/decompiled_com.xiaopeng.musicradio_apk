package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: TypeToken.java */
/* renamed from: mo  reason: default package */
/* loaded from: classes3.dex */
public class mo<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    protected mo() {
        this.b = a(getClass());
        this.a = (Class<? super T>) ly.e(this.b);
        this.c = this.b.hashCode();
    }

    mo(Type type) {
        this.b = ly.d((Type) ll.a(type));
        this.a = (Class<? super T>) ly.e(this.b);
        this.c = this.b.hashCode();
    }

    static Type a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return ly.d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public static mo<?> a(Type type) {
        return new mo<>(type);
    }

    public static <T> mo<T> b(Class<T> cls) {
        return new mo<>(cls);
    }

    public final Class<? super T> a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mo) && ly.a(this.b, ((mo) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return ly.f(this.b);
    }
}
