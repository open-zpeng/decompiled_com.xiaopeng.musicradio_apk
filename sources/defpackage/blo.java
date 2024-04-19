package defpackage;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
/* compiled from: ResourceBundleCatalog.java */
/* renamed from: blo  reason: default package */
/* loaded from: classes3.dex */
public class blo extends bll {
    private ResourceBundle a = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");

    @Override // defpackage.bll
    protected String b(int i) {
        try {
            return this.a.getString(Integer.toString(i));
        } catch (MissingResourceException unused) {
            return "MqttException";
        }
    }
}
