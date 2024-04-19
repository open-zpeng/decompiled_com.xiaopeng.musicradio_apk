package com.xiaopeng.musicradio.widget.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaopeng.lib.themeswitch.ThemeWatcher;
import com.xiaopeng.lib.utils.LogUtils;
import com.xiaopeng.musicradio.utils.y;
/* compiled from: BaseFragment.java */
@Deprecated
/* loaded from: classes2.dex */
public abstract class b extends c implements ThemeWatcher.OnThemeSwitchListener {
    protected Activity a;
    protected View b;
    private l f = new l();
    private boolean g = false;
    protected Handler c = new Handler();

    public abstract int a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    @Override // com.xiaopeng.lib.themeswitch.ThemeWatcher.OnThemeSwitchListener
    public void onSwitchTheme(int i) {
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
        a(cloneInContext);
        this.b = cloneInContext.inflate(a(), viewGroup, false);
        c();
        if (getActivity() != null && f()) {
            getActivity().getWindow().getDecorView().post(new Runnable() { // from class: com.xiaopeng.musicradio.widget.lifecycle.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.d();
                }
            });
        } else {
            d();
        }
        e();
        this.f.onCreateView();
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        baj.a().a(this);
        if (baj.a().d()) {
            onSwitchTheme(2);
        }
    }

    private void a(final LayoutInflater layoutInflater) {
        gw.a(layoutInflater, new gx() { // from class: com.xiaopeng.musicradio.widget.lifecycle.b.2
            @Override // defpackage.gx
            public View a(View view, String str, Context context, AttributeSet attributeSet) {
                if (!bed.a(str) && (context instanceof androidx.appcompat.app.d)) {
                    View a = ((androidx.appcompat.app.d) context).getDelegate().a(view, str, context, attributeSet);
                    if (a == null && -1 != str.indexOf(46)) {
                        try {
                            a = layoutInflater.createView(str, null, attributeSet);
                        } catch (Exception e) {
                            LogUtils.e("BaseFragment", e.toString());
                        }
                        if (a != null && (a instanceof h)) {
                            b.this.f.registerSubView((h) a);
                        }
                    }
                    return a;
                }
                return null;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f.onStart();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f.onResume();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f.onStop();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        baj.a().b(this);
        this.f.onDestroyView();
        View view = this.b;
        if (view != null && (view instanceof ViewGroup)) {
            ((ViewGroup) view).removeAllViews();
        }
        this.b = null;
        y.a(this);
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.c.removeCallbacksAndMessages(null);
        this.f.onDestroy();
        this.b = null;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = activity;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.a = null;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, me.yokeyword.fragmentation.c
    public void v() {
        super.v();
        this.f.onSupportVisible();
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.c, me.yokeyword.fragmentation.c
    public void w() {
        super.w();
        this.f.onSupportInvisible();
    }

    @Override // androidx.fragment.app.Fragment
    public View getView() {
        return this.b;
    }
}
