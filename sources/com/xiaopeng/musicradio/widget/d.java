package com.xiaopeng.musicradio.widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import com.xiaopeng.musicradio.commonui.lifecycle.BasePresenter;
import me.yokeyword.fragmentation.SupportFragmentDelegate;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* compiled from: BaseSubFragment.java */
/* loaded from: classes2.dex */
public abstract class d<UIInterface, Presenter extends BasePresenter<UIInterface>> extends com.xiaopeng.musicradio.commonui.vui.b<UIInterface, Presenter> implements me.yokeyword.fragmentation.c {
    final SupportFragmentDelegate l = new SupportFragmentDelegate(this);
    protected androidx.fragment.app.d m;

    @Override // me.yokeyword.fragmentation.c
    public SupportFragmentDelegate u() {
        return this.l;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.l.a(activity);
        this.m = this.l.l();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return this.l.a(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.l.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.l.b(bundle);
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.l.a();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.l.b();
    }

    @Override // com.xiaopeng.musicradio.commonui.vui.b, com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.l.c();
        super.onDestroyView();
    }

    @Override // com.xiaopeng.musicradio.commonui.base.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.l.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.l.a(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.l.b(z);
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(Bundle bundle) {
        this.l.d(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void b(Bundle bundle) {
        this.l.e(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void v() {
        this.l.e();
    }

    @Override // me.yokeyword.fragmentation.c
    public void w() {
        this.l.f();
    }

    @Override // me.yokeyword.fragmentation.c
    public final boolean x() {
        return this.l.g();
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator y() {
        return this.l.h();
    }

    @Override // me.yokeyword.fragmentation.c
    public boolean z() {
        return this.l.j();
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(int i, int i2, Bundle bundle) {
        this.l.a(i, i2, bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void c(Bundle bundle) {
        this.l.f(bundle);
    }
}
