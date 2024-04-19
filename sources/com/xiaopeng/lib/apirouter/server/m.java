package com.xiaopeng.lib.apirouter.server;

import java.util.HashSet;
import java.util.Set;
/* compiled from: WebViewVuiObserver_Manifest.java */
/* loaded from: classes.dex */
public class m {
    public static String a() {
        return "{\"authority\":\"com.xiaopeng.musicradio.WebViewVuiObserver\",\"DESCRIPTOR\":\"com.xiaopeng.musicradio.WebViewVuiObserver\",\"TRANSACTION\":[{\"path\":\"getElementState\",\"METHOD\":\"getElementState\",\"ID\":0,\"parameter\":[{\"alias\":\"sceneId\",\"name\":\"sceneId\"},{\"alias\":\"elementId\",\"name\":\"elementId\"}]},{\"path\":\"onEvent\",\"METHOD\":\"onEvent\",\"ID\":1,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"}]}]}";
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("WebViewVuiObserver");
        return hashSet;
    }
}
