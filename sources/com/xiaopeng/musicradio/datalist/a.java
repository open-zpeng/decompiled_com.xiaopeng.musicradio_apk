package com.xiaopeng.musicradio.datalist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DataDirtyModel.java */
/* loaded from: classes.dex */
public class a {
    protected boolean a = true;
    protected CopyOnWriteArrayList<InterfaceC0133a> b = new CopyOnWriteArrayList<>();
    protected boolean c;

    /* compiled from: DataDirtyModel.java */
    /* renamed from: com.xiaopeng.musicradio.datalist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133a {
        void a(Object... objArr);
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean z, Object... objArr) {
        a(z, true, objArr);
    }

    public void a(boolean z, boolean z2, Object... objArr) {
        this.a = z;
        if (z && z2) {
            a(objArr);
        }
    }

    private void a(Object... objArr) {
        if (c() || this.b.isEmpty()) {
            return;
        }
        Iterator<InterfaceC0133a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(objArr);
        }
    }

    public void a(InterfaceC0133a interfaceC0133a) {
        if (this.b.contains(interfaceC0133a)) {
            return;
        }
        this.b.add(interfaceC0133a);
    }

    public void b(InterfaceC0133a interfaceC0133a) {
        this.b.remove(interfaceC0133a);
    }

    public void b() {
        this.c = true;
    }

    public boolean c() {
        return this.c;
    }
}
