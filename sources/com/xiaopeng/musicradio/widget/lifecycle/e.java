package com.xiaopeng.musicradio.widget.lifecycle;

import android.util.Log;
import com.xiaopeng.musicradio.utils.u;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: BasePresenter.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class e<UIInterface> {
    protected Reference<UIInterface> a;

    public void B_() {
    }

    public void e() {
    }

    public void f_() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void y_() {
    }

    public void a(UIInterface uiinterface) {
        this.a = new WeakReference(uiinterface);
    }

    public UIInterface j() {
        Reference<UIInterface> reference = this.a;
        if (reference == null) {
            Log.e("BasePresenter", getClass().getSimpleName() + "getView: mViewRef is null");
            return null;
        }
        if (reference.get() == null) {
            Log.e("BasePresenter", getClass().getSimpleName() + "getView: uiInterface is null");
        }
        return this.a.get();
    }

    public void a() {
        Reference<UIInterface> reference = this.a;
        if (reference != null) {
            reference.clear();
            this.a = null;
        }
    }

    public void g() {
        u.b(this);
    }

    public void g_() {
        u.b(this);
    }
}
