package me.yokeyword.fragmentation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* compiled from: SupportFragment.java */
/* loaded from: classes2.dex */
public class g extends Fragment implements c {
    final SupportFragmentDelegate a = new SupportFragmentDelegate(this);
    protected e b;

    @Override // me.yokeyword.fragmentation.c
    public SupportFragmentDelegate u() {
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a.a(activity);
        this.b = (e) this.a.l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return this.a.a(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.a.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.c();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.a.a(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.a.b(z);
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(Bundle bundle) {
        this.a.d(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void b(Bundle bundle) {
        this.a.e(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void v() {
        this.a.e();
    }

    @Override // me.yokeyword.fragmentation.c
    public void w() {
        this.a.f();
    }

    @Override // me.yokeyword.fragmentation.c
    public final boolean x() {
        return this.a.g();
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator y() {
        return this.a.h();
    }

    @Override // me.yokeyword.fragmentation.c
    public boolean z() {
        return this.a.j();
    }

    @Override // me.yokeyword.fragmentation.c
    public void a(int i, int i2, Bundle bundle) {
        this.a.a(i, i2, bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public void c(Bundle bundle) {
        this.a.f(bundle);
    }
}
