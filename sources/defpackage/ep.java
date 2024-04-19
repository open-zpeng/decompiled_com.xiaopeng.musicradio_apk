package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.i;
import defpackage.eo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ViewTransitionController.java */
/* renamed from: ep  reason: default package */
/* loaded from: classes3.dex */
public class ep {
    ArrayList<eo.a> a;
    private final ek c;
    private HashSet<View> e;
    private ArrayList<eo> d = new ArrayList<>();
    private String f = "ViewTransitionController";
    ArrayList<eo.a> b = new ArrayList<>();

    public ep(ek ekVar) {
        this.c = ekVar;
    }

    public void a(eo eoVar) {
        this.d.add(eoVar);
        this.e = null;
        if (eoVar.a() == 4) {
            a(eoVar, true);
        } else if (eoVar.a() == 5) {
            a(eoVar, false);
        }
    }

    private void a(eo eoVar, View... viewArr) {
        int currentState = this.c.getCurrentState();
        if (eoVar.a == 2) {
            eoVar.a(this, this.c, currentState, null, viewArr);
        } else if (currentState == -1) {
            String str = this.f;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.c.toString());
        } else {
            d c = this.c.c(currentState);
            if (c == null) {
                return;
            }
            eoVar.a(this, this.c, currentState, c, viewArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<eo> it = this.d.iterator();
        eo eoVar = null;
        while (it.hasNext()) {
            eo next = it.next();
            if (next.d() == i) {
                for (View view : viewArr) {
                    if (next.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    a(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                eoVar = next;
            }
        }
        if (eoVar == null) {
            Log.e(this.f, " Could not find ViewTransition");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent) {
        int currentState = this.c.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.e == null) {
            this.e = new HashSet<>();
            Iterator<eo> it = this.d.iterator();
            while (it.hasNext()) {
                eo next = it.next();
                int childCount = this.c.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.c.getChildAt(i);
                    if (next.a(childAt)) {
                        childAt.getId();
                        this.e.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList<eo.a> arrayList = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<eo.a> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().a(action, x, y);
            }
        }
        switch (action) {
            case 0:
            case 1:
                d c = this.c.c(currentState);
                Iterator<eo> it3 = this.d.iterator();
                while (it3.hasNext()) {
                    eo next2 = it3.next();
                    if (next2.a(action)) {
                        Iterator<View> it4 = this.e.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.a(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    next2.a(this, this.c, currentState, c, next3);
                                }
                            }
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(eo.a aVar) {
        if (this.a == null) {
            this.a = new ArrayList<>();
        }
        this.a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(eo.a aVar) {
        this.b.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        ArrayList<eo.a> arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        Iterator<eo.a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a.removeAll(this.b);
        this.b.clear();
        if (this.a.isEmpty()) {
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.c.invalidate();
    }

    private void a(final eo eoVar, final boolean z) {
        final int c = eoVar.c();
        final int b = eoVar.b();
        ConstraintLayout.getSharedValues().a(eoVar.c(), new i.a() { // from class: ep.1
        });
    }
}
