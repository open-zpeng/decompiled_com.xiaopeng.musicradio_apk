package me.yokeyword.fragmentation;

import android.os.Bundle;
import android.view.MotionEvent;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
/* compiled from: SupportActivity.java */
/* loaded from: classes2.dex */
public class e extends androidx.appcompat.app.d implements b {
    final f a = new f(this);

    @Override // me.yokeyword.fragmentation.b
    public f t() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.b, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.a.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        this.a.g();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.a(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.b, android.app.Activity
    public final void onBackPressed() {
        this.a.e();
    }

    @Override // me.yokeyword.fragmentation.b
    public void u() {
        this.a.f();
    }

    @Override // me.yokeyword.fragmentation.b
    public FragmentAnimator v() {
        return this.a.b();
    }

    @Override // me.yokeyword.fragmentation.b
    public FragmentAnimator w() {
        return this.a.c();
    }
}
