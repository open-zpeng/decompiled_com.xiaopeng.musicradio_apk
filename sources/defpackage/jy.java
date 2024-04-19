package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionManager.java */
/* renamed from: jy  reason: default package */
/* loaded from: classes3.dex */
public class jy {
    private static jw b = new jl();
    private static ThreadLocal<WeakReference<bf<ViewGroup, ArrayList<jw>>>> c = new ThreadLocal<>();
    static ArrayList<ViewGroup> a = new ArrayList<>();

    static bf<ViewGroup, ArrayList<jw>> a() {
        bf<ViewGroup, ArrayList<jw>> bfVar;
        WeakReference<bf<ViewGroup, ArrayList<jw>>> weakReference = c.get();
        if (weakReference == null || (bfVar = weakReference.get()) == null) {
            bf<ViewGroup, ArrayList<jw>> bfVar2 = new bf<>();
            c.set(new WeakReference<>(bfVar2));
            return bfVar2;
        }
        return bfVar;
    }

    private static void b(ViewGroup viewGroup, jw jwVar) {
        if (jwVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(jwVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* renamed from: jy$a */
    /* loaded from: classes3.dex */
    public static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
        jw a;
        ViewGroup b;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        a(jw jwVar, ViewGroup viewGroup) {
            this.a = jwVar;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            jy.a.remove(this.b);
            ArrayList<jw> arrayList = jy.a().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<jw> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.b);
                }
            }
            this.a.a(true);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (jy.a.remove(this.b)) {
                final bf<ViewGroup, ArrayList<jw>> a = jy.a();
                ArrayList<jw> arrayList = a.get(this.b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    a.put(this.b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.a);
                this.a.a(new jx() { // from class: jy.a.1
                    @Override // defpackage.jx, defpackage.jw.c
                    public void b(jw jwVar) {
                        ((ArrayList) a.get(a.this.b)).remove(jwVar);
                        jwVar.b(this);
                    }
                });
                this.a.a(this.b, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((jw) it.next()).e(this.b);
                    }
                }
                this.a.a(this.b);
                return true;
            }
            return true;
        }
    }

    private static void c(ViewGroup viewGroup, jw jwVar) {
        ArrayList<jw> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<jw> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d(viewGroup);
            }
        }
        if (jwVar != null) {
            jwVar.a(viewGroup, true);
        }
        jv a2 = jv.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }

    public static void a(ViewGroup viewGroup, jw jwVar) {
        if (a.contains(viewGroup) || !hq.B(viewGroup)) {
            return;
        }
        a.add(viewGroup);
        if (jwVar == null) {
            jwVar = b;
        }
        jw clone = jwVar.clone();
        c(viewGroup, clone);
        jv.a(viewGroup, null);
        b(viewGroup, clone);
    }
}
