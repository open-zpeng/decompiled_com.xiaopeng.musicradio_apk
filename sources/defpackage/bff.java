package defpackage;

import com.xiaopeng.speech.vui.VuiEngineImpl;
import com.xiaopeng.speech.vui.listener.IXpVuiSceneListener;
import com.xiaopeng.speech.vui.observer.XpVuiElementChangedObserver;
import com.xiaopeng.speech.vui.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: XpSpeechEngine.java */
/* renamed from: bff  reason: default package */
/* loaded from: classes2.dex */
public class bff {
    private static VuiEngineImpl a = null;
    private static String b = "XpSpeechEngine";

    public static void a(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.dispatchVuiEvent(str, str2);
        }
    }

    public static String b(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            return vuiEngineImpl.getElementState(str, str2);
        }
        return null;
    }

    public static void a(String str, IXpVuiSceneListener iXpVuiSceneListener) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.addVuiSceneListener(str, null, iXpVuiSceneListener, null, true);
        }
        String str2 = b;
        LogUtils.logDebug(str2, "registerVuiSceneListener:" + str + ",listener:" + iXpVuiSceneListener);
        iXpVuiSceneListener.onInitCompleted(new XpVuiElementChangedObserver());
    }

    public static void b(String str, IXpVuiSceneListener iXpVuiSceneListener) {
        String str2 = b;
        LogUtils.logDebug(str2, "unregisterVuiSceneListener:" + str + ",listener:" + iXpVuiSceneListener);
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.removeVuiSceneListener(str, iXpVuiSceneListener, false);
        }
    }

    public static void a(String str, List<bin> list) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.setBuildElements(str, list);
        }
    }

    public static void a(String str, bin binVar) {
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(binVar);
            a.setUpdateElements(str, arrayList);
        }
    }

    public static void b(String str, List<bin> list) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.setUpdateElements(str, list);
        }
    }

    public static bin c(String str, String str2) {
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            return vuiEngineImpl.getVuiElement(str, str2);
        }
        return null;
    }

    public static void a(String str) {
        String str2 = b;
        LogUtils.logDebug(str2, "enterScene:" + str);
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.enterScene(str, true);
        }
    }

    public static void b(String str) {
        String str2 = b;
        LogUtils.logDebug(str2, "exitScene:" + str);
        VuiEngineImpl vuiEngineImpl = a;
        if (vuiEngineImpl != null) {
            vuiEngineImpl.exitScene(str, true);
        }
    }

    public static void d(String str, String str2) {
        bgj.a().a(str, str2);
    }

    public static void a(String str, String str2, String str3) {
        bgj.a().a(str, str2, str3);
    }
}
