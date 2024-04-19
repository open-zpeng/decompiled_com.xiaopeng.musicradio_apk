package com.xiaopeng.speech.vui.observer;

import android.text.TextUtils;
import android.view.View;
import com.xiaopeng.speech.vui.VuiEngineImpl;
import com.xiaopeng.speech.vui.cache.VuiSceneCache;
import com.xiaopeng.speech.vui.cache.VuiSceneCacheFactory;
import com.xiaopeng.speech.vui.listener.IXpVuiElementChanged;
import com.xiaopeng.speech.vui.utils.LogUtils;
import com.xiaopeng.speech.vui.utils.VuiUtils;
import java.util.List;
/* loaded from: classes2.dex */
public class XpVuiElementChangedObserver implements IXpVuiElementChanged {
    private bie mListener;

    public XpVuiElementChangedObserver(bie bieVar) {
        this.mListener = null;
        this.mListener = bieVar;
    }

    public XpVuiElementChangedObserver() {
        this.mListener = null;
    }

    @Override // com.xiaopeng.speech.vui.listener.IXpVuiElementChanged
    public void onVuiElementChanged(String str, View view) {
        onVuiElementChanged(str, view, null, null, -1);
    }

    @Override // com.xiaopeng.speech.vui.listener.IXpVuiElementChanged
    public void onVuiElementChanged(String str, View view, String[] strArr, int i) {
        onVuiElementChanged(str, view, null, strArr, i);
    }

    @Override // com.xiaopeng.speech.vui.listener.IXpVuiElementChanged
    public void onVuiElementChanged(String str, View view, List<bin> list) {
        onVuiElementChanged(str, view, list, null, -1);
    }

    private void onVuiElementChanged(String str, View view, List<bin> list, String[] strArr, int i) {
        LogUtils.logDebug("XpVuiElementChangedObserver", "onVuiElementChanged:" + str + ",elementList:" + list);
        if (this.mListener != null && !TextUtils.isEmpty(str)) {
            str = this.mListener.toString() + "-" + str;
        }
        if (view != null) {
            bin c = bff.c(str, "" + view.getId());
            if (c != null) {
                if (bih.RADIOBUTTON.a().equals(c.getType()) || bih.CHECKBOX.a().equals(c.getType())) {
                    VuiUtils.setValueAttribute(view, c);
                } else if (bih.RECYCLEVIEW.a().equals(c.getType())) {
                    VuiUtils.addScrollProps(c, view);
                    c.setElements(list);
                } else if (bih.STATEFULBUTTON.a().equals(c.getType())) {
                    VuiUtils.setStatefulButtonValues(i, strArr, c);
                }
                c.setVisible(view.getVisibility() == 0 ? null : false);
                bff.a(str, c);
                return;
            }
            bff.a(str, list);
            return;
        }
        VuiSceneCache sceneCache = VuiSceneCacheFactory.instance().getSceneCache(VuiSceneCacheFactory.CacheType.BUILD.getType());
        if (sceneCache != null) {
            List<bin> cache = sceneCache.getCache(VuiEngineImpl.mSceneIdPrefix + "-" + str);
            if (cache != null && !cache.isEmpty()) {
                bff.b(str, list);
                return;
            }
            LogUtils.logInfo("XpVuiElementChangedObserver", "cacheList is empty");
            bff.a(str, list);
        }
    }
}
