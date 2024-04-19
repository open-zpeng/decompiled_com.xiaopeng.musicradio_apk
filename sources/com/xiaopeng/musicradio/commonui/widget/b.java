package com.xiaopeng.musicradio.commonui.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedList;
/* compiled from: ItemPreLoader.java */
/* loaded from: classes.dex */
public class b {
    private final Activity a;
    private final LayoutInflater b;
    private final int c;
    private final int d;
    private final LinkedList<View> e = new LinkedList<>();
    private final FrameLayout f;
    private volatile boolean g;

    public b(Activity activity, LayoutInflater layoutInflater, int i, int i2, FrameLayout frameLayout) {
        this.a = activity;
        this.b = layoutInflater;
        this.c = i;
        this.d = i2;
        this.f = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        if (this.a.isFinishing()) {
            return;
        }
        for (int i = 0; i < this.d && !this.a.isFinishing() && !this.g; i++) {
            View inflate = this.b.inflate(this.c, (ViewGroup) this.f, false);
            synchronized (this.e) {
                this.e.add(inflate);
            }
        }
        this.a.getResources();
    }

    public View b() {
        View removeFirst;
        synchronized (this.e) {
            removeFirst = !this.e.isEmpty() ? this.e.removeFirst() : null;
        }
        return removeFirst;
    }

    public void c() {
        this.g = true;
        synchronized (this.e) {
            this.e.clear();
        }
    }
}
