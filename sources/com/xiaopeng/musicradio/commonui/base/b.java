package com.xiaopeng.musicradio.commonui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import defpackage.aem;
/* compiled from: BaseFragment.java */
/* loaded from: classes.dex */
public abstract class b<UIInterface, Presenter extends BasePresenter<UIInterface>> extends Fragment {
    protected Context a;
    protected Presenter b;
    protected Bundle c;
    private View d;
    private e e;

    protected abstract void E_();

    public boolean I_() {
        return true;
    }

    protected abstract Presenter ao_();

    protected boolean az_() {
        return false;
    }

    protected void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    protected abstract int e();

    protected abstract void f();

    protected abstract void g();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.a = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = bundle;
        if (this.b == null) {
            this.b = ao_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = super.getContext();
        return context == null ? this.a : context;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.d;
        if (view == null) {
            this.e = b();
            e eVar = this.e;
            this.a = eVar;
            this.d = a(layoutInflater.cloneInContext(eVar), viewGroup);
            this.d.setTag(aem.c.tag_lifecycle_owner, getLifecycle());
            f();
            g();
            E_();
            Presenter presenter = this.b;
            if (presenter != null) {
                presenter.a(this);
            }
            getLifecycle().a(this.b);
            c();
        } else {
            view.setTag(aem.c.tag_lifecycle_owner, getLifecycle());
            getLifecycle().a(this.b);
            d();
        }
        return this.d;
    }

    protected e b() {
        return new e(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!I_()) {
            this.d = null;
        }
        e eVar = this.e;
        if (eVar != null) {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (az_()) {
            return afc.a().a(Integer.valueOf(e()));
        }
        return layoutInflater.inflate(e(), (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewGroup viewGroup;
        super.onDestroyView();
        View view = this.d;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    public final <T extends View> T a(int i) {
        View view = this.d;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    public View k() {
        return this.d;
    }
}
