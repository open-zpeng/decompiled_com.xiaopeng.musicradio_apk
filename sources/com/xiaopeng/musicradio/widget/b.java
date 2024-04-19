package com.xiaopeng.musicradio.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
/* compiled from: BaseServiceWindow.java */
/* loaded from: classes2.dex */
public abstract class b<T extends BasePresenter> {
    protected Context a;
    protected View b;
    protected WindowManager.LayoutParams c;
    protected T d;
    private final WindowManager e;

    protected abstract View a(Context context);

    protected abstract void a(View view);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(WindowManager.LayoutParams layoutParams) {
    }

    public void c() {
    }

    protected abstract T d();

    protected int l() {
        return 2044;
    }

    public b(Context context) {
        this.a = context;
        this.e = (WindowManager) context.getSystemService("window");
    }

    public void e() {
        if (!j()) {
            a();
        } else if (g()) {
        } else {
            a(true);
        }
    }

    public void f() {
        if (j()) {
            b();
        }
    }

    public boolean g() {
        if (j()) {
            return this.b.isShown();
        }
        return false;
    }

    public void a(boolean z) {
        Log.i("BaseServiceWindow", "setVisible: ======== " + z + " view = " + this.b);
        View view = this.b;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private void a() {
        if (j()) {
            return;
        }
        if (this.b == null) {
            this.b = a(this.a);
            this.d = d();
            a(this.b);
            T t = this.d;
            if (t != null) {
                t.a(this);
            }
            Log.i("BaseServiceWindow", "attach: " + this.d);
            if (this.d != null) {
                Log.i("BaseServiceWindow", "attach: create ===== ");
                this.d.onCreate(null);
            }
        }
        if (this.c == null) {
            this.c = k();
        }
        Log.i("BaseServiceWindow", "attach: ========== ");
        this.e.addView(this.b, this.c);
    }

    private void b() {
        View view;
        if (!j() || (view = this.b) == null) {
            return;
        }
        this.e.removeView(view);
        this.b = null;
        T t = this.d;
        if (t != null) {
            t.onDestroy(null);
        }
    }

    public boolean j() {
        View view = this.b;
        return (view == null || view.getParent() == null) ? false : true;
    }

    public WindowManager.LayoutParams k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = l();
        layoutParams.format = 1;
        layoutParams.flags = 16777224;
        layoutParams.width = -2;
        layoutParams.height = -2;
        a(layoutParams);
        return layoutParams;
    }
}
