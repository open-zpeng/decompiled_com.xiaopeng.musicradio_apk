package com.xiaopeng.musicradio.commonui.widget;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedList;
/* compiled from: AdapterPreLoader.java */
/* loaded from: classes.dex */
public class a {
    private final Activity a;
    private final LayoutInflater b;
    private final FrameLayout c;
    private final SparseArray<b> d = new SparseArray<>();
    private final LinkedList<b> e = new LinkedList<>();

    public a(Activity activity) {
        this.a = activity;
        this.b = LayoutInflater.from(activity);
        this.c = new FrameLayout(this.a);
    }

    public void a(int i, int i2) {
        b bVar = new b(this.a, this.b, i, i2, this.c);
        this.d.put(i, bVar);
        this.e.add(bVar);
    }

    public void a(final String str) {
        if (this.e.isEmpty()) {
            return;
        }
        final LinkedList linkedList = new LinkedList(this.e);
        this.e.clear();
        ban.a(new Runnable() { // from class: com.xiaopeng.musicradio.commonui.widget.a.1
            @Override // java.lang.Runnable
            public void run() {
                while (!linkedList.isEmpty()) {
                    ((b) linkedList.removeFirst()).a();
                }
            }
        });
    }

    public View a(int i, String str) {
        b bVar = this.d.get(i);
        View b = bVar != null ? bVar.b() : null;
        return b == null ? this.b.inflate(i, (ViewGroup) this.c, false) : b;
    }

    public void a(int i) {
        b bVar = this.d.get(i);
        if (bVar != null) {
            bVar.c();
            this.d.remove(i);
        }
    }
}
