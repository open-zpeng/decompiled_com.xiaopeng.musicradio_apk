package defpackage;

import android.view.View;
/* compiled from: IVuiSceneListener.java */
/* renamed from: bie  reason: default package */
/* loaded from: classes2.dex */
public interface bie {
    default void onBuildScene() {
    }

    default boolean onInterceptVuiEvent(View view, bio bioVar) {
        return false;
    }

    default void onVuiEvent(View view, bio bioVar) {
    }

    default void onVuiEvent(bio bioVar) {
    }

    default void onVuiEventExecutioned() {
    }

    default void onVuiStateChanged() {
    }
}
