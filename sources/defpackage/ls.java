package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: ls  reason: default package */
/* loaded from: classes3.dex */
public final class ls implements nc {
    private final ma a;
    private final mp b;
    private final lz c;

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: ls$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends nd<T> {
        private final md<T> a;
        private final Map<String, b> b;

        private a(md<T> mdVar, Map<String, b> map) {
            this.a = mdVar;
            this.b = map;
        }

        @Override // defpackage.nd
        public T a(mj mjVar) {
            if (mjVar.f() == ml.NULL) {
                mjVar.j();
                return null;
            }
            T a = this.a.a();
            try {
                mjVar.c();
                while (mjVar.e()) {
                    b bVar = this.b.get(mjVar.g());
                    if (bVar != null && bVar.i) {
                        bVar.a(mjVar, a);
                    }
                    mjVar.n();
                }
                mjVar.d();
                return a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new na(e2);
            }
        }

        @Override // defpackage.nd
        public void a(mk mkVar, T t) {
            if (t == null) {
                mkVar.f();
                return;
            }
            mkVar.d();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.h) {
                        mkVar.a(bVar.g);
                        bVar.a(mkVar, t);
                    }
                }
                mkVar.e();
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: ls$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        final String g;
        final boolean h;
        final boolean i;

        protected b(String str, boolean z, boolean z2) {
            this.g = str;
            this.h = z;
            this.i = z2;
        }

        abstract void a(mj mjVar, Object obj);

        abstract void a(mk mkVar, Object obj);
    }

    public ls(ma maVar, mp mpVar, lz lzVar) {
        this.a = maVar;
        this.b = mpVar;
        this.c = lzVar;
    }

    private String a(Field field) {
        lh lhVar = (lh) field.getAnnotation(lh.class);
        return lhVar == null ? this.b.a(field) : lhVar.a();
    }

    private Map<String, b> a(mq mqVar, mo<?> moVar, Class<?> cls) {
        Field[] declaredFields;
        b bVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b2 = moVar.b();
        mo<?> moVar2 = moVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            for (Field field : cls2.getDeclaredFields()) {
                boolean a2 = a(field, true);
                boolean a3 = a(field, false);
                if (a2 || a3) {
                    field.setAccessible(true);
                    b a4 = a(mqVar, field, a(field), mo.a(ly.a(moVar2.b(), cls2, field.getGenericType())), a2, a3);
                    if (((b) linkedHashMap.put(a4.g, a4)) != null) {
                        throw new IllegalArgumentException(b2 + " declares multiple JSON fields named " + bVar.g);
                    }
                }
            }
            moVar2 = mo.a(ly.a(moVar2.b(), cls2, cls2.getGenericSuperclass()));
            cls2 = moVar2.a();
        }
        return linkedHashMap;
    }

    private b a(final mq mqVar, final Field field, String str, final mo<?> moVar, boolean z, boolean z2) {
        final boolean a2 = mh.a((Type) moVar.a());
        return new b(str, z, z2) { // from class: ls.1
            final nd<?> a;

            {
                this.a = mqVar.a(moVar);
            }

            @Override // defpackage.ls.b
            void a(mj mjVar, Object obj) {
                Object a3 = this.a.a(mjVar);
                if (a3 == null && a2) {
                    return;
                }
                field.set(obj, a3);
            }

            @Override // defpackage.ls.b
            void a(mk mkVar, Object obj) {
                new lu(mqVar, this.a, moVar.b()).a(mkVar, (mk) field.get(obj));
            }
        };
    }

    @Override // defpackage.nc
    public <T> nd<T> a(mq mqVar, mo<T> moVar) {
        Class<? super T> a2 = moVar.a();
        if (Object.class.isAssignableFrom(a2)) {
            return new a(this.a.a(moVar), a(mqVar, moVar, a2));
        }
        return null;
    }

    public boolean a(Field field, boolean z) {
        return (this.c.a(field.getType(), z) || this.c.a(field, z)) ? false : true;
    }
}
