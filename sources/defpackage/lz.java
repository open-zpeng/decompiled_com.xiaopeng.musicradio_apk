package defpackage;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* compiled from: Excluder.java */
/* renamed from: lz  reason: default package */
/* loaded from: classes3.dex */
public final class lz implements Cloneable, nc {
    public static final lz a = new lz();
    private boolean e;
    private double b = -1.0d;
    private int c = 136;
    private boolean d = true;
    private List<lk> f = Collections.emptyList();
    private List<lk> g = Collections.emptyList();

    private boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean a(li liVar) {
        return liVar == null || liVar.a() > this.b;
    }

    private boolean a(lj ljVar) {
        return ljVar == null || ljVar.a() <= this.b;
    }

    private boolean a(lj ljVar, li liVar) {
        return a(ljVar) && a(liVar);
    }

    private boolean b(Class<?> cls) {
        return cls.isMemberClass() && !c(cls);
    }

    private boolean c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public lz clone() {
        try {
            return (lz) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.nc
    public <T> nd<T> a(final mq mqVar, final mo<T> moVar) {
        Class<? super T> a2 = moVar.a();
        final boolean a3 = a((Class<?>) a2, true);
        final boolean a4 = a((Class<?>) a2, false);
        if (a3 || a4) {
            return new nd<T>() { // from class: lz.1
                private nd<T> f;

                private nd<T> a() {
                    nd<T> ndVar = this.f;
                    if (ndVar != null) {
                        return ndVar;
                    }
                    nd<T> a5 = mqVar.a(lz.this, moVar);
                    this.f = a5;
                    return a5;
                }

                @Override // defpackage.nd
                public T a(mj mjVar) {
                    if (a4) {
                        mjVar.n();
                        return null;
                    }
                    return a().a(mjVar);
                }

                @Override // defpackage.nd
                public void a(mk mkVar, T t) {
                    if (a3) {
                        mkVar.f();
                    } else {
                        a().a(mkVar, t);
                    }
                }
            };
        }
        return null;
    }

    public boolean a(Class<?> cls, boolean z) {
        if (this.b == -1.0d || a((lj) cls.getAnnotation(lj.class), (li) cls.getAnnotation(li.class))) {
            if ((this.d || !b(cls)) && !a(cls)) {
                for (lk lkVar : z ? this.f : this.g) {
                    if (lkVar.a(cls)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean a(Field field, boolean z) {
        lg lgVar;
        if ((this.c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.b == -1.0d || a((lj) field.getAnnotation(lj.class), (li) field.getAnnotation(li.class))) && !field.isSynthetic()) {
            if (!this.e || ((lgVar = (lg) field.getAnnotation(lg.class)) != null && (!z ? !lgVar.b() : !lgVar.a()))) {
                if ((this.d || !b(field.getType())) && !a(field.getType())) {
                    List<lk> list = z ? this.f : this.g;
                    if (list.isEmpty()) {
                        return false;
                    }
                    mn mnVar = new mn(field);
                    for (lk lkVar : list) {
                        if (lkVar.a(mnVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
