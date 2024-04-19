package defpackage;
/* compiled from: MqttPersistableWireMessage.java */
/* renamed from: bmj  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmj extends bmw implements bku {
    @Override // defpackage.bku
    public int aC_() {
        return 0;
    }

    @Override // defpackage.bku
    public int c() {
        return 0;
    }

    @Override // defpackage.bku
    public int f() {
        return 0;
    }

    public bmj(byte b) {
        super(b);
    }

    @Override // defpackage.bku
    public byte[] a() {
        try {
            return k();
        } catch (bks e) {
            throw new bkv(e.getCause());
        }
    }

    @Override // defpackage.bku
    public int b() {
        return a().length;
    }

    @Override // defpackage.bku
    public byte[] d() {
        try {
            return aE_();
        } catch (bks e) {
            throw new bkv(e.getCause());
        }
    }
}
