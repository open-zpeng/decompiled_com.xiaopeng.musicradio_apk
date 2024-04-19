package defpackage;
/* compiled from: MessageCatalog.java */
/* renamed from: bll  reason: default package */
/* loaded from: classes3.dex */
public abstract class bll {
    private static bll a;

    protected abstract String b(int i);

    public static final String a(int i) {
        if (a == null) {
            if (bli.a("java.util.ResourceBundle")) {
                try {
                    a = (bll) Class.forName("blo").newInstance();
                } catch (Exception unused) {
                    return "";
                }
            } else if (bli.a("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog")) {
                try {
                    a = (bll) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                } catch (Exception unused2) {
                    return "";
                }
            }
        }
        return a.b(i);
    }
}
