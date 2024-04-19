package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: MultiTypePool.java */
/* renamed from: biy  reason: default package */
/* loaded from: classes3.dex */
public class biy implements biz {
    private final List<Class<?>> a = new ArrayList();
    private final List<biv<?, ?>> b = new ArrayList();
    private final List<biw<?>> c = new ArrayList();

    @Override // defpackage.biz
    public <T> void a(Class<? extends T> cls, biv<T, ?> bivVar, biw<T> biwVar) {
        this.a.add(cls);
        this.b.add(bivVar);
        this.c.add(biwVar);
    }

    @Override // defpackage.biz
    public boolean a(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.a.remove(indexOf);
            this.b.remove(indexOf);
            this.c.remove(indexOf);
            z = true;
        }
    }

    @Override // defpackage.biz
    public int a() {
        return this.a.size();
    }

    @Override // defpackage.biz
    public int b(Class<?> cls) {
        int indexOf = this.a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.biz
    public biv<?, ?> a(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.biz
    public biw<?> b(int i) {
        return this.c.get(i);
    }
}
