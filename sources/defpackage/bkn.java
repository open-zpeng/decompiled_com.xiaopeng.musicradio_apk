package defpackage;
/* compiled from: MqttCallback.java */
/* renamed from: bkn  reason: default package */
/* loaded from: classes3.dex */
public interface bkn {
    void connectionLost(Throwable th);

    void deliveryComplete(bkj bkjVar);

    void messageArrived(String str, bkt bktVar);
}
