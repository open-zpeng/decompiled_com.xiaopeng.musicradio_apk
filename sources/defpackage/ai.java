package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* compiled from: ActionMode.java */
/* renamed from: ai  reason: default package */
/* loaded from: classes2.dex */
public abstract class ai {
    private Object a;
    private boolean b;

    /* compiled from: ActionMode.java */
    /* renamed from: ai$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ai aiVar);

        boolean a(ai aiVar, Menu menu);

        boolean a(ai aiVar, MenuItem menuItem);

        boolean b(ai aiVar, Menu menu);
    }

    public abstract MenuInflater a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public abstract Menu b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();

    public void a(Object obj) {
        this.a = obj;
    }

    public Object j() {
        return this.a;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean k() {
        return this.b;
    }
}
