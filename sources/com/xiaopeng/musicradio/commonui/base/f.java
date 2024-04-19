package com.xiaopeng.musicradio.commonui.base;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import defpackage.aem;
/* compiled from: LifecycleHelper.java */
/* loaded from: classes.dex */
public class f {
    public static void a(View view) {
        if (view instanceof h) {
            h hVar = (h) view;
            while (view != null) {
                if (view.getTag(aem.c.tag_lifecycle_owner) != null) {
                    ((androidx.lifecycle.f) view.getTag(aem.c.tag_lifecycle_owner)).a(hVar);
                    return;
                } else if (view.getParent() == null || !(view.getParent() instanceof View)) {
                    break;
                } else {
                    view = (View) view.getParent();
                }
            }
            Log.e("LifecycleHelper", "registerLifecycleObserver: has no lifecycle=========: " + view);
        }
    }

    public static void b(View view) {
        if ((view instanceof h) && (view instanceof com.xiaopeng.musicradio.commonui.lifecycle.a)) {
            h hVar = (h) view;
            com.xiaopeng.musicradio.commonui.lifecycle.a aVar = (com.xiaopeng.musicradio.commonui.lifecycle.a) view;
            while (view != null) {
                if (view.getTag(aem.c.tag_lifecycle_owner) != null) {
                    androidx.lifecycle.f fVar = (androidx.lifecycle.f) view.getTag(aem.c.tag_lifecycle_owner);
                    fVar.b(hVar);
                    if (fVar.a() != f.b.DESTROYED) {
                        aVar.onDestroy(null);
                        return;
                    }
                    return;
                } else if (view.getParent() == null || !(view.getParent() instanceof View)) {
                    return;
                } else {
                    view = (View) view.getParent();
                }
            }
        }
    }
}
