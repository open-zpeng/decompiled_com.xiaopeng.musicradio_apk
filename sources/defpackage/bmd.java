package defpackage;
/* compiled from: MqttAck.java */
/* renamed from: bmd  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmd extends bmw {
    @Override // defpackage.bmw
    protected byte aD_() {
        return (byte) 0;
    }

    public bmd(byte b) {
        super(b);
    }

    @Override // defpackage.bmw
    public String toString() {
        return String.valueOf(super.toString()) + " msgId " + this.a;
    }
}
