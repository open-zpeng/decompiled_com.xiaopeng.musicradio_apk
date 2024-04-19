package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import defpackage.er;
/* compiled from: ViewGroupCompat.java */
/* renamed from: hs  reason: default package */
/* loaded from: classes3.dex */
public final class hs {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(er.b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && hq.p(viewGroup) == null) ? false : true;
    }
}
