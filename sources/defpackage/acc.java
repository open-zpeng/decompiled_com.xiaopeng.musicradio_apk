package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: ApiRouterUnitySceneService_Manifest.java */
/* renamed from: acc  reason: default package */
/* loaded from: classes2.dex */
public class acc {
    public static String a() {
        return "{\"authority\":\"com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService\",\"DESCRIPTOR\":\"com.xiaopeng.speech.apirouter.ApiRouterUnitySceneService\",\"TRANSACTION\":[{\"path\":\"getElementState\",\"METHOD\":\"getElementState\",\"ID\":0,\"parameter\":[{\"alias\":\"sceneId\",\"name\":\"sceneId\"},{\"alias\":\"elementId\",\"name\":\"elementId\"}]},{\"path\":\"onEvent\",\"METHOD\":\"onEvent\",\"ID\":1,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"}]},{\"path\":\"onVuiQuery\",\"METHOD\":\"onVuiQuery\",\"ID\":2,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"}]}]}";
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("ApiRouterUnitySceneService");
        return hashSet;
    }
}
