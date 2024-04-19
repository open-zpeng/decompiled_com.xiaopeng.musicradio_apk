package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import defpackage.ai;
import java.util.ArrayList;
/* compiled from: SupportActionModeWrapper.java */
/* renamed from: am  reason: default package */
/* loaded from: classes2.dex */
public class am extends ActionMode {
    final Context a;
    final ai b;

    public am(Context context, ai aiVar) {
        this.a = context;
        this.b = aiVar;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.d();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (fo) this.b.b());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.a(i);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.b(i);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.a(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.a();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.k();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.h();
    }

    /* compiled from: SupportActionModeWrapper.java */
    /* renamed from: am$a */
    /* loaded from: classes2.dex */
    public static class a implements ai.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<am> c = new ArrayList<>();
        final bl<Menu, Menu> d = new bl<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // defpackage.ai.a
        public boolean a(ai aiVar, Menu menu) {
            return this.a.onCreateActionMode(b(aiVar), a(menu));
        }

        @Override // defpackage.ai.a
        public boolean b(ai aiVar, Menu menu) {
            return this.a.onPrepareActionMode(b(aiVar), a(menu));
        }

        @Override // defpackage.ai.a
        public boolean a(ai aiVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(aiVar), new j(this.b, (fp) menuItem));
        }

        @Override // defpackage.ai.a
        public void a(ai aiVar) {
            this.a.onDestroyActionMode(b(aiVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                o oVar = new o(this.b, (fo) menu);
                this.d.put(menu, oVar);
                return oVar;
            }
            return menu2;
        }

        public ActionMode b(ai aiVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                am amVar = this.c.get(i);
                if (amVar != null && amVar.b == aiVar) {
                    return amVar;
                }
            }
            am amVar2 = new am(this.b, aiVar);
            this.c.add(amVar2);
            return amVar2;
        }
    }
}
