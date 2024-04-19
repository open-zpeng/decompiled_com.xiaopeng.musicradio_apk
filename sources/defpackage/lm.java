package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ArrayTypeAdapter.java */
/* renamed from: lm  reason: default package */
/* loaded from: classes3.dex */
public final class lm<E> extends nd<Object> {
    public static final nc a = new nc() { // from class: lm.1
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            Type b = moVar.b();
            if ((b instanceof GenericArrayType) || ((b instanceof Class) && ((Class) b).isArray())) {
                Type g = ly.g(b);
                return new lm(mqVar, mqVar.a((mo) mo.a(g)), ly.e(g));
            }
            return null;
        }
    };
    private final Class<E> b;
    private final nd<E> c;

    public lm(mq mqVar, nd<E> ndVar, Class<E> cls) {
        this.c = new lu(mqVar, ndVar, cls);
        this.b = cls;
    }

    @Override // defpackage.nd
    public Object a(mj mjVar) {
        if (mjVar.f() == ml.NULL) {
            mjVar.j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        mjVar.a();
        while (mjVar.e()) {
            arrayList.add(this.c.a(mjVar));
        }
        mjVar.b();
        Object newInstance = Array.newInstance((Class<?>) this.b, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd
    public void a(mk mkVar, Object obj) {
        if (obj == null) {
            mkVar.f();
            return;
        }
        mkVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.a(mkVar, Array.get(obj, i));
        }
        mkVar.c();
    }
}
