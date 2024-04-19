package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.ai;
import java.lang.ref.WeakReference;
/* compiled from: StandaloneActionMode.java */
/* renamed from: al  reason: default package */
/* loaded from: classes2.dex */
public class al extends ai implements g.a {
    private Context a;
    private ActionBarContextView b;
    private ai.a c;
    private WeakReference<View> d;
    private boolean e;
    private boolean f;
    private g g;

    public al(Context context, ActionBarContextView actionBarContextView, ai.a aVar, boolean z) {
        this.a = context;
        this.b = actionBarContextView;
        this.c = aVar;
        this.g = new g(actionBarContextView.getContext()).a(1);
        this.g.a(this);
        this.f = z;
    }

    @Override // defpackage.ai
    public void b(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    @Override // defpackage.ai
    public void a(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    @Override // defpackage.ai
    public void a(int i) {
        b(this.a.getString(i));
    }

    @Override // defpackage.ai
    public void b(int i) {
        a((CharSequence) this.a.getString(i));
    }

    @Override // defpackage.ai
    public void a(boolean z) {
        super.a(z);
        this.b.setTitleOptional(z);
    }

    @Override // defpackage.ai
    public boolean h() {
        return this.b.d();
    }

    @Override // defpackage.ai
    public void a(View view) {
        this.b.setCustomView(view);
        this.d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.ai
    public void d() {
        this.c.b(this, this.g);
    }

    @Override // defpackage.ai
    public void c() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.sendAccessibilityEvent(32);
        this.c.a(this);
    }

    @Override // defpackage.ai
    public Menu b() {
        return this.g;
    }

    @Override // defpackage.ai
    public CharSequence f() {
        return this.b.getTitle();
    }

    @Override // defpackage.ai
    public CharSequence g() {
        return this.b.getSubtitle();
    }

    @Override // defpackage.ai
    public View i() {
        WeakReference<View> weakReference = this.d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ai
    public MenuInflater a() {
        return new an(this.b.getContext());
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.c.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(g gVar) {
        d();
        this.b.a();
    }
}
