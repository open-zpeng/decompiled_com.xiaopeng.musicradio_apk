package com.xiaopeng.musicradio.widget.lifecycle;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: BaseDialogFrameLayout.java */
/* loaded from: classes2.dex */
public class a extends d implements f {
    private ArrayList<InterfaceC0182a> a;
    private ArrayList<Class> b;
    private WeakReference<Dialog> c;

    /* compiled from: BaseDialogFrameLayout.java */
    /* renamed from: com.xiaopeng.musicradio.widget.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0182a {
    }

    private void b() {
    }

    public a(Context context, Dialog dialog) {
        super(context);
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new WeakReference<>(dialog);
        b();
    }

    public View a() {
        if (this.a.size() > 1) {
            InterfaceC0182a remove = this.a.remove(0);
            this.b.remove(remove.getClass());
            View view = (View) remove;
            removeView(view);
            ((View) this.a.get(0)).setVisibility(0);
            return view;
        }
        WeakReference<Dialog> weakReference = this.c;
        if (weakReference != null && weakReference.get() != null) {
            this.c.get().dismiss();
        }
        return null;
    }
}
