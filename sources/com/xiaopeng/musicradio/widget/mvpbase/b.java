package com.xiaopeng.musicradio.widget.mvpbase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.musicradio.common.f;
import com.xiaopeng.musicradio.widget.lifecycle.e;
import com.xiaopeng.musicradio.widget.lifecycle.l;
import java.lang.ref.WeakReference;
/* compiled from: MVPBaseDialog.java */
/* loaded from: classes2.dex */
public abstract class b<UIInterface, Presenter extends e> extends com.xiaopeng.musicradio.vui.a implements bal, ThemeWatcher.OnThemeSwitchListener {
    private DialogInterface.OnDismissListener a;
    private boolean b;
    protected Presenter d;
    protected l e;
    protected ViewGroup f;
    protected com.xiaopeng.musicradio.widget.lifecycle.a g;
    protected View h;
    protected View i;
    protected int j;
    BroadcastReceiver k;

    protected abstract int b();

    protected abstract void c();

    protected abstract void d();

    protected abstract void e();

    protected abstract Presenter f();

    protected View j() {
        return null;
    }

    public b(Context context, int i, boolean z) {
        super(new com.xiaopeng.musicradio.widget.mvpbase.a(context), i);
        this.e = new l();
        this.j = 0;
        this.b = z;
        a(context);
    }

    public b(Context context, int i) {
        super(new com.xiaopeng.musicradio.widget.mvpbase.a(context), i);
        this.e = new l();
        this.j = 0;
        a(context);
    }

    private void a(Context context) {
        Window window;
        if ((context instanceof Application) && (window = getWindow()) != null) {
            window.setType(2038);
        }
        if (this.b) {
            getWindow().requestFeature(15);
        }
        this.f = new FrameLayout(getContext());
        this.f.setTag(f.C0131f.tag_dialog, true);
        this.g = new com.xiaopeng.musicradio.widget.lifecycle.a(getContext(), this);
        this.e.registerSubView(this.g);
        this.f.addView(this.g);
        setContentView(this.f);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -1);
        }
        int b = b();
        if (b != 0) {
            this.h = LayoutInflater.from(getContext()).inflate(b, (ViewGroup) this.g, true);
        }
        this.i = j();
        View view = this.i;
        if (view != null) {
            this.f.addView(view);
        }
        this.d = f();
        if (this.d != null) {
            c();
            d();
            e();
            this.d.a(this);
            this.d.f_();
            this.e.onCreate();
            this.d.B_();
            this.e.onCreateView();
            this.d.l();
            this.e.onResume();
            this.d.y_();
            this.e.onSupportVisible();
        }
        super.setOnDismissListener(a.a(this));
        bdu.a().a(this);
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.a = onDismissListener;
    }

    public void a(DialogInterface dialogInterface) {
        bdu.a().b(this);
        Presenter presenter = this.d;
        if (presenter != null) {
            presenter.e();
            this.e.onSupportInvisible();
            this.d.a();
            this.d.g();
            this.e.onDestroyView();
            this.d.g_();
            this.e.onDestroy();
        }
        DialogInterface.OnDismissListener onDismissListener = this.a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        if (getContext() instanceof ContextThemeWrapper) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) getContext();
            if (contextThemeWrapper.getBaseContext() instanceof com.xiaopeng.musicradio.widget.mvpbase.a) {
                ((com.xiaopeng.musicradio.widget.mvpbase.a) contextThemeWrapper.getBaseContext()).b();
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        baj.a().a((bal) this);
        if (baj.a().c() != this.j) {
            applyTheme();
        }
        a();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        baj.a().b((bal) this);
        g();
    }

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
        applyTheme();
    }

    @Override // defpackage.bal
    public void applyTheme() {
        this.j = baj.a().c();
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter("action_exit_dialog");
        if (this.k == null) {
            this.k = a.b(this);
            jd.a(com.xiaopeng.musicradio.a.a()).a(this.k, intentFilter);
        }
    }

    private void g() {
        if (this.k != null) {
            jd.a(com.xiaopeng.musicradio.a.a()).a(this.k);
            this.k = null;
        }
    }

    @Override // com.xiaopeng.musicradio.vui.a
    public View i() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MVPBaseDialog.java */
    /* loaded from: classes2.dex */
    public static class a {
        static DialogInterface.OnDismissListener a(b bVar) {
            final WeakReference weakReference = new WeakReference(bVar);
            return d.a(new DialogInterface.OnDismissListener() { // from class: com.xiaopeng.musicradio.widget.mvpbase.b.a.1
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    if (weakReference.get() != null) {
                        ((b) weakReference.get()).a(dialogInterface);
                    }
                }
            });
        }

        static BroadcastReceiver b(b bVar) {
            final WeakReference weakReference = new WeakReference(bVar);
            return new BroadcastReceiver() { // from class: com.xiaopeng.musicradio.widget.mvpbase.b.a.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (!"action_exit_dialog".equals(intent.getAction()) || weakReference.get() == null) {
                        return;
                    }
                    ((b) weakReference.get()).dismiss();
                }
            };
        }
    }
}
