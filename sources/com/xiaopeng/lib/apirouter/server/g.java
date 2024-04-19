package com.xiaopeng.lib.apirouter.server;

import java.util.HashSet;
import java.util.Set;
/* compiled from: MusicDuiObserver_Manifest.java */
/* loaded from: classes.dex */
public class g {
    public static String a() {
        return "{\"authority\":\"com.xiaopeng.musicradio.MusicDuiObserver\",\"DESCRIPTOR\":\"com.xiaopeng.musicradio.MusicDuiObserver\",\"TRANSACTION\":[{\"path\":\"onEvent\",\"METHOD\":\"onEvent\",\"ID\":0,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"}]},{\"path\":\"onQuery\",\"METHOD\":\"onQuery\",\"ID\":1,\"parameter\":[{\"alias\":\"event\",\"name\":\"event\"},{\"alias\":\"data\",\"name\":\"data\"},{\"alias\":\"callback\",\"name\":\"callback\"}]}]}";
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("MusicDuiObserver");
        return hashSet;
    }
}
