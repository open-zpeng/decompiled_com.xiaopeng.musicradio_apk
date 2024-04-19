package com.xiaopeng.lib.apirouter.server;

import java.util.HashSet;
import java.util.Set;
/* compiled from: NapaObserver_Manifest.java */
/* loaded from: classes.dex */
public class k {
    public static String a() {
        return "{\"authority\":\"com.xiaopeng.musicradio.NapaObserver\",\"DESCRIPTOR\":\"com.xiaopeng.musicradio.NapaObserver\",\"TRANSACTION\":[{\"path\":\"sendMessage\",\"METHOD\":\"sendMessage\",\"ID\":0,\"parameter\":[{\"alias\":\"proxyName\",\"name\":\"proxyName\"},{\"alias\":\"method\",\"name\":\"method\"}]}]}";
    }

    public static Set<String> b() {
        HashSet hashSet = new HashSet(2);
        hashSet.add("NapaObserver");
        return hashSet;
    }
}
