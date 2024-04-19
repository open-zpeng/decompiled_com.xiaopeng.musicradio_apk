package defpackage;

import java.util.Enumeration;
/* compiled from: MqttClientPersistence.java */
/* renamed from: bkp  reason: default package */
/* loaded from: classes3.dex */
public interface bkp {
    void clear();

    void close();

    boolean containsKey(String str);

    bku get(String str);

    Enumeration keys();

    void open(String str, String str2);

    void put(String str, bku bkuVar);

    void remove(String str);
}
