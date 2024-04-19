package com.xiaopeng.musicradio.widget.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.SupportFragmentDelegate;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* compiled from: BaseFragmentation.java */
/* loaded from: classes2.dex */
public class c extends Fragment implements me.yokeyword.fragmentation.c {
    final SupportFragmentDelegate d = new k(this);
    protected androidx.fragment.app.d e;

    @Override // me.yokeyword.fragmentation.c
    public SupportFragmentDelegate u() {
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d.a(activity);
        this.e = this.d.l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return this.d.a(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.d.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.d.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.d.c();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.d.d();
        super.onDestroy();
        aat.a().a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.d.a(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.d.b(z);
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(Bundle bundle) {
        this.d.d(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void b(Bundle bundle) {
        this.d.e(bundle);
    }

    public void v() {
        this.d.e();
    }

    public void w() {
        this.d.f();
    }

    @Override // me.yokeyword.fragmentation.c
    public final boolean x() {
        return this.d.g();
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator y() {
        return this.d.h();
    }

    @Override // me.yokeyword.fragmentation.c
    public boolean z() {
        return this.d.j();
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(int i, int i2, Bundle bundle) {
        this.d.a(i, i2, bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void c(Bundle bundle) {
        this.d.f(bundle);
    }
}
