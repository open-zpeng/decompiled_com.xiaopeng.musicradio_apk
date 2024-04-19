package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: CollectionTypeAdapterFactory.java */
/* renamed from: ln  reason: default package */
/* loaded from: classes3.dex */
public final class ln implements nc {
    private final ma a;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: ln$a */
    /* loaded from: classes3.dex */
    private static final class a<E> extends nd<Collection<E>> {
        private final nd<E> a;
        private final md<? extends Collection<E>> b;

        public a(mq mqVar, Type type, nd<E> ndVar, md<? extends Collection<E>> mdVar) {
            this.a = new lu(mqVar, ndVar, type);
            this.b = mdVar;
        }

        @Override // defpackage.nd
        public /* bridge */ /* synthetic */ void a(mk mkVar, Object obj) {
            a(mkVar, (Collection) ((Collection) obj));
        }

        public void a(mk mkVar, Collection<E> collection) {
            if (collection == null) {
                mkVar.f();
                return;
            }
            mkVar.b();
            for (E e : collection) {
                this.a.a(mkVar, e);
            }
            mkVar.c();
        }

        @Override // defpackage.nd
        /* renamed from: b */
        public Collection<E> a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            Collection<E> a = this.b.a();
            mjVar.a();
            while (mjVar.e()) {
                a.add(this.a.a(mjVar));
            }
            mjVar.b();
            return a;
        }
    }

    public ln(ma maVar) {
        this.a = maVar;
    }

    @Override // defpackage.nc
    public <T> nd<T> a(mq mqVar, mo<T> moVar) {
        Type b = moVar.b();
        Class<? super T> a2 = moVar.a();
        if (Collection.class.isAssignableFrom(a2)) {
            Type a3 = ly.a(b, (Class<?>) a2);
            return new a(mqVar, a3, mqVar.a((mo) mo.a(a3)), this.a.a(moVar));
        }
        return null;
    }
}
