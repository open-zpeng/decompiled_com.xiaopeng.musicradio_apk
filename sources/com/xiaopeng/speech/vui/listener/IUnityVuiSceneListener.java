package com.xiaopeng.speech.vui.listener;
/* loaded from: classes2.dex */
public interface IUnityVuiSceneListener extends bie {
    void checkSubElementsIsInsight(String str);

    void getScrollViewState(String str, String str2);

    @Override // defpackage.bie
    void onBuildScene();

    void onVuiEvent(String str);
}
