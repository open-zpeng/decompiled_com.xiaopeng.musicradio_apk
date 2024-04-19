package defpackage;

import android.view.MotionEvent;
/* compiled from: MotionEventCompat.java */
/* renamed from: ha  reason: default package */
/* loaded from: classes3.dex */
public final class ha {
    @Deprecated
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
