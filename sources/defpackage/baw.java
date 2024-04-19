package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
/* compiled from: UsbLogo.java */
/* renamed from: baw  reason: default package */
/* loaded from: classes2.dex */
public class baw implements Serializable {
    private String hash;
    private String logo;

    public String a() {
        return this.hash;
    }

    public void a(String str) {
        this.hash = str;
    }

    public String b() {
        return TextUtils.isEmpty(this.logo) ? "" : this.logo;
    }

    public void b(String str) {
        this.logo = str;
    }

    public String toString() {
        return "UsbLogo{hash='" + this.hash + "', logo='" + this.logo + "'}";
    }
}
