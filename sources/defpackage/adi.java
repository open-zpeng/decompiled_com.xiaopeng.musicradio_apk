package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: AuthCodeBean.java */
/* renamed from: adi  reason: default package */
/* loaded from: classes2.dex */
public class adi {
    @SerializedName("code")
    public String a;
    @Expose(deserialize = false, serialize = false)
    private String b;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public String toString() {
        return "AuthCodeBean{code='" + this.a + "', xpCode='" + this.b + "'}";
    }
}
