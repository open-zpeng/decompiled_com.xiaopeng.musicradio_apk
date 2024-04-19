package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: ApiRouterOverallService_Manifest.java */
/* renamed from: aby  reason: default package */
/* loaded from: classes2.dex */
public class aby {
    public static String a() {
        return "{\"authority\":\"com.xiaopeng.speech.apirouter.ApiRouterOverallService\",\"DESCRIPTOR\":\"com.xiaopeng.speech.apirouter.ApiRouterOverallService\",\"TRANSACTION\":[{\"path\":\"onEvent\",\"METHOD\":\"onEvent\",\"ID\":0,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"}]},{\"path\":\"onQuery\",\"METHOD\":\"onQuery\",\"ID\":1,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"},{\"alias\":\"callback\",\"name\":\"callback\"}]}]}";
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("ApiRouterOverallService");
        return hashSet;
    }
}
