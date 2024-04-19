package com.xiaopeng.musicradio.utils;

import android.app.Activity;
import android.util.Log;
import defpackage.afx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ActivityStack.java */
/* loaded from: classes2.dex */
public class a {
    private WeakReference<Activity> c;
    private List<WeakReference<Activity>> a = new ArrayList();
    private int b = 0;
    private int d = 0;
    private boolean e = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityStack.java */
    /* renamed from: com.xiaopeng.musicradio.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0176a {
        static final a a = new a();
    }

    public static a a() {
        return C0176a.a;
    }

    public void b() {
        for (WeakReference<Activity> weakReference : this.a) {
            if (a(weakReference)) {
                weakReference.get().finish();
            }
        }
        this.a.clear();
    }

    public Activity c() {
        WeakReference<Activity> weakReference = this.c;
        if (weakReference == null) {
            if (this.a.size() > 0) {
                List<WeakReference<Activity>> list = this.a;
                return list.get(list.size() - 1).get();
            }
            return null;
        }
        return weakReference.get();
    }

    public void a(Activity activity) {
        if (activity == null) {
            return;
        }
        Iterator<WeakReference<Activity>> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference<Activity> next = it.next();
            Activity activity2 = next.get();
            if (activity2 != null && activity2 == activity) {
                this.a.remove(next);
                break;
            }
        }
        this.a.add(new WeakReference<>(activity));
        Log.i("ActivityStack", "add: " + activity + " size = " + this.a.size());
    }

    public void b(Activity activity) {
        if (activity == null) {
            return;
        }
        Iterator<WeakReference<Activity>> it = this.a.iterator();
        while (it.hasNext()) {
            Activity activity2 = it.next().get();
            if (activity2 != null) {
                if (activity2 == activity) {
                }
            }
            Log.i("ActivityStack", "remove: success ======= ");
            it.remove();
        }
        Log.i("ActivityStack", "remove: ====== " + activity + " size = " + this.a.size() + " isBackground = " + this.e);
        if (this.e || this.a.size() != 0) {
            return;
        }
        h();
    }

    public void d() {
        this.b++;
    }

    public void e() {
        int i = this.b;
        if (i > 0) {
            this.b = i - 1;
        }
        if (this.b > 0 || this.e) {
            return;
        }
        h();
    }

    private void g() {
        Log.i("ActivityStack", "toForground: =======");
        this.e = false;
        u.f(new afx.a(false));
    }

    private void h() {
        Log.i("ActivityStack", "toBackground: =========");
        this.e = true;
        u.f(new afx.a(true));
    }

    public void c(Activity activity) {
        this.c = new WeakReference<>(activity);
        this.d++;
        Log.i("ActivityStack", "onResume: ==========" + this.d);
        if (this.e) {
            g();
        }
    }

    public void d(Activity activity) {
        this.d--;
        this.d = Math.max(0, this.d);
        Log.i("ActivityStack", "onPause: ==========" + this.d + " isTop = " + b.a(com.xiaopeng.musicradio.a.a));
        if (this.d <= 0 && !b.a(com.xiaopeng.musicradio.a.a)) {
            h();
        }
        if (a(this.c) && this.c.get() == activity) {
            this.c.clear();
            this.c = null;
        }
    }

    private boolean a(WeakReference<Activity> weakReference) {
        return (weakReference == null || weakReference.get() == null || weakReference.get().isFinishing()) ? false : true;
    }

    public boolean f() {
        return this.e;
    }
}
