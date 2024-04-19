package com.xiaopeng.musicradio.widget.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.xiaopeng.musicradio.utils.bk;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewLifecycleDelegate.java */
/* loaded from: classes2.dex */
public class l implements h, i, j {
    private boolean c;
    private List<h> b = new ArrayList();
    protected boolean a = false;

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public void register() {
        this.a = true;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public void unregister() {
        this.a = false;
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.j
    public boolean hasRegist() {
        return this.a;
    }

    public void a(ViewGroup viewGroup) {
        if (this.a || !(viewGroup instanceof h)) {
            return;
        }
        h hVar = (h) viewGroup;
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof i) {
                ((i) parent).registerSubView(hVar);
                a(hVar);
                return;
            }
        }
        a(hVar);
    }

    public void b(ViewGroup viewGroup) {
        if (this.a && (viewGroup instanceof h)) {
            h hVar = (h) viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof i) {
                    ((i) parent).unregisterSubView(hVar);
                    b(hVar);
                    return;
                }
            }
            b(hVar);
        }
    }

    private void a(h hVar) {
        hVar.onCreate();
        hVar.onCreateView();
        hVar.onStart();
        hVar.onResume();
        if (hVar instanceof View) {
            View view = (View) hVar;
            if (!bk.a(view)) {
                hVar.onSupportVisible();
            } else {
                hVar.onSupportInvisible();
            }
            Context context = view.getContext();
            if ((context instanceof Activity) && !com.xiaopeng.musicradio.utils.b.a(context) && !bk.b(view)) {
                hVar.onSupportInvisible();
                hVar.onPause();
                hVar.onStop();
            }
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            if (jVar.hasRegist()) {
                return;
            }
            jVar.register();
        }
    }

    private void b(h hVar) {
        hVar.onSupportInvisible();
        hVar.onPause();
        hVar.onStop();
        hVar.onDestroyView();
        hVar.onDestroy();
        if (hVar instanceof j) {
            ((j) hVar).unregister();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.i
    public void registerSubView(h hVar) {
        boolean z = hVar instanceof j;
        if (z && ((j) hVar).hasRegist()) {
            return;
        }
        for (h hVar2 : this.b) {
            if (hVar2 == hVar) {
                return;
            }
        }
        this.b.add(hVar);
        if (z) {
            ((j) hVar).register();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.i
    public void unregisterSubView(h hVar) {
        this.b.remove(hVar);
        if (hVar instanceof j) {
            ((j) hVar).unregister();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onNewIntent(Intent intent) {
        for (h hVar : this.b) {
            hVar.onNewIntent(intent);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreate() {
        for (h hVar : this.b) {
            hVar.onCreate();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onCreateView() {
        for (h hVar : this.b) {
            hVar.onCreateView();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStart() {
        for (h hVar : this.b) {
            hVar.onStart();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onResume() {
        for (h hVar : this.b) {
            if (hVar instanceof View) {
                if (!bk.a((View) hVar)) {
                    hVar.onResume();
                }
            } else {
                hVar.onResume();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onPause() {
        for (h hVar : this.b) {
            if (hVar instanceof View) {
                if (!bk.a((View) hVar)) {
                    hVar.onPause();
                }
            } else {
                hVar.onPause();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onStop() {
        for (h hVar : this.b) {
            hVar.onStop();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroyView() {
        for (h hVar : this.b) {
            hVar.onDestroyView();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onDestroy() {
        for (h hVar : this.b) {
            hVar.onDestroy();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onActivityResult(int i, int i2, Intent intent) {
        for (h hVar : this.b) {
            hVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportVisible() {
        this.c = true;
        for (h hVar : this.b) {
            if (hVar instanceof View) {
                View view = (View) hVar;
                boolean a = bk.a(view);
                Context context = view.getContext();
                boolean z = !(context instanceof Activity) || com.xiaopeng.musicradio.utils.b.a(context) || bk.b(view);
                if (!a && z) {
                    hVar.onSupportVisible();
                }
            } else {
                hVar.onSupportVisible();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onSupportInvisible() {
        this.c = false;
        for (h hVar : this.b) {
            if (hVar instanceof View) {
                if (bk.a((View) hVar)) {
                    hVar.onSupportInvisible();
                }
            } else {
                hVar.onSupportInvisible();
            }
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onParentAnimationStart() {
        for (h hVar : this.b) {
            hVar.onParentAnimationStart();
        }
    }

    @Override // com.xiaopeng.musicradio.widget.lifecycle.h
    public void onParentAnimationEnd() {
        for (h hVar : this.b) {
            hVar.onParentAnimationEnd();
        }
    }
}
