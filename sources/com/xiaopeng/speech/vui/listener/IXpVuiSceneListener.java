package com.xiaopeng.speech.vui.listener;

import com.xiaopeng.speech.vui.observer.XpVuiElementChangedObserver;
/* loaded from: classes2.dex */
public interface IXpVuiSceneListener extends bie {
    default Object getElementState(String str) {
        return null;
    }

    @Override // defpackage.bie
    void onBuildScene();

    void onExcuteCommand(String str);

    void onInitCompleted(XpVuiElementChangedObserver xpVuiElementChangedObserver);

    @Override // defpackage.bie
    void onVuiEvent(bio bioVar);
}
