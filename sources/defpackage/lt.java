package defpackage;

import java.util.ArrayList;
/* compiled from: ObjectTypeAdapter.java */
/* renamed from: lt  reason: default package */
/* loaded from: classes3.dex */
public final class lt extends nd<Object> {
    public static final nc a = new nc() { // from class: lt.1
        @Override // defpackage.nc
        public <T> nd<T> a(mq mqVar, mo<T> moVar) {
            if (moVar.a() == Object.class) {
                return new lt(mqVar);
            }
            return null;
        }
    };
    private final mq b;

    private lt(mq mqVar) {
        this.b = mqVar;
    }

    @Override // defpackage.nd
    public Object a(mj mjVar) {
        switch (mjVar.f()) {
            case BEGIN_ARRAY:
                ArrayList arrayList = new ArrayList();
                mjVar.a();
                while (mjVar.e()) {
                    arrayList.add(a(mjVar));
                }
                mjVar.b();
                return arrayList;
            case BEGIN_OBJECT:
                me meVar = new me();
                mjVar.c();
                while (mjVar.e()) {
                    meVar.put(mjVar.g(), a(mjVar));
                }
                mjVar.d();
                return meVar;
            case STRING:
                return mjVar.h();
            case NUMBER:
                return Double.valueOf(mjVar.k());
            case BOOLEAN:
                return Boolean.valueOf(mjVar.i());
            case NULL:
                mjVar.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // defpackage.nd
    public void a(mk mkVar, Object obj) {
        if (obj == null) {
            mkVar.f();
            return;
        }
        nd a2 = this.b.a((Class) obj.getClass());
        if (!(a2 instanceof lt)) {
            a2.a(mkVar, obj);
            return;
        }
        mkVar.d();
        mkVar.e();
    }
}
