package defpackage;

import android.view.ViewGroup;
import defpackage.jt;
/* compiled from: Scene.java */
/* renamed from: jv  reason: default package */
/* loaded from: classes3.dex */
public class jv {
    private ViewGroup a;
    private Runnable b;

    public void a() {
        Runnable runnable;
        if (a(this.a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, jv jvVar) {
        viewGroup.setTag(jt.a.transition_current_scene, jvVar);
    }

    public static jv a(ViewGroup viewGroup) {
        return (jv) viewGroup.getTag(jt.a.transition_current_scene);
    }
}
