package com.xiaopeng.xui.vui;

import java.util.List;
/* loaded from: classes2.dex */
public interface IVuiViewScene {
    default int getVuiDisplayLocation() {
        return 0;
    }

    default void initVuiScene(String str, bid bidVar) {
    }

    default void initVuiScene(String str, bid bidVar, bie bieVar) {
    }

    default void setCustomViewIdList(List<Integer> list) {
    }

    default void setVuiElementListener(bic bicVar) {
    }

    default void setVuiEngine(bid bidVar) {
    }

    default void setVuiSceneId(String str) {
    }
}
